// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

// Referenced classes of package b.a:
//            ks, op, jt, kp, 
//            ju, ow, pf, ji, 
//            nr, ot

public final class kq extends ks
{

    private final TreeMap d = new TreeMap();

    public kq(ji ji)
    {
        super("type_ids", ji);
    }

    public final jt a(nr nr)
    {
        if (nr == null)
        {
            throw new NullPointerException("cst == null");
        }
        g();
        Object obj = ((op)nr).f();
        obj = (jt)d.get(obj);
        if (obj == null)
        {
            throw new IllegalArgumentException((new StringBuilder("not found: ")).append(nr).toString());
        } else
        {
            return ((jt) (obj));
        }
    }

    public final kp a(op op1)
    {
        if (op1 == null)
        {
            throw new NullPointerException("type == null");
        }
        h();
        ot ot = op1.f();
        kp kp2 = (kp)d.get(ot);
        kp kp1 = kp2;
        if (kp2 == null)
        {
            kp1 = new kp(op1);
            d.put(ot, kp1);
        }
        return kp1;
    }

    public final kp a(ot ot)
    {
        if (ot == null)
        {
            throw new NullPointerException("type == null");
        }
        h();
        kp kp2 = (kp)d.get(ot);
        kp kp1 = kp2;
        if (kp2 == null)
        {
            kp1 = new kp(new op(ot));
            d.put(ot, kp1);
        }
        return kp1;
    }

    public final Collection a()
    {
        return d.values();
    }

    public final int b(op op1)
    {
        if (op1 == null)
        {
            throw new NullPointerException("type == null");
        } else
        {
            return b(op1.f());
        }
    }

    public final int b(ot ot)
    {
        if (ot == null)
        {
            throw new NullPointerException("type == null");
        }
        g();
        kp kp1 = (kp)d.get(ot);
        if (kp1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder("not found: ")).append(ot).toString());
        } else
        {
            return kp1.d();
        }
    }

    protected final void b()
    {
        Iterator iterator = d.values().iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            ((kp)(ju)iterator.next()).a(i);
        }

    }

    public final void b(ow ow1)
    {
        g();
        int j = d.size();
        int i;
        if (j == 0)
        {
            i = 0;
        } else
        {
            i = e();
        }
        if (j > 0x10000)
        {
            throw new UnsupportedOperationException("too many type ids");
        }
        if (ow1.a())
        {
            ow1.a(4, (new StringBuilder("type_ids_size:   ")).append(pf.a(j)).toString());
            ow1.a(4, (new StringBuilder("type_ids_off:    ")).append(pf.a(i)).toString());
        }
        ow1.d(j);
        ow1.d(i);
    }
}
