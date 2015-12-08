// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model.realtime;

import RaptureXML.RXMLElement;
import android.content.Context;
import android.util.Log;
import com.crashlytics.android.Crashlytics;
import com.thetransitapp.droid.model.viewmodel.MergedItinerary;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.thetransitapp.droid.model.realtime:
//            XMLRealTimeDataSource, RealTimeFetchTask

public class OCTRealTimeDataSource extends XMLRealTimeDataSource
    implements Serializable
{

    private static final long serialVersionUID = 1L;

    public OCTRealTimeDataSource()
    {
    }

    protected void fetchPredictionForURL(Context context, String s, MergedItinerary mergeditinerary, BaseRealTimeDataSource.RealTimeCallback realtimecallback)
    {
        mergeditinerary.setPredictionsFetchDate(new Date());
        s = new HttpPost(s);
        try
        {
            ArrayList arraylist = new ArrayList(4);
            arraylist.add(new BasicNameValuePair("appID", "2229ac35"));
            arraylist.add(new BasicNameValuePair("apiKey", "13e1d761176e8be185b62c362d9376c3"));
            arraylist.add(new BasicNameValuePair("routeNo", mergeditinerary.getRealTimeRouteId()));
            arraylist.add(new BasicNameValuePair("stopNo", mergeditinerary.getRealTimeStopId()));
            s.setEntity(new UrlEncodedFormEntity(arraylist));
            s.setHeader("Content-Type", "application/x-www-form-urlencoded");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            Log.e(com/thetransitapp/droid/model/realtime/OCTRealTimeDataSource.getSimpleName(), unsupportedencodingexception.getMessage(), unsupportedencodingexception);
            Crashlytics.logException(unsupportedencodingexception);
        }
        (new RealTimeFetchTask(context, s, this, mergeditinerary, realtimecallback)).execute();
    }

    protected List processScheduleResponse(Object obj, MergedItinerary mergeditinerary)
    {
        obj = ((RXMLElement)obj).childrenWithRootXPath("//*[local-name() = 'Route']");
        if (((ArrayList) (obj)).size() > 0)
        {
            return super.processScheduleResponse(((ArrayList) (obj)).get(0), mergeditinerary);
        } else
        {
            return new ArrayList();
        }
    }
}
