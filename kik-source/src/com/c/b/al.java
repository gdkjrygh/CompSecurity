// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.c.b:
//            a, ar, by, am, 
//            h, bk, bd, be

public final class al extends com.c.b.a
{
    public static final class a extends a.a
    {

        private final ak.a a;
        private ar b;
        private final ak.f c[];
        private by d;

        private static void a(Object obj)
        {
            if (obj == null)
            {
                throw new NullPointerException();
            }
            if (!(obj instanceof ak.e))
            {
                throw new IllegalArgumentException("DynamicMessage should use EnumValueDescriptor to set Enum Value.");
            } else
            {
                return;
            }
        }

        private a c(by by1)
        {
            if (a.d().k() == ak.g.b.c)
            {
                return this;
            } else
            {
                d = by.a(d).a(by1).b();
                return this;
            }
        }

        private void d(ak.f f1)
        {
            if (f1.t() != a)
            {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            } else
            {
                return;
            }
        }

        private al k()
        {
            if (!a())
            {
                throw b(new al(a, b, (ak.f[])Arrays.copyOf(c, c.length), d));
            } else
            {
                return d();
            }
        }

        private a l()
        {
            a a1 = new a(a);
            a1.b.a(b);
            a1.c(d);
            System.arraycopy(c, 0, a1.c, 0, c.length);
            return a1;
        }

        private void m()
        {
            if (b.d())
            {
                b = b.e();
            }
        }

        public final a.a a(bd bd)
        {
            return d(bd);
        }

        public final a.a a(by by1)
        {
            return c(by1);
        }

        public final bd.a a(ak.f f1, Object obj)
        {
            d(f1);
            m();
            b.b(f1, obj);
            return this;
        }

        public final boolean a()
        {
            return al.a(a, b);
        }

        public final boolean a(ak.f f1)
        {
            d(f1);
            return b.a(f1);
        }

        public final a.a b()
        {
            return l();
        }

        public final bd.a b(ak.f f1, Object obj)
        {
            d(f1);
            m();
            if (f1.h() == ak.f.b.n)
            {
                if (f1.o())
                {
                    for (Iterator iterator = ((List)obj).iterator(); iterator.hasNext(); a(iterator.next())) { }
                } else
                {
                    a(obj);
                }
            }
            Object obj1 = f1.u();
            if (obj1 != null)
            {
                int i1 = ((ak.j) (obj1)).a();
                obj1 = c[i1];
                if (obj1 != null && obj1 != f1)
                {
                    b.c(((ar.a) (obj1)));
                }
                c[i1] = f1;
            }
            b.a(f1, obj);
            return this;
        }

        public final bd.a b(by by1)
        {
            if (a.d().k() == ak.g.b.c)
            {
                return this;
            } else
            {
                d = by1;
                return this;
            }
        }

        public final Object b(ak.f f1)
        {
label0:
            {
                d(f1);
                Object obj1 = b.b(f1);
                Object obj = obj1;
                if (obj1 == null)
                {
                    if (!f1.o())
                    {
                        break label0;
                    }
                    obj = Collections.emptyList();
                }
                return obj;
            }
            if (f1.f() == ak.f.a.i)
            {
                return al.a(f1.w());
            } else
            {
                return f1.r();
            }
        }

        public final b.a c()
        {
            return l();
        }

        public final bd.a c(ak.f f1)
        {
            d(f1);
            if (f1.f() != ak.f.a.i)
            {
                throw new IllegalArgumentException("newBuilderForField is only valid for fields with message type.");
            } else
            {
                return new a(f1.w());
            }
        }

        public final bd.a c(bd bd)
        {
            return d(bd);
        }

        public final Object clone()
        {
            return l();
        }

