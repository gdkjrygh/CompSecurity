// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.pinterest.analytics.PerfBatcher;
import com.pinterest.api.ApiHttpClient;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.RequestParams;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.Pin;
import com.pinterest.fantasio.thrift.ReasonToChoose;
import com.pinterest.gcm.GcmRegistrar;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.utils.NetworkUtils;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.reporting.CrashReporting;
import com.pinterest.schemas.event.PinViewType;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.pinterest.api.remote:
//            BaseApi

public class AnalyticsApi
{

    public static void a(JsonArray jsonarray)
    {
        JsonObject jsonobject = new JsonObject();
        jsonobject.add("events", jsonarray);
        ApiHttpClient.signedCall(ApiHttpClient.getAbsoluteLoggingApiUrlV4("log/mobile_perf/"), null, "POST", null, new _cls1(), false, null, jsonobject);
    }

    public static void a(BaseApiResponseHandler baseapiresponsehandler)
    {
        if (MyUser.hasAccessToken())
        {
            ApiHttpClient.get(ApiHttpClient.getAbsoluteLoggingApiUrl("callback/ping/"), baseapiresponsehandler, false, null);
        }
    }

    public static void a(String s)
    {
        try
        {
            ApiHttpClient.signedCall(ApiHttpClient.getAbsoluteLoggingApiUrl(String.format("register/track_action/%s/", new Object[] {
                s
            })), null, "POST", new TreeMap(), null, false, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            PLog.error(s, "exception occurred", new Object[0]);
        }
    }

    public static void a(String s, long l, boolean flag, String s1)
    {
        DeviceRequestParams devicerequestparams = new DeviceRequestParams();
        devicerequestparams.a("timing", String.valueOf(l));
        devicerequestparams.a("cached", String.valueOf(flag));
        if (s1 != null)
        {
            devicerequestparams.a("aux", s1);
        }
        devicerequestparams.a("carrier", NetworkUtils.getInstance().getCarrierName());
        s = String.format("/v3/log/performance/%s/", new Object[] {
            s
        });
        PerfBatcher.a().a(s, devicerequestparams);
    }

    public static void a(String s, Bundle bundle)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("device_id", GcmRegistrar.b());
        if (bundle != null)
        {
            requestparams.a("push_id", bundle.getString("push_id"));
            requestparams.a("body", bundle.getString("payload"));
            requestparams.a("link", bundle.getString("link"));
        }
        ApiHttpClient.post(ApiHttpClient.getAbsoluteLoggingApiUrl(String.format("callback/push_notification/%s/", new Object[] {
            s
        })), requestparams, null, false, null);
    }

    public static void a(String s, String s1, Bitmap bitmap, boolean flag, BaseApiResponseHandler baseapiresponsehandler)
    {
        RequestParams requestparams;
        requestparams = new RequestParams();
        requestparams.a("title", s);
        requestparams.a("description", s1);
        requestparams.a("platform", "android");
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        s = new ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 90, s);
        requestparams.a("image", new ByteArrayInputStream(s.toByteArray()), "screenshot.jpg", "image/jpeg");
        if (flag)
        {
            try
            {
                requestparams.a("logs", Runtime.getRuntime().exec("logcat -d").getInputStream(), "logs.txt", "text/plain");
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        ApiHttpClient.post(ApiHttpClient.getAbsoluteLoggingApiUrl("error/report/"), requestparams, baseapiresponsehandler, false, null);
        return;
    }

    public static void a(List list, List list1, PinViewType pinviewtype, String s, String s1, BaseApiResponseHandler baseapiresponsehandler)
    {
        if (list.size() != list1.size() || pinviewtype == null || s1 == null)
        {
            return;
        }
        HashMap hashmap = new HashMap();
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        for (int i = 0; i < list.size(); i++)
        {
            Object obj = (Pin)list.get(i);
            if (obj != null)
            {
                arraylist.add(new String[] {
                    ((Pin) (obj)).getCacheableId(), ((Pin) (obj)).getUserUid()
                });
                obj = new HashMap();
                ((Map) (obj)).put("r", Integer.valueOf(((ReasonToChoose)list1.get(i)).getValue()));
                arraylist1.add(obj);
            }
        }

        hashmap.put("pin_ids", arraylist);
        hashmap.put("reasons", arraylist1);
        hashmap.put("type", Integer.valueOf(pinviewtype.getValue()));
        hashmap.put("through_id", s1);
        if (s != null)
        {
            hashmap.put("story_id", s);
        }
        list = new PinterestJsonObject(hashmap);
        list1 = new RequestParams();
        list1.a("event", list.toString());
        BaseApi.c("callback/dynamic_grid/insertion/", list1, baseapiresponsehandler, null);
    }

    public static void a(Map map, BaseApiResponseHandler baseapiresponsehandler)
    {
        try
        {
            ApiHttpClient.signedCall(ApiHttpClient.getAbsoluteLoggingApiUrl("callback/post_install/"), null, "POST", map, baseapiresponsehandler, false, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            CrashReporting.a(map);
        }
        PLog.error(map, "exception occurred", new Object[0]);
    }

    public static void a(byte abyte0[], BaseApiResponseHandler baseapiresponsehandler)
    {
        try
        {
            String s = ApiHttpClient.getAbsoluteLoggingApiUrl("callback/event/");
            RequestParams requestparams = new RequestParams();
            requestparams.a("event_batch", new ByteArrayInputStream(abyte0), null, "application/x-thrift");
            ApiHttpClient.signedCall(s, null, "POST", null, baseapiresponsehandler, false, null, null, requestparams);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            PLog.error(abyte0, "exception occurred", new Object[0]);
        }
    }

    public static void b(String s)
    {
        ApiHttpClient.post(ApiHttpClient.getAbsoluteLoggingApiUrl(String.format("callback/track_funnel/%s/", new Object[] {
            s
        })), null, false, null);
    }

    public static void c(String s)
    {
        a(String.format("%s%s", new Object[] {
            "pv_ph_", s
        }));
    }

    private class _cls1 extends BaseApiResponseHandler
    {

        public final void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            PLog.log("Submitting: FAILED mobile_perf %s", apiresponse.getMessageDisplay(), new Object[0]);
        }

        public final void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            PLog.log("Submitting: Success mobile_perf", new Object[0]);
        }

        _cls1()
        {
        }
    }


    private class DeviceRequestParams extends RequestParams
    {

        public DeviceRequestParams()
        {
            a("app", String.valueOf(Device.getAppTypeInt()));
            a("app_version", ApplicationInfo.getVersionName());
            a("carrier", NetworkUtils.getInstance().getCarrierName());
            a("device_type", String.format("%s; %s", new Object[] {
                Build.DEVICE, android.os.Build.VERSION.RELEASE
            }));
        }
    }

}
