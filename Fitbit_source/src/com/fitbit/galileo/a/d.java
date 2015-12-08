// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.a;


public class d
{

    private static final short a[] = {
        0, 16, 32, 48, 64, 80, 96, 112, 129, 145, 
        161, 177, 193, 209, 225, 241
    };
    private static final short b[] = {
        0, 33, 66, 99, 132, 165, 198, 231, 8, 41, 
        74, 107, 140, 173, 206, 239
    };
    private byte c;
    private byte d;

    public d()
    {
    }

    public static int a(byte abyte0[])
    {
        return (new d()).a(abyte0, 0, abyte0.length);
    }

    private void a(byte byte0)
    {
        byte byte2 = c;
        byte byte1 = d;
        byte0 = (byte)((byte)(byte2 >>> 4 & 0xf) ^ byte0);
        byte2 = (byte)(byte2 << 4 & 0xf0 | byte1 >>> 4 & 0xf);
        byte1 = (byte)(byte1 << 4 & 0xf0);
        c = (byte)(byte2 ^ a[byte0]);
        d = (byte)(b[byte0] ^ byte1);
    }

    private void b(byte byte0)
    {
        a((byte)(byte0 >>> 4 & 0xf));
        a((byte)(byte0 & 0xf));
    }

    public int a(byte abyte0[], int i, int j)
    {
        int k = 0;
        c = 0;
        d = 0;
        for (; k < j; k++)
        {
            b(abyte0[i + k]);
        }

        return (c << 8 & 0xff00 | d & 0xff) & 0xffff;
    }

}
