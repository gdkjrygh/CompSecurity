// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DEREnumerated;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            AlgorithmIdentifier

public class ObjectDigestInfo extends ASN1Object
{

    public static final int otherObjectDigest = 2;
    public static final int publicKey = 0;
    public static final int publicKeyCert = 1;
    AlgorithmIdentifier digestAlgorithm;
    ASN1Enumerated digestedObjectType;
    DERBitString objectDigest;
    ASN1ObjectIdentifier otherObjectTypeID;

    public ObjectDigestInfo(int i, ASN1ObjectIdentifier asn1objectidentifier, AlgorithmIdentifier algorithmidentifier, byte abyte0[])
    {
        digestedObjectType = new ASN1Enumerated(i);
        if (i == 2)
        {
            otherObjectTypeID = asn1objectidentifier;
        }
        digestAlgorithm = algorithmidentifier;
        objectDigest = new DERBitString(abyte0);
    }

    private ObjectDigestInfo(ASN1Sequence asn1sequence)
    {
        int i = 1;
        super();
        if (asn1sequence.size() > 4 || asn1sequence.size() < 3)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        }
        digestedObjectType = DEREnumerated.getInstance(asn1sequence.getObjectAt(0));
        if (asn1sequence.size() == 4)
        {
            otherObjectTypeID = ASN1ObjectIdentifier.getInstance(asn1sequence.getObjectAt(1));
        } else
        {
            i = 0;
        }
        digestAlgorithm = AlgorithmIdentifier.getInstance(asn1sequence.getObjectAt(i + 1));
        objectDigest = DERBitString.getInstance(asn1sequence.getObjectAt(i + 2));
    }

    public static ObjectDigestInfo getInstance(Object obj)
    {
        if (obj instanceof ObjectDigestInfo)
        {
            return (ObjectDigestInfo)obj;
        }
        if (obj != null)
        {
            return new ObjectDigestInfo(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static ObjectDigestInfo getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public AlgorithmIdentifier getDigestAlgorithm()
    {
        return digestAlgorithm;
    }

    public DEREnumerated getDigestedObjectType()
    {
        return digestedObjectType;
    }

    public DERBitString getObjectDigest()
    {
        return objectDigest;
    }

    public ASN1ObjectIdentifier getOtherObjectTypeID()
    {
        return otherObjectTypeID;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(digestedObjectType);
        if (otherObjectTypeID != null)
        {
            asn1encodablevector.add(otherObjectTypeID);
        }
        asn1encodablevector.add(digestAlgorithm);
        asn1encodablevector.add(objectDigest);
        return new DERSequence(asn1encodablevector);
    }
}
