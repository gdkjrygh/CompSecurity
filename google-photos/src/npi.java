// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.File;
import java.nio.channels.WritableByteChannel;
import java.util.Map;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestFactory;
import org.chromium.net.HttpUrlRequestListener;
import org.chromium.net.UrlRequestContextConfig;

public final class npi
{

    private static volatile HttpUrlRequestFactory a;
    private static File b;

    public npi()
    {
    }

    public static HttpUrlRequest a(Context context, String s, int i, Map map, WritableByteChannel writablebytechannel, HttpUrlRequestListener httpurlrequestlistener)
    {
        return c(context).a(s, i, map, writablebytechannel, httpurlrequestlistener);
    }

    public static HttpUrlRequest a(Context context, String s, int i, Map map, HttpUrlRequestListener httpurlrequestlistener)
    {
        return c(context).a(s, i, map, httpurlrequestlistener);
    }

    public static void a(Context context)
    {
        Object obj = String.valueOf(context.getCacheDir());
        obj = new File((new StringBuilder(String.valueOf(obj).length() + 12)).append(((String) (obj))).append("/cronetdebug").toString());
        b = ((File) (obj));
        ((File) (obj)).mkdirs();
        c(context).a(String.valueOf(b.getPath()).concat("/cronet_logfile"), false);
    }

    public static File b(Context context)
    {
        c(context).c();
        context = String.valueOf(context.getCacheDir());
        return new File((new StringBuilder(String.valueOf(context).length() + 27)).append(context).append("/cronetdebug/cronet_logfile").toString());
    }

    private static HttpUrlRequestFactory c(Context context)
    {
        npi;
        JVM INSTR monitorenter ;
        if (a != null) goto _L2; else goto _L1
_L1:
        npi;
        JVM INSTR monitorenter ;
        HttpUrlRequestFactory httpurlrequestfactory1;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        httpurlrequestfactory1 = (HttpUrlRequestFactory)olm.b(context, org/chromium/net/HttpUrlRequestFactory);
        HttpUrlRequestFactory httpurlrequestfactory;
        httpurlrequestfactory = httpurlrequestfactory1;
        if (httpurlrequestfactory1 != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        httpurlrequestfactory = HttpUrlRequestFactory.a(context, (UrlRequestContextConfig)olm.a(context, org/chromium/net/UrlRequestContextConfig));
        a = httpurlrequestfactory;
        npi;
        JVM INSTR monitorexit ;
_L2:
        context = a;
        npi;
        JVM INSTR monitorexit ;
        return context;
        context;
        npi;
        JVM INSTR monitorexit ;
        throw context;
        context;
        npi;
        JVM INSTR monitorexit ;
        throw context;
    }
}
