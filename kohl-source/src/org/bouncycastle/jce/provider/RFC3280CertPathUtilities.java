// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.GeneralSubtree;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.NameConstraints;
import org.bouncycastle.asn1.x509.PolicyInformation;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.asn1.x509.X509Name;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.x509.ExtendedPKIXBuilderParameters;
import org.bouncycastle.x509.ExtendedPKIXParameters;
import org.bouncycastle.x509.X509CRLStoreSelector;
import org.bouncycastle.x509.X509CertStoreSelector;

// Referenced classes of package org.bouncycastle.jce.provider:
//            PKIXCRLUtil, AnnotatedException, CertPathValidatorUtilities, CertStatus, 
//            ReasonsMask, PKIXPolicyNode, PKIXNameConstraintValidator, BouncyCastleProvider, 
//            PKIXNameConstraintValidatorException

public class RFC3280CertPathUtilities
{

    protected static final String ANY_POLICY = "2.5.29.32.0";
    protected static final String AUTHORITY_KEY_IDENTIFIER;
    protected static final String BASIC_CONSTRAINTS;
    protected static final String CERTIFICATE_POLICIES;
    protected static final String CRL_DISTRIBUTION_POINTS;
    protected static final String CRL_NUMBER;
    protected static final int CRL_SIGN = 6;
    private static final PKIXCRLUtil CRL_UTIL = new PKIXCRLUtil();
    protected static final String DELTA_CRL_INDICATOR;
    protected static final String FRESHEST_CRL;
    protected static final String INHIBIT_ANY_POLICY;
    protected static final String ISSUING_DISTRIBUTION_POINT;
    protected static final int KEY_CERT_SIGN = 5;
    protected static final String KEY_USAGE;
    protected static final String NAME_CONSTRAINTS;
    protected static final String POLICY_CONSTRAINTS;
    protected static final String POLICY_MAPPINGS;
    protected static final String SUBJECT_ALTERNATIVE_NAME;
    protected static final String crlReasons[] = {
        "unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", 
        "aACompromise"
    };

    public RFC3280CertPathUtilities()
    {
    }

    private static void checkCRL(DistributionPoint distributionpoint, ExtendedPKIXParameters extendedpkixparameters, X509Certificate x509certificate, Date date, X509Certificate x509certificate1, PublicKey publickey, CertStatus certstatus, ReasonsMask reasonsmask, 
            List list)
        throws AnnotatedException
    {
        AnnotatedException annotatedexception;
        Date date1;
        Iterator iterator;
        boolean flag;
        date1 = new Date(System.currentTimeMillis());
        if (date.getTime() > date1.getTime())
        {
            throw new AnnotatedException("Validation time is in future.");
        }
        iterator = CertPathValidatorUtilities.getCompleteCRLs(distributionpoint, x509certificate, date1, extendedpkixparameters).iterator();
        annotatedexception = null;
        flag = false;
_L2:
        if (!iterator.hasNext() || certstatus.getCertStatus() != 11 || reasonsmask.isAllReasons())
        {
            break MISSING_BLOCK_LABEL_416;
        }
        Object obj1;
        ReasonsMask reasonsmask1;
        PublicKey publickey1;
        obj1 = (X509CRL)iterator.next();
        reasonsmask1 = processCRLD(((X509CRL) (obj1)), distributionpoint);
        if (!reasonsmask1.hasNewReasons(reasonsmask))
        {
            continue; /* Loop/switch isn't completed */
        }
        publickey1 = processCRLG(((X509CRL) (obj1)), processCRLF(((X509CRL) (obj1)), x509certificate, x509certificate1, publickey, extendedpkixparameters, list));
        Object obj = null;
        if (extendedpkixparameters.isUseDeltasEnabled())
        {
            obj = processCRLH(CertPathValidatorUtilities.getDeltaCRLs(date1, extendedpkixparameters, ((X509CRL) (obj1))), publickey1);
        }
        if (extendedpkixparameters.getValidityModel() != 1 && x509certificate.getNotAfter().getTime() < ((X509CRL) (obj1)).getThisUpdate().getTime())
        {
            throw new AnnotatedException("No valid CRL for current time found.");
        }
        processCRLB1(distributionpoint, x509certificate, ((X509CRL) (obj1)));
        processCRLB2(distributionpoint, x509certificate, ((X509CRL) (obj1)));
        processCRLC(((X509CRL) (obj)), ((X509CRL) (obj1)), extendedpkixparameters);
        processCRLI(date, ((X509CRL) (obj)), x509certificate, certstatus, extendedpkixparameters);
        processCRLJ(date, ((X509CRL) (obj1)), x509certificate, certstatus);
        if (certstatus.getCertStatus() == 8)
        {
            certstatus.setCertStatus(11);
        }
        reasonsmask.addReasons(reasonsmask1);
        obj1 = ((X509CRL) (obj1)).getCriticalExtensionOIDs();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_333;
        }
        obj1 = new HashSet(((Collection) (obj1)));
        ((Set) (obj1)).remove(X509Extensions.IssuingDistributionPoint.getId());
        ((Set) (obj1)).remove(X509Extensions.DeltaCRLIndicator.getId());
        if (!((Set) (obj1)).isEmpty())
        {
            throw new AnnotatedException("CRL contains unsupported critical extensions.");
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_410;
        }
        obj = ((X509CRL) (obj)).getCriticalExtensionOIDs();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_410;
        }
        obj = new HashSet(((Collection) (obj)));
        ((Set) (obj)).remove(X509Extensions.IssuingDistributionPoint.getId());
        ((Set) (obj)).remove(X509Extensions.DeltaCRLIndicator.getId());
        if (!((Set) (obj)).isEmpty())
        {
            throw new AnnotatedException("Delta CRL contains unsupported critical extension.");
        }
        flag = true;
        continue; /* Loop/switch isn't completed */
        if (!flag)
        {
            throw annotatedexception;
        } else
        {
            return;
        }
        annotatedexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected static void checkCRLs(ExtendedPKIXParameters extendedpkixparameters, X509Certificate x509certificate, Date date, X509Certificate x509certificate1, PublicKey publickey, List list)
        throws AnnotatedException
    {
        Object obj;
        ExtendedPKIXParameters extendedpkixparameters1;
        CertStatus certstatus;
        ReasonsMask reasonsmask;
        boolean flag2;
        Object obj1 = null;
        obj = null;
        CRLDistPoint crldistpoint;
        DistributionPoint adistributionpoint[];
        boolean flag;
        int i;
        try
        {
            crldistpoint = CRLDistPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509certificate, CRL_DISTRIBUTION_POINTS));
        }
        // Misplaced declaration of an exception variable
        catch (ExtendedPKIXParameters extendedpkixparameters)
        {
            throw new AnnotatedException("CRL distribution point extension could not be read.", extendedpkixparameters);
        }
        try
        {
            CertPathValidatorUtilities.addAdditionalStoresFromCRLDistributionPoint(crldistpoint, extendedpkixparameters);
        }
        // Misplaced declaration of an exception variable
        catch (ExtendedPKIXParameters extendedpkixparameters)
        {
            throw new AnnotatedException("No additional CRL locations could be decoded from CRL distribution point extension.", extendedpkixparameters);
        }
        certstatus = new CertStatus();
        reasonsmask = new ReasonsMask();
        i = 0;
        flag = false;
        flag2 = i;
        extendedpkixparameters1 = obj1;
        if (crldistpoint == null) goto _L2; else goto _L1
_L1:
        try
        {
            adistributionpoint = crldistpoint.getDistributionPoints();
        }
        // Misplaced declaration of an exception variable
        catch (ExtendedPKIXParameters extendedpkixparameters)
        {
            throw new AnnotatedException("Distribution points could not be read.", extendedpkixparameters);
        }
        flag2 = i;
        extendedpkixparameters1 = obj1;
        if (adistributionpoint == null) goto _L2; else goto _L3
_L3:
        i = 0;
_L4:
        flag2 = flag;
        extendedpkixparameters1 = ((ExtendedPKIXParameters) (obj));
        if (i >= adistributionpoint.length)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag;
        extendedpkixparameters1 = ((ExtendedPKIXParameters) (obj));
        if (certstatus.getCertStatus() != 11)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag;
        extendedpkixparameters1 = ((ExtendedPKIXParameters) (obj));
        if (reasonsmask.isAllReasons())
        {
            break; /* Loop/switch isn't completed */
        }
        extendedpkixparameters1 = (ExtendedPKIXParameters)extendedpkixparameters.clone();
        checkCRL(adistributionpoint[i], extendedpkixparameters1, x509certificate, date, x509certificate1, publickey, certstatus, reasonsmask, list);
        flag = true;
_L5:
        i++;
        if (true) goto _L4; else goto _L2
        obj;
          goto _L5
