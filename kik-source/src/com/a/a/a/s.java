// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import b.a.a.a.a.d.c;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.a.a.a:
//            q, r

final class s
    implements c
{

    s()
    {
    }

    private static JSONObject a(q q1)
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            r r1 = q1.a;
            jsonobject.put("appBundleId", r1.a);
            jsonobject.put("executionId", r1.b);
            jsonobject.put("installationId", r1.c);
            jsonobject.put("androidId", r1.d);
            jsonobject.put("advertisingId", r1.e);
            jsonobject.put("betaDeviceToken", r1.f);
            jsonobject.put("buildId", r1.g);
            jsonobject.put("osVersion", r1.h);
            jsonobject.put("deviceModel", r1.i);
            jsonobject.put("appVersionCode", r1.j);
            jsonobject.put("appVersionName", r1.k);
            jsonobject.put("timestamp", q1.b);
            jsonobject.put("type", q1.c.toString());
            jsonobject.put("details", new JSONObject(q1.d));
            jsonobject.put("customType", q1.e);
            jsonobject.put("customAttributes", new JSONObject(q1.f));
        }
        // Misplaced declaration of an exception variable
        catch (q q1)
        {
            if (android.os.Build.VERSION.SDK_INT >= 9)
            {
                throw new IOException(q1.getMessage(), q1);
            } else
            {
                throw new IOException(q1.getMessage());
            }
        }
        return jsonobject;
    }

    public final byte[] a(Object obj)
    {
        return a((q)obj).toString().getBytes("UTF-8");
    }
}
