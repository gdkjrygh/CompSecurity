// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package b.a:
//            ks, iz, jt, op, 
//            os, ov, kr, ow, 
//            pf, ot, ji

public final class ja extends ks
{

    private final TreeMap d = new TreeMap();
    private ArrayList e;

    public ja(ji ji)
    {
        super("class_defs", ji);
        e = null;
    }

    private int a(ot ot1, int i, int j)
    {
        iz iz1;
        boolean flag1;
label0:
        {
            flag1 = false;
            iz1 = (iz)d.get(ot1);
            if (iz1 != null)
            {
                boolean flag;
                if (((jt) (iz1)).e >= 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label0;
                }
            }
            return i;
        }
        if (j < 0)
        {
            throw new RuntimeException((new StringBuilder("class circularity with ")).append(ot1).toString());
        }
        int k = j - 1;
        ot1 = iz1.b;
        j = i;
        if (ot1 != null)
        {
            j = a(ot1.f(), i, k);
        }
        int l;
        if (iz1.c == null)
        {
            ot1 = os.a;
        } else
        {
            ot1 = iz1.c.c();
        }
        l = ot1.a();
        for (i = ((flag1) ? 1 : 0); i < l; i++)
        {
            j = a(ot1.a(i), j, k);
        }

        iz1.a(j);
        e.add(iz1);
        return j + 1;
    }

    public final Collection a()
    {
        if (e != null)
        {
            return e;
        } else
        {
            return d.values();
        }
    }

    public final void a(iz iz1)
    {
        ot ot1;
        try
        {
            ot1 = iz1.a.f();
        }
        // Misplaced declaration of an exception variable
        catch (iz iz1)
        {
            throw new NullPointerException("clazz == null");
        }
        h();
        if (d.get(ot1) != null)
        {
            throw new IllegalArgumentException((new StringBuilder("already added: ")).append(ot1).toString());
        } else
        {
            d.put(ot1, iz1);
            return;
        }
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
            ow1.a(4, (new StringBuilder("class_defs_size: ")).append(pf.a(j)).toString());
            ow1.a(4, (new StringBuilder("class_defs_off:  ")).append(pf.a(i)).toString());
        }
        ow1.d(j);
        ow1.d(i);
    }

    protected final void b()
    {
        int j = d.size();
        e = new ArrayList(j);
        Iterator iterator = d.keySet().iterator();
        for (int i = 0; iterator.hasNext(); i = a((ot)iterator.next(), i, j - i)) { }
    }
}
