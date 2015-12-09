// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import com.facebook.FacebookSdk;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

public class LockOnGetVariable
{

    private CountDownLatch initLatch;
    private Object value;

    public LockOnGetVariable(Object obj)
    {
        value = obj;
    }

    public LockOnGetVariable(final Callable callable)
    {
        initLatch = new CountDownLatch(1);
        FacebookSdk.getExecutor().execute(new FutureTask(new Callable() {

            final LockOnGetVariable this$0;
            final Callable val$callable;

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public Void call()
                throws Exception
            {
                value = callable.call();
                initLatch.countDown();
                return null;
                Exception exception;
                exception;
                initLatch.countDown();
                throw exception;
            }

            
            {
                this$0 = LockOnGetVariable.this;
                callable = callable1;
                super();
            }
        }));
    }

    private void waitOnInit()
    {
        if (initLatch == null)
        {
            return;
        }
        try
        {
            initLatch.await();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }

    public Object getValue()
    {
        waitOnInit();
        return value;
    }


/*
    static Object access$002(LockOnGetVariable lockongetvariable, Object obj)
    {
        lockongetvariable.value = obj;
        return obj;
    }

*/

}
