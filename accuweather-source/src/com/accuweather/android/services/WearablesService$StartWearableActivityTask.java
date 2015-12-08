// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.utilities.SystemClock;
import com.accuweather.android.utilities.WeatherDataUtility;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataMap;
import com.google.android.gms.wearable.PutDataMapRequest;
import com.google.android.gms.wearable.Wearable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.accuweather.android.services:
//            WearablesService

private class <init> extends AsyncTask
{

    final WearablesService this$0;
    WeatherDataModel wdm;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Void doInBackground(Void avoid[])
    {
        Object obj;
        avoid = new SystemClock();
        if (wdm == null || !WeatherDataUtility.isWeatherModelValid(wdm) || wdm.areAnySubModelsExpired(avoid))
        {
            break MISSING_BLOCK_LABEL_270;
        }
        obj = onGenerateJsonData(wdm);
        if (obj == null || ((Map) (obj)).size() <= 0)
        {
            break MISSING_BLOCK_LABEL_270;
        }
        avoid = ((Void []) (WearablesService.access$100()));
        avoid;
        JVM INSTR monitorenter ;
        PutDataMapRequest putdatamaprequest;
        cancelAlarm(WearablesService.this);
        if (!WearablesService.access$200(WearablesService.this).isConnected())
        {
            break MISSING_BLOCK_LABEL_259;
        }
        putdatamaprequest = PutDataMapRequest.create("/");
        String s;
        for (Iterator iterator = ((Map) (obj)).keySet().iterator(); iterator.hasNext(); sendDataToWearable(putdatamaprequest, s, (String)((Map) (obj)).get(s)))
        {
            s = (String)iterator.next();
        }

        break MISSING_BLOCK_LABEL_160;
        Exception exception;
        exception;
        avoid;
        JVM INSTR monitorexit ;
        throw exception;
        exception = putdatamaprequest.asPutDataRequest();
        exception = (com.google.android.gms.wearable..sendDataToWearable)Wearable.DataApi.putDataItem(WearablesService.access$200(WearablesService.this), exception).await();
        if (!exception._mth0().isSuccess()) goto _L2; else goto _L1
_L1:
        Log.d("WearablesService", "sendDataToWearable: putDataItem success");
_L3:
        startRepeatingAlarm(WearablesService.this);
        avoid;
        JVM INSTR monitorexit ;
        break MISSING_BLOCK_LABEL_270;
_L2:
        Log.e("WearablesService", (new StringBuilder()).append("sendDataToWearable ERROR: failed to putDataItem: ").append(exception._mth0()).toString());
          goto _L3
        Log.d("WearablesService", "sendDataToWearable: not connected");
          goto _L3
        return null;
    }

    public void sendDataToWearable(PutDataMapRequest putdatamaprequest, String s, String s1)
    {
        if (s1 != null && s != null)
        {
            Log.d("WearablesService", (new StringBuilder()).append("sendDataToWearable: uri: ").append(putdatamaprequest.getUri().toString()).append(", json: ").append(s1).toString());
            putdatamaprequest.getDataMap().putString(s, s1);
        } else
        {
            Log.e("WearablesService", "sendDataToWearable ERROR: send data null");
        }
        (new t>(WearablesService.this, "/is-paid-value", String.valueOf(false))).t();
    }

    public void setWeatherData(WeatherDataModel weatherdatamodel)
    {
        wdm = weatherdatamodel;
    }

    private Q()
    {
        this$0 = WearablesService.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
