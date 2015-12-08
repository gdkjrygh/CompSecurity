// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class EncryptionScheme extends AlgorithmIdentifier
{

    public EncryptionScheme(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        super(asn1objectidentifier, asn1encodable);
    }

    EncryptionScheme(ASN1Sequence asn1sequence)
    {
        this((ASN1ObjectIdentifier)asn1sequence.getObjectAt(0), asn1sequence.getObjectAt(1));
    }

    public static final AlgorithmIdentifier getInstance(Object obj)
    {
        if (obj instanceof EncryptionScheme)
        {
            return (EncryptionScheme)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new EncryptionScheme((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknown object in factory: ").append(obj.getClass().getName()).toString());
        }
    }

    public ASN1Primitive getASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(getObjectId());
        asn1encodablevector.add(getParameters());
        return new DERSequence(asn1encodablevector);
    }

    public ASN1Primitive getObject()
    {
        return (ASN1Primitive)getParameters();
    }
}
