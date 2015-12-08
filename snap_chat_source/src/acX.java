// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.ConditionVariable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import org.json.JSONObject;

public final class acX
    implements acx, Runnable
{

    ConditionVariable a;
    volatile long b;
    private List c;
    private URL d;
    private long e;
    private ConditionVariable f;
    private ZL g;
    private volatile boolean h;
    private final Object i;
    private int j;

    public acX(ZL zl, URL url)
    {
        this(zl, url, (byte)0);
    }

    private acX(ZL zl, URL url, byte byte0)
    {
        c = new LinkedList();
        d = null;
        e = System.currentTimeMillis();
        f = new ConditionVariable(false);
        a = new ConditionVariable(false);
        h = false;
        i = new Object();
        j = 50;
        b = 10000L;
        g = zl;
        d = url;
        j = 50;
        b = 10000L;
    }

    private long a()
    {
        long l1 = 0L;
        long l2 = b;
        long l3 = System.currentTimeMillis() - e;
        long l = l2;
        if (l3 > 0L)
        {
            l2 -= l3;
            l = l2;
            if (l2 < 0L)
            {
                l = l1;
            }
        }
        l1 = b;
        return l;
    }

    private static boolean a(HttpURLConnection httpurlconnection, JSONObject jsonobject)
    {
        boolean flag = false;
        int k;
        try
        {
            httpurlconnection.getOutputStream().write(jsonobject.toString().getBytes("UTF8"));
            k = httpurlconnection.getResponseCode();
            httpurlconnection.disconnect();
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            (new StringBuilder("Request failed for ")).append(httpurlconnection.getURL().toExternalForm());
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            (new StringBuilder("Request failed for ")).append(httpurlconnection.getURL().toExternalForm());
            return false;
        }
        if (k == 202)
        {
            flag = true;
        }
        return flag;
    }

    private HttpURLConnection b()
    {
        Object obj1 = (HttpURLConnection)d.openConnection();
        javax.net.ssl.SSLSocketFactory sslsocketfactory;
        HttpsURLConnection httpsurlconnection;
        ((HttpURLConnection) (obj1)).setConnectTimeout(2500);
        ((HttpURLConnection) (obj1)).setRequestProperty("User-Agent", "5.2.0");
        ((HttpURLConnection) (obj1)).setRequestProperty("Content-Type", "application/json");
        ((HttpURLConnection) (obj1)).setDoOutput(true);
        ((HttpURLConnection) (obj1)).setRequestMethod("POST");
        if (!(obj1 instanceof HttpsURLConnection))
        {
            break MISSING_BLOCK_LABEL_103;
        }
        httpsurlconnection = (HttpsURLConnection)obj1;
        SSLContext sslcontext = SSLContext.getInstance("TLS");
        sslcontext.init(null, null, null);
        sslsocketfactory = sslcontext.getSocketFactory();
        Object obj;
        if (sslsocketfactory == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        obj = sslsocketfactory;
        if (sslsocketfactory instanceof afd)
        {
            obj = ((afd)sslsocketfactory).a;
        }
        httpsurlconnection.setSSLSocketFactory(((javax.net.ssl.SSLSocketFactory) (obj)));
        return ((HttpURLConnection) (obj1));
        obj1;
        obj = null;
_L2:
        (new StringBuilder("Failed to instantiate URLConnection to APM server: ")).append(((IOException) (obj1)).getMessage());
        return ((HttpURLConnection) (obj));
        GeneralSecurityException generalsecurityexception;
        generalsecurityexception;
        (new StringBuilder("Failed to instantiate URLConnection to APM server: ")).append(generalsecurityexception.getMessage());
        return null;
        IOException ioexception;
        ioexception;
        generalsecurityexception = ((GeneralSecurityException) (obj1));
        obj1 = ioexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private boolean c()
    {
        return !h && c.size() < j;
    }

    public final void a(abb abb1)
    {
        boolean flag;
label0:
        {
            flag = false;
            if (!c())
            {
                return;
            }
            synchronized (i)
            {
                if (c())
                {
                    break label0;
                }
            }
            return;
        }
        String s;
        c.add(abb1);
        s = d.getHost();
        if (!abb1.a().contains(s)) goto _L2; else goto _L1
_L1:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        f.open();
        obj;
        JVM INSTR monitorexit ;
        return;
_L2:
        abb1 = abb1.h;
        if (abb1 == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        boolean flag1 = abb1.toLowerCase().equals("connect");
        if (flag1)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = true;
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final void run()
    {
_L2:
        boolean flag;
        if (h)
        {
            break; /* Loop/switch isn't completed */
        }
        a.block();
        f.block();
        flag = h;
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            if (a() > 0L)
            {
                Thread.sleep(a());
            }
        }
        catch (InterruptedException interruptedexception) { }
        e = System.currentTimeMillis();
        obj = b();
        if (obj == null)
        {
            List list;
            try
            {
                h = true;
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                (new StringBuilder("Exited APM send task due to: \n")).append(obj);
            }
            break MISSING_BLOCK_LABEL_137;
        }
        synchronized (i)
        {
            list = c;
            c = new LinkedList();
            f.close();
        }
        obj1 = ZA.a(g, list);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        h = true;
        return;
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        a(((HttpURLConnection) (obj)), ((ZA) (obj1)).a);
        if (true) goto _L2; else goto _L1
_L1:
    }
}
