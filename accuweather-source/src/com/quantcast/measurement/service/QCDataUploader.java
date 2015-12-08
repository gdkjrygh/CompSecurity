// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.quantcast.measurement.service;

import java.util.Collection;
import java.util.Iterator;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.quantcast.measurement.service:
//            QCUtility, QCEvent, QCLog, QCMeasurement

class QCDataUploader
{

    static final String QC_EVENTS_KEY = "events";
    static final String QC_QCV_KEY = "qcv";
    static final String QC_UPLOAD_ID_KEY = "uplid";
    private static final QCLog.Tag TAG = new QCLog.Tag(com/quantcast/measurement/service/QCDataUploader);
    private static final String UPLOAD_URL_WITHOUT_SCHEME = "m.quantcount.com/mobile";

    QCDataUploader()
    {
    }

    private boolean isSuccessful(int i)
    {
        return i >= 200 && i <= 299;
    }

    String synchronousUploadEvents(Collection collection)
    {
        if (collection != null && !collection.isEmpty()) goto _L2; else goto _L1
_L1:
        collection = null;
_L4:
        return collection;
_L2:
        String s;
        Object obj;
        JSONArray jsonarray;
        s = QCUtility.generateUniqueId();
        obj = new JSONObject();
        try
        {
            ((JSONObject) (obj)).put("uplid", s);
            ((JSONObject) (obj)).put("qcv", "1_2_1");
            jsonarray = new JSONArray();
            for (collection = collection.iterator(); collection.hasNext(); jsonarray.put(new JSONObject(((QCEvent)collection.next()).getParameters()))) { }
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            QCLog.e(TAG, "Error while encoding json.");
            return null;
        }
        ((JSONObject) (obj)).put("events", jsonarray);
        Object obj1 = QCUtility.addScheme("m.quantcount.com/mobile");
        collection = new DefaultHttpClient();
        collection.getParams().setParameter("http.useragent", System.getProperty("http.agent"));
        BasicHttpContext basichttpcontext = new BasicHttpContext();
        int i;
        try
        {
            obj1 = new HttpPost(((String) (obj1)));
            ((HttpPost) (obj1)).setHeader("Content-Type", "application/json");
            ((HttpPost) (obj1)).setEntity(new StringEntity(((JSONObject) (obj)).toString(), "ASCII"));
            obj = new BasicHttpParams();
            ((HttpParams) (obj)).setBooleanParameter("http.protocol.expect-continue", false);
            ((HttpPost) (obj1)).setParams(((HttpParams) (obj)));
            i = collection.execute(((org.apache.http.client.methods.HttpUriRequest) (obj1)), basichttpcontext).getStatusLine().getStatusCode();
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            QCLog.e(TAG, "Could not upload events", collection);
            QCMeasurement.INSTANCE.logSDKError("json-upload-failure", collection.toString(), null);
            i = 408;
        }
        collection = s;
        if (!isSuccessful(i))
        {
            QCLog.e(TAG, (new StringBuilder()).append("Events not sent to server. Response code: ").append(i).toString());
            QCMeasurement.INSTANCE.logSDKError("json-upload-failure", (new StringBuilder()).append("Bad response from server. Response code: ").append(i).toString(), null);
            return null;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
