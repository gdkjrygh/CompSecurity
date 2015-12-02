// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import java.security.cert.X509Certificate;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.http.conn.ssl.X509HostnameVerifier;

class ba
    implements X509HostnameVerifier
{

    private final Set a = new HashSet();
    private final X509HostnameVerifier b;

    public ba(String as[], X509HostnameVerifier x509hostnameverifier)
    {
        if (as != null)
        {
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                String s = as[i];
                a.add(s);
            }

        }
        b = x509hostnameverifier;
    }

    private boolean a(String s)
    {
        int i = s.indexOf('.');
        if (i != -1)
        {
            s = s.substring(i + 1);
        }
        return a.contains(s);
    }

    public final String toString()
    {
        return "SELECTED_HOSTS_VERIFIER";
    }

    public void verify(String s, X509Certificate x509certificate)
    {
        if (a(s))
        {
            b.verify(s, x509certificate);
        }
    }

    public void verify(String s, SSLSocket sslsocket)
    {
        if (a(s))
        {
            b.verify(s, sslsocket);
        }
    }

    public void verify(String s, String as[], String as1[])
    {
        if (a(s))
        {
            b.verify(s, as, as1);
        }
    }

    public boolean verify(String s, SSLSession sslsession)
    {
        if (a(s))
        {
            return b.verify(s, sslsession);
        } else
        {
            return true;
        }
    }
}
