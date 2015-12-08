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
        ArrayList arraylist = new ArrayList();
        x509certificate = x509certificate.getSubjectAlternativeNames();
        if (x509certificate != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        return Collections.emptyList();
        Iterator iterator = x509certificate.iterator();
_L2:
        x509certificate = arraylist;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_120;
        }
        x509certificate = (List)iterator.next();
        if (x509certificate == null) goto _L2; else goto _L1
_L1:
        if (x509certificate.size() < 2) goto _L2; else goto _L3
_L3:
        Integer integer = (Integer)x509certificate.get(0);
        if (integer == null) goto _L2; else goto _L4
_L4:
        if (integer.intValue() != i) goto _L2; else goto _L5
_L5:
        x509certificate = (String)x509certificate.get(1);
        if (x509certificate == null) goto _L2; else goto _L6
_L6:
        arraylist.add(x509certificate);
          goto _L2
        x509certificate;
        x509certificate = Collections.emptyList();
        return x509certificate;
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
        boolean flag = false;
        List list = getSubjectAltNames(x509certificate, 2);
        int i = 0;
        for (int j = list.size(); i < j; i++)
        {
            flag = true;
            if (verifyHostName(s, (String)list.get(i)))
            {
                return true;
            }
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
        int i = 0;
        for (int j = x509certificate.size(); i < j; i++)
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
