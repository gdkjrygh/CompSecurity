// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;

public class RSAPublicKeyStructure extends ASN1Encodable
{

    private BigInteger a;
    private BigInteger b;

    public RSAPublicKeyStructure(BigInteger biginteger, BigInteger biginteger1)
    {
        a = biginteger;
        b = biginteger1;
    }

    public RSAPublicKeyStructure(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.f() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.f()).toString());
        } else
        {
            asn1sequence = asn1sequence.e();
            a = DERInteger.a(asn1sequence.nextElement()).f();
            b = DERInteger.a(asn1sequence.nextElement()).f();
            return;
        }
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(new DERInteger(a));
        asn1encodablevector.a(new DERInteger(b));
        return new DERSequence(asn1encodablevector);
    }

    public final BigInteger e()
    {
        return a;
    }

    public final BigInteger f()
    {
        return b;
    }
}
