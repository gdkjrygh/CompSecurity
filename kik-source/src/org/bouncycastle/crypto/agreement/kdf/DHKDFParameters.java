// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.agreement.kdf;

import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.crypto.DerivationParameters;

public class DHKDFParameters
    implements DerivationParameters
{

    private final DERObjectIdentifier a;
    private final int b;
    private final byte c[];
    private final byte d[];

    public DHKDFParameters(DERObjectIdentifier derobjectidentifier, int i, byte abyte0[])
    {
        a = derobjectidentifier;
        b = i;
        c = abyte0;
        d = null;
    }

    public DHKDFParameters(DERObjectIdentifier derobjectidentifier, int i, byte abyte0[], byte abyte1[])
    {
        a = derobjectidentifier;
        b = i;
        c = abyte0;
        d = abyte1;
    }

    public DERObjectIdentifier getAlgorithm()
    {
        return a;
    }

    public byte[] getExtraInfo()
    {
        return d;
    }

    public int getKeySize()
    {
        return b;
    }

    public byte[] getZ()
    {
        return c;
    }
}
