// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.Principal;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import org.bouncycastle.jce.provider.X509AttrCertParser;
import org.bouncycastle.jce.provider.X509CRLParser;
import org.bouncycastle.jce.provider.X509CertPairParser;
import org.bouncycastle.jce.provider.X509CertParser;
import org.bouncycastle.util.StoreException;
import org.bouncycastle.x509.AttributeCertificateHolder;
import org.bouncycastle.x509.AttributeCertificateIssuer;
import org.bouncycastle.x509.X509AttributeCertStoreSelector;
import org.bouncycastle.x509.X509AttributeCertificate;
import org.bouncycastle.x509.X509CRLStoreSelector;
import org.bouncycastle.x509.X509CertPairStoreSelector;
import org.bouncycastle.x509.X509CertStoreSelector;
import org.bouncycastle.x509.X509CertificatePair;

// Referenced classes of package org.bouncycastle.x509.util:
//            StreamParsingException

public class LDAPStoreHelper
{

    private static String LDAP_PROVIDER = "com.sun.jndi.ldap.LdapCtxFactory";
    private static String REFERRALS_IGNORE = "ignore";
    private static final String SEARCH_SECURITY_LEVEL = "none";
    private static final String URL_CONTEXT_PREFIX = "com.sun.jndi.url";
    private static int cacheSize = 32;
    private static long lifeTime = 60000L;
    private Map cacheMap;
    private X509LDAPCertStoreParameters params;

    public LDAPStoreHelper(X509LDAPCertStoreParameters x509ldapcertstoreparameters)
    {
        cacheMap = new HashMap(cacheSize);
        params = x509ldapcertstoreparameters;
    }

