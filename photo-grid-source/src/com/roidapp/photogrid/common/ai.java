// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import com.picksinit.PicksMob;
import com.picksinit.b;
import com.roidapp.baselib.c.n;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.roidapp.photogrid.common:
//            a

public class ai
{

    private static ai a;
    private ExecutorService b;

    public ai()
    {
        b = null;
    }

    public static ai a()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com/roidapp/photogrid/common/ai;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            ai ai1 = new ai();
            a = ai1;
            ai1.b = Executors.newSingleThreadExecutor();
        }
        com/roidapp/photogrid/common/ai;
        JVM INSTR monitorexit ;
_L2:
        return a;
        Exception exception;
        exception;
        com/roidapp/photogrid/common/ai;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void c()
    {
        if (n.d() && !com.roidapp.photogrid.common.a.a().b)
        {
            PicksMob.getInstance().doRecommendAdViewReport("com.google.ad", "209101", 3002);
        }
    }

    public static void d()
    {
        if (n.d() && !com.roidapp.photogrid.common.a.a().b)
        {
            PicksMob.getInstance().doRecommendAdClickReport("com.google.ad", "209101", 3002);
        }
    }

    public final ExecutorService b()
    {
        return b;
    }
}
