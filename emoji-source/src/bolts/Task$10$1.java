// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;


// Referenced classes of package bolts:
//            Continuation, Task

class 
    implements Continuation
{

    final sult this$0;

    public volatile Object then(Task task)
        throws Exception
    {
        return then(task);
    }

    public Void then(Task task)
    {
        if (task.isCancelled())
        {
            tcs.setCancelled();
        } else
        if (task.isFaulted())
        {
            tcs.setError(task.getError());
        } else
        {
            tcs.setResult(task.getResult());
        }
        return null;
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }

    // Unreferenced inner class bolts/Task$10

/* anonymous class */
    static final class Task._cls10
        implements Runnable
    {

        final Continuation val$continuation;
        final Task val$task;
        final Task.TaskCompletionSource val$tcs;

        public void run()
        {
            Task task1 = (Task)continuation.then(task);
            if (task1 == null)
            {
                try
                {
                    tcs.setResult(null);
                    return;
                }
                catch (Exception exception)
                {
                    tcs.setError(exception);
                }
                break MISSING_BLOCK_LABEL_53;
            }
            task1.continueWith(new Task._cls10._cls1());
            return;
        }

            
            {
                continuation = continuation1;
                task = task1;
                tcs = taskcompletionsource;
                super();
            }
    }

}
