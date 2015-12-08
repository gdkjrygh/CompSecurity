// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

// Referenced classes of package b.a:
//            ks, oo, jt, kn, 
//            ow, pf, ji, nr

public final class ko extends ks
{

    private final TreeMap d = new TreeMap();

    public ko(ji ji)
    {
        super("string_ids", ji);
    }

    public final jt a(nr nr)
    {
        if (nr == null)
        {
            throw new NullPointerException("cst == null");
        }
        g();
        nr = (jt)d.get((oo)nr);
        if (nr == null)
        {
            throw new IllegalArgumentException("not found");
        } else
        {
            return nr;
        }
    }

    public final kn a(oo oo1)
    {
        oo1 = new kn(oo1);
        h();
        oo oo2 = oo1.c();
        kn kn1 = (kn)d.get(oo2);
        if (kn1 != null)
        {
            return kn1;
        } else
        {
            d.put(oo2, oo1);
            return oo1;
        }
    }

    public final Collection a()
    {
        return d.values();
    }

    public final int b(oo oo1)
    {
        if (oo1 == null)
        {
            throw new NullPointerException("string == null");
        }
        g();
        oo1 = (kn)d.get(oo1);
        if (oo1 == null)
        {
            throw new IllegalArgumentException("not found");
        } else
        {
            return oo1.d();
        }
    }

    protected final void b()
    {
        Iterator iterator = d.values().iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            ((kn)iterator.next()).a(i);
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
        if (ow1.a())
        {
            ow1.a(4, (new StringBuilder("string_ids_size: ")).append(pf.a(j)).toString());
            ow1.a(4, (new StringBuilder("string_ids_off:  ")).append(pf.a(i)).toString());
        }
        ow1.d(j);
        ow1.d(i);
    }
}
