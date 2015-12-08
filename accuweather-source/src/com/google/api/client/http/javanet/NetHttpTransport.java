// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http.javanet;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.SecurityUtils;
import com.google.api.client.util.SslUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

// Referenced classes of package com.google.api.client.http.javanet:
//            NetHttpRequest

public final class NetHttpTransport extends HttpTransport
{
    public static final class Builder
    {

        private HostnameVerifier hostnameVerifier;
        private Proxy proxy;
        private SSLSocketFactory sslSocketFactory;

        public NetHttpTransport build()
        {
            return new NetHttpTransport(proxy, sslSocketFactory, hostnameVerifier);
        }

        public Builder doNotValidateCertificate()
            throws GeneralSecurityException
        {
            hostnameVerifier = SslUtils.trustAllHostnameVerifier();
            sslSocketFactory = SslUtils.trustAllSSLContext().getSocketFactory();
            return this;
        }

        public HostnameVerifier getHostnameVerifier()
        {
            return hostnameVerifier;
        }

        public SSLSocketFactory getSslSocketFactory()
        {
            return sslSocketFactory;
        }

        public Builder setHostnameVerifier(HostnameVerifier hostnameverifier)
        {
            hostnameVerifier = hostnameverifier;
            return this;
        }

        public Builder setProxy(Proxy proxy1)
        {
            proxy = proxy1;
            return this;
        }

        public Builder setSslSocketFactory(SSLSocketFactory sslsocketfactory)
        {
            sslSocketFactory = sslsocketfactory;
            return this;
        }

        public Builder trustCertificates(KeyStore keystore)
            throws GeneralSecurityException
        {
            SSLContext sslcontext = SslUtils.getTlsSslContext();
            SslUtils.initSslContext(sslcontext, keystore, SslUtils.getPkixTrustManagerFactory());
            return setSslSocketFactory(sslcontext.getSocketFactory());
        }

        public Builder trustCertificatesFromJavaKeyStore(InputStream inputstream, String s)
            throws GeneralSecurityException, IOException
        {
            KeyStore keystore = SecurityUtils.getJavaKeyStore();
            SecurityUtils.loadKeyStore(keystore, inputstream, s);
            return trustCertificates(keystore);
        }

        public Builder trustCertificatesFromStream(InputStream inputstream)
            throws GeneralSecurityException, IOException
        {
            KeyStore keystore = SecurityUtils.getJavaKeyStore();
            keystore.load(null, null);
            SecurityUtils.loadKeyStoreFromCertificates(keystore, SecurityUtils.getX509CertificateFactory(), inputstream);
            return trustCertificates(keystore);
        }

        public Builder()
        {
        }
    }


    private static final String SUPPORTED_METHODS[] = {
        "DELETE", "GET", "HEAD", "OPTIONS", "POST", "PUT", "TRACE"
    };
    private final HostnameVerifier hostnameVerifier;
    private final Proxy proxy;
    private final SSLSocketFactory sslSocketFactory;

    public NetHttpTransport()
    {
        this(null, null, null);
    }

    NetHttpTransport(Proxy proxy1, SSLSocketFactory sslsocketfactory, HostnameVerifier hostnameverifier)
    {
        proxy = proxy1;
        sslSocketFactory = sslsocketfactory;
        hostnameVerifier = hostnameverifier;
    }

    protected volatile LowLevelHttpRequest buildRequest(String s, String s1)
        throws IOException
    {
        return buildRequest(s, s1);
    }

    protected NetHttpRequest buildRequest(String s, String s1)
        throws IOException
    {
        Preconditions.checkArgument(supportsMethod(s), "HTTP method %s not supported", new Object[] {
            s
        });
        s1 = new URL(s1);
        if (proxy == null)
        {
            s1 = s1.openConnection();
        } else
        {
            s1 = s1.openConnection(proxy);
        }
        s1 = (HttpURLConnection)s1;
        s1.setRequestMethod(s);
        if (s1 instanceof HttpsURLConnection)
        {
            s = (HttpsURLConnection)s1;
            if (hostnameVerifier != null)
            {
                s.setHostnameVerifier(hostnameVerifier);
            }
            if (sslSocketFactory != null)
            {
                s.setSSLSocketFactory(sslSocketFactory);
            }
        }
        return new NetHttpRequest(s1);
    }

    public boolean supportsMethod(String s)
    {
        return Arrays.binarySearch(SUPPORTED_METHODS, s) >= 0;
    }

    static 
    {
        Arrays.sort(SUPPORTED_METHODS);
    }
}
