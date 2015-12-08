// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.e;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

final class f
    implements d.b
{

    f()
    {
    }

    public final HttpURLConnection a(URL url)
        throws IOException
    {
        return (HttpURLConnection)url.openConnection();
    }

    public final HttpURLConnection a(URL url, Proxy proxy)
        throws IOException
    {
        return (HttpURLConnection)url.openConnection(proxy);
    }
}
