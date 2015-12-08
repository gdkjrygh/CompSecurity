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
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
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
import org.bouncycastle.asn1.x509.ReasonFlags;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.asn1.x509.X509Name;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.x509.ExtendedPKIXBuilderParameters;
import org.bouncycastle.x509.ExtendedPKIXParameters;
import org.bouncycastle.x509.X509CertStoreSelector;

// Referenced classes of package org.bouncycastle.jce.provider:
//            PKIXCRLUtil, CertPathValidatorUtilities, AnnotatedException, BouncyCastleProvider, 
//            PKIXPolicyNode, h, PKIXNameConstraintValidatorException, PKIXNameConstraintValidator, 
//            b

public class RFC3280CertPathUtilities
{

    protected static final String a;
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
    protected static final String o[] = {
        "unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", 
        "aACompromise"
    };
    private static final PKIXCRLUtil p = new PKIXCRLUtil();

    public RFC3280CertPathUtilities()
    {
    }

    protected static int a(int i1, X509Certificate x509certificate)
    {
        int j1 = i1;
        if (!CertPathValidatorUtilities.b(x509certificate))
        {
            j1 = i1;
            if (i1 != 0)
            {
                j1 = i1 - 1;
            }
        }
        return j1;
    }

    protected static int a(CertPath certpath, int i1, int j1)
    {
        Object obj = (X509Certificate)certpath.getCertificates().get(i1);
        ASN1TaggedObject asn1taggedobject;
        int k1;
        int l1;
        try
        {
            obj = DERSequence.a(CertPathValidatorUtilities.a(((X509Extension) (obj)), g));
        }
        catch (Exception exception)
        {
            throw new ExtCertPathValidatorException("Policy constraints extension cannot be decoded.", exception, certpath, i1);
        }
        k1 = j1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        obj = ((ASN1Sequence) (obj)).e();
        k1 = j1;
        if (!((Enumeration) (obj)).hasMoreElements())
        {
            break MISSING_BLOCK_LABEL_95;
        }
        try
        {
            asn1taggedobject = ASN1TaggedObject.a(((Enumeration) (obj)).nextElement());
            if (asn1taggedobject.e() != 0)
            {
                break MISSING_BLOCK_LABEL_37;
            }
            l1 = DERInteger.a(asn1taggedobject, false).e().intValue();
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw new ExtCertPathValidatorException("Policy constraints extension contents cannot be decoded.", illegalargumentexception, certpath, i1);
        }
        k1 = j1;
        if (l1 < j1)
        {
            k1 = l1;
        }
        return k1;
    }

    protected static PublicKey a(X509CRL x509crl, Set set)
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

    protected static X509CRL a(Set set, PublicKey publickey)
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

