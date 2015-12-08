// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a;

import c.d;
import com.c.a.a.i;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class f
{
    public static final class a
    {

        final Map a = new LinkedHashMap();

        public a()
        {
        }
    }


    public static final f a = new f(new a(), (byte)0);
    private final Map b;

    private f(a a1)
    {
        b = i.a(a1.a);
    }

    private f(a a1, byte byte0)
    {
        this(a1);
    }

    private static c.i a(X509Certificate x509certificate)
    {
        return i.a(c.i.a(x509certificate.getPublicKey().getEncoded()));
    }

    public static String a(Certificate certificate)
    {
        if (!(certificate instanceof X509Certificate))
        {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        } else
        {
            return (new StringBuilder("sha1/")).append(d.a(a((X509Certificate)certificate).c)).toString();
        }
    }

    public final void a(String s, List list)
        throws SSLPeerUnverifiedException
    {
        List list1;
        boolean flag;
        flag = false;
        list1 = (List)b.get(s);
        if (list1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i1 = list.size();
        int j = 0;
label0:
        do
        {
label1:
            {
                if (j >= i1)
                {
                    break label1;
                }
                if (list1.contains(a((X509Certificate)list.get(j))))
                {
                    break label0;
                }
                j++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        StringBuilder stringbuilder = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int j1 = list.size();
        for (int k = 0; k < j1; k++)
        {
            X509Certificate x509certificate = (X509Certificate)list.get(k);
            stringbuilder.append("\n    ").append(a(((Certificate) (x509certificate)))).append(": ").append(x509certificate.getSubjectDN().getName());
        }

        stringbuilder.append("\n  Pinned certificates for ").append(s).append(":");
        j1 = list1.size();
        for (int l = ((flag) ? 1 : 0); l < j1; l++)
        {
            s = (c.i)list1.get(l);
            stringbuilder.append("\n    sha1/").append(d.a(((c.i) (s)).c));
        }

        throw new SSLPeerUnverifiedException(stringbuilder.toString());
    }

}
