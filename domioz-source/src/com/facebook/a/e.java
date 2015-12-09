// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.a;

import com.facebook.internal.aw;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.a:
//            a, i

final class e
    implements Runnable
{

    e()
    {
    }

    public final void run()
    {
        Object obj1 = new HashSet();
        Object obj = a.b();
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator1 = a.c().keySet().iterator(); iterator1.hasNext(); ((Set) (obj1)).add(((i)iterator1.next()).b())) { }
        break MISSING_BLOCK_LABEL_64;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        JVM INSTR monitorexit ;
        for (Iterator iterator = ((Set) (obj1)).iterator(); iterator.hasNext(); aw.a((String)iterator.next(), true)) { }
        return;
    }
}
