// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidator;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathBuilderResult;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jce.exception.ExtCertPathBuilderException;
import org.bouncycastle.x509.AttributeCertificateIssuer;
import org.bouncycastle.x509.ExtendedPKIXBuilderParameters;
import org.bouncycastle.x509.X509AttributeCertStoreSelector;
import org.bouncycastle.x509.X509AttributeCertificate;
import org.bouncycastle.x509.X509CertStoreSelector;

// Referenced classes of package org.bouncycastle.jce.provider:
//            AnnotatedException, BouncyCastleProvider, CertPathValidatorUtilities

public class PKIXAttrCertPathBuilderSpi extends CertPathBuilderSpi
{

    private Exception certPathException;

    public PKIXAttrCertPathBuilderSpi()
    {
    }

    private CertPathBuilderResult build(X509AttributeCertificate x509attributecertificate, X509Certificate x509certificate, ExtendedPKIXBuilderParameters extendedpkixbuilderparameters, List list)
    {
        CertPathBuilderResult certpathbuilderresult;
        X509Certificate x509certificate1;
        x509certificate1 = null;
        certpathbuilderresult = null;
        if (!list.contains(x509certificate)) goto _L2; else goto _L1
_L1:
        extendedpkixbuilderparameters = null;
_L5:
        return extendedpkixbuilderparameters;
_L2:
        CertPathBuilderResult certpathbuilderresult1;
        if (extendedpkixbuilderparameters.getExcludedCerts().contains(x509certificate))
        {
            return null;
        }
        if (extendedpkixbuilderparameters.getMaxPathLength() != -1 && list.size() - 1 > extendedpkixbuilderparameters.getMaxPathLength())
        {
            return null;
        }
        list.add(x509certificate);
        CertPathValidator certpathvalidator;
        CertificateFactory certificatefactory;
        java.security.cert.TrustAnchor trustanchor;
        try
        {
            certificatefactory = CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME);
            certpathvalidator = CertPathValidator.getInstance("RFC3281", BouncyCastleProvider.PROVIDER_NAME);
        }
        // Misplaced declaration of an exception variable
        catch (X509AttributeCertificate x509attributecertificate)
        {
            throw new RuntimeException("Exception creating support classes.");
        }
        certpathbuilderresult1 = certpathbuilderresult;
        trustanchor = CertPathValidatorUtilities.findTrustAnchor(x509certificate, extendedpkixbuilderparameters.getTrustAnchors(), extendedpkixbuilderparameters.getSigProvider());
        if (trustanchor == null) goto _L4; else goto _L3
_L3:
        certpathbuilderresult1 = certpathbuilderresult;
        x509attributecertificate = certificatefactory.generateCertPath(list);
        certpathbuilderresult1 = certpathbuilderresult;
        extendedpkixbuilderparameters = (PKIXCertPathValidatorResult)certpathvalidator.validate(x509attributecertificate, extendedpkixbuilderparameters);
        certpathbuilderresult1 = certpathbuilderresult;
        x509attributecertificate = new PKIXCertPathBuilderResult(x509attributecertificate, extendedpkixbuilderparameters.getTrustAnchor(), extendedpkixbuilderparameters.getPolicyTree(), extendedpkixbuilderparameters.getPublicKey());
        return x509attributecertificate;
        x509attributecertificate;
        certpathbuilderresult1 = certpathbuilderresult;
        try
        {
            throw new AnnotatedException("Certification path could not be constructed from certificate list.", x509attributecertificate);
        }
        // Misplaced declaration of an exception variable
        catch (X509AttributeCertificate x509attributecertificate)
        {
            certPathException = new AnnotatedException("No valid certification path could be build.", x509attributecertificate);
        }
        x509attributecertificate = certpathbuilderresult1;
_L8:
        extendedpkixbuilderparameters = x509attributecertificate;
        if (x509attributecertificate == null)
        {
            list.remove(x509certificate);
            return x509attributecertificate;
        }
          goto _L5
        x509attributecertificate;
        certpathbuilderresult1 = certpathbuilderresult;
        throw new AnnotatedException("Certification path could not be validated.", x509attributecertificate);
_L4:
        certpathbuilderresult1 = certpathbuilderresult;
        CertPathValidatorUtilities.addAdditionalStoresFromAltNames(x509certificate, extendedpkixbuilderparameters);
        certpathbuilderresult1 = certpathbuilderresult;
        Object obj = new HashSet();
        ((Collection) (obj)).addAll(CertPathValidatorUtilities.findIssuerCerts(x509certificate, extendedpkixbuilderparameters));
        certpathbuilderresult1 = certpathbuilderresult;
        if (!((Collection) (obj)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_341;
        }
        certpathbuilderresult1 = certpathbuilderresult;
        throw new AnnotatedException("No issuer certificate for certificate in certification path found.");
        x509attributecertificate;
        certpathbuilderresult1 = certpathbuilderresult;
        throw new AnnotatedException("No additional X.509 stores can be added from certificate locations.", x509attributecertificate);
        x509attributecertificate;
        certpathbuilderresult1 = certpathbuilderresult;
        throw new AnnotatedException("Cannot find issuer certificate for certificate in certification path.", x509attributecertificate);
        certpathbuilderresult1 = certpathbuilderresult;
        obj = ((Collection) (obj)).iterator();
        certpathbuilderresult = x509certificate1;
_L7:
        certpathbuilderresult1 = certpathbuilderresult;
        if (!((Iterator) (obj)).hasNext() || certpathbuilderresult != null)
        {
            break; /* Loop/switch isn't completed */
        }
        certpathbuilderresult1 = certpathbuilderresult;
        x509certificate1 = (X509Certificate)((Iterator) (obj)).next();
        certpathbuilderresult1 = certpathbuilderresult;
        if (x509certificate1.getIssuerX500Principal().equals(x509certificate1.getSubjectX500Principal()))
        {
            continue; /* Loop/switch isn't completed */
        }
        certpathbuilderresult1 = certpathbuilderresult;
        certpathbuilderresult = build(x509attributecertificate, x509certificate1, extendedpkixbuilderparameters, list);
        if (true) goto _L7; else goto _L6
_L6:
        x509attributecertificate = certpathbuilderresult;
          goto _L8
    }