_L2:
        boolean flag1;
        flag1 = flag2;
        obj = extendedpkixparameters1;
        if (certstatus.getCertStatus() != 11)
        {
            break MISSING_BLOCK_LABEL_335;
        }
        flag1 = flag2;
        obj = extendedpkixparameters1;
        if (reasonsmask.isAllReasons())
        {
            break MISSING_BLOCK_LABEL_335;
        }
        obj = (new ASN1InputStream(CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509certificate).getEncoded())).readObject();
        checkCRL(new DistributionPoint(new DistributionPointName(0, new GeneralNames(new GeneralName(4, ((ASN1Encodable) (obj))))), null, null), (ExtendedPKIXParameters)extendedpkixparameters.clone(), x509certificate, date, x509certificate1, publickey, certstatus, reasonsmask, list);
        flag1 = true;
        obj = extendedpkixparameters1;
_L6:
        if (!flag1)
        {
            if (obj instanceof AnnotatedException)
            {
                throw obj;
            } else
            {
                throw new AnnotatedException("No valid CRL found.", ((Throwable) (obj)));
            }
        }
        break MISSING_BLOCK_LABEL_386;
        extendedpkixparameters;
        try
        {
            throw new AnnotatedException("Issuer from certificate for CRL could not be reencoded.", extendedpkixparameters);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            flag1 = flag2;
        }
          goto _L6
        if (certstatus.getCertStatus() != 11)
        {
            extendedpkixparameters = (new StringBuilder()).append("Certificate revocation after ").append(certstatus.getRevocationDate()).toString();
            throw new AnnotatedException((new StringBuilder()).append(extendedpkixparameters).append(", reason: ").append(crlReasons[certstatus.getCertStatus()]).toString());
        }
        if (!reasonsmask.isAllReasons() && certstatus.getCertStatus() == 11)
        {
            certstatus.setCertStatus(12);
        }
        if (certstatus.getCertStatus() == 12)
        {
            throw new AnnotatedException("Certificate status could not be determined.");
        } else
        {
            return;
        }
    }

    protected static PKIXPolicyNode prepareCertB(CertPath certpath, int i, List alist[], PKIXPolicyNode pkixpolicynode, int j)
        throws CertPathValidatorException
    {
        Object obj;
        X509Certificate x509certificate;
        HashMap hashmap;
        int j1;
        obj = certpath.getCertificates();
        x509certificate = (X509Certificate)((List) (obj)).get(i);
        j1 = ((List) (obj)).size() - i;
        ASN1Sequence asn1sequence;
        ASN1Sequence asn1sequence1;
        HashSet hashset;
        int k;
        try
        {
            asn1sequence = DERSequence.getInstance(CertPathValidatorUtilities.getExtensionValue(x509certificate, POLICY_MAPPINGS));
        }
        // Misplaced declaration of an exception variable
        catch (List alist[])
        {
            throw new ExtCertPathValidatorException("Policy mappings extension could not be decoded.", alist, certpath, i);
        }
        obj = pkixpolicynode;
        if (asn1sequence == null) goto _L2; else goto _L1
_L1:
        Iterator iterator1;
        hashmap = new HashMap();
        obj = new HashSet();
        k = 0;
        while (k < asn1sequence.size()) 
        {
            asn1sequence1 = (ASN1Sequence)asn1sequence.getObjectAt(k);
            String s = ((DERObjectIdentifier)asn1sequence1.getObjectAt(0)).getId();
            String s1 = ((DERObjectIdentifier)asn1sequence1.getObjectAt(1)).getId();
            if (!hashmap.containsKey(s))
            {
                hashset = new HashSet();
                hashset.add(s1);
                hashmap.put(s, hashset);
                ((Set) (obj)).add(s);
            } else
            {
                ((Set)hashmap.get(s)).add(s1);
            }
            k++;
        }
        iterator1 = ((Set) (obj)).iterator();
_L5:
        obj = pkixpolicynode;
        if (!iterator1.hasNext()) goto _L2; else goto _L3
_L3:
        String s2;
        int l;
        s2 = (String)iterator1.next();
        if (j <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = alist[j1].iterator();
        PKIXPolicyNode pkixpolicynode1;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_794;
            }
            pkixpolicynode1 = (PKIXPolicyNode)((Iterator) (obj)).next();
        } while (!pkixpolicynode1.getValidPolicy().equals(s2));
        pkixpolicynode1.expectedPolicies = (Set)hashmap.get(s2);
        l = 1;
_L15:
        if (l != 0) goto _L5; else goto _L4
_L4:
        obj = alist[j1].iterator();
_L8:
        if (!((Iterator) (obj)).hasNext()) goto _L5; else goto _L6
_L6:
        PKIXPolicyNode pkixpolicynode3 = (PKIXPolicyNode)((Iterator) (obj)).next();
        if (!"2.5.29.32.0".equals(pkixpolicynode3.getValidPolicy())) goto _L8; else goto _L7
_L7:
        PKIXPolicyNode pkixpolicynode2 = null;
        Enumeration enumeration;
        try
        {
            obj = (ASN1Sequence)CertPathValidatorUtilities.getExtensionValue(x509certificate, CERTIFICATE_POLICIES);
        }
        // Misplaced declaration of an exception variable
        catch (List alist[])
        {
            throw new ExtCertPathValidatorException("Certificate policies extension could not be decoded.", alist, certpath, i);
        }
        enumeration = ((ASN1Sequence) (obj)).getObjects();
        do
        {
            obj = pkixpolicynode2;
            if (!enumeration.hasMoreElements())
            {
                break;
            }
            boolean flag;
            try
            {
                obj = PolicyInformation.getInstance(enumeration.nextElement());
            }
            // Misplaced declaration of an exception variable
            catch (List alist[])
            {
                throw new CertPathValidatorException("Policy information could not be decoded.", alist, certpath, i);
            }
            if (!"2.5.29.32.0".equals(((PolicyInformation) (obj)).getPolicyIdentifier().getId()))
            {
                continue;
            }
            try
            {
                obj = CertPathValidatorUtilities.getQualifierSet(((PolicyInformation) (obj)).getPolicyQualifiers());
            }
            // Misplaced declaration of an exception variable
            catch (List alist[])
            {
                throw new ExtCertPathValidatorException("Policy qualifier info set could not be decoded.", alist, certpath, i);
            }
            break;
        } while (true);
        flag = false;
        if (x509certificate.getCriticalExtensionOIDs() != null)
        {
            flag = x509certificate.getCriticalExtensionOIDs().contains(CERTIFICATE_POLICIES);
        }
        pkixpolicynode2 = (PKIXPolicyNode)pkixpolicynode3.getParent();
        if ("2.5.29.32.0".equals(pkixpolicynode2.getValidPolicy()))
        {
            obj = new PKIXPolicyNode(new ArrayList(), j1, (Set)hashmap.get(s2), pkixpolicynode2, ((Set) (obj)), s2, flag);
            pkixpolicynode2.addChild(((PKIXPolicyNode) (obj)));
            alist[j1].add(obj);
        }
          goto _L5
        if (j > 0) goto _L5; else goto _L9
_L9:
        Iterator iterator;
        iterator = alist[j1].iterator();
        obj = pkixpolicynode;
_L12:
        pkixpolicynode = ((PKIXPolicyNode) (obj));
        if (!iterator.hasNext()) goto _L5; else goto _L10
_L10:
        pkixpolicynode = (PKIXPolicyNode)iterator.next();
        if (!pkixpolicynode.getValidPolicy().equals(s2)) goto _L12; else goto _L11
_L11:
        ((PKIXPolicyNode)pkixpolicynode.getParent()).removeChild(pkixpolicynode);
        iterator.remove();
        l = j1 - 1;
        pkixpolicynode = ((PKIXPolicyNode) (obj));
