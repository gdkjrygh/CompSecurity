// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.AsyncTask;
import com.aetn.history.android.historyhere.HistoryHereApplication;
import com.aetn.history.android.historyhere.utils.ConnectionManager;
import com.aetn.history.android.historyhere.utils.Signing;
import com.aetn.history.android.historyhere.utils.Utils;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;

// Referenced classes of package com.aetn.history.android.historyhere.model:
//            Configuration, PreferenceManager, POIDetail, PoiDbManager, 
//            HttpRequestManager, PoiResponse, PoiDetailResponse, POI

public class PoiManager
{
    public static interface AllToursDataLoadedListener
    {

        public abstract void onDataLoadFailed();

        public abstract void onDataLoaded(ArrayList arraylist);
    }

    public static interface InitialDataLoadedListener
    {

        public abstract void onDataLoaded();
    }

    public static interface LimitedDataLoadedListener
    {

        public abstract void onDataLoaded(ArrayList arraylist);
    }

    public static interface LimitedDataUpdatedListener
    {

        public abstract void onDataUpdated();
    }

    class LoadAllPoisFromAssetsTask extends AsyncTask
    {

        final PoiManager this$0;

        protected transient Boolean doInBackground(String as[])
        {
            Object obj;
            Utils.logger(TAG, "LoadAllPoisFromAssetsTask(): running");
            obj = PoiManager.mContext.getAssets();
            as = "";
            obj = PoiManager.getStringFromInputStream(((AssetManager) (obj)).open("fulldata_2015_01_22.json"));
            as = ((String []) (obj));
_L1:
            IOException ioexception;
            if (as.isEmpty())
            {
                return Boolean.valueOf(false);
            } else
            {
                as = new ArrayList(Arrays.asList((POIDetail[])(new Gson()).fromJson(as, [Lcom/aetn/history/android/historyhere/model/POIDetail;)));
                PoiDbManager.getInstance(PoiManager.mContext).addPois(as, false);
                return Boolean.valueOf(true);
            }
            ioexception;
            ioexception.printStackTrace();
              goto _L1
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected void onPostExecute(Boolean boolean1)
        {
            if (boolean1.booleanValue())
            {
                notifyInitialDataListener();
                return;
            } else
            {
                Utils.logger(TAG, "getFullPoiList(): FAILED");
                return;
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Boolean)obj);
        }

        protected transient void onProgressUpdate(Integer ainteger[])
        {
            super.onProgressUpdate(ainteger);
        }

        protected volatile void onProgressUpdate(Object aobj[])
        {
            onProgressUpdate((Integer[])aobj);
        }

        LoadAllPoisFromAssetsTask()
        {
            this$0 = PoiManager.this;
            super();
        }
    }

    class LoadAllPoisFromDataDumpTask extends AsyncTask
    {

        final PoiManager this$0;

        protected transient Boolean doInBackground(String as[])
        {
            Utils.logger(TAG, "LoadAllPoisFromDataDumpTask(): running");
            Utils.logger(TAG, (new StringBuilder()).append("LoadAllPoisFromDataDumpTask: the response was this long: ").append(as[0].length()).toString());
            as = new ArrayList(Arrays.asList((POIDetail[])(new Gson()).fromJson(as[0], [Lcom/aetn/history/android/historyhere/model/POIDetail;)));
            PoiDbManager.getInstance(PoiManager.mContext).addPois(as, true);
            return Boolean.valueOf(true);
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected void onPostExecute(Boolean boolean1)
        {
            notifyInitialDataListener();
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Boolean)obj);
        }

        protected transient void onProgressUpdate(Integer ainteger[])
        {
            super.onProgressUpdate(ainteger);
        }

        protected volatile void onProgressUpdate(Object aobj[])
        {
            onProgressUpdate((Integer[])aobj);
        }

        LoadAllPoisFromDataDumpTask()
        {
            this$0 = PoiManager.this;
            super();
        }
    }

    class LoadLimitedDataFromDataDumpTask extends AsyncTask
    {

        final PoiManager this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected transient ArrayList doInBackground(String as[])
        {
            Utils.logger(TAG, "LoadLimitedDataFromDataDumpTask(): running");
            return new ArrayList(Arrays.asList((POIDetail[])(new Gson()).fromJson(as[0], [Lcom/aetn/history/android/historyhere/model/POIDetail;)));
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((ArrayList)obj);
        }

        protected void onPostExecute(ArrayList arraylist)
        {
            notifyLimitedDataLoadedListener(arraylist);
        }

        protected transient void onProgressUpdate(Integer ainteger[])
        {
            super.onProgressUpdate(ainteger);
        }

        protected volatile void onProgressUpdate(Object aobj[])
        {
            onProgressUpdate((Integer[])aobj);
        }

        LoadLimitedDataFromDataDumpTask()
        {
            this$0 = PoiManager.this;
            super();
        }
    }

