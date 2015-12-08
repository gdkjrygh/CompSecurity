// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.geofence.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import com.digby.mm.android.library.controller.IDigbyController;
import com.digby.mm.android.library.controller.impl.DigbyController;
import com.digby.mm.android.library.db.IGeoFenceDBHelper;
import com.digby.mm.android.library.events.IEventResponse;
import com.digby.mm.android.library.events.impl.AbstractEventResponseHandler;
import com.digby.mm.android.library.events.impl.DownloadGeoFencesEvent;
import com.digby.mm.android.library.exception.DigbyException;
import com.digby.mm.android.library.filter.IFilter;
import com.digby.mm.android.library.geofence.IDownloadInfo;
import com.digby.mm.android.library.geofence.IGeoFenceListReceiver;
import com.digby.mm.android.library.utils.ISharedPrefsManager;
import com.digby.mm.android.library.utils.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class GetGeoFencesTask extends AsyncTask
{

    private Comparator mComparator;
    private Context mContext;
    private IGeoFenceDBHelper mDBHelper;
    private boolean mDownloadComplete;
    private BroadcastReceiver mDownloadCompleteReceiver;
    private boolean mDownloadSuccess;
    private IFilter mFilter;
    private List mGeoFences;
    private AbstractEventResponseHandler mHandler;
    private IGeoFenceListReceiver mReceiver;

    public GetGeoFencesTask(IFilter ifilter, Comparator comparator, IGeoFenceListReceiver igeofencelistreceiver, IGeoFenceDBHelper igeofencedbhelper, Context context)
    {
        mDownloadComplete = false;
        mGeoFences = new ArrayList();
        mDownloadSuccess = true;
        mHandler = new AbstractEventResponseHandler() {

            final GetGeoFencesTask this$0;

            public void onError(DigbyException digbyexception)
            {
                mDownloadSuccess = false;
                mDownloadComplete = true;
            }

            public void onResponse(IEventResponse ieventresponse)
            {
                mDownloadComplete = true;
            }

            
            {
                this$0 = GetGeoFencesTask.this;
                super();
            }
        };
        mDownloadCompleteReceiver = new BroadcastReceiver() {

            final GetGeoFencesTask this$0;

            public void onReceive(Context context1, Intent intent)
            {
                mDownloadSuccess = intent.getBooleanExtra("Success", true);
                mDownloadComplete = true;
            }

            
            {
                this$0 = GetGeoFencesTask.this;
                super();
            }
        };
        try
        {
            mFilter = ifilter;
            mComparator = comparator;
            mReceiver = igeofencelistreceiver;
            mDBHelper = igeofencedbhelper;
            mContext = context;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IFilter ifilter)
        {
            Logger.Error("GetGeoFencesTask", ifilter);
        }
    }

    private void applyComparator()
    {
        try
        {
            Collections.sort(mGeoFences, mComparator);
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("applyComparator", exception);
        }
    }

    private void applyFilter()
    {
        try
        {
            Iterator iterator = mGeoFences.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (!mFilter.matches(iterator.next()))
                {
                    iterator.remove();
                }
            } while (true);
        }
        catch (Exception exception)
        {
            Logger.Error("applyFilter", exception);
        }
    }

    protected transient Integer doInBackground(Object aobj[])
    {
        aobj = DigbyController.getInstance(mContext).getSharedPrefsManager().getLastDownloadInfo();
        static class _cls3
        {

            static final int $SwitchMap$com$digby$mm$android$library$geofence$IDownloadInfo$eDownloadStates[];

            static 
            {
                $SwitchMap$com$digby$mm$android$library$geofence$IDownloadInfo$eDownloadStates = new int[com.digby.mm.android.library.geofence.IDownloadInfo.eDownloadStates.values().length];
                try
                {
                    $SwitchMap$com$digby$mm$android$library$geofence$IDownloadInfo$eDownloadStates[com.digby.mm.android.library.geofence.IDownloadInfo.eDownloadStates.NEVER.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$digby$mm$android$library$geofence$IDownloadInfo$eDownloadStates[com.digby.mm.android.library.geofence.IDownloadInfo.eDownloadStates.DOWNLOADING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$digby$mm$android$library$geofence$IDownloadInfo$eDownloadStates[com.digby.mm.android.library.geofence.IDownloadInfo.eDownloadStates.COMPLETE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls3..SwitchMap.com.digby.mm.android.library.geofence.IDownloadInfo.eDownloadStates[((IDownloadInfo) (aobj)).getDownloadState().ordinal()];
        JVM INSTR tableswitch 1 2: default 177
    //                   1 85
    //                   2 138;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_138;
_L4:
        if (mDownloadSuccess)
        {
            mGeoFences = mDBHelper.getGeoFences();
            applyFilter();
            applyComparator();
        }
_L5:
        return Integer.valueOf(1);
_L2:
        DigbyController.getInstance(mContext).sendEvent(new DownloadGeoFencesEvent(mContext), mHandler);
        while (!mDownloadComplete) 
        {
            Thread.sleep(500L);
        }
          goto _L4
        aobj;
        Logger.Error("GetGeoFencesTask_doInBackground", ((Exception) (aobj)));
          goto _L5
        aobj = new IntentFilter("com.digby.mm.android.library.geofence.DOWNLOAD_COMPLETE");
        mContext.registerReceiver(mDownloadCompleteReceiver, ((IntentFilter) (aobj)));
        while (!mDownloadComplete) 
        {
            Thread.sleep(500L);
        }
          goto _L4
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground(aobj);
    }

    protected void onPostExecute(Integer integer)
    {
        try
        {
            mReceiver.onReceive(mGeoFences);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer)
        {
            Logger.Error("GetGeoFencesTask_onPostExecute", integer);
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Integer)obj);
    }

    protected transient void onProgressUpdate(Integer ainteger[])
    {
    }

    protected volatile void onProgressUpdate(Object aobj[])
    {
        onProgressUpdate((Integer[])aobj);
    }


/*
    static boolean access$002(GetGeoFencesTask getgeofencestask, boolean flag)
    {
        getgeofencestask.mDownloadComplete = flag;
        return flag;
    }

*/


/*
    static boolean access$102(GetGeoFencesTask getgeofencestask, boolean flag)
    {
        getgeofencestask.mDownloadSuccess = flag;
        return flag;
    }

*/
}
