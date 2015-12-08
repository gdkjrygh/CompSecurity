// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

// Referenced classes of package com.squareup.okhttp:
//            OkUrlFactory

class a extends URLStreamHandler
{

    final String a;
    final OkUrlFactory b;

    protected int getDefaultPort()
    {
        if (a.equals("http"))
        {
            return 80;
        }
        if (a.equals("https"))
        {
            return 443;
        } else
        {
            throw new AssertionError();
        }
    }

    protected URLConnection openConnection(URL url)
    {
        return b.a(url);
    }

    protected URLConnection openConnection(URL url, Proxy proxy)
    {
        return b.a(url, proxy);
    }

    (OkUrlFactory okurlfactory, String s)
    {
        b = okurlfactory;
        a = s;
        super();
    }
}