    public static interface OnUnclusteredMapMarkersListener
    {

        public abstract void onUnclusteredPoisChanged();

        public abstract void onUnclusteredPoisLoaded(ArrayList arraylist);
    }

    public static interface PoiDataChangedListener
    {

        public abstract void onPoiDataChanged(ArrayList arraylist);
    }

    public static interface PoiDetailLoadedListener
    {

        public abstract void onPoiDetailLoadFailed();

        public abstract void onPoiDetailLoaded(POIDetail poidetail);
    }

    public static interface TourDetailLoadedListener
    {

        public abstract void onTourDetailLoadFailed();

        public abstract void onTourDetailLoaded(POIDetail poidetail);
    }

    class UpdateLimitedDataFromDataDumpTask extends AsyncTask
    {

        final PoiManager this$0;

        protected transient Boolean doInBackground(ArrayList aarraylist[])
        {
            Utils.logger(TAG, "UpdateLimitedDataFromDataDumpTask(): running");
            aarraylist = aarraylist[0];
            ArrayList arraylist = new ArrayList();
            new ArrayList();
            Object obj = PoiDbManager.getInstance(PoiManager.mContext).getRowsForUpdate(aarraylist);
            Utils.logger(TAG, (new StringBuilder()).append("UpdateLimitedDataFromDataDumpTask(): this is how many need to be updated:").append(((ArrayList) (obj)).size()).toString());
            obj = ((ArrayList) (obj)).iterator();
label0:
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                POIDetail poidetail = (POIDetail)((Iterator) (obj)).next();
                Iterator iterator = aarraylist.iterator();
                POIDetail poidetail1;
                do
                {
                    if (!iterator.hasNext())
                    {
                        continue label0;
                    }
                    poidetail1 = (POIDetail)iterator.next();
                } while (!poidetail.getId().equalsIgnoreCase(poidetail1.getId()));
                Utils.logger(TAG, (new StringBuilder()).append("UpdateLimitedDataFromDataDumpTask(): FOUND ONE: ").append(poidetail.getTitle()).toString());
                arraylist.add(poidetail);
                aarraylist.remove(poidetail1);
            } while (true);
            Utils.logger(TAG, (new StringBuilder()).append("UpdateLimitedDataFromDataDumpTask(): updateList.size():").append(arraylist.size()).toString());
            Utils.logger(TAG, (new StringBuilder()).append("UpdateLimitedDataFromDataDumpTask(): insertList.size():").append(aarraylist.size()).toString());
            if (arraylist.size() > 0)
            {
                PoiDbManager.getInstance(PoiManager.mContext).updatePois(arraylist);
            }
            if (aarraylist.size() > 0)
            {
                PoiDbManager.getInstance(PoiManager.mContext).addPois(aarraylist, false);
            }
            return Boolean.valueOf(true);
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((ArrayList[])aobj);
        }

        protected void onPostExecute(Boolean boolean1)
        {
            Utils.logger(TAG, "UpdateLimitedDataFromDataDumpTask(): onPostExecute: success");
            notifyLimitedDataUpdatedListener();
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Boolean)obj);
        }

        protected transient void onProgressUpdate(Integer ainteger[])
        {
            super.onProgressUpdate(ainteger);
        }

        protected volatile void onProgressUpdate(Object aobj[])
        {
            onProgressUpdate((Integer[])aobj);
        }

