// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.util;

import com.facebook.ads.AdSize;
import com.facebook.ads.internal.config.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class d
{

    private static Map a = new ConcurrentHashMap();
    private static Map b = new ConcurrentHashMap();
    private static Map c = new ConcurrentHashMap();

    private static long a(String s, a a1)
    {
        long l = -1000L;
        if (!a.containsKey(s)) goto _L2; else goto _L1
_L1:
        l = ((Long)a.get(s)).longValue();
_L4:
        return l;
_L2:
        switch (com.facebook.ads.internal.util._cls1.a[a1.ordinal()])
        {
        default:
            return -1000L;

        case 1: // '\001'
            return 15000L;

        case 2: // '\002'
        case 3: // '\003'
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(long l, com.facebook.ads.internal.dto.d d1)
    {
        a.put(d(d1), Long.valueOf(l));
    }

    public static void a(String s, com.facebook.ads.internal.dto.d d1)
    {
        c.put(d(d1), s);
    }

    public static boolean a(com.facebook.ads.internal.dto.d d1)
    {
        String s = d(d1);
        if (!b.containsKey(s))
        {
            return false;
        }
        long l = ((Long)b.get(s)).longValue();
        long l1 = a(s, d1.b());
        return System.currentTimeMillis() - l < l1;
    }

    public static void b(com.facebook.ads.internal.dto.d d1)
    {
        b.put(d(d1), Long.valueOf(System.currentTimeMillis()));
    }

    public static String c(com.facebook.ads.internal.dto.d d1)
    {
        return (String)c.get(d(d1));
    }

    private static String d(com.facebook.ads.internal.dto.d d1)
    {
        int j = 0;
        String s = d1.a();
        a a1 = d1.b();
        com.facebook.ads.internal.e e = d1.f;
        int i;
        if (d1.c() == null)
        {
            i = 0;
        } else
        {
            i = d1.c().getHeight();
        }
        if (d1.c() != null)
        {
            j = d1.c().getWidth();
        }
        return String.format("%s:%s:%s:%d:%d:%d", new Object[] {
            s, a1, e, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(d1.d())
        });
    }


    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[com.facebook.ads.internal.config.a.values().length];
            try
            {
                a[a.b.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[a.c.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[a.d.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[a.a.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
