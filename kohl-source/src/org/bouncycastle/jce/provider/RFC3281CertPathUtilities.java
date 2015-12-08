// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.TargetInformation;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.x509.AttributeCertificateHolder;
import org.bouncycastle.x509.AttributeCertificateIssuer;
import org.bouncycastle.x509.ExtendedPKIXBuilderParameters;
import org.bouncycastle.x509.ExtendedPKIXParameters;
import org.bouncycastle.x509.PKIXAttrCertChecker;
import org.bouncycastle.x509.X509AttributeCertificate;
import org.bouncycastle.x509.X509CertStoreSelector;

// Referenced classes of package org.bouncycastle.jce.provider:
//            AnnotatedException, CertPathValidatorUtilities, CertStatus, ReasonsMask, 
//            RFC3280CertPathUtilities, BouncyCastleProvider

class RFC3281CertPathUtilities
{

    private static final String AUTHORITY_INFO_ACCESS;
    private static final String CRL_DISTRIBUTION_POINTS;
    private static final String NO_REV_AVAIL;
    private static final String TARGET_INFORMATION;

    RFC3281CertPathUtilities()
    {
    }

    protected static void additionalChecks(X509AttributeCertificate x509attributecertificate, ExtendedPKIXParameters extendedpkixparameters)
        throws CertPathValidatorException
    {
        for (Iterator iterator = extendedpkixparameters.getProhibitedACAttributes().iterator(); iterator.hasNext();)
        {
            String s1 = (String)iterator.next();
            if (x509attributecertificate.getAttributes(s1) != null)
            {
                throw new CertPathValidatorException((new StringBuilder()).append("Attribute certificate contains prohibited attribute: ").append(s1).append(".").toString());
            }
        }

        for (extendedpkixparameters = extendedpkixparameters.getNecessaryACAttributes().iterator(); extendedpkixparameters.hasNext();)
        {
            String s = (String)extendedpkixparameters.next();
            if (x509attributecertificate.getAttributes(s) == null)
            {
                throw new CertPathValidatorException((new StringBuilder()).append("Attribute certificate does not contain necessary attribute: ").append(s).append(".").toString());
            }
        }

    }