        public final a d(bd bd)
        {
            if (bd instanceof al)
            {
                al al1 = (al)bd;
                if (al.a(al1) != a)
                {
                    throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
                }
                m();
                b.a(al.b(al1));
                c(al.c(al1));
                int i1 = 0;
                do
                {
                    bd = this;
                    if (i1 >= c.length)
                    {
                        break;
                    }
                    if (c[i1] == null)
                    {
                        c[i1] = al.d(al1)[i1];
                    } else
                    if (al.d(al1)[i1] != null && c[i1] != al.d(al1)[i1])
                    {
                        b.c(c[i1]);
                        c[i1] = al.d(al1)[i1];
                    }
                    i1++;
                } while (true);
            } else
            {
                bd = (a)super.a(bd);
            }
            return bd;
        }

        public final al d()
        {
            b.c();
            return new al(a, b, (ak.f[])Arrays.copyOf(c, c.length), d);
        }

        public final Map d_()
        {
            return b.f();
        }

        public final ak.a e()
        {
            return a;
        }

        public final by f()
        {
            return d;
        }

        public final bd h()
        {
            return d();
        }

        public final bd i()
        {
            return k();
        }

        public final be j()
        {
            return k();
        }

        public final bd w()
        {
            return al.a(a);
        }

        private a(ak.a a1)
        {
            a = a1;
            b = ar.a();
            d = by.e();
            c = new ak.f[a1.a().o()];
        }

        a(ak.a a1, byte byte0)
        {
            this(a1);
        }
    }


    private final ak.a c;
    private final ar d;
    private final ak.f e[];
    private final by f;
    private int g;

    al(ak.a a1, ar ar1, ak.f af[], by by1)
    {
        g = -1;
        c = a1;
        d = ar1;
        e = af;
        f = by1;
    }

    static ak.a a(al al1)
    {
        return al1.c;
    }

    public static al a(ak.a a1)
    {
        ak.f af[] = new ak.f[a1.a().o()];
        return new al(a1, ar.b(), af, by.e());
    }

    static boolean a(ak.a a1, ar ar1)
    {
        for (a1 = a1.f().iterator(); a1.hasNext();)
        {
            ak.f f1 = (ak.f)a1.next();
            if (f1.m() && !ar1.a(f1))
            {
                return false;
            }
        }

        return ar1.h();
    }

    public static a b(ak.a a1)
    {
        return new a(a1, (byte)0);
    }

    static ar b(al al1)
    {
        return al1.d;
    }

    static by c(al al1)
    {
        return al1.f;
    }

    private void c(ak.f f1)
    {
        if (f1.t() != c)
        {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        } else
        {
            return;
        }
    }

    static ak.f[] d(al al1)
    {
        return al1.e;
    }

    private a h()
    {
        return new a(c, (byte)0);
    }

    public final void a(h h1)
    {
        if (c.e().i())
        {
            d.b(h1);
            f.b(h1);
            return;
        } else
        {
            d.a(h1);
            f.a(h1);
            return;
        }
    }

    public final boolean a()
    {
        return a(c, d);
    }

    public final boolean a(ak.f f1)
    {
        c(f1);
        return d.a(f1);
    }

    public final int b()
    {
        int i = g;
        if (i != -1)
        {
            return i;
        }
        if (c.e().i())
        {
            i = d.j() + f.g();
        } else
        {
            i = d.i() + f.b();
        }
        g = i;
        return i;
    }

    public final Object b(ak.f f1)
    {
label0:
        {
            c(f1);
            Object obj1 = d.b(f1);
            Object obj = obj1;
            if (obj1 == null)
            {
                if (!f1.o())
                {
                    break label0;
                }
                obj = Collections.emptyList();
            }
            return obj;
        }
        if (f1.f() == ak.f.a.i)
        {
            return a(f1.w());
        } else
        {
            return f1.r();
        }
    }

    public final Map d_()
    {
        return d.f();
    }

    public final ak.a e()
    {
        return c;
    }

    public final by f()
    {
        return f;
    }

    public final bk t()
    {
        return new am(this);
    }

    public final bd.a u()
    {
        return h();
    }

    public final be.a v()
    {
        return h().d(this);
    }

    public final bd w()
    {
        return a(c);
    }
}
