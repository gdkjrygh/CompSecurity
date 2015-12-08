// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class SigPolicyQualifierInfo extends ASN1Object
{

    private ASN1ObjectIdentifier sigPolicyQualifierId;
    private ASN1Encodable sigQualifier;

    public SigPolicyQualifierInfo(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        sigPolicyQualifierId = asn1objectidentifier;
        sigQualifier = asn1encodable;
    }

    private SigPolicyQualifierInfo(ASN1Sequence asn1sequence)
    {
        sigPolicyQualifierId = ASN1ObjectIdentifier.getInstance(asn1sequence.getObjectAt(0));
        sigQualifier = asn1sequence.getObjectAt(1);
    }

    public static SigPolicyQualifierInfo getInstance(Object obj)
    {
        if (obj instanceof SigPolicyQualifierInfo)
        {
            return (SigPolicyQualifierInfo)obj;
        }
        if (obj != null)
        {
            return new SigPolicyQualifierInfo(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1ObjectIdentifier getSigPolicyQualifierId()
    {
        return new ASN1ObjectIdentifier(sigPolicyQualifierId.getId());
    }

    public ASN1Encodable getSigQualifier()
    {
        return sigQualifier;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(sigPolicyQualifierId);
        asn1encodablevector.add(sigQualifier);
        return new DERSequence(asn1encodablevector);
    }
}
