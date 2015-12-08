// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.formats;


public final class b
{
    public static final class a
    {

        private boolean a;
        private int b;
        private boolean c;

        static boolean a(a a1)
        {
            return a1.a;
        }

        static int b(a a1)
        {
            return a1.b;
        }

        static boolean c(a a1)
        {
            return a1.c;
        }

        public final a a(int i)
        {
            b = i;
            return this;
        }

        public final a a(boolean flag)
        {
            a = flag;
            return this;
        }

        public final b a()
        {
            return new b(this, (byte)0);
        }

        public final a b(boolean flag)
        {
            c = flag;
            return this;
        }

        public a()
        {
            a = false;
            b = 0;
            c = false;
        }
    }


    private final boolean a;
    private final int b;
    private final boolean c;

    private b(a a1)
    {
        a = a.a(a1);
        b = a.b(a1);
        c = a.c(a1);
    }

    b(a a1, byte byte0)
    {
        this(a1);
    }

    public final boolean a()
    {
        return a;
    }

    public final int b()
    {
        return b;
    }

    public final boolean c()
    {
        return c;
    }
}
