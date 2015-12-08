// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a;

import a.a.a.a.a.d.c;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.b.a.a:
//            x, aa, z

final class ab
    implements c
{

    ab()
    {
    }

    private static JSONObject a(x x1)
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            aa aa1 = x1.a;
            jsonobject.put("appBundleId", aa1.a);
            jsonobject.put("executionId", aa1.b);
            jsonobject.put("installationId", aa1.c);
            jsonobject.put("androidId", aa1.d);
            jsonobject.put("advertisingId", aa1.e);
            jsonobject.put("limitAdTrackingEnabled", aa1.f);
            jsonobject.put("betaDeviceToken", aa1.g);
            jsonobject.put("buildId", aa1.h);
            jsonobject.put("osVersion", aa1.i);
            jsonobject.put("deviceModel", aa1.j);
            jsonobject.put("appVersionCode", aa1.k);
            jsonobject.put("appVersionName", aa1.l);
            jsonobject.put("timestamp", x1.b);
            jsonobject.put("type", x1.c.toString());
            jsonobject.put("details", new JSONObject(x1.d));
            jsonobject.put("customType", x1.e);
            jsonobject.put("customAttributes", new JSONObject(x1.f));
            jsonobject.put("predefinedType", x1.g);
            jsonobject.put("predefinedAttributes", new JSONObject(x1.h));
        }
        // Misplaced declaration of an exception variable
        catch (x x1)
        {
            if (android.os.Build.VERSION.SDK_INT >= 9)
            {
                throw new IOException(x1.getMessage(), x1);
            } else
            {
                throw new IOException(x1.getMessage());
            }
        }
        return jsonobject;
    }

    public final byte[] a(Object obj)
    {
        return a((x)obj).toString().getBytes("UTF-8");
    }
}
