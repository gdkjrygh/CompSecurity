// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import android.os.Handler;
import android.os.Looper;
import com.b.a.a.c;
import com.b.a.a.d;
import com.b.a.a.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.b.a:
//            a, f, c

public class e
{

    private static Handler sHandler = null;
    private static Runnable sRestoreStrictMode = null;

    public e()
    {
    }

    public static void disableStrictMode()
    {
        setStrictMode(new g[] {
            c.Reset, c.Lax
        });
    }

    public static void enableStrictMode()
    {
        setStrictMode(new g[] {
            c.Reset, d.DetectAll, d.PenaltyDeathOnNetwork, d.PenaltyFlashScreen, com.b.a.a.e.DetectAll, com.b.a.a.e.PenaltyLog
        });
    }

    public static void enableUniqueViolations(boolean flag, com.b.a.c c1)
    {
        a.enableUniqueViolations(flag, c1);
    }

    public static void setStrictMode(List list)
    {
        for (list = list.iterator(); list.hasNext(); ((g)list.next()).set()) { }
        list = new com.b.a.a.a.g();
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        com/b/a/e;
        JVM INSTR monitorenter ;
        if (sHandler == null)
        {
            sHandler = new Handler(Looper.getMainLooper());
        }
        if (sRestoreStrictMode != null)
        {
            sHandler.removeCallbacks(sRestoreStrictMode);
        }
        sRestoreStrictMode = new f(list);
        sHandler.postAtFrontOfQueue(sRestoreStrictMode);
        com/b/a/e;
        JVM INSTR monitorexit ;
        return;
        list;
        com/b/a/e;
        JVM INSTR monitorexit ;
        throw list;
    }

    public static transient void setStrictMode(g ag[])
    {
        ArrayList arraylist = new ArrayList(ag.length);
        int j = ag.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(ag[i]);
        }

        setStrictMode(((List) (arraylist)));
    }

}
