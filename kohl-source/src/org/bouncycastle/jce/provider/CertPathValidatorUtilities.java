// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyQualifierInfo;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEREnumerated;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.isismtt.ISISMTTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.PolicyInformation;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509Extension;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.util.StoreException;
import org.bouncycastle.x509.AttributeCertificateIssuer;
import org.bouncycastle.x509.ExtendedPKIXBuilderParameters;
import org.bouncycastle.x509.ExtendedPKIXParameters;
import org.bouncycastle.x509.X509AttributeCertStoreSelector;
import org.bouncycastle.x509.X509AttributeCertificate;
import org.bouncycastle.x509.X509CRLStoreSelector;
import org.bouncycastle.x509.X509CertStoreSelector;
import org.bouncycastle.x509.X509Store;

// Referenced classes of package org.bouncycastle.jce.provider:
//            PKIXCRLUtil, BouncyCastleProvider, AnnotatedException, X509CRLObject, 
//            CertStatus, RFC3280CertPathUtilities, PKIXPolicyNode

public class CertPathValidatorUtilities
{

    protected static final String ANY_POLICY = "2.5.29.32.0";
    protected static final String AUTHORITY_KEY_IDENTIFIER;
    protected static final String BASIC_CONSTRAINTS;
    protected static final String CERTIFICATE_POLICIES;
    protected static final String CRL_DISTRIBUTION_POINTS;
    protected static final String CRL_NUMBER;
    protected static final int CRL_SIGN = 6;
    protected static final PKIXCRLUtil CRL_UTIL = new PKIXCRLUtil();
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

    public CertPathValidatorUtilities()
    {
    }

    protected static void addAdditionalStoreFromLocation(String s, ExtendedPKIXParameters extendedpkixparameters)
    {
        if (!extendedpkixparameters.isAdditionalLocationsEnabled())
        {
            break MISSING_BLOCK_LABEL_176;
        }
        if (!s.startsWith("ldap://"))
        {
            break MISSING_BLOCK_LABEL_176;
        }
        s = s.substring(7);
        String s1 = null;
        if (s.indexOf("/") == -1)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        s1 = s.substring(s.indexOf("/"));
        s = (new StringBuilder()).append("ldap://").append(s.substring(0, s.indexOf("/"))).toString();
_L1:
        s = (new org.bouncycastle.jce.X509LDAPCertStoreParameters.Builder(s, s1)).build();
        extendedpkixparameters.addAdditionalStore(X509Store.getInstance("CERTIFICATE/LDAP", s, BouncyCastleProvider.PROVIDER_NAME));
        extendedpkixparameters.addAdditionalStore(X509Store.getInstance("CRL/LDAP", s, BouncyCastleProvider.PROVIDER_NAME));
        extendedpkixparameters.addAdditionalStore(X509Store.getInstance("ATTRIBUTECERTIFICATE/LDAP", s, BouncyCastleProvider.PROVIDER_NAME));
        extendedpkixparameters.addAdditionalStore(X509Store.getInstance("CERTIFICATEPAIR/LDAP", s, BouncyCastleProvider.PROVIDER_NAME));
        return;
        try
        {
            s = (new StringBuilder()).append("ldap://").append(s).toString();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("Exception adding X.509 stores.");
        }
          goto _L1
    }

    protected static void addAdditionalStoresFromAltNames(X509Certificate x509certificate, ExtendedPKIXParameters extendedpkixparameters)
        throws CertificateParsingException
    {
        if (x509certificate.getIssuerAlternativeNames() != null)
        {
            x509certificate = x509certificate.getIssuerAlternativeNames().iterator();
            do
            {
                if (!x509certificate.hasNext())
                {
                    break;
                }
                List list = (List)x509certificate.next();
                if (list.get(0).equals(new Integer(6)))
                {
                    addAdditionalStoreFromLocation((String)list.get(1), extendedpkixparameters);
                }
            } while (true);
        }
    }

