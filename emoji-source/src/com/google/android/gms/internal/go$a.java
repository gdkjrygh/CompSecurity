// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            go, gr

private class <init>
    implements Runnable
{

    final go CI;

    public void run()
    {
        boolean flag;
        flag = false;
        go.a(CI, false);
        long l = SystemClock.elapsedRealtime();
        for (Iterator iterator = go.a(CI).iterator(); iterator.hasNext(); ((gr)iterator.next()).d(l, 3)) { }
        Object obj = gr.CN;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator1 = go.a(CI).iterator(); iterator1.hasNext();)
        {
            if (((gr)iterator1.next()).ev())
            {
                flag = true;
            }
        }

        obj;
        JVM INSTR monitorexit ;
        go.b(CI, flag);
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private (go go1)
    {
        CI = go1;
        super();
    }

    CI(go go1, CI ci)
    {
        this(go1);
    }
}
