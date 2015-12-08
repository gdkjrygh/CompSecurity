// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayDeque;
import java.util.Queue;

final class arj
{

    final Queue a = new ArrayDeque();

    arj()
    {
    }

    final ari a()
    {
        ari ari1;
        synchronized (a)
        {
            ari1 = (ari)a.poll();
        }
        obj = ari1;
        if (ari1 == null)
        {
            obj = new ari();
        }
        return ((ari) (obj));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