    protected static void addAdditionalStoresFromCRLDistributionPoint(CRLDistPoint crldistpoint, ExtendedPKIXParameters extendedpkixparameters)
        throws AnnotatedException
    {
        if (crldistpoint != null)
        {
            int i;
            try
            {
                crldistpoint = crldistpoint.getDistributionPoints();
            }
            // Misplaced declaration of an exception variable
            catch (CRLDistPoint crldistpoint)
            {
                throw new AnnotatedException("Distribution points could not be read.", crldistpoint);
            }
            for (i = 0; i < crldistpoint.length; i++)
            {
                DistributionPointName distributionpointname = crldistpoint[i].getDistributionPoint();
                if (distributionpointname == null || distributionpointname.getType() != 0)
                {
                    continue;
                }
                GeneralName ageneralname[] = GeneralNames.getInstance(distributionpointname.getName()).getNames();
                for (int j = 0; j < ageneralname.length; j++)
                {
                    if (ageneralname[j].getTagNo() == 6)
                    {
                        addAdditionalStoreFromLocation(DERIA5String.getInstance(ageneralname[j].getName()).getString(), extendedpkixparameters);
                    }
                }

            }

        }
    }

    protected static Collection findCertificates(X509AttributeCertStoreSelector x509attributecertstoreselector, List list)
        throws AnnotatedException
    {
        HashSet hashset = new HashSet();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = list.next();
            if (obj instanceof X509Store)
            {
                obj = (X509Store)obj;
                try
                {
                    hashset.addAll(((X509Store) (obj)).getMatches(x509attributecertstoreselector));
                }
                // Misplaced declaration of an exception variable
                catch (X509AttributeCertStoreSelector x509attributecertstoreselector)
                {
                    throw new AnnotatedException("Problem while picking certificates from X.509 store.", x509attributecertstoreselector);
                }
            }
        } while (true);
        return hashset;
    }

    protected static Collection findCertificates(X509CertStoreSelector x509certstoreselector, List list)
        throws AnnotatedException
    {
        HashSet hashset = new HashSet();
        for (list = list.iterator(); list.hasNext();)
        {
            Object obj = list.next();
            if (obj instanceof X509Store)
            {
                obj = (X509Store)obj;
                try
                {
                    hashset.addAll(((X509Store) (obj)).getMatches(x509certstoreselector));
                }
                // Misplaced declaration of an exception variable
                catch (X509CertStoreSelector x509certstoreselector)
                {
                    throw new AnnotatedException("Problem while picking certificates from X.509 store.", x509certstoreselector);
                }
            } else
            {
                obj = (CertStore)obj;
                try
                {
                    hashset.addAll(((CertStore) (obj)).getCertificates(x509certstoreselector));
                }
                // Misplaced declaration of an exception variable
                catch (X509CertStoreSelector x509certstoreselector)
                {
                    throw new AnnotatedException("Problem while picking certificates from certificate store.", x509certstoreselector);
                }
            }
        }

        return hashset;
    }

    protected static Collection findIssuerCerts(X509Certificate x509certificate, ExtendedPKIXBuilderParameters extendedpkixbuilderparameters)
        throws AnnotatedException
    {
        X509CertStoreSelector x509certstoreselector = new X509CertStoreSelector();
        HashSet hashset = new HashSet();
        try
        {
            x509certstoreselector.setSubject(x509certificate.getIssuerX500Principal().getEncoded());
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate x509certificate)
        {
            throw new AnnotatedException("Subject criteria for certificate selector to find issuer certificate could not be set.", x509certificate);
        }
        try
        {
            x509certificate = new ArrayList();
            x509certificate.addAll(findCertificates(x509certstoreselector, extendedpkixbuilderparameters.getCertStores()));
            x509certificate.addAll(findCertificates(x509certstoreselector, extendedpkixbuilderparameters.getStores()));
            x509certificate.addAll(findCertificates(x509certstoreselector, extendedpkixbuilderparameters.getAdditionalStores()));
            x509certificate = x509certificate.iterator();
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate x509certificate)
        {
            throw new AnnotatedException("Issuer certificate cannot be searched.", x509certificate);
        }
        for (; x509certificate.hasNext(); hashset.add((X509Certificate)x509certificate.next())) { }
        return hashset;
    }

    protected static TrustAnchor findTrustAnchor(X509Certificate x509certificate, Set set)
        throws AnnotatedException
    {
        return findTrustAnchor(x509certificate, set, null);
    }

    protected static TrustAnchor findTrustAnchor(X509Certificate x509certificate, Set set, String s)
        throws AnnotatedException
    {
        Object obj;
        Object obj1;
        X500Principal x500principal;
        X509CertSelector x509certselector = new X509CertSelector();
        x500principal = getEncodedIssuerPrincipal(x509certificate);
        Iterator iterator;
        try
        {
            x509certselector.setSubject(x500principal.getEncoded());
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate x509certificate)
        {
            throw new AnnotatedException("Cannot set subject search criteria for trust anchor.", x509certificate);
        }
        iterator = set.iterator();
        obj1 = null;
        set = null;
        obj = null;
_L5:
        if (!iterator.hasNext() || obj != null)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        obj = (TrustAnchor)iterator.next();
        if (((TrustAnchor) (obj)).getTrustedCert() == null) goto _L2; else goto _L1
_L1:
        if (x509certselector.match(((TrustAnchor) (obj)).getTrustedCert()))
        {
            set = ((TrustAnchor) (obj)).getTrustedCert().getPublicKey();
        } else
        {
            obj = null;
        }
_L3:
        PublicKey publickey;
        if (set != null)
        {
            try
            {
                verifyX509Certificate(x509certificate, set, s);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                set = null;
                obj = null;
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (((TrustAnchor) (obj)).getCAName() == null || ((TrustAnchor) (obj)).getCAPublicKey() == null)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        if (!x500principal.equals(new X500Principal(((TrustAnchor) (obj)).getCAName())))
        {
            break MISSING_BLOCK_LABEL_168;
        }
        publickey = ((TrustAnchor) (obj)).getCAPublicKey();
        set = publickey;
          goto _L3
        obj = null;
          goto _L3
        obj;
        obj = null;
          goto _L3
        obj = null;
          goto _L3
        if (obj == null && obj1 != null)
        {
            throw new AnnotatedException("TrustAnchor found but certificate validation failed.", ((Throwable) (obj1)));
        }
        return ((TrustAnchor) (obj));
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected static AlgorithmIdentifier getAlgorithmIdentifier(PublicKey publickey)
        throws CertPathValidatorException
    {
        try
        {
            publickey = SubjectPublicKeyInfo.getInstance((new ASN1InputStream(publickey.getEncoded())).readObject()).getAlgorithmId();
        }
        // Misplaced declaration of an exception variable
        catch (PublicKey publickey)
        {
            throw new ExtCertPathValidatorException("Subject public key cannot be decoded.", publickey);
        }
        return publickey;
    }

    protected static void getCRLIssuersFromDistributionPoint(DistributionPoint distributionpoint, Collection collection, X509CRLSelector x509crlselector, ExtendedPKIXParameters extendedpkixparameters)
        throws AnnotatedException
    {
        extendedpkixparameters = new ArrayList();
        if (distributionpoint.getCRLIssuer() != null)
        {
            distributionpoint = distributionpoint.getCRLIssuer().getNames();
            int i = 0;
            while (i < distributionpoint.length) 
            {
                if (distributionpoint[i].getTagNo() == 4)
                {
                    try
                    {
                        extendedpkixparameters.add(new X500Principal(distributionpoint[i].getName().toASN1Primitive().getEncoded()));
                    }
                    // Misplaced declaration of an exception variable
                    catch (DistributionPoint distributionpoint)
                    {
                        throw new AnnotatedException("CRL issuer information from distribution point cannot be decoded.", distributionpoint);
                    }
                }
                i++;
            }
        } else
        {
            if (distributionpoint.getDistributionPoint() == null)
            {
                throw new AnnotatedException("CRL issuer is omitted from distribution point but no distributionPoint field present.");
            }
            for (distributionpoint = collection.iterator(); distributionpoint.hasNext(); extendedpkixparameters.add((X500Principal)distributionpoint.next())) { }
        }
        for (distributionpoint = extendedpkixparameters.iterator(); distributionpoint.hasNext();)
        {
            try
            {
                x509crlselector.addIssuerName(((X500Principal)distributionpoint.next()).getEncoded());
            }
            // Misplaced declaration of an exception variable
            catch (DistributionPoint distributionpoint)
            {
                throw new AnnotatedException("Cannot decode CRL issuer information.", distributionpoint);
            }
        }

    }

    protected static void getCertStatus(Date date, X509CRL x509crl, Object obj, CertStatus certstatus)
        throws AnnotatedException
    {
        X509CRLEntry x509crlentry;
        boolean flag;
        try
        {
            flag = X509CRLObject.isIndirectCRL(x509crl);
        }
        // Misplaced declaration of an exception variable
        catch (Date date)
        {
            throw new AnnotatedException("Failed check for indirect CRL.", date);
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        x509crlentry = x509crl.getRevokedCertificate(getSerialNumber(obj));
        if (x509crlentry != null) goto _L4; else goto _L3
_L3:
        return;
_L4:
        X500Principal x500principal;
        X500Principal x500principal1 = x509crlentry.getCertificateIssuer();
        x500principal = x500principal1;
        if (x500principal1 == null)
        {
            x500principal = getIssuerPrincipal(x509crl);
        }
        if (!getEncodedIssuerPrincipal(obj).equals(x500principal)) goto _L3; else goto _L5
_L5:
        x509crl = x509crlentry;
_L8:
        obj = null;
        if (x509crl.hasExtensions())
        {
            try
            {
                obj = DEREnumerated.getInstance(getExtensionValue(x509crl, X509Extension.reasonCode.getId()));
            }
            // Misplaced declaration of an exception variable
            catch (Date date)
            {
                throw new AnnotatedException("Reason code CRL entry extension could not be decoded.", date);
            }
        }
        if (date.getTime() < x509crl.getRevocationDate().getTime() && obj != null && ((DEREnumerated) (obj)).getValue().intValue() != 0 && ((DEREnumerated) (obj)).getValue().intValue() != 1 && ((DEREnumerated) (obj)).getValue().intValue() != 2 && ((DEREnumerated) (obj)).getValue().intValue() != 8) goto _L3; else goto _L6
_L6:
        if (obj != null)
        {
            certstatus.setCertStatus(((DEREnumerated) (obj)).getValue().intValue());
        } else
        {
            certstatus.setCertStatus(0);
        }
        certstatus.setRevocationDate(x509crl.getRevocationDate());
        return;
_L2:
        if (!getEncodedIssuerPrincipal(obj).equals(getIssuerPrincipal(x509crl))) goto _L3; else goto _L7
_L7:
        obj = x509crl.getRevokedCertificate(getSerialNumber(obj));
        x509crl = ((X509CRL) (obj));
        if (obj == null)
        {
            return;
        }
          goto _L8
    }

    protected static Set getCompleteCRLs(DistributionPoint distributionpoint, Object obj, Date date, ExtendedPKIXParameters extendedpkixparameters)
        throws AnnotatedException
    {
        X509CRLStoreSelector x509crlstoreselector = new X509CRLStoreSelector();
        HashSet hashset;
        hashset = new HashSet();
        if (!(obj instanceof X509AttributeCertificate))
        {
            break MISSING_BLOCK_LABEL_154;
        }
        hashset.add(((X509AttributeCertificate)obj).getIssuer().getPrincipals()[0]);
_L1:
        getCRLIssuersFromDistributionPoint(distributionpoint, hashset, x509crlstoreselector, extendedpkixparameters);
        if (obj instanceof X509Certificate)
        {
            x509crlstoreselector.setCertificateChecking((X509Certificate)obj);
        } else
        if (obj instanceof X509AttributeCertificate)
        {
            x509crlstoreselector.setAttrCertificateChecking((X509AttributeCertificate)obj);
        }
        x509crlstoreselector.setCompleteCRLEnabled(true);
        distributionpoint = CRL_UTIL.findCRLs(x509crlstoreselector, extendedpkixparameters, date);
        if (distributionpoint.isEmpty())
        {
            if (obj instanceof X509AttributeCertificate)
            {
                distributionpoint = (X509AttributeCertificate)obj;
                throw new AnnotatedException((new StringBuilder()).append("No CRLs found for issuer \"").append(distributionpoint.getIssuer().getPrincipals()[0]).append("\"").toString());
            } else
            {
                distributionpoint = (X509Certificate)obj;
                throw new AnnotatedException((new StringBuilder()).append("No CRLs found for issuer \"").append(distributionpoint.getIssuerX500Principal()).append("\"").toString());
            }
        } else
        {
            return distributionpoint;
        }
        try
        {
            hashset.add(getEncodedIssuerPrincipal(obj));
        }
        // Misplaced declaration of an exception variable
        catch (DistributionPoint distributionpoint)
        {
            throw new AnnotatedException("Could not get issuer information from distribution point.", distributionpoint);
        }
          goto _L1
    }

    protected static Set getDeltaCRLs(Date date, ExtendedPKIXParameters extendedpkixparameters, X509CRL x509crl)
        throws AnnotatedException
    {
        Object obj;
        Object obj1 = null;
        X509CRLStoreSelector x509crlstoreselector = new X509CRLStoreSelector();
        byte abyte0[];
        try
        {
            x509crlstoreselector.addIssuerName(getIssuerPrincipal(x509crl).getEncoded());
        }
        // Misplaced declaration of an exception variable
        catch (Date date)
        {
            throw new AnnotatedException("Cannot extract issuer from CRL.", date);
        }
        try
        {
            obj = getExtensionValue(x509crl, CRL_NUMBER);
        }
        // Misplaced declaration of an exception variable
        catch (Date date)
        {
            throw new AnnotatedException("CRL number extension could not be extracted from CRL.", date);
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ASN1Integer.getInstance(obj).getPositiveValue();
_L4:
        try
        {
            abyte0 = x509crl.getExtensionValue(ISSUING_DISTRIBUTION_POINT);
        }
        // Misplaced declaration of an exception variable
        catch (Date date)
        {
            throw new AnnotatedException("Issuing distribution point extension value could not be read.", date);
        }
        if (obj == null)
        {
            x509crl = obj1;
        } else
        {
            x509crl = ((BigInteger) (obj)).add(BigInteger.valueOf(1L));
        }
        x509crlstoreselector.setMinCRLNumber(x509crl);
        x509crlstoreselector.setIssuingDistributionPoint(abyte0);
        x509crlstoreselector.setIssuingDistributionPointEnabled(true);
        x509crlstoreselector.setMaxBaseCRLNumber(((BigInteger) (obj)));
        extendedpkixparameters = CRL_UTIL.findCRLs(x509crlstoreselector, extendedpkixparameters, date);
        date = new HashSet();
        extendedpkixparameters = extendedpkixparameters.iterator();
        do
        {
            if (!extendedpkixparameters.hasNext())
            {
                break;
            }
            x509crl = (X509CRL)extendedpkixparameters.next();
            if (isDeltaCRL(x509crl))
            {
                date.add(x509crl);
            }
        } while (true);
        return date;
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected static X500Principal getEncodedIssuerPrincipal(Object obj)
    {
        if (obj instanceof X509Certificate)
        {
            return ((X509Certificate)obj).getIssuerX500Principal();
        } else
        {
            return (X500Principal)((X509AttributeCertificate)obj).getIssuer().getPrincipals()[0];
        }
    }

    protected static ASN1Primitive getExtensionValue(java.security.cert.X509Extension x509extension, String s)
        throws AnnotatedException
    {
        x509extension = x509extension.getExtensionValue(s);
        if (x509extension == null)
        {
            return null;
        } else
        {
            return getObject(s, x509extension);
        }
    }

    protected static X500Principal getIssuerPrincipal(X509CRL x509crl)
    {
        return x509crl.getIssuerX500Principal();
    }

    protected static PublicKey getNextWorkingKey(List list, int i)
        throws CertPathValidatorException
    {
        Object obj = ((Certificate)list.get(i)).getPublicKey();
        if (obj instanceof DSAPublicKey)
        {
            DSAPublicKey dsapublickey = (DSAPublicKey)obj;
            obj = dsapublickey;
            if (dsapublickey.getParams() == null)
            {
                for (i++; i < list.size();)
                {
                    Object obj1 = ((X509Certificate)list.get(i)).getPublicKey();
                    if (!(obj1 instanceof DSAPublicKey))
                    {
                        throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
                    }
                    obj1 = (DSAPublicKey)obj1;
                    if (((DSAPublicKey) (obj1)).getParams() == null)
                    {
                        i++;
                    } else
                    {
                        list = ((DSAPublicKey) (obj1)).getParams();
                        list = new DSAPublicKeySpec(dsapublickey.getY(), list.getP(), list.getQ(), list.getG());
                        try
                        {
                            list = KeyFactory.getInstance("DSA", BouncyCastleProvider.PROVIDER_NAME).generatePublic(list);
                        }
                        // Misplaced declaration of an exception variable
                        catch (List list)
                        {
                            throw new RuntimeException(list.getMessage());
                        }
                        return list;
                    }
                }

                throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
            }
        }
        return ((PublicKey) (obj));
    }

    private static ASN1Primitive getObject(String s, byte abyte0[])
        throws AnnotatedException
    {
        try
        {
            abyte0 = (new ASN1InputStream(((ASN1OctetString)(new ASN1InputStream(abyte0)).readObject()).getOctets())).readObject();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new AnnotatedException((new StringBuilder()).append("exception processing extension ").append(s).toString(), abyte0);
        }
        return abyte0;
    }

    protected static final Set getQualifierSet(ASN1Sequence asn1sequence)
        throws CertPathValidatorException
    {
        HashSet hashset = new HashSet();
        if (asn1sequence == null)
        {
            return hashset;
        }
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        ASN1OutputStream asn1outputstream = new ASN1OutputStream(bytearrayoutputstream);
        asn1sequence = asn1sequence.getObjects();
        while (asn1sequence.hasMoreElements()) 
        {
            try
            {
                asn1outputstream.writeObject((ASN1Encodable)asn1sequence.nextElement());
                hashset.add(new PolicyQualifierInfo(bytearrayoutputstream.toByteArray()));
            }
            // Misplaced declaration of an exception variable
            catch (ASN1Sequence asn1sequence)
            {
                throw new ExtCertPathValidatorException("Policy qualifier info cannot be decoded.", asn1sequence);
            }
            bytearrayoutputstream.reset();
        }
        return hashset;
    }

    private static BigInteger getSerialNumber(Object obj)
    {
        if (obj instanceof X509Certificate)
        {
            return ((X509Certificate)obj).getSerialNumber();
        } else
        {
            return ((X509AttributeCertificate)obj).getSerialNumber();
        }
    }

    protected static X500Principal getSubjectPrincipal(X509Certificate x509certificate)
    {
        return x509certificate.getSubjectX500Principal();
    }

    protected static Date getValidCertDateFromValidityModel(ExtendedPKIXParameters extendedpkixparameters, CertPath certpath, int i)
        throws AnnotatedException
    {
        if (extendedpkixparameters.getValidityModel() != 1) goto _L2; else goto _L1
_L1:
        if (i <= 0)
        {
            return getValidDate(extendedpkixparameters);
        }
        if (i - 1 != 0) goto _L4; else goto _L3
_L3:
        try
        {
            extendedpkixparameters = ((X509Certificate)certpath.getCertificates().get(i - 1)).getExtensionValue(ISISMTTObjectIdentifiers.id_isismtt_at_dateOfCertGen.getId());
        }
        // Misplaced declaration of an exception variable
        catch (ExtendedPKIXParameters extendedpkixparameters)
        {
            throw new AnnotatedException("Date of cert gen extension could not be read.");
        }
        // Misplaced declaration of an exception variable
        catch (ExtendedPKIXParameters extendedpkixparameters)
        {
            throw new AnnotatedException("Date of cert gen extension could not be read.");
        }
        if (extendedpkixparameters == null) goto _L6; else goto _L5
_L5:
        extendedpkixparameters = DERGeneralizedTime.getInstance(ASN1Primitive.fromByteArray(extendedpkixparameters));
_L8:
        if (extendedpkixparameters != null)
        {
            try
            {
                extendedpkixparameters = extendedpkixparameters.getDate();
            }
            // Misplaced declaration of an exception variable
            catch (ExtendedPKIXParameters extendedpkixparameters)
            {
                throw new AnnotatedException("Date from date of cert gen extension could not be parsed.", extendedpkixparameters);
            }
            return extendedpkixparameters;
        } else
        {
            return ((X509Certificate)certpath.getCertificates().get(i - 1)).getNotBefore();
        }
_L4:
        return ((X509Certificate)certpath.getCertificates().get(i - 1)).getNotBefore();
_L2:
        return getValidDate(extendedpkixparameters);
_L6:
        extendedpkixparameters = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected static Date getValidDate(PKIXParameters pkixparameters)
    {
        Date date = pkixparameters.getDate();
        pkixparameters = date;
        if (date == null)
        {
            pkixparameters = new Date();
        }
        return pkixparameters;
    }

    protected static boolean isAnyPolicy(Set set)
    {
        return set == null || set.contains("2.5.29.32.0") || set.isEmpty();
    }

    private static boolean isDeltaCRL(X509CRL x509crl)
    {
        x509crl = x509crl.getCriticalExtensionOIDs();
        if (x509crl == null)
        {
            return false;
        } else
        {
            return x509crl.contains(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
        }
    }

    protected static boolean isSelfIssued(X509Certificate x509certificate)
    {
        return x509certificate.getSubjectDN().equals(x509certificate.getIssuerDN());
    }

    protected static void prepareNextCertB1(int i, List alist[], String s, Map map, X509Certificate x509certificate)
        throws AnnotatedException, CertPathValidatorException
    {
        Iterator iterator;
        boolean flag1;
        flag1 = false;
        iterator = alist[i].iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        PKIXPolicyNode pkixpolicynode = (PKIXPolicyNode)iterator.next();
        if (!pkixpolicynode.getValidPolicy().equals(s)) goto _L4; else goto _L3
_L3:
        boolean flag;
        pkixpolicynode.expectedPolicies = (Set)map.get(s);
        flag = true;
_L6:
label0:
        {
            if (flag)
            {
                break label0;
            }
            Object obj = alist[i].iterator();
            PKIXPolicyNode pkixpolicynode1;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                pkixpolicynode1 = (PKIXPolicyNode)((Iterator) (obj)).next();
            } while (!"2.5.29.32.0".equals(pkixpolicynode1.getValidPolicy()));
            Object obj2 = null;
            Enumeration enumeration;
            try
            {
                obj = DERSequence.getInstance(getExtensionValue(x509certificate, CERTIFICATE_POLICIES));
            }
            // Misplaced declaration of an exception variable
            catch (List alist[])
            {
                throw new AnnotatedException("Certificate policies cannot be decoded.", alist);
            }
            enumeration = ((ASN1Sequence) (obj)).getObjects();
            do
            {
                Object obj1 = obj2;
                if (!enumeration.hasMoreElements())
                {
                    break;
                }
                try
                {
                    obj1 = PolicyInformation.getInstance(enumeration.nextElement());
                }
                // Misplaced declaration of an exception variable
                catch (List alist[])
                {
                    throw new AnnotatedException("Policy information cannot be decoded.", alist);
                }
                if (!"2.5.29.32.0".equals(((PolicyInformation) (obj1)).getPolicyIdentifier().getId()))
                {
                    continue;
                }
                try
                {
                    obj1 = getQualifierSet(((PolicyInformation) (obj1)).getPolicyQualifiers());
                }
                // Misplaced declaration of an exception variable
                catch (List alist[])
                {
                    throw new ExtCertPathValidatorException("Policy qualifier info set could not be built.", alist);
                }
                break;
            } while (true);
            if (x509certificate.getCriticalExtensionOIDs() != null)
            {
                flag1 = x509certificate.getCriticalExtensionOIDs().contains(CERTIFICATE_POLICIES);
            }
            x509certificate = (PKIXPolicyNode)pkixpolicynode1.getParent();
            if ("2.5.29.32.0".equals(x509certificate.getValidPolicy()))
            {
                s = new PKIXPolicyNode(new ArrayList(), i, (Set)map.get(s), x509certificate, ((Set) (obj1)), s, flag1);
                x509certificate.addChild(s);
                alist[i].add(s);
            }
        }
        return;
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected static PKIXPolicyNode prepareNextCertB2(int i, List alist[], String s, PKIXPolicyNode pkixpolicynode)
    {
        Iterator iterator = alist[i].iterator();
_L4:
        PKIXPolicyNode pkixpolicynode1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_165;
            }
            pkixpolicynode1 = (PKIXPolicyNode)iterator.next();
        } while (!pkixpolicynode1.getValidPolicy().equals(s));
        ((PKIXPolicyNode)pkixpolicynode1.getParent()).removeChild(pkixpolicynode1);
        iterator.remove();
_L2:
        int j;
        for (j = i - 1; j < 0;)
        {
            continue; /* Loop/switch isn't completed */
        }

        List list = alist[j];
        int k = 0;
        do
        {
            PKIXPolicyNode pkixpolicynode2;
label0:
            {
                pkixpolicynode2 = pkixpolicynode;
                if (k < list.size())
                {
                    PKIXPolicyNode pkixpolicynode3 = (PKIXPolicyNode)list.get(k);
                    pkixpolicynode2 = pkixpolicynode;
                    if (pkixpolicynode3.hasChildren())
                    {
                        break label0;
                    }
                    pkixpolicynode = removePolicyNode(pkixpolicynode, alist, pkixpolicynode3);
                    pkixpolicynode2 = pkixpolicynode;
                    if (pkixpolicynode != null)
                    {
                        break label0;
                    }
                    pkixpolicynode2 = pkixpolicynode;
                }
                j--;
                pkixpolicynode = pkixpolicynode2;
                break; /* Loop/switch isn't completed */
            }
            k++;
            pkixpolicynode = pkixpolicynode2;
        } while (true);
        return pkixpolicynode;
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected static boolean processCertD1i(int i, List alist[], DERObjectIdentifier derobjectidentifier, Set set)
    {
        boolean flag1 = false;
        Object obj = alist[i - 1];
        int j = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (j < ((List) (obj)).size())
                {
                    PKIXPolicyNode pkixpolicynode = (PKIXPolicyNode)((List) (obj)).get(j);
                    if (!pkixpolicynode.getExpectedPolicies().contains(derobjectidentifier.getId()))
                    {
                        break label0;
                    }
                    obj = new HashSet();
                    ((Set) (obj)).add(derobjectidentifier.getId());
                    derobjectidentifier = new PKIXPolicyNode(new ArrayList(), i, ((Set) (obj)), pkixpolicynode, set, derobjectidentifier.getId(), false);
                    pkixpolicynode.addChild(derobjectidentifier);
                    alist[i].add(derobjectidentifier);
                    flag = true;
                }
                return flag;
            }
            j++;
        } while (true);
    }

    protected static void processCertD1ii(int i, List alist[], DERObjectIdentifier derobjectidentifier, Set set)
    {
        Object obj = alist[i - 1];
        int j = 0;
        do
        {
label0:
            {
                if (j < ((List) (obj)).size())
                {
                    PKIXPolicyNode pkixpolicynode = (PKIXPolicyNode)((List) (obj)).get(j);
                    if (!"2.5.29.32.0".equals(pkixpolicynode.getValidPolicy()))
                    {
                        break label0;
                    }
                    obj = new HashSet();
                    ((Set) (obj)).add(derobjectidentifier.getId());
                    derobjectidentifier = new PKIXPolicyNode(new ArrayList(), i, ((Set) (obj)), pkixpolicynode, set, derobjectidentifier.getId(), false);
                    pkixpolicynode.addChild(derobjectidentifier);
                    alist[i].add(derobjectidentifier);
                }
                return;
            }
            j++;
        } while (true);
    }

    protected static PKIXPolicyNode removePolicyNode(PKIXPolicyNode pkixpolicynode, List alist[], PKIXPolicyNode pkixpolicynode1)
    {
        PKIXPolicyNode pkixpolicynode2 = (PKIXPolicyNode)pkixpolicynode1.getParent();
        if (pkixpolicynode == null)
        {
            return null;
        }
        if (pkixpolicynode2 == null)
        {
            for (int i = 0; i < alist.length; i++)
            {
                alist[i] = new ArrayList();
            }

            return null;
        } else
        {
            pkixpolicynode2.removeChild(pkixpolicynode1);
            removePolicyNodeRecurse(alist, pkixpolicynode1);
            return pkixpolicynode;
        }
    }

    private static void removePolicyNodeRecurse(List alist[], PKIXPolicyNode pkixpolicynode)
    {
        alist[pkixpolicynode.getDepth()].remove(pkixpolicynode);
        if (pkixpolicynode.hasChildren())
        {
            for (pkixpolicynode = pkixpolicynode.getChildren(); pkixpolicynode.hasNext(); removePolicyNodeRecurse(alist, (PKIXPolicyNode)pkixpolicynode.next())) { }
        }
    }

    protected static void verifyX509Certificate(X509Certificate x509certificate, PublicKey publickey, String s)
        throws GeneralSecurityException
    {
        if (s == null)
        {
            x509certificate.verify(publickey);
            return;
        } else
        {
            x509certificate.verify(publickey, s);
            return;
        }
    }

    static 
    {
        CERTIFICATE_POLICIES = X509Extensions.CertificatePolicies.getId();
        BASIC_CONSTRAINTS = X509Extensions.BasicConstraints.getId();
        POLICY_MAPPINGS = X509Extensions.PolicyMappings.getId();
        SUBJECT_ALTERNATIVE_NAME = X509Extensions.SubjectAlternativeName.getId();
        NAME_CONSTRAINTS = X509Extensions.NameConstraints.getId();
        KEY_USAGE = X509Extensions.KeyUsage.getId();
        INHIBIT_ANY_POLICY = X509Extensions.InhibitAnyPolicy.getId();
        ISSUING_DISTRIBUTION_POINT = X509Extensions.IssuingDistributionPoint.getId();
        DELTA_CRL_INDICATOR = X509Extensions.DeltaCRLIndicator.getId();
        POLICY_CONSTRAINTS = X509Extensions.PolicyConstraints.getId();
        FRESHEST_CRL = X509Extensions.FreshestCRL.getId();
        CRL_DISTRIBUTION_POINTS = X509Extensions.CRLDistributionPoints.getId();
        AUTHORITY_KEY_IDENTIFIER = X509Extensions.AuthorityKeyIdentifier.getId();
        CRL_NUMBER = X509Extensions.CRLNumber.getId();
    }
}
