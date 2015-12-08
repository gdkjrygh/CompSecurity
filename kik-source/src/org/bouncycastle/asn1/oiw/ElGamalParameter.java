// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.oiw;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;

public class ElGamalParameter extends ASN1Encodable
{

    DERInteger a;
    DERInteger b;

    public ElGamalParameter(BigInteger biginteger, BigInteger biginteger1)
    {
        a = new DERInteger(biginteger);
        b = new DERInteger(biginteger1);
    }

    public ElGamalParameter(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.e();
        a = (DERInteger)asn1sequence.nextElement();
        b = (DERInteger)asn1sequence.nextElement();
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        return new DERSequence(asn1encodablevector);
    }

    public final BigInteger e()
    {
        return a.f();
    }

    public final BigInteger f()
    {
        return b.f();
    }
}
