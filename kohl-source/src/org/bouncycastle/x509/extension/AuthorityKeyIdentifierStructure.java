// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509.extension;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509Extension;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.jce.PrincipalUtil;

// Referenced classes of package org.bouncycastle.x509.extension:
//            X509ExtensionUtil

public class AuthorityKeyIdentifierStructure extends AuthorityKeyIdentifier
{

    public AuthorityKeyIdentifierStructure(PublicKey publickey)
        throws InvalidKeyException
    {
        super(fromKey(publickey));
    }

    public AuthorityKeyIdentifierStructure(X509Certificate x509certificate)
        throws CertificateParsingException
    {
        super(fromCertificate(x509certificate));
    }

    public AuthorityKeyIdentifierStructure(Extension extension)
    {
        super((ASN1Sequence)extension.getParsedValue());
    }

    public AuthorityKeyIdentifierStructure(X509Extension x509extension)
    {
        super((ASN1Sequence)x509extension.getParsedValue());
    }

    public AuthorityKeyIdentifierStructure(byte abyte0[])
        throws IOException
    {
        super((ASN1Sequence)X509ExtensionUtil.fromExtensionValue(abyte0));
    }

    private static ASN1Sequence fromCertificate(X509Certificate x509certificate)
        throws CertificateParsingException
    {
        GeneralName generalname1;
        byte abyte0[];
        try
        {
            if (x509certificate.getVersion() != 3)
            {
                GeneralName generalname = new GeneralName(PrincipalUtil.getIssuerX509Principal(x509certificate));
                return (ASN1Sequence)(new AuthorityKeyIdentifier(new SubjectPublicKeyInfo((ASN1Sequence)(new ASN1InputStream(x509certificate.getPublicKey().getEncoded())).readObject()), new GeneralNames(generalname), x509certificate.getSerialNumber())).toASN1Object();
            }
            generalname1 = new GeneralName(PrincipalUtil.getIssuerX509Principal(x509certificate));
            abyte0 = x509certificate.getExtensionValue(X509Extensions.SubjectKeyIdentifier.getId());
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate x509certificate)
        {
            throw new CertificateParsingException((new StringBuilder()).append("Exception extracting certificate details: ").append(x509certificate.toString()).toString());
        }
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        return (ASN1Sequence)(new AuthorityKeyIdentifier(((ASN1OctetString)X509ExtensionUtil.fromExtensionValue(abyte0)).getOctets(), new GeneralNames(generalname1), x509certificate.getSerialNumber())).toASN1Object();
        x509certificate = (ASN1Sequence)(new AuthorityKeyIdentifier(new SubjectPublicKeyInfo((ASN1Sequence)(new ASN1InputStream(x509certificate.getPublicKey().getEncoded())).readObject()), new GeneralNames(generalname1), x509certificate.getSerialNumber())).toASN1Object();
        return x509certificate;
    }

    private static ASN1Sequence fromKey(PublicKey publickey)
        throws InvalidKeyException
    {
        try
        {
            publickey = (ASN1Sequence)(new AuthorityKeyIdentifier(new SubjectPublicKeyInfo((ASN1Sequence)(new ASN1InputStream(publickey.getEncoded())).readObject()))).toASN1Object();
        }
        // Misplaced declaration of an exception variable
        catch (PublicKey publickey)
        {
            throw new InvalidKeyException((new StringBuilder()).append("can't process key: ").append(publickey).toString());
        }
        return publickey;
    }
}
