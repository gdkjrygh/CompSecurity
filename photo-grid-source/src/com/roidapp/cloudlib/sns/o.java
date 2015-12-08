// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;

import com.roidapp.baselib.d.a;
import com.roidapp.baselib.e.f;
import com.roidapp.baselib.e.g;
import com.roidapp.baselib.e.i;
import com.roidapp.baselib.e.j;
import com.roidapp.baselib.e.k;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.roidapp.cloudlib.sns:
//            u, v, m, p, 
//            x

public abstract class o extends g
{

    private volatile boolean e;
    private volatile boolean f;
    private volatile boolean g;
    private String h;
    private WeakReference i;
    private int j;
    private final List k;

    public o(String s1, i i1, j j1)
    {
        super(s1, j1, (byte)0);
        e = true;
        f = false;
        g = false;
        k = new ArrayList();
        a(i1);
    }

    public o(String s1, j j1)
    {
        this(s1, i.a, j1);
    }

    public final o a(boolean flag)
    {
        e = flag;
        return this;
    }

    protected abstract Object a(String s1, boolean flag);

    protected final Object a(HttpURLConnection httpurlconnection)
    {
        return a(com.roidapp.baselib.d.a.a(httpurlconnection.getInputStream(), "utf-8"), true);
    }

    final void a(v v1)
    {
        i = new WeakReference(v1);
    }

    protected final void a(Iterable iterable)
    {
        if (iterable != null)
        {
            Iterator iterator = iterable.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                f f1 = (f)iterator.next();
                if (f1 instanceof k)
                {
                    k.add(new String(((k)f1).a()));
                }
            } while (true);
        }
        super.a(iterable);
    }

    public final void a(Object obj)
    {
        j = obj.hashCode();
        com.roidapp.cloudlib.sns.u.a().a(this);
    }

    final void b(String s1)
    {
        if (i != null && e)
        {
            Object obj = (v)i.get();
            if (obj != null)
            {
                obj = ((v) (obj)).a();
                if (obj != null)
                {
                    com.roidapp.cloudlib.sns.m.b((new StringBuilder("save to cache - ")).append(d).append(" --- ").append(h).toString());
                    ((p) (obj)).a(p(), s1);
                    ((p) (obj)).b();
                }
            }
        }
    }

    public final volatile j d()
    {
        return (x)super.d();
    }

    public final void f()
    {
        c.set(true);
        Object obj = (x)super.d();
        if (obj != null)
        {
            ((x) (obj)).a();
        }
        if (a != null)
        {
            obj = (HttpURLConnection)a.get();
        } else
        {
            obj = null;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        ((HttpURLConnection) (obj)).disconnect();
        return;
        Exception exception;
        exception;
    }

    public final x i()
    {
        return (x)super.d();
    }

    public final boolean j()
    {
        return c.get();
    }

    public final boolean k()
    {
        return b.get();
    }

    public final o l()
    {
        f = true;
        return this;
    }

    final boolean m()
    {
        return f;
    }

    final boolean n()
    {
        return e;
    }

    public final String o()
    {
        return d;
    }

    final String p()
    {
        if (h == null)
        {
            h = com.roidapp.baselib.d.a.d((new StringBuilder()).append(d).append("=").append(k).toString());
        }
        return h;
    }

    final void q()
    {
label0:
        {
            b.set(true);
            c();
            if (i != null)
            {
                v v1 = (v)i.get();
                if (v1 == null)
                {
                    break label0;
                }
                v1.b(this);
            }
            return;
        }
        com.roidapp.cloudlib.sns.m.c((new StringBuilder("SnsRequestQueue was recycled in ")).append(this).toString());
    }

    final boolean r()
    {
        return g;
    }

    final void s()
    {
        g = true;
    }

    final int t()
    {
        return j;
    }
}
