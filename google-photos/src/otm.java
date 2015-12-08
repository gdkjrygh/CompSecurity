// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.Log;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.net.ResponseInfo;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequestException;
import org.chromium.net.UrlRequestListener;

final class otm extends UrlRequestListener
{

    final CountDownLatch a = new CountDownLatch(1);
    jmx b;
    long c;
    private final jms d;
    private UrlRequest e;
    private boolean f;
    private volatile BlockingQueue g;
    private ByteBuffer h;
    private k i;
    private AtomicLong j;
    private otl k;

    otm(otl otl1, jms jms1)
    {
        k = otl1;
        super();
        d = (jms)p.a(jms1);
    }

    static int a(otm otm1, byte abyte0[], int l, int i1)
    {
        return otm1.a(abyte0, l, i1);
    }

    private int a(byte abyte0[], int l, int i1)
    {
        p.a("InnerUrlRequestListener.read");
        if (j == null) goto _L2; else goto _L1
_L1:
        long l2 = j.get();
        if (l2 <= 0L)
        {
            p.b();
            return -1;
        }
          goto _L2
_L4:
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        if (h != null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        boolean flag;
        if (j1 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = a(flag);
        if (h == null)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        j2 = Math.min(h.remaining(), i1);
        h.get(abyte0, l, j2);
        k1 = l + j2;
        l1 = i1 - j2;
        i2 = j1 + j2;
        if (j != null)
        {
            j.addAndGet(-j2);
        }
        j1 = i2;
        l = k1;
        i1 = l1;
        if (h.hasRemaining())
        {
            continue; /* Loop/switch isn't completed */
        }
        h.clear();
        if (otl.c(k) != null)
        {
            otl.c(k).offer(h);
        }
        h = null;
        j1 = i2;
        l = k1;
        i1 = l1;
        continue; /* Loop/switch isn't completed */
        abyte0;
        p.b();
        throw abyte0;
        p.b();
        return j1;
_L2:
        j1 = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static long a(Map map)
    {
        Object obj = (List)map.get("Content-Length");
        if (obj == null || ((List) (obj)).size() <= 0 || TextUtils.isEmpty((CharSequence)((List) (obj)).get(0))) goto _L2; else goto _L1
_L1:
        long l = Long.parseLong((String)((List) (obj)).get(0));
_L13:
        long l1;
        map = (List)map.get("Content-Range");
        l1 = l;
        if (map == null) goto _L4; else goto _L3
_L3:
        l1 = l;
        if (map.size() <= 0) goto _L4; else goto _L5
_L5:
        l1 = l;
        if (TextUtils.isEmpty((CharSequence)map.get(0))) goto _L4; else goto _L6
_L6:
        Matcher matcher;
        matcher = otl.b().matcher((CharSequence)map.get(0));
        l1 = l;
        if (!matcher.find()) goto _L4; else goto _L7
_L7:
        long l2;
        l1 = Long.parseLong(matcher.group(2));
        l2 = Long.parseLong(matcher.group(1));
        l2 = (l1 - l2) + 1L;
        if (l >= 0L) goto _L9; else goto _L8
_L8:
        l1 = l2;
_L4:
        return l1;
        NumberFormatException numberformatexception1;
        numberformatexception1;
        if (Log.isLoggable("CronetDataSource", 6))
        {
            String s = String.valueOf(obj);
            Log.e("CronetDataSource", (new StringBuilder(String.valueOf(s).length() + 28)).append("Unexpected Content-Length [").append(s).append("]").toString());
        }
_L2:
        l = -1L;
        continue; /* Loop/switch isn't completed */
_L9:
        l1 = l;
        if (l == l2) goto _L4; else goto _L10
_L10:
        if (Log.isLoggable("CronetDataSource", 5))
        {
            obj = String.valueOf(obj);
            String s1 = String.valueOf(map);
            Log.w("CronetDataSource", (new StringBuilder(String.valueOf(obj).length() + 26 + String.valueOf(s1).length())).append("Inconsistent headers [").append(((String) (obj))).append("] [").append(s1).append("]").toString());
        }
        l1 = Math.max(l, l2);
        return l1;
        NumberFormatException numberformatexception;
        numberformatexception;
        l1 = l;
        if (!Log.isLoggable("CronetDataSource", 6)) goto _L4; else goto _L11
_L11:
        map = String.valueOf(map);
        Log.e("CronetDataSource", (new StringBuilder(String.valueOf(map).length() + 27)).append("Unexpected Content-Range [").append(map).append("]").toString());
        return l;
        if (true) goto _L13; else goto _L12
_L12:
    }

    private ByteBuffer a(boolean flag)
    {
        Object obj;
        Exception exception;
        exception = null;
        obj = null;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        Object obj1 = exception;
        if (a()) goto _L4; else goto _L3
_L3:
        obj1 = exception;
        throw new jmx("Connection closed", d);
_L8:
        obj1 = obj;
        this;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
_L5:
        if (obj == null)
        {
            throw new jmx(new SocketTimeoutException("Cronet read timeout."), d);
        } else
        {
            return ((ByteBuffer) (obj));
        }
_L4:
        obj1 = exception;
        obj = (ByteBuffer)g.poll(otl.d(k), TimeUnit.MILLISECONDS);
        this;
        JVM INSTR monitorexit ;
          goto _L5
        exception;
        continue; /* Loop/switch isn't completed */
_L2:
        this;
        JVM INSTR monitorenter ;
        if (!a())
        {
            break MISSING_BLOCK_LABEL_139;
        }
        obj = (ByteBuffer)g.poll();
_L6:
        this;
        JVM INSTR monitorexit ;
        return ((ByteBuffer) (obj));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj = null;
          goto _L6
        exception;
        obj = obj1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void a(jmx jmx1)
    {
        b = jmx1;
        a.countDown();
    }

    static void a(otm otm1)
    {
        otm1.b();
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        p.a("InnerUrlRequestListener.close");
        if (a())
        {
            e.c();
            g.clear();
            g = null;
        }
        p.b();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        p.b();
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final void a(UrlRequest urlrequest)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (f)
        {
            flag = false;
        }
        p.b(flag, "must not initialize twice");
        f = true;
        e = (UrlRequest)p.a(urlrequest);
        g = new LinkedBlockingQueue(24);
        this;
        JVM INSTR monitorexit ;
        return;
        urlrequest;
        throw urlrequest;
    }

    public final void a(UrlRequest urlrequest, ByteBuffer bytebuffer)
    {
        p.a("InnerUrlRequestListener.onDataReceived");
        if (g.offer(bytebuffer))
        {
            break MISSING_BLOCK_LABEL_54;
        }
        if (Log.isLoggable("CronetDataSource", 5))
        {
            Log.w("CronetDataSource", "Buffer queue is full");
        }
        g.offer(bytebuffer, 10L, TimeUnit.SECONDS);
_L1:
        bytebuffer = null;
        ByteBuffer bytebuffer1;
        try
        {
            if (otl.c(k) != null)
            {
                bytebuffer = (ByteBuffer)otl.c(k).poll();
            }
        }
        // Misplaced declaration of an exception variable
        catch (UrlRequest urlrequest)
        {
            p.b();
            return;
        }
        finally
        {
            p.b();
        }
        bytebuffer1 = bytebuffer;
        if (bytebuffer != null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        bytebuffer1 = ByteBuffer.allocateDirect(32768);
        if (bytebuffer1 == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        urlrequest.a(bytebuffer1);
        p.b();
        return;
        bytebuffer;
        if (Log.isLoggable("CronetDataSource", 6))
        {
            Log.e("CronetDataSource", "Buffer queue being read from too slowly");
        }
        b();
          goto _L1
        throw urlrequest;
    }

    public final void a(UrlRequest urlrequest, ResponseInfo responseinfo)
    {
        p.a("InnerUrlRequestListener.onResponseStarted");
        int l = responseinfo.b();
        if (l >= 200 && l <= 299)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        String s;
        try
        {
            throw new jmz(l, responseinfo.c(), d);
        }
        // Misplaced declaration of an exception variable
        catch (UrlRequest urlrequest) { }
        finally
        {
            p.b();
        }
        b();
        a(((jmx) (urlrequest)));
        p.b();
        return;
        s = (String)((List)responseinfo.c().get("Content-Type")).get(0);
        if (otl.b(k) != null && !otl.b(k).a(s))
        {
            throw new jmy(s, d);
        }
        break MISSING_BLOCK_LABEL_150;
        urlrequest;
        throw new jmy(null, d);
        throw urlrequest;
        long l1 = a(responseinfo.c());
        if (d.d == -1L || l1 == -1L)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        if (d.d != l1)
        {
            throw new jmx("Content length did not match requested length", d);
        }
        if (l1 <= 0L)
        {
            break MISSING_BLOCK_LABEL_232;
        }
        j = new AtomicLong(l1);
        i = otl.a(k);
        c = l1;
        a.countDown();
        urlrequest.a(ByteBuffer.allocateDirect(32768));
        p.b();
        return;
    }

    public final void a(UrlRequest urlrequest, ResponseInfo responseinfo, String s)
    {
        if (d.b != null)
        {
            int l = responseinfo.b();
            if (l == 307 || l == 308)
            {
                b();
                b = new otq("POST request redirected with 307 or 308 response code.", d);
                a.countDown();
                return;
            }
        }
        urlrequest.b();
    }

    public final void a(UrlRequest urlrequest, UrlRequestException urlrequestexception)
    {
        b();
        a(new jmx(urlrequestexception, d));
    }

    final boolean a()
    {
        return g != null;
    }
}
