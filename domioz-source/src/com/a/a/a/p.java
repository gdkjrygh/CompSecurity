// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import b.a.a.a.a.d.c;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.a.a.a:
//            m, o, n

final class p
    implements c
{

    p()
    {
    }

    private static JSONObject a(m m1)
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            o o1 = m1.a;
            jsonobject.put("appBundleId", o1.a);
            jsonobject.put("executionId", o1.b);
            jsonobject.put("installationId", o1.c);
            jsonobject.put("androidId", o1.d);
            jsonobject.put("advertisingId", o1.e);
            jsonobject.put("betaDeviceToken", o1.f);
            jsonobject.put("buildId", o1.g);
            jsonobject.put("osVersion", o1.h);
            jsonobject.put("deviceModel", o1.i);
            jsonobject.put("appVersionCode", o1.j);
            jsonobject.put("appVersionName", o1.k);
            jsonobject.put("timestamp", m1.b);
            jsonobject.put("type", m1.c.toString());
            jsonobject.put("details", new JSONObject(m1.d));
            jsonobject.put("customType", m1.e);
            jsonobject.put("customAttributes", new JSONObject(m1.f));
        }
        // Misplaced declaration of an exception variable
        catch (m m1)
        {
            if (android.os.Build.VERSION.SDK_INT >= 9)
            {
                throw new IOException(m1.getMessage(), m1);
            } else
            {
                throw new IOException(m1.getMessage());
            }
        }
        return jsonobject;
    }

    public final byte[] a(Object obj)
    {
        return a((m)obj).toString().getBytes("UTF-8");
    }
}
