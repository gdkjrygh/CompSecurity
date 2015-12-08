// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.z;

import com.google.android.m4b.maps.y.e;
import com.google.android.m4b.maps.y.j;
import com.google.android.m4b.maps.y.s;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.m4b.maps.z:
//            f, g, c, l, 
//            o, d, b

static class <init> extends f
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    final d a;
    private m b;
    private m c;
    private e d;
    private e e;
    private long f;
    private long g;
    private long h;
    private o i;
    private int j;
    private l k;
    private s l;
    private transient b m;

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        objectinputstream = b();
        objectinputstream.d();
        boolean flag;
        if (((c) (objectinputstream)).k == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.b(flag, "refreshAfterWrite requires a LoadingCache");
        m = new <init>(objectinputstream);
    }

    private Object readResolve()
    {
        return m;
    }

    protected final b a()
    {
        return m;
    }

    final c b()
    {
        c c1 = com.google.android.m4b.maps.z.c.a().a(b);
        Object obj = c;
        int i1;
        boolean flag;
        if (c1.h == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.b(flag, "Value strength was already set to %s", new Object[] {
            c1.h
        });
        c1.h = (c)com.google.android.m4b.maps.y.j.a(obj);
        obj = d;
        if (c1.l == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.b(flag, "key equivalence was already set to %s", new Object[] {
            c1.l
        });
        c1.l = (e)com.google.android.m4b.maps.y.j.a(obj);
        obj = e;
        if (c1.m == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.b(flag, "value equivalence was already set to %s", new Object[] {
            c1.m
        });
        c1.m = (e)com.google.android.m4b.maps.y.j.a(obj);
        i1 = j;
        if (c1.d == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.b(flag, "concurrency level was already set to %s", new Object[] {
            Integer.valueOf(c1.d)
        });
        if (i1 > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.a(flag);
        c1.d = i1;
        obj = k;
        if (c1.n == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.b(flag);
        c1.n = (l)com.google.android.m4b.maps.y.j.a(obj);
        c1.b = false;
        if (f > 0L)
        {
            long l1 = f;
            Object obj1 = TimeUnit.NANOSECONDS;
            if (c1.i == -1L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.b(flag, "expireAfterWrite was already set to %s ns", new Object[] {
                Long.valueOf(c1.i)
            });
            if (l1 >= 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.a(flag, "duration cannot be negative: %s %s", new Object[] {
                Long.valueOf(l1), obj1
            });
            c1.i = ((TimeUnit) (obj1)).toNanos(l1);
        }
        if (g > 0L)
        {
            l1 = g;
            obj1 = TimeUnit.NANOSECONDS;
            if (c1.j == -1L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.b(flag, "expireAfterAccess was already set to %s ns", new Object[] {
                Long.valueOf(c1.j)
            });
            if (l1 >= 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.a(flag, "duration cannot be negative: %s %s", new Object[] {
                Long.valueOf(l1), obj1
            });
            c1.j = ((TimeUnit) (obj1)).toNanos(l1);
        }
        if (i != a)
        {
            obj1 = i;
            if (c1.g == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.b(flag);
            if (c1.b)
            {
                if (c1.e == -1L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.google.android.m4b.maps.y.j.b(flag, "weigher can not be combined with maximum size", new Object[] {
                    Long.valueOf(c1.e)
                });
            }
            c1.g = (o)com.google.android.m4b.maps.y.j.a(obj1);
            if (h != -1L)
            {
                l1 = h;
                if (c1.f == -1L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.google.android.m4b.maps.y.j.b(flag, "maximum weight was already set to %s", new Object[] {
                    Long.valueOf(c1.f)
                });
                if (c1.e == -1L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.google.android.m4b.maps.y.j.b(flag, "maximum size was already set to %s", new Object[] {
                    Long.valueOf(c1.e)
                });
                c1.f = l1;
                if (l1 >= 0L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.google.android.m4b.maps.y.j.a(flag, "maximum weight must not be negative");
            }
        } else
        if (h != -1L)
        {
            long l2 = h;
            if (c1.e == -1L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.b(flag, "maximum size was already set to %s", new Object[] {
                Long.valueOf(c1.e)
            });
            if (c1.f == -1L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.b(flag, "maximum weight was already set to %s", new Object[] {
                Long.valueOf(c1.f)
            });
            if (c1.g == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.b(flag, "maximum size can not be combined with weigher");
            if (l2 >= 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.a(flag, "maximum size must not be negative");
            c1.e = l2;
        }
        if (l != null)
        {
            obj1 = l;
            if (c1.o == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.b(flag);
            c1.o = (s)com.google.android.m4b.maps.y.j.a(obj1);
        }
        return c1;
    }

    protected final Object c()
    {
        return m;
    }

    private ( ,  1, e e1, e e2, long l1, long l2, long l3, o o1, int i1, l l4, s s1, 
            d d1)
    {
label0:
        {
            super();
            b = ;
            c = 1;
            d = e1;
            e = e2;
            f = l1;
            g = l2;
            h = l3;
            i = o1;
            j = i1;
            k = l4;
            if (s1 != s.b())
            {
                 = s1;
                if (s1 != c.a)
                {
                    break label0;
                }
            }
             = null;
        }
        l = ;
        a = d1;
    }

    a(g g1)
    {
        this(g1.g, g1.h, g1.e, g1.f, g1.l, g1.k, g1.i, g1.j, g1.d, g1.o, g1.p, g1.r);
    }
}