    public CertPathBuilderResult engineBuild(CertPathParameters certpathparameters)
        throws CertPathBuilderException, InvalidAlgorithmParameterException
    {
        if (!(certpathparameters instanceof PKIXBuilderParameters) && !(certpathparameters instanceof ExtendedPKIXBuilderParameters))
        {
            throw new InvalidAlgorithmParameterException((new StringBuilder()).append("Parameters must be an instance of ").append(java/security/cert/PKIXBuilderParameters.getName()).append(" or ").append(org/bouncycastle/x509/ExtendedPKIXBuilderParameters.getName()).append(".").toString());
        }
        ExtendedPKIXBuilderParameters extendedpkixbuilderparameters;
        ArrayList arraylist;
        if (certpathparameters instanceof ExtendedPKIXBuilderParameters)
        {
            extendedpkixbuilderparameters = (ExtendedPKIXBuilderParameters)certpathparameters;
        } else
        {
            extendedpkixbuilderparameters = (ExtendedPKIXBuilderParameters)ExtendedPKIXBuilderParameters.getInstance((PKIXBuilderParameters)certpathparameters);
        }
        arraylist = new ArrayList();
        certpathparameters = extendedpkixbuilderparameters.getTargetConstraints();
        if (!(certpathparameters instanceof X509AttributeCertStoreSelector))
        {
            throw new CertPathBuilderException((new StringBuilder()).append("TargetConstraints must be an instance of ").append(org/bouncycastle/x509/X509AttributeCertStoreSelector.getName()).append(" for ").append(getClass().getName()).append(" class.").toString());
        }
        Object obj;
        try
        {
            obj = CertPathValidatorUtilities.findCertificates((X509AttributeCertStoreSelector)certpathparameters, extendedpkixbuilderparameters.getStores());
        }
        // Misplaced declaration of an exception variable
        catch (CertPathParameters certpathparameters)
        {
            throw new ExtCertPathBuilderException("Error finding target attribute certificate.", certpathparameters);
        }
        if (((Collection) (obj)).isEmpty())
        {
            throw new CertPathBuilderException("No attribute certificate found matching targetContraints.");
        }
        certpathparameters = null;
        for (obj = ((Collection) (obj)).iterator(); ((Iterator) (obj)).hasNext() && certpathparameters == null;)
        {
            X509AttributeCertificate x509attributecertificate = (X509AttributeCertificate)((Iterator) (obj)).next();
            Object obj1 = new X509CertStoreSelector();
            java.security.Principal aprincipal[] = x509attributecertificate.getIssuer().getPrincipals();
            HashSet hashset = new HashSet();
            int i = 0;
            while (i < aprincipal.length) 
            {
                try
                {
                    if (aprincipal[i] instanceof X500Principal)
                    {
                        ((X509CertStoreSelector) (obj1)).setSubject(((X500Principal)aprincipal[i]).getEncoded());
                    }
                    hashset.addAll(CertPathValidatorUtilities.findCertificates(((X509CertStoreSelector) (obj1)), extendedpkixbuilderparameters.getStores()));
                    hashset.addAll(CertPathValidatorUtilities.findCertificates(((X509CertStoreSelector) (obj1)), extendedpkixbuilderparameters.getCertStores()));
                }
                // Misplaced declaration of an exception variable
                catch (CertPathParameters certpathparameters)
                {
                    throw new ExtCertPathBuilderException("Public key certificate for attribute certificate cannot be searched.", certpathparameters);
                }
                // Misplaced declaration of an exception variable
                catch (CertPathParameters certpathparameters)
                {
                    throw new ExtCertPathBuilderException("cannot encode X500Principal.", certpathparameters);
                }
                i++;
            }
            if (hashset.isEmpty())
            {
                throw new CertPathBuilderException("Public key certificate for attribute certificate cannot be found.");
            }
            obj1 = hashset.iterator();
            while (((Iterator) (obj1)).hasNext() && certpathparameters == null) 
            {
                certpathparameters = build(x509attributecertificate, (X509Certificate)((Iterator) (obj1)).next(), extendedpkixbuilderparameters, arraylist);
            }
        }

        if (certpathparameters == null && certPathException != null)
        {
            throw new ExtCertPathBuilderException("Possible certificate chain could not be validated.", certPathException);
        }
        if (certpathparameters == null && certPathException == null)
        {
            throw new CertPathBuilderException("Unable to find certificate chain.");
        } else
        {
            return certpathparameters;
        }
    }
}
