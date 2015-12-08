// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.io.Serializable;
import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            z, bx, ag, al, 
//            ah, ae, x, af, 
//            y, ax, aa, be

final class bf extends z
{
    final class a extends z
    {

        final bf a;

        final al b()
        {
            return new a(this);
        }

        final boolean c()
        {
            return false;
        }

        public final Object get(Object obj)
        {
            if (obj != null)
            {
                int j = bx.a(obj.hashCode());
                int k = bf.c(a);
                ag ag1 = bf.d(a)[j & k];
                while (ag1 != null) 
                {
                    if (obj.equals(ag1.getValue()))
                    {
                        return ag1.getKey();
                    }
                    ag1 = ag1.b();
                }
            }
            return null;
        }

        public final z i()
        {
            return a;
        }

        public final int size()
        {
            return a.size();
        }

        final Object writeReplace()
        {
            return new b(a);
        }

        private a()
        {
            a = bf.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    final class a.a extends ah
    {

        final a a;

        public final x a()
        {
            return b().a();
        }

        final ae c()
        {
            return new y(this) {

                private a.a b;

                public final Object get(int j)
                {
                    ag ag1 = bf.a(b.a.a)[j];
                    return ax.a(ag1.getValue(), ag1.getKey());
                }

                final aa h()
                {
                    return b;
                }

            
            {
                b = a1;
                super();
            }
            };
        }

        final af e()
        {
            return a;
        }

        final boolean g()
        {
            return true;
        }

        public final int hashCode()
        {
            return bf.b(a.a);
        }

        public final Iterator iterator()
        {
            return b().a();
        }

        a.a(a a1)
        {
            a = a1;
            super();
        }
    }

    static final class b
        implements Serializable
    {

        private static final long serialVersionUID = 1L;
        private final z a;

        final Object readResolve()
        {
            return a.i();
        }

        b(z z1)
        {
            a = z1;
        }
    }

    static final class c extends ag
    {

        private final ag a;
        private final ag b;

        final ag a()
        {
            return a;
        }

        final ag b()
        {
            return b;
        }

        c(ag ag1, ag ag2, ag ag3)
        {
            super(ag1);
            a = ag2;
            b = ag3;
        }
    }


    private final transient ag a[];
    private final transient ag b[];
    private final transient ag c[];
    private final transient int d;
    private final transient int e;
    private transient z f;

    bf(int j, ag.a aa[])
    {
        int k = bx.b(j);
        d = k - 1;
        ag aag[] = new ag[k];
        ag aag1[] = new ag[k];
        ag aag2[] = new ag[j];
        int l = 0;
        k = 0;
        while (l < j) 
        {
            ag.a a1 = aa[l];
            Object obj1 = a1.getKey();
            Object obj2 = a1.getValue();
            int i1 = obj1.hashCode();
            int j1 = obj2.hashCode();
            int k1 = bx.a(i1) & d;
            int l1 = bx.a(j1) & d;
            ag ag1 = aag[k1];
            Object obj = ag1;
            while (obj != null) 
            {
                boolean flag;
                if (!obj1.equals(((ag) (obj)).getKey()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a(flag, "key", a1, ((java.util.Map.Entry) (obj)));
                obj = ((ag) (obj)).a();
            }
            obj1 = aag1[l1];
            obj = obj1;
            while (obj != null) 
            {
                boolean flag1;
                if (!obj2.equals(((ag) (obj)).getValue()))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                a(flag1, "value", a1, ((java.util.Map.Entry) (obj)));
                obj = ((ag) (obj)).b();
            }
            if (ag1 == null && obj1 == null)
            {
                obj = a1;
            } else
            {
                obj = new c(a1, ag1, ((ag) (obj1)));
            }
            aag[k1] = ((ag) (obj));
            aag1[l1] = ((ag) (obj));
            aag2[l] = ((ag) (obj));
            l++;
            k += i1 ^ j1;
        }
        a = aag;
        b = aag1;
        c = aag2;
        e = k;
    }

    static ag[] a(bf bf1)
    {
        return bf1.c;
    }

    static int b(bf bf1)
    {
        return bf1.e;
    }

    static int c(bf bf1)
    {
        return bf1.d;
    }

    static ag[] d(bf bf1)
    {
        return bf1.b;
    }

    final al b()
    {
        return new ah() {

            private bf a;

            public final x a()
            {
                return b().a();
            }

            final ae c()
            {
                return new be(this, bf.a(a));
            }

            final af e()
            {
                return a;
            }

            final boolean g()
            {
                return true;
            }

            public final int hashCode()
            {
                return bf.b(a);
            }

            public final Iterator iterator()
            {
                return b().a();
            }

            
            {
                a = bf.this;
                super();
            }
        };
    }

    final boolean c()
    {
        return false;
    }

    public final Object get(Object obj)
    {
        if (obj != null)
        {
            int j = bx.a(obj.hashCode());
            int k = d;
            ag ag1 = a[j & k];
            while (ag1 != null) 
            {
                if (obj.equals(ag1.getKey()))
                {
                    return ag1.getValue();
                }
                ag1 = ag1.a();
            }
        }
        return null;
    }

    public final z i()
    {
        z z1 = f;
        Object obj = z1;
        if (z1 == null)
        {
            obj = new a((byte)0);
            f = ((z) (obj));
        }
        return ((z) (obj));
    }

    public final int size()
    {
        return c.length;
    }
}
