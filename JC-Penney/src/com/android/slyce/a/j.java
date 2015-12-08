// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import java.security.cert.X509Certificate;
import java.util.Set;
import javax.net.ssl.X509TrustManager;

final class j
    implements X509TrustManager
{

    j()
    {
    }

    public void checkClientTrusted(X509Certificate ax509certificate[], String s)
    {
    }

    public void checkServerTrusted(X509Certificate ax509certificate[], String s)
    {
        int k = ax509certificate.length;
        for (int i = 0; i < k; i++)
        {
            s = ax509certificate[i];
            if (s != null && s.getCriticalExtensionOIDs() != null)
            {
                s.getCriticalExtensionOIDs().remove("2.5.29.15");
            }
        }

    }

    public X509Certificate[] getAcceptedIssuers()
    {
        return new X509Certificate[0];
    }
}
