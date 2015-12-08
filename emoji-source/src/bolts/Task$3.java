// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package bolts:
//            Continuation, Task, AggregateException

static final class ect
    implements Continuation
{

    final skCompletionSource val$allFinished;
    final AtomicInteger val$count;
    final Object val$errorLock;
    final ArrayList val$errors;
    final AtomicBoolean val$isCancelled;

    public volatile Object then(Task task)
        throws Exception
    {
        return then(task);
    }

    public Void then(Task task)
    {
        if (task.isFaulted())
        {
            synchronized (val$errorLock)
            {
                val$errors.add(task.getError());
            }
        }
        if (task.isCancelled())
        {
            val$isCancelled.set(true);
        }
        if (val$count.decrementAndGet() == 0)
        {
            if (val$errors.size() == 0)
            {
                break MISSING_BLOCK_LABEL_119;
            }
            if (val$errors.size() != 1)
            {
                break MISSING_BLOCK_LABEL_99;
            }
            val$allFinished.setError((Exception)val$errors.get(0));
        }
        return null;
        task;
        obj;
        JVM INSTR monitorexit ;
        throw task;
        val$allFinished.setError(new AggregateException(val$errors));
        return null;
        if (val$isCancelled.get())
        {
            val$allFinished.setCancelled();
            return null;
        } else
        {
            val$allFinished.setResult(null);
            return null;
        }
    }

    ource(Object obj, ArrayList arraylist, AtomicBoolean atomicboolean, AtomicInteger atomicinteger, skCompletionSource skcompletionsource)
    {
        val$errorLock = obj;
        val$errors = arraylist;
        val$isCancelled = atomicboolean;
        val$count = atomicinteger;
        val$allFinished = skcompletionsource;
        super();
    }
}
