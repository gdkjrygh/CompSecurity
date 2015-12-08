// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.events.EventTransform;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionEvent, SessionEventMetadata

class SessionEventTransform
    implements EventTransform
{

    static final String ADVERTISING_ID_KEY = "advertisingId";
    static final String ANDROID_ID_KEY = "androidId";
    static final String APP_BUNDLE_ID_KEY = "appBundleId";
    static final String APP_VERSION_CODE_KEY = "appVersionCode";
    static final String APP_VERSION_NAME_KEY = "appVersionName";
    static final String BETA_DEVICE_TOKEN_KEY = "betaDeviceToken";
    static final String BUILD_ID_KEY = "buildId";
    static final String DETAILS_KEY = "details";
    static final String DEVICE_MODEL_KEY = "deviceModel";
    static final String EXECUTION_ID_KEY = "executionId";
    static final String INSTALLATION_ID_KEY = "installationId";
    static final String OS_VERSION_KEY = "osVersion";
    static final String TIMESTAMP_KEY = "timestamp";
    static final String TYPE_KEY = "type";

    SessionEventTransform()
    {
    }

    private JSONObject buildDetailsJsonFor(Map map)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); jsonobject.put((String)entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return jsonobject;
    }

    public JSONObject buildJsonForEvent(SessionEvent sessionevent)
        throws IOException
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            SessionEventMetadata sessioneventmetadata = sessionevent.sessionEventMetadata;
            jsonobject.put("appBundleId", sessioneventmetadata.appBundleId);
            jsonobject.put("executionId", sessioneventmetadata.executionId);
            jsonobject.put("installationId", sessioneventmetadata.installationId);
            jsonobject.put("androidId", sessioneventmetadata.androidId);
            jsonobject.put("advertisingId", sessioneventmetadata.advertisingId);
            jsonobject.put("betaDeviceToken", sessioneventmetadata.betaDeviceToken);
            jsonobject.put("buildId", sessioneventmetadata.buildId);
            jsonobject.put("osVersion", sessioneventmetadata.osVersion);
            jsonobject.put("deviceModel", sessioneventmetadata.deviceModel);
            jsonobject.put("appVersionCode", sessioneventmetadata.appVersionCode);
            jsonobject.put("appVersionName", sessioneventmetadata.appVersionName);
            jsonobject.put("timestamp", sessionevent.timestamp);
            jsonobject.put("type", sessionevent.type.toString());
            jsonobject.put("details", buildDetailsJsonFor(sessionevent.details));
        }
        // Misplaced declaration of an exception variable
        catch (SessionEvent sessionevent)
        {
            if (android.os.Build.VERSION.SDK_INT >= 9)
            {
                throw new IOException(sessionevent.getMessage(), sessionevent);
            } else
            {
                throw new IOException(sessionevent.getMessage());
            }
        }
        return jsonobject;
    }

    public SessionEvent fromBytes(byte abyte0[])
        throws IOException
    {
        return null;
    }

    public byte[] toBytes(SessionEvent sessionevent)
        throws IOException
    {
        return buildJsonForEvent(sessionevent).toString().getBytes("UTF-8");
    }

    public volatile byte[] toBytes(Object obj)
        throws IOException
    {
        return toBytes((SessionEvent)obj);
    }
}