        UpdateLimitedDataFromDataDumpTask()
        {
            this$0 = PoiManager.this;
            super();
        }
    }


    private static final String KEY_RESULTS_OK = "OK";
    private static Context mContext;
    private static PoiManager mInstance;
    private final String TAG = getClass().getSimpleName();
    private AllToursDataLoadedListener mAllToursDataLoadedListener;
    private ArrayList mAllToursList;
    private ArrayList mCurrentFavoritePoiList;
    private POIDetail mCurrentPOIDetail;
    private ArrayList mCurrentPoiList;
    private POIDetail mCurrentTourDetailPoi;
    private ArrayList mCurrentTourPoiList;
    private ArrayList mDataChangedListeners;
    private PoiDetailLoadedListener mDetailLoadedListener;
    private InitialDataLoadedListener mInitialDataLoadedListener;
    private ArrayList mLatestPoiList;
    private LimitedDataLoadedListener mLimitedDataLoadedListener;
    private LimitedDataUpdatedListener mLimitedDataUpdatedListener;
    private OnUnclusteredMapMarkersListener mOnUnclusteredMapMarkersListener;
    private String mServiceHost;
    private TourDetailLoadedListener mTourDetailLoadedListener;
    private ArrayList mUnclusteredClusteredPoiList;
    private String mUnclusteredMapMarkersString;
    private ArrayList mUnclusteredPois;

    public PoiManager(Context context)
    {
        mUnclusteredMapMarkersString = "";
        mContext = context;
        mCurrentPoiList = new ArrayList();
        mUnclusteredClusteredPoiList = new ArrayList();
        mServiceHost = HistoryHereApplication.getConfiguration().poiServiceHost;
    }

    public static void addFavorite(Context context, String s)
    {
        PreferenceManager.addFavorite(context, s);
    }

    public static String[] getFavorites(Context context)
    {
        return PreferenceManager.getFavorites(context);
    }

    public static PoiManager getInstance(Context context)
    {
        com/aetn/history/android/historyhere/model/PoiManager;
        JVM INSTR monitorenter ;
        if (mInstance == null)
        {
            mInstance = new PoiManager(context);
        }
        mContext = context;
        context = mInstance;
        com/aetn/history/android/historyhere/model/PoiManager;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private static String getStringFromInputStream(InputStream inputstream)
    {
        Object obj;
        Object obj1;
        StringBuilder stringbuilder;
        obj = null;
        obj1 = null;
        stringbuilder = new StringBuilder();
        inputstream = new BufferedReader(new InputStreamReader(inputstream));
_L3:
        obj = inputstream.readLine();
        if (obj == null) goto _L2; else goto _L1
_L1:
        stringbuilder.append(((String) (obj)));
          goto _L3
        obj1;
_L7:
        obj = inputstream;
        ((IOException) (obj1)).printStackTrace();
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                inputstream.printStackTrace();
            }
        }
        return stringbuilder.toString();
_L2:
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                inputstream.printStackTrace();
            }
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        inputstream;
_L5:
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        throw inputstream;
        obj1;
        obj = inputstream;
        inputstream = ((InputStream) (obj1));
        if (true) goto _L5; else goto _L4
