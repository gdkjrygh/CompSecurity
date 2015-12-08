// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBoolean;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.crmf:
//            EncryptedKey

public class PKIArchiveOptions extends ASN1Object
    implements ASN1Choice
{

    public static final int archiveRemGenPrivKey = 2;
    public static final int encryptedPrivKey = 0;
    public static final int keyGenParameters = 1;
    private ASN1Encodable value;

    public PKIArchiveOptions(ASN1OctetString asn1octetstring)
    {
        value = asn1octetstring;
    }

    private PKIArchiveOptions(ASN1TaggedObject asn1taggedobject)
    {
        switch (asn1taggedobject.getTagNo())
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("unknown tag number: ").append(asn1taggedobject.getTagNo()).toString());

        case 0: // '\0'
            value = EncryptedKey.getInstance(asn1taggedobject.getObject());
            return;

        case 1: // '\001'
            value = ASN1OctetString.getInstance(asn1taggedobject, false);
            return;

        case 2: // '\002'
            value = DERBoolean.getInstance(asn1taggedobject, false);
            break;
        }
    }

    public PKIArchiveOptions(EncryptedKey encryptedkey)
    {
        value = encryptedkey;
    }

    public PKIArchiveOptions(boolean flag)
    {
        value = new DERBoolean(flag);
    }

    public static PKIArchiveOptions getInstance(Object obj)
    {
        if (obj == null || (obj instanceof PKIArchiveOptions))
        {
            return (PKIArchiveOptions)obj;
        }
        if (obj instanceof ASN1TaggedObject)
        {
            return new PKIArchiveOptions((ASN1TaggedObject)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknown object: ").append(obj).toString());
        }
    }

    public int getType()
    {
        if (value instanceof EncryptedKey)
        {
            return 0;
        }
        return !(value instanceof ASN1OctetString) ? 2 : 1;
    }

    public ASN1Encodable getValue()
    {
        return value;
    }

    public ASN1Primitive toASN1Primitive()
    {
        if (value instanceof EncryptedKey)
        {
            return new DERTaggedObject(true, 0, value);
        }
        if (value instanceof ASN1OctetString)
        {
            return new DERTaggedObject(false, 1, value);
        } else
        {
            return new DERTaggedObject(false, 2, value);
        }
    }
}
