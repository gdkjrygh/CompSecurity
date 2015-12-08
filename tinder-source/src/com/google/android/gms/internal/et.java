// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class et
{
    public static final class a
    {

        boolean a;
        boolean b;
        String c;
        com.google.android.gms.common.api.c.d d;
        boolean e;
        boolean f;

        public a()
        {
        }
    }


    public static final et a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final com.google.android.gms.common.api.c.d e;
    public final boolean f;
    public final boolean g;

    private et(boolean flag, boolean flag1, String s, com.google.android.gms.common.api.c.d d1, boolean flag2, boolean flag3)
    {
        b = flag;
        c = flag1;
        d = s;
        e = d1;
        f = flag2;
        g = flag3;
    }

    private et(boolean flag, boolean flag1, String s, com.google.android.gms.common.api.c.d d1, boolean flag2, boolean flag3, byte byte0)
    {
        this(flag, flag1, s, d1, flag2, flag3);
    }

    static 
    {
        a a1 = new a();
        a = new et(a1.a, a1.b, a1.c, a1.d, a1.e, a1.f, (byte)0);
    }
}
