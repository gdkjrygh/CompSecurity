// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appevents;

import java.io.Serializable;

// Referenced classes of package com.facebook.appevents:
//            AppEventsLogger

class FacebookTimeSpentData
    implements Serializable
{
    private static class SerializationProxyV2
        implements Serializable
    {

        private static final long serialVersionUID = 6L;
        private final long a;
        private final long b;
        private final long c;
        private final int d;
        private final String e;

        private Object readResolve()
        {
            return new FacebookTimeSpentData(a, b, c, d, e, (byte)0);
        }

        SerializationProxyV2(long l, long l1, long l2, int k, 
                String s)
        {
            a = l;
            b = l1;
            c = l2;
            d = k;
            e = s;
        }
    }


    static final String a = com/facebook/appevents/AppEventsLogger.getCanonicalName();
    private static final long j[] = {
        0x493e0L, 0xdbba0L, 0x1b7740L, 0x36ee80L, 0x1499700L, 0x2932e00L, 0x5265c00L, 0xa4cb800L, 0xf731400L, 0x240c8400L, 
        0x48190800L, 0x6c258c00L, 0x90321000L, 0x134fd9000L, 0x1cf7c5800L, 0x269fb2000L, 0x30479e800L, 0x39ef8b000L, 0x757b12c00L
    };
    private static final long serialVersionUID = 1L;
    boolean b;
    boolean c;
    long d;
    long e;
    long f;
    long g;
    int h;
    String i;

    FacebookTimeSpentData()
    {
        a();
    }

    private FacebookTimeSpentData(long l, long l1, long l2, int k, 
            String s)
    {
        a();
        e = l;
        f = l1;
        g = l2;
        h = k;
        i = s;
    }

    FacebookTimeSpentData(long l, long l1, long l2, int k, 
            String s, byte byte0)
    {
        this(l, l1, l2, k, s);
    }

    static int a(long l)
    {
        int k;
        for (k = 0; k < j.length && j[k] < l; k++) { }
        return k;
    }

    private Object writeReplace()
    {
        return new SerializationProxyV2(e, f, g, h, i);
    }

    final void a()
    {
        c = false;
        e = -1L;
        f = -1L;
        h = 0;
        g = 0L;
    }

}
