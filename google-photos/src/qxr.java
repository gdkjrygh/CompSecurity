// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.GZIPInputStream;
import org.chromium.net.ChunkedWritableByteChannel;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestListener;
import org.chromium.net.ResponseTooLargeException;

final class qxr
    implements HttpUrlRequest
{

    private static final Object A = new Object();
    private static ExecutorService z;
    private final String a;
    private final String b;
    private final Map c;
    private final WritableByteChannel d;
    private final HttpUrlRequestListener e;
    private IOException f;
    private HttpURLConnection g;
    private long h;
    private int i;
    private int j;
    private long k;
    private boolean l;
    private boolean m;
    private boolean n;
    private long o;
    private String p;
    private byte q[];
    private ReadableByteChannel r;
    private String s;
    private int t;
    private String u;
    private boolean v;
    private String w;
    private InputStream x;
    private final Object y;

    qxr(Context context, String s1, String s2, int i1, Map map, HttpUrlRequestListener httpurlrequestlistener)
    {
        this(context, s1, s2, map, ((WritableByteChannel) (new ChunkedWritableByteChannel())), httpurlrequestlistener);
    }

    qxr(Context context, String s1, String s2, Map map, WritableByteChannel writablebytechannel, HttpUrlRequestListener httpurlrequestlistener)
    {
        if (context == null)
        {
            throw new NullPointerException("Context is required");
        }
        if (s2 == null)
        {
            throw new NullPointerException("URL is required");
        } else
        {
            a = s1;
            b = s2;
            c = map;
            d = writablebytechannel;
            e = httpurlrequestlistener;
            y = new Object();
            return;
        }
    }

    static void a(qxr qxr1)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = false;
        flag = flag2;
        Object obj = qxr1.y;
        flag = flag2;
        obj;
        JVM INSTR monitorenter ;
        if (!qxr1.v)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        obj;
        JVM INSTR monitorexit ;
        Object obj1;
        Object obj2;
        Object obj3;
        if (qxr1.r != null)
        {
            try
            {
                qxr1.r.close();
            }
            catch (IOException ioexception) { }
        }
        qxr1.e.b(qxr1);
        return;
        obj;
        JVM INSTR monitorexit ;
        flag = flag2;
        qxr1.g = (HttpURLConnection)(new URL(qxr1.b)).openConnection();
        flag = flag2;
        obj = qxr1.w;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        flag = flag2;
        qxr1.g.setRequestMethod(qxr1.w);
        flag = flag2;
        qxr1.g.setConnectTimeout(3000);
        flag = flag2;
        qxr1.g.setReadTimeout(0x15f90);
        flag = flag2;
        qxr1.g.setInstanceFollowRedirects(true);
        flag = flag2;
        if (qxr1.c == null) goto _L2; else goto _L1
_L1:
        flag = flag2;
        obj = qxr1.c.entrySet().iterator();
_L3:
        flag = flag2;
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag2;
        obj2 = (java.util.Map.Entry)((Iterator) (obj)).next();
        flag = flag2;
        qxr1.g.setRequestProperty((String)((java.util.Map.Entry) (obj2)).getKey(), (String)((java.util.Map.Entry) (obj2)).getValue());
        if (true) goto _L3; else goto _L2
_L4:
        flag = flag1;
        qxr1.f = ((IOException) (obj));
        if (qxr1.r != null)
        {
            try
            {
                qxr1.r.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        if (!flag1)
        {
            qxr1.e.b(qxr1);
            return;
        } else
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj3;
        obj;
        JVM INSTR monitorexit ;
        flag = flag2;
        try
        {
            throw obj3;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally { }
          goto _L4
_L9:
        flag = true;
        if (qxr1.r != null)
        {
            try
            {
                qxr1.r.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj3) { }
        }
        if (!flag)
        {
            qxr1.e.b(qxr1);
        }
        throw obj1;
        obj1;
        flag = flag2;
        throw new IllegalArgumentException(((Throwable) (obj1)));
_L2:
        flag = flag2;
        if (qxr1.h == 0L)
        {
            break MISSING_BLOCK_LABEL_370;
        }
        flag = flag2;
        qxr1.g.setRequestProperty("Range", (new StringBuilder("bytes=")).append(qxr1.h).append("-").toString());
        flag = flag2;
        if (qxr1.g.getRequestProperty("User-Agent") != null)
        {
            break MISSING_BLOCK_LABEL_401;
        }
        flag = flag2;
        qxr1.g.setRequestProperty("User-Agent", qxr1.a);
        flag = flag2;
        if (qxr1.q != null)
        {
            break MISSING_BLOCK_LABEL_421;
        }
        flag = flag2;
        if (qxr1.r == null)
        {
            break MISSING_BLOCK_LABEL_428;
        }
        flag = flag2;
        qxr1.o();
        obj1 = null;
        flag = flag2;
        obj3 = qxr1.g.getInputStream();
        obj1 = obj3;
_L10:
        flag = flag2;
        qxr1.t = qxr1.g.getResponseCode();
        flag = flag2;
        qxr1.u = qxr1.g.getResponseMessage();
        flag = flag2;
        qxr1.s = qxr1.g.getContentType();
        flag = flag2;
        qxr1.i = qxr1.g.getContentLength();
        flag = flag2;
        if (qxr1.k <= 0L)
        {
            break MISSING_BLOCK_LABEL_571;
        }
        flag = flag2;
        if ((long)qxr1.i <= qxr1.k)
        {
            break MISSING_BLOCK_LABEL_571;
        }
        flag = flag2;
        if (!qxr1.l)
        {
            break MISSING_BLOCK_LABEL_571;
        }
        flag = flag2;
        qxr1.p();
        if (qxr1.r != null)
        {
            try
            {
                qxr1.r.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        qxr1.e.b(qxr1);
        return;
        flag = flag2;
        qxr1.e.a(qxr1);
        flag = flag2;
        if (qxr1.t / 100 != 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_615;
        }
        flag = flag2;
        obj1 = qxr1.g.getErrorStream();
        flag = flag2;
        qxr1.x = ((InputStream) (obj1));
        flag = flag2;
        if (qxr1.x == null)
        {
            break MISSING_BLOCK_LABEL_677;
        }
        flag = flag2;
        if (!"gzip".equals(qxr1.g.getContentEncoding()))
        {
            break MISSING_BLOCK_LABEL_677;
        }
        flag = flag2;
        qxr1.x = new GZIPInputStream(qxr1.x);
        flag = flag2;
        qxr1.i = -1;
        flag = flag2;
        if (qxr1.h == 0L) goto _L6; else goto _L5
_L5:
        flag = flag2;
        if (qxr1.t != 200) goto _L8; else goto _L7
_L7:
        flag = flag2;
        if (qxr1.i == -1)
        {
            break MISSING_BLOCK_LABEL_731;
        }
        flag = flag2;
        qxr1.i = (int)((long)qxr1.i - qxr1.h);
        flag = flag2;
        qxr1.n = true;
_L6:
        flag = flag2;
        obj1 = qxr1.x;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_856;
        }
        n().execute(new qxu(qxr1));
        flag = true;
_L11:
        if (qxr1.r != null)
        {
            try
            {
                qxr1.r.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        if (!flag)
        {
            qxr1.e.b(qxr1);
            return;
        }
        break MISSING_BLOCK_LABEL_54;
_L8:
        flag = flag2;
        qxr1.o = qxr1.h;
          goto _L6
        obj1;
          goto _L9
        obj1;
        flag1 = true;
          goto _L4
        obj3;
          goto _L10
        flag = false;
          goto _L11
    }

    static void b(qxr qxr1)
    {
        if (qxr1.x == null) goto _L2; else goto _L1
_L1:
        byte abyte0[] = new byte[8192];
_L8:
        if (qxr1.i()) goto _L2; else goto _L3
_L3:
        int j1 = qxr1.x.read(abyte0);
        if (j1 == -1) goto _L2; else goto _L4
_L4:
        qxr1.o = qxr1.o + (long)j1;
        if (!qxr1.n) goto _L6; else goto _L5
_L5:
        if (qxr1.o <= qxr1.h) goto _L8; else goto _L7
_L7:
        int i1;
        qxr1.n = false;
        i1 = (int)(qxr1.h - (qxr1.o - (long)j1));
        j1 -= i1;
_L12:
        if (qxr1.k == 0L || qxr1.o <= qxr1.k) goto _L10; else goto _L9
_L9:
        j1 -= (int)(qxr1.o - qxr1.k);
        if (j1 <= 0)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        qxr1.d.write(ByteBuffer.wrap(abyte0, i1, j1));
        qxr1.p();
_L2:
        Object obj;
        Object obj1;
        try
        {
            qxr1.g.disconnect();
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) { }
        try
        {
            qxr1.d.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (qxr1.f == null)
            {
                qxr1.f = ((IOException) (obj));
            }
        }
        qxr1.e.b(qxr1);
        return;
_L10:
        qxr1.d.write(ByteBuffer.wrap(abyte0, i1, j1));
          goto _L8
        obj;
        qxr1.f = ((IOException) (obj));
        try
        {
            qxr1.g.disconnect();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            qxr1.d.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (qxr1.f == null)
            {
                qxr1.f = ((IOException) (obj));
            }
        }
        break MISSING_BLOCK_LABEL_171;
        obj;
        try
        {
            qxr1.g.disconnect();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        qxr1.d.close();
_L11:
        throw obj;
        obj1;
        if (qxr1.f == null)
        {
            qxr1.f = ((IOException) (obj1));
        }
        if (true) goto _L11; else goto _L6
_L6:
        i1 = 0;
          goto _L12
    }

    private static ExecutorService n()
    {
        ExecutorService executorservice;
        synchronized (A)
        {
            if (z == null)
            {
                z = Executors.newCachedThreadPool(new qxs());
            }
            executorservice = z;
        }
        return executorservice;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void o()
    {
        OutputStream outputstream;
        OutputStream outputstream1;
        g.setDoOutput(true);
        if (!TextUtils.isEmpty(p))
        {
            g.setRequestProperty("Content-Type", p);
        }
        outputstream1 = null;
        outputstream = outputstream1;
        if (q == null) goto _L2; else goto _L1
_L1:
        outputstream = outputstream1;
        g.setFixedLengthStreamingMode(q.length);
        outputstream = outputstream1;
        outputstream1 = g.getOutputStream();
        outputstream = outputstream1;
        outputstream1.write(q);
_L4:
        if (outputstream1 != null)
        {
            outputstream1.close();
        }
        return;
_L2:
        outputstream = outputstream1;
        g.setFixedLengthStreamingMode(j);
        outputstream = outputstream1;
        OutputStream outputstream2 = g.getOutputStream();
        outputstream = outputstream2;
        byte abyte0[] = new byte[8192];
        outputstream = outputstream2;
        ByteBuffer bytebuffer = ByteBuffer.wrap(abyte0);
_L5:
        outputstream1 = outputstream2;
        outputstream = outputstream2;
        if (r.read(bytebuffer) <= 0) goto _L4; else goto _L3
_L3:
        outputstream = outputstream2;
        bytebuffer.flip();
        outputstream = outputstream2;
        outputstream2.write(abyte0, 0, bytebuffer.limit());
        outputstream = outputstream2;
        bytebuffer.clear();
          goto _L5
        Exception exception;
        exception;
        if (outputstream != null)
        {
            outputstream.close();
        }
        throw exception;
    }

    private void p()
    {
        m = true;
        h();
    }

    public final long a()
    {
        return (long)i;
    }

    public final void a(long l1)
    {
        h = l1;
    }

    public final void a(long l1, boolean flag)
    {
        k = l1;
        l = flag;
    }

    public final void a(String s1)
    {
        w = s1;
    }

    public final void a(String s1, ReadableByteChannel readablebytechannel, long l1)
    {
        if (l1 > 0x7fffffffL)
        {
            throw new IllegalArgumentException("Upload contentLength is too big.");
        } else
        {
            j = (int)l1;
            p = s1;
            r = readablebytechannel;
            q = null;
            return;
        }
    }

    public final void a(String s1, byte abyte0[])
    {
        p = s1;
        q = abyte0;
        r = null;
    }

    public final int b()
    {
        int j1 = t;
        int i1 = j1;
        if (j1 == 206)
        {
            i1 = 200;
        }
        return i1;
    }

    public final String b(String s1)
    {
        if (g == null)
        {
            throw new IllegalStateException("Response headers not available");
        }
        Map map = g.getHeaderFields();
        if (map != null)
        {
            s1 = (List)map.get(s1);
            if (s1 != null)
            {
                return TextUtils.join(", ", s1);
            }
        }
        return null;
    }

    public final String c()
    {
        return u;
    }

    public final IOException d()
    {
        if (f == null && m)
        {
            f = new ResponseTooLargeException();
        }
        return f;
    }

    public final ByteBuffer e()
    {
        return ((ChunkedWritableByteChannel)d).a();
    }

    public final byte[] f()
    {
        return ((ChunkedWritableByteChannel)d).b();
    }

    public final void g()
    {
        n().execute(new qxt(this));
    }

    public final void h()
    {
label0:
        {
            synchronized (y)
            {
                if (!v)
                {
                    break label0;
                }
            }
            return;
        }
        v = true;
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean i()
    {
        boolean flag;
        synchronized (y)
        {
            flag = v;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final String j()
    {
        return "";
    }

    public final String k()
    {
        return s;
    }

    public final Map l()
    {
        if (g == null)
        {
            throw new IllegalStateException("Response headers not available");
        } else
        {
            return g.getHeaderFields();
        }
    }

    public final String m()
    {
        return b;
    }

}
