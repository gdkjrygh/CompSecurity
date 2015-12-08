// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

// Referenced classes of package bolts:
//            BoltsExecutors, AndroidExecutors, Continuation, CancellationToken

public class Task
{

    public static final ExecutorService a = BoltsExecutors.a();
    public static final Executor b = AndroidExecutors.b();
    private static final Executor c = BoltsExecutors.b();
    private final Object d = new Object();
    private boolean e;
    private boolean f;
    private Object g;
    private Exception h;
    private List i;

    private Task()
    {
        i = new ArrayList();
    }

    public static TaskCompletionSource a()
    {
        Task task = new Task();
        task.getClass();
        return task. new TaskCompletionSource();
    }

    public static Task a(Exception exception)
    {
        TaskCompletionSource taskcompletionsource = a();
        taskcompletionsource.b(exception);
        return taskcompletionsource.a();
    }

    public static Task a(Object obj)
    {
        TaskCompletionSource taskcompletionsource = a();
        taskcompletionsource.b(obj);
        return taskcompletionsource.a();
    }

    static Exception a(Task task, Exception exception)
    {
        task.h = exception;
        return exception;
    }

    static Object a(Task task)
    {
        return task.d;
    }

    static Object a(Task task, Object obj)
    {
        task.g = obj;
        return obj;
    }

    static void a(TaskCompletionSource taskcompletionsource, Continuation continuation, Task task, Executor executor, CancellationToken cancellationtoken)
    {
        c(taskcompletionsource, continuation, task, executor, cancellationtoken);
    }

    static boolean a(Task task, boolean flag)
    {
        task.e = flag;
        return flag;
    }

    static void b(TaskCompletionSource taskcompletionsource, Continuation continuation, Task task, Executor executor, CancellationToken cancellationtoken)
    {
        d(taskcompletionsource, continuation, task, executor, cancellationtoken);
    }

    static boolean b(Task task)
    {
        return task.e;
    }

    static boolean b(Task task, boolean flag)
    {
        task.f = flag;
        return flag;
    }

    private static void c(TaskCompletionSource taskcompletionsource, Continuation continuation, Task task, Executor executor, CancellationToken cancellationtoken)
    {
        executor.execute(new Runnable(cancellationtoken, taskcompletionsource, continuation, task) {

            final CancellationToken a;
            final TaskCompletionSource b;
            final Continuation c;
            final Task d;

            public void run()
            {
                if (a != null && a.a())
                {
                    b.c();
                    return;
                }
                try
                {
                    Object obj = c.then(d);
                    b.b(obj);
                    return;
                }
                catch (CancellationException cancellationexception)
                {
                    b.c();
                    return;
                }
                catch (Exception exception)
                {
                    b.b(exception);
                }
            }

            
            {
                a = cancellationtoken;
                b = taskcompletionsource;
                c = continuation;
                d = task;
                super();
            }
        });
    }

    static void c(Task task)
    {
        task.h();
    }

    private static void d(TaskCompletionSource taskcompletionsource, Continuation continuation, Task task, Executor executor, CancellationToken cancellationtoken)
    {
        executor.execute(new Runnable(cancellationtoken, taskcompletionsource, continuation, task) {

            final CancellationToken a;
            final TaskCompletionSource b;
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
                ((Task) (obj)).a(new Continuation(this) {

                    final _cls14 a;

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
                a = _pcls14;
                super();
            }
                });
                return;
            }

            
            {
                a = cancellationtoken;
                b = taskcompletionsource;
                c = continuation;
                d = task;
                super();
            }
        });
    }

    public static Task g()
    {
        TaskCompletionSource taskcompletionsource = a();
        taskcompletionsource.c();
        return taskcompletionsource.a();
    }

    private void h()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = i.iterator();
