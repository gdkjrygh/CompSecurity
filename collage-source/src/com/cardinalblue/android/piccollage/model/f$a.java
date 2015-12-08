// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import android.graphics.Path;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

// Referenced classes of package com.cardinalblue.android.piccollage.model:
//            f, g

private static class 
{

    private static g a(List list)
    {
        float f1 = 0.0F;
        Object obj = null;
        Iterator iterator = list.iterator();
        list = obj;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            g g1 = (g)iterator.next();
            float f2 = g1.d() * g1.e();
            if (f2 > f1)
            {
                f1 = f2;
                list = g1;
            }
        } while (true);
        return list;
    }

    private static void a(g g1, Random random, Path path, List list)
    {
        if (!list.contains(g1))
        {
            return;
        }
        list.remove(g1);
        float f1 = g1.f();
        float f2 = g1.g();
        float f3 = g1.h();
        float f4 = 0.4F + random.nextFloat() / 5F;
        float f5 = g1.d();
        float f6 = g1.e();
        if ((double)f5 > (double)f6 * 1.5D)
        {
            g1 = new g(f5 * f4, f6, f1, f2, f3);
            random = new g(f5 * (1.0F - f4), f6, f1 + f5 * f4, f2, f3);
            path.moveTo(f5 * f4 + f1, f2);
            path.lineTo(f5 * f4 + f1, f6 + f2);
        } else
        {
            g1 = new g(f5, f6 * f4, f1, f2, f3);
            random = new g(f5, f6 * (1.0F - f4), f1, f2 + f6 * f4, f3);
            path.moveTo(f1, f6 * f4 + f2);
            path.lineTo(f1 + f5, f6 * f4 + f2);
        }
        list.add(g1);
        list.add(random);
    }

    public static void a(List list, Random random, Path path)
    {
        if (random.nextBoolean())
        {
            b(list, random, path);
            return;
        } else
        {
            c(list, random, path);
            return;
        }
    }

    private static void b(List list, Random random, Path path)
    {
        a(a(list), random, path, list);
    }

    private static void c(List list, Random random, Path path)
    {
        a((g)list.get(random.nextInt(list.size())), random, path, list);
    }

    private ()
    {
    }
}
