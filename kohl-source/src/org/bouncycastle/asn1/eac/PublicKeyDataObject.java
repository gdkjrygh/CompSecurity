// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.eac;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;

// Referenced classes of package org.bouncycastle.asn1.eac:
//            EACObjectIdentifiers, ECDSAPublicKey, RSAPublicKey

public abstract class PublicKeyDataObject extends ASN1Object
{

    public PublicKeyDataObject()
    {
    }

    public static PublicKeyDataObject getInstance(Object obj)
    {
        if (obj instanceof PublicKeyDataObject)
        {
            return (PublicKeyDataObject)obj;
        }
        if (obj != null)
        {
            obj = ASN1Sequence.getInstance(obj);
            if (ASN1ObjectIdentifier.getInstance(((ASN1Sequence) (obj)).getObjectAt(0)).on(EACObjectIdentifiers.id_TA_ECDSA))
            {
                return new ECDSAPublicKey(((ASN1Sequence) (obj)));
            } else
            {
                return new RSAPublicKey(((ASN1Sequence) (obj)));
            }
        } else
        {
            return null;
        }
    }

    public abstract ASN1ObjectIdentifier getUsage();
}
