// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

// Referenced classes of package bolts:
//            f

final class g
    implements Executor
{

    private ThreadLocal a;

    private g()
    {
        a = new ThreadLocal();
    }

    g(byte byte0)
    {
        this();
    }

    private int a()
    {
        Integer integer1 = (Integer)a.get();
        Integer integer = integer1;
        if (integer1 == null)
        {
            integer = Integer.valueOf(0);
        }
        int i = integer.intValue() - 1;
        if (i == 0)
        {
            a.remove();
            return i;
        } else
        {
            a.set(Integer.valueOf(i));
            return i;
        }
    }

    public final void execute(Runnable runnable)
    {
        int i;
        Integer integer1 = (Integer)a.get();
        Integer integer = integer1;
        if (integer1 == null)
        {
            integer = Integer.valueOf(0);
        }
        i = integer.intValue() + 1;
        a.set(Integer.valueOf(i));
        if (i > 15) goto _L2; else goto _L1
_L1:
        runnable.run();
_L4:
        a();
        return;
_L2:
        f.a().execute(runnable);
        if (true) goto _L4; else goto _L3
_L3:
        runnable;
        a();
        throw runnable;
    }
}