    private static void checkCRL(DistributionPoint distributionpoint, X509AttributeCertificate x509attributecertificate, ExtendedPKIXParameters extendedpkixparameters, Date date, X509Certificate x509certificate, CertStatus certstatus, ReasonsMask reasonsmask, List list)
        throws AnnotatedException
    {
        if (x509attributecertificate.getExtensionValue(X509Extensions.NoRevAvail.getId()) == null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Date date1;
        Iterator iterator;
        boolean flag;
        date1 = new Date(System.currentTimeMillis());
        if (date.getTime() > date1.getTime())
        {
            throw new AnnotatedException("Validation time is in future.");
        }
        iterator = CertPathValidatorUtilities.getCompleteCRLs(distributionpoint, x509attributecertificate, date1, extendedpkixparameters).iterator();
        x509certificate = null;
        flag = false;
_L4:
        if (!iterator.hasNext() || certstatus.getCertStatus() != 11 || reasonsmask.isAllReasons())
        {
            continue; /* Loop/switch isn't completed */
        }
        X509CRL x509crl1;
        ReasonsMask reasonsmask1;
        x509crl1 = (X509CRL)iterator.next();
        reasonsmask1 = RFC3280CertPathUtilities.processCRLD(x509crl1, distributionpoint);
        if (!reasonsmask1.hasNewReasons(reasonsmask)) goto _L4; else goto _L3
_L3:
        java.security.PublicKey publickey = RFC3280CertPathUtilities.processCRLG(x509crl1, RFC3280CertPathUtilities.processCRLF(x509crl1, x509attributecertificate, null, null, extendedpkixparameters, list));
        X509CRL x509crl = null;
        if (extendedpkixparameters.isUseDeltasEnabled())
        {
            x509crl = RFC3280CertPathUtilities.processCRLH(CertPathValidatorUtilities.getDeltaCRLs(date1, extendedpkixparameters, x509crl1), publickey);
        }
        if (extendedpkixparameters.getValidityModel() != 1 && x509attributecertificate.getNotAfter().getTime() < x509crl1.getThisUpdate().getTime())
        {
            throw new AnnotatedException("No valid CRL for current time found.");
        }
        RFC3280CertPathUtilities.processCRLB1(distributionpoint, x509attributecertificate, x509crl1);
        RFC3280CertPathUtilities.processCRLB2(distributionpoint, x509attributecertificate, x509crl1);
        RFC3280CertPathUtilities.processCRLC(x509crl, x509crl1, extendedpkixparameters);
        RFC3280CertPathUtilities.processCRLI(date, x509crl, x509attributecertificate, certstatus, extendedpkixparameters);
        RFC3280CertPathUtilities.processCRLJ(date, x509crl1, x509attributecertificate, certstatus);
        if (certstatus.getCertStatus() == 8)
        {
            certstatus.setCertStatus(11);
        }
        reasonsmask.addReasons(reasonsmask1);
        flag = true;
          goto _L4
        if (flag) goto _L1; else goto _L5
_L5:
        throw x509certificate;
        x509certificate;
          goto _L4
    }

    protected static void checkCRLs(X509AttributeCertificate x509attributecertificate, ExtendedPKIXParameters extendedpkixparameters, X509Certificate x509certificate, Date date, List list)
        throws CertPathValidatorException
    {
        if (!extendedpkixparameters.isRevocationEnabled()) goto _L2; else goto _L1
_L1:
        if (x509attributecertificate.getExtensionValue(NO_REV_AVAIL) != null) goto _L4; else goto _L3
_L3:
        Object obj;
        Object obj1;
        CertStatus certstatus;
        ReasonsMask reasonsmask;
        boolean flag;
        boolean flag1;
        DistributionPoint adistributionpoint[];
        int i;
        try
        {
            obj = CRLDistPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509attributecertificate, CRL_DISTRIBUTION_POINTS));
        }
        // Misplaced declaration of an exception variable
        catch (X509AttributeCertificate x509attributecertificate)
        {
            throw new CertPathValidatorException("CRL distribution point extension could not be read.", x509attributecertificate);
        }
        try
        {
            CertPathValidatorUtilities.addAdditionalStoresFromCRLDistributionPoint(((CRLDistPoint) (obj)), extendedpkixparameters);
        }
        // Misplaced declaration of an exception variable
        catch (X509AttributeCertificate x509attributecertificate)
        {
            throw new CertPathValidatorException("No additional CRL locations could be decoded from CRL distribution point extension.", x509attributecertificate);
        }
        certstatus = new CertStatus();
        reasonsmask = new ReasonsMask();
        obj1 = null;
        if (obj == null) goto _L6; else goto _L5
_L5:
        try
        {
            adistributionpoint = ((CRLDistPoint) (obj)).getDistributionPoints();
        }
        // Misplaced declaration of an exception variable
        catch (X509AttributeCertificate x509attributecertificate)
        {
            throw new ExtCertPathValidatorException("Distribution points could not be read.", x509attributecertificate);
        }
        i = 0;
        flag = false;
        flag1 = flag;
        obj = obj1;
        if (i >= adistributionpoint.length)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag;
        obj = obj1;
        if (certstatus.getCertStatus() != 11)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag;
        obj = obj1;
        if (reasonsmask.isAllReasons())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (ExtendedPKIXParameters)extendedpkixparameters.clone();
        checkCRL(adistributionpoint[i], x509attributecertificate, ((ExtendedPKIXParameters) (obj)), date, x509certificate, certstatus, reasonsmask, list);
        flag = true;
        i++;
        if (true) goto _L8; else goto _L7
_L8:
        break MISSING_BLOCK_LABEL_76;
        obj;
        obj = new AnnotatedException("No valid CRL for distribution point found.", ((Throwable) (obj)));
        flag1 = flag;
_L7:
        flag = flag1;
        obj1 = obj;
        if (certstatus.getCertStatus() != 11)
        {
            break MISSING_BLOCK_LABEL_345;
        }
        flag = flag1;
        obj1 = obj;
        if (reasonsmask.isAllReasons())
        {
            break MISSING_BLOCK_LABEL_345;
        }
        obj1 = (new ASN1InputStream(((X500Principal)x509attributecertificate.getIssuer().getPrincipals()[0]).getEncoded())).readObject();
        checkCRL(new DistributionPoint(new DistributionPointName(0, new GeneralNames(new GeneralName(4, ((org.bouncycastle.asn1.ASN1Encodable) (obj1))))), null, null), x509attributecertificate, (ExtendedPKIXParameters)extendedpkixparameters.clone(), date, x509certificate, certstatus, reasonsmask, list);
        flag = true;
        obj1 = obj;
_L10:
        if (!flag)
        {
            throw new ExtCertPathValidatorException("No valid CRL found.", ((Throwable) (obj1)));
        }
        break; /* Loop/switch isn't completed */
        x509attributecertificate;
        try
        {
            throw new AnnotatedException("Issuer from certificate for CRL could not be reencoded.", x509attributecertificate);
        }
        // Misplaced declaration of an exception variable
        catch (X509AttributeCertificate x509attributecertificate)
        {
            obj1 = new AnnotatedException("No valid CRL for distribution point found.", x509attributecertificate);
        }
        flag = flag1;
        if (true) goto _L10; else goto _L9
_L9:
        if (certstatus.getCertStatus() != 11)
        {
            x509attributecertificate = (new StringBuilder()).append("Attribute certificate revocation after ").append(certstatus.getRevocationDate()).toString();
            throw new CertPathValidatorException((new StringBuilder()).append(x509attributecertificate).append(", reason: ").append(RFC3280CertPathUtilities.crlReasons[certstatus.getCertStatus()]).toString());
        }
        if (!reasonsmask.isAllReasons() && certstatus.getCertStatus() == 11)
        {
            certstatus.setCertStatus(12);
        }
        if (certstatus.getCertStatus() == 12)
        {
            throw new CertPathValidatorException("Attribute certificate status could not be determined.");
        }
          goto _L2
_L4:
        if (x509attributecertificate.getExtensionValue(CRL_DISTRIBUTION_POINTS) != null || x509attributecertificate.getExtensionValue(AUTHORITY_INFO_ACCESS) != null)
        {
            throw new CertPathValidatorException("No rev avail extension is set, but also an AC revocation pointer.");
        }
_L2:
        return;
_L6:
        flag1 = false;
        obj = obj1;
        if (true) goto _L7; else goto _L11
_L11:
    }

    protected static CertPath processAttrCert1(X509AttributeCertificate x509attributecertificate, ExtendedPKIXParameters extendedpkixparameters)
        throws CertPathValidatorException
    {
        ExtendedPKIXBuilderParameters extendedpkixbuilderparameters;
        Object obj2;
        Object obj = null;
        boolean flag = false;
        obj2 = new HashSet();
        if (x509attributecertificate.getHolder().getIssuer() != null)
        {
            X509CertStoreSelector x509certstoreselector = new X509CertStoreSelector();
            x509certstoreselector.setSerialNumber(x509attributecertificate.getHolder().getSerialNumber());
            java.security.Principal aprincipal[] = x509attributecertificate.getHolder().getIssuer();
            int i = 0;
            while (i < aprincipal.length) 
            {
                try
                {
                    if (aprincipal[i] instanceof X500Principal)
                    {
                        x509certstoreselector.setIssuer(((X500Principal)aprincipal[i]).getEncoded());
                    }
                    ((Set) (obj2)).addAll(CertPathValidatorUtilities.findCertificates(x509certstoreselector, extendedpkixparameters.getStores()));
                }
                // Misplaced declaration of an exception variable
                catch (X509AttributeCertificate x509attributecertificate)
                {
                    throw new ExtCertPathValidatorException("Public key certificate for attribute certificate cannot be searched.", x509attributecertificate);
                }
                // Misplaced declaration of an exception variable
                catch (X509AttributeCertificate x509attributecertificate)
                {
                    throw new ExtCertPathValidatorException("Unable to encode X500 principal.", x509attributecertificate);
                }
                i++;
            }
            if (((Set) (obj2)).isEmpty())
            {
                throw new CertPathValidatorException("Public key certificate specified in base certificate ID for attribute certificate cannot be found.");
            }
        }
        if (x509attributecertificate.getHolder().getEntityNames() != null)
        {
            X509CertStoreSelector x509certstoreselector1 = new X509CertStoreSelector();
            x509attributecertificate = x509attributecertificate.getHolder().getEntityNames();
            int j = ((flag) ? 1 : 0);
            while (j < x509attributecertificate.length) 
            {
                try
                {
                    if (x509attributecertificate[j] instanceof X500Principal)
                    {
                        x509certstoreselector1.setIssuer(((X500Principal)x509attributecertificate[j]).getEncoded());
                    }
                    ((Set) (obj2)).addAll(CertPathValidatorUtilities.findCertificates(x509certstoreselector1, extendedpkixparameters.getStores()));
                }
                // Misplaced declaration of an exception variable
                catch (X509AttributeCertificate x509attributecertificate)
                {
                    throw new ExtCertPathValidatorException("Public key certificate for attribute certificate cannot be searched.", x509attributecertificate);
                }
                // Misplaced declaration of an exception variable
                catch (X509AttributeCertificate x509attributecertificate)
                {
                    throw new ExtCertPathValidatorException("Unable to encode X500 principal.", x509attributecertificate);
                }
                j++;
            }
            if (((Set) (obj2)).isEmpty())
            {
                throw new CertPathValidatorException("Public key certificate specified in entity name for attribute certificate cannot be found.");
            }
        }
        extendedpkixbuilderparameters = (ExtendedPKIXBuilderParameters)ExtendedPKIXBuilderParameters.getInstance(extendedpkixparameters);
        obj2 = ((Set) (obj2)).iterator();
        extendedpkixparameters = null;
        x509attributecertificate = obj;
_L2:
        if (!((Iterator) (obj2)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1 = new X509CertStoreSelector();
        ((X509CertStoreSelector) (obj1)).setCertificate((X509Certificate)((Iterator) (obj2)).next());
        extendedpkixbuilderparameters.setTargetConstraints(((org.bouncycastle.util.Selector) (obj1)));
        try
        {
            obj1 = CertPathBuilder.getInstance("PKIX", BouncyCastleProvider.PROVIDER_NAME);
        }
        // Misplaced declaration of an exception variable
        catch (X509AttributeCertificate x509attributecertificate)
        {
            throw new ExtCertPathValidatorException("Support class could not be created.", x509attributecertificate);
        }
        // Misplaced declaration of an exception variable
        catch (X509AttributeCertificate x509attributecertificate)
        {
            throw new ExtCertPathValidatorException("Support class could not be created.", x509attributecertificate);
        }
        obj1 = ((CertPathBuilder) (obj1)).build(ExtendedPKIXBuilderParameters.getInstance(extendedpkixbuilderparameters));
        x509attributecertificate = ((X509AttributeCertificate) (obj1));
        obj1 = extendedpkixparameters;
        extendedpkixparameters = x509attributecertificate;
        x509attributecertificate = ((X509AttributeCertificate) (obj1));
_L3:
        obj1 = extendedpkixparameters;
        extendedpkixparameters = x509attributecertificate;
        x509attributecertificate = ((X509AttributeCertificate) (obj1));
        if (true) goto _L2; else goto _L1
        extendedpkixparameters;
        ExtCertPathValidatorException extcertpathvalidatorexception = new ExtCertPathValidatorException("Certification path for public key certificate of attribute certificate could not be build.", extendedpkixparameters);
        extendedpkixparameters = x509attributecertificate;
        x509attributecertificate = extcertpathvalidatorexception;
          goto _L3
        x509attributecertificate;
        throw new RuntimeException(x509attributecertificate.getMessage());
_L1:
        if (extendedpkixparameters != null)
        {
            throw extendedpkixparameters;
        } else
        {
            return x509attributecertificate.getCertPath();
        }
    }

    protected static CertPathValidatorResult processAttrCert2(CertPath certpath, ExtendedPKIXParameters extendedpkixparameters)
        throws CertPathValidatorException
    {
        CertPathValidator certpathvalidator;
        try
        {
            certpathvalidator = CertPathValidator.getInstance("PKIX", BouncyCastleProvider.PROVIDER_NAME);
        }
        // Misplaced declaration of an exception variable
        catch (CertPath certpath)
        {
            throw new ExtCertPathValidatorException("Support class could not be created.", certpath);
        }
        // Misplaced declaration of an exception variable
        catch (CertPath certpath)
        {
            throw new ExtCertPathValidatorException("Support class could not be created.", certpath);
        }
        try
        {
            certpath = certpathvalidator.validate(certpath, extendedpkixparameters);
        }
        // Misplaced declaration of an exception variable
        catch (CertPath certpath)
        {
            throw new ExtCertPathValidatorException("Certification path for issuer certificate of attribute certificate could not be validated.", certpath);
        }
        // Misplaced declaration of an exception variable
        catch (CertPath certpath)
        {
            throw new RuntimeException(certpath.getMessage());
        }
        return certpath;
    }

    protected static void processAttrCert3(X509Certificate x509certificate, ExtendedPKIXParameters extendedpkixparameters)
        throws CertPathValidatorException
    {
        if (x509certificate.getKeyUsage() != null && !x509certificate.getKeyUsage()[0] && !x509certificate.getKeyUsage()[1])
        {
            throw new CertPathValidatorException("Attribute certificate issuer public key cannot be used to validate digital signatures.");
        }
        if (x509certificate.getBasicConstraints() != -1)
        {
            throw new CertPathValidatorException("Attribute certificate issuer is also a public key certificate issuer.");
        } else
        {
            return;
        }
    }

    protected static void processAttrCert4(X509Certificate x509certificate, ExtendedPKIXParameters extendedpkixparameters)
        throws CertPathValidatorException
    {
        extendedpkixparameters = extendedpkixparameters.getTrustedACIssuers().iterator();
        boolean flag = false;
        do
        {
            if (!extendedpkixparameters.hasNext())
            {
                break;
            }
            TrustAnchor trustanchor = (TrustAnchor)extendedpkixparameters.next();
            if (x509certificate.getSubjectX500Principal().getName("RFC2253").equals(trustanchor.getCAName()) || x509certificate.equals(trustanchor.getTrustedCert()))
            {
                flag = true;
            }
        } while (true);
        if (!flag)
        {
            throw new CertPathValidatorException("Attribute certificate issuer is not directly trusted.");
        } else
        {
            return;
        }
    }

    protected static void processAttrCert5(X509AttributeCertificate x509attributecertificate, ExtendedPKIXParameters extendedpkixparameters)
        throws CertPathValidatorException
    {
        try
        {
            x509attributecertificate.checkValidity(CertPathValidatorUtilities.getValidDate(extendedpkixparameters));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (X509AttributeCertificate x509attributecertificate)
        {
            throw new ExtCertPathValidatorException("Attribute certificate is not valid.", x509attributecertificate);
        }
        // Misplaced declaration of an exception variable
        catch (X509AttributeCertificate x509attributecertificate)
        {
            throw new ExtCertPathValidatorException("Attribute certificate is not valid.", x509attributecertificate);
        }
    }

    protected static void processAttrCert7(X509AttributeCertificate x509attributecertificate, CertPath certpath, CertPath certpath1, ExtendedPKIXParameters extendedpkixparameters)
        throws CertPathValidatorException
    {
        Set set = x509attributecertificate.getCriticalExtensionOIDs();
        if (set.contains(TARGET_INFORMATION))
        {
            try
            {
                TargetInformation.getInstance(CertPathValidatorUtilities.getExtensionValue(x509attributecertificate, TARGET_INFORMATION));
            }
            // Misplaced declaration of an exception variable
            catch (X509AttributeCertificate x509attributecertificate)
            {
                throw new ExtCertPathValidatorException("Target information extension could not be read.", x509attributecertificate);
            }
            // Misplaced declaration of an exception variable
            catch (X509AttributeCertificate x509attributecertificate)
            {
                throw new ExtCertPathValidatorException("Target information extension could not be read.", x509attributecertificate);
            }
        }
        set.remove(TARGET_INFORMATION);
        for (extendedpkixparameters = extendedpkixparameters.getAttrCertCheckers().iterator(); extendedpkixparameters.hasNext(); ((PKIXAttrCertChecker)extendedpkixparameters.next()).check(x509attributecertificate, certpath, certpath1, set)) { }
        if (!set.isEmpty())
        {
            throw new CertPathValidatorException((new StringBuilder()).append("Attribute certificate contains unsupported critical extensions: ").append(set).toString());
        } else
        {
            return;
        }
    }

    static 
    {
        TARGET_INFORMATION = X509Extensions.TargetInformation.getId();
        NO_REV_AVAIL = X509Extensions.NoRevAvail.getId();
        CRL_DISTRIBUTION_POINTS = X509Extensions.CRLDistributionPoints.getId();
        AUTHORITY_INFO_ACCESS = X509Extensions.AuthorityInfoAccess.getId();
    }
}
