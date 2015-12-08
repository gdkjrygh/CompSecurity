// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load;

import com.bumptech.glide.load.b.x;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.bumptech.glide.load:
//            g

public final class d
    implements g
{

    private final Collection a;
    private String b;

    public transient d(g ag[])
    {
        if (ag.length <= 0)
        {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        } else
        {
            a = Arrays.asList(ag);
            return;
        }
    }

    public final x a(x x1, int i, int j)
    {
        Iterator iterator = a.iterator();
        x x2;
        x x3;
        for (x2 = x1; iterator.hasNext(); x2 = x3)
        {
            x3 = ((g)iterator.next()).a(x2, i, j);
            if (x2 != null && !x2.equals(x1) && !x2.equals(x3))
            {
                x2.d();
            }
        }

        return x2;
    }

    public final String a()
    {
        if (b == null)
        {
            StringBuilder stringbuilder = new StringBuilder();
            for (Iterator iterator = a.iterator(); iterator.hasNext(); stringbuilder.append(((g)iterator.next()).a())) { }
            b = stringbuilder.toString();
        }
        return b;
    }
}
