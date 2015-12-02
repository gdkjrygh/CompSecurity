// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import com.facebook.ads.internal.util.h;
import com.facebook.ads.internal.util.t;
import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;

public class e
{

    public static final String a = com/facebook/ads/e.getSimpleName();
    static volatile boolean b = false;
    private static final Collection c = new HashSet();
    private static final Collection d;
    private static String e = null;
    private static boolean f = false;
    private static String g = null;

    public e()
    {
    }

    public static String a()
    {
        return e;
    }

    private static void a(String s)
    {
        if (b)
        {
            return;
        } else
        {
            b = true;
            Log.d(a, (new StringBuilder()).append("Test mode device hash: ").append(s).toString());
            Log.d(a, (new StringBuilder()).append("When testing your app with Facebook's ad units you must specify the device hashed ID to ensure the delivery of test ads, add the following code before loading an ad: AdSettings.addTestDevice(\"").append(s).append("\");").toString());
            return;
        }
    }

    public static boolean a(Context context)
    {
        if (!d.contains(Build.PRODUCT)) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (g != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        SharedPreferences sharedpreferences = context.getSharedPreferences("FBAdPrefs", 0);
        g = sharedpreferences.getString("deviceIdHash", null);
        if (!t.a(g))
        {
            continue; /* Loop/switch isn't completed */
        }
        context = h.a(context.getContentResolver());
        if (!t.a(((com.facebook.ads.internal.util.h.a) (context)).b))
        {
            g = t.b(((com.facebook.ads.internal.util.h.a) (context)).b);
        } else
        if (!t.a(((com.facebook.ads.internal.util.h.a) (context)).a))
        {
            g = t.b(((com.facebook.ads.internal.util.h.a) (context)).a);
        } else
        {
            g = t.b(UUID.randomUUID().toString());
        }
        sharedpreferences.edit().putString("deviceIdHash", g).apply();
        if (c.contains(g)) goto _L1; else goto _L3
_L3:
        a(g);
        return false;
    }

    public static boolean b()
    {
        return f;
    }

    static 
    {
        d = new HashSet();
        d.add("sdk");
        d.add("google_sdk");
        d.add("vbox86p");
        d.add("vbox86tp");
    }
}
