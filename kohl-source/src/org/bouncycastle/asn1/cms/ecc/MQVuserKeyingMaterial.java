// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms.ecc;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.cms.OriginatorPublicKey;

public class MQVuserKeyingMaterial extends ASN1Object
{

    private ASN1OctetString addedukm;
    private OriginatorPublicKey ephemeralPublicKey;

    private MQVuserKeyingMaterial(ASN1Sequence asn1sequence)
    {
        ephemeralPublicKey = OriginatorPublicKey.getInstance(asn1sequence.getObjectAt(0));
        if (asn1sequence.size() > 1)
        {
            addedukm = ASN1OctetString.getInstance((ASN1TaggedObject)asn1sequence.getObjectAt(1), true);
        }
    }

    public MQVuserKeyingMaterial(OriginatorPublicKey originatorpublickey, ASN1OctetString asn1octetstring)
    {
        ephemeralPublicKey = originatorpublickey;
        addedukm = asn1octetstring;
    }

    public static MQVuserKeyingMaterial getInstance(Object obj)
    {
        if (obj == null || (obj instanceof MQVuserKeyingMaterial))
        {
            return (MQVuserKeyingMaterial)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new MQVuserKeyingMaterial((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid MQVuserKeyingMaterial: ").append(obj.getClass().getName()).toString());
        }
    }

    public static MQVuserKeyingMaterial getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public ASN1OctetString getAddedukm()
    {
        return addedukm;
    }

    public OriginatorPublicKey getEphemeralPublicKey()
    {
        return ephemeralPublicKey;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(ephemeralPublicKey);
        if (addedukm != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 0, addedukm));
        }
        return new DERSequence(asn1encodablevector);
    }
}
