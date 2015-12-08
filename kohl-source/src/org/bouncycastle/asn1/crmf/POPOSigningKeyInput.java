// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

// Referenced classes of package org.bouncycastle.asn1.crmf:
//            PKMACValue

public class POPOSigningKeyInput extends ASN1Object
{

    private SubjectPublicKeyInfo publicKey;
    private PKMACValue publicKeyMAC;
    private GeneralName sender;

    private POPOSigningKeyInput(ASN1Sequence asn1sequence)
    {
        Object obj = asn1sequence.getObjectAt(0);
        if (obj instanceof ASN1TaggedObject)
        {
            obj = (ASN1TaggedObject)obj;
            if (((ASN1TaggedObject) (obj)).getTagNo() != 0)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unknown authInfo tag: ").append(((ASN1TaggedObject) (obj)).getTagNo()).toString());
            }
            sender = GeneralName.getInstance(((ASN1TaggedObject) (obj)).getObject());
        } else
        {
            publicKeyMAC = PKMACValue.getInstance(obj);
        }
        publicKey = SubjectPublicKeyInfo.getInstance(asn1sequence.getObjectAt(1));
    }

    public POPOSigningKeyInput(PKMACValue pkmacvalue, SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        publicKeyMAC = pkmacvalue;
        publicKey = subjectpublickeyinfo;
    }

    public POPOSigningKeyInput(GeneralName generalname, SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        sender = generalname;
        publicKey = subjectpublickeyinfo;
    }

    public static POPOSigningKeyInput getInstance(Object obj)
    {
        if (obj instanceof POPOSigningKeyInput)
        {
            return (POPOSigningKeyInput)obj;
        }
        if (obj != null)
        {
            return new POPOSigningKeyInput(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public SubjectPublicKeyInfo getPublicKey()
    {
        return publicKey;
    }

    public PKMACValue getPublicKeyMAC()
    {
        return publicKeyMAC;
    }

    public GeneralName getSender()
    {
        return sender;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (sender != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 0, sender));
        } else
        {
            asn1encodablevector.add(publicKeyMAC);
        }
        asn1encodablevector.add(publicKey);
        return new DERSequence(asn1encodablevector);
    }
}
