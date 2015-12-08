// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            KEKRecipientInfo, KeyAgreeRecipientInfo, PasswordRecipientInfo, OtherRecipientInfo, 
//            KeyTransRecipientInfo

public class RecipientInfo extends ASN1Object
    implements ASN1Choice
{

    ASN1Encodable info;

    public RecipientInfo(ASN1Primitive asn1primitive)
    {
        info = asn1primitive;
    }

    public RecipientInfo(KEKRecipientInfo kekrecipientinfo)
    {
        info = new DERTaggedObject(false, 2, kekrecipientinfo);
    }

    public RecipientInfo(KeyAgreeRecipientInfo keyagreerecipientinfo)
    {
        info = new DERTaggedObject(false, 1, keyagreerecipientinfo);
    }

    public RecipientInfo(KeyTransRecipientInfo keytransrecipientinfo)
    {
        info = keytransrecipientinfo;
    }

    public RecipientInfo(OtherRecipientInfo otherrecipientinfo)
    {
        info = new DERTaggedObject(false, 4, otherrecipientinfo);
    }

    public RecipientInfo(PasswordRecipientInfo passwordrecipientinfo)
    {
        info = new DERTaggedObject(false, 3, passwordrecipientinfo);
    }

    public static RecipientInfo getInstance(Object obj)
    {
        if (obj == null || (obj instanceof RecipientInfo))
        {
            return (RecipientInfo)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new RecipientInfo((ASN1Sequence)obj);
        }
        if (obj instanceof ASN1TaggedObject)
        {
            return new RecipientInfo((ASN1TaggedObject)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknown object in factory: ").append(obj.getClass().getName()).toString());
        }
    }

    private KEKRecipientInfo getKEKInfo(ASN1TaggedObject asn1taggedobject)
    {
        if (asn1taggedobject.isExplicit())
        {
            return KEKRecipientInfo.getInstance(asn1taggedobject, true);
        } else
        {
            return KEKRecipientInfo.getInstance(asn1taggedobject, false);
        }
    }

    public ASN1Encodable getInfo()
    {
        if (info instanceof ASN1TaggedObject)
        {
            ASN1TaggedObject asn1taggedobject = (ASN1TaggedObject)info;
            switch (asn1taggedobject.getTagNo())
            {
            default:
                throw new IllegalStateException("unknown tag");

            case 1: // '\001'
                return KeyAgreeRecipientInfo.getInstance(asn1taggedobject, false);

            case 2: // '\002'
                return getKEKInfo(asn1taggedobject);

            case 3: // '\003'
                return PasswordRecipientInfo.getInstance(asn1taggedobject, false);

            case 4: // '\004'
                return OtherRecipientInfo.getInstance(asn1taggedobject, false);
            }
        } else
        {
            return KeyTransRecipientInfo.getInstance(info);
        }
    }

    public ASN1Integer getVersion()
    {
        if (info instanceof ASN1TaggedObject)
        {
            ASN1TaggedObject asn1taggedobject = (ASN1TaggedObject)info;
            switch (asn1taggedobject.getTagNo())
            {
            default:
                throw new IllegalStateException("unknown tag");

            case 1: // '\001'
                return KeyAgreeRecipientInfo.getInstance(asn1taggedobject, false).getVersion();

            case 2: // '\002'
                return getKEKInfo(asn1taggedobject).getVersion();

            case 3: // '\003'
                return PasswordRecipientInfo.getInstance(asn1taggedobject, false).getVersion();

            case 4: // '\004'
                return new ASN1Integer(0);
            }
        } else
        {
            return KeyTransRecipientInfo.getInstance(info).getVersion();
        }
    }

    public boolean isTagged()
    {
        return info instanceof ASN1TaggedObject;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return info.toASN1Primitive();
    }
}
