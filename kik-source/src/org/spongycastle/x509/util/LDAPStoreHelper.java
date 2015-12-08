// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.x509.util;

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
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.x509.CertificatePair;
import org.spongycastle.asn1.x509.X509CertificateStructure;
import org.spongycastle.jce.X509LDAPCertStoreParameters;
import org.spongycastle.jce.provider.X509AttrCertParser;
import org.spongycastle.jce.provider.X509CRLParser;
import org.spongycastle.jce.provider.X509CertPairParser;
import org.spongycastle.jce.provider.X509CertParser;
import org.spongycastle.util.StoreException;
import org.spongycastle.x509.AttributeCertificateHolder;
import org.spongycastle.x509.AttributeCertificateIssuer;
import org.spongycastle.x509.X509AttributeCertStoreSelector;
import org.spongycastle.x509.X509AttributeCertificate;
import org.spongycastle.x509.X509CRLStoreSelector;
import org.spongycastle.x509.X509CertPairStoreSelector;
import org.spongycastle.x509.X509CertStoreSelector;
import org.spongycastle.x509.X509CertificatePair;

// Referenced classes of package org.spongycastle.x509.util:
//            StreamParsingException

public class LDAPStoreHelper
{

    private static String b = "com.sun.jndi.ldap.LdapCtxFactory";
    private static String c = "ignore";
    private static int e = 32;
    private static long f = 60000L;
    private X509LDAPCertStoreParameters a;
    private Map d;

    public LDAPStoreHelper(X509LDAPCertStoreParameters x509ldapcertstoreparameters)
    {
        d = new HashMap(e);
        a = x509ldapcertstoreparameters;
    }

    private static String a(String s, String s1)
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

