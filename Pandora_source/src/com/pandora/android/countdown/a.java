// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.countdown;

import com.pandora.radio.util.i;

// Referenced classes of package com.pandora.android.countdown:
//            c

public class com.pandora.android.countdown.a
    implements Cloneable
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/pandora/android/countdown/a$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("NONE", 0);
            b = new a("ACTIVE", 1);
            c = new a("FINISHED", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int j)
        {
            super(s, j);
        }
    }


    private CountdownBarLayout.a a;
    private String b;
    private c c;
    private c d;
    private long e;
    private long f;
    private int g;

    private com.pandora.android.countdown.a()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = 0L;
        f = 0L;
        g = 15;
    }

    public com.pandora.android.countdown.a(String s, c c1, c c2, long l, long l1, 
            CountdownBarLayout.a a1)
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = 0L;
        f = 0L;
        g = 15;
        b = s;
        a = a1;
        c = c1;
        d = c2;
        e = l;
        f = l1;
    }

    public int a()
    {
        return g;
    }

    public void a(int j)
    {
        g = j;
    }

    public String b()
    {
        return b;
    }

    public CountdownBarLayout.a c()
    {
        return a;
    }

    protected Object clone()
    {
        com.pandora.android.countdown.a a1 = new com.pandora.android.countdown.a();
        a1.b = b;
        a1.a = a;
        a1.c = c;
        a1.d = d;
        a1.e = e;
        a1.f = f;
        a1.g = g;
        return a1;
    }

    public long d()
    {
        return e;
    }

    public c e()
    {
        return c;
    }

    public c f()
    {
        return d;
    }

    public long g()
    {
        return f - i.g() / 1000L;
    }

    public boolean h()
    {
        return g() > 0L;
    }
}
