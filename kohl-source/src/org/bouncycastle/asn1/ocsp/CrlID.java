// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.ocsp;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

public class CrlID extends ASN1Object
{

    private ASN1Integer crlNum;
    private ASN1GeneralizedTime crlTime;
    private DERIA5String crlUrl;

    private CrlID(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        do
        {
            if (!asn1sequence.hasMoreElements())
            {
                break;
            }
            ASN1TaggedObject asn1taggedobject = (ASN1TaggedObject)asn1sequence.nextElement();
            switch (asn1taggedobject.getTagNo())
            {
            default:
                throw new IllegalArgumentException((new StringBuilder()).append("unknown tag number: ").append(asn1taggedobject.getTagNo()).toString());

            case 0: // '\0'
                crlUrl = DERIA5String.getInstance(asn1taggedobject, true);
                break;

            case 1: // '\001'
                crlNum = ASN1Integer.getInstance(asn1taggedobject, true);
                break;

            case 2: // '\002'
                crlTime = DERGeneralizedTime.getInstance(asn1taggedobject, true);
                break;
            }
        } while (true);
    }

    public static CrlID getInstance(Object obj)
    {
        if (obj instanceof CrlID)
        {
            return (CrlID)obj;
        }
        if (obj != null)
        {
            return new CrlID(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1Integer getCrlNum()
    {
        return crlNum;
    }

    public ASN1GeneralizedTime getCrlTime()
    {
        return crlTime;
    }

    public DERIA5String getCrlUrl()
    {
        return crlUrl;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (crlUrl != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 0, crlUrl));
        }
        if (crlNum != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 1, crlNum));
        }
        if (crlTime != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 2, crlTime));
        }
        return new DERSequence(asn1encodablevector);
    }
}
