// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

abstract class ahz extends ahx
{

    private int b;
    private PriorityQueue c;

    public ahz()
    {
        super((byte)0);
        b = 0;
        c = new PriorityQueue(4, new aia(this));
    }

    public final agw a(int i, int j, int ai[], int k)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            agw agw1 = (agw)iterator.next();
            int l;
            if (i == 2)
            {
                l = agw1.b();
            } else
            {
                l = agw1.a();
            }
            if ((l & j) == j)
            {
                int ai1[] = agw1.a;
                if (ai1 == null || ai == null || Arrays.equals(ai1, ai))
                {
                    l = 1;
                } else
                {
                    l = 0;
                }
                if (l != 0 && k == agw1.b)
                {
                    c.remove(agw1);
                    b = b - agw1.h();
                    c(agw1);
                    return agw1;
                }
            }
        }

        return null;
    }

    public final void a()
    {
        c.clear();
        b = 0;
    }

    public final boolean a(agw agw1)
    {
        int i = agw1.h();
        if (i > a)
        {
            i = 0;
        } else
        {
            for (b = i + b; b > a;)
            {
                agw agw2 = (agw)c.poll();
                b = b - agw2.h();
                agw2.g();
            }

            i = 1;
        }
        if (i != 0)
        {
            b(agw1);
            c.add(agw1);
            return true;
        } else
        {
            return false;
        }
    }

    protected abstract void b(agw agw1);

    protected abstract void c(agw agw1);
}
