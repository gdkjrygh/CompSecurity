// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.chromium.net.HttpUrlRequestFactoryConfig;
import org.chromium.net.UrlRequestContextConfig;

public final class eqy
{

    public static final String a = org/chromium/net/UrlRequestContextConfig.getName();
    public static final String b = eqz.getName();
    private static eqx c;

    public static void a(olm olm1)
    {
        if (c == null)
        {
            c = new eqx();
        }
        olm1.a(org/chromium/net/UrlRequestContextConfig, (new HttpUrlRequestFactoryConfig()).a(0, -1L).a("ENABLE_SPDY", true).a("ENABLE_QUIC", false));
    }

    public static void b(olm olm1)
    {
        if (c == null)
        {
            c = new eqx();
        }
        olm1.a(eqz, new era());
    }

}
