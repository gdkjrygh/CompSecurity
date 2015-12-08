// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce;

import java.io.IOException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.x509.TBSCertificateStructure;
import org.spongycastle.asn1.x509.X509Name;

// Referenced classes of package org.spongycastle.jce:
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
            x509certificate = new X509Principal(X509Name.a(TBSCertificateStructure.a(ASN1Primitive.a(x509certificate.getTBSCertificate())).d()));
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
            x509certificate = new X509Principal(X509Name.a(TBSCertificateStructure.a(ASN1Primitive.a(x509certificate.getTBSCertificate())).e()));
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate x509certificate)
        {
            throw new CertificateEncodingException(x509certificate.toString());
        }
        return x509certificate;
    }
}
