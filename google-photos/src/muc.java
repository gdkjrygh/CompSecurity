// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.PowerManager;
import android.util.SparseArray;

final class muc
{

    private static muc b;
    final SparseArray a = new SparseArray();
    private final Context c;
    private int d;

    private muc(Context context)
    {
        c = context;
    }

    static muc a(Context context)
    {
        muc;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new muc(context);
        }
        context = b;
        muc;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    final int a()
    {
        SparseArray sparsearray = a;
        sparsearray;
        JVM INSTR monitorenter ;
        int i;
        i = d + 1;
        d = i;
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        d = 1;
        android.os.PowerManager.WakeLock wakelock = ((PowerManager)c.getSystemService("power")).newWakeLock(1, "BackgroundTaskService");
        wakelock.setReferenceCounted(false);
        wakelock.acquire(60000L);
        a.put(d, wakelock);
        sparsearray;
        JVM INSTR monitorexit ;
        return d;
        Exception exception;
        exception;
        sparsearray;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
