// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import org.spongycastle.crypto.CipherParameters;

public class ParametersWithIV
    implements CipherParameters
{

    private byte a[];
    private CipherParameters b;

    public ParametersWithIV(CipherParameters cipherparameters, byte abyte0[])
    {
        this(cipherparameters, abyte0, 0, abyte0.length);
    }

    public ParametersWithIV(CipherParameters cipherparameters, byte abyte0[], int i, int j)
    {
        a = new byte[j];
        b = cipherparameters;
        System.arraycopy(abyte0, i, a, 0, j);
    }

    public final byte[] a()
    {
        return a;
    }

    public final CipherParameters b()
    {
        return b;
    }
}
