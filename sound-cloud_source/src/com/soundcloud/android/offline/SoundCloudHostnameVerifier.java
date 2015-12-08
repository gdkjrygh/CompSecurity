// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.java.strings.Strings;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

class SoundCloudHostnameVerifier
    implements HostnameVerifier
{

    static final int ALT_TYPE_DNS = 2;
    private static final String PATTERN = ".*.\\.hs\\.llnwd\\.net$|.*.?sndcdn\\.com$|.*.?soundcloud\\.com$";

    SoundCloudHostnameVerifier()
    {
    }

    private List getSubjectAltNames(X509Certificate x509certificate)
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
        if (integer.intValue() != 2)
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

    private boolean verifyHostName(String s, List list)
    {
        if (list.isEmpty() || Strings.isBlank(s))
        {
            return false;
        }
        list.add(s);
        for (s = list.iterator(); s.hasNext();)
        {
            if (!((String)s.next()).toLowerCase(Locale.US).matches(".*.\\.hs\\.llnwd\\.net$|.*.?sndcdn\\.com$|.*.?soundcloud\\.com$"))
            {
                return false;
            }
        }

        return true;
    }

    public boolean verify(String s, SSLSession sslsession)
    {
        boolean flag;
        try
        {
            flag = verifyHostName(s, getSubjectAltNames((X509Certificate)sslsession.getPeerCertificates()[0]));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return flag;
    }
}
