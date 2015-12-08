// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;

import android.content.Context;
import android.os.Build;
import com.worklight.common.Logger;
import com.worklight.common.WLConfig;
import com.worklight.common.internal.LoggerServerConfigProcessor;
import com.worklight.common.security.WLDeviceAuthManager;
import com.worklight.wlclient.api.WLFailResponse;
import com.worklight.wlclient.api.WLRequestOptions;
import com.worklight.wlclient.api.WLResponse;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.wlclient:
//            WLRequestPiggybacker

public class ConfigProfileRequestPiggybacker
    implements WLRequestPiggybacker
{

    private static final String HEADER_APP_NAME = "appname";
    private static final String HEADER_APP_VERSION = "appversion";
    private static final String HEADER_DEVICE_ID = "deviceId";
    private static final String HEADER_ENVIRONMENT = "env";
    private static final String HEADER_MODEL = "model";
    private static final String HEADER_OS_VERSION = "osversion";
    private static final String HEADER_PREFIX = "x-wl-clientlog-";
    private static final String LOG_TAG = com/worklight/wlclient/ConfigProfileRequestPiggybacker.getName();
    private static Context context;

    public ConfigProfileRequestPiggybacker(Context context1)
    {
        context = context1;
    }

    public void onFailure(WLFailResponse wlfailresponse)
    {
    }

    public void onSuccess(WLResponse wlresponse)
    {
        JSONObject jsonobject;
        jsonobject = wlresponse.getResponseJSON();
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        if (!jsonobject.has("piggyback"))
        {
            break MISSING_BLOCK_LABEL_164;
        }
        JSONObject jsonobject1;
        JSONObject jsonobject2;
        boolean flag;
        jsonobject1 = jsonobject.getJSONObject("piggyback");
        if (!jsonobject1.has("configprofile"))
        {
            break MISSING_BLOCK_LABEL_155;
        }
        jsonobject2 = jsonobject1.getJSONObject("configprofile");
        flag = jsonobject2.has("wllogger");
        if (!flag) goto _L2; else goto _L1
_L1:
        LoggerServerConfigProcessor.processLoggerServerConfig(jsonobject2.getJSONObject("wllogger"), context);
_L3:
        JSONException jsonexception;
        try
        {
            jsonobject.remove("piggyback");
            wlresponse.setResponseText((new StringBuilder()).append("/*-secure-").append(jsonobject.toString()).append("*/").toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (WLResponse wlresponse)
        {
            return;
        }
        jsonexception;
        Logger.getInstance(LOG_TAG).error((new StringBuilder()).append("Failed to parse response from server.  Piggybacked payload: ").append(jsonobject1.toString()).toString(), jsonexception);
          goto _L3
_L2:
        LoggerServerConfigProcessor.removeServerLoggerConfigOverrides(context);
          goto _L3
        LoggerServerConfigProcessor.removeServerLoggerConfigOverrides(context);
          goto _L3
        if (wlresponse.getResponseText().startsWith("/"))
        {
            LoggerServerConfigProcessor.removeServerLoggerConfigOverrides(context);
        }
    }

    public void processOptions(String s, WLRequestOptions wlrequestoptions)
    {
        if (!s.endsWith("apps/services/configprofile") && !s.endsWith("apps/services/loguploader") && !s.endsWith("init") && !s.endsWith("invoke") && !s.endsWith("query")) goto _L2; else goto _L1
_L1:
        s = "UNKNOWN";
        String s1 = WLDeviceAuthManager.getInstance().getDeviceUUID(context);
        s = s1;
_L4:
        wlrequestoptions.addHeader("x-wl-clientlog-deviceId", s);
        wlrequestoptions.addHeader("x-wl-clientlog-appname", WLConfig.getInstance().getAppId());
        wlrequestoptions.addHeader("x-wl-clientlog-appversion", WLConfig.getInstance().getApplicationVersion());
        wlrequestoptions.addHeader("x-wl-clientlog-osversion", android.os.Build.VERSION.RELEASE);
        wlrequestoptions.addHeader("x-wl-clientlog-env", "Android");
        wlrequestoptions.addHeader("x-wl-clientlog-model", Build.MODEL);
_L2:
        return;
        Exception exception;
        exception;
        Logger.getInstance(LOG_TAG).error("Could not get device id from WLDeviceAuthManager.", exception);
        if (true) goto _L4; else goto _L3
_L3:
    }

}
