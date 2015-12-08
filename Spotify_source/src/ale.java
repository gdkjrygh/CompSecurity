// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.crashlytics.android.answers.SessionEvent;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

final class ale
    implements haj
{

    ale()
    {
    }

    private static JSONObject a(SessionEvent sessionevent)
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            ald ald1 = sessionevent.a;
            jsonobject.put("appBundleId", ald1.a);
            jsonobject.put("executionId", ald1.b);
            jsonobject.put("installationId", ald1.c);
            jsonobject.put("androidId", ald1.d);
            jsonobject.put("advertisingId", ald1.e);
            jsonobject.put("limitAdTrackingEnabled", ald1.f);
            jsonobject.put("betaDeviceToken", ald1.g);
            jsonobject.put("buildId", ald1.h);
            jsonobject.put("osVersion", ald1.i);
            jsonobject.put("deviceModel", ald1.j);
            jsonobject.put("appVersionCode", ald1.k);
            jsonobject.put("appVersionName", ald1.l);
            jsonobject.put("timestamp", sessionevent.b);
            jsonobject.put("type", sessionevent.c.toString());
            jsonobject.put("details", new JSONObject(sessionevent.d));
            jsonobject.put("customType", null);
            jsonobject.put("customAttributes", new JSONObject(sessionevent.e));
            jsonobject.put("predefinedType", null);
            jsonobject.put("predefinedAttributes", new JSONObject(sessionevent.f));
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
    {
        return a((SessionEvent)obj).toString().getBytes("UTF-8");
    }
}
