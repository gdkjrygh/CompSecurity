// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.e;
import com.google.android.m4b.maps.y.j;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            aw, av, w

static final class <init> extends <init>
{

    private static final long serialVersionUID = 3L;

    private void readObject(ObjectInputStream objectinputstream)
    {
        boolean flag1 = false;
        objectinputstream.defaultReadObject();
        int i = objectinputstream.readInt();
        Object obj = new av();
        Object obj1;
        boolean flag;
        if (((av) (obj)).b == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.b(flag, "initial capacity was already set to %s", new Object[] {
            Integer.valueOf(((av) (obj)).b)
        });
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(flag);
        obj.b = i;
        obj1 = super.a;
        if (((av) (obj)).e == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.b(flag, "Key strength was already set to %s", new Object[] {
            ((av) (obj)).e
        });
        obj.e = (a)j.a(obj1);
        if (((av) (obj)).e != b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(flag, "Soft keys are not supported");
        if (obj1 != a)
        {
            obj.a = true;
        }
        obj1 = super.b;
        if (((av) (obj)).f == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.b(flag, "Value strength was already set to %s", new Object[] {
            ((av) (obj)).f
        });
        obj.f = (b)j.a(obj1);
        if (obj1 != a)
        {
            obj.a = true;
        }
        obj1 = super.c;
        if (((av) (obj)).j == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.b(flag, "key equivalence was already set to %s", new Object[] {
            ((av) (obj)).j
        });
        obj.j = (e)j.a(obj1);
        obj.a = true;
        i = super.g;
        if (((av) (obj)).c == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.b(flag, "concurrency level was already set to %s", new Object[] {
            Integer.valueOf(((av) (obj)).c)
        });
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(flag);
        obj.c = i;
        obj1 = super.h;
        if (((av) (obj)).k == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.b(flag);
        obj.k = (h)j.a(obj1);
        obj.a = true;
        if (super.d > 0L)
        {
            long l = super.d;
            TimeUnit timeunit = TimeUnit.NANOSECONDS;
            ((av) (obj)).a(l, timeunit);
            obj.g = timeunit.toNanos(l);
            if (l == 0L && ((av) (obj)).i == null)
            {
                obj.i = d;
            }
            obj.a = true;
        }
        if (super.e > 0L)
        {
            long l1 = super.e;
            TimeUnit timeunit1 = TimeUnit.NANOSECONDS;
            ((av) (obj)).a(l1, timeunit1);
            obj.h = timeunit1.toNanos(l1);
            if (l1 == 0L && ((av) (obj)).i == null)
            {
                obj.i = d;
            }
            obj.a = true;
        }
        if (super.f != -1)
        {
            int k = super.f;
            Object obj2;
            if (((av) (obj)).d == -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j.b(flag, "maximum size was already set to %s", new Object[] {
                Integer.valueOf(((av) (obj)).d)
            });
            flag = flag1;
            if (k >= 0)
            {
                flag = true;
            }
            j.a(flag, "maximum size must not be negative");
            obj.d = k;
            obj.a = true;
            if (((av) (obj)).d == 0)
            {
                obj.i = com.google.android.m4b.maps.aa.e;
            }
        }
        this.i = ((av) (obj)).d();
        do
        {
            obj = objectinputstream.readObject();
            if (obj != null)
            {
                obj2 = objectinputstream.readObject();
                super.i.put(obj, obj2);
            } else
            {
                return;
            }
        } while (true);
    }

    private Object readResolve()
    {
        return i;
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeInt(super.i.size());
        java.util.ntry ntry;
        for (Iterator iterator = super.i.entrySet().iterator(); iterator.hasNext(); objectoutputstream.writeObject(ntry.getValue()))
        {
            ntry = (java.util.ntry)iterator.next();
            objectoutputstream.writeObject(ntry.getKey());
        }

        objectoutputstream.writeObject(null);
    }

    ( ,  1, e e1, e e2, long l, long l1, int i, int k,  2, ConcurrentMap concurrentmap)
    {
        super(, 1, e1, e2, l, l1, i, k, 2, concurrentmap);
    }
}
