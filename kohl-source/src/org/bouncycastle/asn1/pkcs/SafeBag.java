// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DLSequence;
import org.bouncycastle.asn1.DLTaggedObject;

public class SafeBag extends ASN1Object
{

    private ASN1Set bagAttributes;
    private ASN1ObjectIdentifier bagId;
    private ASN1Encodable bagValue;

    public SafeBag(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        bagId = asn1objectidentifier;
        bagValue = asn1encodable;
        bagAttributes = null;
    }

    public SafeBag(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable, ASN1Set asn1set)
    {
        bagId = asn1objectidentifier;
        bagValue = asn1encodable;
        bagAttributes = asn1set;
    }

    private SafeBag(ASN1Sequence asn1sequence)
    {
        bagId = (ASN1ObjectIdentifier)asn1sequence.getObjectAt(0);
        bagValue = ((ASN1TaggedObject)asn1sequence.getObjectAt(1)).getObject();
        if (asn1sequence.size() == 3)
        {
            bagAttributes = (ASN1Set)asn1sequence.getObjectAt(2);
        }
    }

    public static SafeBag getInstance(Object obj)
    {
        if (obj instanceof SafeBag)
        {
            return (SafeBag)obj;
        }
        if (obj != null)
        {
            return new SafeBag(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1Set getBagAttributes()
    {
        return bagAttributes;
    }

    public ASN1ObjectIdentifier getBagId()
    {
        return bagId;
    }

    public ASN1Encodable getBagValue()
    {
        return bagValue;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(bagId);
        asn1encodablevector.add(new DLTaggedObject(true, 0, bagValue));
        if (bagAttributes != null)
        {
            asn1encodablevector.add(bagAttributes);
        }
        return new DLSequence(asn1encodablevector);
    }
}
