// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

public class OtherRecipientInfo extends ASN1Object
{

    private ASN1ObjectIdentifier oriType;
    private ASN1Encodable oriValue;

    public OtherRecipientInfo(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        oriType = asn1objectidentifier;
        oriValue = asn1encodable;
    }

    public OtherRecipientInfo(ASN1Sequence asn1sequence)
    {
        oriType = ASN1ObjectIdentifier.getInstance(asn1sequence.getObjectAt(0));
        oriValue = asn1sequence.getObjectAt(1);
    }

    public static OtherRecipientInfo getInstance(Object obj)
    {
        if (obj == null || (obj instanceof OtherRecipientInfo))
        {
            return (OtherRecipientInfo)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new OtherRecipientInfo((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid OtherRecipientInfo: ").append(obj.getClass().getName()).toString());
        }
    }

    public static OtherRecipientInfo getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public ASN1ObjectIdentifier getType()
    {
        return oriType;
    }

    public ASN1Encodable getValue()
    {
        return oriValue;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(oriType);
        asn1encodablevector.add(oriValue);
        return new DERSequence(asn1encodablevector);
    }
}
