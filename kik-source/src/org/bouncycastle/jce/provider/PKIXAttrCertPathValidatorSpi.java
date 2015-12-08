// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.X509Certificate;
import java.util.List;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.x509.ExtendedPKIXParameters;
import org.bouncycastle.x509.X509AttributeCertStoreSelector;

// Referenced classes of package org.bouncycastle.jce.provider:
//            AnnotatedException, f, CertPathValidatorUtilities

public class PKIXAttrCertPathValidatorSpi extends CertPathValidatorSpi
{

    public PKIXAttrCertPathValidatorSpi()
    {
    }

    public CertPathValidatorResult engineValidate(CertPath certpath, CertPathParameters certpathparameters)
    {
        if (!(certpathparameters instanceof ExtendedPKIXParameters))
        {
            throw new InvalidAlgorithmParameterException((new StringBuilder("Parameters must be a ")).append(org/bouncycastle/x509/ExtendedPKIXParameters.getName()).append(" instance.").toString());
        }
        certpathparameters = (ExtendedPKIXParameters)certpathparameters;
        Object obj = certpathparameters.h();
        if (!(obj instanceof X509AttributeCertStoreSelector))
        {
            throw new InvalidAlgorithmParameterException((new StringBuilder("TargetConstraints must be an instance of ")).append(org/bouncycastle/x509/X509AttributeCertStoreSelector.getName()).append(" for ").append(getClass().getName()).append(" class.").toString());
        }
        obj = ((X509AttributeCertStoreSelector)obj).a();
        f.d(((org.bouncycastle.x509.X509AttributeCertificate) (obj)), certpathparameters);
        CertPathValidatorResult certpathvalidatorresult = f.a(certpath, certpathparameters);
        Object obj1 = (X509Certificate)certpath.getCertificates().get(0);
        f.a(((X509Certificate) (obj1)));
        f.a(((X509Certificate) (obj1)), certpathparameters);
        f.c(((org.bouncycastle.x509.X509AttributeCertificate) (obj)), certpathparameters);
        f.a(((org.bouncycastle.x509.X509AttributeCertificate) (obj)), certpathparameters);
        f.b(((org.bouncycastle.x509.X509AttributeCertificate) (obj)), certpathparameters);
        try
        {
            obj1 = CertPathValidatorUtilities.a(certpathparameters, null, -1);
        }
        // Misplaced declaration of an exception variable
        catch (CertPath certpath)
        {
            throw new ExtCertPathValidatorException("Could not get validity date from attribute certificate.", certpath);
        }
        f.a(((org.bouncycastle.x509.X509AttributeCertificate) (obj)), certpathparameters, ((java.util.Date) (obj1)), certpath.getCertificates());
        return certpathvalidatorresult;
    }
}
