// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.util;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package roboguice.util:
//            SafeAsyncTask

class val.latch
    implements Runnable
{

    final countDown this$0;
    final Callable val$c;
    final Exception val$exceptions[];
    final CountDownLatch val$latch;

    public void run()
    {
        val$c.call();
        val$latch.countDown();
        return;
        Object obj;
        obj;
        val$exceptions[0] = ((Exception) (obj));
        val$latch.countDown();
        return;
        obj;
        val$latch.countDown();
        throw obj;
    }

    ()
    {
        this$0 = final_;
        val$c = callable;
        val$exceptions = aexception;
        val$latch = CountDownLatch.this;
        super();
    }
}
