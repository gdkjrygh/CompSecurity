// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.util.concurrent.CancellationException;

// Referenced classes of package bolts:
//            Continuation, CancellationToken, Task

class 
    implements Continuation
{

    final a a;

    public Void a(Task task)
    {
        if (a.a != null && a.a.a())
        {
            a.a.c();
            return null;
        }
        if (task.c())
        {
            a.a.c();
            return null;
        }
        if (task.d())
        {
            a.a.b(task.f());
            return null;
        } else
        {
            a.a.b(task.e());
            return null;
        }
    }

    public Object then(Task task)
    {
        return a(task);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class bolts/Task$14

/* anonymous class */
    final class Task._cls14
        implements Runnable
    {

        final CancellationToken a;
        final Task.TaskCompletionSource b;
        final Continuation c;
        final Task d;

        public void run()
        {
            if (a != null && a.a())
            {
                b.c();
                return;
            }
            Object obj = (Task)c.then(d);
            if (obj == null)
            {
                try
                {
                    b.b(null);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    b.c();
                    return;
                }
                catch (Exception exception)
                {
                    b.b(exception);
                }
                break MISSING_BLOCK_LABEL_87;
            }
            ((Task) (obj)).a(new Task._cls14._cls1(this));
            return;
        }

            
            {
                a = cancellationtoken;
                b = taskcompletionsource;
                c = continuation;
                d = task;
                super();
            }
    }

}
