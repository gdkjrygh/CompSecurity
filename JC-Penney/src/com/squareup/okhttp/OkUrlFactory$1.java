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

class val.protocol extends URLStreamHandler
{

    final OkUrlFactory this$0;
    final String val$protocol;

    protected int getDefaultPort()
    {
        if (val$protocol.equals("http"))
        {
            return 80;
        }
        if (val$protocol.equals("https"))
        {
            return 443;
        } else
        {
            throw new AssertionError();
        }
    }

    protected URLConnection openConnection(URL url)
    {
        return open(url);
    }

    protected URLConnection openConnection(URL url, Proxy proxy)
    {
        return open(url, proxy);
    }

    ()
    {
        this$0 = final_okurlfactory;
        val$protocol = String.this;
        super();
    }
}