_L14:
        if (l < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        List list = alist[l];
        int i1 = 0;
        do
        {
label0:
            {
                obj = pkixpolicynode;
                if (i1 < list.size())
                {
                    PKIXPolicyNode pkixpolicynode4 = (PKIXPolicyNode)list.get(i1);
                    obj = pkixpolicynode;
                    if (pkixpolicynode4.hasChildren())
                    {
                        break label0;
                    }
                    pkixpolicynode = CertPathValidatorUtilities.removePolicyNode(pkixpolicynode, alist, pkixpolicynode4);
                    obj = pkixpolicynode;
                    if (pkixpolicynode != null)
                    {
                        break label0;
                    }
                    obj = pkixpolicynode;
                }
                l--;
                pkixpolicynode = ((PKIXPolicyNode) (obj));
                continue; /* Loop/switch isn't completed */
            }
            i1++;
            pkixpolicynode = ((PKIXPolicyNode) (obj));
        } while (true);
_L2:
        return ((PKIXPolicyNode) (obj));
        if (true) goto _L14; else goto _L13
_L13:
        obj = pkixpolicynode;
          goto _L12
        l = 0;
          goto _L15
    }

    protected static void prepareNextCertA(CertPath certpath, int i)
        throws CertPathValidatorException
    {
        Object obj = (X509Certificate)certpath.getCertificates().get(i);
        try
        {
            obj = DERSequence.getInstance(CertPathValidatorUtilities.getExtensionValue(((X509Extension) (obj)), POLICY_MAPPINGS));
        }
        catch (AnnotatedException annotatedexception)
        {
            throw new ExtCertPathValidatorException("Policy mappings extension could not be decoded.", annotatedexception, certpath, i);
        }
        if (obj != null)
        {
            for (int j = 0; j < ((ASN1Sequence) (obj)).size(); j++)
            {
                ASN1ObjectIdentifier asn1objectidentifier;
                Object obj1;
                try
                {
                    obj1 = DERSequence.getInstance(((ASN1Sequence) (obj)).getObjectAt(j));
                    asn1objectidentifier = DERObjectIdentifier.getInstance(((ASN1Sequence) (obj1)).getObjectAt(0));
                    obj1 = DERObjectIdentifier.getInstance(((ASN1Sequence) (obj1)).getObjectAt(1));
                }
                catch (Exception exception)
                {
                    throw new ExtCertPathValidatorException("Policy mappings extension contents could not be decoded.", exception, certpath, i);
                }
                if ("2.5.29.32.0".equals(asn1objectidentifier.getId()))
                {
                    throw new CertPathValidatorException("IssuerDomainPolicy is anyPolicy", null, certpath, i);
                }
                if ("2.5.29.32.0".equals(((DERObjectIdentifier) (obj1)).getId()))
                {
                    throw new CertPathValidatorException("SubjectDomainPolicy is anyPolicy,", null, certpath, i);
                }
            }

        }
    }

    protected static void prepareNextCertG(CertPath certpath, int i, PKIXNameConstraintValidator pkixnameconstraintvalidator)
        throws CertPathValidatorException
    {
        Object obj;
        obj = (X509Certificate)certpath.getCertificates().get(i);
        ASN1Sequence asn1sequence;
        try
        {
            obj = DERSequence.getInstance(CertPathValidatorUtilities.getExtensionValue(((X509Extension) (obj)), NAME_CONSTRAINTS));
        }
        // Misplaced declaration of an exception variable
        catch (PKIXNameConstraintValidator pkixnameconstraintvalidator)
        {
            throw new ExtCertPathValidatorException("Name constraints extension could not be decoded.", pkixnameconstraintvalidator, certpath, i);
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = NameConstraints.getInstance(obj);
_L4:
        if (obj != null)
        {
            asn1sequence = ((NameConstraints) (obj)).getPermittedSubtrees();
            if (asn1sequence != null)
            {
                try
                {
                    pkixnameconstraintvalidator.intersectPermittedSubtree(asn1sequence);
                }
                // Misplaced declaration of an exception variable
                catch (PKIXNameConstraintValidator pkixnameconstraintvalidator)
                {
                    throw new ExtCertPathValidatorException("Permitted subtrees cannot be build from name constraints extension.", pkixnameconstraintvalidator, certpath, i);
                }
            }
            obj = ((NameConstraints) (obj)).getExcludedSubtrees();
            if (obj != null)
            {
                obj = ((ASN1Sequence) (obj)).getObjects();
                try
                {
                    while (((Enumeration) (obj)).hasMoreElements()) 
                    {
                        pkixnameconstraintvalidator.addExcludedSubtree(GeneralSubtree.getInstance(((Enumeration) (obj)).nextElement()));
                    }
                }
                // Misplaced declaration of an exception variable
                catch (PKIXNameConstraintValidator pkixnameconstraintvalidator)
                {
                    throw new ExtCertPathValidatorException("Excluded subtrees cannot be build from name constraints extension.", pkixnameconstraintvalidator, certpath, i);
                }
            }
        }
        return;
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected static int prepareNextCertH1(CertPath certpath, int i, int j)
    {
        int k = j;
        if (!CertPathValidatorUtilities.isSelfIssued((X509Certificate)certpath.getCertificates().get(i)))
        {
            k = j;
            if (j != 0)
            {
                k = j - 1;
            }
        }
        return k;
    }

    protected static int prepareNextCertH2(CertPath certpath, int i, int j)
    {
        int k = j;
        if (!CertPathValidatorUtilities.isSelfIssued((X509Certificate)certpath.getCertificates().get(i)))
        {
            k = j;
            if (j != 0)
            {
                k = j - 1;
            }
        }
        return k;
    }

    protected static int prepareNextCertH3(CertPath certpath, int i, int j)
    {
        int k = j;
        if (!CertPathValidatorUtilities.isSelfIssued((X509Certificate)certpath.getCertificates().get(i)))
        {
            k = j;
            if (j != 0)
            {
                k = j - 1;
            }
        }
        return k;
    }

    protected static int prepareNextCertI1(CertPath certpath, int i, int j)
        throws CertPathValidatorException
    {
        Object obj = (X509Certificate)certpath.getCertificates().get(i);
        ASN1TaggedObject asn1taggedobject;
        int k;
        int l;
        try
        {
            obj = DERSequence.getInstance(CertPathValidatorUtilities.getExtensionValue(((X509Extension) (obj)), POLICY_CONSTRAINTS));
        }
        catch (Exception exception)
        {
            throw new ExtCertPathValidatorException("Policy constraints extension cannot be decoded.", exception, certpath, i);
        }
        k = j;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        obj = ((ASN1Sequence) (obj)).getObjects();
        k = j;
        if (!((Enumeration) (obj)).hasMoreElements())
        {
            break MISSING_BLOCK_LABEL_95;
        }
        try
        {
            asn1taggedobject = ASN1TaggedObject.getInstance(((Enumeration) (obj)).nextElement());
            if (asn1taggedobject.getTagNo() != 0)
            {
                break MISSING_BLOCK_LABEL_37;
            }
            l = DERInteger.getInstance(asn1taggedobject, false).getValue().intValue();
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw new ExtCertPathValidatorException("Policy constraints extension contents cannot be decoded.", illegalargumentexception, certpath, i);
        }
        k = j;
        if (l < j)
        {
            k = l;
        }
        return k;
    }

    protected static int prepareNextCertI2(CertPath certpath, int i, int j)
        throws CertPathValidatorException
    {
        Object obj = (X509Certificate)certpath.getCertificates().get(i);
        ASN1TaggedObject asn1taggedobject;
        int k;
        int l;
        try
        {
            obj = DERSequence.getInstance(CertPathValidatorUtilities.getExtensionValue(((X509Extension) (obj)), POLICY_CONSTRAINTS));
        }
        catch (Exception exception)
        {
            throw new ExtCertPathValidatorException("Policy constraints extension cannot be decoded.", exception, certpath, i);
        }
        k = j;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        obj = ((ASN1Sequence) (obj)).getObjects();
        k = j;
        if (!((Enumeration) (obj)).hasMoreElements())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        try
        {
            asn1taggedobject = ASN1TaggedObject.getInstance(((Enumeration) (obj)).nextElement());
            if (asn1taggedobject.getTagNo() != 1)
            {
                break MISSING_BLOCK_LABEL_37;
            }
            l = DERInteger.getInstance(asn1taggedobject, false).getValue().intValue();
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw new ExtCertPathValidatorException("Policy constraints extension contents cannot be decoded.", illegalargumentexception, certpath, i);
        }
        k = j;
        if (l < j)
        {
            k = l;
        }
        return k;
    }

    protected static int prepareNextCertJ(CertPath certpath, int i, int j)
        throws CertPathValidatorException
    {
        Object obj = (X509Certificate)certpath.getCertificates().get(i);
        try
        {
            obj = DERInteger.getInstance(CertPathValidatorUtilities.getExtensionValue(((X509Extension) (obj)), INHIBIT_ANY_POLICY));
        }
        catch (Exception exception)
        {
            throw new ExtCertPathValidatorException("Inhibit any-policy extension cannot be decoded.", exception, certpath, i);
        }
        i = j;
        if (obj != null)
        {
            int k = ((DERInteger) (obj)).getValue().intValue();
            i = j;
            if (k < j)
            {
                i = k;
            }
        }
        return i;
    }

    protected static void prepareNextCertK(CertPath certpath, int i)
        throws CertPathValidatorException
    {
        Object obj = (X509Certificate)certpath.getCertificates().get(i);
        try
        {
            obj = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(((X509Extension) (obj)), BASIC_CONSTRAINTS));
        }
        catch (Exception exception)
        {
            throw new ExtCertPathValidatorException("Basic constraints extension cannot be decoded.", exception, certpath, i);
        }
        if (obj != null)
        {
            if (!((BasicConstraints) (obj)).isCA())
            {
                throw new CertPathValidatorException("Not a CA certificate");
            } else
            {
                return;
            }
        } else
        {
            throw new CertPathValidatorException("Intermediate certificate lacks BasicConstraints");
        }
    }

    protected static int prepareNextCertL(CertPath certpath, int i, int j)
        throws CertPathValidatorException
    {
        int k = j;
        if (!CertPathValidatorUtilities.isSelfIssued((X509Certificate)certpath.getCertificates().get(i)))
        {
            if (j <= 0)
            {
                throw new ExtCertPathValidatorException("Max path length not greater than zero", null, certpath, i);
            }
            k = j - 1;
        }
        return k;
    }

    protected static int prepareNextCertM(CertPath certpath, int i, int j)
        throws CertPathValidatorException
    {
        Object obj = (X509Certificate)certpath.getCertificates().get(i);
        try
        {
            obj = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(((X509Extension) (obj)), BASIC_CONSTRAINTS));
        }
        catch (Exception exception)
        {
            throw new ExtCertPathValidatorException("Basic constraints extension cannot be decoded.", exception, certpath, i);
        }
        i = j;
        if (obj != null)
        {
            certpath = ((BasicConstraints) (obj)).getPathLenConstraint();
            i = j;
            if (certpath != null)
            {
                int k = certpath.intValue();
                i = j;
                if (k < j)
                {
                    i = k;
                }
            }
        }
        return i;
    }

    protected static void prepareNextCertN(CertPath certpath, int i)
        throws CertPathValidatorException
    {
        boolean aflag[] = ((X509Certificate)certpath.getCertificates().get(i)).getKeyUsage();
        if (aflag != null && !aflag[5])
        {
            throw new ExtCertPathValidatorException("Issuer certificate keyusage extension is critical and does not permit key signing.", null, certpath, i);
        } else
        {
            return;
        }
    }

    protected static void prepareNextCertO(CertPath certpath, int i, Set set, List list)
        throws CertPathValidatorException
    {
        X509Certificate x509certificate = (X509Certificate)certpath.getCertificates().get(i);
        for (list = list.iterator(); list.hasNext();)
        {
            try
            {
                ((PKIXCertPathChecker)list.next()).check(x509certificate, set);
            }
            // Misplaced declaration of an exception variable
            catch (Set set)
            {
                throw new CertPathValidatorException(set.getMessage(), set.getCause(), certpath, i);
            }
        }

        if (!set.isEmpty())
        {
            throw new ExtCertPathValidatorException("Certificate has unsupported critical extension.", null, certpath, i);
        } else
        {
            return;
        }
    }

    protected static Set processCRLA1i(Date date, ExtendedPKIXParameters extendedpkixparameters, X509Certificate x509certificate, X509CRL x509crl)
        throws AnnotatedException
    {
        HashSet hashset = new HashSet();
        if (extendedpkixparameters.isUseDeltasEnabled())
        {
            Object obj;
            try
            {
                x509certificate = CRLDistPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509certificate, FRESHEST_CRL));
            }
            // Misplaced declaration of an exception variable
            catch (Date date)
            {
                throw new AnnotatedException("Freshest CRL extension could not be decoded from certificate.", date);
            }
            obj = x509certificate;
            if (x509certificate == null)
            {
                try
                {
                    obj = CRLDistPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, FRESHEST_CRL));
                }
                // Misplaced declaration of an exception variable
                catch (Date date)
                {
                    throw new AnnotatedException("Freshest CRL extension could not be decoded from CRL.", date);
                }
            }
            if (obj != null)
            {
                try
                {
                    CertPathValidatorUtilities.addAdditionalStoresFromCRLDistributionPoint(((CRLDistPoint) (obj)), extendedpkixparameters);
                }
                // Misplaced declaration of an exception variable
                catch (Date date)
                {
                    throw new AnnotatedException("No new delta CRL locations could be added from Freshest CRL extension.", date);
                }
                try
                {
                    hashset.addAll(CertPathValidatorUtilities.getDeltaCRLs(date, extendedpkixparameters, x509crl));
                }
                // Misplaced declaration of an exception variable
                catch (Date date)
                {
                    throw new AnnotatedException("Exception obtaining delta CRLs.", date);
                }
            }
        }
        return hashset;
    }

    protected static Set[] processCRLA1ii(Date date, ExtendedPKIXParameters extendedpkixparameters, X509Certificate x509certificate, X509CRL x509crl)
        throws AnnotatedException
    {
        HashSet hashset = new HashSet();
        X509CRLStoreSelector x509crlstoreselector = new X509CRLStoreSelector();
        x509crlstoreselector.setCertificateChecking(x509certificate);
        try
        {
            x509crlstoreselector.addIssuerName(x509crl.getIssuerX500Principal().getEncoded());
        }
        // Misplaced declaration of an exception variable
        catch (Date date)
        {
            throw new AnnotatedException((new StringBuilder()).append("Cannot extract issuer from CRL.").append(date).toString(), date);
        }
        x509crlstoreselector.setCompleteCRLEnabled(true);
        x509certificate = CRL_UTIL.findCRLs(x509crlstoreselector, extendedpkixparameters, date);
        if (extendedpkixparameters.isUseDeltasEnabled())
        {
            try
            {
                hashset.addAll(CertPathValidatorUtilities.getDeltaCRLs(date, extendedpkixparameters, x509crl));
            }
            // Misplaced declaration of an exception variable
            catch (Date date)
            {
                throw new AnnotatedException("Exception obtaining delta CRLs.", date);
            }
        }
        return (new Set[] {
            x509certificate, hashset
        });
    }

    protected static void processCRLB1(DistributionPoint distributionpoint, Object obj, X509CRL x509crl)
        throws AnnotatedException
    {
        int i = 0;
        ASN1Primitive asn1primitive = CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT);
        byte abyte0[];
        boolean flag1;
        if (asn1primitive != null && IssuingDistributionPoint.getInstance(asn1primitive).isIndirectCRL())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        abyte0 = CertPathValidatorUtilities.getIssuerPrincipal(x509crl).getEncoded();
        if (distributionpoint.getCRLIssuer() != null)
        {
            distributionpoint = distributionpoint.getCRLIssuer().getNames();
            boolean flag = false;
            while (i < distributionpoint.length) 
            {
                boolean flag2 = flag;
                if (distributionpoint[i].getTagNo() == 4)
                {
                    boolean flag3;
                    try
                    {
                        flag3 = Arrays.areEqual(distributionpoint[i].getName().toASN1Primitive().getEncoded(), abyte0);
                    }
                    // Misplaced declaration of an exception variable
                    catch (DistributionPoint distributionpoint)
                    {
                        throw new AnnotatedException("CRL issuer information from distribution point cannot be decoded.", distributionpoint);
                    }
                    flag2 = flag;
                    if (flag3)
                    {
                        flag2 = true;
                    }
                }
                i++;
                flag = flag2;
            }
            if (flag && !flag1)
            {
                throw new AnnotatedException("Distribution point contains cRLIssuer field but CRL is not indirect.");
            }
            flag1 = flag;
            if (!flag)
            {
                throw new AnnotatedException("CRL issuer of CRL does not match CRL issuer of distribution point.");
            }
        } else
        if (CertPathValidatorUtilities.getIssuerPrincipal(x509crl).equals(CertPathValidatorUtilities.getEncodedIssuerPrincipal(obj)))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            throw new AnnotatedException("Cannot find matching CRL issuer for certificate.");
        } else
        {
            return;
        }
    }

    protected static void processCRLB2(DistributionPoint distributionpoint, Object obj, X509CRL x509crl)
        throws AnnotatedException
    {
        IssuingDistributionPoint issuingdistributionpoint;
        ArrayList arraylist;
        boolean flag2;
        boolean flag3;
        flag3 = false;
        flag2 = false;
        GeneralName ageneralname[];
        int i;
        try
        {
            issuingdistributionpoint = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
        }
        // Misplaced declaration of an exception variable
        catch (DistributionPoint distributionpoint)
        {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", distributionpoint);
        }
        if (issuingdistributionpoint == null)
        {
            break MISSING_BLOCK_LABEL_702;
        }
        if (issuingdistributionpoint.getDistributionPoint() == null) goto _L2; else goto _L1
_L1:
        DistributionPointName distributionpointname = IssuingDistributionPoint.getInstance(issuingdistributionpoint).getDistributionPoint();
        arraylist = new ArrayList();
        if (distributionpointname.getType() == 0)
        {
            ageneralname = GeneralNames.getInstance(distributionpointname.getName()).getNames();
            for (i = 0; i < ageneralname.length; i++)
            {
                arraylist.add(ageneralname[i]);
            }

        }
        if (distributionpointname.getType() == 1)
        {
            ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
            try
            {
                for (x509crl = ASN1Sequence.getInstance(ASN1Sequence.fromByteArray(CertPathValidatorUtilities.getIssuerPrincipal(x509crl).getEncoded())).getObjects(); x509crl.hasMoreElements(); asn1encodablevector.add((ASN1Encodable)x509crl.nextElement())) { }
            }
            // Misplaced declaration of an exception variable
            catch (DistributionPoint distributionpoint)
            {
                throw new AnnotatedException("Could not read CRL issuer.", distributionpoint);
            }
            asn1encodablevector.add(distributionpointname.getName());
            arraylist.add(new GeneralName(X509Name.getInstance(new DERSequence(asn1encodablevector))));
        }
        if (distributionpoint.getDistributionPoint() == null) goto _L4; else goto _L3
_L3:
        boolean flag;
        DistributionPointName distributionpointname1 = distributionpoint.getDistributionPoint();
        x509crl = null;
        if (distributionpointname1.getType() == 0)
        {
            x509crl = GeneralNames.getInstance(distributionpointname1.getName()).getNames();
        }
        if (distributionpointname1.getType() == 1)
        {
            int j;
            if (distributionpoint.getCRLIssuer() != null)
            {
                distributionpoint = distributionpoint.getCRLIssuer().getNames();
            } else
            {
                distributionpoint = new GeneralName[1];
                try
                {
                    distributionpoint[0] = new GeneralName(new X509Name((ASN1Sequence)ASN1Sequence.fromByteArray(CertPathValidatorUtilities.getEncodedIssuerPrincipal(obj).getEncoded())));
                }
                // Misplaced declaration of an exception variable
                catch (DistributionPoint distributionpoint)
                {
                    throw new AnnotatedException("Could not read certificate issuer.", distributionpoint);
                }
            }
            j = 0;
            do
            {
                x509crl = distributionpoint;
                if (j >= distributionpoint.length)
                {
                    break;
                }
                x509crl = ASN1Sequence.getInstance(distributionpoint[j].getName().toASN1Primitive()).getObjects();
                ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
                for (; x509crl.hasMoreElements(); asn1encodablevector1.add((ASN1Encodable)x509crl.nextElement())) { }
                asn1encodablevector1.add(distributionpointname1.getName());
                distributionpoint[j] = new GeneralName(new X509Name(new DERSequence(asn1encodablevector1)));
                j++;
            } while (true);
        }
        flag = flag2;
        if (x509crl == null) goto _L6; else goto _L5
_L5:
        int k = 0;
_L10:
        flag = flag2;
        if (k >= x509crl.length) goto _L6; else goto _L7
_L7:
        if (!arraylist.contains(x509crl[k])) goto _L9; else goto _L8
_L8:
        flag = true;
_L6:
        if (!flag)
        {
            throw new AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
        }
        break; /* Loop/switch isn't completed */
_L9:
        k++;
        if (true) goto _L10; else goto _L2
_L4:
        if (distributionpoint.getCRLIssuer() == null)
        {
            throw new AnnotatedException("Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint.");
        }
        distributionpoint = distributionpoint.getCRLIssuer().getNames();
        int l = 0;
label0:
        do
        {
label1:
            {
                boolean flag1 = flag3;
                if (l < distributionpoint.length)
                {
                    if (!arraylist.contains(distributionpoint[l]))
                    {
                        break label1;
                    }
                    flag1 = true;
                }
                if (!flag1)
                {
                    throw new AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                }
                break label0;
            }
            l++;
        } while (true);
_L2:
        try
        {
            distributionpoint = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Extension)obj, BASIC_CONSTRAINTS));
        }
        // Misplaced declaration of an exception variable
        catch (DistributionPoint distributionpoint)
        {
            throw new AnnotatedException("Basic constraints extension could not be decoded.", distributionpoint);
        }
        if (obj instanceof X509Certificate)
        {
            if (issuingdistributionpoint.onlyContainsUserCerts() && distributionpoint != null && distributionpoint.isCA())
            {
                throw new AnnotatedException("CA Cert CRL only contains user certificates.");
            }
            if (issuingdistributionpoint.onlyContainsCACerts() && (distributionpoint == null || !distributionpoint.isCA()))
            {
                throw new AnnotatedException("End CRL only contains CA certificates.");
            }
        }
        if (issuingdistributionpoint.onlyContainsAttributeCerts())
        {
            throw new AnnotatedException("onlyContainsAttributeCerts boolean is asserted.");
        }
    }

    protected static void processCRLC(X509CRL x509crl, X509CRL x509crl1, ExtendedPKIXParameters extendedpkixparameters)
        throws AnnotatedException
    {
        boolean flag = true;
        if (x509crl != null)
        {
            IssuingDistributionPoint issuingdistributionpoint;
            try
            {
                issuingdistributionpoint = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl1, ISSUING_DISTRIBUTION_POINT));
            }
            // Misplaced declaration of an exception variable
            catch (X509CRL x509crl)
            {
                throw new AnnotatedException("Issuing distribution point extension could not be decoded.", x509crl);
            }
            if (extendedpkixparameters.isUseDeltasEnabled())
            {
                if (!x509crl.getIssuerX500Principal().equals(x509crl1.getIssuerX500Principal()))
                {
                    throw new AnnotatedException("Complete CRL issuer does not match delta CRL issuer.");
                }
                try
                {
                    extendedpkixparameters = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
                }
                // Misplaced declaration of an exception variable
                catch (X509CRL x509crl)
                {
                    throw new AnnotatedException("Issuing distribution point extension from delta CRL could not be decoded.", x509crl);
                }
                if (issuingdistributionpoint != null ? !issuingdistributionpoint.equals(extendedpkixparameters) : extendedpkixparameters != null)
                {
                    flag = false;
                }
                if (!flag)
                {
                    throw new AnnotatedException("Issuing distribution point extension from delta CRL and complete CRL does not match.");
                }
                try
                {
                    x509crl1 = CertPathValidatorUtilities.getExtensionValue(x509crl1, AUTHORITY_KEY_IDENTIFIER);
                }
                // Misplaced declaration of an exception variable
                catch (X509CRL x509crl)
                {
                    throw new AnnotatedException("Authority key identifier extension could not be extracted from complete CRL.", x509crl);
                }
                try
                {
                    x509crl = CertPathValidatorUtilities.getExtensionValue(x509crl, AUTHORITY_KEY_IDENTIFIER);
                }
                // Misplaced declaration of an exception variable
                catch (X509CRL x509crl)
                {
                    throw new AnnotatedException("Authority key identifier extension could not be extracted from delta CRL.", x509crl);
                }
                if (x509crl1 == null)
                {
                    throw new AnnotatedException("CRL authority key identifier is null.");
                }
                if (x509crl == null)
                {
                    throw new AnnotatedException("Delta CRL authority key identifier is null.");
                }
                if (!x509crl1.equals(x509crl))
                {
                    throw new AnnotatedException("Delta CRL authority key identifier does not match complete CRL authority key identifier.");
                }
            }
        }
    }

    protected static ReasonsMask processCRLD(X509CRL x509crl, DistributionPoint distributionpoint)
        throws AnnotatedException
    {
        IssuingDistributionPoint issuingdistributionpoint;
        try
        {
            issuingdistributionpoint = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
        }
        // Misplaced declaration of an exception variable
        catch (X509CRL x509crl)
        {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", x509crl);
        }
        if (issuingdistributionpoint != null && issuingdistributionpoint.getOnlySomeReasons() != null && distributionpoint.getReasons() != null)
        {
            return (new ReasonsMask(distributionpoint.getReasons())).intersect(new ReasonsMask(issuingdistributionpoint.getOnlySomeReasons()));
        }
        if ((issuingdistributionpoint == null || issuingdistributionpoint.getOnlySomeReasons() == null) && distributionpoint.getReasons() == null)
        {
            return ReasonsMask.allReasons;
        }
        if (distributionpoint.getReasons() == null)
        {
            x509crl = ReasonsMask.allReasons;
        } else
        {
            x509crl = new ReasonsMask(distributionpoint.getReasons());
        }
        if (issuingdistributionpoint == null)
        {
            distributionpoint = ReasonsMask.allReasons;
        } else
        {
            distributionpoint = new ReasonsMask(issuingdistributionpoint.getOnlySomeReasons());
        }
        return x509crl.intersect(distributionpoint);
    }

    protected static Set processCRLF(X509CRL x509crl, Object obj, X509Certificate x509certificate, PublicKey publickey, ExtendedPKIXParameters extendedpkixparameters, List list)
        throws AnnotatedException
    {
        ArrayList arraylist;
        X509Certificate x509certificate1;
        int i;
        i = 0;
        obj = new X509CertStoreSelector();
        try
        {
            ((X509CertStoreSelector) (obj)).setSubject(CertPathValidatorUtilities.getIssuerPrincipal(x509crl).getEncoded());
        }
        // Misplaced declaration of an exception variable
        catch (X509CRL x509crl)
        {
            throw new AnnotatedException("Subject criteria for certificate selector to find issuer certificate for CRL could not be set.", x509crl);
        }
        try
        {
            x509crl = CertPathValidatorUtilities.findCertificates(((X509CertStoreSelector) (obj)), extendedpkixparameters.getStores());
            x509crl.addAll(CertPathValidatorUtilities.findCertificates(((X509CertStoreSelector) (obj)), extendedpkixparameters.getAdditionalStores()));
            x509crl.addAll(CertPathValidatorUtilities.findCertificates(((X509CertStoreSelector) (obj)), extendedpkixparameters.getCertStores()));
        }
        // Misplaced declaration of an exception variable
        catch (X509CRL x509crl)
        {
            throw new AnnotatedException("Issuer certificate for CRL cannot be searched.", x509crl);
        }
        x509crl.add(x509certificate);
        x509crl = x509crl.iterator();
        obj = new ArrayList();
        arraylist = new ArrayList();
_L7:
        if (!x509crl.hasNext()) goto _L2; else goto _L1
_L1:
        x509certificate1 = (X509Certificate)x509crl.next();
        if (x509certificate1.equals(x509certificate))
        {
            ((List) (obj)).add(x509certificate1);
            arraylist.add(publickey);
            continue; /* Loop/switch isn't completed */
        }
        Object obj1;
        Object obj2;
        obj1 = CertPathBuilder.getInstance("PKIX", BouncyCastleProvider.PROVIDER_NAME);
        obj2 = new X509CertStoreSelector();
        ((X509CertStoreSelector) (obj2)).setCertificate(x509certificate1);
        ExtendedPKIXParameters extendedpkixparameters1 = (ExtendedPKIXParameters)extendedpkixparameters.clone();
        extendedpkixparameters1.setTargetCertConstraints(((java.security.cert.CertSelector) (obj2)));
        obj2 = (ExtendedPKIXBuilderParameters)ExtendedPKIXBuilderParameters.getInstance(extendedpkixparameters1);
        if (!list.contains(x509certificate1)) goto _L4; else goto _L3
_L3:
        ((ExtendedPKIXBuilderParameters) (obj2)).setRevocationEnabled(false);
_L5:
        obj1 = ((CertPathBuilder) (obj1)).build(((java.security.cert.CertPathParameters) (obj2))).getCertPath().getCertificates();
        ((List) (obj)).add(x509certificate1);
        arraylist.add(CertPathValidatorUtilities.getNextWorkingKey(((List) (obj1)), 0));
        continue; /* Loop/switch isn't completed */
_L4:
        try
        {
            ((ExtendedPKIXBuilderParameters) (obj2)).setRevocationEnabled(true);
        }
        // Misplaced declaration of an exception variable
        catch (X509CRL x509crl)
        {
            throw new AnnotatedException("Internal error.", x509crl);
        }
        // Misplaced declaration of an exception variable
        catch (X509CRL x509crl)
        {
            throw new AnnotatedException("Public key of issuer certificate of CRL could not be retrieved.", x509crl);
        }
        // Misplaced declaration of an exception variable
        catch (X509CRL x509crl)
        {
            throw new RuntimeException(x509crl.getMessage());
        }
        if (true) goto _L5; else goto _L2
_L2:
        x509certificate = new HashSet();
        x509crl = null;
        while (i < ((List) (obj)).size()) 
        {
            publickey = ((X509Certificate)((List) (obj)).get(i)).getKeyUsage();
            if (publickey != null && (publickey.length < 7 || publickey[6] == 0))
            {
                x509crl = new AnnotatedException("Issuer certificate key usage extension does not permit CRL signing.");
            } else
            {
                x509certificate.add(arraylist.get(i));
            }
            i++;
        }
        if (x509certificate.isEmpty() && x509crl == null)
        {
            throw new AnnotatedException("Cannot find a valid issuer certificate.");
        }
        if (x509certificate.isEmpty() && x509crl != null)
        {
            throw x509crl;
        }
        return x509certificate;
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected static PublicKey processCRLG(X509CRL x509crl, Set set)
        throws AnnotatedException
    {
        Iterator iterator;
        Object obj = null;
        iterator = set.iterator();
        set = obj;
_L2:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_37;
        }
        set = (PublicKey)iterator.next();
        x509crl.verify(set);
        return set;
        throw new AnnotatedException("Cannot verify CRL.", set);
        set;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected static X509CRL processCRLH(Set set, PublicKey publickey)
        throws AnnotatedException
    {
        Iterator iterator;
        iterator = set.iterator();
        set = null;
_L2:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_35;
        }
        set = (X509CRL)iterator.next();
        set.verify(publickey);
        return set;
        if (set != null)
        {
            throw new AnnotatedException("Cannot verify delta CRL.", set);
        } else
        {
            return null;
        }
        set;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected static void processCRLI(Date date, X509CRL x509crl, Object obj, CertStatus certstatus, ExtendedPKIXParameters extendedpkixparameters)
        throws AnnotatedException
    {
        if (extendedpkixparameters.isUseDeltasEnabled() && x509crl != null)
        {
            CertPathValidatorUtilities.getCertStatus(date, x509crl, obj, certstatus);
        }
    }

    protected static void processCRLJ(Date date, X509CRL x509crl, Object obj, CertStatus certstatus)
        throws AnnotatedException
    {
        if (certstatus.getCertStatus() == 11)
        {
            CertPathValidatorUtilities.getCertStatus(date, x509crl, obj, certstatus);
        }
    }

    protected static void processCertA(CertPath certpath, ExtendedPKIXParameters extendedpkixparameters, int i, PublicKey publickey, boolean flag, X500Principal x500principal, X509Certificate x509certificate)
        throws ExtCertPathValidatorException
    {
        List list = certpath.getCertificates();
        X509Certificate x509certificate1 = (X509Certificate)list.get(i);
        if (!flag)
        {
            try
            {
                CertPathValidatorUtilities.verifyX509Certificate(x509certificate1, publickey, extendedpkixparameters.getSigProvider());
            }
            // Misplaced declaration of an exception variable
            catch (ExtendedPKIXParameters extendedpkixparameters)
            {
                throw new ExtCertPathValidatorException("Could not validate certificate signature.", extendedpkixparameters, certpath, i);
            }
        }
        try
        {
            x509certificate1.checkValidity(CertPathValidatorUtilities.getValidCertDateFromValidityModel(extendedpkixparameters, certpath, i));
        }
        // Misplaced declaration of an exception variable
        catch (ExtendedPKIXParameters extendedpkixparameters)
        {
            throw new ExtCertPathValidatorException((new StringBuilder()).append("Could not validate certificate: ").append(extendedpkixparameters.getMessage()).toString(), extendedpkixparameters, certpath, i);
        }
        // Misplaced declaration of an exception variable
        catch (ExtendedPKIXParameters extendedpkixparameters)
        {
            throw new ExtCertPathValidatorException((new StringBuilder()).append("Could not validate certificate: ").append(extendedpkixparameters.getMessage()).toString(), extendedpkixparameters, certpath, i);
        }
        // Misplaced declaration of an exception variable
        catch (ExtendedPKIXParameters extendedpkixparameters)
        {
            throw new ExtCertPathValidatorException("Could not validate time of certificate.", extendedpkixparameters, certpath, i);
        }
        if (extendedpkixparameters.isRevocationEnabled())
        {
            try
            {
                checkCRLs(extendedpkixparameters, x509certificate1, CertPathValidatorUtilities.getValidCertDateFromValidityModel(extendedpkixparameters, certpath, i), x509certificate, publickey, list);
            }
            // Misplaced declaration of an exception variable
            catch (PublicKey publickey)
            {
                if (publickey.getCause() != null)
                {
                    extendedpkixparameters = publickey.getCause();
                } else
                {
                    extendedpkixparameters = publickey;
                }
                throw new ExtCertPathValidatorException(publickey.getMessage(), extendedpkixparameters, certpath, i);
            }
        }
        if (!CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509certificate1).equals(x500principal))
        {
            throw new ExtCertPathValidatorException((new StringBuilder()).append("IssuerName(").append(CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509certificate1)).append(") does not match SubjectName(").append(x500principal).append(") of signing certificate.").toString(), null, certpath, i);
        } else
        {
            return;
        }
    }

    protected static void processCertBC(CertPath certpath, int i, PKIXNameConstraintValidator pkixnameconstraintvalidator)
        throws CertPathValidatorException
    {
        List list = certpath.getCertificates();
        Object obj = (X509Certificate)list.get(i);
        int j = list.size();
        if (!CertPathValidatorUtilities.isSelfIssued(((X509Certificate) (obj))) || j - i >= j)
        {
            Object obj1 = new ASN1InputStream(CertPathValidatorUtilities.getSubjectPrincipal(((X509Certificate) (obj))).getEncoded());
            try
            {
                obj1 = DERSequence.getInstance(((ASN1InputStream) (obj1)).readObject());
            }
            // Misplaced declaration of an exception variable
            catch (PKIXNameConstraintValidator pkixnameconstraintvalidator)
            {
                throw new CertPathValidatorException("Exception extracting subject name when checking subtrees.", pkixnameconstraintvalidator, certpath, i);
            }
            try
            {
                pkixnameconstraintvalidator.checkPermittedDN(((ASN1Sequence) (obj1)));
                pkixnameconstraintvalidator.checkExcludedDN(((ASN1Sequence) (obj1)));
            }
            // Misplaced declaration of an exception variable
            catch (PKIXNameConstraintValidator pkixnameconstraintvalidator)
            {
                throw new CertPathValidatorException("Subtree check for certificate subject failed.", pkixnameconstraintvalidator, certpath, i);
            }
            try
            {
                obj = GeneralNames.getInstance(CertPathValidatorUtilities.getExtensionValue(((X509Extension) (obj)), SUBJECT_ALTERNATIVE_NAME));
            }
            // Misplaced declaration of an exception variable
            catch (PKIXNameConstraintValidator pkixnameconstraintvalidator)
            {
                throw new CertPathValidatorException("Subject alternative name extension could not be decoded.", pkixnameconstraintvalidator, certpath, i);
            }
            for (obj1 = (new X509Name(((ASN1Sequence) (obj1)))).getValues(X509Name.EmailAddress).elements(); ((Enumeration) (obj1)).hasMoreElements();)
            {
                GeneralName generalname = new GeneralName(1, (String)((Enumeration) (obj1)).nextElement());
                try
                {
                    pkixnameconstraintvalidator.checkPermitted(generalname);
                    pkixnameconstraintvalidator.checkExcluded(generalname);
                }
                // Misplaced declaration of an exception variable
                catch (PKIXNameConstraintValidator pkixnameconstraintvalidator)
                {
                    throw new CertPathValidatorException("Subtree check for certificate subject alternative email failed.", pkixnameconstraintvalidator, certpath, i);
                }
            }

            if (obj != null)
            {
                GeneralName ageneralname[];
                int k;
                try
                {
                    ageneralname = ((GeneralNames) (obj)).getNames();
                }
                // Misplaced declaration of an exception variable
                catch (PKIXNameConstraintValidator pkixnameconstraintvalidator)
                {
                    throw new CertPathValidatorException("Subject alternative name contents could not be decoded.", pkixnameconstraintvalidator, certpath, i);
                }
                k = 0;
                while (k < ageneralname.length) 
                {
                    try
                    {
                        pkixnameconstraintvalidator.checkPermitted(ageneralname[k]);
                        pkixnameconstraintvalidator.checkExcluded(ageneralname[k]);
                    }
                    // Misplaced declaration of an exception variable
                    catch (PKIXNameConstraintValidator pkixnameconstraintvalidator)
                    {
                        throw new CertPathValidatorException("Subtree check for certificate subject alternative name failed.", pkixnameconstraintvalidator, certpath, i);
                    }
                    k++;
                }
            }
        }
    }

    protected static PKIXPolicyNode processCertD(CertPath certpath, int i, Set set, PKIXPolicyNode pkixpolicynode, List alist[], int j)
        throws CertPathValidatorException
    {
        X509Certificate x509certificate;
        Object obj;
        int k;
        int l;
        obj = certpath.getCertificates();
        x509certificate = (X509Certificate)((List) (obj)).get(i);
        l = ((List) (obj)).size();
        k = l - i;
        Enumeration enumeration;
        ASN1ObjectIdentifier asn1objectidentifier;
        Object obj3;
        try
        {
            obj = DERSequence.getInstance(CertPathValidatorUtilities.getExtensionValue(x509certificate, CERTIFICATE_POLICIES));
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            throw new ExtCertPathValidatorException("Could not read certificate policies extension from certificate.", set, certpath, i);
        }
        if (obj == null || pkixpolicynode == null) goto _L2; else goto _L1
_L1:
label0:
        {
            enumeration = ((ASN1Sequence) (obj)).getObjects();
            Object obj1 = new HashSet();
            do
            {
                if (!enumeration.hasMoreElements())
                {
                    break;
                }
                obj3 = PolicyInformation.getInstance(enumeration.nextElement());
                asn1objectidentifier = ((PolicyInformation) (obj3)).getPolicyIdentifier();
                ((Set) (obj1)).add(asn1objectidentifier.getId());
                if (!"2.5.29.32.0".equals(asn1objectidentifier.getId()))
                {
                    try
                    {
                        obj3 = CertPathValidatorUtilities.getQualifierSet(((PolicyInformation) (obj3)).getPolicyQualifiers());
                    }
                    // Misplaced declaration of an exception variable
                    catch (Set set)
                    {
                        throw new ExtCertPathValidatorException("Policy qualifier info set could not be build.", set, certpath, i);
                    }
                    if (!CertPathValidatorUtilities.processCertD1i(k, alist, asn1objectidentifier, ((Set) (obj3))))
                    {
                        CertPathValidatorUtilities.processCertD1ii(k, alist, asn1objectidentifier, ((Set) (obj3)));
                    }
                }
            } while (true);
            if (set.isEmpty() || set.contains("2.5.29.32.0"))
            {
                set.clear();
                set.addAll(((Collection) (obj1)));
            } else
            {
                certpath = set.iterator();
                HashSet hashset = new HashSet();
                do
                {
                    if (!certpath.hasNext())
                    {
                        break;
                    }
                    Object obj2 = certpath.next();
                    if (((Set) (obj1)).contains(obj2))
                    {
                        hashset.add(obj2);
                    }
                } while (true);
                set.clear();
                set.addAll(hashset);
            }
            if (j <= 0 && (k >= l || !CertPathValidatorUtilities.isSelfIssued(x509certificate)))
            {
                break label0;
            }
            certpath = ((ASN1Sequence) (obj)).getObjects();
            do
            {
                if (!certpath.hasMoreElements())
                {
                    break label0;
                }
                set = PolicyInformation.getInstance(certpath.nextElement());
            } while (!"2.5.29.32.0".equals(set.getPolicyIdentifier().getId()));
            set = CertPathValidatorUtilities.getQualifierSet(set.getPolicyQualifiers());
            obj = alist[k - 1];
label1:
            for (j = 0; j < ((List) (obj)).size(); j++)
            {
                obj1 = (PKIXPolicyNode)((List) (obj)).get(j);
                Iterator iterator = ((PKIXPolicyNode) (obj1)).getExpectedPolicies().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        continue label1;
                    }
                    certpath = ((CertPath) (iterator.next()));
                    Iterator iterator1;
                    if (certpath instanceof String)
                    {
                        certpath = (String)certpath;
                    } else
                    {
                        if (!(certpath instanceof DERObjectIdentifier))
                        {
                            continue;
                        }
                        certpath = ((DERObjectIdentifier)certpath).getId();
                    }
                    iterator1 = ((PKIXPolicyNode) (obj1)).getChildren();
                    i = 0;
                    do
                    {
                        if (!iterator1.hasNext())
                        {
                            break;
                        }
                        if (certpath.equals(((PKIXPolicyNode)iterator1.next()).getValidPolicy()))
                        {
                            i = 1;
                        }
                    } while (true);
                    if (i == 0)
                    {
                        HashSet hashset1 = new HashSet();
                        hashset1.add(certpath);
                        certpath = new PKIXPolicyNode(new ArrayList(), k, hashset1, ((java.security.cert.PolicyNode) (obj1)), set, certpath, false);
                        ((PKIXPolicyNode) (obj1)).addChild(certpath);
                        alist[k].add(certpath);
                    }
                } while (true);
            }

        }
        i = k - 1;
        certpath = pkixpolicynode;
