// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.util.concurrent.CancellationException;

// Referenced classes of package bolts:
//            Task, CancellationToken, Continuation

final class ct
    implements Runnable
{

    final CancellationToken a;
    final kCompletionSource b;
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
        ((Task) (obj)).a(new Continuation() {

            final Task._cls14 a;

            public Void a(Task task)
            {
                if (a.a != null && a.a.a())
                {
                    a.b.c();
                    return null;
                }
                if (task.c())
                {
                    a.b.c();
                    return null;
                }
                if (task.d())
                {
                    a.b.b(task.f());
                    return null;
                } else
                {
                    a.b.b(task.e());
                    return null;
                }
            }

            public Object then(Task task)
            {
                return a(task);
            }

            
            {
                a = Task._cls14.this;
                super();
            }
        });
        return;
    }

    tion(CancellationToken cancellationtoken, kCompletionSource kcompletionsource, Continuation continuation, Task task)
    {
        a = cancellationtoken;
        b = kcompletionsource;
        c = continuation;
        d = task;
        super();
    }
}
