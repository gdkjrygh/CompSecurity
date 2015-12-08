// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CRLSelector;
import java.security.cert.CertSelector;
import java.security.cert.CertStoreException;
import java.security.cert.CertStoreParameters;
import java.security.cert.CertStoreSpi;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.x509.CertificatePair;
import org.bouncycastle.asn1.x509.X509CertificateStructure;
import org.bouncycastle.jce.X509LDAPCertStoreParameters;

// Referenced classes of package org.bouncycastle.jce.provider:
//            BouncyCastleProvider

public class X509LDAPCertStoreSpi extends CertStoreSpi
{

    private static String LDAP_PROVIDER = "com.sun.jndi.ldap.LdapCtxFactory";
    private static String REFERRALS_IGNORE = "ignore";
    private static final String SEARCH_SECURITY_LEVEL = "none";
    private static final String URL_CONTEXT_PREFIX = "com.sun.jndi.url";
    private X509LDAPCertStoreParameters params;

    public X509LDAPCertStoreSpi(CertStoreParameters certstoreparameters)
        throws InvalidAlgorithmParameterException
    {
        super(certstoreparameters);
        if (!(certstoreparameters instanceof X509LDAPCertStoreParameters))
        {
            throw new InvalidAlgorithmParameterException((new StringBuilder()).append(org/bouncycastle/jce/provider/X509LDAPCertStoreSpi.getName()).append(": parameter must be a ").append(org/bouncycastle/jce/X509LDAPCertStoreParameters.getName()).append(" object\n").append(certstoreparameters.toString()).toString());
        } else
        {
            params = (X509LDAPCertStoreParameters)certstoreparameters;
            return;
        }
    }

