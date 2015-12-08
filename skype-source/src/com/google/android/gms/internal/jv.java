// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class jv
{
    public static final class a
    {

        private final String a;
        private boolean b;
        private boolean c;
        private String d;

        static String a(a a1)
        {
            return a1.a;
        }

        static boolean b(a a1)
        {
            return a1.b;
        }

        static boolean c(a a1)
        {
            return a1.c;
        }

        static String d(a a1)
        {
            return a1.d;
        }

        public final a a(String s)
        {
            d = s;
            return this;
        }

        public final a a(boolean flag)
        {
            b = flag;
            return this;
        }

        public final jv a()
        {
            return new jv(this, (byte)0);
        }

        public final a b(boolean flag)
        {
            c = flag;
            return this;
        }

        public a(String s)
        {
            b = true;
            c = false;
            a = s;
        }
    }


    private final boolean a;
    private final boolean b;
    private final String c;
    private final String d;

    private jv(a a1)
    {
        d = a.a(a1);
        a = a.b(a1);
        b = a.c(a1);
        c = a.d(a1);
    }

    jv(a a1, byte byte0)
    {
        this(a1);
    }

    public final String a()
    {
        return d;
    }

    public final boolean b()
    {
        return a;
    }

    public final boolean c()
    {
        return b;
    }

    public final String d()
    {
        return c;
    }
}
