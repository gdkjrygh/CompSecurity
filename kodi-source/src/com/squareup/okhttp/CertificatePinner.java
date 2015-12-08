// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import okio.ByteString;

public final class CertificatePinner
{
    public static final class Builder
    {

        private final Map hostnameToPins = new LinkedHashMap();

        public CertificatePinner build()
        {
            return new CertificatePinner(this);
        }


        public Builder()
        {
        }
    }


    public static final CertificatePinner DEFAULT = (new Builder()).build();
    private final Map hostnameToPins;

    private CertificatePinner(Builder builder)
    {
        hostnameToPins = Util.immutableMap(builder.hostnameToPins);
    }


    public static String pin(Certificate certificate)
    {
        if (!(certificate instanceof X509Certificate))
        {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        } else
        {
            return (new StringBuilder()).append("sha1/").append(sha1((X509Certificate)certificate).base64()).toString();
        }
    }

    private static ByteString sha1(X509Certificate x509certificate)
    {
        return Util.sha1(ByteString.of(x509certificate.getPublicKey().getEncoded()));
    }

    public void check(String s, List list)
        throws SSLPeerUnverifiedException
    {
        List list1 = (List)hostnameToPins.get(s);
        if (list1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i = 0;
        int k = list.size();
label0:
        do
        {
label1:
            {
                if (i >= k)
                {
                    break label1;
                }
                if (list1.contains(sha1((X509Certificate)list.get(i))))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        StringBuilder stringbuilder = (new StringBuilder()).append("Certificate pinning failure!").append("\n  Peer certificate chain:");
        int j = 0;
        for (int l = list.size(); j < l; j++)
        {
            X509Certificate x509certificate = (X509Certificate)list.get(j);
            stringbuilder.append("\n    ").append(pin(x509certificate)).append(": ").append(x509certificate.getSubjectDN().getName());
        }

        stringbuilder.append("\n  Pinned certificates for ").append(s).append(":");
        j = 0;
        for (int i1 = list1.size(); j < i1; j++)
        {
            s = (ByteString)list1.get(j);
            stringbuilder.append("\n    sha1/").append(s.base64());
        }

        throw new SSLPeerUnverifiedException(stringbuilder.toString());
    }

}