    protected static Set a(X509CRL x509crl, X509Certificate x509certificate, PublicKey publickey, ExtendedPKIXParameters extendedpkixparameters, List list)
    {
        Object obj;
        ArrayList arraylist;
        X509Certificate x509certificate1;
        int i1;
        i1 = 0;
        obj = new X509CertStoreSelector();
        try
        {
            ((X509CertStoreSelector) (obj)).setSubject(CertPathValidatorUtilities.a(x509crl).getEncoded());
        }
        // Misplaced declaration of an exception variable
        catch (X509CRL x509crl)
        {
            throw new AnnotatedException("Subject criteria for certificate selector to find issuer certificate for CRL could not be set.", x509crl);
        }
        try
        {
            x509crl = CertPathValidatorUtilities.a(((X509CertStoreSelector) (obj)), extendedpkixparameters.f());
            x509crl.addAll(CertPathValidatorUtilities.a(((X509CertStoreSelector) (obj)), extendedpkixparameters.e()));
            x509crl.addAll(CertPathValidatorUtilities.a(((X509CertStoreSelector) (obj)), extendedpkixparameters.getCertStores()));
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
        obj1 = CertPathBuilder.getInstance("PKIX", BouncyCastleProvider.a);
        obj2 = new X509CertStoreSelector();
        ((X509CertStoreSelector) (obj2)).setCertificate(x509certificate1);
        ExtendedPKIXParameters extendedpkixparameters1 = (ExtendedPKIXParameters)extendedpkixparameters.clone();
        extendedpkixparameters1.setTargetCertConstraints(((java.security.cert.CertSelector) (obj2)));
        obj2 = (ExtendedPKIXBuilderParameters)ExtendedPKIXBuilderParameters.b(extendedpkixparameters1);
        if (!list.contains(x509certificate1)) goto _L4; else goto _L3
_L3:
        ((ExtendedPKIXBuilderParameters) (obj2)).setRevocationEnabled(false);
_L5:
        obj1 = ((CertPathBuilder) (obj1)).build(((java.security.cert.CertPathParameters) (obj2))).getCertPath().getCertificates();
        ((List) (obj)).add(x509certificate1);
        arraylist.add(CertPathValidatorUtilities.a(((List) (obj1)), 0));
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
        while (i1 < ((List) (obj)).size()) 
        {
            publickey = ((X509Certificate)((List) (obj)).get(i1)).getKeyUsage();
            if (publickey != null && (publickey.length < 7 || publickey[6] == 0))
            {
                x509crl = new AnnotatedException("Issuer certificate key usage extension does not permit CRL signing.");
            } else
            {
                x509certificate.add(arraylist.get(i1));
            }
            i1++;
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

    protected static PKIXPolicyNode a(CertPath certpath, int i1, Set set, PKIXPolicyNode pkixpolicynode, List alist[], int j1)
    {
label0:
        {
label1:
            {
                X509Certificate x509certificate;
                int k1;
label2:
                {
                    Object obj = certpath.getCertificates();
                    x509certificate = (X509Certificate)((List) (obj)).get(i1);
                    int l1 = ((List) (obj)).size();
                    k1 = l1 - i1;
                    Object obj1;
                    Enumeration enumeration;
                    try
                    {
                        obj = DERSequence.a(CertPathValidatorUtilities.a(x509certificate, a));
                    }
                    // Misplaced declaration of an exception variable
                    catch (Set set)
                    {
                        throw new ExtCertPathValidatorException("Could not read certificate policies extension from certificate.", set, certpath, i1);
                    }
                    if (obj == null || pkixpolicynode == null)
                    {
                        break label1;
                    }
                    enumeration = ((ASN1Sequence) (obj)).e();
                    obj1 = new HashSet();
                    do
                    {
                        if (!enumeration.hasMoreElements())
                        {
                            break;
                        }
                        Object obj3 = PolicyInformation.a(enumeration.nextElement());
                        DERObjectIdentifier derobjectidentifier = ((PolicyInformation) (obj3)).e();
                        ((Set) (obj1)).add(derobjectidentifier.e());
                        if (!"2.5.29.32.0".equals(derobjectidentifier.e()))
                        {
                            try
                            {
                                obj3 = CertPathValidatorUtilities.a(((PolicyInformation) (obj3)).f());
                            }
                            // Misplaced declaration of an exception variable
                            catch (Set set)
                            {
                                throw new ExtCertPathValidatorException("Policy qualifier info set could not be build.", set, certpath, i1);
                            }
                            if (!CertPathValidatorUtilities.a(k1, alist, derobjectidentifier, ((Set) (obj3))))
                            {
                                CertPathValidatorUtilities.b(k1, alist, derobjectidentifier, ((Set) (obj3)));
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
                    if (j1 <= 0 && (k1 >= l1 || !CertPathValidatorUtilities.b(x509certificate)))
                    {
                        break label2;
                    }
                    certpath = ((ASN1Sequence) (obj)).e();
                    do
                    {
                        if (!certpath.hasMoreElements())
                        {
                            break label2;
                        }
                        set = PolicyInformation.a(certpath.nextElement());
                    } while (!"2.5.29.32.0".equals(set.e().e()));
                    set = CertPathValidatorUtilities.a(set.f());
                    obj = alist[k1 - 1];
label3:
                    for (j1 = 0; j1 < ((List) (obj)).size(); j1++)
                    {
                        obj1 = (PKIXPolicyNode)((List) (obj)).get(j1);
                        Iterator iterator = ((PKIXPolicyNode) (obj1)).getExpectedPolicies().iterator();
                        do
                        {
                            if (!iterator.hasNext())
                            {
                                continue label3;
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
                                certpath = ((DERObjectIdentifier)certpath).e();
                            }
                            i1 = 0;
                            iterator1 = ((PKIXPolicyNode) (obj1)).getChildren();
                            do
                            {
                                if (!iterator1.hasNext())
                                {
                                    break;
                                }
                                if (certpath.equals(((PKIXPolicyNode)iterator1.next()).getValidPolicy()))
                                {
                                    i1 = 1;
                                }
                            } while (true);
                            if (i1 == 0)
                            {
                                HashSet hashset1 = new HashSet();
                                hashset1.add(certpath);
                                certpath = new PKIXPolicyNode(new ArrayList(), k1, hashset1, ((java.security.cert.PolicyNode) (obj1)), set, certpath, false);
                                ((PKIXPolicyNode) (obj1)).a(certpath);
                                alist[k1].add(certpath);
                            }
                        } while (true);
                    }

                }
                i1 = k1 - 1;
                certpath = pkixpolicynode;
                for (; i1 >= 0; i1--)
                {
                    pkixpolicynode = alist[i1];
                    for (j1 = 0; j1 < pkixpolicynode.size(); j1++)
                    {
                        set = (PKIXPolicyNode)pkixpolicynode.get(j1);
                        if (set.a())
                        {
                            continue;
                        }
                        set = CertPathValidatorUtilities.a(certpath, alist, set);
                        certpath = set;
                        if (set == null)
                        {
                            break;
                        }
                        certpath = set;
                    }

                }

                pkixpolicynode = x509certificate.getCriticalExtensionOIDs();
                set = certpath;
                if (pkixpolicynode != null)
                {
                    boolean flag = pkixpolicynode.contains(a);
                    pkixpolicynode = alist[k1];
                    i1 = 0;
                    do
                    {
                        set = certpath;
                        if (i1 >= pkixpolicynode.size())
                        {
                            break;
                        }
                        ((PKIXPolicyNode)pkixpolicynode.get(i1)).a(flag);
                        i1++;
                    } while (true);
                }
                break label0;
            }
            set = null;
        }
        return set;
    }

    protected static PKIXPolicyNode a(CertPath certpath, int i1, PKIXPolicyNode pkixpolicynode)
    {
        Object obj = (X509Certificate)certpath.getCertificates().get(i1);
        try
        {
            obj = DERSequence.a(CertPathValidatorUtilities.a(((X509Extension) (obj)), a));
        }
        // Misplaced declaration of an exception variable
        catch (PKIXPolicyNode pkixpolicynode)
        {
            throw new ExtCertPathValidatorException("Could not read certificate policies extension from certificate.", pkixpolicynode, certpath, i1);
        }
        if (obj == null)
        {
            pkixpolicynode = null;
        }
        return pkixpolicynode;
    }

    protected static PKIXPolicyNode a(CertPath certpath, int i1, List alist[], PKIXPolicyNode pkixpolicynode, int j1)
    {
        X509Certificate x509certificate;
        HashMap hashmap;
        int j2;
        Object obj = certpath.getCertificates();
        x509certificate = (X509Certificate)((List) (obj)).get(i1);
        j2 = ((List) (obj)).size() - i1;
        ASN1Sequence asn1sequence;
        HashSet hashset1;
        int k1;
        try
        {
            obj = DERSequence.a(CertPathValidatorUtilities.a(x509certificate, b));
        }
        // Misplaced declaration of an exception variable
        catch (List alist[])
        {
            throw new ExtCertPathValidatorException("Policy mappings extension could not be decoded.", alist, certpath, i1);
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        Iterator iterator1;
        hashmap = new HashMap();
        HashSet hashset = new HashSet();
        k1 = 0;
        while (k1 < ((ASN1Sequence) (obj)).f()) 
        {
            asn1sequence = (ASN1Sequence)((ASN1Sequence) (obj)).a(k1);
            String s = ((DERObjectIdentifier)asn1sequence.a(0)).e();
            String s1 = ((DERObjectIdentifier)asn1sequence.a(1)).e();
            if (!hashmap.containsKey(s))
            {
                hashset1 = new HashSet();
                hashset1.add(s1);
                hashmap.put(s, hashset1);
                hashset.add(s);
            } else
            {
                ((Set)hashmap.get(s)).add(s1);
            }
            k1++;
        }
        iterator1 = hashset.iterator();
_L8:
        Object obj1 = pkixpolicynode;
        if (!iterator1.hasNext()) goto _L4; else goto _L3
_L3:
        String s2 = (String)iterator1.next();
        if (j1 <= 0) goto _L6; else goto _L5
_L5:
        int l1;
        obj1 = alist[j2].iterator();
        PKIXPolicyNode pkixpolicynode1;
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break MISSING_BLOCK_LABEL_810;
            }
            pkixpolicynode1 = (PKIXPolicyNode)((Iterator) (obj1)).next();
        } while (!pkixpolicynode1.getValidPolicy().equals(s2));
        pkixpolicynode1.c = (Set)hashmap.get(s2);
        l1 = 1;
_L12:
        if (l1 != 0) goto _L8; else goto _L7
_L7:
        obj1 = alist[j2].iterator();
_L11:
        if (!((Iterator) (obj1)).hasNext()) goto _L8; else goto _L9
_L9:
        PKIXPolicyNode pkixpolicynode3 = (PKIXPolicyNode)((Iterator) (obj1)).next();
        if (!"2.5.29.32.0".equals(pkixpolicynode3.getValidPolicy())) goto _L11; else goto _L10
_L10:
        PKIXPolicyNode pkixpolicynode2 = null;
        Enumeration enumeration;
        try
        {
            obj1 = (ASN1Sequence)CertPathValidatorUtilities.a(x509certificate, a);
        }
        // Misplaced declaration of an exception variable
        catch (List alist[])
        {
            throw new ExtCertPathValidatorException("Certificate policies extension could not be decoded.", alist, certpath, i1);
        }
        enumeration = ((ASN1Sequence) (obj1)).e();
        do
        {
            obj1 = pkixpolicynode2;
            if (!enumeration.hasMoreElements())
            {
                break;
            }
            boolean flag;
            try
            {
                obj1 = PolicyInformation.a(enumeration.nextElement());
            }
            // Misplaced declaration of an exception variable
            catch (List alist[])
            {
                throw new CertPathValidatorException("Policy information could not be decoded.", alist, certpath, i1);
            }
            if (!"2.5.29.32.0".equals(((PolicyInformation) (obj1)).e().e()))
            {
                continue;
            }
            try
            {
                obj1 = CertPathValidatorUtilities.a(((PolicyInformation) (obj1)).f());
            }
            // Misplaced declaration of an exception variable
            catch (List alist[])
            {
                throw new ExtCertPathValidatorException("Policy qualifier info set could not be decoded.", alist, certpath, i1);
            }
            break;
        } while (true);
        flag = false;
        if (x509certificate.getCriticalExtensionOIDs() != null)
        {
            flag = x509certificate.getCriticalExtensionOIDs().contains(a);
        }
        pkixpolicynode2 = (PKIXPolicyNode)pkixpolicynode3.getParent();
        if ("2.5.29.32.0".equals(pkixpolicynode2.getValidPolicy()))
        {
            obj1 = new PKIXPolicyNode(new ArrayList(), j2, (Set)hashmap.get(s2), pkixpolicynode2, ((Set) (obj1)), s2, flag);
            pkixpolicynode2.a(((PKIXPolicyNode) (obj1)));
            alist[j2].add(obj1);
        }
          goto _L8
_L6:
        if (j1 <= 0)
        {
            Iterator iterator = alist[j2].iterator();
            do
            {
                obj1 = pkixpolicynode;
                if (!iterator.hasNext())
                {
                    break;
                }
                obj1 = (PKIXPolicyNode)iterator.next();
                if (((PKIXPolicyNode) (obj1)).getValidPolicy().equals(s2))
                {
                    ((PKIXPolicyNode)((PKIXPolicyNode) (obj1)).getParent()).b(((PKIXPolicyNode) (obj1)));
                    iterator.remove();
                    l1 = j2 - 1;
                    do
                    {
                        obj1 = pkixpolicynode;
                        if (l1 < 0)
                        {
                            break;
                        }
                        List list = alist[l1];
                        int i2 = 0;
                        do
                        {
                            obj1 = pkixpolicynode;
                            if (i2 >= list.size())
                            {
                                break;
                            }
                            PKIXPolicyNode pkixpolicynode4 = (PKIXPolicyNode)list.get(i2);
                            obj1 = pkixpolicynode;
                            if (!pkixpolicynode4.a())
                            {
                                pkixpolicynode = CertPathValidatorUtilities.a(pkixpolicynode, alist, pkixpolicynode4);
                                obj1 = pkixpolicynode;
                                if (pkixpolicynode == null)
                                {
                                    break;
                                }
                                obj1 = pkixpolicynode;
                            }
                            i2++;
                            pkixpolicynode = ((PKIXPolicyNode) (obj1));
                        } while (true);
                        l1--;
                        pkixpolicynode = ((PKIXPolicyNode) (obj1));
                    } while (true);
                } else
                {
                    obj1 = pkixpolicynode;
                }
                pkixpolicynode = ((PKIXPolicyNode) (obj1));
            } while (true);
        } else
        {
            obj1 = pkixpolicynode;
        }
        pkixpolicynode = ((PKIXPolicyNode) (obj1));
          goto _L8
_L2:
        obj1 = pkixpolicynode;
_L4:
        return ((PKIXPolicyNode) (obj1));
        l1 = 0;
          goto _L12
    }

    protected static PKIXPolicyNode a(CertPath certpath, ExtendedPKIXParameters extendedpkixparameters, Set set, int i1, List alist[], PKIXPolicyNode pkixpolicynode, Set set1)
    {
label0:
        {
            int j2 = certpath.getCertificates().size();
            if (pkixpolicynode == null)
            {
                if (extendedpkixparameters.isExplicitPolicyRequired())
                {
                    throw new ExtCertPathValidatorException("Explicit policy requested but none available.", null, certpath, i1);
                }
                set = null;
            } else
            if (CertPathValidatorUtilities.a(set))
            {
                set = pkixpolicynode;
                if (extendedpkixparameters.isExplicitPolicyRequired())
                {
                    if (set1.isEmpty())
                    {
                        throw new ExtCertPathValidatorException("Explicit policy requested but none available.", null, certpath, i1);
                    }
                    certpath = new HashSet();
                    for (i1 = 0; i1 < alist.length; i1++)
                    {
                        extendedpkixparameters = alist[i1];
                        for (int j1 = 0; j1 < extendedpkixparameters.size(); j1++)
                        {
                            set = (PKIXPolicyNode)extendedpkixparameters.get(j1);
                            if (!"2.5.29.32.0".equals(set.getValidPolicy()))
                            {
                                continue;
                            }
                            for (set = set.getChildren(); set.hasNext(); certpath.add(set.next())) { }
                        }

                    }

                    for (certpath = certpath.iterator(); certpath.hasNext(); set1.contains(((PKIXPolicyNode)certpath.next()).getValidPolicy())) { }
                    set = pkixpolicynode;
                    if (pkixpolicynode != null)
                    {
                        certpath = pkixpolicynode;
                        for (i1 = j2 - 1; i1 >= 0; i1--)
                        {
                            set = alist[i1];
                            for (int k1 = 0; k1 < set.size();)
                            {
                                pkixpolicynode = (PKIXPolicyNode)set.get(k1);
                                extendedpkixparameters = certpath;
                                if (!pkixpolicynode.a())
                                {
                                    extendedpkixparameters = CertPathValidatorUtilities.a(certpath, alist, pkixpolicynode);
                                }
                                k1++;
                                certpath = extendedpkixparameters;
                            }

                        }

                        break label0;
                    }
                }
            } else
            {
                certpath = new HashSet();
                for (i1 = 0; i1 < alist.length; i1++)
                {
                    extendedpkixparameters = alist[i1];
label1:
                    for (int l1 = 0; l1 < extendedpkixparameters.size(); l1++)
                    {
                        set1 = (PKIXPolicyNode)extendedpkixparameters.get(l1);
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
                        pkixpolicynode = CertPathValidatorUtilities.a(pkixpolicynode, alist, extendedpkixparameters);
                    }
                } while (true);
                if (pkixpolicynode != null)
                {
                    certpath = pkixpolicynode;
                    i1 = j2 - 1;
                    do
                    {
                        extendedpkixparameters = certpath;
                        if (i1 < 0)
                        {
                            break;
                        }
                        set = alist[i1];
                        for (int i2 = 0; i2 < set.size();)
                        {
                            pkixpolicynode = (PKIXPolicyNode)set.get(i2);
                            extendedpkixparameters = certpath;
                            if (!pkixpolicynode.a())
                            {
                                extendedpkixparameters = CertPathValidatorUtilities.a(certpath, alist, pkixpolicynode);
                            }
                            i2++;
                            certpath = extendedpkixparameters;
                        }

                        i1--;
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

    protected static h a(X509CRL x509crl, DistributionPoint distributionpoint)
    {
        IssuingDistributionPoint issuingdistributionpoint;
        try
        {
            issuingdistributionpoint = IssuingDistributionPoint.a(CertPathValidatorUtilities.a(x509crl, d));
        }
        // Misplaced declaration of an exception variable
        catch (X509CRL x509crl)
        {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", x509crl);
        }
        if (issuingdistributionpoint != null && issuingdistributionpoint.j() != null && distributionpoint.f() != null)
        {
            return (new h(distributionpoint.f().g())).b(new h(issuingdistributionpoint.j().g()));
        }
        if ((issuingdistributionpoint == null || issuingdistributionpoint.j() == null) && distributionpoint.f() == null)
        {
            return h.a;
        }
        if (distributionpoint.f() == null)
        {
            x509crl = h.a;
        } else
        {
            x509crl = new h(distributionpoint.f().g());
        }
        if (issuingdistributionpoint == null)
        {
            distributionpoint = h.a;
        } else
        {
            distributionpoint = new h(issuingdistributionpoint.j().g());
        }
        return x509crl.b(distributionpoint);
    }

    protected static void a(CertPath certpath, int i1)
    {
        Object obj = (X509Certificate)certpath.getCertificates().get(i1);
        try
        {
            obj = DERSequence.a(CertPathValidatorUtilities.a(((X509Extension) (obj)), b));
        }
        catch (AnnotatedException annotatedexception)
        {
            throw new ExtCertPathValidatorException("Policy mappings extension could not be decoded.", annotatedexception, certpath, i1);
        }
        if (obj != null)
        {
            for (int j1 = 0; j1 < ((ASN1Sequence) (obj)).f(); j1++)
            {
                DERObjectIdentifier derobjectidentifier;
                Object obj1;
                try
                {
                    obj1 = DERSequence.a(((ASN1Sequence) (obj)).a(j1));
                    derobjectidentifier = DERObjectIdentifier.a(((ASN1Sequence) (obj1)).a(0));
                    obj1 = DERObjectIdentifier.a(((ASN1Sequence) (obj1)).a(1));
                }
                catch (Exception exception)
                {
                    throw new ExtCertPathValidatorException("Policy mappings extension contents could not be decoded.", exception, certpath, i1);
                }
                if ("2.5.29.32.0".equals(derobjectidentifier.e()))
                {
                    throw new CertPathValidatorException("IssuerDomainPolicy is anyPolicy", null, certpath, i1);
                }
                if ("2.5.29.32.0".equals(((DERObjectIdentifier) (obj1)).e()))
                {
                    throw new CertPathValidatorException("SubjectDomainPolicy is anyPolicy,", null, certpath, i1);
                }
            }

        }
    }

    protected static void a(CertPath certpath, int i1, List list, Set set)
    {
        X509Certificate x509certificate = (X509Certificate)certpath.getCertificates().get(i1);
        for (list = list.iterator(); list.hasNext();)
        {
            try
            {
                ((PKIXCertPathChecker)list.next()).check(x509certificate, set);
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                throw new ExtCertPathValidatorException("Additional certificate path checker failed.", list, certpath, i1);
            }
        }

        if (!set.isEmpty())
        {
            throw new ExtCertPathValidatorException("Certificate has unsupported critical extension", null, certpath, i1);
        } else
        {
            return;
        }
    }

    protected static void a(CertPath certpath, int i1, Set set, List list)
    {
        X509Certificate x509certificate = (X509Certificate)certpath.getCertificates().get(i1);
        for (list = list.iterator(); list.hasNext();)
        {
            try
            {
                ((PKIXCertPathChecker)list.next()).check(x509certificate, set);
            }
            // Misplaced declaration of an exception variable
            catch (Set set)
            {
                throw new CertPathValidatorException(set.getMessage(), set.getCause(), certpath, i1);
            }
        }

        if (!set.isEmpty())
        {
            throw new ExtCertPathValidatorException("Certificate has unsupported critical extension.", null, certpath, i1);
        } else
        {
            return;
        }
    }

    protected static void a(CertPath certpath, int i1, PKIXNameConstraintValidator pkixnameconstraintvalidator)
    {
        List list = certpath.getCertificates();
        Object obj = (X509Certificate)list.get(i1);
        int j1 = list.size();
        if (!CertPathValidatorUtilities.b(((X509Certificate) (obj))) || j1 - i1 >= j1)
        {
            Object obj1 = new ASN1InputStream(CertPathValidatorUtilities.a(((X509Certificate) (obj))).getEncoded());
            try
            {
                obj1 = DERSequence.a(((ASN1InputStream) (obj1)).a());
            }
            // Misplaced declaration of an exception variable
            catch (PKIXNameConstraintValidator pkixnameconstraintvalidator)
            {
                throw new CertPathValidatorException("Exception extracting subject name when checking subtrees.", pkixnameconstraintvalidator, certpath, i1);
            }
            try
            {
                pkixnameconstraintvalidator.a(((ASN1Sequence) (obj1)));
                pkixnameconstraintvalidator.b(((ASN1Sequence) (obj1)));
            }
            // Misplaced declaration of an exception variable
            catch (PKIXNameConstraintValidator pkixnameconstraintvalidator)
            {
                throw new CertPathValidatorException("Subtree check for certificate subject failed.", pkixnameconstraintvalidator, certpath, i1);
            }
            try
            {
                obj = GeneralNames.a(CertPathValidatorUtilities.a(((X509Extension) (obj)), j));
            }
            // Misplaced declaration of an exception variable
            catch (PKIXNameConstraintValidator pkixnameconstraintvalidator)
            {
                throw new CertPathValidatorException("Subject alternative name extension could not be decoded.", pkixnameconstraintvalidator, certpath, i1);
            }
            for (obj1 = (new X509Name(((ASN1Sequence) (obj1)))).a(X509Name.D).elements(); ((Enumeration) (obj1)).hasMoreElements();)
            {
                GeneralName generalname = new GeneralName((String)((Enumeration) (obj1)).nextElement());
                try
                {
                    pkixnameconstraintvalidator.a(generalname);
                    pkixnameconstraintvalidator.b(generalname);
                }
                // Misplaced declaration of an exception variable
                catch (PKIXNameConstraintValidator pkixnameconstraintvalidator)
                {
                    throw new CertPathValidatorException("Subtree check for certificate subject alternative email failed.", pkixnameconstraintvalidator, certpath, i1);
                }
            }

            if (obj != null)
            {
                GeneralName ageneralname[];
                int k1;
                try
                {
                    ageneralname = ((GeneralNames) (obj)).e();
                }
                // Misplaced declaration of an exception variable
                catch (PKIXNameConstraintValidator pkixnameconstraintvalidator)
                {
                    throw new CertPathValidatorException("Subject alternative name contents could not be decoded.", pkixnameconstraintvalidator, certpath, i1);
                }
                k1 = 0;
                while (k1 < ageneralname.length) 
                {
                    try
                    {
                        pkixnameconstraintvalidator.a(ageneralname[k1]);
                        pkixnameconstraintvalidator.b(ageneralname[k1]);
                    }
                    // Misplaced declaration of an exception variable
                    catch (PKIXNameConstraintValidator pkixnameconstraintvalidator)
                    {
                        throw new CertPathValidatorException("Subtree check for certificate subject alternative name failed.", pkixnameconstraintvalidator, certpath, i1);
                    }
                    k1++;
                }
            }
        }
    }

    protected static void a(CertPath certpath, int i1, PKIXPolicyNode pkixpolicynode, int j1)
    {
        if (j1 <= 0 && pkixpolicynode == null)
        {
            throw new ExtCertPathValidatorException("No valid policy tree found when one expected.", null, certpath, i1);
        } else
        {
            return;
        }
    }

    protected static void a(CertPath certpath, ExtendedPKIXParameters extendedpkixparameters, int i1, PublicKey publickey, boolean flag, X500Principal x500principal, X509Certificate x509certificate)
    {
        List list = certpath.getCertificates();
        X509Certificate x509certificate1 = (X509Certificate)list.get(i1);
        if (!flag)
        {
            try
            {
                CertPathValidatorUtilities.a(x509certificate1, publickey, extendedpkixparameters.getSigProvider());
            }
            // Misplaced declaration of an exception variable
            catch (ExtendedPKIXParameters extendedpkixparameters)
            {
                throw new ExtCertPathValidatorException("Could not validate certificate signature.", extendedpkixparameters, certpath, i1);
            }
        }
        try
        {
            x509certificate1.checkValidity(CertPathValidatorUtilities.a(extendedpkixparameters, certpath, i1));
        }
        // Misplaced declaration of an exception variable
        catch (ExtendedPKIXParameters extendedpkixparameters)
        {
            throw new ExtCertPathValidatorException((new StringBuilder("Could not validate certificate: ")).append(extendedpkixparameters.getMessage()).toString(), extendedpkixparameters, certpath, i1);
        }
        // Misplaced declaration of an exception variable
        catch (ExtendedPKIXParameters extendedpkixparameters)
        {
            throw new ExtCertPathValidatorException((new StringBuilder("Could not validate certificate: ")).append(extendedpkixparameters.getMessage()).toString(), extendedpkixparameters, certpath, i1);
        }
        // Misplaced declaration of an exception variable
        catch (ExtendedPKIXParameters extendedpkixparameters)
        {
            throw new ExtCertPathValidatorException("Could not validate time of certificate.", extendedpkixparameters, certpath, i1);
        }
        if (extendedpkixparameters.isRevocationEnabled())
        {
            try
            {
                a(extendedpkixparameters, x509certificate1, CertPathValidatorUtilities.a(extendedpkixparameters, certpath, i1), x509certificate, publickey, list);
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
                throw new ExtCertPathValidatorException(publickey.getMessage(), extendedpkixparameters, certpath, i1);
            }
        }
        if (!CertPathValidatorUtilities.a(x509certificate1).equals(x500principal))
        {
            throw new ExtCertPathValidatorException((new StringBuilder("IssuerName(")).append(CertPathValidatorUtilities.a(x509certificate1)).append(") does not match SubjectName(").append(x500principal).append(") of signing certificate.").toString(), null, certpath, i1);
        } else
        {
            return;
        }
    }

    protected static void a(X509CRL x509crl, X509CRL x509crl1, ExtendedPKIXParameters extendedpkixparameters)
    {
        boolean flag = true;
        if (x509crl != null)
        {
            IssuingDistributionPoint issuingdistributionpoint;
            try
            {
                issuingdistributionpoint = IssuingDistributionPoint.a(CertPathValidatorUtilities.a(x509crl1, d));
            }
            // Misplaced declaration of an exception variable
            catch (X509CRL x509crl)
            {
                throw new AnnotatedException("Issuing distribution point extension could not be decoded.", x509crl);
            }
            if (extendedpkixparameters.c())
            {
                if (!x509crl.getIssuerX500Principal().equals(x509crl1.getIssuerX500Principal()))
                {
                    throw new AnnotatedException("Complete CRL issuer does not match delta CRL issuer.");
                }
                try
                {
                    extendedpkixparameters = IssuingDistributionPoint.a(CertPathValidatorUtilities.a(x509crl, d));
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
                    x509crl1 = CertPathValidatorUtilities.a(x509crl1, l);
                }
                // Misplaced declaration of an exception variable
                catch (X509CRL x509crl)
                {
                    throw new AnnotatedException("Authority key identifier extension could not be extracted from complete CRL.", x509crl);
                }
                try
                {
                    x509crl = CertPathValidatorUtilities.a(x509crl, l);
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

    protected static void a(Date date, X509CRL x509crl, Object obj, b b1)
    {
        if (b1.a == 11)
        {
            CertPathValidatorUtilities.a(date, x509crl, obj, b1);
        }
    }

    protected static void a(Date date, X509CRL x509crl, Object obj, b b1, ExtendedPKIXParameters extendedpkixparameters)
    {
        if (extendedpkixparameters.c() && x509crl != null)
        {
            CertPathValidatorUtilities.a(date, x509crl, obj, b1);
        }
    }

    protected static void a(DistributionPoint distributionpoint, Object obj, X509CRL x509crl)
    {
        IssuingDistributionPoint issuingdistributionpoint;
        ArrayList arraylist;
        boolean flag2;
        boolean flag3;
        flag3 = false;
        flag2 = false;
        GeneralName ageneralname[];
        int i1;
        try
        {
            issuingdistributionpoint = IssuingDistributionPoint.a(CertPathValidatorUtilities.a(x509crl, d));
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
        if (issuingdistributionpoint.i() == null) goto _L2; else goto _L1
_L1:
        DistributionPointName distributionpointname = IssuingDistributionPoint.a(issuingdistributionpoint).i();
        arraylist = new ArrayList();
        if (distributionpointname.e() == 0)
        {
            ageneralname = GeneralNames.a(distributionpointname.f()).e();
            for (i1 = 0; i1 < ageneralname.length; i1++)
            {
                arraylist.add(ageneralname[i1]);
            }

        }
        if (distributionpointname.e() == 1)
        {
            ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
            try
            {
                for (x509crl = ASN1Sequence.a(ASN1Sequence.a(CertPathValidatorUtilities.a(x509crl).getEncoded())).e(); x509crl.hasMoreElements(); asn1encodablevector.a((DEREncodable)x509crl.nextElement())) { }
            }
            // Misplaced declaration of an exception variable
            catch (DistributionPoint distributionpoint)
            {
                throw new AnnotatedException("Could not read CRL issuer.", distributionpoint);
            }
            asn1encodablevector.a(distributionpointname.f());
            arraylist.add(new GeneralName(X509Name.a(new DERSequence(asn1encodablevector))));
        }
        if (distributionpoint.e() == null) goto _L4; else goto _L3
_L3:
        boolean flag;
        DistributionPointName distributionpointname1 = distributionpoint.e();
        x509crl = null;
        if (distributionpointname1.e() == 0)
        {
            x509crl = GeneralNames.a(distributionpointname1.f()).e();
        }
        if (distributionpointname1.e() == 1)
        {
            int j1;
            if (distributionpoint.g() != null)
            {
                distributionpoint = distributionpoint.g().e();
            } else
            {
                distributionpoint = new GeneralName[1];
                try
                {
                    distributionpoint[0] = new GeneralName(new X509Name((ASN1Sequence)ASN1Sequence.a(CertPathValidatorUtilities.a(obj).getEncoded())));
                }
                // Misplaced declaration of an exception variable
                catch (DistributionPoint distributionpoint)
                {
                    throw new AnnotatedException("Could not read certificate issuer.", distributionpoint);
                }
            }
            j1 = 0;
            do
            {
                x509crl = distributionpoint;
                if (j1 >= distributionpoint.length)
                {
                    break;
                }
                x509crl = ASN1Sequence.a(distributionpoint[j1].f().c()).e();
                ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
                for (; x509crl.hasMoreElements(); asn1encodablevector1.a((DEREncodable)x509crl.nextElement())) { }
                asn1encodablevector1.a(distributionpointname1.f());
                distributionpoint[j1] = new GeneralName(new X509Name(new DERSequence(asn1encodablevector1)));
                j1++;
            } while (true);
        }
        flag = flag2;
        if (x509crl == null) goto _L6; else goto _L5
_L5:
        int k1 = 0;
_L10:
        flag = flag2;
        if (k1 >= x509crl.length) goto _L6; else goto _L7
_L7:
        if (!arraylist.contains(x509crl[k1])) goto _L9; else goto _L8
_L8:
        flag = true;
_L6:
        if (!flag)
        {
            throw new AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
        }
        break; /* Loop/switch isn't completed */
_L9:
        k1++;
        if (true) goto _L10; else goto _L2
_L4:
        if (distributionpoint.g() == null)
        {
            throw new AnnotatedException("Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint.");
        }
        distributionpoint = distributionpoint.g().e();
        int l1 = 0;
label0:
        do
        {
label1:
            {
                boolean flag1 = flag3;
                if (l1 < distributionpoint.length)
                {
                    if (!arraylist.contains(distributionpoint[l1]))
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
            l1++;
        } while (true);
_L2:
        try
        {
            distributionpoint = BasicConstraints.a(CertPathValidatorUtilities.a((X509Extension)obj, h));
        }
        // Misplaced declaration of an exception variable
        catch (DistributionPoint distributionpoint)
        {
            throw new AnnotatedException("Basic constraints extension could not be decoded.", distributionpoint);
        }
        if (obj instanceof X509Certificate)
        {
            if (issuingdistributionpoint.e() && distributionpoint != null && distributionpoint.e())
            {
                throw new AnnotatedException("CA Cert CRL only contains user certificates.");
            }
            if (issuingdistributionpoint.f() && (distributionpoint == null || !distributionpoint.e()))
            {
                throw new AnnotatedException("End CRL only contains CA certificates.");
            }
        }
        if (issuingdistributionpoint.h())
        {
            throw new AnnotatedException("onlyContainsAttributeCerts boolean is asserted.");
        }
    }

    private static void a(DistributionPoint distributionpoint, ExtendedPKIXParameters extendedpkixparameters, X509Certificate x509certificate, Date date, X509Certificate x509certificate1, PublicKey publickey, b b1, h h1, 
            List list)
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
        iterator = CertPathValidatorUtilities.a(distributionpoint, x509certificate, date1, extendedpkixparameters).iterator();
        flag = false;
        annotatedexception = null;
_L2:
        if (!iterator.hasNext() || b1.a != 11 || h1.a())
        {
            break MISSING_BLOCK_LABEL_417;
        }
        Object obj1;
        h h2;
        PublicKey publickey1;
        obj1 = (X509CRL)iterator.next();
        h2 = a(((X509CRL) (obj1)), distributionpoint);
        if (!h2.c(h1))
        {
            continue; /* Loop/switch isn't completed */
        }
        publickey1 = a(((X509CRL) (obj1)), a(((X509CRL) (obj1)), x509certificate1, publickey, extendedpkixparameters, list));
        Object obj = null;
        if (extendedpkixparameters.c())
        {
            obj = a(CertPathValidatorUtilities.a(date1, extendedpkixparameters, ((X509CRL) (obj1))), publickey1);
        }
        if (extendedpkixparameters.d() != 1 && x509certificate.getNotAfter().getTime() < ((X509CRL) (obj1)).getThisUpdate().getTime())
        {
            throw new AnnotatedException("No valid CRL for current time found.");
        }
        b(distributionpoint, x509certificate, ((X509CRL) (obj1)));
        a(distributionpoint, x509certificate, ((X509CRL) (obj1)));
        a(((X509CRL) (obj)), ((X509CRL) (obj1)), extendedpkixparameters);
        a(date, ((X509CRL) (obj)), x509certificate, b1, extendedpkixparameters);
        a(date, ((X509CRL) (obj1)), x509certificate, b1);
        if (b1.a == 8)
        {
            b1.a = 11;
        }
        h1.a(h2);
        obj1 = ((X509CRL) (obj1)).getCriticalExtensionOIDs();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_334;
        }
        obj1 = new HashSet(((Collection) (obj1)));
        ((Set) (obj1)).remove(X509Extensions.m.e());
        ((Set) (obj1)).remove(X509Extensions.l.e());
        if (!((Set) (obj1)).isEmpty())
        {
            throw new AnnotatedException("CRL contains unsupported critical extensions.");
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_411;
        }
        obj = ((X509CRL) (obj)).getCriticalExtensionOIDs();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_411;
        }
        obj = new HashSet(((Collection) (obj)));
        ((Set) (obj)).remove(X509Extensions.m.e());
        ((Set) (obj)).remove(X509Extensions.l.e());
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

    private static void a(ExtendedPKIXParameters extendedpkixparameters, X509Certificate x509certificate, Date date, X509Certificate x509certificate1, PublicKey publickey, List list)
    {
        Object obj;
        ExtendedPKIXParameters extendedpkixparameters1;
        b b1;
        h h1;
        boolean flag2;
        extendedpkixparameters1 = null;
        obj = null;
        CRLDistPoint crldistpoint;
        DistributionPoint adistributionpoint[];
        boolean flag;
        int i1;
        try
        {
            crldistpoint = CRLDistPoint.a(CertPathValidatorUtilities.a(x509certificate, i));
        }
        // Misplaced declaration of an exception variable
        catch (ExtendedPKIXParameters extendedpkixparameters)
        {
            throw new AnnotatedException("CRL distribution point extension could not be read.", extendedpkixparameters);
        }
        try
        {
            CertPathValidatorUtilities.a(crldistpoint, extendedpkixparameters);
        }
        // Misplaced declaration of an exception variable
        catch (ExtendedPKIXParameters extendedpkixparameters)
        {
            throw new AnnotatedException("No additional CRL locations could be decoded from CRL distribution point extension.", extendedpkixparameters);
        }
        b1 = new b();
        h1 = new h();
        flag2 = false;
        flag = false;
        if (crldistpoint == null) goto _L2; else goto _L1
_L1:
        try
        {
            adistributionpoint = crldistpoint.e();
        }
        // Misplaced declaration of an exception variable
        catch (ExtendedPKIXParameters extendedpkixparameters)
        {
            throw new AnnotatedException("Distribution points could not be read.", extendedpkixparameters);
        }
        i1 = 0;
        flag2 = flag;
        extendedpkixparameters1 = ((ExtendedPKIXParameters) (obj));
        if (i1 >= adistributionpoint.length)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag;
        extendedpkixparameters1 = ((ExtendedPKIXParameters) (obj));
        if (b1.a != 11)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag;
        extendedpkixparameters1 = ((ExtendedPKIXParameters) (obj));
        if (h1.a())
        {
            break; /* Loop/switch isn't completed */
        }
        extendedpkixparameters1 = (ExtendedPKIXParameters)extendedpkixparameters.clone();
        a(adistributionpoint[i1], extendedpkixparameters1, x509certificate, date, x509certificate1, publickey, b1, h1, list);
        flag = true;
_L5:
        i1++;
        if (true) goto _L4; else goto _L3
_L3:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_63;
        obj;
        if (true) goto _L5; else goto _L2
_L2:
        boolean flag1;
        flag1 = flag2;
        obj = extendedpkixparameters1;
        if (b1.a != 11)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        flag1 = flag2;
        obj = extendedpkixparameters1;
        if (h1.a())
        {
            break MISSING_BLOCK_LABEL_311;
        }
        obj = (new ASN1InputStream(CertPathValidatorUtilities.a(x509certificate).getEncoded())).a();
        a(new DistributionPoint(new DistributionPointName(new GeneralNames(new GeneralName(4, ((org.bouncycastle.asn1.ASN1Encodable) (obj)))))), (ExtendedPKIXParameters)extendedpkixparameters.clone(), x509certificate, date, x509certificate1, publickey, b1, h1, list);
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
        break MISSING_BLOCK_LABEL_362;
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
        if (b1.a != 11)
        {
            extendedpkixparameters = (new StringBuilder("Certificate revocation after ")).append(b1.b).toString();
            throw new AnnotatedException((new StringBuilder()).append(extendedpkixparameters).append(", reason: ").append(o[b1.a]).toString());
        }
        if (!h1.a() && b1.a == 11)
        {
            b1.a = 12;
        }
        if (b1.a == 12)
        {
            throw new AnnotatedException("Certificate status could not be determined.");
        } else
        {
            return;
        }
    }

    protected static int b(CertPath certpath, int i1, int j1)
    {
        Object obj = (X509Certificate)certpath.getCertificates().get(i1);
        ASN1TaggedObject asn1taggedobject;
        int k1;
        int l1;
        try
        {
            obj = DERSequence.a(CertPathValidatorUtilities.a(((X509Extension) (obj)), g));
        }
        catch (Exception exception)
        {
            throw new ExtCertPathValidatorException("Policy constraints extension cannot be decoded.", exception, certpath, i1);
        }
        k1 = j1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        obj = ((ASN1Sequence) (obj)).e();
        k1 = j1;
        if (!((Enumeration) (obj)).hasMoreElements())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        try
        {
            asn1taggedobject = ASN1TaggedObject.a(((Enumeration) (obj)).nextElement());
            if (asn1taggedobject.e() != 1)
            {
                break MISSING_BLOCK_LABEL_37;
            }
            l1 = DERInteger.a(asn1taggedobject, false).e().intValue();
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw new ExtCertPathValidatorException("Policy constraints extension contents cannot be decoded.", illegalargumentexception, certpath, i1);
        }
        k1 = j1;
        if (l1 < j1)
        {
            k1 = l1;
        }
        return k1;
    }

    protected static void b(CertPath certpath, int i1)
    {
        Object obj = (X509Certificate)certpath.getCertificates().get(i1);
        try
        {
            obj = BasicConstraints.a(CertPathValidatorUtilities.a(((X509Extension) (obj)), h));
        }
        catch (Exception exception)
        {
            throw new ExtCertPathValidatorException("Basic constraints extension cannot be decoded.", exception, certpath, i1);
        }
        if (obj != null)
        {
            if (!((BasicConstraints) (obj)).e())
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

    protected static void b(CertPath certpath, int i1, PKIXNameConstraintValidator pkixnameconstraintvalidator)
    {
        Object obj;
        obj = (X509Certificate)certpath.getCertificates().get(i1);
        ASN1Sequence asn1sequence;
        try
        {
            obj = DERSequence.a(CertPathValidatorUtilities.a(((X509Extension) (obj)), k));
        }
        // Misplaced declaration of an exception variable
        catch (PKIXNameConstraintValidator pkixnameconstraintvalidator)
        {
            throw new ExtCertPathValidatorException("Name constraints extension could not be decoded.", pkixnameconstraintvalidator, certpath, i1);
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = new NameConstraints(((ASN1Sequence) (obj)));
_L4:
        if (obj != null)
        {
            asn1sequence = ((NameConstraints) (obj)).e();
            if (asn1sequence != null)
            {
                try
                {
                    pkixnameconstraintvalidator.c(asn1sequence);
                }
                // Misplaced declaration of an exception variable
                catch (PKIXNameConstraintValidator pkixnameconstraintvalidator)
                {
                    throw new ExtCertPathValidatorException("Permitted subtrees cannot be build from name constraints extension.", pkixnameconstraintvalidator, certpath, i1);
                }
            }
            obj = ((NameConstraints) (obj)).f();
            if (obj != null)
            {
                obj = ((ASN1Sequence) (obj)).e();
                try
                {
                    while (((Enumeration) (obj)).hasMoreElements()) 
                    {
                        pkixnameconstraintvalidator.a(GeneralSubtree.a(((Enumeration) (obj)).nextElement()));
                    }
                }
                // Misplaced declaration of an exception variable
                catch (PKIXNameConstraintValidator pkixnameconstraintvalidator)
                {
                    throw new ExtCertPathValidatorException("Excluded subtrees cannot be build from name constraints extension.", pkixnameconstraintvalidator, certpath, i1);
                }
            }
        }
        return;
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected static void b(DistributionPoint distributionpoint, Object obj, X509CRL x509crl)
    {
        int j1 = 0;
        boolean flag = false;
        DERObject derobject = CertPathValidatorUtilities.a(x509crl, d);
        byte abyte0[];
        int i1;
        if (derobject != null && IssuingDistributionPoint.a(derobject).g())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        abyte0 = CertPathValidatorUtilities.a(x509crl).getEncoded();
        if (distributionpoint.g() != null)
        {
            distributionpoint = distributionpoint.g().e();
            j1 = 0;
            while (j1 < distributionpoint.length) 
            {
                boolean flag1 = flag;
                if (distributionpoint[j1].e() == 4)
                {
                    boolean flag2;
                    try
                    {
                        flag2 = Arrays.a(distributionpoint[j1].f().c().a(), abyte0);
                    }
                    // Misplaced declaration of an exception variable
                    catch (DistributionPoint distributionpoint)
                    {
                        throw new AnnotatedException("CRL issuer information from distribution point cannot be decoded.", distributionpoint);
                    }
                    flag1 = flag;
                    if (flag2)
                    {
                        flag1 = true;
                    }
                }
                j1++;
                flag = flag1;
            }
            if (flag && i1 == 0)
            {
                throw new AnnotatedException("Distribution point contains cRLIssuer field but CRL is not indirect.");
            }
            i1 = ((flag) ? 1 : 0);
            if (!flag)
            {
                throw new AnnotatedException("CRL issuer of CRL does not match CRL issuer of distribution point.");
            }
        } else
        {
            i1 = j1;
            if (CertPathValidatorUtilities.a(x509crl).equals(CertPathValidatorUtilities.a(obj)))
            {
                i1 = 1;
            }
        }
        if (i1 == 0)
        {
            throw new AnnotatedException("Cannot find matching CRL issuer for certificate.");
        } else
        {
            return;
        }
    }

    protected static int c(CertPath certpath, int i1, int j1)
    {
        Object obj = (X509Certificate)certpath.getCertificates().get(i1);
        try
        {
            obj = DERInteger.a(CertPathValidatorUtilities.a(((X509Extension) (obj)), c));
        }
        catch (Exception exception)
        {
            throw new ExtCertPathValidatorException("Inhibit any-policy extension cannot be decoded.", exception, certpath, i1);
        }
        i1 = j1;
        if (obj != null)
        {
            int k1 = ((DERInteger) (obj)).e().intValue();
            i1 = j1;
            if (k1 < j1)
            {
                i1 = k1;
            }
        }
        return i1;
    }

    protected static void c(CertPath certpath, int i1)
    {
        boolean aflag[] = ((X509Certificate)certpath.getCertificates().get(i1)).getKeyUsage();
        if (aflag != null && !aflag[5])
        {
            throw new ExtCertPathValidatorException("Issuer certificate keyusage extension is critical and does not permit key signing.", null, certpath, i1);
        } else
        {
            return;
        }
    }

    protected static int d(CertPath certpath, int i1, int j1)
    {
        int k1 = j1;
        if (!CertPathValidatorUtilities.b((X509Certificate)certpath.getCertificates().get(i1)))
        {
            if (j1 <= 0)
            {
                throw new ExtCertPathValidatorException("Max path length not greater than zero", null, certpath, i1);
            }
            k1 = j1 - 1;
        }
        return k1;
    }

    protected static int e(CertPath certpath, int i1, int j1)
    {
        Object obj = (X509Certificate)certpath.getCertificates().get(i1);
        try
        {
            obj = BasicConstraints.a(CertPathValidatorUtilities.a(((X509Extension) (obj)), h));
        }
        catch (Exception exception)
        {
            throw new ExtCertPathValidatorException("Basic constraints extension cannot be decoded.", exception, certpath, i1);
        }
        i1 = j1;
        if (obj != null)
        {
            certpath = ((BasicConstraints) (obj)).f();
            i1 = j1;
            if (certpath != null)
            {
                int k1 = certpath.intValue();
                i1 = j1;
                if (k1 < j1)
                {
                    i1 = k1;
                }
            }
        }
        return i1;
    }

    protected static int f(CertPath certpath, int i1, int j1)
    {
        int k1 = j1;
        if (!CertPathValidatorUtilities.b((X509Certificate)certpath.getCertificates().get(i1)))
        {
            k1 = j1;
            if (j1 != 0)
            {
                k1 = j1 - 1;
            }
        }
        return k1;
    }

    protected static int g(CertPath certpath, int i1, int j1)
    {
        int k1 = j1;
        if (!CertPathValidatorUtilities.b((X509Certificate)certpath.getCertificates().get(i1)))
        {
            k1 = j1;
            if (j1 != 0)
            {
                k1 = j1 - 1;
            }
        }
        return k1;
    }

    protected static int h(CertPath certpath, int i1, int j1)
    {
        int k1 = j1;
        if (!CertPathValidatorUtilities.b((X509Certificate)certpath.getCertificates().get(i1)))
        {
            k1 = j1;
            if (j1 != 0)
            {
                k1 = j1 - 1;
            }
        }
        return k1;
    }

    protected static int i(CertPath certpath, int i1, int j1)
    {
        Object obj = (X509Certificate)certpath.getCertificates().get(i1);
        ASN1TaggedObject asn1taggedobject;
        int k1;
        try
        {
            obj = DERSequence.a(CertPathValidatorUtilities.a(((X509Extension) (obj)), g));
        }
        catch (AnnotatedException annotatedexception)
        {
            throw new ExtCertPathValidatorException("Policy constraints could not be decoded.", annotatedexception, certpath, i1);
        }
        k1 = j1;
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((ASN1Sequence) (obj)).e();
_L5:
        k1 = j1;
        if (!((Enumeration) (obj)).hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        asn1taggedobject = (ASN1TaggedObject)((Enumeration) (obj)).nextElement();
        asn1taggedobject.e();
        JVM INSTR tableswitch 0 0: default 84
    //                   0 87;
           goto _L3 _L4
_L3:
        if (true) goto _L5; else goto _L2
_L4:
        try
        {
            k1 = DERInteger.a(asn1taggedobject, false).e().intValue();
        }
        catch (Exception exception)
        {
            throw new ExtCertPathValidatorException("Policy constraints requireExplicitPolicy field could not be decoded.", exception, certpath, i1);
        }
        if (k1 != 0) goto _L5; else goto _L6
_L6:
        k1 = 0;
_L2:
        return k1;
    }

    static 
    {
        a = X509Extensions.q.e();
        b = X509Extensions.r.e();
        c = X509Extensions.w.e();
        d = X509Extensions.m.e();
        e = X509Extensions.v.e();
        f = X509Extensions.l.e();
        g = X509Extensions.t.e();
        h = X509Extensions.g.e();
        i = X509Extensions.p.e();
        j = X509Extensions.e.e();
        k = X509Extensions.o.e();
        l = X509Extensions.s.e();
        m = X509Extensions.c.e();
        n = X509Extensions.h.e();
    }
}
