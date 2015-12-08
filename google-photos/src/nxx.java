// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.ConditionVariable;
import android.util.Log;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLException;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestListener;

public class nxx
    implements HttpUrlRequestListener
{

    private static final onh a = new onh("debug.rpc.metrics");
    private static final AtomicInteger b = new AtomicInteger(1);
    private static final onh c = new onh("debug.rpc.use_obscura_nonce", false);
    private static volatile String d = null;
    public static final onh f = new onh("debug.rpc.dogfood");
    private String A;
    private int e;
    public final Context g;
    public final nyg h;
    public final String i;
    public final nyb j;
    nxy k;
    public int l;
    public String m;
    public Exception n;
    int o;
    public final nyc p;
    private final String q;
    private final ConditionVariable r;
    private final List s;
    private final String t;
    private String u;
    private ByteBuffer v;
    private HttpUrlRequest w;
    private int x;
    private boolean y;
    private nze z;

    public nxx(Context context, nyg nyg1, String s1, nyb nyb1)
    {
        this(context, nyg1, s1, nyb1, null, null);
    }

    private nxx(Context context, nyg nyg1, String s1, nyb nyb1, String s2, String s3)
    {
        e = b.getAndIncrement();
        r = new ConditionVariable();
        l = -1;
        o = 3;
        g = context;
        h = nyg1;
        i = s1;
        j = nyb1;
        q = null;
        t = null;
        s = olm.c(g, nxw);
        z = (nze)olm.b(g, nze);
        p = new nyc();
    }

    public static boolean a(Throwable throwable)
    {
_L6:
        if (throwable != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Throwable throwable1;
        if (!(throwable instanceof RuntimeException))
        {
            continue; /* Loop/switch isn't completed */
        }
        if ((throwable1 = throwable.getCause()) == null || throwable1 == throwable) goto _L1; else goto _L3
_L3:
        throwable = throwable1;
        continue; /* Loop/switch isn't completed */
        if (!(throwable instanceof IOException) || (throwable instanceof nye) || (throwable instanceof nxu)) goto _L1; else goto _L4
_L4:
        return true;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static boolean b(Exception exception)
    {
        while (exception == null || (exception instanceof SocketException) || (exception instanceof UnknownHostException) || (exception instanceof SSLException) || (exception instanceof nxu) && ((nxu)exception).a == 401) 
        {
            return true;
        }
        return false;
    }

    public void a(int i1, String s1, IOException ioexception)
    {
        if (i1 != 200 || ioexception == null) goto _L2; else goto _L1
_L1:
        Object obj;
        int j1;
        j1 = 0;
        obj = ioexception;
_L4:
        l = j1;
        m = s1;
        n = ((Exception) (obj));
        if (z != null && j1 == 0)
        {
            g();
            f();
        }
        return;
_L2:
        j1 = i1;
        obj = ioexception;
        if (i1 != 200)
        {
            j1 = i1;
            obj = ioexception;
            if (i1 != 0)
            {
                j1 = i1;
                obj = ioexception;
                if (ioexception == null)
                {
                    obj = new nxu(i1, s1);
                    j1 = i1;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(String s1, long l1)
    {
        p.a(s1, "requestPath must be non-empty.");
        nyc nyc1;
        boolean flag;
        if (l1 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        nyc1 = p;
        nyc1.f.put(s1, Long.valueOf(l1));
        if (l1 > nyc1.e)
        {
            nyc1.e = l1;
        }
    }

    public void a(ByteBuffer bytebuffer)
    {
        b(bytebuffer, null);
    }

    public void a(ByteBuffer bytebuffer, String s1)
    {
        b(bytebuffer, null);
    }

    public final void a(HttpUrlRequest httpurlrequest)
    {
        if (!httpurlrequest.i())
        {
            String s1 = httpurlrequest.b("Content-Length");
            if (s1 != null)
            {
                p.b = Long.parseLong(s1);
            }
        }
        A = httpurlrequest.j();
        if (k != null)
        {
            k.d = System.currentTimeMillis();
            p.d = A;
        }
    }

    public final void a(byte abyte0[], String s1)
    {
        int j1 = s.size();
        int i1 = 0;
        while (i1 < j1) 
        {
            try
            {
                abyte0 = (nxw)s.get(i1);
                if (abyte0.a(f()))
                {
                    f();
                    abyte0.c(s1);
                }
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                Log.e("HttpOperation", "Couldn't log request", abyte0);
            }
            i1++;
        }
    }

    public boolean a(Exception exception)
    {
        if (!(exception instanceof nxu)) goto _L2; else goto _L1
_L1:
        ((nxu)exception).a;
        JVM INSTR tableswitch 401 401: default 32
    //                   401 34;
           goto _L2 _L3
_L2:
        return false;
_L3:
        return true;
    }

    public void an_()
    {
    }

    public void b()
    {
    }

    public final void b(ByteBuffer bytebuffer, String s1)
    {
        int j1 = s.size();
        int i1 = 0;
        while (i1 < j1) 
        {
            try
            {
                nxw nxw1 = (nxw)s.get(i1);
                if (nxw1.b(f()))
                {
                    f();
                    bytebuffer.duplicate();
                    nxw1.d(s1);
                }
            }
            catch (Throwable throwable)
            {
                Log.e("HttpOperation", "Couldn't log response", throwable);
            }
            i1++;
        }
    }

    public final void b(HttpUrlRequest httpurlrequest)
    {
        if (httpurlrequest.i())
        {
            y = true;
        } else
        {
            u = httpurlrequest.k();
            v = httpurlrequest.e();
            a(httpurlrequest.b(), null, httpurlrequest.d());
        }
        r.open();
    }

    public boolean c(Exception exception)
    {
        return true;
    }

    public boolean c(String s1)
    {
        return false;
    }

    public final void d()
    {
        ((nxv)olm.a(g, nxv)).a(this);
    }

    public void d(String s1)
    {
        if (n != null)
        {
            String s2 = String.valueOf(f());
            String s4 = String.valueOf(n);
            Log.e(s1, (new StringBuilder(String.valueOf(s2).length() + 28 + String.valueOf(s4).length())).append("[").append(s2).append("] failed due to exception: ").append(s4).toString(), n);
        } else
        if (l() && Log.isLoggable(s1, 4))
        {
            s1 = String.valueOf(f());
            int i1 = l;
            String s3 = m;
            (new StringBuilder(String.valueOf(s1).length() + 38 + String.valueOf(s3).length())).append("[").append(s1).append("] failed due to error: ").append(i1).append(" [").append(s3).append("]");
            return;
        }
    }

    public void e()
    {
    }

    public final void e(String s1)
    {
        if (l())
        {
            d(s1);
            o();
        }
    }

    public String f()
    {
        return getClass().getSimpleName();
    }

    public String g()
    {
        return q;
    }

    public String[] h()
    {
        return (new String[] {
            f()
        });
    }

    public byte[] i()
    {
        return null;
    }

    public String j()
    {
        return null;
    }

    public String k()
    {
        return t;
    }

    public boolean l()
    {
        return l != 200 || n != null;
    }

    void m()
    {
        Object obj;
        Object obj1;
        Iterator iterator;
        an_();
        p.a();
        obj = j.a(g());
        obj1 = d;
        if (!Log.isLoggable("HttpOperation", 3))
        {
            break MISSING_BLOCK_LABEL_261;
        }
        obj1 = new StringBuilder("HTTP headers:\n");
        iterator = ((Map) (obj)).entrySet().iterator();
_L2:
        java.util.Map.Entry entry;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_261;
        }
        entry = (java.util.Map.Entry)iterator.next();
        if (!"Authorization".equals(entry.getKey()))
        {
            break; /* Loop/switch isn't completed */
        }
        ((StringBuilder) (obj1)).append("Authorization: <removed>");
_L3:
        ((StringBuilder) (obj1)).append('\n');
        if (true) goto _L2; else goto _L1
        obj;
        a(0, null, ((IOException) (obj)));
        if (!b(n) && c(n))
        {
            obj = String.valueOf(f());
            Log.e("HttpOperation", (new StringBuilder(String.valueOf(obj).length() + 23)).append("[").append(((String) (obj))).append("] Unexpected exception").toString(), n);
        }
        v = null;
        w = null;
        return;
_L1:
        ((StringBuilder) (obj1)).append((String)entry.getKey()).append(": ").append((String)entry.getValue());
          goto _L3
        obj;
        v = null;
        w = null;
        throw obj;
        this;
        JVM INSTR monitorenter ;
        if (!y)
        {
            break MISSING_BLOCK_LABEL_283;
        }
        this;
        JVM INSTR monitorexit ;
        v = null;
        w = null;
        return;
        w = npi.a(g, g(), o, ((Map) (obj)), this);
        r.close();
        this;
        JVM INSTR monitorexit ;
        byte abyte0[];
        nyc nyc1 = p;
        nyc1.c = nyc1.c + 1;
        abyte0 = i();
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_377;
        }
        w.a(k(), abyte0);
        p.a = abyte0.length;
        if (q())
        {
            a(abyte0, j());
        }
        w.g();
        r.block();
        w = null;
        if (l != 200)
        {
            break MISSING_BLOCK_LABEL_483;
        }
        if (k != null)
        {
            k.e = System.currentTimeMillis();
        }
        if (v != null && p.b < 0L)
        {
            p.b = v.capacity();
        }
        a(v);
_L4:
        v = null;
        w = null;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (!y && l != 401)
        {
            a(v, u);
        }
          goto _L4
    }

    void n()
    {
        x = x + 1;
        if (a(n) && x < 2)
        {
            try
            {
                if (a(n))
                {
                    j.a();
                }
                m();
                n();
                return;
            }
            catch (IOException ioexception)
            {
                a(0, null, ioexception);
            }
        }
        b();
    }

    public final void o()
    {
        if (l())
        {
            if (n != null)
            {
                throw new IOException(String.valueOf(f()).concat(" operation failed"), n);
            }
            if (l())
            {
                String s1 = String.valueOf(f());
                int i1 = l;
                String s2 = m;
                throw new IOException((new StringBuilder(String.valueOf(s1).length() + 40 + String.valueOf(s2).length())).append(s1).append(" operation failed, error: ").append(i1).append(" [").append(s2).append("]").toString());
            }
        }
    }

    void p()
    {
        int j1 = s.size();
        int i1 = 0;
        while (i1 < j1) 
        {
            try
            {
                nxw nxw1 = (nxw)s.get(i1);
                String s1 = h.a;
                f();
                nxw1.a(s1, k, l, A);
            }
            catch (Throwable throwable)
            {
                Log.e("HttpOperation", "Couldn't save network data", throwable);
            }
            i1++;
        }
    }

    public final boolean q()
    {
        int j1 = s.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((nxw)s.get(i1)).a(f()))
            {
                return true;
            }
        }

        return false;
    }

    public final boolean r()
    {
        int j1 = s.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((nxw)s.get(i1)).b(f()))
            {
                return true;
            }
        }

        return false;
    }

    static 
    {
        new AtomicBoolean(true);
    }
}
