// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.Context;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

// Referenced classes of package org.chromium.net:
//            UrlRequestContextConfig, UserAgent, UrlRequestListener, UrlRequest

public abstract class UrlRequestContext
{

    public UrlRequestContext()
    {
    }

    public static UrlRequestContext a(Context context, UrlRequestContextConfig urlrequestcontextconfig)
    {
        UrlRequestContext urlrequestcontext = null;
        if (urlrequestcontextconfig.a().isEmpty())
        {
            urlrequestcontextconfig.a("USER_AGENT", UserAgent.a(context));
        }
        if (!urlrequestcontextconfig.b())
        {
            urlrequestcontext = b(context, urlrequestcontextconfig);
        }
        UrlRequestContext urlrequestcontext1 = urlrequestcontext;
        if (urlrequestcontext == null)
        {
            urlrequestcontext1 = b(context, urlrequestcontextconfig);
        }
        (new StringBuilder("Using network stack: ")).append(urlrequestcontext1.b());
        return urlrequestcontext1;
    }

    private static UrlRequestContext b(Context context, UrlRequestContextConfig urlrequestcontextconfig)
    {
        boolean flag;
        try
        {
            context = (UrlRequestContext)org/chromium/net/UrlRequestContext.getClassLoader().loadClass("org.chromium.net.CronetUrlRequestContext").asSubclass(org/chromium/net/UrlRequestContext).getConstructor(new Class[] {
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
            throw new IllegalStateException("Cannot instantiate: org.chromium.net.CronetUrlRequestContext", context);
        }
        if (flag)
        {
            return context;
        } else
        {
            return null;
        }
    }

    public abstract UrlRequest a(String s, UrlRequestListener urlrequestlistener, Executor executor);

    abstract boolean a();

    public abstract String b();
}
