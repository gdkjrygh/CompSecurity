// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            KeyAgreeRecipientIdentifier

public class RecipientEncryptedKey extends ASN1Object
{

    private ASN1OctetString encryptedKey;
    private KeyAgreeRecipientIdentifier identifier;

    private RecipientEncryptedKey(ASN1Sequence asn1sequence)
    {
        identifier = KeyAgreeRecipientIdentifier.getInstance(asn1sequence.getObjectAt(0));
        encryptedKey = (ASN1OctetString)asn1sequence.getObjectAt(1);
    }

    public RecipientEncryptedKey(KeyAgreeRecipientIdentifier keyagreerecipientidentifier, ASN1OctetString asn1octetstring)
    {
        identifier = keyagreerecipientidentifier;
        encryptedKey = asn1octetstring;
    }

    public static RecipientEncryptedKey getInstance(Object obj)
    {
        if (obj == null || (obj instanceof RecipientEncryptedKey))
        {
            return (RecipientEncryptedKey)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new RecipientEncryptedKey((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid RecipientEncryptedKey: ").append(obj.getClass().getName()).toString());
        }
    }

    public static RecipientEncryptedKey getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public ASN1OctetString getEncryptedKey()
    {
        return encryptedKey;
    }

    public KeyAgreeRecipientIdentifier getIdentifier()
    {
        return identifier;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(identifier);
        asn1encodablevector.add(encryptedKey);
        return new DERSequence(asn1encodablevector);
    }
}
