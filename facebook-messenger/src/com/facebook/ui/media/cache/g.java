// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.media.cache;

import android.content.Context;
import android.net.Uri;
import com.facebook.analytics.av;
import com.facebook.analytics.cache.a;
import com.facebook.analytics.cache.c;
import com.facebook.analytics.cache.e;
import com.facebook.analytics.cache.h;
import com.facebook.analytics.cb;
import com.facebook.analytics.periodicreporters.l;
import com.facebook.auth.f.b;
import com.facebook.cache.j;
import com.facebook.ui.c.d;
import com.google.common.a.hq;
import com.google.common.a.hy;
import com.google.common.a.ik;
import com.google.common.base.Preconditions;
import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.facebook.ui.media.cache:
//            m, j, a, i, 
//            h, l

public abstract class g
    implements l, b
{

    private static final Class a = com/facebook/ui/media/cache/g;
    private final com.facebook.common.time.a b;
    private final com.facebook.common.e.h c;
    private final ConcurrentMap d;
    private final ConcurrentMap e;
    private final ConcurrentMap f = ik.c();
    private final Object g = new Object();
    private final String h;
    private final String i;
    private final boolean j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private int o;
    private final e p;
    private final e q;
    private final a r;
    private long s;
    private final com.facebook.analytics.j.a t;
    private final com.facebook.cache.a u;
    private final j v;
    private final com.facebook.ui.media.cache.a w;

    protected g(Context context, com.facebook.common.time.a a1, d d1, h h1, com.facebook.analytics.j.a a2, com.facebook.common.e.h h2, m m1, 
            av av, j j1, javax.inject.a a3)
    {
        s = 0L;
        b = a1;
        c = h2;
        h = m1.a();
        i = m1.c();
        k = m1.h();
        l = m1.g();
        m = m1.e();
        n = m1.f();
        j = m1.k();
        w = a(context, h2, d1, h1, a1, m1);
        if (j)
        {
            boolean flag;
            if (l <= k)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            d = (new hy()).a(128).c(4).n();
            e = (new hy()).a(128).c(4).h().n();
            p = h1.a((new StringBuilder()).append(h).append("_memory").toString());
            q = h1.a((new StringBuilder()).append(h).append("_weakmem").toString());
            u = new com.facebook.ui.media.cache.j(this);
        } else
        {
            d = null;
            e = null;
            p = null;
            q = null;
            u = null;
        }
        t = a2;
        v = j1;
        if (v != null)
        {
            a(v);
        }
        r = new a(i, av, a3);
    }

    static int a(g g1, int i1)
    {
        i1 = g1.o - i1;
        g1.o = i1;
        return i1;
    }

    static com.facebook.common.time.a a(g g1)
    {
        return g1.b;
    }

    private void a(j j1)
    {
        w.a(j1);
        if (j)
        {
            j1.a(u);
        }
    }

    static int b(g g1)
    {
        return g1.o;
    }

    private void b(com.facebook.ui.media.cache.l l1, Object obj)
    {
        int j1;
        if (!j)
        {
            com.facebook.debug.log.b.a(a, (new StringBuilder()).append("The in-memory cached for ").append(i).append(" is disabled.").toString());
            return;
        }
        j1 = a(obj);
        Object obj1 = g;
        obj1;
        JVM INSTR monitorenter ;
        l1 = (i)d.put(l1, new i(this, l1, obj, j1));
        if (l1 == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        o = o - com.facebook.ui.media.cache.i.b(l1);
        o = o + j1;
        p.e(j1);
        if (o <= k && d.size() <= m)
        {
            break MISSING_BLOCK_LABEL_424;
        }
        com.facebook.debug.log.b.c(a, (new StringBuilder()).append("Cleaning out in memory cache: ").append(o / 1024).append(" KB with ").append(d.size()).append(" values").toString());
        l1 = hq.a(d.values());
        i i1;
        for (obj = l1.iterator(); ((Iterator) (obj)).hasNext(); com.facebook.ui.media.cache.i.a(i1, com.facebook.ui.media.cache.i.c(i1)))
        {
            i1 = (i)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_259;
        l1;
        obj1;
        JVM INSTR monitorexit ;
        throw l1;
        Collections.sort(l1, new com.facebook.ui.media.cache.h(this));
        l1 = l1.iterator();
        do
        {
            if (!l1.hasNext())
            {
                break;
            }
            obj = (i)l1.next();
            e.put(com.facebook.ui.media.cache.i.d(((i) (obj))), com.facebook.ui.media.cache.i.a(((i) (obj))));
            d.remove(com.facebook.ui.media.cache.i.d(((i) (obj))));
            o = o - com.facebook.ui.media.cache.i.b(((i) (obj)));
        } while (o >= l || d.size() > n);
        com.facebook.debug.log.b.c(a, (new StringBuilder()).append("Finished cleaning out in memory cache: ").append(o / 1024).append(" KB with ").append(d.size()).append(" values").toString());
        obj1;
        JVM INSTR monitorexit ;
        h();
        return;
    }

    static ConcurrentMap c(g g1)
    {
        return g1.d;
    }

    static Object d(g g1)
    {
        return g1.g;
    }

    static ConcurrentMap e(g g1)
    {
        return g1.e;
    }

    static Class g()
    {
        return a;
    }

    private void h()
    {
        Preconditions.checkArgument(j);
        int i1 = e();
        int j1 = f();
        int k1 = e.size();
        if (j1 > 0)
        {
            c.c(p.a(c.BYTES_COUNT), Integer.toString(i1));
            c.c(p.a(c.ENTRIES_COUNT), Integer.toString(j1));
        } else
        {
            c.a(p.a(c.BYTES_COUNT));
            c.a(p.a(c.ENTRIES_COUNT));
        }
        if (k1 > 0)
        {
            c.c(q.a(c.ENTRIES_COUNT), Integer.toString(k1));
            return;
        } else
        {
            c.a(q.a(c.ENTRIES_COUNT));
            return;
        }
    }

    private Object i(com.facebook.ui.media.cache.l l1)
    {
        if (!j)
        {
            com.facebook.debug.log.b.a(a, (new StringBuilder()).append("The in-memory cached for ").append(i).append(" is disabled.").toString());
            return null;
        }
        Object obj = (i)d.get(l1);
        if (obj != null)
        {
            ((i) (obj)).a();
            p.b();
            return com.facebook.ui.media.cache.i.a(((i) (obj)));
        }
        p.c();
        obj = e.get(l1);
        if (obj != null)
        {
            b(l1, obj);
            q.b();
            return obj;
        } else
        {
            q.c();
            return null;
        }
    }

    protected abstract int a(Object obj);

    protected abstract com.facebook.ui.media.cache.a a(Context context, com.facebook.common.e.h h1, d d1, h h2, com.facebook.common.time.a a1, m m1);

    public File a(com.facebook.ui.media.cache.l l1, InputStream inputstream)
    {
        inputstream = w.a(l1, inputstream);
        long l2;
        if (inputstream != null)
        {
            l2 = inputstream.length();
        } else
        {
            l2 = -1L;
        }
        r.d(l1.hashCode(), l2);
        return inputstream;
    }

    public File a(com.facebook.ui.media.cache.l l1, Object obj)
    {
        b(l1, obj);
        File file = w.a(l1, obj);
        long l2;
        if (file != null)
        {
            l2 = file.length();
        } else
        {
            l2 = -1L;
        }
        r.a(l1.hashCode(), a(obj), l2);
        return file;
    }

    public Object a(com.facebook.ui.media.cache.l l1)
    {
        Object obj = i(l1);
        long l2;
        if (obj != null)
        {
            l2 = a(obj);
        } else
        {
            l2 = -1L;
        }
        r.b(l1.hashCode(), l2);
        return obj;
    }

    public Object a(com.facebook.ui.media.cache.l l1, File file)
    {
        return w.a(l1, file);
    }

    public List a(long l1, String s1)
    {
        s = l1;
        s1 = new cb("media_cache_size");
        s1.a((new StringBuilder()).append(i).append("_memory_cache_size").toString(), e());
        s1.a((new StringBuilder()).append(i).append("_memory_cache_count").toString(), f());
        w.a(i, s1);
        return Collections.singletonList(s1);
    }

    public void a()
    {
        w.a();
    }

    public void a(com.facebook.ui.media.cache.l l1, long l2)
    {
        f.put(l1, Long.valueOf(b.a() + l2));
    }

    public boolean a(long l1)
    {
        return l1 - s > 0x36ee80L;
    }

    public void b()
    {
        if (!j)
        {
            return;
        }
        synchronized (g)
        {
            d.clear();
            e.clear();
            o = 0;
        }
        h();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean b(com.facebook.ui.media.cache.l l1)
    {
label0:
        {
label1:
            {
                boolean flag = false;
                boolean flag1;
                try
                {
                    if (c(l1))
                    {
                        break label1;
                    }
                    flag1 = w.f(l1);
                }
                // Misplaced declaration of an exception variable
                catch (com.facebook.ui.media.cache.l l1)
                {
                    return false;
                }
                if (!flag1)
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public void c()
    {
        b();
        w.d();
    }

    boolean c(com.facebook.ui.media.cache.l l1)
    {
        if (!j)
        {
            return false;
        } else
        {
            return d.containsKey(l1);
        }
    }

    public Object d(com.facebook.ui.media.cache.l l1)
    {
        Object obj = i(l1);
        if (obj != null)
        {
            h(l1);
            r.a(l1.hashCode(), a(obj));
            return obj;
        }
        obj = w.a(l1);
        long l2 = -1L;
        if (obj != null)
        {
            l2 = a(obj);
            b(l1, obj);
        }
        r.a(l1.hashCode(), l2);
        return obj;
    }

    public void d()
    {
        c();
    }

    public int e()
    {
        return o;
    }

    public File e(com.facebook.ui.media.cache.l l1)
    {
        File file = w.b(l1);
        long l2;
        if (file != null)
        {
            l2 = file.length();
        } else
        {
            l2 = -1L;
        }
        r.c(l1.hashCode(), l2);
        return file;
    }

    public int f()
    {
        if (d == null)
        {
            return 0;
        } else
        {
            return d.size();
        }
    }

    public Uri f(com.facebook.ui.media.cache.l l1)
    {
        File file = w.b(l1);
        long l2;
        if (file != null)
        {
            l2 = file.length();
        } else
        {
            l2 = -1L;
        }
        r.c(l1.hashCode(), l2);
        if (file != null)
        {
            return Uri.fromFile(file);
        } else
        {
            return null;
        }
    }

    public boolean g(com.facebook.ui.media.cache.l l1)
    {
        Long long1 = (Long)f.get(l1);
        if (long1 == null)
        {
            return false;
        }
        if (b.a() < long1.longValue())
        {
            t.e();
            return true;
        } else
        {
            f.remove(l1, long1);
            return false;
        }
    }

    protected boolean h(com.facebook.ui.media.cache.l l1)
    {
        return w.c(l1);
    }

}
