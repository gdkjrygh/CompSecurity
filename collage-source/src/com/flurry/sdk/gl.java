// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.flurry.sdk:
//            hr, fu, hp, fj, 
//            gd

public class gl extends hr
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        private static final a g[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/flurry/sdk/gl$a, s);
        }

        public static a[] values()
        {
            return (a[])g.clone();
        }

        public String toString()
        {
            static class _cls2
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

        private a(String s, int i)
        {
            super(s, i);
        }
    }

    public static class b
        implements c
    {

        public void a(gl gl1)
        {
        }

        public void a(gl gl1, InputStream inputstream)
            throws Exception
        {
        }

        public void a(gl gl1, OutputStream outputstream)
            throws Exception
        {
        }

        public b()
        {
        }
    }

    public static interface c
    {

        public abstract void a(gl gl1);

        public abstract void a(gl gl1, InputStream inputstream)
            throws Exception;

        public abstract void a(gl gl1, OutputStream outputstream)
            throws Exception;
    }


    private static final String a = com/flurry/sdk/gl.getSimpleName();
    private String b;
    private a c;
    private int d;
    private int e;
    private boolean f;
    private final fu g = new fu();
    private c j;
    private HttpURLConnection k;
    private boolean l;
    private boolean m;
    private Exception n;
    private int o;
    private final fu p = new fu();
    private final Object q = new Object();

    public gl()
    {
        d = 10000;
        e = 15000;
        f = true;
        o = -1;
    }

    static HttpURLConnection a(gl gl1)
    {
        return gl1.k;
    }

    private void a(InputStream inputstream)
        throws Exception
    {
        while (j == null || b() || inputstream == null) 
        {
            return;
        }
        j.a(this, inputstream);
    }

    private void a(OutputStream outputstream)
        throws Exception
    {
        while (j == null || b() || outputstream == null) 
        {
            return;
        }
        j.a(this, outputstream);
    }

    private void m()
        throws Exception
    {
        Object obj;
        Object obj2;
        Object obj3;
        obj2 = null;
        obj3 = null;
        if (m)
        {
            return;
        }
        b = hp.a(b);
        obj = new URL(b);
        k = (HttpURLConnection)((URL) (obj)).openConnection();
        k.setConnectTimeout(d);
        k.setReadTimeout(e);
        k.setRequestMethod(c.toString());
        k.setInstanceFollowRedirects(f);
        k.setDoOutput(a.c.equals(c));
        k.setDoInput(true);
        java.util.Map.Entry entry;
        for (obj = g.b().iterator(); ((Iterator) (obj)).hasNext(); k.addRequestProperty((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_186;
        Exception exception;
        exception;
        o();
        throw exception;
        boolean flag;
        if (!a.b.equals(c) && !a.c.equals(c))
        {
            k.setRequestProperty("Accept-Encoding", "");
        }
        flag = m;
        if (flag)
        {
            o();
            return;
        }
        flag = a.c.equals(c);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_286;
        }
        exception = k.getOutputStream();
        Object obj1 = new BufferedOutputStream(exception);
        a(((OutputStream) (obj1)));
        hp.a(((java.io.Closeable) (obj1)));
        hp.a(exception);
        o = k.getResponseCode();
        for (exception = k.getHeaderFields().entrySet().iterator(); exception.hasNext();)
        {
            obj1 = (java.util.Map.Entry)exception.next();
            obj3 = ((List)((java.util.Map.Entry) (obj1)).getValue()).iterator();
            while (((Iterator) (obj3)).hasNext()) 
            {
                String s = (String)((Iterator) (obj3)).next();
                p.a(((java.util.Map.Entry) (obj1)).getKey(), s);
            }
        }

          goto _L1
_L7:
        hp.a(((java.io.Closeable) (obj1)));
        hp.a(((java.io.Closeable) (obj2)));
        throw exception;
_L1:
        if (a.b.equals(c)) goto _L3; else goto _L2
_L2:
        flag = a.c.equals(c);
        if (!flag)
        {
            o();
            return;
        }
_L3:
        flag = m;
        if (flag)
        {
            o();
            return;
        }
        exception = k.getInputStream();
        obj1 = new BufferedInputStream(exception);
        a(((InputStream) (obj1)));
        hp.a(((java.io.Closeable) (obj1)));
        hp.a(exception);
        o();
        return;
        exception;
        obj1 = null;
_L5:
        hp.a(((java.io.Closeable) (obj2)));
        hp.a(((java.io.Closeable) (obj1)));
        throw exception;
        obj3;
        obj1 = exception;
        exception = ((Exception) (obj3));
        continue; /* Loop/switch isn't completed */
        obj3;
        obj2 = obj1;
        obj1 = exception;
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

    private void n()
    {
        while (j == null || b()) 
        {
            return;
        }
        j.a(this);
    }

    private void o()
    {
        if (!l)
        {
            l = true;
            if (k != null)
            {
                k.disconnect();
                return;
            }
        }
    }

    private void p()
    {
        if (!l)
        {
            l = true;
            if (k != null)
            {
                (new Thread() {

                    final gl a;

                    public void run()
                    {
                        try
                        {
                            if (gl.a(a) != null)
                            {
                                gl.a(a).disconnect();
                            }
                            return;
                        }
                        catch (Throwable throwable)
                        {
                            return;
                        }
                    }

            
            {
                a = gl.this;
                super();
            }
                }).start();
                return;
            }
        }
    }

    public String a()
    {
        return b;
    }

    public void a(a a1)
    {
        c = a1;
    }

    public void a(c c1)
    {
        j = c1;
    }

    public void a(String s)
    {
        b = s;
    }

    public void a(String s, String s1)
    {
        g.a(s, s1);
    }

    public void a(boolean flag)
    {
        f = flag;
    }

    public List b(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return p.a(s);
        }
    }

    public boolean b()
    {
        boolean flag;
        synchronized (q)
        {
            flag = m;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean c()
    {
        return !f() && d();
    }

    public boolean d()
    {
        return o >= 200 && o < 400;
    }

    public int e()
    {
        return o;
    }

    public boolean f()
    {
        return n != null;
    }

    public void g()
    {
        synchronized (q)
        {
            m = true;
        }
        p();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void h()
    {
        g();
    }

    public void safeRun()
    {
        String s = b;
        if (s == null)
        {
            n();
            return;
        }
        if (fj.a().c())
        {
            break MISSING_BLOCK_LABEL_58;
        }
        gd.a(3, a, (new StringBuilder()).append("Network not available, aborting http request: ").append(b).toString());
        n();
        return;
        if (c == null || a.a.equals(c))
        {
            c = a.b;
        }
        m();
        gd.a(4, a, (new StringBuilder()).append("HTTP status: ").append(o).append(" for url: ").append(b).toString());
        n();
        return;
        Object obj;
        obj;
        gd.a(4, a, (new StringBuilder()).append("HTTP status: ").append(o).append(" for url: ").append(b).toString());
        gd.a(3, a, (new StringBuilder()).append("Exception during http request: ").append(b).toString(), ((Throwable) (obj)));
        n = ((Exception) (obj));
        n();
        return;
        obj;
        n();
        throw obj;
    }

}
