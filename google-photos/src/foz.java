// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class foz extends bl
    implements nuc
{

    final nud b = new ntz(this);
    final List c;
    private final ay d;
    private final fov e;
    private final SparseArray f = new SparseArray();
    private final Set g;

    foz(fpa fpa1)
    {
        super(fpa1.b);
        boolean flag;
        if (fpa1.c != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = fpa1.b;
        c = fox.a(flag, fpa1.d);
        g = fpa1.a;
        e = new fov(fpa1.c);
    }

    final int a(faz faz1)
    {
        int i = c.indexOf(faz1);
        if (i == -1)
        {
            faz1 = String.valueOf(faz1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(faz1).length() + 21)).append("Invalid destination: ").append(faz1).toString());
        } else
        {
            return i;
        }
    }

    public final int a(Object obj)
    {
        if (f.indexOfValue((am)obj) == -1)
        {
            return -2;
        } else
        {
            return super.a(obj);
        }
    }

    public final am a(int i)
    {
        Object obj = d(i);
        if (g.contains(obj))
        {
            return new am();
        }
        obj = e;
        faz faz1 = d(i);
        switch (fow.a[faz1.ordinal()])
        {
        default:
            obj = String.valueOf(faz1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 25)).append("Unsupported destination: ").append(((String) (obj))).toString());

        case 1: // '\001'
            return new edp();

        case 2: // '\002'
            if (((fov) (obj)).a != -1)
            {
                return dqq.b(((fov) (obj)).a);
            } else
            {
                return fwu.a(false);
            }

        case 3: // '\003'
            return new eif();
        }
    }

    public final Object a(ViewGroup viewgroup, int i)
    {
        viewgroup = (am)super.a(viewgroup, i);
        f.put(i, viewgroup);
        return viewgroup;
    }

    public final nud a()
    {
        return b;
    }

    public final void a(ViewGroup viewgroup)
    {
        super.a(viewgroup);
        b.b();
    }

    public final void a(ViewGroup viewgroup, int i, Object obj)
    {
        super.a(viewgroup, i, obj);
        f.delete(i);
    }

    public final int b()
    {
        return c.size();
    }

    final am c(int i)
    {
        return (am)f.get(i);
    }

    final faz d(int i)
    {
        return (faz)c.get(i);
    }

    final void d()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e();
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Object obj;
        Iterator iterator;
        obj = d.a();
        iterator = c.iterator();
_L3:
        faz faz1;
        am am1;
        int i;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_136;
            }
            faz1 = (faz)iterator.next();
        } while (!g.contains(faz1));
        i = a(faz1);
        am1 = c(i);
        if (am1 == null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        if (d.a(am1.F) != null)
        {
            ((bp) (obj)).a(am1);
            f.remove(i);
        }
        g.remove(faz1);
          goto _L3
        obj;
        throw obj;
        ((bp) (obj)).c();
        d.b();
        c();
        b.b();
          goto _L1
    }

    final int e(int i)
    {
        return fox.a(d(i));
    }

    final boolean e()
    {
        return g.size() == 0;
    }
}
