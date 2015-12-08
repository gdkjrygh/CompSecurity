// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLSelector;
import java.security.cert.CertSelector;
import java.security.cert.CertStoreException;
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

    private static String b = "com.sun.jndi.ldap.LdapCtxFactory";
    private static String c = "ignore";
    private X509LDAPCertStoreParameters a;

    private static String a(String s, String s1)
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

    private Set a(String s, String s1, String as[])
    {
        String s2;
        HashSet hashset;
        int i;
        i = 0;
        s2 = (new StringBuilder()).append(s).append("=").append(s1).toString();
        if (s == null)
        {
            s2 = null;
        }
        hashset = new HashSet();
        s = new Properties();
        s.setProperty("java.naming.factory.initial", b);
        s.setProperty("java.naming.batchsize", "0");
        s.setProperty("java.naming.provider.url", a.F());
        s.setProperty("java.naming.factory.url.pkgs", "com.sun.jndi.url");
        s.setProperty("java.naming.referral", c);
        s.setProperty("java.naming.security.authentication", "none");
        s1 = new InitialDirContext(s);
        SearchControls searchcontrols;
        searchcontrols = new SearchControls();
        searchcontrols.setSearchScope(2);
        searchcontrols.setCountLimit(0L);
_L4:
        if (i >= as.length) goto _L2; else goto _L1
_L1:
        String as1[] = new String[1];
        as1[0] = as[i];
        searchcontrols.setReturningAttributes(as1);
        s = (new StringBuilder("(&(")).append(s2).append(")(").append(as1[0]).append("=*))").toString();
        if (s2 != null)
        {
            break MISSING_BLOCK_LABEL_236;
        }
        s = (new StringBuilder("(")).append(as1[0]).append("=*)").toString();
        for (s = s1.search(a.m(), s, searchcontrols); s.hasMoreElements();)
        {
            NamingEnumeration namingenumeration = ((Attribute)((SearchResult)s.next()).getAttributes().getAll().next()).getAll();
            while (namingenumeration.hasMore()) 
            {
                hashset.add(namingenumeration.next());
            }
        }

          goto _L3
        as;
        s = s1;
        s1 = as;
_L6:
        throw new CertStoreException((new StringBuilder("Error getting results from LDAP directory ")).append(s1).toString());
        as;
        s1 = s;
        s = as;
_L5:
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        throw s;
_L3:
        i++;
          goto _L4
_L2:
        try
        {
            s1.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return hashset;
        }
        return hashset;
        s;
        s1 = null;
          goto _L5
        s;
          goto _L5
        s1;
        s = null;
          goto _L6
    }

    private Set a(X509CertSelector x509certselector, String as[], String s, String s1)
    {
        HashSet hashset = new HashSet();
        if (x509certselector.getSubjectAsBytes() == null && x509certselector.getSubjectAsString() == null && x509certselector.getCertificate() == null)
        {
            break MISSING_BLOCK_LABEL_210;
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
            x509certselector = a(((String) (x509certselector)), s1);
            hashset.addAll(a(s, (new StringBuilder("*")).append(x509certselector).append("*").toString(), as));
        }
        // Misplaced declaration of an exception variable
        catch (X509CertSelector x509certselector)
        {
            throw new CertStoreException((new StringBuilder("exception processing selector: ")).append(x509certselector).toString());
        }
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        if (a.H() == null)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        hashset.addAll(a(a.H(), (new StringBuilder("*")).append(s2).append("*").toString(), as));
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
        hashset.addAll(a(s, "*", as));
        return hashset;
        return hashset;
    }

    public Collection engineGetCRLs(CRLSelector crlselector)
    {
        String as[] = new String[1];
        as[0] = a.p();
        if (!(crlselector instanceof X509CRLSelector))
        {
            throw new CertStoreException("selector is not a X509CRLSelector");
        }
        X509CRLSelector x509crlselector = (X509CRLSelector)crlselector;
        HashSet hashset = new HashSet();
        String s = a.C();
        HashSet hashset1 = new HashSet();
        if (x509crlselector.getIssuerNames() != null)
        {
            Iterator iterator = x509crlselector.getIssuerNames().iterator();
            while (iterator.hasNext()) 
            {
                crlselector = ((CRLSelector) (iterator.next()));
                if (crlselector instanceof String)
                {
                    String s1 = a.q();
                    crlselector = a((String)crlselector, s1);
                } else
                {
                    String s2 = a.q();
                    crlselector = a((new X500Principal((byte[])crlselector)).getName("RFC1779"), s2);
                }
                hashset1.addAll(a(s, (new StringBuilder("*")).append(crlselector).append("*").toString(), as));
            }
        } else
        {
            hashset1.addAll(a(s, "*", as));
        }
        hashset1.addAll(a(null, "*", as));
        crlselector = hashset1.iterator();
        try
        {
            CertificateFactory certificatefactory = CertificateFactory.getInstance("X.509", BouncyCastleProvider.a);
            do
            {
                if (!crlselector.hasNext())
                {
                    break;
                }
                java.security.cert.CRL crl = certificatefactory.generateCRL(new ByteArrayInputStream((byte[])crlselector.next()));
                if (x509crlselector.match(crl))
                {
                    hashset.add(crl);
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (CRLSelector crlselector)
        {
            throw new CertStoreException((new StringBuilder("CRL cannot be constructed from LDAP result ")).append(crlselector).toString());
        }
        return hashset;
    }

    public Collection engineGetCertificates(CertSelector certselector)
    {
        HashSet hashset;
        Object obj;
        if (!(certselector instanceof X509CertSelector))
        {
            throw new CertStoreException("selector is not a X509CertSelector");
        }
        certselector = (X509CertSelector)certselector;
        hashset = new HashSet();
        obj = a.I();
        String s = a.G();
        Object obj1 = a.J();
        obj = a(certselector, new String[] {
            obj
        }, s, ((String) (obj1)));
        String as[] = new String[1];
        as[0] = a.n();
        obj1 = a(certselector, as, a.B(), a.o());
        if (((Set) (obj1)).isEmpty())
        {
            ((Set) (obj1)).addAll(a(null, "*", as));
        }
        ((Set) (obj)).addAll(((Collection) (obj1)));
        as = new String[1];
        as[0] = a.r();
        obj1 = a(certselector, as, a.D(), a.s());
        if (((Set) (obj1)).isEmpty())
        {
            ((Set) (obj1)).addAll(a(null, "*", as));
        }
        ((Set) (obj)).addAll(((Collection) (obj1)));
        obj = ((Set) (obj)).iterator();
        CertificateFactory certificatefactory = CertificateFactory.getInstance("X.509", BouncyCastleProvider.a);
_L3:
        byte abyte0[];
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_466;
            }
            abyte0 = (byte[])((Iterator) (obj)).next();
        } while (abyte0 == null);
        Object obj2;
        if (abyte0.length == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj2 = new ArrayList();
        ((List) (obj2)).add(abyte0);
        Object obj3;
        try
        {
            CertificatePair certificatepair = CertificatePair.a((new ASN1InputStream(abyte0)).a());
            ((List) (obj2)).clear();
            if (certificatepair.e() != null)
            {
                ((List) (obj2)).add(certificatepair.e().a());
            }
            if (certificatepair.f() != null)
            {
                ((List) (obj2)).add(certificatepair.f().a());
            }
        }
        catch (IOException ioexception) { }
        catch (IllegalArgumentException illegalargumentexception) { }
        obj2 = ((List) (obj2)).iterator();
_L1:
        if (!((Iterator) (obj2)).hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj3 = new ByteArrayInputStream((byte[])((Iterator) (obj2)).next());
        try
        {
            obj3 = certificatefactory.generateCertificate(((java.io.InputStream) (obj3)));
            if (certselector.match(((java.security.cert.Certificate) (obj3))))
            {
                hashset.add(obj3);
            }
        }
        catch (Exception exception) { }
          goto _L1
        if (true) goto _L3; else goto _L2
_L2:
        certselector;
        throw new CertStoreException((new StringBuilder("certificate cannot be constructed from LDAP result: ")).append(certselector).toString());
        return hashset;
    }

}
