// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEREnumerated;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.CRLReason;

public class RevokedInfo extends ASN1Object
{

    private CRLReason revocationReason;
    private DERGeneralizedTime revocationTime;

    private RevokedInfo(ASN1Sequence asn1sequence)
    {
        revocationTime = (DERGeneralizedTime)asn1sequence.getObjectAt(0);
        if (asn1sequence.size() > 1)
        {
            revocationReason = CRLReason.getInstance(DEREnumerated.getInstance((ASN1TaggedObject)asn1sequence.getObjectAt(1), true));
        }
    }

    public RevokedInfo(DERGeneralizedTime dergeneralizedtime, CRLReason crlreason)
    {
        revocationTime = dergeneralizedtime;
        revocationReason = crlreason;
    }

    public static RevokedInfo getInstance(Object obj)
    {
        if (obj instanceof RevokedInfo)
        {
            return (RevokedInfo)obj;
        }
        if (obj != null)
        {
            return new RevokedInfo(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static RevokedInfo getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public CRLReason getRevocationReason()
    {
        return revocationReason;
    }

    public DERGeneralizedTime getRevocationTime()
    {
        return revocationTime;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(revocationTime);
        if (revocationReason != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 0, revocationReason));
        }
        return new DERSequence(asn1encodablevector);
    }
}
