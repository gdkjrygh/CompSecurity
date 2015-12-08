// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere;

import android.app.Application;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;
import com.aetn.history.android.historyhere.model.Configuration;
import com.aetn.history.android.historyhere.model.HttpRequestManager;
import com.aetn.history.android.historyhere.model.POI;
import com.aetn.history.android.historyhere.model.PoiManager;
import com.aetn.history.android.historyhere.utils.ConnectionManager;
import com.aetn.history.android.historyhere.utils.Json;
import com.aetn.history.android.historyhere.utils.TextUtils;
import com.aetn.history.android.historyhere.utils.Utils;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class HistoryHereApplication extends Application
{
    class GeoAddressLookup extends AsyncTask
    {

        final HistoryHereApplication this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected transient JSONObject doInBackground(String as[])
        {
            try
            {
                Utils.logger(HistoryHereApplication.TAG, "DoGeoAddressLookup:doInBackground()");
                as = as[0].replace(' ', '+');
                as = Json.getJSONfromURL((new StringBuilder()).append("http://maps.google.com/maps/api/geocode/json?address=").append(as).append("&sensor=true").toString());
                Utils.logger(HistoryHereApplication.TAG, (new StringBuilder()).append("Geoloc returned:").append(as.toString()).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                Utils.logger(HistoryHereApplication.TAG, "Geoloc returned error");
                as.printStackTrace();
                return null;
            }
            return as;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((JSONObject)obj);
        }

        protected void onPostExecute(JSONObject jsonobject)
        {
            Utils.logger(HistoryHereApplication.TAG, "DoGeoAddressLookup:onPostExecute()");
            if (jsonobject == null)
            {
                break MISSING_BLOCK_LABEL_142;
            }
            String s = Utils.getFormattedAddressFromGeolocationData(jsonobject);
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_32;
            }
            setCurrentSearchFormattedAddress(s);
            jsonobject = Utils.getLocationFromGeolocationData(jsonobject);
            if (jsonobject != null)
            {
                try
                {
                    double d = Double.valueOf(((String)jsonobject.get("latitude")).trim()).doubleValue();
                    double d1 = Double.valueOf(((String)jsonobject.get("longitude")).trim()).doubleValue();
                    setCurrentSearchLocation(d, d1);
                    hideMessageBox();
                    doPoiSearch(getCurrentSearchLatitude(), getCurrentSearchLongitude());
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (JSONObject jsonobject)
                {
                    jsonobject.printStackTrace();
                }
                break MISSING_BLOCK_LABEL_141;
            }
            Log.e(HistoryHereApplication.TAG, "There was no result from the lookup");
            hideMessageBox();
            return;
            return;
            Utils.logger(HistoryHereApplication.TAG, "DoGeoAddressLookup:onPostExecute()-- result is NULL so show error");
            hideMessageBox();
            showToast(getResources().getString(0x7f0d0040), 1);
            return;
        }

        protected transient void onProgressUpdate(Integer ainteger[])
        {
            super.onProgressUpdate(ainteger);
        }

        protected volatile void onProgressUpdate(Object aobj[])
        {
            onProgressUpdate((Integer[])aobj);
        }

        GeoAddressLookup()
        {
            this$0 = HistoryHereApplication.this;
            super();
        }
    }

    class GeoLookupRequestReceiver extends BroadcastReceiver
    {

        final HistoryHereApplication this$0;

        public void onReceive(Context context, Intent intent)
        {
            unregisterReceiver(geoLookupRequestReceiver);
            clearPreviousSearchValues();
            Utils.logger(HistoryHereApplication.TAG, "GeoLookupRequestReceiver: received");
            context = intent.getExtras();
            currentSearchString = context.getString("searchString");
            Utils.logger(HistoryHereApplication.TAG, (new StringBuilder()).append("The search string is: ").append(currentSearchString).toString());
            (new GeoAddressLookup()).execute(new String[] {
                currentSearchString
            });
        }

        GeoLookupRequestReceiver()
        {
            this$0 = HistoryHereApplication.this;
            super();
        }
    }

    public static interface OnConfigLoadedListener
    {

        public abstract void onConfigLoaded();
    }


    private static final String TAG = com/aetn/history/android/historyhere/HistoryHereApplication.getSimpleName();
    private static Configuration mConfiguration;
    public static Location mCurrentLocation;
    com.android.volley.Response.ErrorListener configErrorListener;
    com.android.volley.Response.Listener configSuccessListener;
    public String currentAppVersionName;
    private String currentSearchFormattedAddress;
    private double currentSearchLatitude;
    private double currentSearchLongitude;
    private String currentSearchString;
    public boolean currentlyRequestingPoiData;
    ProgressDialog dialog;
    private IntentFilter geoLookupRequestFilter;
    private GeoLookupRequestReceiver geoLookupRequestReceiver;
    public boolean initedSearch;
    private OnConfigLoadedListener mConfigLoadedListener;
    private Context mContext;
    private boolean preferencesChangedTF;
    public String showDetailInMapId;
    public POI showDetailInMapPoiDetail;

    public HistoryHereApplication()
    {
        showDetailInMapId = "";
        initedSearch = false;
        preferencesChangedTF = false;
        currentlyRequestingPoiData = false;
        currentAppVersionName = "";
        configSuccessListener = new com.android.volley.Response.Listener() {

            final HistoryHereApplication this$0;

            public void onResponse(Object obj)
            {
                Utils.logger(HistoryHereApplication.TAG, (new StringBuilder()).append("loadConfig(): we have the response:").append(obj.toString()).toString());
                Gson gson = new Gson();
                try
                {
                    HistoryHereApplication.mConfiguration = (Configuration)gson.fromJson(obj.toString(), com/aetn/history/android/historyhere/model/Configuration);
                    Utils.logger(HistoryHereApplication.TAG, (new StringBuilder()).append("loadConfig():the class is parsed:version: ").append(HistoryHereApplication.mConfiguration.version).toString());
                    mConfigLoadedListener.onConfigLoaded();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    ((JsonSyntaxException) (obj)).printStackTrace();
                }
                Utils.logger(HistoryHereApplication.TAG, "loadConfig():Parse error ");
            }

            
            {
                this$0 = HistoryHereApplication.this;
                super();
            }
        };
        configErrorListener = new com.android.volley.Response.ErrorListener() {

            final HistoryHereApplication this$0;

            public void onErrorResponse(VolleyError volleyerror)
            {
                if (volleyerror.networkResponse != null)
                {
                    Log.d(HistoryHereApplication.TAG, (new StringBuilder()).append("Error Response code: ").append(volleyerror.networkResponse.statusCode).toString());
                }
            }

            
            {
                this$0 = HistoryHereApplication.this;
                super();
            }
        };
    }

    public static Configuration getConfiguration()
    {
        return mConfiguration;
    }

    public void clearAddressBar()
    {
        setCurrentSearchFormattedAddress("");
    }

    public void clearPreviousSearchValues()
    {
        clearAddressBar();
        Utils.logger(TAG, (new StringBuilder()).append("clearPreviousSearchValues(): showDetailInMapPoiDetail").append(showDetailInMapPoiDetail).toString());
    }

    Map createBasicAuthHeader(String s, String s1)
    {
        HashMap hashmap = new HashMap();
        s = Base64.encodeToString((new StringBuilder()).append(s).append(":").append(s1).toString().getBytes(), 2);
        hashmap.put("Authorization", (new StringBuilder()).append("Basic ").append(s).toString());
        return hashmap;
    }

    public void doGeoLookup(String s, Context context)
    {
        if (!ConnectionManager.isNetworkAvailable(mContext))
        {
            manageConnectionNotAvailable();
            return;
        } else
        {
            geoLookupRequestReceiver = new GeoLookupRequestReceiver();
            geoLookupRequestFilter = new IntentFilter("geo lookup requested");
            registerReceiver(geoLookupRequestReceiver, geoLookupRequestFilter);
            showMessageBox(context, getResources().getString(0x7f0d0066));
            (new GeoAddressLookup()).execute(new String[] {
                s
            });
            return;
        }
    }

    public void doPoiSearch()
    {
        Utils.logger(TAG, ">>>>>>>>doPoiSearch");
        if (!ConnectionManager.isNetworkAvailable(mContext))
        {
            manageConnectionNotAvailable();
            return;
        } else
        {
            initedSearch = true;
            currentlyRequestingPoiData = true;
            double d = getCurrentSearchLatitude();
            double d1 = getCurrentSearchLongitude();
            long l = getRadiusAsMeters();
            int i = getMaxResults();
            PoiManager.getInstance(mContext).getPoiList(d, d1, l, "", i);
            return;
        }
    }

    public void doPoiSearch(double d, double d1)
    {
        setCurrentSearchLocation(d, d1);
        doPoiSearch();
    }

    public double getCurrentSearchLatitude()
    {
        return currentSearchLatitude;
    }

    public double getCurrentSearchLongitude()
    {
        return currentSearchLongitude;
    }

    public String getLocalyticsKey()
    {
        String s = getConfiguration().localytics.prod.appID;
        Utils.logger(TAG, (new StringBuilder()).append("getLocalyticsKey:dev:").append(getConfiguration().localytics.dev.appID).toString());
        Utils.logger(TAG, (new StringBuilder()).append("getLocalyticsKey:prod:").append(getConfiguration().localytics.prod.appID).toString());
        Utils.logger(TAG, (new StringBuilder()).append("getLocalyticsKey:").append(s).toString());
        return s;
    }

    public int getMaxResults()
    {
        return 200;
    }

    public long getRadiusAsMeters()
    {
        Utils.logger(TAG, (new StringBuilder()).append("the pref for radius is: ").append(50).toString());
        return (long)Utils.convertMilesToMeters(50);
    }

    public void hideMessageBox()
    {
        if (dialog != null)
        {
            if (dialog.isShowing())
            {
                Utils.logger(TAG, "dismiss the dialog");
                dialog.dismiss();
                dialog = null;
            }
            return;
        } else
        {
            Utils.logger(TAG, "dialog was null or was not showing");
            return;
        }
    }

    public boolean isOnline()
    {
        ConnectivityManager connectivitymanager = (ConnectivityManager)mContext.getSystemService("connectivity");
        boolean flag;
        if (connectivitymanager.getActiveNetworkInfo() != null && connectivitymanager.getActiveNetworkInfo().isConnected())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Utils.logger(TAG, (new StringBuilder()).append("app.isOnline(): ").append(flag).toString());
        return flag;
    }

    public void loadConfig(OnConfigLoadedListener onconfigloadedlistener)
    {
        setOnConfigLoadedListener(onconfigloadedlistener);
        Utils.logger(TAG, (new StringBuilder()).append("loadConfig(): load it from here:").append("https://mobile-a.akamaihd.net/configs/historyhere/android/History/3_0/config.json").toString());
        onconfigloadedlistener = new StringRequest(0, "https://mobile-a.akamaihd.net/configs/historyhere/android/History/3_0/config.json", configSuccessListener, configErrorListener) {

            final HistoryHereApplication this$0;

            public Map getHeaders()
                throws AuthFailureError
            {
                return createBasicAuthHeader("historyhereiosuser", ":}O/Wa}%");
            }

            
            {
                this$0 = HistoryHereApplication.this;
                super(i, s, listener, errorlistener);
            }
        };
        Utils.logger(TAG, "loadConfig(): use prod:");
        Utils.logger(TAG, (new StringBuilder()).append("loadConfig(): stringRequest:").append(onconfigloadedlistener).toString());
        if (onconfigloadedlistener != null)
        {
            HttpRequestManager.getInstance(mContext).getRequestQueue().add(onconfigloadedlistener);
        }
    }

    public void manageConnectionNotAvailable()
    {
        showToast(getResources().getString(0x7f0d0041), 1);
    }

    public void onCreate()
    {
        super.onCreate();
        mContext = getApplicationContext();
        mConfigLoadedListener = null;
        try
        {
            currentAppVersionName = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            Log.v(TAG, namenotfoundexception.getMessage());
        }
        TextUtils.initFonts(this);
    }

    public void onTerminate()
    {
        super.onTerminate();
        Utils.logger(TAG, ">>>>>>onTerminate");
    }

    public void setCurrentSearchFormattedAddress(String s)
    {
        currentSearchFormattedAddress = s;
    }

    public void setCurrentSearchLatitude(double d)
    {
        currentSearchLatitude = d;
    }

    public void setCurrentSearchLocation(double d, double d1)
    {
        setCurrentSearchLatitude(d);
        setCurrentSearchLongitude(d1);
    }

    public void setCurrentSearchLongitude(double d)
    {
        currentSearchLongitude = d;
    }

    public void setOnConfigLoadedListener(OnConfigLoadedListener onconfigloadedlistener)
    {
        mConfigLoadedListener = onconfigloadedlistener;
    }

    public void setTargetedMapPoi(POI poi)
    {
        showDetailInMapPoiDetail = poi;
    }

    public void showFeedback()
    {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/html");
        intent.addFlags(0x10000000);
        intent.putExtra("android.intent.extra.EMAIL", new String[] {
            getResources().getString(0x7f0d0048)
        });
        intent.putExtra("android.intent.extra.SUBJECT", (new StringBuilder()).append(getResources().getString(0x7f0d004a)).append(" (version ").append(currentAppVersionName).append(")").toString());
        intent.putExtra("android.intent.extra.TEXT", getResources().getString(0x7f0d0049));
        getApplicationContext().startActivity(intent);
    }

    public void showMessageBox(Context context, String s)
    {
        try
        {
            hideMessageBox();
            dialog = ProgressDialog.show(context, "", s, true);
            dialog.setCancelable(true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

    public void showToast(String s, int i)
    {
        Toast.makeText(getApplicationContext(), s, i).show();
    }






/*
    static String access$202(HistoryHereApplication historyhereapplication, String s)
    {
        historyhereapplication.currentSearchString = s;
        return s;
    }

*/



/*
    static Configuration access$302(Configuration configuration)
    {
        mConfiguration = configuration;
        return configuration;
    }

*/

}
