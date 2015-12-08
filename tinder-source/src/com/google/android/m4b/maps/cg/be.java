// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.aa.f;
import com.google.android.m4b.maps.y.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public final class be
    implements Runnable
{
    public static interface a
    {

        public abstract void a(List list);
    }

    public static interface b
    {

        public abstract com.google.android.m4b.maps.f.a.a a();
    }

    public static final class c
    {

        public c()
        {
        }
    }


    private final List a = new ArrayList();
    private final b b;
    private final a c;
    private final long d = 2000L;
    private boolean e;
    private com.google.android.m4b.maps.f.a.a f;
    private final Executor g;
    private final c h;

    public be(b b1, a a1, Executor executor, c c1)
    {
        boolean flag = false;
        super();
        e = false;
        if (2000L > 0L)
        {
            flag = true;
        }
        j.a(flag, "Delay cannot be 0");
        b = b1;
        c = a1;
        g = executor;
        h = c1;
    }

    public final void a(cb.a a1)
    {
        synchronized (a)
        {
            a.add(a1);
            if (!e)
            {
                e = true;
                g.execute(this);
            }
        }
        return;
        a1;
        list;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public final void run()
    {
        cb.a aa[];
        int i;
        int k;
        try
        {
            Thread.sleep(d);
        }
        catch (InterruptedException interruptedexception)
        {
            synchronized (a)
            {
                e = false;
            }
            return;
        }
        if (f == null)
        {
            f = b.a();
        }
        synchronized (a)
        {
            aa = new cb.a[a.size()];
            a.toArray(aa);
            a.clear();
            e = false;
        }
        obj = new HashMap();
        k = aa.length;
        i = 0;
        while (i < k) 
        {
            Integer integer = Integer.valueOf(aa[i].cj);
            com.google.android.m4b.maps.f.a.a a1 = (com.google.android.m4b.maps.f.a.a)((Map) (obj)).get(integer);
            if (a1 != null)
            {
                a1.a = a1.a + 1;
            } else
            {
                com.google.android.m4b.maps.f.a.a a2 = f.a();
                a2.l = integer.intValue();
                ((Map) (obj)).put(integer, a2);
            }
            i++;
        }
        break MISSING_BLOCK_LABEL_202;
        obj;
        list;
        JVM INSTR monitorexit ;
        throw obj;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        ArrayList arraylist = com.google.android.m4b.maps.aa.f.a(((Map) (obj)).values());
        c.a(arraylist);
        return;
    }
}
