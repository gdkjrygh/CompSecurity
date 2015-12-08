// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.Context;
import java.lang.reflect.Constructor;
import java.nio.channels.WritableByteChannel;
import java.util.Map;
import qxv;

// Referenced classes of package org.chromium.net:
//            UrlRequestContextConfig, HttpUrlRequestListener, HttpUrlRequest

public abstract class HttpUrlRequestFactory
{

    public HttpUrlRequestFactory()
    {
    }

    public static HttpUrlRequestFactory a(Context context, UrlRequestContextConfig urlrequestcontextconfig)
    {
        HttpUrlRequestFactory httpurlrequestfactory = null;
        if (!urlrequestcontextconfig.b())
        {
            httpurlrequestfactory = b(context, urlrequestcontextconfig);
        }
        Object obj = httpurlrequestfactory;
        if (httpurlrequestfactory == null)
        {
            obj = new qxv(context, urlrequestcontextconfig);
        }
        (new StringBuilder("Using network stack: ")).append(((HttpUrlRequestFactory) (obj)).b());
        return ((HttpUrlRequestFactory) (obj));
    }

    private static HttpUrlRequestFactory b(Context context, UrlRequestContextConfig urlrequestcontextconfig)
    {
        boolean flag;
        try
        {
            context = (HttpUrlRequestFactory)org/chromium/net/HttpUrlRequestFactory.getClassLoader().loadClass("org.chromium.net.ChromiumUrlRequestFactory").asSubclass(org/chromium/net/HttpUrlRequestFactory).getConstructor(new Class[] {
                android/content/Context, org/chromium/net/UrlRequestContextConfig
            }).newInstance(new Object[] {
                context, urlrequestcontextconfig
            });
            flag = context.a();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException("Cannot instantiate: org.chromium.net.ChromiumUrlRequestFactory", context);
        }
        if (flag)
        {
            return context;
        } else
        {
            return null;
        }
    }

    public abstract HttpUrlRequest a(String s, int i, Map map, WritableByteChannel writablebytechannel, HttpUrlRequestListener httpurlrequestlistener);

    public abstract HttpUrlRequest a(String s, int i, Map map, HttpUrlRequestListener httpurlrequestlistener);

    public abstract void a(String s, boolean flag);

    public abstract boolean a();

    public abstract String b();

    public abstract void c();
}
