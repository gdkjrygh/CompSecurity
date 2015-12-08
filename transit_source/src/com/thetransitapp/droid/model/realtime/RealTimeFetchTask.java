// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model.realtime;

import android.content.Context;
import android.net.http.AndroidHttpClient;
import android.util.Log;
import com.crashlytics.android.Crashlytics;
import com.thetransitapp.droid.model.viewmodel.MergedItinerary;
import com.thetransitapp.droid.service.BaseServiceTask;
import java.io.InputStream;
import java.net.URI;
import java.util.List;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpRequestBase;

// Referenced classes of package com.thetransitapp.droid.model.realtime:
//            BaseRealTimeDataSource

public class RealTimeFetchTask extends BaseServiceTask
{

    private BaseRealTimeDataSource.RealTimeCallback callback;
    private BaseRealTimeDataSource dataSource;
    private MergedItinerary itinerary;
    private HttpRequestBase request;
    private List result;

    public RealTimeFetchTask(Context context, HttpRequestBase httprequestbase, BaseRealTimeDataSource baserealtimedatasource, MergedItinerary mergeditinerary, BaseRealTimeDataSource.RealTimeCallback realtimecallback)
    {
        super(context);
        itinerary = mergeditinerary;
        callback = realtimecallback;
        dataSource = baserealtimedatasource;
        request = httprequestbase;
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public List call()
        throws Exception
    {
        AndroidHttpClient androidhttpclient;
        Object obj;
        Log.d("Calling URL", request.getURI().toString());
        androidhttpclient = AndroidHttpClient.newInstance(null);
        obj = request;
        AndroidHttpClient.modifyRequestToAcceptGzipResponse(((org.apache.http.HttpRequest) (obj)));
        obj = androidhttpclient.execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
        if (((HttpResponse) (obj)).getStatusLine().getStatusCode() >= 300)
        {
            throw new HttpException(((HttpResponse) (obj)).getStatusLine().getReasonPhrase());
        }
          goto _L1
        obj;
        if (androidhttpclient != null)
        {
            androidhttpclient.close();
        }
        if (!(obj instanceof HttpException))
        {
            Log.e(com/thetransitapp/droid/model/realtime/RealTimeFetchTask.getSimpleName(), ((Exception) (obj)).getMessage(), ((Throwable) (obj)));
            Crashlytics.logException(((Throwable) (obj)));
        }
_L3:
        return null;
_L1:
        obj = ((HttpResponse) (obj)).getEntity();
        if (obj == null) goto _L3; else goto _L2
_L2:
        obj = AndroidHttpClient.getUngzippedContent(((org.apache.http.HttpEntity) (obj)));
        Object obj1 = dataSource.parseStream(((InputStream) (obj)));
        ((InputStream) (obj)).close();
        androidhttpclient.close();
        result = dataSource.processScheduleResponse(obj1, itinerary);
        obj = result;
        return ((List) (obj));
    }

    protected void onFinally()
    {
        if (result != null)
        {
            dataSource.assignPredictionsWithScheduleItems(result, itinerary);
        }
        if (callback != null)
        {
            callback.didAssignRealTime();
        }
    }
}
