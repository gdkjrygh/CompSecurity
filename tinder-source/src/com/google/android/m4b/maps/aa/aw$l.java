// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.AbstractQueue;
import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            aw, ay

static final class nit> extends AbstractQueue
{

    final f a = new aw.a() {

        private aw.s a;
        private aw.s b;
        private aw.l c;

        public final void a(long l1)
        {
        }

        public final void a(aw.s s)
        {
            a = s;
        }

        public final void b(aw.s s)
        {
            b = s;
        }

        public final long e()
        {
            return 0x7fffffffffffffffL;
        }

        public final aw.s f()
        {
            return a;
        }

        public final aw.s g()
        {
            return b;
        }

            
            {
                c = aw.l.this;
                super();
                a = this;
                b = this;
            }
    };

    private nit> a()
    {
        nit> nit>1 = a.f();
        nit> nit> = nit>1;
        if (nit>1 == a)
        {
            nit> = null;
        }
        return nit>;
    }

    public final void clear()
    {
        a a2;
        for (a a1 = a.f(); a1 != a; a1 = a2)
        {
            a2 = a1.f();
            aw.b(a1);
        }

        a.a(a);
        a.b(a);
    }

    public final boolean contains(Object obj)
    {
        return ((a)obj).f() != a;
    }

    public final boolean isEmpty()
    {
        return a.f() == a;
    }

    public final Iterator iterator()
    {
        return new ay(a()) {

            private aw.l a;

            protected final Object a(Object obj)
            {
                aw.s s = ((aw.s)obj).f();
                obj = s;
                if (s == a.a)
                {
                    obj = null;
                }
                return obj;
            }

            
            {
                a = aw.l.this;
                super(s);
            }
        };
    }

    public final boolean offer(Object obj)
    {
        obj = (a)obj;
        aw.a(((a) (obj)).g(), ((g) (obj)).f());
        aw.a(a.g(), ((g) (obj)));
        aw.a(((g) (obj)), a);
        return true;
    }

    public final Object peek()
    {
        return a();
    }

    public final Object poll()
    {
        a a1 = a.f();
        if (a1 == a)
        {
            return null;
        } else
        {
            remove(a1);
            return a1;
        }
    }

    public final boolean remove(Object obj)
    {
        obj = (remove)obj;
        remove remove1 = ((remove) (obj)).g();
        remove remove2 = ((g) (obj)).f();
        aw.a(remove1, remove2);
        aw.b(((f) (obj)));
        return remove2 != a;
    }

    public final int size()
    {
        int i = 0;
        for (a a1 = a.f(); a1 != a; a1 = a1.f())
        {
            i++;
        }

        return i;
    }

    nit>()
    {
    }
}
