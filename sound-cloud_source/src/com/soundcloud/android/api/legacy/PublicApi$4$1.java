// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import javax.net.ssl.X509TrustManager;

// Referenced classes of package com.soundcloud.android.api.legacy:
//            PublicApi

class this._cls0
    implements X509TrustManager
{

    final this._cls0 this$0;

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

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