_L1:
        Continuation continuation;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_65;
        }
        continuation = (Continuation)iterator.next();
        continuation.then(this);
          goto _L1
        Object obj1;
        obj1;
        throw obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        throw new RuntimeException(((Throwable) (obj1)));
        i = null;
        obj;
        JVM INSTR monitorexit ;
    }

    public Task a(Continuation continuation)
    {
        return a(continuation, c, null);
    }

    public Task a(Continuation continuation, Executor executor)
    {
        return b(continuation, executor, null);
    }

    public Task a(Continuation continuation, Executor executor, CancellationToken cancellationtoken)
    {
        TaskCompletionSource taskcompletionsource = a();
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = b();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        i.add(new Continuation(taskcompletionsource, continuation, executor, cancellationtoken) {

            final TaskCompletionSource a;
            final Continuation b;
            final Executor c;
            final CancellationToken d;
            final Task e;

            public Void a(Task task)
            {
                Task.a(a, b, task, c, d);
                return null;
            }

            public Object then(Task task)
            {
                return a(task);
            }

            
            {
                e = Task.this;
                a = taskcompletionsource;
                b = continuation;
                c = executor;
                d = cancellationtoken;
                super();
            }
        });
        obj;
        JVM INSTR monitorexit ;
        if (flag)
        {
            c(taskcompletionsource, continuation, this, executor, cancellationtoken);
        }
        return taskcompletionsource.a();
        continuation;
        obj;
        JVM INSTR monitorexit ;
        throw continuation;
    }

    public Task b(Continuation continuation)
    {
        return c(continuation, c, null);
    }

    public Task b(Continuation continuation, Executor executor, CancellationToken cancellationtoken)
    {
        TaskCompletionSource taskcompletionsource = a();
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = b();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        i.add(new Continuation(taskcompletionsource, continuation, executor, cancellationtoken) {

            final TaskCompletionSource a;
            final Continuation b;
            final Executor c;
            final CancellationToken d;
            final Task e;

            public Void a(Task task)
            {
                Task.b(a, b, task, c, d);
                return null;
            }

            public Object then(Task task)
            {
                return a(task);
            }

            
            {
                e = Task.this;
                a = taskcompletionsource;
                b = continuation;
                c = executor;
                d = cancellationtoken;
                super();
            }
        });
        obj;
        JVM INSTR monitorexit ;
        if (flag)
        {
            d(taskcompletionsource, continuation, this, executor, cancellationtoken);
        }
        return taskcompletionsource.a();
        continuation;
        obj;
        JVM INSTR monitorexit ;
        throw continuation;
    }

    public boolean b()
    {
        boolean flag;
        synchronized (d)
        {
            flag = e;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Task c(Continuation continuation, Executor executor, CancellationToken cancellationtoken)
    {
        return a(new Continuation(cancellationtoken, continuation) {

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

            
            {
                c = Task.this;
                a = cancellationtoken;
                b = continuation;
                super();
            }
        }, executor);
    }

    public boolean c()
    {
        boolean flag;
        synchronized (d)
        {
            flag = f;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean d()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (h != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object e()
    {
        Object obj1;
        synchronized (d)
        {
            obj1 = g;
        }
        return obj1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Exception f()
    {
        Exception exception;
        synchronized (d)
        {
            exception = h;
        }
        return exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }


    // Unreferenced inner class bolts/Task$1

/* anonymous class */
    final class _cls1
        implements Runnable
    {

        final TaskCompletionSource a;

        public void run()
        {
            a.b(null);
        }
    }


    private class TaskCompletionSource
    {

        final Task a;

        public Task a()
        {
            return a;
        }

        public boolean a(Exception exception)
        {
label0:
            {
                synchronized (Task.a(a))
                {
                    if (!Task.b(a))
                    {
                        break label0;
                    }
                }
                return false;
            }
            Task.a(a, true);
            Task.a(a, exception);
            Task.a(a).notifyAll();
            Task.c(a);
            obj;
            JVM INSTR monitorexit ;
            return true;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public boolean a(Object obj)
        {
label0:
            {
                synchronized (Task.a(a))
                {
                    if (!Task.b(a))
                    {
                        break label0;
                    }
                }
                return false;
            }
            Task.a(a, true);
            Task.a(a, obj);
            Task.a(a).notifyAll();
            Task.c(a);
            obj1;
            JVM INSTR monitorexit ;
            return true;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public void b(Exception exception)
        {
            if (!a(exception))
            {
                throw new IllegalStateException("Cannot set the error on a completed task.");
            } else
            {
                return;
            }
        }

        public void b(Object obj)
        {
            if (!a(obj))
            {
                throw new IllegalStateException("Cannot set the result of a completed task.");
            } else
            {
                return;
            }
        }

        public boolean b()
        {
label0:
            {
                synchronized (Task.a(a))
                {
                    if (!Task.b(a))
                    {
                        break label0;
                    }
                }
                return false;
            }
            Task.a(a, true);
            Task.b(a, true);
            Task.a(a).notifyAll();
            Task.c(a);
            obj;
            JVM INSTR monitorexit ;
            return true;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void c()
        {
            if (!b())
            {
                throw new IllegalStateException("Cannot cancel a completed task.");
            } else
            {
                return;
            }
        }

        private TaskCompletionSource()
        {
            a = Task.this;
            super();
        }

    }

}
