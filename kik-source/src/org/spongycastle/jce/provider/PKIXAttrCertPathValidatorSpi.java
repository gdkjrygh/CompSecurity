// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.X509Certificate;
import java.util.List;
import org.spongycastle.jce.exception.ExtCertPathValidatorException;
import org.spongycastle.x509.ExtendedPKIXParameters;
import org.spongycastle.x509.X509AttributeCertStoreSelector;

// Referenced classes of package org.spongycastle.jce.provider:
//            AnnotatedException, e, CertPathValidatorUtilities

public class PKIXAttrCertPathValidatorSpi extends CertPathValidatorSpi
{

    public PKIXAttrCertPathValidatorSpi()
    {
    }

    public CertPathValidatorResult engineValidate(CertPath certpath, CertPathParameters certpathparameters)
    {
        if (!(certpathparameters instanceof ExtendedPKIXParameters))
        {
            throw new InvalidAlgorithmParameterException((new StringBuilder("Parameters must be a ")).append(org/spongycastle/x509/ExtendedPKIXParameters.getName()).append(" instance.").toString());
        }
        certpathparameters = (ExtendedPKIXParameters)certpathparameters;
        Object obj = certpathparameters.h();
        if (!(obj instanceof X509AttributeCertStoreSelector))
        {
            throw new InvalidAlgorithmParameterException((new StringBuilder("TargetConstraints must be an instance of ")).append(org/spongycastle/x509/X509AttributeCertStoreSelector.getName()).append(" for ").append(getClass().getName()).append(" class.").toString());
        }
        obj = ((X509AttributeCertStoreSelector)obj).a();
        e.d(((org.spongycastle.x509.X509AttributeCertificate) (obj)), certpathparameters);
        CertPathValidatorResult certpathvalidatorresult = e.a(certpath, certpathparameters);
        Object obj1 = (X509Certificate)certpath.getCertificates().get(0);
        e.a(((X509Certificate) (obj1)));
        e.a(((X509Certificate) (obj1)), certpathparameters);
        e.c(((org.spongycastle.x509.X509AttributeCertificate) (obj)), certpathparameters);
        e.a(((org.spongycastle.x509.X509AttributeCertificate) (obj)), certpathparameters);
        e.b(((org.spongycastle.x509.X509AttributeCertificate) (obj)), certpathparameters);
        try
        {
            obj1 = CertPathValidatorUtilities.a(certpathparameters, null, -1);
        }
        // Misplaced declaration of an exception variable
        catch (CertPath certpath)
        {
            throw new ExtCertPathValidatorException("Could not get validity date from attribute certificate.", certpath);
        }
        e.a(((org.spongycastle.x509.X509AttributeCertificate) (obj)), certpathparameters, ((java.util.Date) (obj1)), certpath.getCertificates());
        return certpathvalidatorresult;
    }
}
