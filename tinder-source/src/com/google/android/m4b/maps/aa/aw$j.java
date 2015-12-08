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

    final h a = new aw.a() {

        private aw.s a;
        private aw.s b;
        private aw.j c;

        public final void c(aw.s s)
        {
            a = s;
        }

        public final void d(aw.s s)
        {
            b = s;
        }

        public final aw.s h()
        {
            return a;
        }

        public final aw.s i()
        {
            return b;
        }

            
            {
                c = aw.j.this;
                super();
                a = this;
                b = this;
            }
    };

    private nit> a()
    {
        nit> nit>1 = a.h();
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
        for (a a1 = a.h(); a1 != a; a1 = a2)
        {
            a2 = a1.h();
            aw.c(a1);
        }

        a.c(a);
        a.d(a);
    }

    public final boolean contains(Object obj)
    {
        return ((a)obj).h() != a;
    }

    public final boolean isEmpty()
    {
        return a.h() == a;
    }

    public final Iterator iterator()
    {
        return new ay(a()) {

            private aw.j a;

            protected final Object a(Object obj)
            {
                aw.s s = ((aw.s)obj).h();
                obj = s;
                if (s == a.a)
                {
                    obj = null;
                }
                return obj;
            }

            
            {
                a = aw.j.this;
                super(s);
            }
        };
    }

    public final boolean offer(Object obj)
    {
        obj = (a)obj;
        aw.b(((a) (obj)).i(), ((i) (obj)).h());
        aw.b(a.i(), ((i) (obj)));
        aw.b(((i) (obj)), a);
        return true;
    }

    public final Object peek()
    {
        return a();
    }

    public final Object poll()
    {
        a a1 = a.h();
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
        remove remove1 = ((remove) (obj)).i();
        remove remove2 = ((i) (obj)).h();
        aw.b(remove1, remove2);
        aw.c(((h) (obj)));
        return remove2 != a;
    }

    public final int size()
    {
        int i = 0;
        for (a a1 = a.h(); a1 != a; a1 = a1.h())
        {
            i++;
        }

        return i;
    }

    nit>()
    {
    }
}
