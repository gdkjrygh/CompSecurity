// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            it, iw

private class <init>
    implements Runnable
{

    final it Ik;

    public void run()
    {
        boolean flag;
        flag = false;
        it.a(Ik, false);
        long l = SystemClock.elapsedRealtime();
        for (Iterator iterator = it.a(Ik).iterator(); iterator.hasNext(); ((iw)iterator.next()).e(l, 2102)) { }
        Object obj = iw.Ip;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator1 = it.a(Ik).iterator(); iterator1.hasNext();)
        {
            if (((iw)iterator1.next()).gr())
            {
                flag = true;
            }
        }

        obj;
        JVM INSTR monitorexit ;
        it.b(Ik, flag);
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private (it it1)
    {
        Ik = it1;
        super();
    }

    Ik(it it1, Ik ik)
    {
        this(it1);
    }
}
