// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


public class ib
{

    private long a;
    private boolean b;
    private byte c[];

    public ib()
    {
    }

    static long a(ib ib1)
    {
        return ib1.a;
    }

    static long a(ib ib1, long l)
    {
        ib1.a = l;
        return l;
    }

    static boolean a(ib ib1, boolean flag)
    {
        ib1.b = flag;
        return flag;
    }

    static byte[] a(ib ib1, byte abyte0[])
    {
        ib1.c = abyte0;
        return abyte0;
    }

    static boolean b(ib ib1)
    {
        return ib1.b;
    }

    static byte[] c(ib ib1)
    {
        return ib1.c;
    }

    public long a()
    {
        return a;
    }

    public void a(long l)
    {
        a = l;
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    public void a(byte abyte0[])
    {
        c = abyte0;
    }

    public boolean b()
    {
        return b;
    }

    public byte[] c()
    {
        return c;
    }
}
