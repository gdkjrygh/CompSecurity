// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;


// Referenced classes of package bolts:
//            Task, Continuation

static final class ect
    implements Runnable
{

    final Continuation val$continuation;
    final Task val$task;
    final skCompletionSource val$tcs;

    public void run()
    {
        try
        {
            Object obj = val$continuation.then(val$task);
            val$tcs.setResult(obj);
            return;
        }
        catch (Exception exception)
        {
            val$tcs.setError(exception);
        }
    }

    ource(Continuation continuation1, Task task1, skCompletionSource skcompletionsource)
    {
        val$continuation = continuation1;
        val$task = task1;
        val$tcs = skcompletionsource;
        super();
    }
}
