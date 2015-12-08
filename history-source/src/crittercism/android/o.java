// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

// Referenced classes of package crittercism.android:
//            m, r, dx, e, 
//            d

public final class o extends m
{

    private static final String f[] = {
        "libcore.net.http.HttpURLConnectionImpl", "org.apache.harmony.luni.internal.net.www.protocol.http.HttpURLConnectionImpl", "org.apache.harmony.luni.internal.net.www.protocol.http.HttpURLConnection"
    };

    public o(e e, d d)
    {
        super(e, d, f);
    }

    protected final String a()
    {
        return "http";
    }

    protected final int getDefaultPort()
    {
        return 80;
    }

    protected final URLConnection openConnection(URL url)
    {
        url = (HttpURLConnection)super.openConnection(url);
        r r1;
        try
        {
            r1 = new r(url, super.c, super.d);
        }
        // Misplaced declaration of an exception variable
        catch (URL url)
        {
            throw url;
        }
        catch (Throwable throwable)
        {
            dx.a(throwable);
            return url;
        }
        return r1;
    }

    protected final URLConnection openConnection(URL url, Proxy proxy)
    {
        url = (HttpURLConnection)super.openConnection(url, proxy);
        try
        {
            proxy = new r(url, super.c, super.d);
        }
        // Misplaced declaration of an exception variable
        catch (URL url)
        {
            throw url;
        }
        // Misplaced declaration of an exception variable
        catch (Proxy proxy)
        {
            dx.a(proxy);
            return url;
        }
        return proxy;
    }

}
