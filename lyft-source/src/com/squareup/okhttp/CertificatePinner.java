// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import okio.ByteString;

public final class CertificatePinner
{

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
    {
        List list1;
        boolean flag;
        flag = false;
        list1 = (List)hostnameToPins.get(s);
        if (list1 != null) goto _L2; else goto _L1
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
        int i1 = list.size();
        for (int j = 0; j < i1; j++)
        {
            X509Certificate x509certificate = (X509Certificate)list.get(j);
            stringbuilder.append("\n    ").append(pin(x509certificate)).append(": ").append(x509certificate.getSubjectDN().getName());
        }

        stringbuilder.append("\n  Pinned certificates for ").append(s).append(":");
        i1 = list1.size();
        for (int k = ((flag) ? 1 : 0); k < i1; k++)
        {
            s = (ByteString)list1.get(k);
            stringbuilder.append("\n    sha1/").append(s.base64());
        }

        throw new SSLPeerUnverifiedException(stringbuilder.toString());
    }

    public transient void check(String s, Certificate acertificate[])
    {
        check(s, Arrays.asList(acertificate));
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
            ArrayList arraylist = new ArrayList();
            s = (List)hostnameToPins.put(s, Collections.unmodifiableList(arraylist));
            if (s != null)
            {
                arraylist.addAll(s);
            }
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                s = as[i];
                if (!s.startsWith("sha1/"))
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("pins must start with 'sha1/': ").append(s).toString());
                }
                ByteString bytestring = ByteString.decodeBase64(s.substring("sha1/".length()));
                if (bytestring == null)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("pins must be base64: ").append(s).toString());
                }
                arraylist.add(bytestring);
            }

            return this;
        }

        public CertificatePinner build()
        {
            return new CertificatePinner(this);
        }


        public Builder()
        {
        }
    }

}
