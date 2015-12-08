// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;

public class MGFParameters
    implements DerivationParameters
{

    byte seed[];

    public MGFParameters(byte abyte0[])
    {
        this(abyte0, 0, abyte0.length);
    }

    public MGFParameters(byte abyte0[], int i, int j)
    {
        seed = new byte[j];
        System.arraycopy(abyte0, i, seed, 0, j);
    }

    public byte[] getSeed()
    {
        return seed;
    }
}
