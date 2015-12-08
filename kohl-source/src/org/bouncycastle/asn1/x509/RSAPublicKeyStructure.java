// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

public class RSAPublicKeyStructure extends ASN1Object
{

    private BigInteger modulus;
    private BigInteger publicExponent;

    public RSAPublicKeyStructure(BigInteger biginteger, BigInteger biginteger1)
    {
        modulus = biginteger;
        publicExponent = biginteger1;
    }

    public RSAPublicKeyStructure(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        } else
        {
            asn1sequence = asn1sequence.getObjects();
            modulus = ASN1Integer.getInstance(asn1sequence.nextElement()).getPositiveValue();
            publicExponent = ASN1Integer.getInstance(asn1sequence.nextElement()).getPositiveValue();
            return;
        }
    }

    public static RSAPublicKeyStructure getInstance(Object obj)
    {
        if (obj == null || (obj instanceof RSAPublicKeyStructure))
        {
            return (RSAPublicKeyStructure)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new RSAPublicKeyStructure((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid RSAPublicKeyStructure: ").append(obj.getClass().getName()).toString());
        }
    }

    public static RSAPublicKeyStructure getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public BigInteger getModulus()
    {
        return modulus;
    }

    public BigInteger getPublicExponent()
    {
        return publicExponent;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(new ASN1Integer(getModulus()));
        asn1encodablevector.add(new ASN1Integer(getPublicExponent()));
        return new DERSequence(asn1encodablevector);
    }
}
