// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.crmf;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.cms.EnvelopedData;

// Referenced classes of package org.bouncycastle.asn1.crmf:
//            SubsequentMessage, PKMACValue

public class POPOPrivKey extends ASN1Object
    implements ASN1Choice
{

    public static final int agreeMAC = 3;
    public static final int dhMAC = 2;
    public static final int encryptedKey = 4;
    public static final int subsequentMessage = 1;
    public static final int thisMessage = 0;
    private ASN1Encodable obj;
    private int tagNo;

    private POPOPrivKey(ASN1TaggedObject asn1taggedobject)
    {
        tagNo = asn1taggedobject.getTagNo();
        switch (tagNo)
        {
        default:
            throw new IllegalArgumentException("unknown tag in POPOPrivKey");

        case 0: // '\0'
            obj = DERBitString.getInstance(asn1taggedobject, false);
            return;

        case 1: // '\001'
            obj = SubsequentMessage.valueOf(ASN1Integer.getInstance(asn1taggedobject, false).getValue().intValue());
            return;

        case 2: // '\002'
            obj = DERBitString.getInstance(asn1taggedobject, false);
            return;

        case 3: // '\003'
            obj = PKMACValue.getInstance(asn1taggedobject, false);
            return;

        case 4: // '\004'
            obj = EnvelopedData.getInstance(asn1taggedobject, false);
            break;
        }
    }

    public POPOPrivKey(SubsequentMessage subsequentmessage)
    {
        tagNo = 1;
        obj = subsequentmessage;
    }

    public static POPOPrivKey getInstance(Object obj1)
    {
        if (obj1 instanceof POPOPrivKey)
        {
            return (POPOPrivKey)obj1;
        }
        if (obj1 != null)
        {
            return new POPOPrivKey(ASN1TaggedObject.getInstance(obj1));
        } else
        {
            return null;
        }
    }

    public static POPOPrivKey getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1TaggedObject.getInstance(asn1taggedobject, flag));
    }

    public int getType()
    {
        return tagNo;
    }

    public ASN1Encodable getValue()
    {
        return obj;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return new DERTaggedObject(false, tagNo, obj);
    }
}
