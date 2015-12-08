// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

public abstract class dk extends BroadcastReceiver
{

    private static final SparseArray a = new SparseArray();
    private static int b = 1;

    public static ComponentName a(Context context, Intent intent)
    {
        SparseArray sparsearray = a;
        sparsearray;
        JVM INSTR monitorenter ;
        int i;
        int j;
        i = b;
        j = b + 1;
        b = j;
        if (j > 0)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        b = 1;
        intent.putExtra("android.support.content.wakelockid", i);
        intent = context.startService(intent);
        if (intent != null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        sparsearray;
        JVM INSTR monitorexit ;
        return null;
        context = ((PowerManager)context.getSystemService("power")).newWakeLock(1, (new StringBuilder("wake:")).append(intent.flattenToShortString()).toString());
        context.setReferenceCounted(false);
        context.acquire(60000L);
        a.put(i, context);
        sparsearray;
        JVM INSTR monitorexit ;
        return intent;
        context;
        sparsearray;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static boolean a(Intent intent)
    {
        int i;
        i = intent.getIntExtra("android.support.content.wakelockid", 0);
        if (i == 0)
        {
            return false;
        }
        intent = a;
        intent;
        JVM INSTR monitorenter ;
        android.os.PowerManager.WakeLock wakelock = (android.os.PowerManager.WakeLock)a.get(i);
        if (wakelock == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        wakelock.release();
        a.remove(i);
        intent;
        JVM INSTR monitorexit ;
        return true;
        Log.w("WakefulBroadcastReceiver", (new StringBuilder("No active wake lock id #")).append(i).toString());
        intent;
        JVM INSTR monitorexit ;
        return true;
        Exception exception;
        exception;
        intent;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
