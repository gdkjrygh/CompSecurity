// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import p.cw.c;

// Referenced classes of package com.pandora.radio.util:
//            k

public class o
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a a()
        {
            return values()[c.z.s().getResources().getConfiguration().orientation];
        }

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/pandora/radio/util/o$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("UNKNOWN", 0);
            b = new a("PORTRAIT", 1);
            c = new a("LANDSCAPE", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        private static final b d[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/pandora/radio/util/o$b, s);
        }

        public static b[] values()
        {
            return (b[])d.clone();
        }

        static 
        {
            a = new b("CURRENT", 0);
            b = new b("TABLET_NOW_PLAYING", 1);
            c = new b("TABLET_HISTORY", 2);
            d = (new b[] {
                a, b, c
            });
        }

        private b(String s, int i1)
        {
            super(s, i1);
        }
    }


    protected long a;
    protected long b;
    protected long c;
    protected long d;
    protected long e;
    protected boolean f;
    protected boolean g;
    protected long h;
    protected a i;
    protected b j;
    protected k k;
    private boolean l;

    public o(k k1)
    {
        l = false;
        a = 0L;
        b = 0L;
        c = 0L;
        d = 0L;
        e = 0L;
        f = false;
        g = false;
        h = 0L;
        i = a.a;
        k = k1;
    }

    public long a(b b1, a a1, boolean flag)
    {
        long l2 = 0L;
        this;
        JVM INSTR monitorenter ;
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        throw new IllegalArgumentException("viewMode is null. viewMode is a required parameter");
        b1;
        this;
        JVM INSTR monitorexit ;
        throw b1;
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        throw new IllegalArgumentException("orientation is null.  orientation is a required parameter");
        long l1 = System.currentTimeMillis();
        b b2 = b1;
        if (b1 != b.a) goto _L2; else goto _L1
_L1:
        b1 = j;
        b2 = b1;
        if (b1 != null) goto _L2; else goto _L3
_L3:
        l1 = l2;
_L13:
        this;
        JVM INSTR monitorexit ;
        return l1;
_L2:
        if (h <= 0L) goto _L5; else goto _L4
_L4:
        l2 = l1 - h;
        static class _cls1
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[a.values().length];
                try
                {
                    b[a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[com.pandora.radio.util.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    b[a.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                a = new int[b.values().length];
                try
                {
                    a[b.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.pandora.radio.util.b.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[b.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[j.ordinal()];
        JVM INSTR tableswitch 1 2: default 249
    //                   1 185
    //                   2 199;
           goto _L6 _L7 _L8
_L6:
        _cls1.b[i.ordinal()];
        JVM INSTR tableswitch 1 2: default 252
    //                   1 213
    //                   2 227;
           goto _L5 _L9 _L10
_L5:
        j = b2;
        i = a1;
        f = flag;
        if (!flag) goto _L12; else goto _L11
_L11:
        h = l1;
          goto _L13
_L7:
        a = a + l2;
          goto _L6
_L8:
        b = b + l2;
          goto _L6
_L9:
        c = l2 + c;
          goto _L5
_L10:
        d = l2 + d;
          goto _L5
_L12:
        h = 0L;
          goto _L13
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = l;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a(b.a, a.a(), f);
        if (g)
        {
            k.a(0L, a, 0L, b, c, d, e, f, false, true);
            a = 0L;
            b = 0L;
            e = 0L;
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void a(long l1)
    {
        this;
        JVM INSTR monitorenter ;
        if (l1 >= 0L) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        e = e + l1;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void a(boolean flag)
    {
        l = flag;
    }

    public void b(boolean flag)
    {
        g = flag;
    }
}
