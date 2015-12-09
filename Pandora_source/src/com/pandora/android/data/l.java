// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.data;

import android.content.Context;
import com.pandora.radio.data.b;
import java.io.Serializable;
import p.cp.d;

public class l
    implements Serializable
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        private static final a f[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/pandora/android/data/l$a, s);
        }

        public static a[] values()
        {
            return (a[])f.clone();
        }

        static 
        {
            a = new a("slide", 0);
            b = new a("flip", 1);
            c = new a("curl", 2);
            d = new a("fade", 3);
            e = new a("grow", 4);
            f = (new a[] {
                a, b, c, d, e
            });
        }

        private a(String s, int i1)
        {
            super(s, i1);
        }
    }


    private String a;
    private String b;
    private int c;
    private a d;
    private String e;
    private Long f;
    private b g;
    private long h;
    private String i;
    private int j;
    private int k;
    private int l;
    private int m;

    public l(long l1, String s, int i1, a a1, String s1)
    {
        this(s, null, i1, a1, null, Long.valueOf(-1L), new b(), l1, s1);
    }

    public l(b b1, String s, String s1, int i1, a a1, String s2)
    {
        this(s, s1, i1, a1, null, Long.valueOf(-1L), b1, s2);
    }

    private l(String s, String s1, int i1, a a1, String s2, Long long1, b b1, 
            long l1, String s3)
    {
        a = s;
        b = s1;
        c = i1;
        d = a1;
        e = s2;
        f = long1;
        g = b1;
        h = l1;
        i = s3;
        k();
    }

    public l(String s, String s1, int i1, a a1, String s2, Long long1, b b1, 
            String s3)
    {
        this(s, s1, i1, a1, s2, long1, b1, -1L, s3);
    }

    private void k()
    {
        k = 0x7f05000a;
        l = 0x7f05000a;
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[a.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.pandora.android.data.a.d.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.pandora.android.data.a.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.e.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.a.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[d.ordinal()])
        {
        default:
            throw new UnsupportedOperationException((new StringBuilder()).append("Unknown transition type").append(d).toString());

        case 1: // '\001'
            j = 0x7f05000f;
            m = 0x7f050010;
            return;

        case 2: // '\002'
            j = 0x7f050007;
            k = 0x7f050008;
            l = 0x7f050007;
            m = 0x7f050008;
            return;

        case 3: // '\003'
            j = 0x7f050009;
            k = 0x7f050014;
            l = 0x7f050009;
            m = 0x7f050014;
            return;

        case 4: // '\004'
            j = 0x7f050009;
            k = 0x7f050014;
            l = 0x7f050009;
            m = 0x7f050014;
            return;

        case 5: // '\005'
            j = 0x7f05000b;
            break;
        }
        m = 0x7f05000c;
    }

    public String a()
    {
        return a;
    }

    public String a(Context context, p.cp.d.b b1)
    {
        return (new StringBuilder()).append(p.cp.d.a(context, b1)).append(b).toString();
    }

    public String b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public a d()
    {
        return d;
    }

    public Long e()
    {
        return f;
    }

    public b f()
    {
        return g;
    }

    public long g()
    {
        return h;
    }

    public int h()
    {
        return j;
    }

    public int i()
    {
        return k;
    }

    public String j()
    {
        return i;
    }

    public String toString()
    {
        return String.format("LandingPageData : {pageURL:%s, pageHTML:%s, backgroundColor:%s, transitionType:%s, chromeType:%s, adId:%s}", new Object[] {
            a, b, (new StringBuilder()).append(c).append("").toString(), d.name(), e, g
        });
    }
}
