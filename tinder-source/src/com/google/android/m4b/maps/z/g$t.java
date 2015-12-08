// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.z;

import com.google.android.m4b.maps.aa.ay;
import java.util.AbstractQueue;
import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.z:
//            g

static final class <init> extends AbstractQueue
{

    final  a = new g.r() {

        private g.aa a;
        private g.aa b;
        private g.t c;

        public final long a()
        {
            return 0x7fffffffffffffffL;
        }

        public final void a(long l)
        {
        }

        public final void a(g.aa aa)
        {
            a = aa;
        }

        public final g.aa b()
        {
            return a;
        }

        public final void b(g.aa aa)
        {
            b = aa;
        }

        public final g.aa c()
        {
            return b;
        }

            
            {
                c = g.t.this;
                super();
                a = this;
                b = this;
            }
    };

    private  a()
    {
         1 = a.b();
          = 1;
        if (1 == a)
        {
             = null;
        }
        return ;
    }

    public final void clear()
    {
         1;
        for (  = a.b();  != a;  = 1)
        {
            1 = .b();
            g.a();
        }

        a.a(a);
        a.b(a);
    }

    public final boolean contains(Object obj)
    {
        return (()obj).b() != a;
    }

    public final boolean isEmpty()
    {
        return a.b() == a;
    }

    public final Iterator iterator()
    {
        return new ay(a()) {

            private g.t a;

            protected final Object a(Object obj)
            {
                g.aa aa = ((g.aa)obj).b();
                obj = aa;
                if (aa == a.a)
                {
                    obj = null;
                }
                return obj;
            }

            
            {
                a = g.t.this;
                super(aa);
            }
        };
    }

    public final boolean offer(Object obj)
    {
        obj = ()obj;
        g.a((() (obj)).c(), (() (obj)).b());
        g.a(a.c(), (() (obj)));
        g.a((() (obj)), a);
        return true;
    }

    public final Object peek()
    {
        return a();
    }

    public final Object poll()
    {
          = a.b();
        if ( == a)
        {
            return null;
        } else
        {
            remove();
            return ;
        }
    }

    public final boolean remove(Object obj)
    {
        obj = ()obj;
          = (() (obj)).c();
         1 = (() (obj)).b();
        g.a(, 1);
        g.a((() (obj)));
        return 1 != a;
    }

    public final int size()
    {
        int i = 0;
        for (  = a.b();  != a;  = .b())
        {
            i++;
        }

        return i;
    }

    <init>()
    {
    }
}
