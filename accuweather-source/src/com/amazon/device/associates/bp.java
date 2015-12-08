// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.content.Context;
import android.os.Build;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.associates:
//            au

final class bp
{

    private static bp b = null;
    JSONObject a;
    private final String c = "Android";
    private final String d;
    private final String e;
    private final String f;

    private bp()
    {
        a = new JSONObject();
        d = Build.MODEL;
        e = Build.MANUFACTURER;
        f = android.os.Build.VERSION.RELEASE;
    }

    protected static final bp a(Context context)
    {
        com/amazon/device/associates/bp;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new bp();
        }
        context = b;
        com/amazon/device/associates/bp;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    protected BasicNameValuePair a()
    {
        BasicNameValuePair basicnamevaluepair = null;
        try
        {
            a = new JSONObject();
            a.put("os", c);
            a.put("model", d);
            a.put("make", e);
            a.put("osVersion", f);
        }
        catch (Exception exception)
        {
            return null;
        }
        if (a != null)
        {
            basicnamevaluepair = new BasicNameValuePair("dinfo", au.a(a.toString()));
        }
        return basicnamevaluepair;
    }

}
