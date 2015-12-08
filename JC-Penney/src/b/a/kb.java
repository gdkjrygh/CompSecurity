// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Collection;
import java.util.TreeMap;

// Referenced classes of package b.a:
//            jy, nv, jt, ka, 
//            ow, pf, ji, nr

public final class kb extends jy
{

    private final TreeMap d = new TreeMap();

    public kb(ji ji)
    {
        super("method_ids", ji);
    }

    public final jt a(nr nr)
    {
        if (nr == null)
        {
            throw new NullPointerException("cst == null");
        }
        g();
        nr = (jt)d.get((nv)nr);
        if (nr == null)
        {
            throw new IllegalArgumentException("not found");
        } else
        {
            return nr;
        }
    }

    public final ka a(nv nv1)
    {
        if (nv1 == null)
        {
            throw new NullPointerException("method == null");
        }
        h();
        ka ka2 = (ka)d.get(nv1);
        ka ka1 = ka2;
        if (ka2 == null)
        {
            ka1 = new ka(nv1);
            d.put(nv1, ka1);
        }
        return ka1;
    }

    public final Collection a()
    {
        return d.values();
    }

    public final void a(ow ow1)
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
            ow1.a(4, (new StringBuilder("method_ids_size: ")).append(pf.a(j)).toString());
            ow1.a(4, (new StringBuilder("method_ids_off:  ")).append(pf.a(i)).toString());
        }
        ow1.d(j);
        ow1.d(i);
    }

    public final int b(nv nv1)
    {
        if (nv1 == null)
        {
            throw new NullPointerException("ref == null");
        }
        g();
        nv1 = (ka)d.get(nv1);
        if (nv1 == null)
        {
            throw new IllegalArgumentException("not found");
        } else
        {
            return nv1.d();
        }
    }
}
