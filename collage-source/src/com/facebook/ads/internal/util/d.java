// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.util;

import com.facebook.ads.AdSize;
import com.facebook.ads.internal.dto.b;
import com.facebook.ads.internal.dto.e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class d
{

    private static Map a = new ConcurrentHashMap();
    private static Map b = new ConcurrentHashMap();
    private static Map c = new ConcurrentHashMap();

    private static long a(String s, b b1)
    {
        long l = -1000L;
        if (!a.containsKey(s)) goto _L2; else goto _L1
_L1:
        l = ((Long)a.get(s)).longValue();
_L4:
        return l;
_L2:
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.facebook.ads.internal.dto.b.values().length];
                try
                {
                    a[b.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[b.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[b.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[b.a.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[b1.ordinal()])
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

    public static void a(long l, e e1)
    {
        a.put(d(e1), Long.valueOf(l));
    }

    public static void a(String s, e e1)
    {
        c.put(d(e1), s);
    }

    public static boolean a(e e1)
    {
        String s = d(e1);
        if (!b.containsKey(s))
        {
            return false;
        }
        long l = ((Long)b.get(s)).longValue();
        long l1 = a(s, e1.b());
        return System.currentTimeMillis() - l < l1;
    }

    public static void b(e e1)
    {
        b.put(d(e1), Long.valueOf(System.currentTimeMillis()));
    }

    public static String c(e e1)
    {
        return (String)c.get(d(e1));
    }

    private static String d(e e1)
    {
        int j = 0;
        String s = e1.a();
        b b1 = e1.b();
        com.facebook.ads.internal.e e2 = e1.e;
        int i;
        if (e1.c() == null)
        {
            i = 0;
        } else
        {
            i = e1.c().getHeight();
        }
        if (e1.c() != null)
        {
            j = e1.c().getWidth();
        }
        return String.format("%s:%s:%s:%d:%d:%d", new Object[] {
            s, b1, e2, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(e1.d())
        });
    }

}
