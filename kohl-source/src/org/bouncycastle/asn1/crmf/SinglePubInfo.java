// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.GeneralName;

public class SinglePubInfo extends ASN1Object
{

    private GeneralName pubLocation;
    private ASN1Integer pubMethod;

    private SinglePubInfo(ASN1Sequence asn1sequence)
    {
        pubMethod = ASN1Integer.getInstance(asn1sequence.getObjectAt(0));
        if (asn1sequence.size() == 2)
        {
            pubLocation = GeneralName.getInstance(asn1sequence.getObjectAt(1));
        }
    }

    public static SinglePubInfo getInstance(Object obj)
    {
        if (obj instanceof SinglePubInfo)
        {
            return (SinglePubInfo)obj;
        }
        if (obj != null)
        {
            return new SinglePubInfo(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public GeneralName getPubLocation()
    {
        return pubLocation;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(pubMethod);
        if (pubLocation != null)
        {
            asn1encodablevector.add(pubLocation);
        }
        return new DERSequence(asn1encodablevector);
    }
}
