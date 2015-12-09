// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.operation;

import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.galileo.bluetooth.GalileoTaskExecutor;

// Referenced classes of package com.fitbit.synclair.operation:
//            t

public class i extends t
{

    private static final String e = "RefreshProfileOperation";
    private static final long f = 0x989680L;
    private static final Object g = new Object();
    private GalileoTaskExecutor h;
    private GalileoTrackerType i;

    public i(GalileoTrackerType galileotrackertype)
    {
        super(com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType.k);
        i = galileotrackertype;
    }

    static GalileoTrackerType a(i j)
    {
        return j.i;
    }

    static GalileoTaskExecutor a(i j, GalileoTaskExecutor galileotaskexecutor)
    {
        j.h = galileotaskexecutor;
        return galileotaskexecutor;
    }

    static GalileoTaskExecutor b(i j)
    {
        return j.h;
    }

    static Object q()
    {
        return g;
    }

    protected void a(com.fitbit.data.bl.h.a a1)
    {
        a(((Runnable) (new _cls1(a1))));
    }

    protected String p()
    {
        return "RefreshProfileOperation";
    }


    /* member class not found */
    class _cls1 {}

}
