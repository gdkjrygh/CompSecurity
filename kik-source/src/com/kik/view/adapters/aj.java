// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kik.view.adapters:
//            af, ag

public final class aj
    implements af
{

    private final List a = new ArrayList();

    public aj()
    {
    }

    public final void a()
    {
        List list = a;
        list;
        JVM INSTR monitorenter ;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((ag)iterator.next()).g_()) { }
        break MISSING_BLOCK_LABEL_48;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        list;
        JVM INSTR monitorexit ;
    }

    public final void a(ag ag1)
    {
        synchronized (a)
        {
            a.add(ag1);
        }
        return;
        ag1;
        list;
        JVM INSTR monitorexit ;
        throw ag1;
    }
}
