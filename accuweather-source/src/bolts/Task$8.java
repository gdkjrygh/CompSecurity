// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;


// Referenced classes of package bolts:
//            Continuation, Task

class ect
    implements Continuation
{

    final Task this$0;
    final Continuation val$continuation;

    public Task then(Task task)
    {
        if (task.isFaulted())
        {
            return Task.forError(task.getError());
        }
        if (task.isCancelled())
        {
            return Task.cancelled();
        } else
        {
            return task.continueWithTask(val$continuation);
        }
    }

    public volatile Object then(Task task)
        throws Exception
    {
        return then(task);
    }

    ation()
    {
        this$0 = final_task;
        val$continuation = Continuation.this;
        super();
    }
}
