// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.X509Certificate;
import java.util.List;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.x509.ExtendedPKIXParameters;
import org.bouncycastle.x509.X509AttributeCertStoreSelector;

// Referenced classes of package org.bouncycastle.jce.provider:
//            AnnotatedException, RFC3281CertPathUtilities, CertPathValidatorUtilities

public class PKIXAttrCertPathValidatorSpi extends CertPathValidatorSpi
{

    public PKIXAttrCertPathValidatorSpi()
    {
    }

    public CertPathValidatorResult engineValidate(CertPath certpath, CertPathParameters certpathparameters)
        throws CertPathValidatorException, InvalidAlgorithmParameterException
    {
        if (!(certpathparameters instanceof ExtendedPKIXParameters))
        {
            throw new InvalidAlgorithmParameterException((new StringBuilder()).append("Parameters must be a ").append(org/bouncycastle/x509/ExtendedPKIXParameters.getName()).append(" instance.").toString());
        }
        certpathparameters = (ExtendedPKIXParameters)certpathparameters;
        Object obj = certpathparameters.getTargetConstraints();
        if (!(obj instanceof X509AttributeCertStoreSelector))
        {
            throw new InvalidAlgorithmParameterException((new StringBuilder()).append("TargetConstraints must be an instance of ").append(org/bouncycastle/x509/X509AttributeCertStoreSelector.getName()).append(" for ").append(getClass().getName()).append(" class.").toString());
        }
        obj = ((X509AttributeCertStoreSelector)obj).getAttributeCert();
        Object obj1 = RFC3281CertPathUtilities.processAttrCert1(((org.bouncycastle.x509.X509AttributeCertificate) (obj)), certpathparameters);
        CertPathValidatorResult certpathvalidatorresult = RFC3281CertPathUtilities.processAttrCert2(certpath, certpathparameters);
        X509Certificate x509certificate = (X509Certificate)certpath.getCertificates().get(0);
        RFC3281CertPathUtilities.processAttrCert3(x509certificate, certpathparameters);
        RFC3281CertPathUtilities.processAttrCert4(x509certificate, certpathparameters);
        RFC3281CertPathUtilities.processAttrCert5(((org.bouncycastle.x509.X509AttributeCertificate) (obj)), certpathparameters);
        RFC3281CertPathUtilities.processAttrCert7(((org.bouncycastle.x509.X509AttributeCertificate) (obj)), certpath, ((CertPath) (obj1)), certpathparameters);
        RFC3281CertPathUtilities.additionalChecks(((org.bouncycastle.x509.X509AttributeCertificate) (obj)), certpathparameters);
        try
        {
            obj1 = CertPathValidatorUtilities.getValidCertDateFromValidityModel(certpathparameters, null, -1);
        }
        // Misplaced declaration of an exception variable
        catch (CertPath certpath)
        {
            throw new ExtCertPathValidatorException("Could not get validity date from attribute certificate.", certpath);
        }
        RFC3281CertPathUtilities.checkCRLs(((org.bouncycastle.x509.X509AttributeCertificate) (obj)), certpathparameters, x509certificate, ((java.util.Date) (obj1)), certpath.getCertificates());
        return certpathvalidatorresult;
    }
}
