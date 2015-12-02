// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

final class az
    implements X509TrustManager
{

    X509Certificate a[];

    az()
    {
        a = new X509Certificate[0];
    }

    public void checkClientTrusted(X509Certificate ax509certificate[], String s)
    {
    }

    public void checkServerTrusted(X509Certificate ax509certificate[], String s)
    {
    }

    public X509Certificate[] getAcceptedIssuers()
    {
        return a;
    }
}
