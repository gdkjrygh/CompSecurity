// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

public class RC2Parameters
    implements CipherParameters
{

    private byte a[];
    private int b;

    public RC2Parameters(byte abyte0[])
    {
        int i;
        if (abyte0.length > 128)
        {
            i = 1024;
        } else
        {
            i = abyte0.length * 8;
        }
        this(abyte0, i);
    }

    public RC2Parameters(byte abyte0[], int i)
    {
        a = new byte[abyte0.length];
        b = i;
        System.arraycopy(abyte0, 0, a, 0, abyte0.length);
    }

    public int getEffectiveKeyBits()
    {
        return b;
    }

    public byte[] getKey()
    {
        return a;
    }
}
