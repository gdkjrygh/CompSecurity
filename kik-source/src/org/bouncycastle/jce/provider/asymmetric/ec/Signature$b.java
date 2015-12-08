// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.asymmetric.ec;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.jce.provider.DSAEncoder;

// Referenced classes of package org.bouncycastle.jce.provider.asymmetric.ec:
//            Signature

private static final class <init>
    implements DSAEncoder
{

    public final byte[] a(BigInteger biginteger, BigInteger biginteger1)
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(new DERInteger(biginteger));
        asn1encodablevector.a(new DERInteger(biginteger1));
        return (new DERSequence(asn1encodablevector)).a("DER");
    }

    public final BigInteger[] a(byte abyte0[])
    {
        abyte0 = (ASN1Sequence)ASN1Object.a(abyte0);
        return (new BigInteger[] {
            ((DERInteger)abyte0.a(0)).e(), ((DERInteger)abyte0.a(1)).e()
        });
    }

    private ()
    {
    }

    (byte byte0)
    {
        this();
    }
}
