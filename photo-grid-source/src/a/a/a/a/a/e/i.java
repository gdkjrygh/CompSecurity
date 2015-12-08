// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.e;

import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

// Referenced classes of package a.a.a.a.a.e:
//            h

final class i
    implements h
{

    i()
    {
    }

    public final HttpURLConnection a(URL url)
    {
        return (HttpURLConnection)url.openConnection();
    }

    public final HttpURLConnection a(URL url, Proxy proxy)
    {
        return (HttpURLConnection)url.openConnection(proxy);
    }
}
