// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a;

import com.c.a.a.i;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

public final class o
{

    final String a;
    final List b;
    private final List c;

    private o(String s, List list, List list1)
    {
        a = s;
        b = list;
        c = list1;
    }

    public static o a(SSLSession sslsession)
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
            list = i.a(list);
        } else
        {
            list = Collections.emptyList();
        }
        sslsession = sslsession.getLocalCertificates();
        if (sslsession != null)
        {
            sslsession = i.a(sslsession);
        } else
        {
            sslsession = Collections.emptyList();
        }
        return new o(s, list, sslsession);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof o)
        {
            if (a.equals(((o) (obj = (o)obj)).a) && b.equals(((o) (obj)).b) && c.equals(((o) (obj)).c))
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
