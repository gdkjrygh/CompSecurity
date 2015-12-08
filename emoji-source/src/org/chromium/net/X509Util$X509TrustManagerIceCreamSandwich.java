// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.X509TrustManager;

// Referenced classes of package org.chromium.net:
//            X509Util

private static final class mTrustManager
    implements mTrustManager
{

    private final X509TrustManager mTrustManager;

    public List checkServerTrusted(X509Certificate ax509certificate[], String s, String s1)
        throws CertificateException
    {
        mTrustManager.checkServerTrusted(ax509certificate, s);
        return Collections.emptyList();
    }

    public (X509TrustManager x509trustmanager)
    {
        mTrustManager = x509trustmanager;
    }
}
