// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.flurry.sdk:
//            ls, jt, kk, lp, 
//            ji, kc

public class kl extends ls
{

    private static final String a = com/flurry/sdk/kl.getSimpleName();
    private String b;
    private a c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean j;
    private final jt k = new jt();
    private c l;
    private HttpURLConnection m;
    private boolean n;
    private boolean o;
    private boolean p;
    private long q;
    private long r;
    private Exception s;
    private int t;
    private final jt u = new jt();
    private final Object v = new Object();
    private boolean w;
    private int x;
    private kk y;
    private boolean z;

    public kl()
    {
        d = 10000;
        e = 15000;
        j = true;
        q = -1L;
        r = -1L;
        t = -1;
        x = 25000;
        y = new kk(this);
    }

    static HttpURLConnection a(kl kl1)
    {
        return kl1.m;
    }

    private void a(InputStream inputstream)
    {
        while (l == null || e() || inputstream == null) 
        {
            return;
        }
        l.a(this, inputstream);
    }

    private void a(OutputStream outputstream)
    {
        while (l == null || e() || outputstream == null) 
        {
            return;
        }
        l.a(this, outputstream);
    }

    private void r()
    {
        Object obj;
        Object obj2;
        Object obj3;
        obj2 = null;
        obj3 = null;
        if (o)
        {
            return;
        }
        b = lp.a(b);
        obj = new URL(b);
        m = (HttpURLConnection)((URL) (obj)).openConnection();
        m.setConnectTimeout(d);
        m.setReadTimeout(e);
        m.setRequestMethod(c.toString());
        m.setInstanceFollowRedirects(j);
        m.setDoOutput(a.c.equals(c));
        m.setDoInput(true);
        java.util.Map.Entry entry;
        for (obj = k.b().iterator(); ((Iterator) (obj)).hasNext(); m.addRequestProperty((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_186;
        Exception exception;
        exception;
        t();
        throw exception;
        boolean flag;
        if (!a.b.equals(c) && !a.c.equals(c))
        {
            m.setRequestProperty("Accept-Encoding", "");
        }
        flag = o;
        if (flag)
        {
            t();
            return;
        }
        flag = a.c.equals(c);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_286;
        }
        exception = m.getOutputStream();
        Object obj1 = new BufferedOutputStream(exception);
        a(((OutputStream) (obj1)));
        lp.a(((java.io.Closeable) (obj1)));
        lp.a(exception);
        if (p)
        {
            q = System.currentTimeMillis();
        }
        if (w)
        {
            y.a(x);
        }
        t = m.getResponseCode();
        if (p && q != -1L)
        {
            r = System.currentTimeMillis() - q;
        }
        y.a();
        for (exception = m.getHeaderFields().entrySet().iterator(); exception.hasNext();)
        {
            obj1 = (java.util.Map.Entry)exception.next();
            obj3 = ((List)((java.util.Map.Entry) (obj1)).getValue()).iterator();
            while (((Iterator) (obj3)).hasNext()) 
            {
                String s1 = (String)((Iterator) (obj3)).next();
                u.a(((java.util.Map.Entry) (obj1)).getKey(), s1);
            }
        }

          goto _L1
_L7:
        lp.a(((java.io.Closeable) (obj1)));
        lp.a(((java.io.Closeable) (obj2)));
        throw exception;
_L1:
        if (a.b.equals(c)) goto _L3; else goto _L2
_L2:
        flag = a.c.equals(c);
        if (!flag)
        {
            t();
            return;
        }
_L3:
        flag = o;
        if (flag)
        {
            t();
            return;
        }
        exception = m.getInputStream();
        obj1 = new BufferedInputStream(exception);
        a(((InputStream) (obj1)));
        lp.a(((java.io.Closeable) (obj1)));
        lp.a(exception);
        t();
        return;
        exception;
        obj1 = null;
_L5:
        lp.a(((java.io.Closeable) (obj1)));
        lp.a(((java.io.Closeable) (obj2)));
        throw exception;
        obj3;
        obj1 = null;
        obj2 = exception;
        exception = ((Exception) (obj3));
        continue; /* Loop/switch isn't completed */
        obj3;
        obj2 = exception;
        exception = ((Exception) (obj3));
        if (true) goto _L5; else goto _L4
_L4:
        obj3;
        obj1 = null;
        obj2 = exception;
        exception = ((Exception) (obj3));
        continue; /* Loop/switch isn't completed */
        obj3;
        obj2 = exception;
        exception = ((Exception) (obj3));
        continue; /* Loop/switch isn't completed */
        exception;
        obj1 = null;
        obj2 = obj3;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void s()
    {
        while (l == null || e()) 
        {
            return;
        }
        l.a(this);
    }

    private void t()
    {
        if (!n)
        {
            n = true;
            if (m != null)
            {
                m.disconnect();
                return;
            }
        }
    }

    private void u()
    {
        if (!n)
        {
            n = true;
            if (m != null)
            {
                (new _cls1()).start();
                return;
            }
        }
    }

    public void a()
    {
        String s1 = b;
        if (s1 == null)
        {
            y.a();
            s();
            return;
        }
        if (ji.a().c())
        {
            break MISSING_BLOCK_LABEL_69;
        }
        kc.a(3, a, (new StringBuilder("Network not available, aborting http request: ")).append(b).toString());
        y.a();
        s();
        return;
        if (c == null || a.a.equals(c))
        {
            c = a.b;
        }
        r();
        kc.a(4, a, (new StringBuilder("HTTP status: ")).append(t).append(" for url: ").append(b).toString());
        y.a();
        s();
        return;
        Object obj;
        obj;
        kc.a(4, a, (new StringBuilder("HTTP status: ")).append(t).append(" for url: ").append(b).toString());
        kc.a(3, a, (new StringBuilder("Exception during http request: ")).append(b).toString(), ((Throwable) (obj)));
        g = m.getReadTimeout();
        f = m.getConnectTimeout();
        s = ((Exception) (obj));
        y.a();
        s();
        return;
        obj;
        y.a();
        s();
        throw obj;
    }

    public void a(int i1)
    {
        d = i1;
    }

    public void a(a a1)
    {
        c = a1;
    }

    public void a(c c1)
    {
        l = c1;
    }

    public void a(String s1)
    {
        b = s1;
    }

    public void a(String s1, String s2)
    {
        k.a(s1, s2);
    }

    public void a(boolean flag)
    {
        w = flag;
    }

    public String b()
    {
        return b;
    }

    public List b(String s1)
    {
        if (s1 == null)
        {
            return null;
        } else
        {
            return u.a(s1);
        }
    }

    public void b(int i1)
    {
        e = i1;
    }

    public void b(boolean flag)
    {
        j = flag;
    }

    public long c()
    {
        return r;
    }

    public void c(int i1)
    {
        x = i1;
    }

    public void c(String s1)
    {
        if (u != null && u.c(s1))
        {
            u.b(s1);
        }
    }

    public void c(boolean flag)
    {
        p = flag;
    }

    public boolean d()
    {
        boolean flag1 = false;
        boolean flag;
        if (s != null && (s instanceof SocketTimeoutException))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (z || flag)
        {
            flag1 = true;
        }
        return flag1;
    }

    public boolean e()
    {
        boolean flag;
        synchronized (v)
        {
            flag = o;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean f()
    {
        return !i() && g();
    }

    public boolean g()
    {
        return t >= 200 && t < 400 && !z;
    }

    public int h()
    {
        return t;
    }

    public boolean i()
    {
        return s != null;
    }

    public Exception j()
    {
        return s;
    }

    public void k()
    {
        long l1 = System.currentTimeMillis();
        long l2 = q;
        kc.a(3, a, (new StringBuilder("Timeout (")).append(l1 - l2).append("MS) for url: ").append(b).toString());
        t = 629;
        z = true;
        s();
        l();
    }

    public void l()
    {
        kc.a(3, a, (new StringBuilder("Cancelling http request: ")).append(b).toString());
        synchronized (v)
        {
            o = true;
        }
        u();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void m()
    {
        l();
    }


    private class c
    {

        public abstract void a(kl kl1);

        public abstract void a(kl kl1, InputStream inputstream);

        public abstract void a(kl kl1, OutputStream outputstream);
    }


    private class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        private static final a g[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/flurry/sdk/kl$a, s1);
        }

        public static a[] values()
        {
            return (a[])g.clone();
        }

        public final String toString()
        {
            switch (_cls2.a[ordinal()])
            {
            default:
                return null;

            case 1: // '\001'
                return "POST";

            case 2: // '\002'
                return "PUT";

            case 3: // '\003'
                return "DELETE";

            case 4: // '\004'
                return "HEAD";

            case 5: // '\005'
                return "GET";
            }
        }

        static 
        {
            a = new a("kUnknown", 0);
            b = new a("kGet", 1);
            c = new a("kPost", 2);
            d = new a("kPut", 3);
            e = new a("kDelete", 4);
            f = new a("kHead", 5);
            g = (new a[] {
                a, b, c, d, e, f
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }

        private class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[a.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[a.d.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[a.e.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.f.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.b.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

    }


    private class _cls1 extends Thread
    {

        final kl a;

        public void run()
        {
            try
            {
                if (kl.a(a) != null)
                {
                    kl.a(a).disconnect();
                }
                return;
            }
            catch (Throwable throwable)
            {
                return;
            }
        }

        _cls1()
        {
            a = kl.this;
            super();
        }
    }

}
