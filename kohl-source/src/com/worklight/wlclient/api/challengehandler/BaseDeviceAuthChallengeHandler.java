// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api.challengehandler;

import android.os.Build;
import com.worklight.common.WLConfig;
import com.worklight.common.security.WLDeviceAuthManager;
import com.worklight.wlclient.api.WLClient;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.wlclient.api.challengehandler:
//            WLChallengeHandler

public abstract class BaseDeviceAuthChallengeHandler extends WLChallengeHandler
{

    public BaseDeviceAuthChallengeHandler(String s)
    {
        super(s);
    }

    protected void getDeviceAuthDataAsync(String s)
        throws Exception, JSONException
    {
        JSONObject jsonobject = new JSONObject();
        JSONObject jsonobject1 = new JSONObject();
        JSONObject jsonobject2 = new JSONObject();
        WLClient wlclient = WLClient.getInstance();
        jsonobject1.put("id", WLConfig.getInstance().getAppId());
        jsonobject1.put("version", WLConfig.getInstance().getApplicationVersion());
        jsonobject2.put("id", WLDeviceAuthManager.getInstance().getDeviceUUID(wlclient.getContext()));
        jsonobject2.put("os", android.os.Build.VERSION.RELEASE);
        jsonobject2.put("model", Build.MODEL);
        jsonobject2.put("environment", "Android");
        jsonobject.put("app", jsonobject1);
        jsonobject.put("device", jsonobject2);
        jsonobject.put("token", s);
        onDeviceAuthDataReady(jsonobject);
    }

    protected abstract void onDeviceAuthDataReady(JSONObject jsonobject)
        throws JSONException;
}
