// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load;

import com.bumptech.glide.load.engine.j;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.bumptech.glide.load:
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

    public j a(j j1, int i, int k)
    {
        Iterator iterator = a.iterator();
        j j2;
        j j3;
        for (j2 = j1; iterator.hasNext(); j2 = j3)
        {
            j3 = ((g)iterator.next()).a(j2, i, k);
            if (j2 != null && !j2.equals(j1) && !j2.equals(j3))
            {
                j2.d();
            }
        }

        return j2;
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
}
