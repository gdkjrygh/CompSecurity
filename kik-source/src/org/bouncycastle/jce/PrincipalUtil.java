// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce;

import java.io.IOException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.x509.TBSCertificateStructure;

// Referenced classes of package org.bouncycastle.jce:
//            X509Principal

public class PrincipalUtil
{

    public PrincipalUtil()
    {
    }

    public static X509Principal a(X509Certificate x509certificate)
    {
        try
        {
            x509certificate = new X509Principal(TBSCertificateStructure.a(ASN1Object.a(x509certificate.getTBSCertificate())).f());
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate x509certificate)
        {
            throw new CertificateEncodingException(x509certificate.toString());
        }
        return x509certificate;
    }

    public static X509Principal b(X509Certificate x509certificate)
    {
        try
        {
            x509certificate = new X509Principal(TBSCertificateStructure.a(ASN1Object.a(x509certificate.getTBSCertificate())).g());
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate x509certificate)
        {
            throw new CertificateEncodingException(x509certificate.toString());
        }
        return x509certificate;
    }
}
