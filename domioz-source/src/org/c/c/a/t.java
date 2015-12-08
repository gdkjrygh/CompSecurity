// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.a;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.c.c.f;
import org.c.c.i;

// Referenced classes of package org.c.c.a:
//            b, s, u, i

final class t extends b
{

    private static final Boolean a;
    private final HttpURLConnection b;
    private final int c;
    private OutputStream d;

    t(HttpURLConnection httpurlconnection, int j)
    {
        b = httpurlconnection;
        c = j;
        if (a.booleanValue())
        {
            System.setProperty("http.keepAlive", "false");
        }
    }

    private void a(f f1)
    {
        for (f1 = f1.entrySet().iterator(); f1.hasNext();)
        {
            Object obj = (java.util.Map.Entry)f1.next();
            String s1 = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = ((List)((java.util.Map.Entry) (obj)).getValue()).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                String s2 = (String)((Iterator) (obj)).next();
                boolean flag;
                if (a.booleanValue() && s1.equals("Connection") && s2.equals("Keep-Alive"))
                {
                    flag = false;
                } else
                {
                    flag = true;
                }
                if (flag)
                {
                    b.addRequestProperty(s1, s2);
                }
            }
        }

    }

    protected final org.c.c.a.i executeInternal(f f1)
    {
        if (d == null) goto _L2; else goto _L1
_L1:
        d.close();
_L4:
        return new s(b);
_L2:
        try
        {
            a(f1);
            b.connect();
        }
        // Misplaced declaration of an exception variable
        catch (f f1) { }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final OutputStream getBodyInternal(f f1)
    {
        if (d == null)
        {
            int j = (int)f1.getContentLength();
            if (j >= 0 && !a.booleanValue())
            {
                b.setFixedLengthStreamingMode(j);
            } else
            {
                b.setChunkedStreamingMode(c);
            }
            a(f1);
            b.connect();
            d = b.getOutputStream();
        }
        return new u(d, (byte)0);
    }

    public final i getMethod()
    {
        return i.valueOf(b.getRequestMethod());
    }

    public final URI getURI()
    {
        URI uri;
        try
        {
            uri = b.getURL().toURI();
        }
        catch (URISyntaxException urisyntaxexception)
        {
            throw new IllegalStateException((new StringBuilder("Could not get HttpURLConnection URI: ")).append(urisyntaxexception.getMessage()).toString(), urisyntaxexception);
        }
        return uri;
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT < 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = Boolean.valueOf(flag);
    }
}
