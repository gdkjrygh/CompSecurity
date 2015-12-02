// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.acra.util;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

public class TrustEveryoneTrustManager
    implements X509TrustManager
{

    public TrustEveryoneTrustManager()
    {
    }

    public void checkClientTrusted(X509Certificate ax509certificate[], String s)
    {
    }

    public void checkServerTrusted(X509Certificate ax509certificate[], String s)
    {
    }

    public X509Certificate[] getAcceptedIssuers()
    {
        return null;
    }
}