    private void addToCache(String s, List list)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        Object obj;
        obj = new Date(System.currentTimeMillis());
        arraylist = new ArrayList();
        arraylist.add(obj);
        arraylist.add(list);
        if (!cacheMap.containsKey(s)) goto _L2; else goto _L1
_L1:
        cacheMap.put(s, arraylist);
_L6:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Iterator iterator;
        long l;
        if (cacheMap.size() < cacheSize)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        iterator = cacheMap.entrySet().iterator();
        l = ((Date) (obj)).getTime();
        list = null;
_L4:
        long l1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (java.util.Map.Entry)iterator.next();
        l1 = ((Date)((List)((java.util.Map.Entry) (obj)).getValue()).get(0)).getTime();
        if (l1 >= l)
        {
            continue; /* Loop/switch isn't completed */
        }
        list = ((List) (((java.util.Map.Entry) (obj)).getKey()));
        l = l1;
        if (true) goto _L4; else goto _L3
_L3:
        cacheMap.remove(list);
        cacheMap.put(s, arraylist);
        if (true) goto _L6; else goto _L5
_L5:
        s;
        throw s;
    }

    private List attrCertSubjectSerialSearch(X509AttributeCertStoreSelector x509attributecertstoreselector, String as[], String as1[], String as2[])
        throws StoreException
    {
        Object obj1;
        ArrayList arraylist;
        HashSet hashset;
        obj1 = null;
        arraylist = new ArrayList();
        hashset = new HashSet();
        if (x509attributecertstoreselector.getHolder() == null) goto _L2; else goto _L1
_L1:
        if (x509attributecertstoreselector.getHolder().getSerialNumber() != null)
        {
            hashset.add(x509attributecertstoreselector.getHolder().getSerialNumber().toString());
        }
        if (x509attributecertstoreselector.getHolder().getEntityNames() == null) goto _L2; else goto _L3
_L3:
        Object obj = x509attributecertstoreselector.getHolder().getEntityNames();
_L5:
        Principal aprincipal[] = ((Principal []) (obj));
        if (x509attributecertstoreselector.getAttributeCert() != null)
        {
            if (x509attributecertstoreselector.getAttributeCert().getHolder().getEntityNames() != null)
            {
                obj = x509attributecertstoreselector.getAttributeCert().getHolder().getEntityNames();
            }
            hashset.add(x509attributecertstoreselector.getAttributeCert().getSerialNumber().toString());
            aprincipal = ((Principal []) (obj));
        }
        obj = obj1;
        if (aprincipal != null)
        {
            if (aprincipal[0] instanceof X500Principal)
            {
                obj = ((X500Principal)aprincipal[0]).getName("RFC1779");
            } else
            {
                obj = aprincipal[0].getName();
            }
        }
        if (x509attributecertstoreselector.getSerialNumber() != null)
        {
            hashset.add(x509attributecertstoreselector.getSerialNumber().toString());
        }
        if (obj != null)
        {
            for (int i = 0; i < as2.length; i++)
            {
                x509attributecertstoreselector = parseDN(((String) (obj)), as2[i]);
                arraylist.addAll(search(as1, (new StringBuilder()).append("*").append(x509attributecertstoreselector).append("*").toString(), as));
            }

        }
        if (hashset.size() > 0 && params.getSearchForSerialNumberIn() != null)
        {
            for (x509attributecertstoreselector = hashset.iterator(); x509attributecertstoreselector.hasNext(); arraylist.addAll(search(splitString(params.getSearchForSerialNumberIn()), as2, as)))
            {
                as2 = (String)x509attributecertstoreselector.next();
            }

        }
        if (hashset.size() == 0 && obj == null)
        {
            arraylist.addAll(search(as1, "*", as));
        }
        return arraylist;
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private List cRLIssuerSearch(X509CRLStoreSelector x509crlstoreselector, String as[], String as1[], String as2[])
        throws StoreException
    {
        ArrayList arraylist = new ArrayList();
        Object obj = new HashSet();
        if (x509crlstoreselector.getIssuers() != null)
        {
            ((Collection) (obj)).addAll(x509crlstoreselector.getIssuers());
        }
        if (x509crlstoreselector.getCertificateChecking() != null)
        {
            ((Collection) (obj)).add(getCertificateIssuer(x509crlstoreselector.getCertificateChecking()));
        }
        if (x509crlstoreselector.getAttrCertificateChecking() != null)
        {
            x509crlstoreselector = x509crlstoreselector.getAttrCertificateChecking().getIssuer().getPrincipals();
            for (int i = 0; i < x509crlstoreselector.length; i++)
            {
                if (x509crlstoreselector[i] instanceof X500Principal)
                {
                    ((Collection) (obj)).add(x509crlstoreselector[i]);
                }
            }

        }
        obj = ((Collection) (obj)).iterator();
        x509crlstoreselector = null;
        while (((Iterator) (obj)).hasNext()) 
        {
            x509crlstoreselector = ((X500Principal)((Iterator) (obj)).next()).getName("RFC1779");
            int j = 0;
            while (j < as2.length) 
            {
                String s = parseDN(x509crlstoreselector, as2[j]);
                arraylist.addAll(search(as1, (new StringBuilder()).append("*").append(s).append("*").toString(), as));
                j++;
            }
        }
        if (x509crlstoreselector == null)
        {
            arraylist.addAll(search(as1, "*", as));
        }
        return arraylist;
    }

    private List certSubjectSerialSearch(X509CertStoreSelector x509certstoreselector, String as[], String as1[], String as2[])
        throws StoreException
    {
        ArrayList arraylist = new ArrayList();
        String s = null;
        String s1 = getSubjectAsString(x509certstoreselector);
        if (x509certstoreselector.getSerialNumber() != null)
        {
            s = x509certstoreselector.getSerialNumber().toString();
        }
        if (x509certstoreselector.getCertificate() != null)
        {
            s = x509certstoreselector.getCertificate().getSubjectX500Principal().getName("RFC1779");
            x509certstoreselector = x509certstoreselector.getCertificate().getSerialNumber().toString();
        } else
        {
            x509certstoreselector = s;
            s = s1;
        }
        if (s != null)
        {
            for (int i = 0; i < as2.length; i++)
            {
                s1 = parseDN(s, as2[i]);
                arraylist.addAll(search(as1, (new StringBuilder()).append("*").append(s1).append("*").toString(), as));
            }

        }
        if (x509certstoreselector != null && params.getSearchForSerialNumberIn() != null)
        {
            arraylist.addAll(search(splitString(params.getSearchForSerialNumberIn()), x509certstoreselector, as));
        }
        if (x509certstoreselector == null && s == null)
        {
            arraylist.addAll(search(as1, "*", as));
        }
        return arraylist;
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

    private Set createAttributeCertificates(List list, X509AttributeCertStoreSelector x509attributecertstoreselector)
        throws StoreException
    {
        HashSet hashset = new HashSet();
        list = list.iterator();
        X509AttrCertParser x509attrcertparser = new X509AttrCertParser();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            try
            {
                x509attrcertparser.engineInit(new ByteArrayInputStream((byte[])(byte[])list.next()));
                X509AttributeCertificate x509attributecertificate = (X509AttributeCertificate)x509attrcertparser.engineRead();
                if (x509attributecertstoreselector.match(x509attributecertificate))
                {
                    hashset.add(x509attributecertificate);
                }
            }
            catch (StreamParsingException streamparsingexception) { }
        } while (true);
        return hashset;
    }

    private Set createCRLs(List list, X509CRLStoreSelector x509crlstoreselector)
        throws StoreException
    {
        HashSet hashset = new HashSet();
        X509CRLParser x509crlparser = new X509CRLParser();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            try
            {
                x509crlparser.engineInit(new ByteArrayInputStream((byte[])(byte[])list.next()));
                X509CRL x509crl = (X509CRL)x509crlparser.engineRead();
                if (x509crlstoreselector.match(x509crl))
                {
                    hashset.add(x509crl);
                }
            }
            catch (StreamParsingException streamparsingexception) { }
        } while (true);
        return hashset;
    }

    private Set createCerts(List list, X509CertStoreSelector x509certstoreselector)
        throws StoreException
    {
        HashSet hashset = new HashSet();
        list = list.iterator();
        X509CertParser x509certparser = new X509CertParser();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            try
            {
                x509certparser.engineInit(new ByteArrayInputStream((byte[])(byte[])list.next()));
                X509Certificate x509certificate = (X509Certificate)x509certparser.engineRead();
                if (x509certstoreselector.match(x509certificate))
                {
                    hashset.add(x509certificate);
                }
            }
            catch (Exception exception) { }
        } while (true);
        return hashset;
    }

    private Set createCrossCertificatePairs(List list, X509CertPairStoreSelector x509certpairstoreselector)
        throws StoreException
    {
        HashSet hashset;
        int i;
        hashset = new HashSet();
        i = 0;
_L3:
        if (i >= list.size()) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = new X509CertPairParser();
        ((X509CertPairParser) (obj)).engineInit(new ByteArrayInputStream((byte[])(byte[])list.get(i)));
        obj = (X509CertificatePair)((X509CertPairParser) (obj)).engineRead();
_L4:
        int j = i;
        if (!x509certpairstoreselector.match(obj))
        {
            break MISSING_BLOCK_LABEL_89;
        }
        hashset.add(obj);
        j = i;
_L5:
        i = j + 1;
          goto _L3
        Object obj1;
        obj1;
        obj1 = (byte[])(byte[])list.get(i);
        byte abyte0[] = (byte[])(byte[])list.get(i + 1);
        obj1 = new X509CertificatePair(new CertificatePair(X509CertificateStructure.getInstance((new ASN1InputStream(((byte []) (obj1)))).readObject()), X509CertificateStructure.getInstance((new ASN1InputStream(abyte0)).readObject())));
        i++;
          goto _L4
_L2:
        return hashset;
        obj1;
        j = i;
          goto _L5
        obj1;
        j = i;
          goto _L5
        obj1;
        j = i;
          goto _L5
        obj1;
        j = i;
          goto _L5
    }

    private List crossCertificatePairSubjectSearch(X509CertPairStoreSelector x509certpairstoreselector, String as[], String as1[], String as2[])
        throws StoreException
    {
        ArrayList arraylist = new ArrayList();
        String s = null;
        if (x509certpairstoreselector.getForwardSelector() != null)
        {
            s = getSubjectAsString(x509certpairstoreselector.getForwardSelector());
        }
        if (x509certpairstoreselector.getCertPair() != null && x509certpairstoreselector.getCertPair().getForward() != null)
        {
            x509certpairstoreselector = x509certpairstoreselector.getCertPair().getForward().getSubjectX500Principal().getName("RFC1779");
        } else
        {
            x509certpairstoreselector = s;
        }
        if (x509certpairstoreselector != null)
        {
            for (int i = 0; i < as2.length; i++)
            {
                s = parseDN(x509certpairstoreselector, as2[i]);
                arraylist.addAll(search(as1, (new StringBuilder()).append("*").append(s).append("*").toString(), as));
            }

        }
        if (x509certpairstoreselector == null)
        {
            arraylist.addAll(search(as1, "*", as));
        }
        return arraylist;
    }

    private X500Principal getCertificateIssuer(X509Certificate x509certificate)
    {
        return x509certificate.getIssuerX500Principal();
    }

    private List getFromCache(String s)
    {
        s = (List)cacheMap.get(s);
        long l = System.currentTimeMillis();
        if (s != null)
        {
            if (((Date)s.get(0)).getTime() < l - lifeTime)
            {
                return null;
            } else
            {
                return (List)s.get(1);
            }
        } else
        {
            return null;
        }
    }

    private String getSubjectAsString(X509CertStoreSelector x509certstoreselector)
    {
        try
        {
            x509certstoreselector = x509certstoreselector.getSubjectAsBytes();
        }
        // Misplaced declaration of an exception variable
        catch (X509CertStoreSelector x509certstoreselector)
        {
            throw new StoreException((new StringBuilder()).append("exception processing name: ").append(x509certstoreselector.getMessage()).toString(), x509certstoreselector);
        }
        if (x509certstoreselector == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        x509certstoreselector = (new X500Principal(x509certstoreselector)).getName("RFC1779");
        return x509certstoreselector;
        return null;
    }

    private String parseDN(String s, String s1)
    {
        int i = s.toLowerCase().indexOf((new StringBuilder()).append(s1.toLowerCase()).append("=").toString());
        if (i == -1)
        {
            s = "";
        } else
        {
            s = s.substring(i + s1.length());
            int j = s.indexOf(',');
            i = j;
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
                return s1.substring(0, s1.length() - 1);
            }
        }
        return s;
    }

    private List search(String as[], String s, String as1[])
        throws StoreException
    {
        DirContext dircontext = null;
        Object obj1 = null;
        boolean flag = false;
        if (as == null)
        {
            as = null;
        } else
        {
            String s1 = s;
            if (s.equals("**"))
            {
                s1 = "*";
            }
            s = "";
            for (int j = 0; j < as.length; j++)
            {
                s = (new StringBuilder()).append(s).append("(").append(as[j]).append("=").append(s1).append(")").toString();
            }

            as = (new StringBuilder()).append("(|").append(s).append(")").toString();
        }
        s = "";
        for (int i = ((flag) ? 1 : 0); i < as1.length; i++)
        {
            s = (new StringBuilder()).append(s).append("(").append(as1[i]).append("=*)").toString();
        }

        s = (new StringBuilder()).append("(|").append(s).append(")").toString();
        Object obj = (new StringBuilder()).append("(&").append(as).append("").append(s).append(")").toString();
        ArrayList arraylist;
        if (as == null)
        {
            as = s;
        } else
        {
            as = ((String []) (obj));
        }
        s = getFromCache(as);
        if (s != null)
        {
            return s;
        }
        arraylist = new ArrayList();
        s = ((String) (obj1));
        obj = dircontext;
        dircontext = connectLDAP();
        s = dircontext;
        obj = dircontext;
        obj1 = new SearchControls();
        s = dircontext;
        obj = dircontext;
        ((SearchControls) (obj1)).setSearchScope(2);
        s = dircontext;
        obj = dircontext;
        ((SearchControls) (obj1)).setCountLimit(0L);
        s = dircontext;
        obj = dircontext;
        ((SearchControls) (obj1)).setReturningAttributes(as1);
        s = dircontext;
        obj = dircontext;
        as1 = dircontext.search(params.getBaseDN(), as, ((SearchControls) (obj1)));
_L2:
        s = dircontext;
        obj = dircontext;
        if (!as1.hasMoreElements())
        {
            break MISSING_BLOCK_LABEL_484;
        }
        s = dircontext;
        obj = dircontext;
        obj1 = ((Attribute)((SearchResult)as1.next()).getAttributes().getAll().next()).getAll();
_L3:
        s = dircontext;
        obj = dircontext;
        if (!((NamingEnumeration) (obj1)).hasMore()) goto _L2; else goto _L1
_L1:
        s = dircontext;
        obj = dircontext;
        arraylist.add(((NamingEnumeration) (obj1)).next());
          goto _L3
        as;
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String as[]) { }
        }
        return arraylist;
        s = dircontext;
        obj = dircontext;
        addToCache(as, arraylist);
        if (dircontext != null)
        {
            try
            {
                dircontext.close();
            }
            // Misplaced declaration of an exception variable
            catch (String as[]) { }
        }
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_481;
        }
        as;
        if (obj != null)
        {
            try
            {
                ((DirContext) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        throw as;
    }

    private String[] splitString(String s)
    {
        return s.split("\\s+");
    }

    public Collection getAACertificates(X509AttributeCertStoreSelector x509attributecertstoreselector)
        throws StoreException
    {
        String as[] = splitString(params.getAACertificateAttribute());
        String as1[] = splitString(params.getLdapAACertificateAttributeName());
        String as2[] = splitString(params.getAACertificateSubjectAttributeName());
        Set set = createAttributeCertificates(attrCertSubjectSerialSearch(x509attributecertstoreselector, as, as1, as2), x509attributecertstoreselector);
        if (set.size() == 0)
        {
            set.addAll(createAttributeCertificates(attrCertSubjectSerialSearch(new X509AttributeCertStoreSelector(), as, as1, as2), x509attributecertstoreselector));
        }
        return set;
    }

    public Collection getAttributeAuthorityRevocationLists(X509CRLStoreSelector x509crlstoreselector)
        throws StoreException
    {
        String as[] = splitString(params.getAttributeAuthorityRevocationListAttribute());
        String as1[] = splitString(params.getLdapAttributeAuthorityRevocationListAttributeName());
        String as2[] = splitString(params.getAttributeAuthorityRevocationListIssuerAttributeName());
        Set set = createCRLs(cRLIssuerSearch(x509crlstoreselector, as, as1, as2), x509crlstoreselector);
        if (set.size() == 0)
        {
            set.addAll(createCRLs(cRLIssuerSearch(new X509CRLStoreSelector(), as, as1, as2), x509crlstoreselector));
        }
        return set;
    }

    public Collection getAttributeCertificateAttributes(X509AttributeCertStoreSelector x509attributecertstoreselector)
        throws StoreException
    {
        String as[] = splitString(params.getAttributeCertificateAttributeAttribute());
        String as1[] = splitString(params.getLdapAttributeCertificateAttributeAttributeName());
        String as2[] = splitString(params.getAttributeCertificateAttributeSubjectAttributeName());
        Set set = createAttributeCertificates(attrCertSubjectSerialSearch(x509attributecertstoreselector, as, as1, as2), x509attributecertstoreselector);
        if (set.size() == 0)
        {
            set.addAll(createAttributeCertificates(attrCertSubjectSerialSearch(new X509AttributeCertStoreSelector(), as, as1, as2), x509attributecertstoreselector));
        }
        return set;
    }

    public Collection getAttributeCertificateRevocationLists(X509CRLStoreSelector x509crlstoreselector)
        throws StoreException
    {
        String as[] = splitString(params.getAttributeCertificateRevocationListAttribute());
        String as1[] = splitString(params.getLdapAttributeCertificateRevocationListAttributeName());
        String as2[] = splitString(params.getAttributeCertificateRevocationListIssuerAttributeName());
        Set set = createCRLs(cRLIssuerSearch(x509crlstoreselector, as, as1, as2), x509crlstoreselector);
        if (set.size() == 0)
        {
            set.addAll(createCRLs(cRLIssuerSearch(new X509CRLStoreSelector(), as, as1, as2), x509crlstoreselector));
        }
        return set;
    }

    public Collection getAttributeDescriptorCertificates(X509AttributeCertStoreSelector x509attributecertstoreselector)
        throws StoreException
    {
        String as[] = splitString(params.getAttributeDescriptorCertificateAttribute());
        String as1[] = splitString(params.getLdapAttributeDescriptorCertificateAttributeName());
        String as2[] = splitString(params.getAttributeDescriptorCertificateSubjectAttributeName());
        Set set = createAttributeCertificates(attrCertSubjectSerialSearch(x509attributecertstoreselector, as, as1, as2), x509attributecertstoreselector);
        if (set.size() == 0)
        {
            set.addAll(createAttributeCertificates(attrCertSubjectSerialSearch(new X509AttributeCertStoreSelector(), as, as1, as2), x509attributecertstoreselector));
        }
        return set;
    }

    public Collection getAuthorityRevocationLists(X509CRLStoreSelector x509crlstoreselector)
        throws StoreException
    {
        String as[] = splitString(params.getAuthorityRevocationListAttribute());
        String as1[] = splitString(params.getLdapAuthorityRevocationListAttributeName());
        String as2[] = splitString(params.getAuthorityRevocationListIssuerAttributeName());
        Set set = createCRLs(cRLIssuerSearch(x509crlstoreselector, as, as1, as2), x509crlstoreselector);
        if (set.size() == 0)
        {
            set.addAll(createCRLs(cRLIssuerSearch(new X509CRLStoreSelector(), as, as1, as2), x509crlstoreselector));
        }
        return set;
    }

    public Collection getCACertificates(X509CertStoreSelector x509certstoreselector)
        throws StoreException
    {
        String as[] = splitString(params.getCACertificateAttribute());
        String as1[] = splitString(params.getLdapCACertificateAttributeName());
        String as2[] = splitString(params.getCACertificateSubjectAttributeName());
        Set set = createCerts(certSubjectSerialSearch(x509certstoreselector, as, as1, as2), x509certstoreselector);
        if (set.size() == 0)
        {
            set.addAll(createCerts(certSubjectSerialSearch(new X509CertStoreSelector(), as, as1, as2), x509certstoreselector));
        }
        return set;
    }

    public Collection getCertificateRevocationLists(X509CRLStoreSelector x509crlstoreselector)
        throws StoreException
    {
        String as[] = splitString(params.getCertificateRevocationListAttribute());
        String as1[] = splitString(params.getLdapCertificateRevocationListAttributeName());
        String as2[] = splitString(params.getCertificateRevocationListIssuerAttributeName());
        Set set = createCRLs(cRLIssuerSearch(x509crlstoreselector, as, as1, as2), x509crlstoreselector);
        if (set.size() == 0)
        {
            set.addAll(createCRLs(cRLIssuerSearch(new X509CRLStoreSelector(), as, as1, as2), x509crlstoreselector));
        }
        return set;
    }

    public Collection getCrossCertificatePairs(X509CertPairStoreSelector x509certpairstoreselector)
        throws StoreException
    {
        String as[] = splitString(params.getCrossCertificateAttribute());
        String as1[] = splitString(params.getLdapCrossCertificateAttributeName());
        String as2[] = splitString(params.getCrossCertificateSubjectAttributeName());
        Set set = createCrossCertificatePairs(crossCertificatePairSubjectSearch(x509certpairstoreselector, as, as1, as2), x509certpairstoreselector);
        if (set.size() == 0)
        {
            X509CertStoreSelector x509certstoreselector = new X509CertStoreSelector();
            X509CertPairStoreSelector x509certpairstoreselector1 = new X509CertPairStoreSelector();
            x509certpairstoreselector1.setForwardSelector(x509certstoreselector);
            x509certpairstoreselector1.setReverseSelector(x509certstoreselector);
            set.addAll(createCrossCertificatePairs(crossCertificatePairSubjectSearch(x509certpairstoreselector1, as, as1, as2), x509certpairstoreselector));
        }
        return set;
    }

    public Collection getDeltaCertificateRevocationLists(X509CRLStoreSelector x509crlstoreselector)
        throws StoreException
    {
        String as[] = splitString(params.getDeltaRevocationListAttribute());
        String as1[] = splitString(params.getLdapDeltaRevocationListAttributeName());
        String as2[] = splitString(params.getDeltaRevocationListIssuerAttributeName());
        Set set = createCRLs(cRLIssuerSearch(x509crlstoreselector, as, as1, as2), x509crlstoreselector);
        if (set.size() == 0)
        {
            set.addAll(createCRLs(cRLIssuerSearch(new X509CRLStoreSelector(), as, as1, as2), x509crlstoreselector));
        }
        return set;
    }

    public Collection getUserCertificates(X509CertStoreSelector x509certstoreselector)
        throws StoreException
    {
        String as[] = splitString(params.getUserCertificateAttribute());
        String as1[] = splitString(params.getLdapUserCertificateAttributeName());
        String as2[] = splitString(params.getUserCertificateSubjectAttributeName());
        Set set = createCerts(certSubjectSerialSearch(x509certstoreselector, as, as1, as2), x509certstoreselector);
        if (set.size() == 0)
        {
            set.addAll(createCerts(certSubjectSerialSearch(new X509CertStoreSelector(), as, as1, as2), x509certstoreselector));
        }
        return set;
    }

}
