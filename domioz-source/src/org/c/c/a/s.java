// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.a;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import org.c.c.f;
import org.c.c.l;
import org.c.d.m;

// Referenced classes of package org.c.c.a:
//            d

final class s extends d
{

    private final HttpURLConnection a;
    private f b;

    s(HttpURLConnection httpurlconnection)
    {
        a = httpurlconnection;
    }

    private static int a(IOException ioexception)
    {
        if ("Received authentication challenge is null".equals(ioexception.getMessage()) || "No authentication challenges found".equals(ioexception.getMessage()))
        {
            return l.UNAUTHORIZED.value();
        }
        if ("Received HTTP_PROXY_AUTH (407) code while not using proxy".equals(ioexception.getMessage()))
        {
            return l.PROXY_AUTHENTICATION_REQUIRED.value();
        } else
        {
            throw ioexception;
        }
    }

    protected final void closeInternal()
    {
        a.disconnect();
    }

    protected final InputStream getBodyInternal()
    {
        InputStream inputstream = a.getErrorStream();
        if (inputstream != null)
        {
            return inputstream;
        } else
        {
            return a.getInputStream();
        }
    }

    public final f getHeaders()
    {
        if (b == null)
        {
            b = new f();
            String s1 = a.getHeaderFieldKey(0);
            if (m.hasLength(s1))
            {
                b.add(s1, a.getHeaderField(0));
            }
            int i = 1;
            do
            {
                String s2 = a.getHeaderFieldKey(i);
                if (!m.hasLength(s2))
                {
                    break;
                }
                b.add(s2, a.getHeaderField(i));
                i++;
            } while (true);
        }
        return b;
    }

    public final int getRawStatusCode()
    {
        int i;
        try
        {
            i = a.getResponseCode();
        }
        catch (IOException ioexception)
        {
            return a(ioexception);
        }
        return i;
    }

    public final l getStatusCode()
    {
        return l.valueOf(getRawStatusCode());
    }

    public final String getStatusText()
    {
        String s1;
        try
        {
            s1 = a.getResponseMessage();
        }
        catch (IOException ioexception)
        {
            return l.valueOf(a(ioexception)).getReasonPhrase();
        }
        return s1;
    }
}
