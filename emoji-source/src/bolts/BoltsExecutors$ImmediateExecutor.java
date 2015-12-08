// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

// Referenced classes of package bolts:
//            BoltsExecutors

private static class <init>
    implements Executor
{

    private static final int MAX_DEPTH = 15;
    private ThreadLocal executionDepth;

    private int decrementDepth()
    {
        Integer integer1 = (Integer)executionDepth.get();
        Integer integer = integer1;
        if (integer1 == null)
        {
            integer = Integer.valueOf(0);
        }
        int i = integer.intValue() - 1;
        if (i == 0)
        {
            executionDepth.remove();
            return i;
        } else
        {
            executionDepth.set(Integer.valueOf(i));
            return i;
        }
    }

    private int incrementDepth()
    {
        Integer integer1 = (Integer)executionDepth.get();
        Integer integer = integer1;
        if (integer1 == null)
        {
            integer = Integer.valueOf(0);
        }
        int i = integer.intValue() + 1;
        executionDepth.set(Integer.valueOf(i));
        return i;
    }

    public void execute(Runnable runnable)
    {
        if (incrementDepth() > 15) goto _L2; else goto _L1
_L1:
        runnable.run();
_L4:
        decrementDepth();
        return;
_L2:
        BoltsExecutors.background().execute(runnable);
        if (true) goto _L4; else goto _L3
_L3:
        runnable;
        decrementDepth();
        throw runnable;
    }

    private ()
    {
        executionDepth = new ThreadLocal();
    }

    executionDepth(executionDepth executiondepth)
    {
        this();
    }
}
