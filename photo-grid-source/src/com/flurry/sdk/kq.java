// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.UUID;

public class kq
{

    private static final String b = com/flurry/sdk/kq.getSimpleName();
    String a;
    private byte c[];

    private kq()
    {
        a = null;
        c = null;
    }

    kq(_cls1 _pcls1)
    {
        this();
    }

    public kq(byte abyte0[])
    {
        a = null;
        c = null;
        a = UUID.randomUUID().toString();
        c = abyte0;
    }

    public static String a(String s)
    {
        return (new StringBuilder(".yflurrydatasenderblock.")).append(s).toString();
    }

    static byte[] a(kq kq1)
    {
        return kq1.c;
    }

    static byte[] a(kq kq1, byte abyte0[])
    {
        kq1.c = abyte0;
        return abyte0;
    }

    public String a()
    {
        return a;
    }

    public byte[] b()
    {
        return c;
    }

}
