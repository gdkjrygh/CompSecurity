// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;

// Referenced classes of package org.chromium.net:
//            X509Util

static final class er
    implements er
{

    private final X509TrustManagerExtensions a;

    public final List a(X509Certificate ax509certificate[], String s, String s1)
    {
        return a.checkServerTrusted(ax509certificate, s, s1);
    }

    public er(X509TrustManager x509trustmanager)
    {
        a = new X509TrustManagerExtensions(x509trustmanager);
    }
}
