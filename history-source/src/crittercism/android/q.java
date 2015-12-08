// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

// Referenced classes of package crittercism.android:
//            m, s, dx, e, 
//            d

public final class q extends m
{

    private static final String f[] = {
        "libcore.net.http.HttpsURLConnectionImpl", "org.apache.harmony.luni.internal.net.www.protocol.https.HttpsURLConnectionImpl", "org.apache.harmony.luni.internal.net.www.protocol.https.HttpsURLConnection"
    };

    public q(e e, d d)
    {
        super(e, d, f);
    }

    protected final String a()
    {
        return "https";
    }

    protected final int getDefaultPort()
    {
        return 443;
    }

    protected final URLConnection openConnection(URL url)
    {
        url = (HttpsURLConnection)super.openConnection(url);
        s s1;
        try
        {
            s1 = new s(url, super.c, super.d);
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
        return s1;
    }

    protected final URLConnection openConnection(URL url, Proxy proxy)
    {
        url = (HttpsURLConnection)super.openConnection(url, proxy);
        try
        {
            proxy = new s(url, super.c, super.d);
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
