// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.esf:
//            OtherHashAlgAndValue, SigPolicyQualifiers

public class SignaturePolicyId extends ASN1Object
{

    private OtherHashAlgAndValue sigPolicyHash;
    private ASN1ObjectIdentifier sigPolicyId;
    private SigPolicyQualifiers sigPolicyQualifiers;

    public SignaturePolicyId(ASN1ObjectIdentifier asn1objectidentifier, OtherHashAlgAndValue otherhashalgandvalue)
    {
        this(asn1objectidentifier, otherhashalgandvalue, null);
    }

    public SignaturePolicyId(ASN1ObjectIdentifier asn1objectidentifier, OtherHashAlgAndValue otherhashalgandvalue, SigPolicyQualifiers sigpolicyqualifiers)
    {
        sigPolicyId = asn1objectidentifier;
        sigPolicyHash = otherhashalgandvalue;
        sigPolicyQualifiers = sigpolicyqualifiers;
    }

    private SignaturePolicyId(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() != 2 && asn1sequence.size() != 3)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        }
        sigPolicyId = ASN1ObjectIdentifier.getInstance(asn1sequence.getObjectAt(0));
        sigPolicyHash = OtherHashAlgAndValue.getInstance(asn1sequence.getObjectAt(1));
        if (asn1sequence.size() == 3)
        {
            sigPolicyQualifiers = SigPolicyQualifiers.getInstance(asn1sequence.getObjectAt(2));
        }
    }

    public static SignaturePolicyId getInstance(Object obj)
    {
        if (obj instanceof SignaturePolicyId)
        {
            return (SignaturePolicyId)obj;
        }
        if (obj != null)
        {
            return new SignaturePolicyId(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public OtherHashAlgAndValue getSigPolicyHash()
    {
        return sigPolicyHash;
    }

    public ASN1ObjectIdentifier getSigPolicyId()
    {
        return new ASN1ObjectIdentifier(sigPolicyId.getId());
    }

    public SigPolicyQualifiers getSigPolicyQualifiers()
    {
        return sigPolicyQualifiers;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(sigPolicyId);
        asn1encodablevector.add(sigPolicyHash);
        if (sigPolicyQualifiers != null)
        {
            asn1encodablevector.add(sigPolicyQualifiers);
        }
        return new DERSequence(asn1encodablevector);
    }
}