    private List a(X509AttributeCertStoreSelector x509attributecertstoreselector, String as[], String as1[], String as2[])
    {
        Object obj1;
        ArrayList arraylist;
        HashSet hashset;
        obj1 = null;
        arraylist = new ArrayList();
        hashset = new HashSet();
        if (x509attributecertstoreselector.b() == null) goto _L2; else goto _L1
_L1:
        if (x509attributecertstoreselector.b().c() != null)
        {
            hashset.add(x509attributecertstoreselector.b().c().toString());
        }
        if (x509attributecertstoreselector.b().a() == null) goto _L2; else goto _L3
_L3:
        Object obj = x509attributecertstoreselector.b().a();
_L5:
        Principal aprincipal[] = ((Principal []) (obj));
        if (x509attributecertstoreselector.a() != null)
        {
            if (x509attributecertstoreselector.a().c().a() != null)
            {
                obj = x509attributecertstoreselector.a().c().a();
            }
            hashset.add(x509attributecertstoreselector.a().a().toString());
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
        if (x509attributecertstoreselector.c() != null)
        {
            hashset.add(x509attributecertstoreselector.c().toString());
        }
        if (obj != null)
        {
            for (int i = 0; i < as2.length; i++)
            {
                x509attributecertstoreselector = a(((String) (obj)), as2[i]);
                arraylist.addAll(a(as1, (new StringBuilder("*")).append(x509attributecertstoreselector).append("*").toString(), as));
            }

        }
        if (hashset.size() > 0 && a.H() != null)
        {
            for (x509attributecertstoreselector = hashset.iterator(); x509attributecertstoreselector.hasNext(); arraylist.addAll(a(a.H().split("\\s+"), ((String) (as2)), as)))
            {
                as2 = (String)x509attributecertstoreselector.next();
            }

        }
        if (hashset.size() == 0 && obj == null)
        {
            arraylist.addAll(a(as1, "*", as));
        }
        return arraylist;
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private List a(X509CRLStoreSelector x509crlstoreselector, String as[], String as1[], String as2[])
    {
        ArrayList arraylist = new ArrayList();
        Object obj = new HashSet();
        if (x509crlstoreselector.getIssuers() != null)
        {
            ((Collection) (obj)).addAll(x509crlstoreselector.getIssuers());
        }
        if (x509crlstoreselector.getCertificateChecking() != null)
        {
            ((Collection) (obj)).add(x509crlstoreselector.getCertificateChecking().getIssuerX500Principal());
        }
        if (x509crlstoreselector.b() != null)
        {
            x509crlstoreselector = x509crlstoreselector.b().d().a();
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
                String s = a(((String) (x509crlstoreselector)), as2[j]);
                arraylist.addAll(a(as1, (new StringBuilder("*")).append(s).append("*").toString(), as));
                j++;
            }
        }
        if (x509crlstoreselector == null)
        {
            arraylist.addAll(a(as1, "*", as));
        }
        return arraylist;
    }

    private List a(X509CertPairStoreSelector x509certpairstoreselector, String as[], String as1[], String as2[])
    {
        ArrayList arraylist = new ArrayList();
        String s = null;
        if (x509certpairstoreselector.b() != null)
        {
            s = c(x509certpairstoreselector.b());
        }
        if (x509certpairstoreselector.a() != null && x509certpairstoreselector.a().a() != null)
        {
            x509certpairstoreselector = x509certpairstoreselector.a().a().getSubjectX500Principal().getName("RFC1779");
        } else
        {
            x509certpairstoreselector = s;
        }
        if (x509certpairstoreselector != null)
        {
            for (int i = 0; i < as2.length; i++)
            {
                s = a(((String) (x509certpairstoreselector)), as2[i]);
                arraylist.addAll(a(as1, (new StringBuilder("*")).append(s).append("*").toString(), as));
            }

        }
        if (x509certpairstoreselector == null)
        {
            arraylist.addAll(a(as1, "*", as));
        }
        return arraylist;
    }

    private List a(X509CertStoreSelector x509certstoreselector, String as[], String as1[], String as2[])
    {
        ArrayList arraylist = new ArrayList();
        String s = null;
        String s1 = c(x509certstoreselector);
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
                s1 = a(s, as2[i]);
                arraylist.addAll(a(as1, (new StringBuilder("*")).append(s1).append("*").toString(), as));
            }

        }
        if (x509certstoreselector != null && a.H() != null)
        {
            arraylist.addAll(a(a.H().split("\\s+"), ((String) (x509certstoreselector)), as));
        }
        if (x509certstoreselector == null && s == null)
        {
            arraylist.addAll(a(as1, "*", as));
        }
        return arraylist;
    }

    private List a(String as[], String s, String as1[])
    {
        Object obj2 = null;
        Object obj1 = null;
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

            as = (new StringBuilder("(|")).append(s).append(")").toString();
        }
        s = "";
        for (int i = 0; i < as1.length; i++)
        {
            s = (new StringBuilder()).append(s).append("(").append(as1[i]).append("=*)").toString();
        }

        s = (new StringBuilder("(|")).append(s).append(")").toString();
        Object obj = (new StringBuilder("(&")).append(as).append(s).append(")").toString();
        long l;
        if (as == null)
        {
            as = s;
        } else
        {
            as = ((String []) (obj));
        }
        s = (List)d.get(as);
        l = System.currentTimeMillis();
        if (s != null && ((Date)s.get(0)).getTime() >= l - f)
        {
            s = (List)s.get(1);
        } else
        {
            s = null;
        }
        if (s != null)
        {
            return s;
        }
        obj = new ArrayList();
        s = new Properties();
        s.setProperty("java.naming.factory.initial", b);
        s.setProperty("java.naming.batchsize", "0");
        s.setProperty("java.naming.provider.url", a.F());
        s.setProperty("java.naming.factory.url.pkgs", "com.sun.jndi.url");
        s.setProperty("java.naming.referral", c);
        s.setProperty("java.naming.security.authentication", "none");
        s = new InitialDirContext(s);
        obj1 = new SearchControls();
        ((SearchControls) (obj1)).setSearchScope(2);
        ((SearchControls) (obj1)).setCountLimit(0L);
        ((SearchControls) (obj1)).setReturningAttributes(as1);
        for (as1 = s.search(a.m(), as, ((SearchControls) (obj1))); as1.hasMoreElements();)
        {
            obj1 = ((Attribute)((SearchResult)as1.next()).getAttributes().getAll().next()).getAll();
            while (((NamingEnumeration) (obj1)).hasMore()) 
            {
                ((List) (obj)).add(((NamingEnumeration) (obj1)).next());
            }
        }

          goto _L1
        as;
_L7:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String as[]) { }
        }
_L3:
        return ((List) (obj));
_L1:
        a(((String) (as)), ((List) (obj)));
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String as[]) { }
        if (true) goto _L3; else goto _L2
_L2:
        as;
        s = obj2;
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
        throw as;
        as;
        if (true) goto _L5; else goto _L4
