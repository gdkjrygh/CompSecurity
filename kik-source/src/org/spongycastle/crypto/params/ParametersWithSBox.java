// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import org.spongycastle.crypto.CipherParameters;

public class ParametersWithSBox
    implements CipherParameters
{

    private CipherParameters a;
    private byte b[];

    public ParametersWithSBox(CipherParameters cipherparameters, byte abyte0[])
    {
        a = cipherparameters;
        b = abyte0;
    }

    public final byte[] a()
    {
        return b;
    }

    public final CipherParameters b()
    {
        return a;
    }
}
