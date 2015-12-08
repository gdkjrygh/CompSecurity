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
        private g.k c;

        public final void b(long l)
        {
        }

        public final void c(g.aa aa)
        {
            a = aa;
        }

        public final long d()
        {
            return 0x7fffffffffffffffL;
        }

        public final void d(g.aa aa)
        {
            b = aa;
        }

        public final g.aa e()
        {
            return a;
        }

        public final g.aa f()
        {
            return b;
        }

            
            {
                c = g.k.this;
                super();
                a = this;
                b = this;
            }
    };

    private  a()
    {
         1 = a.e();
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
        for (  = a.e();  != a;  = 1)
        {
            1 = .e();
            g.b();
        }

        a.c(a);
        a.d(a);
    }

    public final boolean contains(Object obj)
    {
        return (()obj).e() != a;
    }

    public final boolean isEmpty()
    {
        return a.e() == a;
    }

    public final Iterator iterator()
    {
        return new ay(a()) {

            private g.k a;

            protected final Object a(Object obj)
            {
                g.aa aa = ((g.aa)obj).e();
                obj = aa;
                if (aa == a.a)
                {
                    obj = null;
                }
                return obj;
            }

            
            {
                a = g.k.this;
                super(aa);
            }
        };
    }

    public final boolean offer(Object obj)
    {
        obj = ()obj;
        g.b((() (obj)).f(), (() (obj)).e());
        g.b(a.f(), (() (obj)));
        g.b((() (obj)), a);
        return true;
    }

    public final Object peek()
    {
        return a();
    }

    public final Object poll()
    {
          = a.e();
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
          = (() (obj)).f();
         1 = (() (obj)).e();
        g.b(, 1);
        g.b((() (obj)));
        return 1 != a;
    }

    public final int size()
    {
        int i = 0;
        for (  = a.e();  != a;  = .e())
        {
            i++;
        }

        return i;
    }

    <init>()
    {
    }
}
