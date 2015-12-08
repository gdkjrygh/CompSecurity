// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

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
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.x509.CRLDistPoint;
import org.spongycastle.asn1.x509.DistributionPoint;
import org.spongycastle.asn1.x509.DistributionPointName;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.asn1.x509.GeneralNames;
import org.spongycastle.asn1.x509.TargetInformation;
import org.spongycastle.asn1.x509.X509Extensions;
import org.spongycastle.jce.exception.ExtCertPathValidatorException;
import org.spongycastle.x509.AttributeCertificateHolder;
import org.spongycastle.x509.AttributeCertificateIssuer;
import org.spongycastle.x509.ExtendedPKIXBuilderParameters;
import org.spongycastle.x509.ExtendedPKIXParameters;
import org.spongycastle.x509.X509AttributeCertificate;
import org.spongycastle.x509.X509CertStoreSelector;

// Referenced classes of package org.spongycastle.jce.provider:
//            BouncyCastleProvider, AnnotatedException, CertPathValidatorUtilities, c, 
//            f, RFC3280CertPathUtilities

final class e
{

    private static final String a;
    private static final String b;
    private static final String c;
    private static final String d;

    protected static CertPathValidatorResult a(CertPath certpath, ExtendedPKIXParameters extendedpkixparameters)
    {
        CertPathValidator certpathvalidator;
        try
        {
            certpathvalidator = CertPathValidator.getInstance("PKIX", BouncyCastleProvider.a);
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

    protected static void a(X509Certificate x509certificate)
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

    protected static void a(X509Certificate x509certificate, ExtendedPKIXParameters extendedpkixparameters)
    {
        extendedpkixparameters = extendedpkixparameters.i().iterator();
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

    private static void a(DistributionPoint distributionpoint, X509AttributeCertificate x509attributecertificate, ExtendedPKIXParameters extendedpkixparameters, Date date, c c1, f f1, List list)
    {
        if (x509attributecertificate.getExtensionValue(X509Extensions.D.c()) == null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        AnnotatedException annotatedexception;
        Date date1;
        Iterator iterator;
        boolean flag;
        date1 = new Date(System.currentTimeMillis());
        if (date.getTime() > date1.getTime())
        {
            throw new AnnotatedException("Validation time is in future.");
        }
        iterator = CertPathValidatorUtilities.a(distributionpoint, x509attributecertificate, date1, extendedpkixparameters).iterator();
        flag = false;
        annotatedexception = null;
_L4:
        if (!iterator.hasNext() || c1.a != 11 || f1.a())
        {
            continue; /* Loop/switch isn't completed */
        }
        X509CRL x509crl1;
        f f2;
        x509crl1 = (X509CRL)iterator.next();
        f2 = RFC3280CertPathUtilities.a(x509crl1, distributionpoint);
        if (!f2.c(f1)) goto _L4; else goto _L3
_L3:
        java.security.PublicKey publickey = RFC3280CertPathUtilities.a(x509crl1, RFC3280CertPathUtilities.a(x509crl1, null, null, extendedpkixparameters, list));
        X509CRL x509crl = null;
        if (extendedpkixparameters.c())
        {
            x509crl = RFC3280CertPathUtilities.a(CertPathValidatorUtilities.a(date1, extendedpkixparameters, x509crl1), publickey);
        }
        if (extendedpkixparameters.d() != 1 && x509attributecertificate.b().getTime() < x509crl1.getThisUpdate().getTime())
        {
            throw new AnnotatedException("No valid CRL for current time found.");
        }
        RFC3280CertPathUtilities.b(distributionpoint, x509attributecertificate, x509crl1);
        RFC3280CertPathUtilities.a(distributionpoint, x509attributecertificate, x509crl1);
        RFC3280CertPathUtilities.a(x509crl, x509crl1, extendedpkixparameters);
        RFC3280CertPathUtilities.a(date, x509crl, x509attributecertificate, c1, extendedpkixparameters);
        RFC3280CertPathUtilities.a(date, x509crl1, x509attributecertificate, c1);
        if (c1.a == 8)
        {
            c1.a = 11;
        }
        f1.a(f2);
        flag = true;
          goto _L4
        if (flag) goto _L1; else goto _L5
_L5:
        throw annotatedexception;
        annotatedexception;
          goto _L4
    }

    protected static void a(X509AttributeCertificate x509attributecertificate, ExtendedPKIXParameters extendedpkixparameters)
    {
        Set set = x509attributecertificate.getCriticalExtensionOIDs();
        if (set.contains(a))
        {
            try
            {
                TargetInformation.a(CertPathValidatorUtilities.a(x509attributecertificate, a));
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
        set.remove(a);
        for (x509attributecertificate = extendedpkixparameters.l().iterator(); x509attributecertificate.hasNext(); x509attributecertificate.next()) { }
        if (!set.isEmpty())
        {
            throw new CertPathValidatorException((new StringBuilder("Attribute certificate contains unsupported critical extensions: ")).append(set).toString());
        } else
        {
            return;
        }
    }

    protected static void a(X509AttributeCertificate x509attributecertificate, ExtendedPKIXParameters extendedpkixparameters, Date date, List list)
    {
        if (!extendedpkixparameters.isRevocationEnabled()) goto _L2; else goto _L1
_L1:
        if (x509attributecertificate.getExtensionValue(b) != null) goto _L4; else goto _L3
_L3:
        Object obj;
        Object obj1;
        c c1;
        f f1;
        boolean flag;
        boolean flag1;
        DistributionPoint adistributionpoint[];
        int i;
        try
        {
            obj = CRLDistPoint.a(CertPathValidatorUtilities.a(x509attributecertificate, c));
        }
        // Misplaced declaration of an exception variable
        catch (X509AttributeCertificate x509attributecertificate)
        {
            throw new CertPathValidatorException("CRL distribution point extension could not be read.", x509attributecertificate);
        }
        try
        {
            CertPathValidatorUtilities.a(((CRLDistPoint) (obj)), extendedpkixparameters);
        }
        // Misplaced declaration of an exception variable
        catch (X509AttributeCertificate x509attributecertificate)
        {
            throw new CertPathValidatorException("No additional CRL locations could be decoded from CRL distribution point extension.", x509attributecertificate);
        }
        c1 = new c();
        f1 = new f();
        obj1 = null;
        if (obj == null) goto _L6; else goto _L5
_L5:
        try
        {
            adistributionpoint = ((CRLDistPoint) (obj)).c();
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
        if (c1.a != 11)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag;
        obj = obj1;
        if (f1.a())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (ExtendedPKIXParameters)extendedpkixparameters.clone();
        a(adistributionpoint[i], x509attributecertificate, ((ExtendedPKIXParameters) (obj)), date, c1, f1, list);
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
        if (c1.a != 11)
        {
            break MISSING_BLOCK_LABEL_341;
        }
        flag = flag1;
        obj1 = obj;
        if (f1.a())
        {
            break MISSING_BLOCK_LABEL_341;
        }
        obj1 = (new ASN1InputStream(((X500Principal)x509attributecertificate.d().a()[0]).getEncoded())).b();
        a(new DistributionPoint(new DistributionPointName(new GeneralNames(new GeneralName(4, ((org.spongycastle.asn1.ASN1Encodable) (obj1)))))), x509attributecertificate, (ExtendedPKIXParameters)extendedpkixparameters.clone(), date, c1, f1, list);
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
        if (c1.a != 11)
        {
            x509attributecertificate = (new StringBuilder("Attribute certificate revocation after ")).append(c1.b).toString();
            throw new CertPathValidatorException((new StringBuilder()).append(x509attributecertificate).append(", reason: ").append(RFC3280CertPathUtilities.o[c1.a]).toString());
        }
        if (!f1.a() && c1.a == 11)
        {
            c1.a = 12;
        }
        if (c1.a == 12)
        {
            throw new CertPathValidatorException("Attribute certificate status could not be determined.");
        }
          goto _L2
_L4:
        if (x509attributecertificate.getExtensionValue(c) != null || x509attributecertificate.getExtensionValue(d) != null)
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

    protected static void b(X509AttributeCertificate x509attributecertificate, ExtendedPKIXParameters extendedpkixparameters)
    {
        for (Iterator iterator = extendedpkixparameters.k().iterator(); iterator.hasNext();)
        {
            String s1 = (String)iterator.next();
            if (x509attributecertificate.a(s1) != null)
            {
                throw new CertPathValidatorException((new StringBuilder("Attribute certificate contains prohibited attribute: ")).append(s1).append(".").toString());
            }
        }

        for (extendedpkixparameters = extendedpkixparameters.j().iterator(); extendedpkixparameters.hasNext();)
        {
            String s = (String)extendedpkixparameters.next();
            if (x509attributecertificate.a(s) == null)
            {
                throw new CertPathValidatorException((new StringBuilder("Attribute certificate does not contain necessary attribute: ")).append(s).append(".").toString());
            }
        }

    }

    protected static void c(X509AttributeCertificate x509attributecertificate, ExtendedPKIXParameters extendedpkixparameters)
    {
        try
        {
            x509attributecertificate.a(CertPathValidatorUtilities.a(extendedpkixparameters));
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

    protected static CertPath d(X509AttributeCertificate x509attributecertificate, ExtendedPKIXParameters extendedpkixparameters)
    {
        Object obj = null;
        boolean flag = false;
        Object obj2 = new HashSet();
        if (x509attributecertificate.c().b() != null)
        {
            X509CertStoreSelector x509certstoreselector = new X509CertStoreSelector();
            x509certstoreselector.setSerialNumber(x509attributecertificate.c().c());
            java.security.Principal aprincipal[] = x509attributecertificate.c().b();
            int i = 0;
            while (i < aprincipal.length) 
            {
                try
                {
                    if (aprincipal[i] instanceof X500Principal)
                    {
                        x509certstoreselector.setIssuer(((X500Principal)aprincipal[i]).getEncoded());
                    }
                    ((Set) (obj2)).addAll(CertPathValidatorUtilities.a(x509certstoreselector, extendedpkixparameters.f()));
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
        if (x509attributecertificate.c().a() != null)
        {
            X509CertStoreSelector x509certstoreselector1 = new X509CertStoreSelector();
            x509attributecertificate = x509attributecertificate.c().a();
            int j = ((flag) ? 1 : 0);
            while (j < x509attributecertificate.length) 
            {
                try
                {
                    if (x509attributecertificate[j] instanceof X500Principal)
                    {
                        x509certstoreselector1.setIssuer(((X500Principal)x509attributecertificate[j]).getEncoded());
                    }
                    ((Set) (obj2)).addAll(CertPathValidatorUtilities.a(x509certstoreselector1, extendedpkixparameters.f()));
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
        ExtendedPKIXBuilderParameters extendedpkixbuilderparameters = (ExtendedPKIXBuilderParameters)ExtendedPKIXBuilderParameters.b(extendedpkixparameters);
        obj2 = ((Set) (obj2)).iterator();
        extendedpkixparameters = null;
        x509attributecertificate = obj;
        do
        {
            if (((Iterator) (obj2)).hasNext())
            {
                Object obj1 = new X509CertStoreSelector();
                ((X509CertStoreSelector) (obj1)).setCertificate((X509Certificate)((Iterator) (obj2)).next());
                extendedpkixbuilderparameters.a(((org.spongycastle.util.Selector) (obj1)));
                try
                {
                    obj1 = CertPathBuilder.getInstance("PKIX", BouncyCastleProvider.a);
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
                try
                {
                    obj1 = ((CertPathBuilder) (obj1)).build(ExtendedPKIXBuilderParameters.b(extendedpkixbuilderparameters));
                }
                // Misplaced declaration of an exception variable
                catch (ExtendedPKIXParameters extendedpkixparameters)
                {
                    extendedpkixparameters = new ExtCertPathValidatorException("Certification path for public key certificate of attribute certificate could not be build.", extendedpkixparameters);
                    continue;
                }
                // Misplaced declaration of an exception variable
                catch (X509AttributeCertificate x509attributecertificate)
                {
                    throw new RuntimeException(x509attributecertificate.getMessage());
                }
                x509attributecertificate = ((X509AttributeCertificate) (obj1));
                continue;
            }
            if (extendedpkixparameters != null)
            {
                throw extendedpkixparameters;
            }
            return x509attributecertificate.getCertPath();
        } while (true);
    }

    static 
    {
        a = X509Extensions.E.c();
        b = X509Extensions.D.c();
        c = X509Extensions.p.c();
        d = X509Extensions.x.c();
    }
}
