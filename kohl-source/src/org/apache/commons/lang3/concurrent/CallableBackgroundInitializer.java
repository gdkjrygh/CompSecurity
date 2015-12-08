// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

// Referenced classes of package org.apache.commons.lang3.concurrent:
//            BackgroundInitializer

public class CallableBackgroundInitializer extends BackgroundInitializer
{

    private final Callable callable;

    public CallableBackgroundInitializer(Callable callable1)
    {
        checkCallable(callable1);
        callable = callable1;
    }

    public CallableBackgroundInitializer(Callable callable1, ExecutorService executorservice)
    {
        super(executorservice);
        checkCallable(callable1);
        callable = callable1;
    }

    private void checkCallable(Callable callable1)
    {
        if (callable1 == null)
        {
            throw new IllegalArgumentException("Callable must not be null!");
        } else
        {
            return;
        }
    }

    protected Object initialize()
        throws Exception
    {
        return callable.call();
    }
}
