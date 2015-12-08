// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            ao, bk, ae, aq, 
//            al, aa, ah, x, 
//            af, y, ax

final class bj extends ao
{
    final class a extends ah
    {

        final bj a;

        public final x a()
        {
            return b().a();
        }

        final ae c()
        {
            return new y(this) {

                private final ae b;
                private a c;

                public final Object get(int k)
                {
                    return ax.a(b.get(k), bj.a(c.a).get(k));
                }

                final aa h()
                {
                    return c;
                }

            
            {
                c = a1;
                super();
                b = c.a.a.b();
            }
            };
        }

        final af e()
        {
            return a;
        }

        public final Iterator iterator()
        {
            return b().a();
        }

        private a()
        {
            a = bj.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    final transient bk a;
    private final transient ae b;

    bj(bk bk1, ae ae1)
    {
        a = bk1;
        b = ae1;
    }

    static ae a(bj bj1)
    {
        return bj1.b;
    }

    private ao a(int k, int l)
    {
        if (k == 0 && l == size())
        {
            return this;
        }
        if (k == l)
        {
            return a(comparator());
        }
        aq aq1 = a.a(k, l);
        ae ae1 = b.a(k, l);
        if (aq1.isEmpty())
        {
            return ao.a(aq1.comparator());
        } else
        {
            return new bj((bk)aq1, ae1);
        }
    }

    public final ao a(Object obj)
    {
        return a(0, a.e(j.a(obj)));
    }

    final al b()
    {
        return new a((byte)0);
    }

    public final ao b(Object obj)
    {
        return a(a.f(j.a(obj)), size());
    }

    public final al g()
    {
        return a;
    }

    public final Object get(Object obj)
    {
        int k = a.d(obj);
        if (k == -1)
        {
            return null;
        } else
        {
            return b.get(k);
        }
    }

    public final aa h()
    {
        return b;
    }

    public final aq i()
    {
        return a;
    }

    public final Set keySet()
    {
        return a;
    }

    public final Collection values()
    {
        return b;
    }
}
