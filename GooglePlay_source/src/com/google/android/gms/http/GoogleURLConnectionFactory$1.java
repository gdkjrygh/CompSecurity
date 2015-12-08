// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.http;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

// Referenced classes of package com.google.android.gms.http:
//            GoogleURLConnectionFactory

final class this._cls0
    implements HostnameVerifier
{

    final GoogleURLConnectionFactory this$0;

    public final boolean verify(String s, SSLSession sslsession)
    {
        HostnameVerifier hostnameverifier = HttpsURLConnection.getDefaultHostnameVerifier();
        if (hostnameverifier.verify(s, sslsession))
        {
            return true;
        }
        if ("android.clients.google.com".equalsIgnoreCase(s))
        {
            return hostnameverifier.verify("clients.google.com", sslsession);
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = GoogleURLConnectionFactory.this;
        super();
    }
}
