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
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.util.Selector;
import org.bouncycastle.x509.ExtendedPKIXParameters;

// Referenced classes of package org.bouncycastle.jce.provider:
//            AnnotatedException, CertPathValidatorUtilities, PKIXPolicyNode, PKIXNameConstraintValidator, 
//            RFC3280CertPathUtilities

public class PKIXCertPathValidatorSpi extends CertPathValidatorSpi
{

    public PKIXCertPathValidatorSpi()
    {
    }

    public CertPathValidatorResult engineValidate(CertPath certpath, CertPathParameters certpathparameters)
        throws CertPathValidatorException, InvalidAlgorithmParameterException
    {
        Object obj;
        ExtendedPKIXParameters extendedpkixparameters;
        X509Certificate x509certificate;
        Object obj1;
        TrustAnchor trustanchor;
        Set set;
        ArrayList aarraylist[];
        HashSet hashset;
        List list;
        PKIXNameConstraintValidator pkixnameconstraintvalidator;
        int j;
        int k;
        int l;
        int j2;
        if (!(certpathparameters instanceof PKIXParameters))
        {
            throw new InvalidAlgorithmParameterException((new StringBuilder()).append("Parameters must be a ").append(java/security/cert/PKIXParameters.getName()).append(" instance.").toString());
        }
        if (certpathparameters instanceof ExtendedPKIXParameters)
        {
            extendedpkixparameters = (ExtendedPKIXParameters)certpathparameters;
        } else
        {
            extendedpkixparameters = ExtendedPKIXParameters.getInstance((PKIXParameters)certpathparameters);
        }
        if (extendedpkixparameters.getTrustAnchors() == null)
        {
            throw new InvalidAlgorithmParameterException("trustAnchors is null, this is not allowed for certification path validation.");
        }
        list = certpath.getCertificates();
        j2 = list.size();
        if (list.isEmpty())
        {
            throw new CertPathValidatorException("Certification path is empty.", null, certpath, 0);
        }
        set = extendedpkixparameters.getInitialPolicies();
        try
        {
            trustanchor = CertPathValidatorUtilities.findTrustAnchor((X509Certificate)list.get(list.size() - 1), extendedpkixparameters.getTrustAnchors(), extendedpkixparameters.getSigProvider());
        }
        // Misplaced declaration of an exception variable
        catch (CertPathParameters certpathparameters)
        {
            throw new CertPathValidatorException(certpathparameters.getMessage(), certpathparameters, certpath, list.size() - 1);
        }
        if (trustanchor == null)
        {
            throw new CertPathValidatorException("Trust anchor for certification path not found.", null, certpath, -1);
        }
        aarraylist = new ArrayList[j2 + 1];
        for (int i = 0; i < aarraylist.length; i++)
        {
            aarraylist[i] = new ArrayList();
        }

        certpathparameters = new HashSet();
        certpathparameters.add("2.5.29.32.0");
        obj1 = new PKIXPolicyNode(new ArrayList(), 0, certpathparameters, null, new HashSet(), "2.5.29.32.0", false);
        aarraylist[0].add(obj1);
        pkixnameconstraintvalidator = new PKIXNameConstraintValidator();
        hashset = new HashSet();
        AlgorithmIdentifier algorithmidentifier;
        if (extendedpkixparameters.isExplicitPolicyRequired())
        {
            j = 0;
        } else
        {
            j = j2 + 1;
        }
        if (extendedpkixparameters.isAnyPolicyInhibited())
        {
            k = 0;
        } else
        {
            k = j2 + 1;
        }
        if (extendedpkixparameters.isPolicyMappingInhibited())
        {
            l = 0;
        } else
        {
            l = j2 + 1;
        }
        x509certificate = trustanchor.getTrustedCert();
        if (x509certificate == null)
        {
            break MISSING_BLOCK_LABEL_471;
        }
        try
        {
            certpathparameters = CertPathValidatorUtilities.getSubjectPrincipal(x509certificate);
            obj = x509certificate.getPublicKey();
        }
        // Misplaced declaration of an exception variable
        catch (CertPathParameters certpathparameters)
        {
            throw new ExtCertPathValidatorException("Subject of trust anchor could not be (re)encoded.", certpathparameters, certpath, -1);
        }
        try
        {
            algorithmidentifier = CertPathValidatorUtilities.getAlgorithmIdentifier(((java.security.PublicKey) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (CertPathParameters certpathparameters)
        {
            throw new ExtCertPathValidatorException("Algorithm identifier of public key of trust anchor could not be read.", certpathparameters, certpath, -1);
        }
        algorithmidentifier.getObjectId();
        algorithmidentifier.getParameters();
        if (extendedpkixparameters.getTargetConstraints() != null && !extendedpkixparameters.getTargetConstraints().match((X509Certificate)list.get(0)))
        {
            throw new ExtCertPathValidatorException("Target certificate in certification path does not match targetConstraints.", null, certpath, 0);
        }
        break MISSING_BLOCK_LABEL_521;
        certpathparameters = new X500Principal(trustanchor.getCAName());
        obj = trustanchor.getCAPublicKey();
        break MISSING_BLOCK_LABEL_381;
        List list1 = extendedpkixparameters.getCertPathCheckers();
        for (Iterator iterator = list1.iterator(); iterator.hasNext(); ((PKIXCertPathChecker)iterator.next()).init(false)) { }
        Object obj2 = null;
        int k2 = list.size();
        int i1 = j2;
        int k1 = l;
        int j1 = k;
        java.security.PublicKey publickey = ((java.security.PublicKey) (obj));
        k2--;
        l = j;
        k = k1;
        j = i1;
        obj = obj2;
        i1 = k2;
        while (i1 >= 0) 
        {
            obj = (X509Certificate)list.get(i1);
            Object obj3;
            boolean flag;
            if (i1 == list.size() - 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            RFC3280CertPathUtilities.processCertA(certpath, extendedpkixparameters, i1, publickey, flag, certpathparameters, x509certificate);
            RFC3280CertPathUtilities.processCertBC(certpath, i1, pkixnameconstraintvalidator);
            obj3 = RFC3280CertPathUtilities.processCertE(certpath, i1, RFC3280CertPathUtilities.processCertD(certpath, i1, hashset, ((PKIXPolicyNode) (obj1)), aarraylist, j1));
            RFC3280CertPathUtilities.processCertF(certpath, i1, ((PKIXPolicyNode) (obj3)), l);
            if (j2 - i1 != j2)
            {
                if (obj != null && ((X509Certificate) (obj)).getVersion() == 1)
                {
                    throw new CertPathValidatorException("Version 1 certificates can't be used as CA ones.", null, certpath, i1);
                }
                RFC3280CertPathUtilities.prepareNextCertA(certpath, i1);
                obj1 = RFC3280CertPathUtilities.prepareCertB(certpath, i1, aarraylist, ((PKIXPolicyNode) (obj3)), k);
                RFC3280CertPathUtilities.prepareNextCertG(certpath, i1, pkixnameconstraintvalidator);
                l = RFC3280CertPathUtilities.prepareNextCertH1(certpath, i1, l);
                k = RFC3280CertPathUtilities.prepareNextCertH2(certpath, i1, k);
                int l1 = RFC3280CertPathUtilities.prepareNextCertH3(certpath, i1, j1);
                j1 = RFC3280CertPathUtilities.prepareNextCertI1(certpath, i1, l);
                k = RFC3280CertPathUtilities.prepareNextCertI2(certpath, i1, k);
                l1 = RFC3280CertPathUtilities.prepareNextCertJ(certpath, i1, l1);
                RFC3280CertPathUtilities.prepareNextCertK(certpath, i1);
                l = RFC3280CertPathUtilities.prepareNextCertM(certpath, i1, RFC3280CertPathUtilities.prepareNextCertL(certpath, i1, j));
                RFC3280CertPathUtilities.prepareNextCertN(certpath, i1);
                certpathparameters = ((X509Certificate) (obj)).getCriticalExtensionOIDs();
                if (certpathparameters != null)
                {
                    certpathparameters = new HashSet(certpathparameters);
                    certpathparameters.remove(RFC3280CertPathUtilities.KEY_USAGE);
                    certpathparameters.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                    certpathparameters.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                    certpathparameters.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                    certpathparameters.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                    certpathparameters.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                    certpathparameters.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                    certpathparameters.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                    certpathparameters.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                    certpathparameters.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                } else
                {
                    certpathparameters = new HashSet();
                }
                RFC3280CertPathUtilities.prepareNextCertO(certpath, i1, certpathparameters, list1);
                obj3 = CertPathValidatorUtilities.getSubjectPrincipal(((X509Certificate) (obj)));
                try
                {
                    publickey = CertPathValidatorUtilities.getNextWorkingKey(certpath.getCertificates(), i1);
                }
                // Misplaced declaration of an exception variable
                catch (CertPathParameters certpathparameters)
                {
                    throw new CertPathValidatorException("Next working key could not be retrieved.", certpathparameters, certpath, i1);
                }
                certpathparameters = CertPathValidatorUtilities.getAlgorithmIdentifier(publickey);
                certpathparameters.getObjectId();
                certpathparameters.getParameters();
                j = j1;
                x509certificate = ((X509Certificate) (obj));
                j1 = l1;
                certpathparameters = ((CertPathParameters) (obj1));
                obj1 = obj3;
            } else
            {
                int i2 = l;
                l = j;
                j = i2;
                obj1 = certpathparameters;
                certpathparameters = ((CertPathParameters) (obj3));
            }
            i1--;
            l1 = j;
            obj3 = certpathparameters;
            certpathparameters = ((CertPathParameters) (obj1));
            obj1 = obj3;
            j = l;
            l = l1;
        }
        j = RFC3280CertPathUtilities.wrapupCertB(certpath, i1 + 1, RFC3280CertPathUtilities.wrapupCertA(l, ((X509Certificate) (obj))));
        certpathparameters = ((X509Certificate) (obj)).getCriticalExtensionOIDs();
        if (certpathparameters != null)
        {
            certpathparameters = new HashSet(certpathparameters);
            certpathparameters.remove(RFC3280CertPathUtilities.KEY_USAGE);
            certpathparameters.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
            certpathparameters.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
            certpathparameters.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
            certpathparameters.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
            certpathparameters.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
            certpathparameters.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
            certpathparameters.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
            certpathparameters.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
            certpathparameters.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
            certpathparameters.remove(RFC3280CertPathUtilities.CRL_DISTRIBUTION_POINTS);
        } else
        {
            certpathparameters = new HashSet();
        }
        RFC3280CertPathUtilities.wrapupCertF(certpath, i1 + 1, list1, certpathparameters);
        certpathparameters = RFC3280CertPathUtilities.wrapupCertG(certpath, extendedpkixparameters, set, i1 + 1, aarraylist, ((PKIXPolicyNode) (obj1)), hashset);
        if (j > 0 || certpathparameters != null)
        {
            return new PKIXCertPathValidatorResult(trustanchor, certpathparameters, ((X509Certificate) (obj)).getPublicKey());
        } else
        {
            throw new CertPathValidatorException("Path processing failed on policy.", null, certpath, i1);
        }
    }
}
