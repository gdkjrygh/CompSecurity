// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import b.a.a.a.a.d.c;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.a.a.a:
//            B, C

final class D
    implements c
{

    D()
    {
    }

    private static JSONObject a(B b)
        throws IOException
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            C c1 = b.a;
            jsonobject.put("appBundleId", c1.a);
            jsonobject.put("executionId", c1.b);
            jsonobject.put("installationId", c1.c);
            jsonobject.put("androidId", c1.d);
            jsonobject.put("advertisingId", c1.e);
            jsonobject.put("limitAdTrackingEnabled", c1.f);
            jsonobject.put("betaDeviceToken", c1.g);
            jsonobject.put("buildId", c1.h);
            jsonobject.put("osVersion", c1.i);
            jsonobject.put("deviceModel", c1.j);
            jsonobject.put("appVersionCode", c1.k);
            jsonobject.put("appVersionName", c1.l);
            jsonobject.put("timestamp", b.b);
            jsonobject.put("type", b.c.toString());
            jsonobject.put("details", new JSONObject(b.d));
            jsonobject.put("customType", b.e);
            jsonobject.put("customAttributes", new JSONObject(b.f));
            jsonobject.put("predefinedType", b.g);
            jsonobject.put("predefinedAttributes", new JSONObject(b.h));
        }
        // Misplaced declaration of an exception variable
        catch (B b)
        {
            if (android.os.Build.VERSION.SDK_INT >= 9)
            {
                throw new IOException(b.getMessage(), b);
            } else
            {
                throw new IOException(b.getMessage());
            }
        }
        return jsonobject;
    }

    public final byte[] a(Object obj)
        throws IOException
    {
        return a((B)obj).toString().getBytes("UTF-8");
    }
}
