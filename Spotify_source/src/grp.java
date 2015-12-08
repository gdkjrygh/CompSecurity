// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;

public final class grp
    implements Cloneable, URLStreamHandlerFactory
{

    private final gro a;

    public grp(gro gro1)
    {
        a = gro1;
    }

    public final HttpURLConnection a(URL url)
    {
        return a(url, a.c);
    }

    final HttpURLConnection a(URL url, Proxy proxy)
    {
        String s = url.getProtocol();
        gro gro1 = a.b();
        gro1.c = proxy;
        if (s.equals("http"))
        {
            return new guu(url, gro1);
        }
        if (s.equals("https"))
        {
            return new guv(url, gro1);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Unexpected protocol: ")).append(s).toString());
        }
    }

    public final Object clone()
    {
        return new grp(a.c());
    }

    public final URLStreamHandler createURLStreamHandler(String s)
    {
        if (!s.equals("http") && !s.equals("https"))
        {
            return null;
        } else
        {
            return new URLStreamHandler(s) {

                private String a;
                private grp b;

                protected final int getDefaultPort()
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

                protected final URLConnection openConnection(URL url)
                {
                    return b.a(url);
                }

                protected final URLConnection openConnection(URL url, Proxy proxy)
                {
                    return b.a(url, proxy);
                }

            
            {
                b = grp.this;
                a = s;
                super();
            }
            };
        }
    }
}
