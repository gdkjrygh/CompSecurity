// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.WritableByteChannel;
import java.util.Map;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestFactory;
import org.chromium.net.HttpUrlRequestListener;
import org.chromium.net.UrlRequestContextConfig;
import org.chromium.net.UserAgent;
import org.chromium.net.Version;

public final class qxv extends HttpUrlRequestFactory
{

    private final Context a;
    private final String b;

    public qxv(Context context, UrlRequestContextConfig urlrequestcontextconfig)
    {
        a = context;
        urlrequestcontextconfig = urlrequestcontextconfig.a();
        context = urlrequestcontextconfig;
        if (urlrequestcontextconfig.isEmpty())
        {
            context = UserAgent.a(a);
        }
        b = context;
    }

    public final HttpUrlRequest a(String s, int i, Map map, WritableByteChannel writablebytechannel, HttpUrlRequestListener httpurlrequestlistener)
    {
        return new qxr(a, b, s, map, writablebytechannel, httpurlrequestlistener);
    }

    public final HttpUrlRequest a(String s, int i, Map map, HttpUrlRequestListener httpurlrequestlistener)
    {
        return new qxr(a, b, s, i, map, httpurlrequestlistener);
    }

    public final void a(String s, boolean flag)
    {
        try
        {
            s = new PrintWriter(s);
            s.println((new StringBuilder("NetLog is not supported by ")).append(b()).toString());
            s.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public final boolean a()
    {
        return true;
    }

    public final String b()
    {
        return (new StringBuilder("HttpUrlConnection/")).append(Version.a()).toString();
    }

    public final void c()
    {
    }
}
