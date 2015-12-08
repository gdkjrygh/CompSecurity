// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Collection;
import java.util.TreeMap;

// Referenced classes of package b.a:
//            jy, jo, ob, jt, 
//            ow, pf, ji, nr

public final class jp extends jy
{

    private final TreeMap d = new TreeMap();

    public jp(ji ji)
    {
        super("field_ids", ji);
    }

    public final jo a(ob ob1)
    {
        if (ob1 == null)
        {
            throw new NullPointerException("field == null");
        }
        h();
        jo jo2 = (jo)d.get(ob1);
        jo jo1 = jo2;
        if (jo2 == null)
        {
            jo1 = new jo(ob1);
            d.put(ob1, jo1);
        }
        return jo1;
    }

    public final jt a(nr nr)
    {
        if (nr == null)
        {
            throw new NullPointerException("cst == null");
        }
        g();
        nr = (jt)d.get((ob)nr);
        if (nr == null)
        {
            throw new IllegalArgumentException("not found");
        } else
        {
            return nr;
        }
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
            ow1.a(4, (new StringBuilder("field_ids_size:  ")).append(pf.a(j)).toString());
            ow1.a(4, (new StringBuilder("field_ids_off:   ")).append(pf.a(i)).toString());
        }
        ow1.d(j);
        ow1.d(i);
    }

    public final int b(ob ob1)
    {
        if (ob1 == null)
        {
            throw new NullPointerException("ref == null");
        }
        g();
        ob1 = (jo)d.get(ob1);
        if (ob1 == null)
        {
            throw new IllegalArgumentException("not found");
        } else
        {
            return ob1.d();
        }
    }
}
