// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.facebook.ads.internal.util.g;
import com.facebook.ads.internal.util.s;
import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;

public class AdSettings
{

    public static final String TAG = com/facebook/ads/AdSettings.getSimpleName();
    static volatile boolean a = false;
    private static final Collection b = new HashSet();
    private static final Collection c;
    private static String d = null;
    private static boolean e = false;
    private static String f = null;

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
            (new StringBuilder("When testing your app with Facebook's ad units you must specify the device hashed ID to ensure the delivery of test ads, add the following code before loading an ad: AdSettings.addTestDevice(\"")).append(s1).append("\");");
            return;
        }
    }

    public static void addTestDevice(String s1)
    {
        b.add(s1);
    }

    public static void addTestDevices(Collection collection)
    {
        b.addAll(collection);
    }

    public static void clearTestDevices()
    {
        b.clear();
    }

    public static String getUrlPrefix()
    {
        return d;
    }

    public static boolean isChildDirected()
    {
        return e;
    }

    public static boolean isTestMode(Context context)
    {
        if (!c.contains(Build.PRODUCT)) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (f != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        SharedPreferences sharedpreferences = context.getSharedPreferences("FBAdPrefs", 0);
        String s1 = sharedpreferences.getString("deviceIdHash", null);
        f = s1;
        if (!s.a(s1))
        {
            continue; /* Loop/switch isn't completed */
        }
        context = g.a(context.getContentResolver());
        if (!s.a(((com.facebook.ads.internal.util.g.a) (context)).b))
        {
            f = s.b(((com.facebook.ads.internal.util.g.a) (context)).b);
        } else
        if (!s.a(((com.facebook.ads.internal.util.g.a) (context)).a))
        {
            f = s.b(((com.facebook.ads.internal.util.g.a) (context)).a);
        } else
        {
            f = s.b(UUID.randomUUID().toString());
        }
        sharedpreferences.edit().putString("deviceIdHash", f).apply();
        if (b.contains(f)) goto _L1; else goto _L3
_L3:
        a(f);
        return false;
    }

    public static void setIsChildDirected(boolean flag)
    {
        e = flag;
    }

    public static void setUrlPrefix(String s1)
    {
        d = s1;
    }

    static 
    {
        HashSet hashset = new HashSet();
        c = hashset;
        hashset.add("sdk");
        c.add("google_sdk");
        c.add("vbox86p");
        c.add("vbox86tp");
    }
}
