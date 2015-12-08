// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


public class im
{

    private byte a[];

    public im()
    {
    }

    public im(byte abyte0[])
    {
        a = abyte0;
    }

    static byte[] a(im im1)
    {
        return im1.a;
    }

    static byte[] a(im im1, byte abyte0[])
    {
        im1.a = abyte0;
        return abyte0;
    }

    public byte[] a()
    {
        return a;
    }
}
