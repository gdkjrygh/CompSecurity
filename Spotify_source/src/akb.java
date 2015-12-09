// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

final class akb
    implements X509TrustManager
{

    akb()
    {
    }

    public final void checkClientTrusted(X509Certificate ax509certificate[], String s)
    {
    }

    public final void checkServerTrusted(X509Certificate ax509certificate[], String s)
    {
    }

    public final X509Certificate[] getAcceptedIssuers()
    {
        return null;
    }
}
