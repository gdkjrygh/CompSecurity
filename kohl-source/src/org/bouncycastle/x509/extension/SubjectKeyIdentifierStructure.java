// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509.extension;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.SubjectKeyIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

// Referenced classes of package org.bouncycastle.x509.extension:
//            X509ExtensionUtil

public class SubjectKeyIdentifierStructure extends SubjectKeyIdentifier
{

    public SubjectKeyIdentifierStructure(PublicKey publickey)
        throws InvalidKeyException
    {
        super(fromPublicKey(publickey));
    }

    public SubjectKeyIdentifierStructure(byte abyte0[])
        throws IOException
    {
        super((ASN1OctetString)X509ExtensionUtil.fromExtensionValue(abyte0));
    }

    private static ASN1OctetString fromPublicKey(PublicKey publickey)
        throws InvalidKeyException
    {
        try
        {
            publickey = (ASN1OctetString)(ASN1OctetString)(new SubjectKeyIdentifier(SubjectPublicKeyInfo.getInstance(publickey.getEncoded()))).toASN1Object();
        }
        // Misplaced declaration of an exception variable
        catch (PublicKey publickey)
        {
            throw new InvalidKeyException((new StringBuilder()).append("Exception extracting key details: ").append(publickey.toString()).toString());
        }
        return publickey;
    }
}
