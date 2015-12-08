// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import com.facebook.ads.internal.util.g;
import com.facebook.ads.internal.util.s;
import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;

public class AdSettings
{

    public static final boolean DEBUG = false;
    static volatile boolean a = false;
    private static final String b = com/facebook/ads/AdSettings.getSimpleName();
    private static final Collection c = new HashSet();
    private static final Collection d;
    private static String e = null;
    private static boolean f = false;
    private static String g = null;

    public AdSettings()
    {
    }

    private static void a(String s1)
    {
        if (a)
        {
            return;
        } else
        {
            a = true;
            Log.d(b, (new StringBuilder()).append("Test mode device hash: ").append(s1).toString());
            Log.d(b, (new StringBuilder()).append("When testing your app with Facebook's ad units you must specify the device hashed ID to ensure the delivery of test ads, add the following code before loading an ad: AdSettings.addTestDevice(\"").append(s1).append("\");").toString());
            return;
        }
    }

    public static void addTestDevice(String s1)
    {
        c.add(s1);
    }

    public static void addTestDevices(Collection collection)
    {
        c.addAll(collection);
    }

    public static void clearTestDevices()
    {
        c.clear();
    }

    public static String getUrlPrefix()
    {
        return e;
    }

    public static boolean isChildDirected()
    {
        return f;
    }

    public static boolean isTestMode(Context context)
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
        if (!s.a(g))
        {
            continue; /* Loop/switch isn't completed */
        }
        context = com.facebook.ads.internal.util.g.a(context.getContentResolver());
        if (!s.a(((com.facebook.ads.internal.util.g.a) (context)).b))
        {
            g = s.b(((com.facebook.ads.internal.util.g.a) (context)).b);
        } else
        if (!s.a(((com.facebook.ads.internal.util.g.a) (context)).a))
        {
            g = s.b(((com.facebook.ads.internal.util.g.a) (context)).a);
        } else
        {
            g = s.b(UUID.randomUUID().toString());
        }
        sharedpreferences.edit().putString("deviceIdHash", g).apply();
        if (c.contains(g)) goto _L1; else goto _L3
_L3:
        a(g);
        return false;
    }

    public static void setIsChildDirected(boolean flag)
    {
        f = flag;
    }

    public static void setUrlPrefix(String s1)
    {
        e = s1;
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
