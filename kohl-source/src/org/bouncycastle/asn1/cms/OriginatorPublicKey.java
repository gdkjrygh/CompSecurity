// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class OriginatorPublicKey extends ASN1Object
{

    private AlgorithmIdentifier algorithm;
    private DERBitString publicKey;

    public OriginatorPublicKey(ASN1Sequence asn1sequence)
    {
        algorithm = AlgorithmIdentifier.getInstance(asn1sequence.getObjectAt(0));
        publicKey = (DERBitString)asn1sequence.getObjectAt(1);
    }

    public OriginatorPublicKey(AlgorithmIdentifier algorithmidentifier, byte abyte0[])
    {
        algorithm = algorithmidentifier;
        publicKey = new DERBitString(abyte0);
    }

    public static OriginatorPublicKey getInstance(Object obj)
    {
        if (obj == null || (obj instanceof OriginatorPublicKey))
        {
            return (OriginatorPublicKey)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new OriginatorPublicKey((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid OriginatorPublicKey: ").append(obj.getClass().getName()).toString());
        }
    }

    public static OriginatorPublicKey getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public AlgorithmIdentifier getAlgorithm()
    {
        return algorithm;
    }

    public DERBitString getPublicKey()
    {
        return publicKey;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(algorithm);
        asn1encodablevector.add(publicKey);
        return new DERSequence(asn1encodablevector);
    }
}
