// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.nonstop;

import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.env.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.unveil.nonstop:
//            c, m

public class h
{

    public static final af a = new af("ProcessingChain", "");
    final List b = new ArrayList();
    volatile boolean c;
    private final w d = new w();
    private volatile boolean e;
    private final Object f = new Object();
    private final h g;

    public h(h h1)
    {
        g = h1;
        e = false;
        d.a();
    }

    public final void a()
    {
        while (e) 
        {
            d();
        }
    }

    protected final void a(m m1)
    {
        d.c();
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            c c1 = (c)iterator.next();
            if (c)
            {
                break;
            }
            c1.b(m1);
        } while (true);
        if (c || g == null) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (!g.e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L3; else goto _L2
_L2:
        m1.h();
_L5:
        a(true);
        return;
_L3:
        g.b(m1);
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected final void a(Collection collection)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            c c1 = (c)iterator.next();
            synchronized (c1.f)
            {
                if (c1.f.size() > 0)
                {
                    collection.addAll(c1.f);
                    c1.f.clear();
                }
            }
        }

        break MISSING_BLOCK_LABEL_79;
        collection;
        arraylist;
        JVM INSTR monitorexit ;
        throw collection;
    }

    protected final void a(boolean flag)
    {
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        e = flag1;
        if (flag)
        {
            synchronized (f)
            {
                f.notifyAll();
            }
            return;
        } else
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void b()
    {
        c = false;
    }

    protected void b(m m1)
    {
        e = true;
        a(m1);
    }

    protected void c()
    {
        c = true;
        while (e) 
        {
            d();
        }
    }

    protected final void d()
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        f.wait();
_L1:
        return;
        Object obj1;
        obj1;
        a.f("Exception!", new Object[0]);
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

}
