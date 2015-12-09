// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.internal:
//            u, v

final class w
{

    w()
    {
    }

    private static JSONObject a(Map map)
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

    public final byte[] a(u u1)
        throws IOException
    {
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("appBundleId", u1.a);
            jsonobject.put("executionId", u1.b);
            jsonobject.put("installationId", u1.c);
            jsonobject.put("androidId", u1.d);
            jsonobject.put("osVersion", u1.e);
            jsonobject.put("deviceModel", u1.f);
            jsonobject.put("appVersionCode", u1.g);
            jsonobject.put("appVersionName", u1.h);
            jsonobject.put("timestamp", u1.i);
            jsonobject.put("type", u1.j.toString());
            jsonobject.put("details", a(u1.k));
            u1 = jsonobject.toString().getBytes("UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (u u1)
        {
            throw new IOException(u1.getMessage());
        }
        return u1;
    }
}
