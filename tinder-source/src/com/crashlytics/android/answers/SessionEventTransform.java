// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.b.c;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionEvent, SessionEventMetadata

class SessionEventTransform
    implements c
{

    SessionEventTransform()
    {
    }

    private static JSONObject a(SessionEvent sessionevent)
        throws IOException
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
            jsonobject.put("limitAdTrackingEnabled", sessioneventmetadata.f);
            jsonobject.put("betaDeviceToken", sessioneventmetadata.g);
            jsonobject.put("buildId", sessioneventmetadata.h);
            jsonobject.put("osVersion", sessioneventmetadata.i);
            jsonobject.put("deviceModel", sessioneventmetadata.j);
            jsonobject.put("appVersionCode", sessioneventmetadata.k);
            jsonobject.put("appVersionName", sessioneventmetadata.l);
            jsonobject.put("timestamp", sessionevent.b);
            jsonobject.put("type", sessionevent.c.toString());
            jsonobject.put("details", new JSONObject(sessionevent.d));
            jsonobject.put("customType", sessionevent.e);
            jsonobject.put("customAttributes", new JSONObject(sessionevent.f));
            jsonobject.put("predefinedType", sessionevent.g);
            jsonobject.put("predefinedAttributes", new JSONObject(sessionevent.h));
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

    public final byte[] a(Object obj)
        throws IOException
    {
        return a((SessionEvent)obj).toString().getBytes("UTF-8");
    }
}
