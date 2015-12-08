// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.agreement.kdf;

import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DERObjectIdentifier;
import org.spongycastle.crypto.DerivationParameters;

public class DHKDFParameters
    implements DerivationParameters
{

    private ASN1ObjectIdentifier a;
    private int b;
    private byte c[];
    private byte d[];

    public DHKDFParameters(DERObjectIdentifier derobjectidentifier, int i, byte abyte0[])
    {
        this(derobjectidentifier, i, abyte0, (byte)0);
    }

    private DHKDFParameters(DERObjectIdentifier derobjectidentifier, int i, byte abyte0[], byte byte0)
    {
        a = new ASN1ObjectIdentifier(derobjectidentifier.c());
        b = i;
        c = abyte0;
        d = null;
    }

    public final ASN1ObjectIdentifier a()
    {
        return a;
    }

    public final int b()
    {
        return b;
    }

    public final byte[] c()
    {
        return c;
    }

    public final byte[] d()
    {
        return d;
    }
}
