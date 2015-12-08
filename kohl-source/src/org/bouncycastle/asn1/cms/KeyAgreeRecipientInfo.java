// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            OriginatorIdentifierOrKey

public class KeyAgreeRecipientInfo extends ASN1Object
{

    private AlgorithmIdentifier keyEncryptionAlgorithm;
    private OriginatorIdentifierOrKey originator;
    private ASN1Sequence recipientEncryptedKeys;
    private ASN1OctetString ukm;
    private ASN1Integer version;

    public KeyAgreeRecipientInfo(ASN1Sequence asn1sequence)
    {
        version = (ASN1Integer)asn1sequence.getObjectAt(0);
        originator = OriginatorIdentifierOrKey.getInstance((ASN1TaggedObject)asn1sequence.getObjectAt(1), true);
        byte byte0;
        int i;
        if (asn1sequence.getObjectAt(2) instanceof ASN1TaggedObject)
        {
            ukm = ASN1OctetString.getInstance((ASN1TaggedObject)asn1sequence.getObjectAt(2), true);
            byte0 = 3;
        } else
        {
            byte0 = 2;
        }
        i = byte0 + 1;
        keyEncryptionAlgorithm = AlgorithmIdentifier.getInstance(asn1sequence.getObjectAt(byte0));
        recipientEncryptedKeys = (ASN1Sequence)asn1sequence.getObjectAt(i);
    }

    public KeyAgreeRecipientInfo(OriginatorIdentifierOrKey originatoridentifierorkey, ASN1OctetString asn1octetstring, AlgorithmIdentifier algorithmidentifier, ASN1Sequence asn1sequence)
    {
        version = new ASN1Integer(3);
        originator = originatoridentifierorkey;
        ukm = asn1octetstring;
        keyEncryptionAlgorithm = algorithmidentifier;
        recipientEncryptedKeys = asn1sequence;
    }

    public static KeyAgreeRecipientInfo getInstance(Object obj)
    {
        if (obj == null || (obj instanceof KeyAgreeRecipientInfo))
        {
            return (KeyAgreeRecipientInfo)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new KeyAgreeRecipientInfo((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Illegal object in KeyAgreeRecipientInfo: ").append(obj.getClass().getName()).toString());
        }
    }

    public static KeyAgreeRecipientInfo getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public AlgorithmIdentifier getKeyEncryptionAlgorithm()
    {
        return keyEncryptionAlgorithm;
    }

    public OriginatorIdentifierOrKey getOriginator()
    {
        return originator;
    }

    public ASN1Sequence getRecipientEncryptedKeys()
    {
        return recipientEncryptedKeys;
    }

    public ASN1OctetString getUserKeyingMaterial()
    {
        return ukm;
    }

    public ASN1Integer getVersion()
    {
        return version;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(version);
        asn1encodablevector.add(new DERTaggedObject(true, 0, originator));
        if (ukm != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 1, ukm));
        }
        asn1encodablevector.add(keyEncryptionAlgorithm);
        asn1encodablevector.add(recipientEncryptedKeys);
        return new DERSequence(asn1encodablevector);
    }
}
