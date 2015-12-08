// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;


// Referenced classes of package bolts:
//            Continuation, Task, CancellationToken

class ct
    implements Continuation
{

    final CancellationToken a;
    final Continuation b;
    final Task c;

    public Task a(Task task)
    {
        if (a != null && a.a())
        {
            return Task.g();
        }
        if (task.d())
        {
            return Task.a(task.f());
        }
        if (task.c())
        {
            return Task.g();
        } else
        {
            return task.a(b);
        }
    }

    public Object then(Task task)
    {
        return a(task);
    }

    tion(Task task, CancellationToken cancellationtoken, Continuation continuation)
    {
        c = task;
        a = cancellationtoken;
        b = continuation;
        super();
    }
}
