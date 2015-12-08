// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.util.Log;
import java.util.Set;
import java.util.TreeSet;

// Referenced classes of package com.microsoft.advertising.android:
//            af

public final class av
{

    private static final Set a = new TreeSet() {

    };

    public static void a(String s)
    {
        if (af.a())
        {
            c(s);
        }
    }

    public static void a(String s, Object obj)
    {
        while (!af.a() || !a.contains(s)) 
        {
            return;
        }
        if (obj != null)
        {
            obj = obj.toString();
        } else
        {
            obj = null;
        }
        c(s, ((String) (obj)));
    }

    public static void a(String s, String s1)
    {
        while (!af.a() || !a.contains(s)) 
        {
            return;
        }
        c(s, s1);
    }

    public static void a(String s, String s1, Throwable throwable)
    {
        if (af.a())
        {
            Log.e(c(s), s1, throwable);
        }
    }

    public static void b(String s)
    {
        if (af.a())
        {
            c(s);
        }
    }

    public static void b(String s, String s1)
    {
        if (af.a())
        {
            Log.i(c(s), s1);
        }
    }

    public static void b(String s, String s1, Throwable throwable)
    {
        if (af.a())
        {
            Log.w(c(s), s1, throwable);
        }
    }

    private static String c(String s)
    {
        return (new StringBuilder("MsAdsSDK-")).append(s).toString();
    }

    public static void c(String s, String s1)
    {
        if (af.a())
        {
            Log.e(c(s), s1);
        }
    }

    public static void d(String s, String s1)
    {
        if (af.a())
        {
            Log.w(c(s), s1);
        }
    }

}
