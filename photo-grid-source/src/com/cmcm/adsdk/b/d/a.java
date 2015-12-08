// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.b.d;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.cmcm.adsdk.b.d:
//            d, b, c

public final class a
    implements d
{

    private static a b;
    public Set a;

    private a()
    {
        a = new HashSet();
    }

    public static a a()
    {
        com/cmcm/adsdk/b/d/a;
        JVM INSTR monitorenter ;
        a a1;
        if (b == null)
        {
            b = new a();
        }
        a1 = b;
        com/cmcm/adsdk/b/d/a;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(String s)
    {
        if (a == null)
        {
            return;
        }
        Set set = a;
        set;
        JVM INSTR monitorenter ;
        Iterator iterator;
        if (!com.cmcm.adsdk.b.e.a.a(s))
        {
            break MISSING_BLOCK_LABEL_73;
        }
        iterator = a.iterator();
_L2:
        b b1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_119;
            }
            b1 = (b)iterator.next();
        } while (b1 == null);
        b1.c(s);
        if (true) goto _L2; else goto _L1
_L1:
        s;
        set;
        JVM INSTR monitorexit ;
        throw s;
        iterator = a.iterator();
_L3:
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_119;
            }
            b1 = (b)iterator.next();
        } while (b1 == null);
        b1.b(s);
          goto _L3
        set;
        JVM INSTR monitorexit ;
    }

    public final void a(String s, String s1, b b1)
    {
        if (a == null)
        {
            return;
        }
        synchronized (a)
        {
            a.add(b1);
        }
        (new c(s, s1, this)).execute(new Void[0]);
        return;
        s;
        set;
        JVM INSTR monitorexit ;
        throw s;
    }
}
