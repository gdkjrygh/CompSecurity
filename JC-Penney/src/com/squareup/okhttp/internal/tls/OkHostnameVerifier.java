// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.tls;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

// Referenced classes of package com.squareup.okhttp.internal.tls:
//            DistinguishedNameParser

public final class OkHostnameVerifier
    implements HostnameVerifier
{

    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();
    private static final Pattern VERIFY_AS_IP_ADDRESS = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private OkHostnameVerifier()
    {
    }

    public static List allSubjectAltNames(X509Certificate x509certificate)
    {
        List list = getSubjectAltNames(x509certificate, 7);
        x509certificate = getSubjectAltNames(x509certificate, 2);
        ArrayList arraylist = new ArrayList(list.size() + x509certificate.size());
        arraylist.addAll(list);
        arraylist.addAll(x509certificate);
        return arraylist;
    }

    private static List getSubjectAltNames(X509Certificate x509certificate, int i)
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        Object obj;
        Integer integer;
        try
        {
            x509certificate = x509certificate.getSubjectAlternativeNames();
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate x509certificate)
        {
            return Collections.emptyList();
        }
        if (x509certificate != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        return Collections.emptyList();
        x509certificate = x509certificate.iterator();
_L2:
        do
        {
            if (!x509certificate.hasNext())
            {
                break MISSING_BLOCK_LABEL_118;
            }
            obj = (List)x509certificate.next();
        } while (obj == null);
        if (((List) (obj)).size() < 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        integer = (Integer)((List) (obj)).get(0);
        if (integer == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (integer.intValue() != i)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (String)((List) (obj)).get(1);
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        arraylist.add(obj);
        if (true) goto _L2; else goto _L1
_L1:
        return arraylist;
    }

    static boolean verifyAsIpAddress(String s)
    {
        return VERIFY_AS_IP_ADDRESS.matcher(s).matches();
    }

    private boolean verifyHostName(String s, String s1)
    {
        if (s != null && s.length() != 0 && !s.startsWith(".") && !s.endsWith("..") && s1 != null && s1.length() != 0 && !s1.startsWith(".") && !s1.endsWith(".."))
        {
            String s2 = s;
            if (!s.endsWith("."))
            {
                s2 = (new StringBuilder()).append(s).append('.').toString();
            }
            s = s1;
            if (!s1.endsWith("."))
            {
                s = (new StringBuilder()).append(s1).append('.').toString();
            }
            s = s.toLowerCase(Locale.US);
            if (!s.contains("*"))
            {
                return s2.equals(s);
            }
            if (s.startsWith("*.") && s.indexOf('*', 1) == -1 && s2.length() >= s.length() && !"*.".equals(s))
            {
                s = s.substring(1);
                if (s2.endsWith(s))
                {
                    int i = s2.length() - s.length();
                    if (i <= 0 || s2.lastIndexOf('.', i - 1) == -1)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean verifyHostName(String s, X509Certificate x509certificate)
    {
        s = s.toLowerCase(Locale.US);
        List list = getSubjectAltNames(x509certificate, 2);
        int j = list.size();
        int i = 0;
        boolean flag;
        for (flag = false; i < j; flag = true)
        {
            if (verifyHostName(s, (String)list.get(i)))
            {
                return true;
            }
            i++;
        }

        if (!flag)
        {
            x509certificate = (new DistinguishedNameParser(x509certificate.getSubjectX500Principal())).findMostSpecific("cn");
            if (x509certificate != null)
            {
                return verifyHostName(s, ((String) (x509certificate)));
            }
        }
        return false;
    }

    private boolean verifyIpAddress(String s, X509Certificate x509certificate)
    {
        x509certificate = getSubjectAltNames(x509certificate, 7);
        int j = x509certificate.size();
        for (int i = 0; i < j; i++)
        {
            if (s.equalsIgnoreCase((String)x509certificate.get(i)))
            {
                return true;
            }
        }

        return false;
    }

    public boolean verify(String s, X509Certificate x509certificate)
    {
        if (verifyAsIpAddress(s))
        {
            return verifyIpAddress(s, x509certificate);
        } else
        {
            return verifyHostName(s, x509certificate);
        }
    }

    public boolean verify(String s, SSLSession sslsession)
    {
        boolean flag;
        try
        {
            flag = verify(s, (X509Certificate)sslsession.getPeerCertificates()[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return flag;
    }

}
