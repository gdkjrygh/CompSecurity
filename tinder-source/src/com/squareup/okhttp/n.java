// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.k;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

public final class n
{

    final String a;
    final List b;
    final List c;

    n(String s, List list, List list1)
    {
        a = s;
        b = list;
        c = list1;
    }

    public static n a(SSLSession sslsession)
    {
        String s = sslsession.getCipherSuite();
        if (s == null)
        {
            throw new IllegalStateException("cipherSuite == null");
        }
        List list;
        try
        {
            list = sslsession.getPeerCertificates();
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            list = null;
        }
        if (list != null)
        {
            list = k.a(list);
        } else
        {
            list = Collections.emptyList();
        }
        sslsession = sslsession.getLocalCertificates();
        if (sslsession != null)
        {
            sslsession = k.a(sslsession);
        } else
        {
            sslsession = Collections.emptyList();
        }
        return new n(s, list, sslsession);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof n)
        {
            if (a.equals(((n) (obj = (n)obj)).a) && b.equals(((n) (obj)).b) && c.equals(((n) (obj)).c))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return ((a.hashCode() + 527) * 31 + b.hashCode()) * 31 + c.hashCode();
    }
}
