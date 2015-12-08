// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.e;

import android.os.Process;
import com.roidapp.baselib.c.x;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.roidapp.baselib.e:
//            i, e, h, j

public abstract class g
    implements Runnable
{

    protected WeakReference a;
    protected AtomicBoolean b;
    protected AtomicBoolean c;
    protected String d;
    private int e;
    private int f;
    private j g;
    private String h;
    private e i;
    private i j;
    private int k;

    public g(String s, j j1)
    {
        this(s, j1, (byte)0);
    }

    public g(String s, j j1, byte byte0)
    {
        e = 60000;
        f = 60000;
        k = -1;
        d = s;
        g = j1;
        h = null;
        if (h == null)
        {
            s = i.a;
        } else
        {
            s = i.b;
        }
        j = s;
        c = new AtomicBoolean(false);
        b = new AtomicBoolean(false);
    }

    private static void a(URLConnection urlconnection, x ax[])
    {
        if (ax != null)
        {
            int i1 = ax.length;
            for (int l = 0; l < i1; l++)
            {
                x x1 = ax[l];
                urlconnection.setRequestProperty((String)x1.a, (String)x1.b);
            }

        }
    }

    protected abstract Object a(HttpURLConnection httpurlconnection);

    protected void a()
    {
    }

    public final void a(int l)
    {
        k = l;
    }

    protected final void a(i l)
    {
        j = l;
    }

    protected void a(Iterable iterable)
    {
        if (iterable != null)
        {
            i = new e(iterable);
            j = i.b;
        }
    }

    protected final void a(String s)
    {
        h = s;
        if (s != null)
        {
            j = i.b;
        }
    }

    protected void b()
    {
    }

    protected final void c()
    {
        g = null;
    }

    protected j d()
    {
        return g;
    }

    protected x[] e()
    {
        return null;
    }

    public void f()
    {
        if (!c.get() && !b.get())
        {
            c.set(true);
            if (a != null && a.get() != null)
            {
                (new h(this)).start();
            }
        }
    }

    public final void g()
    {
        e = 20000;
    }

    public final void h()
    {
        f = 20000;
    }

    public void run()
    {
        Object obj4;
        obj4 = null;
        Process.setThreadPriority(19);
        if (c.get())
        {
            return;
        }
        if (g == null) goto _L2; else goto _L1
_L1:
        a();
        Object obj = (HttpURLConnection)(new URL(d)).openConnection();
        boolean flag;
        ((HttpURLConnection) (obj)).setConnectTimeout(e);
        ((HttpURLConnection) (obj)).setReadTimeout(f);
        ((HttpURLConnection) (obj)).setRequestMethod(j.toString());
        ((HttpURLConnection) (obj)).setDoInput(true);
        if (k != -1)
        {
            ((HttpURLConnection) (obj)).setChunkedStreamingMode(k);
        }
        if (i.b.equals(j))
        {
            ((HttpURLConnection) (obj)).setDoOutput(true);
        }
        a(((URLConnection) (obj)), e());
        if (i != null)
        {
            a(((URLConnection) (obj)), i.a());
        }
        flag = c.get();
        if (!flag) goto _L3; else goto _L2
_L2:
        b.set(true);
        return;
_L3:
        a = new WeakReference(obj);
        ((HttpURLConnection) (obj)).connect();
        Object obj1;
        Object obj3;
        obj1 = null;
        obj3 = obj;
_L18:
        if (obj1 == null)
        {
            b();
        }
        if (c.get()) goto _L2; else goto _L4
_L4:
        obj = obj1;
        if (obj3 == null) goto _L6; else goto _L5
_L5:
        if (h != null) goto _L8; else goto _L7
_L7:
        obj = obj1;
        if (i == null) goto _L6; else goto _L8
_L8:
        Object obj2 = ((HttpURLConnection) (obj3)).getOutputStream();
        obj = obj2;
        if (h == null) goto _L10; else goto _L9
_L9:
        obj = obj2;
        ((OutputStream) (obj2)).write(h.getBytes("utf-8"));
_L20:
        obj = obj1;
        if (obj2 == null) goto _L6; else goto _L11
_L11:
        ((OutputStream) (obj2)).close();
        obj = obj1;
_L6:
        if (obj != null || obj3 == null) goto _L13; else goto _L12
_L12:
        int l = ((HttpURLConnection) (obj3)).getResponseCode();
        obj1 = obj;
_L22:
        int i1;
        i1 = l;
        obj = obj1;
        if (l != 200) goto _L15; else goto _L14
_L14:
        if (c.get()) goto _L2; else goto _L16
_L16:
        try
        {
            obj2 = a(((HttpURLConnection) (obj3)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            ((Exception) (obj1)).printStackTrace();
            obj2 = obj4;
        }
        i1 = l;
        obj = obj1;
        if (obj1 != null) goto _L15; else goto _L17
_L17:
        if (!c.get())
        {
            obj = g;
            if (obj != null)
            {
                ((j) (obj)).a(obj2);
            }
        }
          goto _L2
        obj1;
        obj = null;
_L25:
        ((Exception) (obj1)).printStackTrace();
        obj3 = obj;
          goto _L18
_L10:
        obj = obj2;
        if (i == null) goto _L20; else goto _L19
_L19:
        obj = obj2;
        i.a(((OutputStream) (obj2)));
          goto _L20
        obj1;
_L24:
        obj = obj2;
        ((Exception) (obj1)).printStackTrace();
        obj = obj1;
        if (obj2 == null) goto _L6; else goto _L21
_L21:
        ((OutputStream) (obj2)).close();
        obj = obj1;
          goto _L6
        obj;
        ((IOException) (obj)).printStackTrace();
        obj = obj1;
          goto _L6
        obj;
        ((IOException) (obj)).printStackTrace();
        obj = obj1;
          goto _L6
        obj1;
        obj = null;
_L23:
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        throw obj1;
        obj1;
        ((Exception) (obj1)).printStackTrace();
        l = -1;
          goto _L22
_L13:
        i1 = -1;
_L15:
        if (!c.get())
        {
            obj2 = g;
            if (obj2 != null)
            {
                obj1 = obj;
                if (obj == null)
                {
                    obj1 = new Exception((new StringBuilder("server response code:")).append(i1).toString());
                }
                ((j) (obj2)).a(i1, ((Exception) (obj1)));
            }
        }
          goto _L2
        obj1;
          goto _L23
        obj1;
        obj2 = null;
          goto _L24
        obj1;
          goto _L25
    }
}
