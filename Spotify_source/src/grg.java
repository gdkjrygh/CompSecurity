// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

public final class grg
{

    public final String a;
    public final List b;
    public final List c;

    grg(String s, List list, List list1)
    {
        a = s;
        b = list;
        c = list1;
    }

    public static grg a(SSLSession sslsession)
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
            list = gsp.a(list);
        } else
        {
            list = Collections.emptyList();
        }
        sslsession = sslsession.getLocalCertificates();
        if (sslsession != null)
        {
            sslsession = gsp.a(sslsession);
        } else
        {
            sslsession = Collections.emptyList();
        }
        return new grg(s, list, sslsession);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof grg)
        {
            if (a.equals(((grg) (obj = (grg)obj)).a) && b.equals(((grg) (obj)).b) && c.equals(((grg) (obj)).c))
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