_L4:
        as;
        s = ((String) (obj1));
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static Set a(List list, X509AttributeCertStoreSelector x509attributecertstoreselector)
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
                x509attrcertparser.a(new ByteArrayInputStream((byte[])list.next()));
                X509AttributeCertificate x509attributecertificate = (X509AttributeCertificate)x509attrcertparser.a();
                if (x509attributecertstoreselector.a(x509attributecertificate))
                {
                    hashset.add(x509attributecertificate);
                }
            }
            catch (StreamParsingException streamparsingexception) { }
        } while (true);
        return hashset;
    }

    private static Set a(List list, X509CRLStoreSelector x509crlstoreselector)
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
                x509crlparser.a(new ByteArrayInputStream((byte[])list.next()));
                X509CRL x509crl = (X509CRL)x509crlparser.a();
                if (x509crlstoreselector.a(x509crl))
                {
                    hashset.add(x509crl);
                }
            }
            catch (StreamParsingException streamparsingexception) { }
        } while (true);
        return hashset;
    }

    private static Set a(List list, X509CertPairStoreSelector x509certpairstoreselector)
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
        ((X509CertPairParser) (obj)).a(new ByteArrayInputStream((byte[])list.get(i)));
        obj = (X509CertificatePair)((X509CertPairParser) (obj)).a();
_L4:
        int j = i;
        if (!x509certpairstoreselector.a(obj))
        {
            break MISSING_BLOCK_LABEL_84;
        }
        hashset.add(obj);
        j = i;
_L5:
        i = j + 1;
          goto _L3
        Object obj1;
        obj1;
        obj1 = (byte[])list.get(i);
        byte abyte0[] = (byte[])list.get(i + 1);
        obj1 = new X509CertificatePair(new CertificatePair(X509CertificateStructure.a((new ASN1InputStream(((byte []) (obj1)))).b()), X509CertificateStructure.a((new ASN1InputStream(abyte0)).b())));
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

    private static Set a(List list, X509CertStoreSelector x509certstoreselector)
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
                x509certparser.a(new ByteArrayInputStream((byte[])list.next()));
                X509Certificate x509certificate = (X509Certificate)x509certparser.a();
                if (x509certstoreselector.a(x509certificate))
                {
                    hashset.add(x509certificate);
                }
            }
            catch (Exception exception) { }
        } while (true);
        return hashset;
    }

    private void a(String s, List list)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        Object obj;
        obj = new Date(System.currentTimeMillis());
        arraylist = new ArrayList();
        arraylist.add(obj);
        arraylist.add(list);
        if (!d.containsKey(s)) goto _L2; else goto _L1
_L1:
        d.put(s, arraylist);
_L6:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Iterator iterator;
        long l;
        if (d.size() < e)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        iterator = d.entrySet().iterator();
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
        d.remove(list);
        d.put(s, arraylist);
        if (true) goto _L6; else goto _L5
