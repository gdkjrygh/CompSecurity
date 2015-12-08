// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;
import p.cx.ab;

// Referenced classes of package com.pandora.radio.util:
//            k

public static class c
{
    public static interface a
    {

        public abstract void a(List list, int i);
    }


    protected int a;
    protected List b;
    private Object c;

    public Future a(a a1)
    {
        return ab.a().a(new Runnable(a1) {

            final a a;
            final k.f b;

            public void run()
            {
                b.b(a);
            }

            
            {
                b = k.f.this;
                a = a1;
                super();
            }
        });
    }

    public void a(int i)
    {
        a = i;
    }

    public boolean a(a a1)
    {
        boolean flag;
        synchronized (c)
        {
            flag = b.add(a1);
        }
        return flag;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    protected void b(a a1)
    {
        List list;
        int i;
        synchronized (c)
        {
            list = b;
            b = Collections.synchronizedList(new ArrayList());
        }
        obj = new ArrayList(Math.min(a, b.size()));
        i = 0;
_L5:
        if (list.isEmpty()) goto _L2; else goto _L1
_L1:
        int j = 0;
_L3:
        if (j >= a || list.isEmpty())
        {
            a1.a(((List) (obj)), i);
            i++;
            ((List) (obj)).clear();
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_114;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
        ((List) (obj)).add(list.remove(0));
        j++;
        if (true) goto _L3; else goto _L2
_L2:
        return;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public _cls1.a()
    {
        a = 300;
        b = Collections.synchronizedList(new ArrayList());
        c = new Object();
    }
}
