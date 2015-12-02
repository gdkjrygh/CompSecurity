// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.server;


public class c
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/facebook/ads/internal/server/c$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("UNKNOWN", 0);
            b = new a("ERROR", 1);
            c = new a("ADS", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    protected a a;
    protected String b;
    protected String c;

    public c(a a1)
    {
        if (a1 == null)
        {
            a = a.a;
        }
    }

    public c(a a1, String s, String s1)
    {
        a = a1;
        b = s;
        c = s1;
    }

    public a a()
    {
        return a;
    }
}
