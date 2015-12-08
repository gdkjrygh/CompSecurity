// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market;

import com.cleanmaster.ui.app.market.transport.b;
import java.io.IOException;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import org.apache.http.HttpResponse;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.protocol.BasicHttpContext;

// Referenced classes of package com.cleanmaster.ui.app.market:
//            n, k, j

public class i
{

    private k a;
    private n b;

    public i()
    {
        b = null;
    }

    static void a(i l, String s)
    {
        l.c(s);
    }

    private void c(String s)
    {
        if (b != null)
        {
            b.a(s);
        }
    }

    public k a()
    {
        return a;
    }

    public k a(String s, String s1, String s2, String s3)
    {
        k k1 = new k(this);
        k1.c(new String[] {
            s, s1, s2, s3
        });
        a = k1;
        return k1;
    }

    public HttpResponse a(String s)
    {
        Object obj = new BasicHttpParams();
        ((BasicHttpParams) (obj)).setParameter("http.useragent", com.cleanmaster.ui.app.market.transport.b.b());
        HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (obj)), 10000);
        HttpConnectionParams.setSoTimeout(((org.apache.http.params.HttpParams) (obj)), 10000);
        obj = new DefaultHttpClient(((org.apache.http.params.HttpParams) (obj)));
        ((DefaultHttpClient) (obj)).setRedirectHandler(new j(this));
        BasicHttpContext basichttpcontext = new BasicHttpContext();
        try
        {
            s = ((DefaultHttpClient) (obj)).execute(new HttpGet(s), basichttpcontext);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }

    public void a(n n1)
    {
        b = n1;
    }

    public k b(String s)
    {
        k k1 = new k(this);
        k1.c(new String[] {
            s
        });
        a = k1;
        return k1;
    }
}
