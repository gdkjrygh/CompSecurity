// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.userscope;

import com.facebook.common.time.a;
import com.facebook.debug.d.e;
import com.facebook.inject.ContextScoped;
import com.facebook.inject.ThreadLocalScoped;
import com.facebook.inject.aq;
import com.facebook.inject.au;
import com.facebook.inject.ax;
import com.facebook.inject.ay;
import com.facebook.inject.f;
import com.facebook.inject.n;
import com.facebook.inject.s;
import com.facebook.inject.t;
import com.google.common.a.fi;
import com.google.common.a.ik;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Singleton;

// Referenced classes of package com.facebook.auth.userscope:
//            d, a, UserScoped

public class b
    implements au, ax, ay
{

    private static final Class a = com/facebook/auth/userscope/b;
    private static final fi b = fi.a(javax/inject/Singleton, com/facebook/inject/ThreadLocalScoped, com/facebook/inject/ContextScoped);
    private static final Object c = new Object();
    private final Object d = new Object();
    private final Map e = ik.a();
    private final Map f = ik.a();
    private final ThreadLocal g = new ThreadLocal();
    private t h;
    private n i;
    private a j;
    private com.facebook.auth.userscope.a k;
    private long l;
    private List m;

    public b()
    {
        l = -1L;
    }

    static n a(b b1)
    {
        return b1.i;
    }

    private void b()
    {
label0:
        {
            synchronized (d)
            {
                if (l != -1L)
                {
                    break label0;
                }
            }
            return;
        }
        if (j.a() > l + 30000L)
        {
            f.clear();
            l = -1L;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void b(b b1)
    {
        b1.b();
    }

    static Object c(b b1)
    {
        return b1.d;
    }

    private void c()
    {
        e e1 = com.facebook.debug.d.e.a("SingletonScope.initializeEagerSingletons");
        Iterator iterator = m.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            s s1 = (s)iterator.next();
            if (s1.b == f.EAGER)
            {
                e e2 = com.facebook.debug.d.e.a((new StringBuilder()).append("Key: ").append(s1.a).toString());
                h.a(s1.a);
                e2.a();
            }
        } while (true);
        e1.a();
    }

    static com.facebook.auth.userscope.a d(b b1)
    {
        return b1.k;
    }

    static Map e(b b1)
    {
        return b1.e;
    }

    static Map f(b b1)
    {
        return b1.f;
    }

    static void g(b b1)
    {
        b1.c();
    }

    static ThreadLocal h(b b1)
    {
        return b1.g;
    }

    public javax.inject.a a(com.google.inject.a a1, javax.inject.a a2)
    {
        return new d(this, a1, a2, null);
    }

    public void a()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = e.values().iterator(); iterator.hasNext();)
        {
            Iterator iterator1 = ((Map)iterator.next()).values().iterator();
            while (iterator1.hasNext()) 
            {
                Object obj1 = iterator1.next();
                if (obj1 instanceof com.facebook.auth.f.b)
                {
                    ((com.facebook.auth.f.b)obj1).d();
                }
                if (obj1 instanceof com.facebook.auth.f.a)
                {
                    ((com.facebook.auth.f.a)obj1).b();
                }
            }
        }

        break MISSING_BLOCK_LABEL_112;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        f.putAll(e);
        l = j.a();
        e.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    public void a(t t1)
    {
        h = t1;
        i = (n)t1.a(com/facebook/inject/n);
        j = (a)t1.a(com/facebook/common/time/a);
        k = (com.facebook.auth.userscope.a)t1.a(com/facebook/auth/userscope/a);
    }

    public void a(List list)
    {
        m = list;
        for (list = m.iterator(); list.hasNext();)
        {
            s s1 = (s)list.next();
            if (s1.b != f.EAGER)
            {
                throw new aq((new StringBuilder()).append("UserScope does not support ").append(s1.b).append(". See key ").append(s1.a).toString());
            }
        }

    }

    public Class annotationType()
    {
        return com/facebook/auth/userscope/UserScoped;
    }

    public com.facebook.auth.viewercontext.e getCurrentViewerContextManager()
    {
        return (com.facebook.auth.viewercontext.e)g.get();
    }




}