    private Set certSubjectSerialSearch(X509CertSelector x509certselector, String as[], String s, String s1)
        throws CertStoreException
    {
        HashSet hashset = new HashSet();
        if (x509certselector.getSubjectAsBytes() == null && x509certselector.getSubjectAsString() == null && x509certselector.getCertificate() == null)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        String s2 = null;
        if (x509certselector.getCertificate() == null) goto _L2; else goto _L1
_L1:
        String s3;
        s2 = x509certselector.getCertificate().getSubjectX500Principal().getName("RFC1779");
        s3 = x509certselector.getCertificate().getSerialNumber().toString();
        x509certselector = s2;
        s2 = s3;
_L3:
        try
        {
            x509certselector = parseDN(x509certselector, s1);
            hashset.addAll(search(s, (new StringBuilder()).append("*").append(x509certselector).append("*").toString(), as));
        }
        // Misplaced declaration of an exception variable
        catch (X509CertSelector x509certselector)
        {
            throw new CertStoreException((new StringBuilder()).append("exception processing selector: ").append(x509certselector).toString());
        }
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_264;
        }
        if (params.getSearchForSerialNumberIn() == null)
        {
            break MISSING_BLOCK_LABEL_264;
        }
        hashset.addAll(search(params.getSearchForSerialNumberIn(), (new StringBuilder()).append("*").append(s2).append("*").toString(), as));
        return hashset;
_L2:
label0:
        {
            if (x509certselector.getSubjectAsBytes() == null)
            {
                break label0;
            }
            x509certselector = (new X500Principal(x509certselector.getSubjectAsBytes())).getName("RFC1779");
        }
          goto _L3
        x509certselector = x509certselector.getSubjectAsString();
          goto _L3
        hashset.addAll(search(s, "*", as));
        return hashset;
        return hashset;
    }

    private DirContext connectLDAP()
        throws NamingException
    {
        Properties properties = new Properties();
        properties.setProperty("java.naming.factory.initial", LDAP_PROVIDER);
        properties.setProperty("java.naming.batchsize", "0");
        properties.setProperty("java.naming.provider.url", params.getLdapURL());
        properties.setProperty("java.naming.factory.url.pkgs", "com.sun.jndi.url");
        properties.setProperty("java.naming.referral", REFERRALS_IGNORE);
        properties.setProperty("java.naming.security.authentication", "none");
        return new InitialDirContext(properties);
    }

    private Set getCACertificates(X509CertSelector x509certselector)
        throws CertStoreException
    {
        String as[] = new String[1];
        as[0] = params.getCACertificateAttribute();
        x509certselector = certSubjectSerialSearch(x509certselector, as, params.getLdapCACertificateAttributeName(), params.getCACertificateSubjectAttributeName());
        if (x509certselector.isEmpty())
        {
            x509certselector.addAll(search(null, "*", as));
        }
        return x509certselector;
    }

    private Set getCrossCertificates(X509CertSelector x509certselector)
        throws CertStoreException
    {
        String as[] = new String[1];
        as[0] = params.getCrossCertificateAttribute();
        x509certselector = certSubjectSerialSearch(x509certselector, as, params.getLdapCrossCertificateAttributeName(), params.getCrossCertificateSubjectAttributeName());
        if (x509certselector.isEmpty())
        {
            x509certselector.addAll(search(null, "*", as));
        }
        return x509certselector;
    }

    private Set getEndCertificates(X509CertSelector x509certselector)
        throws CertStoreException
    {
        String s = params.getUserCertificateAttribute();
        String s1 = params.getLdapUserCertificateAttributeName();
        String s2 = params.getUserCertificateSubjectAttributeName();
        return certSubjectSerialSearch(x509certselector, new String[] {
            s
        }, s1, s2);
    }

    private String parseDN(String s, String s1)
    {
        s = s.substring(s.toLowerCase().indexOf(s1.toLowerCase()) + s1.length());
        int j = s.indexOf(',');
        int i = j;
        if (j == -1)
        {
            i = s.length();
        }
        do
        {
            if (s.charAt(i - 1) != '\\')
            {
                break;
            }
            int k = s.indexOf(',', i + 1);
            i = k;
            if (k == -1)
            {
                i = s.length();
            }
        } while (true);
        s = s.substring(0, i);
        s1 = s.substring(s.indexOf('=') + 1);
        s = s1;
        if (s1.charAt(0) == ' ')
        {
            s = s1.substring(1);
        }
        s1 = s;
        if (s.startsWith("\""))
        {
            s1 = s.substring(1);
        }
        s = s1;
        if (s1.endsWith("\""))
        {
            s = s1.substring(0, s1.length() - 1);
        }
        return s;
    }

    private Set search(String s, String s1, String as[])
        throws CertStoreException
    {
        HashSet hashset;
        int i;
        i = 0;
        s1 = (new StringBuilder()).append(s).append("=").append(s1).toString();
        if (s == null)
        {
            s1 = null;
        }
        hashset = new HashSet();
        s = connectLDAP();
        SearchControls searchcontrols;
        searchcontrols = new SearchControls();
        searchcontrols.setSearchScope(2);
        searchcontrols.setCountLimit(0L);
_L4:
        if (i >= as.length) goto _L2; else goto _L1
_L1:
        String as1[] = new String[1];
        as1[0] = as[i];
        Object obj;
        searchcontrols.setReturningAttributes(as1);
        obj = (new StringBuilder()).append("(&(").append(s1).append(")(").append(as1[0]).append("=*))").toString();
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        obj = (new StringBuilder()).append("(").append(as1[0]).append("=*)").toString();
        for (obj = s.search(params.getBaseDN(), ((String) (obj)), searchcontrols); ((NamingEnumeration) (obj)).hasMoreElements();)
        {
            NamingEnumeration namingenumeration = ((Attribute)((SearchResult)((NamingEnumeration) (obj)).next()).getAttributes().getAll().next()).getAll();
            while (namingenumeration.hasMore()) 
            {
                hashset.add(namingenumeration.next());
            }
        }

          goto _L3
        s1;
_L6:
        throw new CertStoreException((new StringBuilder()).append("Error getting results from LDAP directory ").append(s1).toString());
        s1;
_L5:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        throw s1;
_L3:
        i++;
          goto _L4
_L2:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return hashset;
            }
        }
        return hashset;
        s1;
        s = null;
          goto _L5
        s1;
          goto _L5
        s1;
        s = null;
          goto _L6
    }

    public Collection engineGetCRLs(CRLSelector crlselector)
        throws CertStoreException
    {
        String as[] = new String[1];
        as[0] = params.getCertificateRevocationListAttribute();
        if (!(crlselector instanceof X509CRLSelector))
        {
            throw new CertStoreException("selector is not a X509CRLSelector");
        }
        X509CRLSelector x509crlselector = (X509CRLSelector)crlselector;
        HashSet hashset = new HashSet();
        String s = params.getLdapCertificateRevocationListAttributeName();
        HashSet hashset1 = new HashSet();
        if (x509crlselector.getIssuerNames() != null)
        {
            Iterator iterator = x509crlselector.getIssuerNames().iterator();
            while (iterator.hasNext()) 
            {
                crlselector = ((CRLSelector) (iterator.next()));
                if (crlselector instanceof String)
                {
                    String s1 = params.getCertificateRevocationListIssuerAttributeName();
                    crlselector = parseDN((String)crlselector, s1);
                } else
                {
                    String s2 = params.getCertificateRevocationListIssuerAttributeName();
                    crlselector = parseDN((new X500Principal((byte[])(byte[])crlselector)).getName("RFC1779"), s2);
                }
                hashset1.addAll(search(s, (new StringBuilder()).append("*").append(crlselector).append("*").toString(), as));
            }
        } else
        {
            hashset1.addAll(search(s, "*", as));
        }
        hashset1.addAll(search(null, "*", as));
        crlselector = hashset1.iterator();
        try
        {
            CertificateFactory certificatefactory = CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME);
            do
            {
                if (!crlselector.hasNext())
                {
                    break;
                }
                java.security.cert.CRL crl = certificatefactory.generateCRL(new ByteArrayInputStream((byte[])(byte[])crlselector.next()));
                if (x509crlselector.match(crl))
                {
                    hashset.add(crl);
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (CRLSelector crlselector)
        {
            throw new CertStoreException((new StringBuilder()).append("CRL cannot be constructed from LDAP result ").append(crlselector).toString());
        }
        return hashset;
    }

    public Collection engineGetCertificates(CertSelector certselector)
        throws CertStoreException
    {
        HashSet hashset;
        Object obj;
        if (!(certselector instanceof X509CertSelector))
        {
            throw new CertStoreException("selector is not a X509CertSelector");
        }
        certselector = (X509CertSelector)certselector;
        hashset = new HashSet();
        obj = getEndCertificates(certselector);
        ((Set) (obj)).addAll(getCACertificates(certselector));
        ((Set) (obj)).addAll(getCrossCertificates(certselector));
        obj = ((Set) (obj)).iterator();
        CertificateFactory certificatefactory = CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME);
_L3:
        byte abyte0[];
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_309;
            }
            abyte0 = (byte[])(byte[])((Iterator) (obj)).next();
        } while (abyte0 == null);
        Object obj1;
        if (abyte0.length == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = new ArrayList();
        ((List) (obj1)).add(abyte0);
        Object obj2;
        try
        {
            CertificatePair certificatepair = CertificatePair.getInstance((new ASN1InputStream(abyte0)).readObject());
            ((List) (obj1)).clear();
            if (certificatepair.getForward() != null)
            {
                ((List) (obj1)).add(certificatepair.getForward().getEncoded());
            }
            if (certificatepair.getReverse() != null)
            {
                ((List) (obj1)).add(certificatepair.getReverse().getEncoded());
            }
        }
        catch (IOException ioexception) { }
        catch (IllegalArgumentException illegalargumentexception) { }
        obj1 = ((List) (obj1)).iterator();
_L1:
        if (!((Iterator) (obj1)).hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj2 = new ByteArrayInputStream((byte[])(byte[])((Iterator) (obj1)).next());
        try
        {
            obj2 = certificatefactory.generateCertificate(((java.io.InputStream) (obj2)));
            if (certselector.match(((java.security.cert.Certificate) (obj2))))
            {
                hashset.add(obj2);
            }
        }
        catch (Exception exception) { }
          goto _L1
        if (true) goto _L3; else goto _L2
_L2:
        certselector;
        throw new CertStoreException((new StringBuilder()).append("certificate cannot be constructed from LDAP result: ").append(certselector).toString());
        return hashset;
    }

}
