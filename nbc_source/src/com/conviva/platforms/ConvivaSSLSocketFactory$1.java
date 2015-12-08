// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva.platforms;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

// Referenced classes of package com.conviva.platforms:
//            ConvivaSSLSocketFactory

class this._cls0
    implements X509TrustManager
{

    final ConvivaSSLSocketFactory this$0;

    public void checkClientTrusted(X509Certificate ax509certificate[], String s)
        throws CertificateException
    {
    }

    public void checkServerTrusted(X509Certificate ax509certificate[], String s)
        throws CertificateException
    {
    }

    public X509Certificate[] getAcceptedIssuers()
    {
        return null;
    }

    ()
    {
        this$0 = ConvivaSSLSocketFactory.this;
        super();
    }
}
