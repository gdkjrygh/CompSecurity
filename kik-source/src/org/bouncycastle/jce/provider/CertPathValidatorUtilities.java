// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyQualifierInfo;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
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
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DEREnumerated;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.isismtt.ISISMTTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.CRLNumber;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
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
//            PKIXCRLUtil, BouncyCastleProvider, AnnotatedException, RFC3280CertPathUtilities, 
//            PKIXPolicyNode, X509CRLObject, X509CRLEntryObject, b

public class CertPathValidatorUtilities
{

    protected static final PKIXCRLUtil a = new PKIXCRLUtil();
    protected static final String b;
    protected static final String c;
    protected static final String d;
    protected static final String e;
    protected static final String f;
    protected static final String g;
    protected static final String h;
    protected static final String i;
    protected static final String j;
    protected static final String k;
    protected static final String l;
    protected static final String m;
    protected static final String n;
    protected static final String o;
    protected static final String p[] = {
        "unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", 
        "aACompromise"
    };

    public CertPathValidatorUtilities()
    {
    }

    protected static PublicKey a(List list, int i1)
    {
        Object obj = ((Certificate)list.get(i1)).getPublicKey();
        if (obj instanceof DSAPublicKey)
        {
            DSAPublicKey dsapublickey = (DSAPublicKey)obj;
            obj = dsapublickey;
            if (dsapublickey.getParams() == null)
            {
                for (i1++; i1 < list.size(); i1++)
                {
                    Object obj1 = ((X509Certificate)list.get(i1)).getPublicKey();
                    if (!(obj1 instanceof DSAPublicKey))
                    {
                        throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
                    }
                    obj1 = (DSAPublicKey)obj1;
                    if (((DSAPublicKey) (obj1)).getParams() != null)
                    {
                        list = ((DSAPublicKey) (obj1)).getParams();
                        list = new DSAPublicKeySpec(dsapublickey.getY(), list.getP(), list.getQ(), list.getG());
                        try
                        {
                            list = KeyFactory.getInstance("DSA", BouncyCastleProvider.a).generatePublic(list);
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

    protected static TrustAnchor a(X509Certificate x509certificate, Set set, String s)
    {
        PublicKey publickey;
        Set set1;
        Object obj;
        PublicKey publickey1;
        X500Principal x500principal;
        X509CertSelector x509certselector = new X509CertSelector();
        x500principal = a(x509certificate);
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
        obj = null;
        publickey1 = null;
        set1 = null;
_L7:
        if (!iterator.hasNext() || set1 != null) goto _L2; else goto _L1
_L1:
        set = (TrustAnchor)iterator.next();
        if (set.getTrustedCert() == null) goto _L4; else goto _L3
_L3:
        if (x509certselector.match(set.getTrustedCert()))
        {
            publickey = set.getTrustedCert().getPublicKey();
        } else
        {
            set = null;
            publickey = publickey1;
        }
_L5:
        set1 = set;
        publickey1 = publickey;
        if (publickey == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            a(x509certificate, publickey, s);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            set1 = null;
            publickey1 = publickey;
            continue; /* Loop/switch isn't completed */
        }
        set1 = set;
        publickey1 = publickey;
        continue; /* Loop/switch isn't completed */
_L4:
        if (set.getCAName() == null || set.getCAPublicKey() == null)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        if (x500principal.equals(new X500Principal(set.getCAName())))
        {
            publickey = set.getCAPublicKey();
            continue; /* Loop/switch isn't completed */
        }
        set = null;
        publickey = publickey1;
        continue; /* Loop/switch isn't completed */
        set;
        set = null;
        publickey = publickey1;
        if (true) goto _L5; else goto _L2
_L2:
        if (set1 == null && obj != null)
        {
            throw new AnnotatedException("TrustAnchor found but certificate validation failed.", ((Throwable) (obj)));
        }
        return set1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected static Collection a(X509Certificate x509certificate, ExtendedPKIXBuilderParameters extendedpkixbuilderparameters)
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
            x509certificate.addAll(a(x509certstoreselector, extendedpkixbuilderparameters.getCertStores()));
            x509certificate.addAll(a(x509certstoreselector, extendedpkixbuilderparameters.f()));
            x509certificate.addAll(a(x509certstoreselector, extendedpkixbuilderparameters.e()));
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

    protected static Collection a(X509AttributeCertStoreSelector x509attributecertstoreselector, List list)
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
                    hashset.addAll(((X509Store) (obj)).a(x509attributecertstoreselector));
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

    protected static Collection a(X509CertStoreSelector x509certstoreselector, List list)
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
                    hashset.addAll(((X509Store) (obj)).a(x509certstoreselector));
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

    protected static Date a(PKIXParameters pkixparameters)
    {
        Date date = pkixparameters.getDate();
        pkixparameters = date;
        if (date == null)
        {
            pkixparameters = new Date();
        }
        return pkixparameters;
    }

    protected static Date a(ExtendedPKIXParameters extendedpkixparameters, CertPath certpath, int i1)
    {
        if (extendedpkixparameters.d() != 1) goto _L2; else goto _L1
_L1:
        if (i1 <= 0)
        {
            return a(((PKIXParameters) (extendedpkixparameters)));
        }
        if (i1 - 1 != 0) goto _L4; else goto _L3
_L3:
        try
        {
            extendedpkixparameters = ((X509Certificate)certpath.getCertificates().get(i1 - 1)).getExtensionValue(ISISMTTObjectIdentifiers.e.e());
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
        extendedpkixparameters = DERGeneralizedTime.a(ASN1Object.a(extendedpkixparameters));
_L8:
        if (extendedpkixparameters != null)
        {
            try
            {
                extendedpkixparameters = extendedpkixparameters.f();
            }
            // Misplaced declaration of an exception variable
            catch (ExtendedPKIXParameters extendedpkixparameters)
            {
                throw new AnnotatedException("Date from date of cert gen extension could not be parsed.", extendedpkixparameters);
            }
            return extendedpkixparameters;
        } else
        {
            return ((X509Certificate)certpath.getCertificates().get(i1 - 1)).getNotBefore();
        }
_L4:
        return ((X509Certificate)certpath.getCertificates().get(i1 - 1)).getNotBefore();
_L2:
        return a(((PKIXParameters) (extendedpkixparameters)));
_L6:
        extendedpkixparameters = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected static Set a(Date date, ExtendedPKIXParameters extendedpkixparameters, X509CRL x509crl)
    {
        Object obj;
        Object obj1 = null;
        X509CRLStoreSelector x509crlstoreselector = new X509CRLStoreSelector();
        byte abyte0[];
        try
        {
            x509crlstoreselector.addIssuerName(x509crl.getIssuerX500Principal().getEncoded());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            new AnnotatedException("Cannot extract issuer from CRL.", ((Throwable) (obj)));
        }
        try
        {
            obj = a(((X509Extension) (x509crl)), o);
        }
        // Misplaced declaration of an exception variable
        catch (Date date)
        {
            throw new AnnotatedException("CRL number extension could not be extracted from CRL.", date);
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = CRLNumber.a(obj).f();
_L4:
        try
        {
            abyte0 = x509crl.getExtensionValue(i);
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
        x509crlstoreselector.a(abyte0);
        x509crlstoreselector.a();
        x509crlstoreselector.a(((BigInteger) (obj)));
        extendedpkixparameters = PKIXCRLUtil.a(x509crlstoreselector, extendedpkixparameters, date);
        date = new HashSet();
        extendedpkixparameters = extendedpkixparameters.iterator();
        do
        {
            if (!extendedpkixparameters.hasNext())
            {
                break;
            }
            x509crl = (X509CRL)extendedpkixparameters.next();
            if (x509crl.getCriticalExtensionOIDs().contains(RFC3280CertPathUtilities.f))
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

    protected static final Set a(ASN1Sequence asn1sequence)
    {
        HashSet hashset = new HashSet();
        if (asn1sequence != null)
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            ASN1OutputStream asn1outputstream = new ASN1OutputStream(bytearrayoutputstream);
            asn1sequence = asn1sequence.e();
            while (asn1sequence.hasMoreElements()) 
            {
                try
                {
                    asn1outputstream.a(asn1sequence.nextElement());
                    hashset.add(new PolicyQualifierInfo(bytearrayoutputstream.toByteArray()));
                }
                // Misplaced declaration of an exception variable
                catch (ASN1Sequence asn1sequence)
                {
                    throw new ExtCertPathValidatorException("Policy qualifier info cannot be decoded.", asn1sequence);
                }
                bytearrayoutputstream.reset();
            }
        }
        return hashset;
    }

    protected static Set a(DistributionPoint distributionpoint, Object obj, Date date, ExtendedPKIXParameters extendedpkixparameters)
    {
        X509CRLStoreSelector x509crlstoreselector = new X509CRLStoreSelector();
        HashSet hashset = new HashSet();
        if (!(obj instanceof X509AttributeCertificate)) goto _L2; else goto _L1
_L1:
        hashset.add(((X509AttributeCertificate)obj).d().a()[0]);
_L3:
        a(distributionpoint, ((Collection) (hashset)), ((X509CRLSelector) (x509crlstoreselector)));
_L4:
        if (obj instanceof X509Certificate)
        {
            x509crlstoreselector.setCertificateChecking((X509Certificate)obj);
        } else
        if (obj instanceof X509AttributeCertificate)
        {
            x509crlstoreselector.a((X509AttributeCertificate)obj);
        }
        x509crlstoreselector.d();
        distributionpoint = PKIXCRLUtil.a(x509crlstoreselector, extendedpkixparameters, date);
        if (distributionpoint.isEmpty())
        {
            if (obj instanceof X509AttributeCertificate)
            {
                distributionpoint = (X509AttributeCertificate)obj;
                throw new AnnotatedException((new StringBuilder("No CRLs found for issuer \"")).append(distributionpoint.d().a()[0]).append("\"").toString());
            } else
            {
                distributionpoint = (X509Certificate)obj;
                throw new AnnotatedException((new StringBuilder("No CRLs found for issuer \"")).append(distributionpoint.getIssuerX500Principal()).append("\"").toString());
            }
        } else
        {
            return distributionpoint;
        }
_L2:
        hashset.add(a(obj));
          goto _L3
        distributionpoint;
        new AnnotatedException("Could not get issuer information from distribution point.", distributionpoint);
          goto _L4
    }

    protected static X500Principal a(Object obj)
    {
        if (obj instanceof X509Certificate)
        {
            return ((X509Certificate)obj).getIssuerX500Principal();
        } else
        {
            return (X500Principal)((X509AttributeCertificate)obj).d().a()[0];
        }
    }

    protected static X500Principal a(X509CRL x509crl)
    {
        return x509crl.getIssuerX500Principal();
    }

    protected static X500Principal a(X509Certificate x509certificate)
    {
        return x509certificate.getSubjectX500Principal();
    }

    private static DERObject a(String s, byte abyte0[])
    {
        try
        {
            abyte0 = (new ASN1InputStream(((ASN1OctetString)(new ASN1InputStream(abyte0)).a()).f())).a();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new AnnotatedException((new StringBuilder("exception processing extension ")).append(s).toString(), abyte0);
        }
        return abyte0;
    }

    protected static DERObject a(X509Extension x509extension, String s)
    {
        x509extension = x509extension.getExtensionValue(s);
        if (x509extension == null)
        {
            return null;
        } else
        {
            return a(s, ((byte []) (x509extension)));
        }
    }

    protected static AlgorithmIdentifier a(PublicKey publickey)
    {
        try
        {
            publickey = SubjectPublicKeyInfo.a((new ASN1InputStream(publickey.getEncoded())).a()).e();
        }
        // Misplaced declaration of an exception variable
        catch (PublicKey publickey)
        {
            throw new ExtCertPathValidatorException("Subject public key cannot be decoded.", publickey);
        }
        return publickey;
    }

    protected static PKIXPolicyNode a(PKIXPolicyNode pkixpolicynode, List alist[], PKIXPolicyNode pkixpolicynode1)
    {
        PKIXPolicyNode pkixpolicynode2 = (PKIXPolicyNode)pkixpolicynode1.getParent();
        if (pkixpolicynode == null)
        {
            return null;
        }
        if (pkixpolicynode2 == null)
        {
            for (int i1 = 0; i1 < alist.length; i1++)
            {
                alist[i1] = new ArrayList();
            }

            return null;
        } else
        {
            pkixpolicynode2.b(pkixpolicynode1);
            a(alist, pkixpolicynode1);
            return pkixpolicynode;
        }
    }

    private static void a(String s, ExtendedPKIXParameters extendedpkixparameters)
    {
        if (!extendedpkixparameters.g())
        {
            break MISSING_BLOCK_LABEL_181;
        }
        String s1;
        if (!s.startsWith("ldap://"))
        {
            break MISSING_BLOCK_LABEL_181;
        }
        s1 = s.substring(7);
        s = null;
        if (s1.indexOf("/") == -1)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        s = s1.substring(s1.indexOf("/"));
        s1 = (new StringBuilder("ldap://")).append(s1.substring(0, s1.indexOf("/"))).toString();
_L1:
        s = (new org.bouncycastle.jce.X509LDAPCertStoreParameters.Builder(s1, s)).a();
        extendedpkixparameters.a(X509Store.a("CERTIFICATE/LDAP", s, BouncyCastleProvider.a));
        extendedpkixparameters.a(X509Store.a("CRL/LDAP", s, BouncyCastleProvider.a));
        extendedpkixparameters.a(X509Store.a("ATTRIBUTECERTIFICATE/LDAP", s, BouncyCastleProvider.a));
        extendedpkixparameters.a(X509Store.a("CERTIFICATEPAIR/LDAP", s, BouncyCastleProvider.a));
        return;
        try
        {
            s1 = (new StringBuilder("ldap://")).append(s1).toString();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("Exception adding X.509 stores.");
        }
          goto _L1
    }

    protected static void a(X509Certificate x509certificate, PublicKey publickey, String s)
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

    protected static void a(X509Certificate x509certificate, ExtendedPKIXParameters extendedpkixparameters)
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
                    a((String)list.get(1), extendedpkixparameters);
                }
            } while (true);
        }
    }

    protected static void a(Date date, X509CRL x509crl, Object obj, b b1)
    {
        Object obj1;
        X509CRLObject x509crlobject;
        try
        {
            x509crlobject = new X509CRLObject(new CertificateList((ASN1Sequence)ASN1Sequence.a(x509crl.getEncoded())));
        }
        // Misplaced declaration of an exception variable
        catch (Date date)
        {
            throw new AnnotatedException("Bouncy Castle X509CRLObject could not be created.", date);
        }
        if (obj instanceof X509Certificate)
        {
            obj1 = ((X509Certificate)obj).getSerialNumber();
        } else
        {
            obj1 = ((X509AttributeCertificate)obj).a();
        }
        obj1 = (X509CRLEntryObject)x509crlobject.getRevokedCertificate(((BigInteger) (obj1)));
        if (obj1 != null && (a(obj).equals(((X509CRLEntryObject) (obj1)).getCertificateIssuer()) || a(obj).equals(x509crl.getIssuerX500Principal())))
        {
            obj = null;
            x509crl = ((X509CRL) (obj));
            if (((X509CRLEntryObject) (obj1)).hasExtensions())
            {
                try
                {
                    x509crl = DEREnumerated.a(a(((X509Extension) (obj1)), X509Extensions.i.e()));
                }
                // Misplaced declaration of an exception variable
                catch (X509CRL x509crl)
                {
                    new AnnotatedException("Reason code CRL entry extension could not be decoded.", x509crl);
                    x509crl = ((X509CRL) (obj));
                }
            }
            if (date.getTime() >= ((X509CRLEntryObject) (obj1)).getRevocationDate().getTime() || x509crl == null || x509crl.e().intValue() == 0 || x509crl.e().intValue() == 1 || x509crl.e().intValue() == 2 || x509crl.e().intValue() == 8)
            {
                if (x509crl != null)
                {
                    b1.a = x509crl.e().intValue();
                } else
                {
                    b1.a = 0;
                }
                b1.b = ((X509CRLEntryObject) (obj1)).getRevocationDate();
            }
        }
    }

    protected static void a(CRLDistPoint crldistpoint, ExtendedPKIXParameters extendedpkixparameters)
    {
        if (crldistpoint != null)
        {
            int i1;
            try
            {
                crldistpoint = crldistpoint.e();
            }
            // Misplaced declaration of an exception variable
            catch (CRLDistPoint crldistpoint)
            {
                throw new AnnotatedException("Distribution points could not be read.", crldistpoint);
            }
            for (i1 = 0; i1 < crldistpoint.length; i1++)
            {
                DistributionPointName distributionpointname = crldistpoint[i1].e();
                if (distributionpointname == null || distributionpointname.e() != 0)
                {
                    continue;
                }
                GeneralName ageneralname[] = GeneralNames.a(distributionpointname.f()).e();
                for (int j1 = 0; j1 < ageneralname.length; j1++)
                {
                    if (ageneralname[j1].e() == 6)
                    {
                        a(DERIA5String.a(ageneralname[j1].f()).n_(), extendedpkixparameters);
                    }
                }

            }

        }
    }

    private static void a(DistributionPoint distributionpoint, Collection collection, X509CRLSelector x509crlselector)
    {
        ArrayList arraylist = new ArrayList();
        if (distributionpoint.g() != null)
        {
            distributionpoint = distributionpoint.g().e();
            int i1 = 0;
            while (i1 < distributionpoint.length) 
            {
                if (distributionpoint[i1].e() == 4)
                {
                    try
                    {
                        arraylist.add(new X500Principal(distributionpoint[i1].f().c().a()));
                    }
                    // Misplaced declaration of an exception variable
                    catch (DistributionPoint distributionpoint)
                    {
                        throw new AnnotatedException("CRL issuer information from distribution point cannot be decoded.", distributionpoint);
                    }
                }
                i1++;
            }
        } else
        {
            if (distributionpoint.e() == null)
            {
                throw new AnnotatedException("CRL issuer is omitted from distribution point but no distributionPoint field present.");
            }
            for (distributionpoint = collection.iterator(); distributionpoint.hasNext(); arraylist.add((X500Principal)distributionpoint.next())) { }
        }
        for (distributionpoint = arraylist.iterator(); distributionpoint.hasNext();)
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

    private static void a(List alist[], PKIXPolicyNode pkixpolicynode)
    {
        alist[pkixpolicynode.getDepth()].remove(pkixpolicynode);
        if (pkixpolicynode.a())
        {
            for (pkixpolicynode = pkixpolicynode.getChildren(); pkixpolicynode.hasNext(); a(alist, (PKIXPolicyNode)pkixpolicynode.next())) { }
        }
    }

    protected static boolean a(int i1, List alist[], DERObjectIdentifier derobjectidentifier, Set set)
    {
        boolean flag1 = false;
        Object obj = alist[i1 - 1];
        int j1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (j1 < ((List) (obj)).size())
                {
                    PKIXPolicyNode pkixpolicynode = (PKIXPolicyNode)((List) (obj)).get(j1);
                    if (!pkixpolicynode.getExpectedPolicies().contains(derobjectidentifier.e()))
                    {
                        break label0;
                    }
                    obj = new HashSet();
                    ((Set) (obj)).add(derobjectidentifier.e());
                    derobjectidentifier = new PKIXPolicyNode(new ArrayList(), i1, ((Set) (obj)), pkixpolicynode, set, derobjectidentifier.e(), false);
                    pkixpolicynode.a(derobjectidentifier);
                    alist[i1].add(derobjectidentifier);
                    flag = true;
                }
                return flag;
            }
            j1++;
        } while (true);
    }

    protected static boolean a(Set set)
    {
        return set == null || set.contains("2.5.29.32.0") || set.isEmpty();
    }

    protected static void b(int i1, List alist[], DERObjectIdentifier derobjectidentifier, Set set)
    {
        Object obj = alist[i1 - 1];
        int j1 = 0;
        do
        {
label0:
            {
                if (j1 < ((List) (obj)).size())
                {
                    PKIXPolicyNode pkixpolicynode = (PKIXPolicyNode)((List) (obj)).get(j1);
                    if (!"2.5.29.32.0".equals(pkixpolicynode.getValidPolicy()))
                    {
                        break label0;
                    }
                    obj = new HashSet();
                    ((Set) (obj)).add(derobjectidentifier.e());
                    derobjectidentifier = new PKIXPolicyNode(new ArrayList(), i1, ((Set) (obj)), pkixpolicynode, set, derobjectidentifier.e(), false);
                    pkixpolicynode.a(derobjectidentifier);
                    alist[i1].add(derobjectidentifier);
                }
                return;
            }
            j1++;
        } while (true);
    }

    protected static boolean b(X509Certificate x509certificate)
    {
        return x509certificate.getSubjectDN().equals(x509certificate.getIssuerDN());
    }

    static 
    {
        b = X509Extensions.q.e();
        c = X509Extensions.g.e();
        d = X509Extensions.r.e();
        e = X509Extensions.e.e();
        f = X509Extensions.o.e();
        g = X509Extensions.c.e();
        h = X509Extensions.w.e();
        i = X509Extensions.m.e();
        j = X509Extensions.l.e();
        k = X509Extensions.t.e();
        l = X509Extensions.v.e();
        m = X509Extensions.p.e();
        n = X509Extensions.s.e();
        o = X509Extensions.h.e();
    }
}
