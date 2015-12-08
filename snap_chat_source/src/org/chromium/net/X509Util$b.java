// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.X509TrustManager;

// Referenced classes of package org.chromium.net:
//            X509Util

static final class a
    implements a
{

    private final X509TrustManager a;

    public final List a(X509Certificate ax509certificate[], String s, String s1)
    {
        a.checkServerTrusted(ax509certificate, s);
        return Collections.emptyList();
    }

    public er(X509TrustManager x509trustmanager)
    {
        a = x509trustmanager;
    }
}
