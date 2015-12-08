// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

// Referenced classes of package b.a:
//            ks, ki, ju, ow, 
//            pf, ji, or

public final class kj extends ks
{

    private final TreeMap d = new TreeMap();

    public kj(ji ji)
    {
        super("proto_ids", ji);
    }

    public final ki a(or or)
    {
        if (or == null)
        {
            throw new NullPointerException("prototype == null");
        }
        h();
        ki ki2 = (ki)d.get(or);
        ki ki1 = ki2;
        if (ki2 == null)
        {
            ki1 = new ki(or);
            d.put(or, ki1);
        }
        return ki1;
    }

    public final Collection a()
    {
        return d.values();
    }

    public final int b(or or)
    {
        if (or == null)
        {
            throw new NullPointerException("prototype == null");
        }
        g();
        or = (ki)d.get(or);
        if (or == null)
        {
            throw new IllegalArgumentException("not found");
        } else
        {
            return or.d();
        }
    }

    protected final void b()
    {
        Iterator iterator = d.values().iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            ((ki)(ju)iterator.next()).a(i);
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
            throw new UnsupportedOperationException("too many proto ids");
        }
        if (ow1.a())
        {
            ow1.a(4, (new StringBuilder("proto_ids_size:  ")).append(pf.a(j)).toString());
            ow1.a(4, (new StringBuilder("proto_ids_off:   ")).append(pf.a(i)).toString());
        }
        ow1.d(j);
        ow1.d(i);
    }
}
