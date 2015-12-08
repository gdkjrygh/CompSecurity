// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x9;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.x9:
//            KeySpecificInfo

public class OtherInfo extends ASN1Object
{

    private KeySpecificInfo keyInfo;
    private ASN1OctetString partyAInfo;
    private ASN1OctetString suppPubInfo;

    public OtherInfo(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        keyInfo = new KeySpecificInfo((ASN1Sequence)asn1sequence.nextElement());
        do
        {
            if (!asn1sequence.hasMoreElements())
            {
                break;
            }
            DERTaggedObject dertaggedobject = (DERTaggedObject)asn1sequence.nextElement();
            if (dertaggedobject.getTagNo() == 0)
            {
                partyAInfo = (ASN1OctetString)dertaggedobject.getObject();
            } else
            if (dertaggedobject.getTagNo() == 2)
            {
                suppPubInfo = (ASN1OctetString)dertaggedobject.getObject();
            }
        } while (true);
    }

    public OtherInfo(KeySpecificInfo keyspecificinfo, ASN1OctetString asn1octetstring, ASN1OctetString asn1octetstring1)
    {
        keyInfo = keyspecificinfo;
        partyAInfo = asn1octetstring;
        suppPubInfo = asn1octetstring1;
    }

    public KeySpecificInfo getKeyInfo()
    {
        return keyInfo;
    }

    public ASN1OctetString getPartyAInfo()
    {
        return partyAInfo;
    }

    public ASN1OctetString getSuppPubInfo()
    {
        return suppPubInfo;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(keyInfo);
        if (partyAInfo != null)
        {
            asn1encodablevector.add(new DERTaggedObject(0, partyAInfo));
        }
        asn1encodablevector.add(new DERTaggedObject(2, suppPubInfo));
        return new DERSequence(asn1encodablevector);
    }
}
