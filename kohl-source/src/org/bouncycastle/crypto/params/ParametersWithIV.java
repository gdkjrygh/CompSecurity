// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

public class ParametersWithIV
    implements CipherParameters
{

    private byte iv[];
    private CipherParameters parameters;

    public ParametersWithIV(CipherParameters cipherparameters, byte abyte0[])
    {
        this(cipherparameters, abyte0, 0, abyte0.length);
    }

    public ParametersWithIV(CipherParameters cipherparameters, byte abyte0[], int i, int j)
    {
        iv = new byte[j];
        parameters = cipherparameters;
        System.arraycopy(abyte0, i, iv, 0, j);
    }

    public byte[] getIV()
    {
        return iv;
    }

    public CipherParameters getParameters()
    {
        return parameters;
    }
}
