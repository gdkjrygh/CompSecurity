// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.Context;
import java.nio.channels.WritableByteChannel;
import java.util.Map;

// Referenced classes of package org.chromium.net:
//            HttpUrlRequestFactory, UrlRequestContextConfig, UserAgent, ChromiumUrlRequestContext, 
//            ChromiumUrlRequest, HttpUrlRequestListener, HttpUrlRequest

public class ChromiumUrlRequestFactory extends HttpUrlRequestFactory
{

    private ChromiumUrlRequestContext a;

    public ChromiumUrlRequestFactory(Context context, UrlRequestContextConfig urlrequestcontextconfig)
    {
        if (a())
        {
            String s1 = urlrequestcontextconfig.a();
            String s = s1;
            if (s1.isEmpty())
            {
                s = UserAgent.a(context);
            }
            a = new ChromiumUrlRequestContext(context, s, urlrequestcontextconfig);
        }
    }

    public final HttpUrlRequest a(String s, int i, Map map, WritableByteChannel writablebytechannel, HttpUrlRequestListener httpurlrequestlistener)
    {
        return new ChromiumUrlRequest(a, s, i, map, writablebytechannel, httpurlrequestlistener);
    }

    public final HttpUrlRequest a(String s, int i, Map map, HttpUrlRequestListener httpurlrequestlistener)
    {
        return new ChromiumUrlRequest(a, s, i, map, httpurlrequestlistener);
    }

    public final void a(String s, boolean flag)
    {
        a.a(s, false);
    }

    public final boolean a()
    {
        return android.os.Build.VERSION.SDK_INT >= 14;
    }

    public final String b()
    {
        return (new StringBuilder("Chromium/")).append(ChromiumUrlRequestContext.a()).toString();
    }

    public final void c()
    {
        a.b();
    }
}
