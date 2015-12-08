// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import c.k;
import com.squareup.okhttp.internal.Util;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class CertificatePinner
{

    public static final CertificatePinner DEFAULT = (new Builder()).build();
    private final Map hostnameToPins;

    private CertificatePinner(Builder builder)
    {
        hostnameToPins = Util.immutableMap(builder.hostnameToPins);
    }

    CertificatePinner(Builder builder, _cls1 _pcls1)
    {
        this(builder);
    }

    public static String pin(Certificate certificate)
    {
        if (!(certificate instanceof X509Certificate))
        {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        } else
        {
            return (new StringBuilder()).append("sha1/").append(sha1((X509Certificate)certificate).b()).toString();
        }
    }

    private static k sha1(X509Certificate x509certificate)
    {
        return Util.sha1(k.a(x509certificate.getPublicKey().getEncoded()));
    }

    public void check(String s, List list)
    {
        Set set;
        boolean flag;
        flag = false;
        set = findMatchingPins(s);
        if (set != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int l = list.size();
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= l)
                {
                    break label1;
                }
                if (set.contains(sha1((X509Certificate)list.get(i))))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        StringBuilder stringbuilder = (new StringBuilder()).append("Certificate pinning failure!").append("\n  Peer certificate chain:");
        int i1 = list.size();
        for (int j = ((flag) ? 1 : 0); j < i1; j++)
        {
            X509Certificate x509certificate = (X509Certificate)list.get(j);
            stringbuilder.append("\n    ").append(pin(x509certificate)).append(": ").append(x509certificate.getSubjectDN().getName());
        }

        stringbuilder.append("\n  Pinned certificates for ").append(s).append(":");
        for (s = set.iterator(); s.hasNext(); stringbuilder.append("\n    sha1/").append(list.b()))
        {
            list = (k)s.next();
        }

        throw new SSLPeerUnverifiedException(stringbuilder.toString());
    }

    public transient void check(String s, Certificate acertificate[])
    {
        check(s, Arrays.asList(acertificate));
    }

    Set findMatchingPins(String s)
    {
        Set set = (Set)hostnameToPins.get(s);
        int i = s.indexOf('.');
        Object obj;
        if (i != s.lastIndexOf('.'))
        {
            s = (Set)hostnameToPins.get((new StringBuilder()).append("*.").append(s.substring(i + 1)).toString());
        } else
        {
            s = null;
        }
        if (set == null && s == null)
        {
            obj = null;
        } else
        {
            if (set != null && s != null)
            {
                obj = new LinkedHashSet();
                ((Set) (obj)).addAll(set);
                ((Set) (obj)).addAll(s);
                return ((Set) (obj));
            }
            obj = set;
            if (set == null)
            {
                return s;
            }
        }
        return ((Set) (obj));
    }


    private class Builder
    {

        private final Map hostnameToPins = new LinkedHashMap();

        public transient Builder add(String s, String as[])
        {
            if (s == null)
            {
                throw new IllegalArgumentException("hostname == null");
            }
            LinkedHashSet linkedhashset = new LinkedHashSet();
            s = (Set)hostnameToPins.put(s, Collections.unmodifiableSet(linkedhashset));
            if (s != null)
            {
                linkedhashset.addAll(s);
            }
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                s = as[i];
                if (!s.startsWith("sha1/"))
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("pins must start with 'sha1/': ").append(s).toString());
                }
                k k1 = k.b(s.substring("sha1/".length()));
                if (k1 == null)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("pins must be base64: ").append(s).toString());
                }
                linkedhashset.add(k1);
            }

            return this;
        }

        public CertificatePinner build()
        {
            return new CertificatePinner(this, null);
        }


        public Builder()
        {
        }
    }

}
