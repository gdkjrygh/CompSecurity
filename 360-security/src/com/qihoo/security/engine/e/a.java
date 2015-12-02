// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.e;

import com.qihoo.security.engine.b.c;
import com.qihoo.security.services.ScanResult;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class a
{

    final int a;
    final c b;
    final ArrayBlockingQueue c;
    private volatile boolean d;
    private final int e;

    public a(int i, c c1, int j)
    {
        d = false;
        a = i;
        b = c1;
        c = new ArrayBlockingQueue(j);
        e = j;
    }

    public com.qihoo.security.engine.a a()
    {
        if (b())
        {
            ArrayList arraylist = new ArrayList();
            c.drainTo(arraylist);
            return new com.qihoo.security.engine.a(a, b.e, arraylist, b);
        } else
        {
            return null;
        }
    }

    public com.qihoo.security.engine.a a(ScanResult scanresult, boolean flag)
    {
        if (!d);
        if (c.offer(scanresult))
        {
            if (flag)
            {
                return a();
            } else
            {
                return null;
            }
        } else
        {
            ArrayList arraylist = new ArrayList();
            c.drainTo(arraylist);
            arraylist.add(scanresult);
            return new com.qihoo.security.engine.a(a, b.e, arraylist, b);
        }
    }

    public boolean b()
    {
        return !c.isEmpty();
    }

    public void c()
    {
        d = true;
        c.clear();
    }

    public void d()
    {
        d = false;
    }
}
