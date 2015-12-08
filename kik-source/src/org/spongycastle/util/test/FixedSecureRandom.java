// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.util.test;

import java.security.SecureRandom;

public class FixedSecureRandom extends SecureRandom
{

    private byte a[];
    private int b;
    private int c;

    private int a()
    {
        byte abyte0[] = a;
        int i = b;
        b = i + 1;
        return abyte0[i] & 0xff;
    }

    public void nextBytes(byte abyte0[])
    {
        System.arraycopy(a, b, abyte0, 0, abyte0.length);
        b = b + abyte0.length;
    }

    public int nextInt()
    {
        int i = a() << 24 | 0 | a() << 16;
        if (c == 2)
        {
            c = c - 1;
        } else
        {
            i |= a() << 8;
        }
        if (c == 1)
        {
            c = c - 1;
            return i;
        } else
        {
            return i | a();
        }
    }

    public long nextLong()
    {
        return 0L | (long)a() << 56 | (long)a() << 48 | (long)a() << 40 | (long)a() << 32 | (long)a() << 24 | (long)a() << 16 | (long)a() << 8 | (long)a();
    }
}
