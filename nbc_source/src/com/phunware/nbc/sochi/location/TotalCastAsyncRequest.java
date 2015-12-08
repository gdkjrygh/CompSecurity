// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.location;

import com.phunware.nbc.sochi.content.GeoRequestResponse;
import com.phunware.nbc.sochi.system.NBCSystem;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import timber.log.Timber;

// Referenced classes of package com.phunware.nbc.sochi.location:
//            TotalCastResponseListener

public class TotalCastAsyncRequest
{
    public class OnTotalCastResponse
        implements TotalCastResponseListener
    {

        final TotalCastAsyncRequest this$0;

        public void onResponse(GeoRequestResponse georequestresponse)
        {
        }

        public OnTotalCastResponse()
        {
            this$0 = TotalCastAsyncRequest.this;
            super();
        }
    }


    public static final String TOTAL_CAST_APPKEY = "53cffe0151901e90d46378bc";
    public static final String TOTAL_CAST_ENDPOINT = "https://geoapi.totalcast.tv/v1/geo/within/zip/";
    public static final MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
    private String LOG_TAG;
    private double mLatitude;
    private TotalCastResponseListener mListener;
    private double mLongitude;

    public TotalCastAsyncRequest()
    {
        LOG_TAG = "TotalCastAsyncRequest";
        mLatitude = 0.0D;
        mLongitude = 0.0D;
    }

    private GeoRequestResponse getGeoResponse(String s)
    {
        GeoRequestResponse georequestresponse = new GeoRequestResponse(s);
        if (s != null) goto _L2; else goto _L1
_L1:
        georequestresponse.isError = true;
_L4:
        return georequestresponse;
_L2:
        if (s.contains("Error") || s.contains("error"))
        {
            georequestresponse.isError = true;
            return georequestresponse;
        }
        try
        {
            s = new JSONObject(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            NBCSystem.debugLog(LOG_TAG, s.toString());
            georequestresponse.isError = true;
            return georequestresponse;
        }
        if (s == null) goto _L4; else goto _L3
_L3:
        if (s.has("postal_code"))
        {
            georequestresponse.ZipCode = s.getString("postal_code");
        }
        if (!s.has("nielsen_dma_id")) goto _L4; else goto _L5
_L5:
        georequestresponse.NielsonDMA = s.get("nielsen_dma_id").toString();
        return georequestresponse;
    }

    private void postGeoRequest()
    {
        this;
        JVM INSTR monitorenter ;
        OkHttpClient okhttpclient = new OkHttpClient();
        okhttpclient.setConnectTimeout(2L, TimeUnit.MINUTES);
        String s = (new StringBuilder()).append("latitude=").append(mLatitude).toString();
        Object obj1 = (new StringBuilder()).append("&longitude=").append(mLongitude).toString();
        s = (new StringBuilder()).append(s).append(((String) (obj1))).append("&application_key=53cffe0151901e90d46378bc").toString();
        obj1 = new URL("https://geoapi.totalcast.tv/v1/geo/within/zip/");
        RequestBody requestbody = RequestBody.create(mediaType, s);
        obj1 = (new com.squareup.okhttp.Request.Builder()).url(((URL) (obj1))).post(requestbody).build();
        Timber.d((new StringBuilder()).append(" params: ").append(s).toString(), new Object[0]);
        okhttpclient.newCall(((Request) (obj1))).enqueue(new Callback() {

            final TotalCastAsyncRequest this$0;

            public void onFailure(Request request, IOException ioexception)
            {
                mListener.onResponse(new GeoRequestResponse(null));
                Timber.d(ioexception, ioexception.getMessage(), new Object[0]);
            }

            public void onResponse(Response response)
                throws IOException
            {
                response = response.body().string();
                response = getGeoResponse(response);
                if (mListener != null)
                {
                    mListener.onResponse(response);
                }
                NBCSystem.debugLog("TotalCastAsyncRequest", (new StringBuilder()).append("Response: ").append(((GeoRequestResponse) (response)).ZipCode).append(" ").append(((GeoRequestResponse) (response)).NielsonDMA).toString());
            }

            
            {
                this$0 = TotalCastAsyncRequest.this;
                super();
            }
        });
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        mListener.onResponse(new GeoRequestResponse(null));
        Timber.d(((Throwable) (obj)), ((Exception) (obj)).getMessage(), new Object[0]);
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
    }

    public void addTotalCastResponseListener(TotalCastResponseListener totalcastresponselistener)
    {
        if (totalcastresponselistener != null)
        {
            mListener = totalcastresponselistener;
        }
    }

    public void execute()
    {
        postGeoRequest();
    }

    public void setRequest(double d, double d1)
    {
        mLatitude = d;
        mLongitude = d1;
    }



}