_L4:
        IOException ioexception;
        ioexception;
        inputstream = ((InputStream) (obj1));
        obj1 = ioexception;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static boolean isFavorite(Context context, String s)
    {
        return PreferenceManager.isFavorite(context, s);
    }

    private void notifyAllToursLoadFailedListener()
    {
        if (mAllToursDataLoadedListener != null)
        {
            mAllToursDataLoadedListener.onDataLoadFailed();
        }
    }

    private void notifyAllToursLoadedListeners()
    {
        if (mAllToursDataLoadedListener != null)
        {
            mAllToursDataLoadedListener.onDataLoaded(getAllToursList());
        }
    }

    private void notifyDetailFailedListener()
    {
        Utils.logger(TAG, (new StringBuilder()).append("notifyDetailLoadedListener:notifyDetailFailedListener: ").append(mDetailLoadedListener).toString());
        if (mDetailLoadedListener != null)
        {
            mDetailLoadedListener.onPoiDetailLoadFailed();
        }
    }

    private void notifyDetailLoadedListener()
    {
        Utils.logger(TAG, (new StringBuilder()).append("notifyDetailLoadedListener:mDetailLoadedListener: ").append(mDetailLoadedListener).toString());
        if (mDetailLoadedListener != null)
        {
            mDetailLoadedListener.onPoiDetailLoaded(getCurrentPOIDetail());
        }
    }

    private void notifyInitialDataListener()
    {
        mInitialDataLoadedListener.onDataLoaded();
    }

    private void notifyLimitedDataLoadedListener(ArrayList arraylist)
    {
        mLimitedDataLoadedListener.onDataLoaded(arraylist);
    }

    private void notifyLimitedDataUpdatedListener()
    {
        mLimitedDataUpdatedListener.onDataUpdated();
    }

    private void notifyListeners()
    {
        if (mDataChangedListeners != null)
        {
            for (Iterator iterator = mDataChangedListeners.iterator(); iterator.hasNext(); ((PoiDataChangedListener)iterator.next()).onPoiDataChanged(mCurrentPoiList)) { }
        }
    }

    private void notifyOnUnclusteredPoisChangedListener()
    {
        if (mOnUnclusteredMapMarkersListener != null)
        {
            mOnUnclusteredMapMarkersListener.onUnclusteredPoisChanged();
        }
    }

    private void notifyOnUnclusteredPoisLoadedListener()
    {
        if (mOnUnclusteredMapMarkersListener != null)
        {
            mOnUnclusteredMapMarkersListener.onUnclusteredPoisLoaded(mUnclusteredClusteredPoiList);
        }
    }

    private void notifyTourDetailFailedListener()
    {
        Utils.logger(TAG, (new StringBuilder()).append("notifyDetailLoadedListener:notifyDetailFailedListener: ").append(mTourDetailLoadedListener).toString());
        if (mTourDetailLoadedListener != null)
        {
            mTourDetailLoadedListener.onTourDetailLoadFailed();
        }
    }

    private void notifyTourDetailLoadedListeners()
    {
        mTourDetailLoadedListener.onTourDetailLoaded(getCurrentTourDetailPOI());
    }

    public static void removeFavorite(Context context, String s)
    {
        PreferenceManager.removeFavorite(context, s);
    }

    public ArrayList getAllToursList()
    {
        return mAllToursList;
    }

    public ArrayList getAllToursListWithPaddingRow()
    {
        ArrayList arraylist = new ArrayList();
        if (mAllToursList != null)
        {
            for (Iterator iterator = mAllToursList.iterator(); iterator.hasNext(); arraylist.add((POIDetail)iterator.next())) { }
            arraylist.add(new POIDetail());
        }
        return arraylist;
    }

    public ArrayList getCurrentFavoriteList()
    {
        return mCurrentFavoritePoiList;
    }

    public ArrayList getCurrentFavoritesListFromDB(Context context)
    {
        String as[] = PreferenceManager.getFavorites(context);
        mCurrentFavoritePoiList = PoiDbManager.getInstance(context).getFavoritePoiList(as);
        return mCurrentFavoritePoiList;
    }

    public POIDetail getCurrentPOIDetail()
    {
        return mCurrentPOIDetail;
    }

    public ArrayList getCurrentPOIList()
    {
        return mCurrentPoiList;
    }

    public ArrayList getCurrentPOIListWithExtraRow()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = mCurrentPoiList.iterator(); iterator.hasNext(); arraylist.add((POIDetail)iterator.next())) { }
        if (mCurrentPoiList.size() > 4)
        {
            arraylist.add(new POIDetail());
        }
        return arraylist;
    }

    public POIDetail getCurrentTourDetailPOI()
    {
        return mCurrentTourDetailPoi;
    }

    public ArrayList getCurrentTourList()
    {
        return mCurrentTourPoiList;
    }

    public ArrayList getCurrentTourListWithExtraRow()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = mCurrentTourPoiList.iterator(); iterator.hasNext(); arraylist.add((POIDetail)iterator.next())) { }
        arraylist.add(new POIDetail());
        return arraylist;
    }

    public void getPOIDetailFromService(Context context, String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (ConnectionManager.isNetworkAvailable(context)) goto _L2; else goto _L1
_L1:
        manageConnectionNotAvailable(context, context.getResources().getString(0x7f0d003c));
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int i = Math.round((new Date()).getTime() / 1000L);
        context = (new StringBuilder()).append("/place_v2/detail/json/?").append("poi_id=").append(s).toString();
        context = Signing.signRequestForPOIWebService(mServiceHost, context, "PNIPTS01", "nd78tYq6e4", i);
        Utils.logger(TAG, (new StringBuilder()).append("setPOIDetailFromService signedRequest").append(context).toString());
        context = new StringRequest(0, context, new com.android.volley.Response.Listener() {

            final PoiManager this$0;

            public volatile void onResponse(Object obj)
            {
                onResponse((String)obj);
            }

            public void onResponse(String s1)
            {
                Utils.logger(TAG, (new StringBuilder()).append("setPOIDetailFromService: the response was: ").append(s1).toString());
                if (s1.indexOf("OK") < 0)
                {
                    notifyDetailFailedListener();
                    return;
                } else
                {
                    s1 = (PoiDetailResponse)(new Gson()).fromJson(s1, com/aetn/history/android/historyhere/model/PoiDetailResponse);
                    Utils.logger(TAG, (new StringBuilder()).append("setPOIDetailFromService: mPoiDetailResponse.results.size():").append(((PoiDetailResponse) (s1)).results.size()).toString());
                    setCurrentPOIDetail((POIDetail)((PoiDetailResponse) (s1)).results.get(0));
                    notifyDetailLoadedListener();
                    return;
                }
            }

            
            {
                this$0 = PoiManager.this;
                super();
            }
        }, new com.android.volley.Response.ErrorListener() {

            final PoiManager this$0;

            public void onErrorResponse(VolleyError volleyerror)
            {
                notifyDetailFailedListener();
            }

            
            {
                this$0 = PoiManager.this;
                super();
            }
        });
        HttpRequestManager.getInstance(mContext).getRequestQueue().add(context);
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

    public POIDetail getPoiById(String s)
    {
        return PoiDbManager.getInstance(mContext).getPoiById(s);
    }

    public void getPoiList(double d, double d1, long l, String s, 
            int i)
    {
        this;
        JVM INSTR monitorenter ;
        s = (new StringBuilder()).append(d).append(",").append(d1).toString();
        int j = Math.round((new Date()).getTime() / 1000L);
        s = (new StringBuilder()).append("/place/proximity/json/?").append("location=").append(s).append("&radius=").append(l).append("&detail=true").append("&max_results=").append(i).toString();
        s = Signing.signRequestForPOIWebService(mServiceHost, s, "PNIPTS01", "nd78tYq6e4", j);
        Utils.logger(TAG, (new StringBuilder()).append("getPoiList(): The final string is").append(s).toString());
        s = new StringRequest(0, s, new com.android.volley.Response.Listener() {

            final PoiManager this$0;

            public volatile void onResponse(Object obj)
            {
                onResponse((String)obj);
            }

            public void onResponse(String s1)
            {
                s1 = (PoiResponse)(new Gson()).fromJson(s1, com/aetn/history/android/historyhere/model/PoiResponse);
                if (getCurrentPOIList() == null)
                {
                    mCurrentPoiList = new ArrayList();
                }
                mLatestPoiList = new ArrayList();
                if (((PoiResponse) (s1)).results == null)
                {
                    Utils.logger(TAG, (new StringBuilder()).append("getPoiList(): no results:").append(mCurrentPoiList.size()).toString());
                    s1 = new Intent("poi_data_refreshed");
                    PoiManager.mContext.sendBroadcast(s1);
                    return;
                }
                Utils.logger(TAG, (new StringBuilder()).append("getPoiList(): mCurrentPoiList()").append(mCurrentPoiList.size()).toString());
                s1 = ((PoiResponse) (s1)).results.iterator();
                do
                {
                    if (!s1.hasNext())
                    {
                        break;
                    }
                    POIDetail poidetail = (POIDetail)s1.next();
                    if (!mCurrentPoiList.contains(poidetail))
                    {
                        mCurrentPoiList.add(poidetail);
                        mLatestPoiList.add(poidetail);
                    }
                } while (true);
                notifyListeners();
            }

            
            {
                this$0 = PoiManager.this;
                super();
            }
        }, new com.android.volley.Response.ErrorListener() {

            final PoiManager this$0;

            public void onErrorResponse(VolleyError volleyerror)
            {
            }

            
            {
                this$0 = PoiManager.this;
                super();
            }
        });
        HttpRequestManager.getInstance(mContext).getRequestQueue().add(s);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public ArrayList getPoiListWithinBounds(double d, double d1, double d2, double d3)
    {
        mCurrentPoiList = PoiDbManager.getInstance(mContext).getPoiListWithinBounds(d, d1, d2, d3);
        notifyListeners();
        return getCurrentPOIList();
    }

    public POIDetail getTourItemFromToursListById(String s)
    {
        for (Iterator iterator = getAllToursList().iterator(); iterator.hasNext();)
        {
            POIDetail poidetail = (POIDetail)iterator.next();
            if (poidetail.getId().equalsIgnoreCase(s))
            {
                return poidetail;
            }
        }

        return null;
    }

    public void getTourPOIDetailFromService(Context context, POIDetail poidetail)
    {
        this;
        JVM INSTR monitorenter ;
        if (ConnectionManager.isNetworkAvailable(context)) goto _L2; else goto _L1
_L1:
        manageConnectionNotAvailable(context, context.getResources().getString(0x7f0d003e));
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        mCurrentTourDetailPoi = poidetail;
        String s = poidetail.getTourListString();
        (new StringBuilder()).append(poidetail.getLatitude()).append(",").append(poidetail.getLongitude()).toString();
        int i = Math.round((new Date()).getTime() / 1000L);
        poidetail = (new StringBuilder()).append("/place_v2/detail/json/?").append("&poi_id=").append(s).toString();
        poidetail = Signing.signRequestForPOIWebService(mServiceHost, poidetail, "PNIPTS01", "nd78tYq6e4", i);
        Utils.logger(TAG, (new StringBuilder()).append("getTourPOIDetailFromService signedrequest: ").append(poidetail).toString());
        Utils.logger(TAG, (new StringBuilder()).append("getTourPOIDetailFromService finalURL: ").append(poidetail).toString());
        poidetail = new StringRequest(0, poidetail, new com.android.volley.Response.Listener() {

            final PoiManager this$0;

            public volatile void onResponse(Object obj)
            {
                onResponse((String)obj);
            }

            public void onResponse(String s1)
            {
                Utils.logger(TAG, (new StringBuilder()).append("getTourPOIDetailFromService: the response was: ").append(s1).toString());
                if (s1.indexOf("OK") < 0)
                {
                    notifyTourDetailFailedListener();
                    return;
                } else
                {
                    s1 = ((PoiResponse)(new Gson()).fromJson(s1, com/aetn/history/android/historyhere/model/PoiResponse)).results;
                    mCurrentTourPoiList = s1;
                    notifyTourDetailLoadedListeners();
                    return;
                }
            }

            
            {
                this$0 = PoiManager.this;
                super();
            }
        }, new com.android.volley.Response.ErrorListener() {

            final PoiManager this$0;

            public void onErrorResponse(VolleyError volleyerror)
            {
                notifyTourDetailFailedListener();
            }

            
            {
                this$0 = PoiManager.this;
                super();
            }
        });
        HttpRequestManager.getInstance(context).getRequestQueue().add(poidetail);
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

    public boolean isInUnclusteredMapMarkers(String s)
    {
        return mUnclusteredMapMarkersString.indexOf((new StringBuilder()).append("'").append(s).append("'").toString()) > -1;
    }

    public void loadAllToursList()
    {
        this;
        JVM INSTR monitorenter ;
        Utils.logger(TAG, "loadAllToursList():");
        int i = Math.round((new Date()).getTime() / 1000L);
        Object obj = (new StringBuilder()).append("/place_v2/proximity/json/?").append("&bbox=").append("24.329561,-64.48493,48.605661,-127.1509548").append("&category=itinerary").append("&detail=true").append("&tags=").append("aetn\\-tour").append("&max_results=").append(100).toString();
        obj = Signing.signRequestForPOIWebService(mServiceHost, ((String) (obj)), "PNIPTS01", "nd78tYq6e4", i);
        Utils.logger(TAG, (new StringBuilder()).append("loadAllToursList(): signedrequest: ").append(((String) (obj))).toString());
        obj = new StringRequest(0, ((String) (obj)), new com.android.volley.Response.Listener() {

            final PoiManager this$0;

            public volatile void onResponse(Object obj1)
            {
                onResponse((String)obj1);
            }

            public void onResponse(String s)
            {
                if (s.indexOf("OK") < 0)
                {
                    Utils.logger(TAG, "loadAllToursList: not loaded properly");
                    notifyAllToursLoadFailedListener();
                    return;
                }
                s = (PoiResponse)(new Gson()).fromJson(s, com/aetn/history/android/historyhere/model/PoiResponse);
                mAllToursList = ((PoiResponse) (s)).results;
                s = new ArrayList();
                Iterator iterator = HistoryHereApplication.getConfiguration().tourSponsorData.iterator();
label0:
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    Configuration.TourSponsorData toursponsordata = (Configuration.TourSponsorData)iterator.next();
                    Iterator iterator1 = mAllToursList.iterator();
                    POIDetail poidetail;
                    do
                    {
                        if (!iterator1.hasNext())
                        {
                            continue label0;
                        }
                        poidetail = (POIDetail)iterator1.next();
                    } while (!toursponsordata.id.equalsIgnoreCase(poidetail.getId()));
                    s.add(poidetail);
                    mAllToursList.remove(poidetail);
                } while (true);
                Collections.sort(mAllToursList, new Comparator() {

                    final _cls7 this$1;

                    public int compare(POI poi, POI poi1)
                    {
                        return poi.getCity().compareTo(poi1.getCity());
                    }

                    public volatile int compare(Object obj, Object obj1)
                    {
                        return compare((POI)obj, (POI)obj1);
                    }

            
            {
                this$1 = _cls7.this;
                super();
            }
                });
                Collections.sort(s, new Comparator() {

                    final _cls7 this$1;

                    public int compare(POI poi, POI poi1)
                    {
                        return poi.getCity().compareTo(poi1.getCity());
                    }

                    public volatile int compare(Object obj, Object obj1)
                    {
                        return compare((POI)obj, (POI)obj1);
                    }

            
            {
                this$1 = _cls7.this;
                super();
            }
                });
                s.addAll(mAllToursList);
                mAllToursList = s;
                notifyAllToursLoadedListeners();
            }

            
            {
                this$0 = PoiManager.this;
                super();
            }
        }, new com.android.volley.Response.ErrorListener() {

            final PoiManager this$0;

            public void onErrorResponse(VolleyError volleyerror)
            {
                notifyAllToursLoadFailedListener();
            }

            
            {
                this$0 = PoiManager.this;
                super();
            }
        });
        HttpRequestManager.getInstance(mContext).getRequestQueue().add(((com.android.volley.Request) (obj)));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void loadFullPoiListFromAssets(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        Utils.logger(TAG, "loadFullPoiListFromAssets(): running");
        (new LoadAllPoisFromAssetsTask()).execute(new String[] {
            "start"
        });
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public void loadFullPoiListFromDataDump(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        Utils.logger(TAG, "loadFullPoiListFromDataDump(): running");
        int i = Math.round((new Date()).getTime() / 1000L);
        Object obj = Signing.signRequestForPOIDataDump(mServiceHost, "/place_v2/dump/json/?", "PNIPTS01", "nd78tYq6e4", i);
        Utils.logger(TAG, (new StringBuilder()).append("loadFullPoiListFromDataDump: signedRequest: ").append(((String) (obj))).toString());
        obj = new StringRequest(0, ((String) (obj)), new com.android.volley.Response.Listener() {

            final PoiManager this$0;

            public volatile void onResponse(Object obj1)
            {
                onResponse((String)obj1);
            }

            public void onResponse(String s)
            {
                Utils.logger(TAG, (new StringBuilder()).append("loadFullPoiListFromDataDump: the response was this long: ").append(s.length()).toString());
                (new LoadAllPoisFromDataDumpTask()).execute(new String[] {
                    s
                });
            }

            
            {
                this$0 = PoiManager.this;
                super();
            }
        }, new com.android.volley.Response.ErrorListener() {

            final PoiManager this$0;

            public void onErrorResponse(VolleyError volleyerror)
            {
                Utils.logger(TAG, (new StringBuilder()).append("loadFullPoiListFromDataDump: signedRequest: error: ").append(volleyerror).toString());
            }

            
            {
                this$0 = PoiManager.this;
                super();
            }
        });
        HttpRequestManager.getInstance(context).getRequestQueue().add(((com.android.volley.Request) (obj)));
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public void loadLimitedListFromDataDump(Context context, String s)
    {
        this;
        JVM INSTR monitorenter ;
        Utils.logger(TAG, "loadLimitedListFromDataDump(): running");
        int i = Math.round((new Date()).getTime() / 1000L);
        s = (new StringBuilder()).append(s).append("T00:00Z").toString();
        s = (new StringBuilder()).append("/place_v2/dump/json/?modified_after=").append(s).append("&").toString();
        s = Signing.signRequestForPOIDataDump(mServiceHost, s, "PNIPTS01", "nd78tYq6e4", i);
        Utils.logger(TAG, (new StringBuilder()).append("loadLimitedListFromDataDump: signedRequest: ").append(s).toString());
        s = new StringRequest(0, s, new com.android.volley.Response.Listener() {

            final PoiManager this$0;

            public volatile void onResponse(Object obj)
            {
                onResponse((String)obj);
            }

            public void onResponse(String s1)
            {
                (new LoadLimitedDataFromDataDumpTask()).execute(new String[] {
                    s1
                });
            }

            
            {
                this$0 = PoiManager.this;
                super();
            }
        }, new com.android.volley.Response.ErrorListener() {

            final PoiManager this$0;

            public void onErrorResponse(VolleyError volleyerror)
            {
                Utils.logger(TAG, (new StringBuilder()).append("loadLimitedListFromDataDump: signedRequest: error: ").append(volleyerror).toString());
            }

            
            {
                this$0 = PoiManager.this;
                super();
            }
        });
        HttpRequestManager.getInstance(context).getRequestQueue().add(s);
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public void loadUnclusteredMapPois()
    {
        if (!mUnclusteredMapMarkersString.isEmpty())
        {
            Utils.logger(TAG, (new StringBuilder()).append("loadUnclusteredMapPois: final stringlist: ").append(mUnclusteredMapMarkersString).toString());
            mUnclusteredClusteredPoiList = PoiDbManager.getInstance(mContext).getPoisFromList(mUnclusteredMapMarkersString);
            Utils.logger(TAG, (new StringBuilder()).append("mUnclusteredClusteredPoiList:").append(mUnclusteredClusteredPoiList.size()).toString());
            notifyOnUnclusteredPoisLoadedListener();
            return;
        } else
        {
            Utils.logger(TAG, "loadUnclusteredMapPois(): mUnclusteredMapMarkersString.isEmpty()");
            return;
        }
    }

    public void manageConnectionNotAvailable(Context context, String s)
    {
    }

    public void setCurrentPOIDetail(POIDetail poidetail)
    {
        mCurrentPOIDetail = poidetail;
    }

    public void setCurrentPOIList(ArrayList arraylist)
    {
        mCurrentPoiList = arraylist;
    }

    public void setInitialDataLoadedListener(InitialDataLoadedListener initialdataloadedlistener)
    {
        mInitialDataLoadedListener = initialdataloadedlistener;
    }

    public void setLimitedDataLoadedListener(LimitedDataLoadedListener limiteddataloadedlistener)
    {
        mLimitedDataLoadedListener = limiteddataloadedlistener;
    }

    public void setLimitedDataUpdatedListener(LimitedDataUpdatedListener limiteddataupdatedlistener)
    {
        mLimitedDataUpdatedListener = limiteddataupdatedlistener;
    }

    public void setOnAllToursDataLoadedListener(AllToursDataLoadedListener alltoursdataloadedlistener)
    {
        mAllToursDataLoadedListener = alltoursdataloadedlistener;
    }

    public void setOnDataChangedListener(PoiDataChangedListener poidatachangedlistener)
    {
        if (mDataChangedListeners == null)
        {
            mDataChangedListeners = new ArrayList();
        }
        mDataChangedListeners.add(poidatachangedlistener);
    }

    public void setOnDetailLoadedListener(PoiDetailLoadedListener poidetailloadedlistener)
    {
        mDetailLoadedListener = poidetailloadedlistener;
    }

    public void setOnTourDetailLoadedListener(TourDetailLoadedListener tourdetailloadedlistener)
    {
        mTourDetailLoadedListener = tourdetailloadedlistener;
    }

    public void setOnUnclusteredMapMarkersListener(OnUnclusteredMapMarkersListener onunclusteredmapmarkerslistener)
    {
        mOnUnclusteredMapMarkersListener = onunclusteredmapmarkerslistener;
    }

    public void setUnclusteredPoiString()
    {
        mUnclusteredMapMarkersString = "";
        for (Iterator iterator = mUnclusteredPois.iterator(); iterator.hasNext();)
        {
            POIDetail poidetail = (POIDetail)iterator.next();
            mUnclusteredMapMarkersString = (new StringBuilder()).append(mUnclusteredMapMarkersString).append("'").append(poidetail.getId()).append("',").toString();
        }

        if (!mUnclusteredMapMarkersString.isEmpty())
        {
            StringBuilder stringbuilder = new StringBuilder(mUnclusteredMapMarkersString);
            stringbuilder.replace(mUnclusteredMapMarkersString.lastIndexOf(","), mUnclusteredMapMarkersString.lastIndexOf(",") + 1, "");
            mUnclusteredMapMarkersString = stringbuilder.toString();
        }
    }

    public void setUnclusteredPois(ArrayList arraylist)
    {
        mUnclusteredPois = arraylist;
        setUnclusteredPoiString();
        notifyOnUnclusteredPoisChangedListener();
    }

    public void updateLimitedListFromDataDump(ArrayList arraylist)
    {
        this;
        JVM INSTR monitorenter ;
        Utils.logger(TAG, "updateLimitedListFromDataDump(): running");
        (new UpdateLimitedDataFromDataDumpTask()).execute(new ArrayList[] {
            arraylist
        });
        this;
        JVM INSTR monitorexit ;
        return;
        arraylist;
        throw arraylist;
    }



/*
    static ArrayList access$002(PoiManager poimanager, ArrayList arraylist)
    {
        poimanager.mCurrentPoiList = arraylist;
        return arraylist;
    }

*/




/*
    static ArrayList access$1002(PoiManager poimanager, ArrayList arraylist)
    {
        poimanager.mAllToursList = arraylist;
        return arraylist;
    }

*/


/*
    static ArrayList access$102(PoiManager poimanager, ArrayList arraylist)
    {
        poimanager.mLatestPoiList = arraylist;
        return arraylist;
    }

*/




/*
    static ArrayList access$1302(PoiManager poimanager, ArrayList arraylist)
    {
        poimanager.mCurrentTourPoiList = arraylist;
        return arraylist;
    }

*/











}
