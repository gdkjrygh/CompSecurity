// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

public class IESParameters
    implements CipherParameters
{

    private byte derivation[];
    private byte encoding[];
    private int macKeySize;

    public IESParameters(byte abyte0[], byte abyte1[], int i)
    {
        derivation = abyte0;
        encoding = abyte1;
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
