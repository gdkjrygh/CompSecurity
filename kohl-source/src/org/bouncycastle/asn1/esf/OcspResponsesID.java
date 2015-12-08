// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.esf:
//            OcspIdentifier, OtherHash

public class OcspResponsesID extends ASN1Object
{

    private OcspIdentifier ocspIdentifier;
    private OtherHash ocspRepHash;

    private OcspResponsesID(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() < 1 || asn1sequence.size() > 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        }
        ocspIdentifier = OcspIdentifier.getInstance(asn1sequence.getObjectAt(0));
        if (asn1sequence.size() > 1)
        {
            ocspRepHash = OtherHash.getInstance(asn1sequence.getObjectAt(1));
        }
    }

    public OcspResponsesID(OcspIdentifier ocspidentifier)
    {
        this(ocspidentifier, null);
    }

    public OcspResponsesID(OcspIdentifier ocspidentifier, OtherHash otherhash)
    {
        ocspIdentifier = ocspidentifier;
        ocspRepHash = otherhash;
    }

    public static OcspResponsesID getInstance(Object obj)
    {
        if (obj instanceof OcspResponsesID)
        {
            return (OcspResponsesID)obj;
        }
        if (obj != null)
        {
            return new OcspResponsesID(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public OcspIdentifier getOcspIdentifier()
    {
        return ocspIdentifier;
    }

    public OtherHash getOcspRepHash()
    {
        return ocspRepHash;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(ocspIdentifier);
        if (ocspRepHash != null)
        {
            asn1encodablevector.add(ocspRepHash);
        }
        return new DERSequence(asn1encodablevector);
    }
}
