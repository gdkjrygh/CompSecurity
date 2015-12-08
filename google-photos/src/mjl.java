// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Map;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestFactory;
import org.chromium.net.HttpUrlRequestFactoryConfig;
import org.chromium.net.HttpUrlRequestListener;
import org.chromium.net.UrlRequestContextConfig;

public final class mjl
    implements mjk
{

    private static volatile HttpUrlRequestFactory a;
    private final UrlRequestContextConfig b;

    public mjl()
    {
        this((new HttpUrlRequestFactoryConfig()).a(0, -1L).a("ENABLE_SPDY", true).a("ENABLE_QUIC", false));
    }

    private mjl(UrlRequestContextConfig urlrequestcontextconfig)
    {
        b = urlrequestcontextconfig;
    }

    private static HttpUrlRequestFactory a(Context context, UrlRequestContextConfig urlrequestcontextconfig)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        mjl;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = HttpUrlRequestFactory.a(context, urlrequestcontextconfig);
        }
        mjl;
        JVM INSTR monitorexit ;
_L2:
        return a;
        context;
        mjl;
        JVM INSTR monitorexit ;
        throw context;
    }

    public final HttpUrlRequest a(Context context, String s, int i, Map map, HttpUrlRequestListener httpurlrequestlistener)
    {
        return a(context, b).a(s, i, map, httpurlrequestlistener);
    }
}