_L5:
        if (i >= 0)
        {
            pkixpolicynode = alist[i];
            j = 0;
            do
            {
label2:
                {
                    set = certpath;
                    if (j < pkixpolicynode.size())
                    {
                        PKIXPolicyNode pkixpolicynode1 = (PKIXPolicyNode)pkixpolicynode.get(j);
                        set = certpath;
                        if (pkixpolicynode1.hasChildren())
                        {
                            break label2;
                        }
                        certpath = CertPathValidatorUtilities.removePolicyNode(certpath, alist, pkixpolicynode1);
                        set = certpath;
                        if (certpath != null)
                        {
                            break label2;
                        }
                        set = certpath;
                    }
                    i--;
                    certpath = set;
                    continue; /* Loop/switch isn't completed */
                }
                j++;
                certpath = set;
            } while (true);
        }
        pkixpolicynode = x509certificate.getCriticalExtensionOIDs();
        set = certpath;
        if (pkixpolicynode != null)
        {
            boolean flag = pkixpolicynode.contains(CERTIFICATE_POLICIES);
            pkixpolicynode = alist[k];
            i = 0;
            do
            {
                set = certpath;
                if (i >= pkixpolicynode.size())
                {
                    break;
                }
                ((PKIXPolicyNode)pkixpolicynode.get(i)).setCritical(flag);
                i++;
            } while (true);
        }
          goto _L3
