// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.events.EventTransform;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionEvent, SessionEventMetadata

class SessionEventTransform
    implements EventTransform
{

    SessionEventTransform()
    {
    }

    public byte[] a(SessionEvent sessionevent)
    {
        return b(sessionevent).toString().getBytes("UTF-8");
    }

    public volatile byte[] a(Object obj)
    {
        return a((SessionEvent)obj);
    }

    public JSONObject b(SessionEvent sessionevent)
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            SessionEventMetadata sessioneventmetadata = sessionevent.a;
            jsonobject.put("appBundleId", sessioneventmetadata.a);
            jsonobject.put("executionId", sessioneventmetadata.b);
            jsonobject.put("installationId", sessioneventmetadata.c);
            jsonobject.put("androidId", sessioneventmetadata.d);
            jsonobject.put("advertisingId", sessioneventmetadata.e);
            jsonobject.put("betaDeviceToken", sessioneventmetadata.f);
            jsonobject.put("buildId", sessioneventmetadata.g);
            jsonobject.put("osVersion", sessioneventmetadata.h);
            jsonobject.put("deviceModel", sessioneventmetadata.i);
            jsonobject.put("appVersionCode", sessioneventmetadata.j);
            jsonobject.put("appVersionName", sessioneventmetadata.k);
            jsonobject.put("timestamp", sessionevent.b);
            jsonobject.put("type", sessionevent.c.toString());
            jsonobject.put("details", new JSONObject(sessionevent.d));
            jsonobject.put("customType", sessionevent.e);
            jsonobject.put("customAttributes", new JSONObject(sessionevent.f));
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
}
