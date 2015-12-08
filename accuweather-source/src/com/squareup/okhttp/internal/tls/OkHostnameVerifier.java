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

    private List getSubjectAltNames(X509Certificate x509certificate, int i)
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
            break MISSING_BLOCK_LABEL_123;
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

    private boolean verifyHostName(String s, X509Certificate x509certificate)
    {
        s = s.toLowerCase(Locale.US);
        boolean flag = false;
        for (Iterator iterator = getSubjectAltNames(x509certificate, 2).iterator(); iterator.hasNext();)
        {
            String s1 = (String)iterator.next();
            flag = true;
            if (verifyHostName(s, s1))
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
        for (x509certificate = getSubjectAltNames(x509certificate, 7).iterator(); x509certificate.hasNext();)
        {
            if (s.equalsIgnoreCase((String)x509certificate.next()))
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

    public boolean verifyHostName(String s, String s1)
    {
        boolean flag1 = true;
        if (s != null && s.length() != 0 && s1 != null && s1.length() != 0) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        s1 = s1.toLowerCase(Locale.US);
        if (!s1.contains("*"))
        {
            return s.equals(s1);
        }
        if (!s1.startsWith("*."))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (s.regionMatches(0, s1, 2, s1.length() - 2)) goto _L4; else goto _L3
_L3:
        int i = s1.indexOf('*');
        if (i > s1.indexOf('.'))
        {
            return false;
        }
        if (!s.regionMatches(0, s1, 0, i))
        {
            return false;
        }
        int j = s1.length() - (i + 1);
        int k = s.length() - j;
        if (s.indexOf('.', i) < k && !s.endsWith(".clients.google.com"))
        {
            return false;
        }
        flag = flag1;
        if (!s.regionMatches(k, s1, i + 1, j))
        {
            return false;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

}
