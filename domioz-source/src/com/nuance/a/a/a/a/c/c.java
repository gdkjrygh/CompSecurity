// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.a.c;

import com.nuance.a.a.a.a.d.a.d;
import com.nuance.a.a.a.a.d.a.e;

public class c
{

    private static final e a = d.a(com/nuance/a/a/a/a/c/c);

    public c()
    {
    }

    public static short a(byte abyte0[], int i)
    {
        short word0 = (short)(abyte0[i] & 0xff | (abyte0[i + 1] & 0xff) << 8);
        if (a.a())
        {
            (new StringBuilder("Converted [")).append(abyte0[i]).append(", ").append(abyte0[i + 1]).append("] to short ").append(word0);
        }
        return word0;
    }

    public static void a(int i, byte abyte0[], int j)
    {
        short word0 = (short)i;
        short word1 = (short)(i >> 16);
        a(word0, abyte0, j);
        a(word1, abyte0, j + 2);
        if (a.a())
        {
            (new StringBuilder("Converted int ")).append(i).append(" to [").append(abyte0[j]).append(", ").append(abyte0[j + 1]).append(", ").append(abyte0[j + 2]).append(", ").append(abyte0[j + 3]).append("]");
        }
    }

    public static void a(short word0, byte abyte0[], int i)
    {
        byte byte0 = (byte)word0;
        byte byte1 = (byte)(word0 >> 8);
        abyte0[i] = byte0;
        abyte0[i + 1] = byte1;
        if (a.a())
        {
            (new StringBuilder("Converted short ")).append(word0).append(" to [").append(abyte0[i]).append(", ").append(abyte0[i + 1]).append("]");
        }
    }

    public static int b(byte abyte0[], int i)
    {
        int j = a(abyte0, i) & 0xffff | (a(abyte0, i + 2) & 0xffff) << 16;
        if (a.a())
        {
            (new StringBuilder("Converted [")).append(abyte0[i]).append(", ").append(abyte0[i + 1]).append(", ").append(abyte0[i + 2]).append(", ").append(abyte0[i + 3]).append("] to int ").append(j);
        }
        return j;
    }

}
