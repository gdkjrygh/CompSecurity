// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.adobe.mobile:
//            AudienceManagerWorker, MobileConfig, MobilePrivacyStatus, StaticMethods, 
//            RequestHandler

public static class callback
    implements Runnable
{

    public final  callback;
    public final Map data;

    public void run()
    {
        final HashMap callbackData = new HashMap();
        boolean flag = MobileConfig.getInstance().mobileUsingAudienceManager();
        if (flag) goto _L2; else goto _L1
_L1:
        if (callback != null)
        {
            (new Thread(new Runnable() {

                final AudienceManagerWorker.SubmitSignalTask this$0;
                final HashMap val$callbackData;

                public void run()
                {
                    callback.call(callbackData);
                }

            
            {
                this$0 = AudienceManagerWorker.SubmitSignalTask.this;
                callbackData = hashmap;
                super();
            }
            })).start();
        }
_L4:
        return;
_L2:
        if (MobileConfig.getInstance().getPrivacyStatus() != MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_OPT_OUT)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        StaticMethods.logDebugFormat("Audience Manager - Privacy status is set to opt out, no signals will be submitted.", new Object[0]);
        if (callback == null) goto _L4; else goto _L3
_L3:
        (new Thread(new _cls1())).start();
        return;
        Object obj2;
        obj2 = AudienceManagerWorker.access$400(data);
        if (((String) (obj2)).length() > 1)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        StaticMethods.logWarningFormat("Audience Manager - Unable to create URL object", new Object[0]);
        if (callback == null) goto _L4; else goto _L5
_L5:
        (new Thread(new _cls1())).start();
        return;
        Object obj;
        StaticMethods.logDebugFormat("Audience Manager - request (%s)", new Object[] {
            obj2
        });
        obj = new StringBuilder();
        obj2 = (new DefaultHttpClient()).execute(new HttpGet(((String) (obj2))));
        if (((HttpResponse) (obj2)).getStatusLine().getStatusCode() != 200)
        {
            break MISSING_BLOCK_LABEL_302;
        }
        obj2 = new BufferedReader(new InputStreamReader(((HttpResponse) (obj2)).getEntity().getContent(), "UTF-8"));
_L6:
        Object obj3 = ((BufferedReader) (obj2)).readLine();
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        ((StringBuilder) (obj)).append(((String) (obj3)));
          goto _L6
        obj;
        StaticMethods.logWarningFormat("Audience Manager - Unable to read response from server (%s)", new Object[] {
            ((IOException) (obj)).getLocalizedMessage()
        });
        if (callback == null) goto _L4; else goto _L7
_L7:
        (new Thread(new _cls1())).start();
        return;
        ((BufferedReader) (obj2)).close();
        obj = new JSONObject(((StringBuilder) (obj)).toString());
        obj2 = ((JSONObject) (obj)).getJSONArray("dests");
        int i = 0;
_L14:
        if (i >= ((JSONArray) (obj2)).length()) goto _L9; else goto _L8
_L8:
        obj3 = ((JSONArray) (obj2)).getJSONObject(i).getString("c");
        if (obj3 == null) goto _L11; else goto _L10
_L10:
        if (((String) (obj3)).length() > 0)
        {
            RequestHandler.sendGenericRequest(((String) (obj3)), null, 5000, "Audience Manager");
        }
          goto _L11
_L9:
        AudienceManagerWorker.access$500(((JSONObject) (obj)).getString("uuid"));
        obj = ((JSONObject) (obj)).getJSONArray("stuff");
        obj2 = new HashMap();
        i = 0;
_L15:
        if (i >= ((JSONArray) (obj)).length())
        {
            break MISSING_BLOCK_LABEL_444;
        }
        obj3 = ((JSONArray) (obj)).getJSONObject(i);
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_662;
        }
        ((HashMap) (obj2)).put(((JSONObject) (obj3)).getString("cn"), ((JSONObject) (obj3)).getString("cv"));
        break MISSING_BLOCK_LABEL_662;
        if (((HashMap) (obj2)).size() > 0)
        {
            break MISSING_BLOCK_LABEL_487;
        }
        StaticMethods.logWarningFormat("Audience Manager - response was empty", new Object[0]);
        if (callback == null) goto _L4; else goto _L12
_L12:
        (new Thread(new _cls1())).start();
        return;
        StaticMethods.logDebugFormat("Audience Manager - response (%s)", new Object[] {
            obj2
        });
        AudienceManagerWorker.access$600(((Map) (obj2)));
        callbackData.putAll(((Map) (obj2)));
        if (callback != null)
        {
            (new Thread(new _cls1())).start();
            return;
        }
          goto _L4
        Object obj1;
        obj1;
        StaticMethods.logWarningFormat("Audience Manager - Unable to parse JSON data (%s)", new Object[] {
            ((JSONException) (obj1)).getLocalizedMessage()
        });
        if (callback != null)
        {
            (new Thread(new _cls1())).start();
            return;
        }
          goto _L4
        obj1;
        StaticMethods.logWarningFormat("Audience Manager - Unexpected error parsing result (%s)", new Object[] {
            ((Exception) (obj1)).getLocalizedMessage()
        });
        if (callback == null) goto _L4; else goto _L13
_L13:
        (new Thread(new _cls1())).start();
        return;
        obj1;
        if (callback != null)
        {
            (new Thread(new _cls1())).start();
        }
        throw obj1;
_L11:
        i++;
          goto _L14
        i++;
          goto _L15
    }

    public (Map map,  )
    {
        data = map;
        callback = ;
    }
}
