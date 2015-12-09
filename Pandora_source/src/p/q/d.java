// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.q;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p.s.k;

// Referenced classes of package p.q:
//            g

public class d
    implements g
{

    private final Collection a;
    private String b;

    public transient d(g ag[])
    {
        if (ag.length < 1)
        {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        } else
        {
            a = Arrays.asList(ag);
            return;
        }
    }

    public String a()
    {
        if (b == null)
        {
            StringBuilder stringbuilder = new StringBuilder();
            for (Iterator iterator = a.iterator(); iterator.hasNext(); stringbuilder.append(((g)iterator.next()).a())) { }
            b = stringbuilder.toString();
        }
        return b;
    }

    public k a(k k1, int i, int j)
    {
        Iterator iterator = a.iterator();
        k k2;
        k k3;
        for (k2 = k1; iterator.hasNext(); k2 = k3)
        {
            k3 = ((g)iterator.next()).a(k2, i, j);
            if (k2 != null && !k2.equals(k1) && !k2.equals(k3))
            {
                k2.d();
            }
        }

        return k2;
    }
}
