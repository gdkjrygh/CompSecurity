// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.g;

import java.util.ArrayList;
import java.util.List;
import rx.b.f;
import rx.internal.a.g;

// Referenced classes of package rx.g:
//            e

static final class d
    implements .Object
{

    final .Object a = new <init>();
    final <init> b;
    final f c;
    final f d;
    final g e = rx.internal.a.g.a();
    volatile boolean f;
    volatile a g;

    public final a a(a a1, a a2)
    {
        for (; a1 != g; a1 = a1.b)
        {
            a a3 = a1.b;
            rx.internal.a.g.a(a2, d.call(a3.a));
        }

        return a1;
    }

    public final void a()
    {
        if (!f)
        {
            f = true;
            a.a(c.call(rx.internal.a.g.b()));
            b.b(a);
            g = a.b;
        }
    }

    public final void a(Object obj)
    {
        if (!f)
        {
            a.a(c.call(rx.internal.a.g.a(obj)));
            b.a(a);
            g = a.b;
        }
    }

    public final void a(Throwable throwable)
    {
        if (!f)
        {
            f = true;
            a.a(c.call(rx.internal.a.g.a(throwable)));
            b.b(a);
            g = a.b;
        }
    }

    public final boolean a(b b1)
    {
        b1;
        JVM INSTR monitorenter ;
        b1.b = false;
        if (!b1.c)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        b1;
        JVM INSTR monitorexit ;
        return false;
        b1;
        JVM INSTR monitorexit ;
        b1.g = a((a)b1.g, b1);
        return true;
        Exception exception;
        exception;
        b1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Object[] a(Object aobj[])
    {
        ArrayList arraylist = new ArrayList();
        a a1 = a.a.b;
        do
        {
            if (a1 == null)
            {
                break;
            }
            Object obj = d.call(a1.a);
            if (a1.b == null && (rx.internal.a.g.c(obj) || rx.internal.a.g.b(obj)))
            {
                break;
            }
            arraylist.add(obj);
            a1 = a1.b;
        } while (true);
        return arraylist.toArray(aobj);
    }

    public final boolean b()
    {
        Object obj = a.a.b;
        if (obj != null)
        {
            if (!rx.internal.a.g.c(obj = d.call(((a) (obj)).a)) && !rx.internal.a.g.b(obj))
            {
                return false;
            }
        }
        return true;
    }

    public final Object c()
    {
        Object obj = a.a.b;
        if (obj != null)
        {
            a a1 = null;
            a a2;
            for (; obj != g; obj = a2)
            {
                a2 = ((a) (obj)).b;
                a1 = ((a) (obj));
            }

            obj = d.call(((a) (obj)).a);
            if (rx.internal.a.g.c(obj) || rx.internal.a.g.b(obj))
            {
                if (a1 != null)
                {
                    return rx.internal.a.g.e(d.call(a1.a));
                }
            } else
            {
                return rx.internal.a.g.e(obj);
            }
        }
        return null;
    }

    public .Object(.Object obj, f f1, f f2)
    {
        g = a.b;
        b = obj;
        c = f1;
        d = f2;
    }
}
