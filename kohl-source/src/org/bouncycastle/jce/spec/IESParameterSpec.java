// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.spec;

import java.security.spec.AlgorithmParameterSpec;

public class IESParameterSpec
    implements AlgorithmParameterSpec
{

    private byte derivation[];
    private byte encoding[];
    private int macKeySize;

    public IESParameterSpec(byte abyte0[], byte abyte1[], int i)
    {
        derivation = new byte[abyte0.length];
        System.arraycopy(abyte0, 0, derivation, 0, abyte0.length);
        encoding = new byte[abyte1.length];
        System.arraycopy(abyte1, 0, encoding, 0, abyte1.length);
        macKeySize = i;
    }

    public byte[] getDerivationV()
    {
        return derivation;
    }

    public byte[] getEncodingV()
    {
        return encoding;
    }

    public int getMacKeySize()
    {
        return macKeySize;
    }
}
