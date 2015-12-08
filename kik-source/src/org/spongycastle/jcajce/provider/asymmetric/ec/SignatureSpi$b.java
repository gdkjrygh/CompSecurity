// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.ec;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERInteger;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.jcajce.provider.asymmetric.util.DSAEncoder;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.ec:
//            SignatureSpi

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
        abyte0 = (ASN1Sequence)ASN1Primitive.a(abyte0);
        return (new BigInteger[] {
            ((DERInteger)abyte0.a(0)).c(), ((DERInteger)abyte0.a(1)).c()
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
