// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import p.cw.c;
import p.df.a;

public class u
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/pandora/radio/data/u$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("NETWORK", 0);
            b = new a("HTTP", 1);
            c = new a("JSON", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private c a;
    private int b;
    private int c;
    private int d;
    private int e;

    public u(c c1)
    {
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        a = c1;
    }

    public void a(a a1)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[com.pandora.radio.data.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.pandora.radio.data.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.pandora.radio.data._cls1.a[a1.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unhandled RadioState.Error ").append(a1).toString());

        case 1: // '\001'
            b = 0;
            return;

        case 2: // '\002'
            d = 0;
            return;

        case 3: // '\003'
            e = 0;
            break;
        }
    }

    public boolean a()
    {
        return b > 10 || d > 10 || e > 10;
    }

    public a b()
    {
        if (b > 10)
        {
            return com.pandora.radio.data.a.a;
        }
        if (d > 10)
        {
            return a.b;
        }
        if (e > 10)
        {
            return com.pandora.radio.data.a.c;
        } else
        {
            return null;
        }
    }

    public void b(a a1)
    {
        switch (com.pandora.radio.data._cls1.a[a1.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unhandled RadioState.Error ").append(a1).toString());

        case 1: // '\001'
            b = b + 1;
            p.df.a.c("RadioState", (new StringBuilder()).append("Network Error Count: ").append(b).toString());
            return;

        case 2: // '\002'
            d = d + 1;
            p.df.a.c("RadioState", (new StringBuilder()).append("Http Error Count: ").append(d).toString());
            return;

        case 3: // '\003'
            e = e + 1;
            break;
        }
        p.df.a.c("RadioState", (new StringBuilder()).append("JSON Error Count: ").append(e).toString());
    }

    public void c()
    {
        a(com.pandora.radio.data.a.a);
        d();
        a(a.b);
        a(com.pandora.radio.data.a.c);
    }

    public void d()
    {
        c = 0;
    }

    public void e()
    {
        c = c + 1;
        p.df.a.c("RadioState", (new StringBuilder()).append("Network Waiting Count: ").append(c).toString());
    }

    public int f()
    {
        return c;
    }
}
