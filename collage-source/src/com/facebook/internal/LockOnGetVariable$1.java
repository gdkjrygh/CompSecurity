// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.facebook.internal:
//            LockOnGetVariable

class val.callable
    implements Callable
{

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
        LockOnGetVariable.access$002(LockOnGetVariable.this, val$callable.call());
        LockOnGetVariable.access$100(LockOnGetVariable.this).countDown();
        return null;
        Exception exception;
        exception;
        LockOnGetVariable.access$100(LockOnGetVariable.this).countDown();
        throw exception;
    }

    ()
    {
        this$0 = final_lockongetvariable;
        val$callable = Callable.this;
        super();
    }
}
