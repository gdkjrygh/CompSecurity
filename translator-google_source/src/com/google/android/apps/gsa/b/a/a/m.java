// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.b.a.a;

import com.google.android.apps.gsa.shared.b.a;
import com.google.android.apps.gsa.shared.exception.GsaIOException;
import com.google.android.apps.gsa.shared.io.b;
import com.google.android.apps.gsa.shared.io.c;
import com.google.android.apps.gsa.shared.io.i;
import com.google.android.apps.gsa.shared.io.k;
import com.google.android.apps.gsa.shared.io.l;
import com.google.android.apps.gsa.shared.io.o;
import com.google.android.apps.gsa.shared.util.common.L;
import com.google.common.a.d;
import com.google.common.base.p;
import com.google.common.base.q;
import com.google.common.base.s;
import com.google.common.collect.ImmutableList;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLPeerUnverifiedException;

// Referenced classes of package com.google.android.apps.gsa.b.a.a:
//            a, n, c

public abstract class m extends com.google.android.apps.gsa.b.a.a.a
{

    private boolean e;

    protected m(Executor executor, k k, s s, b b1)
    {
        super(executor, k, s, b1);
    }

    private static GsaIOException a(Exception exception, int j, c c1)
    {
        if (exception instanceof SocketTimeoutException)
        {
            String s = exception.getMessage();
            if (s != null && s.contains("failed to connect to"))
            {
                com.google.android.apps.gsa.shared.b.a.a(0x126aee9);
            }
        }
        if (exception instanceof GsaIOException)
        {
            return (GsaIOException)exception;
        }
        if (!(exception instanceof IOException)) goto _L2; else goto _L1
_L1:
        IOException ioexception;
        int k;
        ioexception = (IOException)exception;
        k = j;
        if (ioexception == null) goto _L4; else goto _L3
_L3:
        String s1;
        s1 = ioexception.getMessage();
        k = j;
        if (s1 == null) goto _L4; else goto _L5
_L5:
        if (!(ioexception instanceof ProtocolException)) goto _L7; else goto _L6
_L6:
        if (!s1.startsWith("Received HTTP_PROXY_AUTH")) goto _L9; else goto _L8
_L8:
        k = 0x50001;
_L4:
        return c1.a(k, exception);
_L9:
        if (s1.startsWith("expected") && s1.contains("bytes but received"))
        {
            k = 0x50016;
        } else
        if (s1.startsWith("unexpected end of stream"))
        {
            k = 0x50002;
        } else
        if (s1.startsWith("version != 3"))
        {
            k = 0x50003;
        } else
        if (s1.startsWith("content-length promised"))
        {
            k = 0x50004;
        } else
        if (s1.startsWith("exceeded content-length limit"))
        {
            k = 0x50005;
        } else
        if (s1.startsWith("Too many redirects:"))
        {
            k = 0x5001f;
        } else
        if (s1.startsWith("Expected a hex chunk size but was"))
        {
            k = 0x50020;
        } else
        if (s1.startsWith("Expected ':status' header not present"))
        {
            k = 0x50021;
        } else
        if (s1.startsWith("Expected ':version' header not present"))
        {
            k = 0x50022;
        } else
        if (s1.startsWith("Unexpected status line"))
        {
            k = 0x50023;
        } else
        if (s1.startsWith("This protocol does not support input"))
        {
            k = 0x50024;
        } else
        if (s1.startsWith("No response body exists"))
        {
            k = 0x50025;
        } else
        if (s1.startsWith("method does not support a request body") || s1.endsWith("does not support writing"))
        {
            k = 0x50026;
        } else
        if (s1.startsWith("cannot write request body after response has been read"))
        {
            k = 0x50027;
        } else
        {
            k = j;
            if (s1.startsWith("Expected one of "))
            {
                k = 0x50028;
            }
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (ioexception instanceof SSLPeerUnverifiedException)
        {
            k = 0x50029;
        } else
        if (ioexception instanceof UnknownHostException)
        {
            k = 0x5002a;
        } else
        if (ioexception instanceof SocketException)
        {
            k = j;
            if (s1.startsWith("No route to "))
            {
                k = 0x5002b;
            }
        } else
        if (s1.startsWith("Hostname") && s1.contains(" not verified"))
        {
            k = 0x50006;
        } else
        if (s1.startsWith("unexpected journal header"))
        {
            k = 0x50008;
        } else
        if (s1.startsWith("unexpected journal line"))
        {
            k = 0x50019;
        } else
        if (s1.startsWith("Cannot buffer entire body for content length"))
        {
            k = 0x50009;
        } else
        if (s1.startsWith("Content-Length and stream length disagree"))
        {
            k = 0x5000a;
        } else
        if (s1.startsWith("not a readable directory"))
        {
            k = 0x5000b;
        } else
        if (s1.startsWith("failed to delete file"))
        {
            k = 0x5001b;
        } else
        if (s1.startsWith("expected \"\" but was"))
        {
            k = 0x5000c;
        } else
        if (s1.startsWith("shutdown"))
        {
            k = 0x5000e;
        } else
        if (s1.startsWith("stream closed"))
        {
            k = 0x5000f;
        } else
        if (s1.startsWith("stream finished"))
        {
            k = 0x50010;
        } else
        if (s1.startsWith("stream was reset"))
        {
            k = 0x50011;
        } else
        if (s1.startsWith("TYPE_GOAWAY"))
        {
            k = 0x50012;
        } else
        if (s1.startsWith("numberOfPairs < 0"))
        {
            k = 0x50013;
        } else
        if (s1.startsWith("numberOfPairs > 1024"))
        {
            k = 0x50014;
        } else
        if (s1.startsWith("name.size == 0"))
        {
            k = 0x50015;
        } else
        if (s1.startsWith("TLS tunnel"))
        {
            k = 0x50017;
        } else
        if (s1.startsWith("Failed to authenticate with proxy"))
        {
            k = 0x50018;
        } else
        if (s1.startsWith("unexpected end of stream"))
        {
            k = 0x50002;
        } else
        if (s1.startsWith("Exception in connect"))
        {
            k = 0x5001c;
        } else
        if (s1.contains(" != "))
        {
            k = 0x5001d;
        } else
        if (s1.equals("Canceled"))
        {
            k = 0x5002c;
        } else
        if (s1.startsWith("Unexpected protocol:"))
        {
            k = 0x5001a;
        } else
        {
            k = j;
            if (s1.startsWith("Cannot retry streamed HTTP body"))
            {
                k = 0x5002d;
            }
        }
        if (true) goto _L4; else goto _L2
_L2:
        if (exception instanceof SecurityException)
        {
            return c1.a(0x40003, exception);
        }
        if ((exception instanceof NumberFormatException) || (exception instanceof UnsupportedOperationException))
        {
            return c1.a(j, exception);
        } else
        {
            L.a(5, "JavaNetHttpEngine", "Unsupported exception.", new Object[0]);
            return c1.a(0x4001d, exception);
        }
    }

    private static o a(HttpURLConnection httpurlconnection, c c1)
    {
        Object obj;
        int j;
        int k;
        try
        {
            j = httpurlconnection.getResponseCode();
            obj = httpurlconnection.getResponseMessage();
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            throw a(((Exception) (httpurlconnection)), 0x40005, c1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            String s = ((IOException) (obj)).getMessage();
            if (s != null && s.startsWith("Unexpected response code for CONNECT: "))
            {
                j = Integer.parseInt(s.substring(38));
            } else
            {
                j = 0;
            }
            if (j == 0)
            {
                throw a(((Exception) (obj)), 0x40004, c1);
            }
            obj = ((IOException) (obj)).getMessage();
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            throw a(((Exception) (httpurlconnection)), 0x5001e, c1);
        }
        if (obj == null)
        {
            obj = "";
        }
        if (obj != null && j == 504 && ((String) (obj)).equals("Unsatisfiable Request (only-if-cached)"))
        {
            k = 0x5002e;
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            throw c1.a(k, null);
        }
        c1 = httpurlconnection.getHeaderFields();
        httpurlconnection = c1;
        if (c1 == null)
        {
            httpurlconnection = Collections.emptyMap();
        }
        return new o(j, ((String) (obj)), httpurlconnection);
    }

    private static InputStream a(HttpURLConnection httpurlconnection, o o1, c c1)
    {
        try
        {
            if (l.c.apply(Integer.valueOf(o1.a)))
            {
                return httpurlconnection.getInputStream();
            }
            httpurlconnection = httpurlconnection.getErrorStream();
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            if (httpurlconnection instanceof FileNotFoundException)
            {
                com.google.android.apps.gsa.shared.b.a.a(0x1134a6f);
            }
            throw a(((Exception) (httpurlconnection)), 0x4000d, c1);
        }
        if (httpurlconnection != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        httpurlconnection = new ByteArrayInputStream(new byte[0]);
        return httpurlconnection;
        return httpurlconnection;
    }

    private static void a(l l1, HttpURLConnection httpurlconnection, c c1)
    {
        i j;
        try
        {
            httpurlconnection.setRequestMethod(l1.g);
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            int k;
            if (l1.g.equals("GET"))
            {
                k = 0x4000b;
            } else
            if (l1.g.equals("POST"))
            {
                k = 0x4000c;
            } else
            {
                L.a(5, "JavaNetHttpEngine", "Unable to set %s as a request method", new Object[] {
                    l1.g
                });
                k = 0x4000f;
            }
            throw c1.a(k, httpurlconnection);
        }
        for (c1 = l1.h.iterator(); c1.hasNext(); httpurlconnection.addRequestProperty(j.b, j.c))
        {
            j = (i)c1.next();
        }

        httpurlconnection.setInstanceFollowRedirects(l1.k);
        httpurlconnection.setUseCaches(l1.r);
        if (l1.o != -1)
        {
            httpurlconnection.setConnectTimeout(l1.o);
        }
        if (l1.p != -1)
        {
            httpurlconnection.setReadTimeout(l1.p);
        }
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (!e)
        {
            a();
            e = true;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private static void b(HttpURLConnection httpurlconnection, c c1)
    {
        try
        {
            httpurlconnection.connect();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            throw a(httpurlconnection, 0x40003, c1);
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            throw a(httpurlconnection, 0x4000e, c1);
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            throw a(httpurlconnection, 0x40002, c1);
        }
    }

    private n c(l l1, c c1)
    {
        HttpURLConnection httpurlconnection;
        p.a(true);
        httpurlconnection = null;
        HttpURLConnection httpurlconnection1 = b(l1, c1);
        httpurlconnection = httpurlconnection1;
        httpurlconnection1.setDoOutput(true);
        httpurlconnection = httpurlconnection1;
        httpurlconnection1.setChunkedStreamingMode(1024);
        httpurlconnection = httpurlconnection1;
        a(l1, httpurlconnection1, c1);
        httpurlconnection = httpurlconnection1;
        b(httpurlconnection1, c1);
        httpurlconnection = httpurlconnection1;
        l1 = httpurlconnection1.getOutputStream();
        httpurlconnection = httpurlconnection1;
        l1 = new n(httpurlconnection1, l1);
        return (n)p.a(l1);
        l1;
        httpurlconnection = httpurlconnection1;
        throw a(l1, 0x40014, c1);
        l1;
        if (httpurlconnection != null)
        {
            httpurlconnection.disconnect();
        }
        throw l1;
    }

    protected final com.google.android.apps.gsa.b.a.a.c a(l l1, byte abyte0[], c c1)
    {
        Object obj;
        OutputStream outputstream;
        Object obj1;
        outputstream = null;
        obj = null;
        obj1 = null;
        if (l1.r)
        {
            b();
        }
        HttpURLConnection httpurlconnection = b(l1, c1);
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        httpurlconnection.setDoOutput(true);
        httpurlconnection.setFixedLengthStreamingMode(abyte0.length);
        a(l1, httpurlconnection, c1);
        b(httpurlconnection, c1);
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        l1 = obj1;
        obj = outputstream;
        outputstream = httpurlconnection.getOutputStream();
        l1 = outputstream;
        obj = outputstream;
        outputstream.write(abyte0);
        l1 = outputstream;
        obj = outputstream;
        outputstream.close();
        d.a(outputstream);
        l1 = new com.google.android.apps.gsa.b.a.a.c(httpurlconnection, a(httpurlconnection, c1));
        return (com.google.android.apps.gsa.b.a.a.c)p.a(l1);
        abyte0;
        obj = l1;
        throw a(((Exception) (abyte0)), 0x40015, c1);
        l1;
        d.a(((java.io.Closeable) (obj)));
        throw l1;
        l1;
        abyte0 = httpurlconnection;
_L2:
        if (abyte0 != null)
        {
            abyte0.disconnect();
        }
        throw l1;
        l1;
        abyte0 = ((byte []) (obj));
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected final com.google.android.apps.gsa.b.a.a.c a(Object obj, c c1)
    {
        obj = (n)obj;
        c1 = a(((n) (obj)).a, c1);
        return new com.google.android.apps.gsa.b.a.a.c(((n) (obj)).a, c1);
    }

    protected final GsaIOException a(IOException ioexception, c c1)
    {
        return a(((Exception) (ioexception)), 0x40017, c1);
    }

    protected final volatile InputStream a(Object obj, o o1, c c1)
    {
        return a((HttpURLConnection)obj, o1, c1);
    }

    protected final Object a(l l1, c c1)
    {
        return c(l1, c1);
    }

    protected abstract void a();

    protected final void a(Object obj)
    {
        ((n)obj).a.disconnect();
    }

    protected final void a(Object obj, byte abyte0[], int j, boolean flag, c c1)
    {
        obj = (n)obj;
        try
        {
            ((n) (obj)).b.write(abyte0, 0, j);
            ((n) (obj)).b.flush();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw a(((Exception) (obj)), 0x40016, c1);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        ((n) (obj)).b.close();
    }

    protected abstract HttpURLConnection b(l l1, c c1);

    protected final void b(Object obj)
    {
        ((HttpURLConnection)obj).disconnect();
    }
}
