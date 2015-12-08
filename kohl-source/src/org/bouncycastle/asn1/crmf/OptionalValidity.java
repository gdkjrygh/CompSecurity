// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.crmf;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.Time;

public class OptionalValidity extends ASN1Object
{

    private Time notAfter;
    private Time notBefore;

    private OptionalValidity(ASN1Sequence asn1sequence)
    {
        for (asn1sequence = asn1sequence.getObjects(); asn1sequence.hasMoreElements();)
        {
            ASN1TaggedObject asn1taggedobject = (ASN1TaggedObject)asn1sequence.nextElement();
            if (asn1taggedobject.getTagNo() == 0)
            {
                notBefore = Time.getInstance(asn1taggedobject, true);
            } else
            {
                notAfter = Time.getInstance(asn1taggedobject, true);
            }
        }

    }

    public static OptionalValidity getInstance(Object obj)
    {
        if (obj instanceof OptionalValidity)
        {
            return (OptionalValidity)obj;
        }
        if (obj != null)
        {
            return new OptionalValidity(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (notBefore != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 0, notBefore));
        }
        if (notAfter != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 1, notAfter));
        }
        return new DERSequence(asn1encodablevector);
    }
}
