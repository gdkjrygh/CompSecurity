// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.b;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.libraries.translate.b:
//            d

public final class c
{

    public Enum a;
    private final List b = new ArrayList();
    private final Map c = new HashMap();
    private final Enum d;
    private Handler e;

    public c(Enum enum)
    {
        d = enum;
        a = enum;
    }

    private void a(Runnable runnable)
    {
        this;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            e = new Handler();
        }
        e.post(runnable);
        this;
        JVM INSTR monitorexit ;
        return;
        runnable;
        throw runnable;
    }

    public final c a(Enum enum, Enum enum1, Enum enum2)
    {
        b.add(new d(this, enum, enum1, enum2));
        return this;
    }

    public final c a(Enum enum, Runnable runnable)
    {
        c.put(enum, runnable);
        return this;
    }

    public final void a()
    {
        a = d;
    }

    public final void a(Enum enum)
    {
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            d d1 = (d)iterator.next();
            if (d1.a != null && d1.a != a || d1.b != null && d1.b != enum)
            {
                continue;
            }
            if (d1.c != null)
            {
                enum = d1.c;
            }
            a = enum;
            enum = (Runnable)c.get(a);
            if (enum != null)
            {
                a(((Runnable) (enum)));
            }
            break;
        } while (true);
    }

    public final transient boolean a(Enum aenum[])
    {
        boolean flag1 = false;
        int j = aenum.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (aenum[i] != a)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }
}
