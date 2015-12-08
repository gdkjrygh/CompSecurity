// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.goggles;

import com.google.bionics.goggles.api2.m;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.goggles:
//            d, f, e

public final class c
{

    private static c c;
    private static final d d = new d();
    private final ArrayList a = new ArrayList();
    private final ArrayList b = new ArrayList();

    private c()
    {
    }

    public static final c a()
    {
        if (c == null)
        {
            c = new c();
        }
        return c;
    }

    static void a(c c1, f f1)
    {
        c1.a(f1);
    }

    private void a(f f1)
    {
        this;
        JVM INSTR monitorenter ;
        a.remove(f1);
        b.add(f1);
        this;
        JVM INSTR monitorexit ;
        return;
        f1;
        throw f1;
    }

    private f e()
    {
        this;
        JVM INSTR monitorenter ;
        int i = a.size();
        if (i != 0) goto _L2; else goto _L1
_L1:
        Object obj = d;
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((f) (obj));
_L2:
        obj = (f)a.get(i - 1);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final f b()
    {
        d.a.a();
        e e1 = new e(this);
        this;
        JVM INSTR monitorenter ;
        f f1 = e();
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        f1.b();
        a.add(e1);
        this;
        JVM INSTR monitorexit ;
        return e1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final ArrayList c()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Iterator iterator;
        obj = new ArrayList();
        iterator = b.iterator();
_L2:
        com.google.bionics.goggles.api2.i i;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_60;
            }
            i = ((f)iterator.next()).a();
        } while (i == null);
        ((ArrayList) (obj)).add(i);
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
        b.clear();
        this;
        JVM INSTR monitorexit ;
        return ((ArrayList) (obj));
    }

    public final boolean d()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (a.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.addAll(a);
        a.clear();
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

}
