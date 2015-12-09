// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.e.a;
import com.fitbit.serverinteraction.b.g;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.fitbit.serverinteraction:
//            k

public class j extends k
{

    private final Map b;
    private final HttpURLConnection c;
    private final int d;
    private final String e;

    public j(HttpURLConnection httpurlconnection)
        throws IllegalArgumentException, IOException
    {
        d = httpurlconnection.getResponseCode();
        e = httpurlconnection.getResponseMessage();
        b = a(httpurlconnection);
        c = httpurlconnection;
    }

    public static j a(HttpURLConnection httpurlconnection, g g)
        throws Throwable, IllegalArgumentException, ServerCommunicationException, IOException
    {
        j j1 = new j(httpurlconnection);
        String s = httpurlconnection.getContentType();
        if (httpurlconnection.getResponseCode() < 400) goto _L2; else goto _L1
_L1:
        httpurlconnection = httpurlconnection.getErrorStream();
_L4:
        j1.a(g, ((InputStream) (httpurlconnection)), s);
        return j1;
_L2:
        try
        {
            httpurlconnection = httpurlconnection.getInputStream();
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            throw new ServerCommunicationException("Connection Error", httpurlconnection);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static Map a(HttpURLConnection httpurlconnection)
    {
        if (httpurlconnection != null && httpurlconnection.getHeaderFields() != null)
        {
            httpurlconnection = new HashMap(httpurlconnection.getHeaderFields());
            try
            {
                httpurlconnection.remove(null);
            }
            catch (UnsupportedOperationException unsupportedoperationexception)
            {
                com.fitbit.e.a.a("ParsedHttpResponse", "Unable to remove null header: ", unsupportedoperationexception, new Object[0]);
                return httpurlconnection;
            }
            return httpurlconnection;
        } else
        {
            return Collections.emptyMap();
        }
    }

    public int a()
    {
        return d;
    }

    public List a(String s)
    {
        if (b.containsKey(s))
        {
            return Collections.unmodifiableList((List)b.get(s));
        } else
        {
            return Collections.emptyList();
        }
    }

    public String b()
    {
        return e;
    }

    public String b(String s)
    {
        String s1 = null;
        if (b.containsKey(s))
        {
            s1 = (String)((List)b.get(s)).get(0);
        }
        return s1;
    }

    public Map c()
    {
        return Collections.unmodifiableMap(b);
    }

    public boolean c(String s)
    {
        return b.containsKey(s);
    }

    public long d()
    {
        return c.getLastModified();
    }

    public InputStream e()
        throws ServerCommunicationException
    {
        InputStream inputstream;
        try
        {
            inputstream = c.getInputStream();
        }
        catch (IOException ioexception)
        {
            throw new ServerCommunicationException();
        }
        return inputstream;
    }
}
