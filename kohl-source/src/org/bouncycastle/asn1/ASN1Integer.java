// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.asn1:
//            DERInteger

public class ASN1Integer extends DERInteger
{

    public ASN1Integer(int i)
    {
        super(i);
    }

    public ASN1Integer(BigInteger biginteger)
    {
        super(biginteger);
    }

    ASN1Integer(byte abyte0[])
    {
        super(abyte0);
    }
}
