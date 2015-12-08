// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

// Referenced classes of package org.apache.commons.lang3.concurrent:
//            BackgroundInitializer

private class execFinally
    implements Callable
{

    private final ExecutorService execFinally;
    final BackgroundInitializer this$0;

    public Object call()
        throws Exception
    {
        Object obj = initialize();
        if (execFinally != null)
        {
            execFinally.shutdown();
        }
        return obj;
        Exception exception;
        exception;
        if (execFinally != null)
        {
            execFinally.shutdown();
        }
        throw exception;
    }

    public (ExecutorService executorservice)
    {
        this$0 = BackgroundInitializer.this;
        super();
        execFinally = executorservice;
    }
}
