// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;

import java.io.IOException;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.scheme.HostNameResolver;
import org.apache.http.conn.ssl.SSLSocketFactory;

// Referenced classes of package com.soundcloud.android.api.legacy:
//            PublicApi

final class _cls1 extends SSLSocketFactory
{

    final SSLContext val$context;

    public final Socket createSocket()
        throws IOException
    {
        return val$context.getSocketFactory().createSocket();
    }

    public final Socket createSocket(Socket socket, String s, int i, boolean flag)
        throws IOException
    {
        return val$context.getSocketFactory().createSocket(socket, s, i, flag);
    }

    _cls1.this._cls0(KeyStore keystore, String s1, KeyStore keystore1, SecureRandom securerandom, HostNameResolver hostnameresolver, SSLContext sslcontext)
        throws KeyManagementException
    {
        val$context = sslcontext;
        super(final_s, keystore, s1, keystore1, securerandom, hostnameresolver);
        class _cls1
            implements X509TrustManager
        {

            final PublicApi._cls4 this$0;

            public void checkClientTrusted(X509Certificate ax509certificate[], String s)
                throws CertificateException
            {
                s = PublicApi.TAG;
                (new StringBuilder("trusting ")).append(Arrays.asList(ax509certificate));
            }

            public void checkServerTrusted(X509Certificate ax509certificate[], String s)
                throws CertificateException
            {
                s = PublicApi.TAG;
                (new StringBuilder("trusting ")).append(Arrays.asList(ax509certificate));
            }

            public X509Certificate[] getAcceptedIssuers()
            {
                return new X509Certificate[0];
            }

            _cls1()
            {
                this$0 = PublicApi._cls4.this;
                super();
            }
        }

        val$context.init(null, new TrustManager[] {
            new _cls1()
        }, null);
    }
}
