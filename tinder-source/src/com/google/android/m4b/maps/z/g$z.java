// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.z;

import com.google.android.m4b.maps.aj.e;
import com.google.android.m4b.maps.aj.f;
import com.google.android.m4b.maps.aj.j;
import com.google.android.m4b.maps.aj.l;
import com.google.android.m4b.maps.y.o;
import com.google.android.m4b.maps.y.s;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.m4b.maps.z:
//            g, d

static final class a
    implements 
{

    volatile  a;
    private j b;
    private o c;

    public final int a()
    {
        return a.a();
    }

    public final f a(Object obj, d d1)
    {
        Object obj1 = c;
        boolean flag;
        if (!((o) (obj1)).b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.b(flag, "This stopwatch is already running.");
        obj1.b = true;
        obj1.c = ((o) (obj1)).a.a();
        obj1 = a.get();
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        obj = d1.a(obj);
        if (b(obj))
        {
            return b;
        } else
        {
            return com.google.android.m4b.maps.aj.e.a(obj);
        }
        com.google.android.m4b.maps.y.j.a(obj);
        com.google.android.m4b.maps.y.j.a(obj1);
        obj = com.google.android.m4b.maps.aj.e.a(com.google.android.m4b.maps.aj.e.a(d1.a(obj)), new com.google.android.m4b.maps.y.f() {

            private g.z a;

            public final Object a(Object obj2)
            {
                a.b(obj2);
                return obj2;
            }

            
            {
                a = g.z.this;
                super();
            }
        });
        return ((f) (obj));
        obj;
        if (obj instanceof InterruptedException)
        {
            Thread.currentThread().interrupt();
        }
        if (a(((Throwable) (obj))))
        {
            return b;
        } else
        {
            return com.google.android.m4b.maps.aj.e.a(((Throwable) (obj)));
        }
    }

    public final  a(ReferenceQueue referencequeue, Object obj,  )
    {
        return this;
    }

    public final void a(Object obj)
    {
        if (obj != null)
        {
            b(obj);
            return;
        } else
        {
            a = com.google.android.m4b.maps.z.g.j();
            return;
        }
    }

    public final boolean a(Throwable throwable)
    {
        return b.a(throwable);
    }

    public final  b()
    {
        return null;
    }

    public final boolean b(Object obj)
    {
        return b.a(obj);
    }

    public final boolean c()
    {
        return true;
    }

    public final boolean d()
    {
        return a.d();
    }

    public final Object e()
    {
        return l.a(b);
    }

    public final long f()
    {
        o o1 = c;
        return TimeUnit.NANOSECONDS.convert(o1.a(), TimeUnit.NANOSECONDS);
    }

    public final Object get()
    {
        return a.get();
    }

    public ()
    {
        this(com.google.android.m4b.maps.z.g.j());
    }

    public ( )
    {
        b = j.a();
        c = new o();
        a = ;
    }
}
