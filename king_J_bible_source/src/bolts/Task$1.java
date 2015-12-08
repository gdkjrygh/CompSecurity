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

    public Task then(Task task)
        throws Exception
    {
        if (task.isCancelled())
        {
            return Task.cancelled();
        }
        if (task.isFaulted())
        {
            return Task.forError(task.getError());
        } else
        {
            return Task.forResult(null);
        }
    }

    public volatile Object then(Task task)
        throws Exception
    {
        return then(task);
    }

    eption()
    {
        this$0 = Task.this;
        super();
    }
}
