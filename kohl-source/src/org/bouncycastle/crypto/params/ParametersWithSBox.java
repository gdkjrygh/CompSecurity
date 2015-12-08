// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

public class ParametersWithSBox
    implements CipherParameters
{

    private CipherParameters parameters;
    private byte sBox[];

    public ParametersWithSBox(CipherParameters cipherparameters, byte abyte0[])
    {
        parameters = cipherparameters;
        sBox = abyte0;
    }

    public CipherParameters getParameters()
    {
        return parameters;
    }

    public byte[] getSBox()
    {
        return sBox;
    }
}