_L5:
        s;
        throw s;
    }

    private static String c(X509CertStoreSelector x509certstoreselector)
    {
        try
        {
            x509certstoreselector = x509certstoreselector.getSubjectAsBytes();
        }
        // Misplaced declaration of an exception variable
        catch (X509CertStoreSelector x509certstoreselector)
        {
            throw new StoreException((new StringBuilder("exception processing name: ")).append(x509certstoreselector.getMessage()).toString(), x509certstoreselector);
        }
        if (x509certstoreselector == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        x509certstoreselector = (new X500Principal(x509certstoreselector)).getName("RFC1779");
        return x509certstoreselector;
        return null;
    }

    public final Collection a(X509AttributeCertStoreSelector x509attributecertstoreselector)
    {
        String as[] = a.a().split("\\s+");
        String as1[] = a.v().split("\\s+");
        String as2[] = a.b().split("\\s+");
        Set set = a(a(x509attributecertstoreselector, as, as1, as2), x509attributecertstoreselector);
        if (set.size() == 0)
        {
            set.addAll(a(a(new X509AttributeCertStoreSelector(), as, as1, as2), x509attributecertstoreselector));
        }
        return set;
    }

    public final Collection a(X509CRLStoreSelector x509crlstoreselector)
    {
        String as[] = a.k().split("\\s+");
        String as1[] = a.A().split("\\s+");
        String as2[] = a.l().split("\\s+");
        Set set = a(a(x509crlstoreselector, as, as1, as2), x509crlstoreselector);
        if (set.size() == 0)
        {
            set.addAll(a(a(new X509CRLStoreSelector(), as, as1, as2), x509crlstoreselector));
        }
        return set;
    }

    public final Collection a(X509CertPairStoreSelector x509certpairstoreselector)
    {
        String as[] = a.r().split("\\s+");
        String as1[] = a.D().split("\\s+");
        String as2[] = a.s().split("\\s+");
        Set set = a(a(x509certpairstoreselector, as, as1, as2), x509certpairstoreselector);
        if (set.size() == 0)
        {
            X509CertStoreSelector x509certstoreselector = new X509CertStoreSelector();
            X509CertPairStoreSelector x509certpairstoreselector1 = new X509CertPairStoreSelector();
            x509certpairstoreselector1.a(x509certstoreselector);
            x509certpairstoreselector1.b(x509certstoreselector);
            set.addAll(a(a(x509certpairstoreselector1, as, as1, as2), x509certpairstoreselector));
        }
        return set;
    }

    public final Collection a(X509CertStoreSelector x509certstoreselector)
    {
        String as[] = a.I().split("\\s+");
        String as1[] = a.G().split("\\s+");
        String as2[] = a.J().split("\\s+");
        Set set = a(a(x509certstoreselector, as, as1, as2), x509certstoreselector);
        if (set.size() == 0)
        {
            set.addAll(a(a(new X509CertStoreSelector(), as, as1, as2), x509certstoreselector));
        }
        return set;
    }

    public final Collection b(X509AttributeCertStoreSelector x509attributecertstoreselector)
    {
        String as[] = a.i().split("\\s+");
        String as1[] = a.z().split("\\s+");
        String as2[] = a.j().split("\\s+");
        Set set = a(a(x509attributecertstoreselector, as, as1, as2), x509attributecertstoreselector);
        if (set.size() == 0)
        {
            set.addAll(a(a(new X509AttributeCertStoreSelector(), as, as1, as2), x509attributecertstoreselector));
        }
        return set;
    }

    public final Collection b(X509CRLStoreSelector x509crlstoreselector)
    {
        String as[] = a.g().split("\\s+");
        String as1[] = a.y().split("\\s+");
        String as2[] = a.h().split("\\s+");
        Set set = a(a(x509crlstoreselector, as, as1, as2), x509crlstoreselector);
        if (set.size() == 0)
        {
            set.addAll(a(a(new X509CRLStoreSelector(), as, as1, as2), x509crlstoreselector));
        }
        return set;
    }

    public final Collection b(X509CertStoreSelector x509certstoreselector)
    {
        String as[] = a.n().split("\\s+");
        String as1[] = a.B().split("\\s+");
        String as2[] = a.o().split("\\s+");
        Set set = a(a(x509certstoreselector, as, as1, as2), x509certstoreselector);
        if (set.size() == 0)
        {
            set.addAll(a(a(new X509CertStoreSelector(), as, as1, as2), x509certstoreselector));
        }
        return set;
    }

    public final Collection c(X509AttributeCertStoreSelector x509attributecertstoreselector)
    {
        String as[] = a.e().split("\\s+");
        String as1[] = a.x().split("\\s+");
        String as2[] = a.f().split("\\s+");
        Set set = a(a(x509attributecertstoreselector, as, as1, as2), x509attributecertstoreselector);
        if (set.size() == 0)
        {
            set.addAll(a(a(new X509AttributeCertStoreSelector(), as, as1, as2), x509attributecertstoreselector));
        }
        return set;
    }

    public final Collection c(X509CRLStoreSelector x509crlstoreselector)
    {
        String as[] = a.c().split("\\s+");
        String as1[] = a.w().split("\\s+");
        String as2[] = a.d().split("\\s+");
        Set set = a(a(x509crlstoreselector, as, as1, as2), x509crlstoreselector);
        if (set.size() == 0)
        {
            set.addAll(a(a(new X509CRLStoreSelector(), as, as1, as2), x509crlstoreselector));
        }
        return set;
    }

    public final Collection d(X509CRLStoreSelector x509crlstoreselector)
    {
        String as[] = a.t().split("\\s+");
        String as1[] = a.E().split("\\s+");
        String as2[] = a.u().split("\\s+");
        Set set = a(a(x509crlstoreselector, as, as1, as2), x509crlstoreselector);
        if (set.size() == 0)
        {
            set.addAll(a(a(new X509CRLStoreSelector(), as, as1, as2), x509crlstoreselector));
        }
        return set;
    }

    public final Collection e(X509CRLStoreSelector x509crlstoreselector)
    {
        String as[] = a.p().split("\\s+");
        String as1[] = a.C().split("\\s+");
        String as2[] = a.q().split("\\s+");
        Set set = a(a(x509crlstoreselector, as, as1, as2), x509crlstoreselector);
        if (set.size() == 0)
        {
            set.addAll(a(a(new X509CRLStoreSelector(), as, as1, as2), x509crlstoreselector));
        }
        return set;
    }

}
