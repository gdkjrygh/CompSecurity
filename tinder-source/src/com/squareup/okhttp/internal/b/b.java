// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.b;

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

// Referenced classes of package com.squareup.okhttp.internal.b:
//            a

public final class b
    implements HostnameVerifier
{

    public static final b a = new b();
    private static final Pattern b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private b()
    {
    }

    public static List a(X509Certificate x509certificate)
    {
        List list = a(x509certificate, 7);
        x509certificate = a(x509certificate, 2);
        ArrayList arraylist = new ArrayList(list.size() + x509certificate.size());
        arraylist.addAll(list);
        arraylist.addAll(x509certificate);
        return arraylist;
    }

    private static List a(X509Certificate x509certificate, int i)
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

    private static boolean a(String s, String s1)
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

    public final boolean verify(String s, SSLSession sslsession)
    {
        sslsession = (X509Certificate)sslsession.getPeerCertificates()[0];
        if (!b.matcher(s).matches()) goto _L2; else goto _L1
_L1:
        int j;
        sslsession = a(sslsession, 7);
        j = sslsession.size();
        int i = 0;
_L27:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        String s1;
        a a1;
        int k;
        if (s.equalsIgnoreCase((String)sslsession.get(i)))
        {
            return true;
        }
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        try
        {
            s1 = s.toLowerCase(Locale.US);
            s = a(sslsession, 2);
            k = s.size();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        j = 0;
        i = 0;
        if (j >= k) goto _L4; else goto _L3
_L4:
        if (i != 0) goto _L6; else goto _L5
_L5:
        a1 = new a(sslsession.getSubjectX500Principal());
        a1.c = 0;
        a1.d = 0;
        a1.e = 0;
        a1.f = 0;
        a1.g = a1.a.toCharArray();
        sslsession = a1.a();
        if (sslsession != null) goto _L8; else goto _L7
_L7:
        s = null;
_L10:
        if (s == null) goto _L6; else goto _L9
_L9:
        return a(s1, s);
_L8:
        s = "";
        if (a1.c != a1.b)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        s = null;
          goto _L10
        a1.g[a1.c];
        JVM INSTR lookupswitch 5: default 744
    //                   34: 317
    //                   35: 578
    //                   43: 290
    //                   44: 290
    //                   59: 290;
           goto _L11 _L12 _L13 _L14 _L14 _L14
_L11:
        s = a1.c();
_L14:
        if ("cn".equalsIgnoreCase(sslsession)) goto _L10; else goto _L15
_L15:
        if (a1.c < a1.b) goto _L17; else goto _L16
_L16:
        s = null;
          goto _L10
_L12:
        a1.c = a1.c + 1;
        a1.d = a1.c;
        a1.e = a1.d;
_L23:
        if (a1.c == a1.b)
        {
            throw new IllegalStateException((new StringBuilder("Unexpected end of DN: ")).append(a1.a).toString());
        }
        if (a1.g[a1.c] != '"') goto _L19; else goto _L18
_L18:
        for (a1.c = a1.c + 1; a1.c < a1.b && a1.g[a1.c] == ' '; a1.c = a1.c + 1) { }
          goto _L20
_L19:
        if (a1.g[a1.c] != '\\') goto _L22; else goto _L21
_L21:
        a1.g[a1.e] = a1.d();
_L24:
        a1.c = a1.c + 1;
        a1.e = a1.e + 1;
          goto _L23
_L22:
        a1.g[a1.e] = a1.g[a1.c];
          goto _L24
_L20:
        s = new String(a1.g, a1.d, a1.e - a1.d);
          goto _L14
_L13:
        s = a1.b();
          goto _L14
_L17:
        if (a1.g[a1.c] != ',' && a1.g[a1.c] != ';' && a1.g[a1.c] != '+')
        {
            throw new IllegalStateException((new StringBuilder("Malformed DN: ")).append(a1.a).toString());
        }
        a1.c = a1.c + 1;
        sslsession = a1.a();
        if (sslsession != null) goto _L8; else goto _L25
_L25:
        throw new IllegalStateException((new StringBuilder("Malformed DN: ")).append(a1.a).toString());
_L6:
        return false;
        if (true) goto _L27; else goto _L26
_L26:
        return false;
_L3:
        if (a(s1, (String)s.get(j)))
        {
            return true;
        }
        j++;
        i = 1;
        break MISSING_BLOCK_LABEL_98;
    }

}
