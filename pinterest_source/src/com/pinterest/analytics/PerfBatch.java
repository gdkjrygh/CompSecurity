// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.analytics;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.analytics:
//            PerfEvent

public class PerfBatch
{

    private List a;
    private long b;
    private int c;
    private int d;
    private boolean e;

    public PerfBatch(int i, int j)
    {
        a = new ArrayList();
        b = System.currentTimeMillis();
        c = i;
        d = j;
    }

    public final List a()
    {
        long l = System.currentTimeMillis();
        if (l - b > (long)c)
        {
            e = true;
        }
        if (!e)
        {
            return new ArrayList();
        } else
        {
            b = l;
            e = false;
            return new ArrayList(a);
        }
    }

    public final void a(PerfEvent perfevent)
    {
        if (a != null)
        {
            a.add(perfevent);
            if (a.size() > d)
            {
                e = true;
            }
        }
    }

    public final void a(List list)
    {
        if (a != null)
        {
            a.removeAll(list);
        }
    }
}
