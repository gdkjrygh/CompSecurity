// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            h

public final class i
{

    final Object a;
    int b;
    List c;

    public final boolean a(h h1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (c.contains(h1))
        {
            return true;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        h1;
        obj;
        JVM INSTR monitorexit ;
        throw h1;
    }

    public final boolean b(h h1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = c.iterator();
_L2:
        h h2;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_68;
            }
            h2 = (h)iterator.next();
        } while (h1 == h2);
        if (!h2.e.equals(h1.e)) goto _L2; else goto _L1
_L1:
        iterator.remove();
        obj;
        JVM INSTR monitorexit ;
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
        h1;
        obj;
        JVM INSTR monitorexit ;
        throw h1;
    }
}