_L2:
        set = null;
_L3:
        return set;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected static PKIXPolicyNode processCertE(CertPath certpath, int i, PKIXPolicyNode pkixpolicynode)
        throws CertPathValidatorException
    {
        Object obj = (X509Certificate)certpath.getCertificates().get(i);
        try
        {
            obj = DERSequence.getInstance(CertPathValidatorUtilities.getExtensionValue(((X509Extension) (obj)), CERTIFICATE_POLICIES));
        }
        // Misplaced declaration of an exception variable
        catch (PKIXPolicyNode pkixpolicynode)
        {
            throw new ExtCertPathValidatorException("Could not read certificate policies extension from certificate.", pkixpolicynode, certpath, i);
        }
        if (obj == null)
        {
            pkixpolicynode = null;
        }
        return pkixpolicynode;
    }

    protected static void processCertF(CertPath certpath, int i, PKIXPolicyNode pkixpolicynode, int j)
        throws CertPathValidatorException
    {
        if (j <= 0 && pkixpolicynode == null)
        {
            throw new ExtCertPathValidatorException("No valid policy tree found when one expected.", null, certpath, i);
        } else
        {
            return;
        }
    }

    protected static int wrapupCertA(int i, X509Certificate x509certificate)
    {
        int j = i;
        if (!CertPathValidatorUtilities.isSelfIssued(x509certificate))
        {
            j = i;
            if (i != 0)
            {
                j = i - 1;
            }
        }
        return j;
    }

    protected static int wrapupCertB(CertPath certpath, int i, int j)
        throws CertPathValidatorException
    {
        Object obj = (X509Certificate)certpath.getCertificates().get(i);
        ASN1TaggedObject asn1taggedobject;
        int k;
        try
        {
            obj = DERSequence.getInstance(CertPathValidatorUtilities.getExtensionValue(((X509Extension) (obj)), POLICY_CONSTRAINTS));
        }
        catch (AnnotatedException annotatedexception)
        {
            throw new ExtCertPathValidatorException("Policy constraints could not be decoded.", annotatedexception, certpath, i);
        }
        k = j;
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((ASN1Sequence) (obj)).getObjects();
_L5:
        k = j;
        if (!((Enumeration) (obj)).hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        asn1taggedobject = (ASN1TaggedObject)((Enumeration) (obj)).nextElement();
        asn1taggedobject.getTagNo();
        JVM INSTR tableswitch 0 0: default 84
    //                   0 87;
           goto _L3 _L4
_L3:
        if (true) goto _L5; else goto _L2
_L4:
        try
        {
            k = DERInteger.getInstance(asn1taggedobject, false).getValue().intValue();
        }
        catch (Exception exception)
        {
            throw new ExtCertPathValidatorException("Policy constraints requireExplicitPolicy field could not be decoded.", exception, certpath, i);
        }
        if (k != 0) goto _L5; else goto _L6
_L6:
        k = 0;
_L2:
        return k;
    }

    protected static void wrapupCertF(CertPath certpath, int i, List list, Set set)
        throws CertPathValidatorException
    {
        X509Certificate x509certificate = (X509Certificate)certpath.getCertificates().get(i);
        for (list = list.iterator(); list.hasNext();)
        {
            try
            {
                ((PKIXCertPathChecker)list.next()).check(x509certificate, set);
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                throw new ExtCertPathValidatorException("Additional certificate path checker failed.", list, certpath, i);
            }
        }

        if (!set.isEmpty())
        {
            throw new ExtCertPathValidatorException("Certificate has unsupported critical extension", null, certpath, i);
        } else
        {
            return;
        }
    }

    protected static PKIXPolicyNode wrapupCertG(CertPath certpath, ExtendedPKIXParameters extendedpkixparameters, Set set, int i, List alist[], PKIXPolicyNode pkixpolicynode, Set set1)
        throws CertPathValidatorException
    {
label0:
        {
            int j1 = certpath.getCertificates().size();
            if (pkixpolicynode == null)
            {
                if (extendedpkixparameters.isExplicitPolicyRequired())
                {
                    throw new ExtCertPathValidatorException("Explicit policy requested but none available.", null, certpath, i);
                }
                set = null;
            } else
            if (CertPathValidatorUtilities.isAnyPolicy(set))
            {
                set = pkixpolicynode;
                if (extendedpkixparameters.isExplicitPolicyRequired())
                {
                    if (set1.isEmpty())
                    {
                        throw new ExtCertPathValidatorException("Explicit policy requested but none available.", null, certpath, i);
                    }
                    certpath = new HashSet();
                    for (i = 0; i < alist.length; i++)
                    {
                        extendedpkixparameters = alist[i];
                        for (int j = 0; j < extendedpkixparameters.size(); j++)
                        {
                            set = (PKIXPolicyNode)extendedpkixparameters.get(j);
                            if (!"2.5.29.32.0".equals(set.getValidPolicy()))
                            {
                                continue;
                            }
                            for (set = set.getChildren(); set.hasNext(); certpath.add(set.next())) { }
                        }

                    }

                    for (certpath = certpath.iterator(); certpath.hasNext();)
                    {
                        if (set1.contains(((PKIXPolicyNode)certpath.next()).getValidPolicy()));
                    }

                    set = pkixpolicynode;
                    if (pkixpolicynode != null)
                    {
                        i = j1 - 1;
                        certpath = pkixpolicynode;
                        for (; i >= 0; i--)
                        {
                            set = alist[i];
                            for (int k = 0; k < set.size();)
                            {
                                pkixpolicynode = (PKIXPolicyNode)set.get(k);
                                extendedpkixparameters = certpath;
                                if (!pkixpolicynode.hasChildren())
                                {
                                    extendedpkixparameters = CertPathValidatorUtilities.removePolicyNode(certpath, alist, pkixpolicynode);
                                }
                                k++;
                                certpath = extendedpkixparameters;
                            }

                        }

                        break label0;
                    }
                }
            } else
            {
                certpath = new HashSet();
                for (i = 0; i < alist.length; i++)
                {
                    extendedpkixparameters = alist[i];
label1:
                    for (int l = 0; l < extendedpkixparameters.size(); l++)
                    {
                        set1 = (PKIXPolicyNode)extendedpkixparameters.get(l);
                        if (!"2.5.29.32.0".equals(set1.getValidPolicy()))
                        {
                            continue;
                        }
                        set1 = set1.getChildren();
                        do
                        {
                            PKIXPolicyNode pkixpolicynode1;
                            do
                            {
                                if (!set1.hasNext())
                                {
                                    continue label1;
                                }
                                pkixpolicynode1 = (PKIXPolicyNode)set1.next();
                            } while ("2.5.29.32.0".equals(pkixpolicynode1.getValidPolicy()));
                            certpath.add(pkixpolicynode1);
                        } while (true);
                    }

                }

                certpath = certpath.iterator();
                do
                {
                    if (!certpath.hasNext())
                    {
                        break;
                    }
                    extendedpkixparameters = (PKIXPolicyNode)certpath.next();
                    if (!set.contains(extendedpkixparameters.getValidPolicy()))
                    {
                        pkixpolicynode = CertPathValidatorUtilities.removePolicyNode(pkixpolicynode, alist, extendedpkixparameters);
                    }
                } while (true);
                if (pkixpolicynode != null)
                {
                    i = j1 - 1;
                    certpath = pkixpolicynode;
                    do
                    {
                        extendedpkixparameters = certpath;
                        if (i < 0)
                        {
                            break;
                        }
                        set = alist[i];
                        for (int i1 = 0; i1 < set.size();)
                        {
                            pkixpolicynode = (PKIXPolicyNode)set.get(i1);
                            extendedpkixparameters = certpath;
                            if (!pkixpolicynode.hasChildren())
                            {
                                extendedpkixparameters = CertPathValidatorUtilities.removePolicyNode(certpath, alist, pkixpolicynode);
                            }
                            i1++;
                            certpath = extendedpkixparameters;
                        }

                        i--;
                    } while (true);
                } else
                {
                    extendedpkixparameters = pkixpolicynode;
                }
                return extendedpkixparameters;
            }
            return set;
        }
        return certpath;
    }

    static 
    {
        CERTIFICATE_POLICIES = X509Extensions.CertificatePolicies.getId();
        POLICY_MAPPINGS = X509Extensions.PolicyMappings.getId();
        INHIBIT_ANY_POLICY = X509Extensions.InhibitAnyPolicy.getId();
        ISSUING_DISTRIBUTION_POINT = X509Extensions.IssuingDistributionPoint.getId();
        FRESHEST_CRL = X509Extensions.FreshestCRL.getId();
        DELTA_CRL_INDICATOR = X509Extensions.DeltaCRLIndicator.getId();
        POLICY_CONSTRAINTS = X509Extensions.PolicyConstraints.getId();
        BASIC_CONSTRAINTS = X509Extensions.BasicConstraints.getId();
        CRL_DISTRIBUTION_POINTS = X509Extensions.CRLDistributionPoints.getId();
        SUBJECT_ALTERNATIVE_NAME = X509Extensions.SubjectAlternativeName.getId();
        NAME_CONSTRAINTS = X509Extensions.NameConstraints.getId();
        AUTHORITY_KEY_IDENTIFIER = X509Extensions.AuthorityKeyIdentifier.getId();
        KEY_USAGE = X509Extensions.KeyUsage.getId();
        CRL_NUMBER = X509Extensions.CRLNumber.getId();
    }
}
