// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Ordering;
import java.lang.reflect.Constructor;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.util.concurrent:
//            MoreExecutors, ListenableFuture, AsyncFunction, AbstractFuture, 
//            Uninterruptibles

public final class Futures
{
    static final class ChainingListenableFuture extends AbstractFuture
        implements Runnable
    {

        private AsyncFunction function;
        private ListenableFuture inputFuture;
        private final CountDownLatch outputCreated;
        private volatile ListenableFuture outputFuture;

        private static void cancel(Future future, boolean flag)
        {
            if (future != null)
            {
                future.cancel(flag);
            }
        }

        public final boolean cancel(boolean flag)
        {
            if (super.cancel(flag))
            {
                cancel(((Future) (inputFuture)), flag);
                cancel(((Future) (outputFuture)), flag);
                return true;
            } else
            {
                return false;
            }
        }

        public final void run()
        {
            Object obj = Uninterruptibles.getUninterruptibly(inputFuture);
            obj = (ListenableFuture)Preconditions.checkNotNull(function.apply(obj), "AsyncFunction may not return null.");
            outputFuture = ((ListenableFuture) (obj));
            if (!isCancelled())
            {
                break MISSING_BLOCK_LABEL_126;
            }
            ((ListenableFuture) (obj)).cancel(wasInterrupted());
            outputFuture = null;
            function = null;
            inputFuture = null;
            outputCreated.countDown();
            return;
            obj;
            cancel(false);
            function = null;
            inputFuture = null;
            outputCreated.countDown();
            return;
            obj;
            setException(((ExecutionException) (obj)).getCause());
            function = null;
            inputFuture = null;
            outputCreated.countDown();
            return;
            ((ListenableFuture) (obj)).addListener(((_cls1) (obj)). new Runnable() {

                final ChainingListenableFuture this$0;
                final ListenableFuture val$outputFuture;

                public final void run()
                {
                    set(Uninterruptibles.getUninterruptibly(outputFuture));
                    ChainingListenableFuture.this.outputFuture = null;
                    return;
                    Object obj;
                    obj;
                    cancel(false);
                    ChainingListenableFuture.this.outputFuture = null;
                    return;
                    obj;
                    setException(((ExecutionException) (obj)).getCause());
                    ChainingListenableFuture.this.outputFuture = null;
                    return;
                    obj;
                    ChainingListenableFuture.this.outputFuture = null;
                    throw obj;
                }

            
            {
                this$0 = final_chaininglistenablefuture;
                outputFuture = ListenableFuture.this;
                super();
            }
            }, MoreExecutors.sameThreadExecutor());
            function = null;
            inputFuture = null;
            outputCreated.countDown();
            return;
            Object obj1;
            obj1;
            setException(((UndeclaredThrowableException) (obj1)).getCause());
            function = null;
            inputFuture = null;
            outputCreated.countDown();
            return;
            obj1;
            setException(((Throwable) (obj1)));
            function = null;
            inputFuture = null;
            outputCreated.countDown();
            return;
            obj1;
            function = null;
            inputFuture = null;
            outputCreated.countDown();
            throw obj1;
        }


/*
        static ListenableFuture access$302(ChainingListenableFuture chaininglistenablefuture, ListenableFuture listenablefuture)
        {
            chaininglistenablefuture.outputFuture = listenablefuture;
            return listenablefuture;
        }

*/

        private ChainingListenableFuture(AsyncFunction asyncfunction, ListenableFuture listenablefuture)
        {
            outputCreated = new CountDownLatch(1);
            function = (AsyncFunction)Preconditions.checkNotNull(asyncfunction);
            inputFuture = (ListenableFuture)Preconditions.checkNotNull(listenablefuture);
        }

    }

    static final class ImmediateFailedFuture extends ImmediateFuture
    {

        private final Throwable thrown;

        public final Object get()
            throws ExecutionException
        {
            throw new ExecutionException(thrown);
        }

        ImmediateFailedFuture(Throwable throwable)
        {
            thrown = throwable;
        }
    }

    static abstract class ImmediateFuture
        implements ListenableFuture
    {

        private static final Logger log = Logger.getLogger(com/google/common/util/concurrent/Futures$ImmediateFuture.getName());

        public final void addListener(Runnable runnable, Executor executor)
        {
            Preconditions.checkNotNull(runnable, "Runnable was null.");
            Preconditions.checkNotNull(executor, "Executor was null.");
            try
            {
                executor.execute(runnable);
                return;
            }
            catch (RuntimeException runtimeexception)
            {
                log.log(Level.SEVERE, (new StringBuilder("RuntimeException while executing runnable ")).append(runnable).append(" with executor ").append(executor).toString(), runtimeexception);
            }
        }

        public boolean cancel(boolean flag)
        {
            return false;
        }

        public abstract Object get()
            throws ExecutionException;

        public Object get(long l, TimeUnit timeunit)
            throws ExecutionException
        {
            Preconditions.checkNotNull(timeunit);
            return get();
        }

        public boolean isCancelled()
        {
            return false;
        }

        public boolean isDone()
        {
            return true;
        }


        private ImmediateFuture()
        {
        }

    }

    static final class ImmediateSuccessfulFuture extends ImmediateFuture
    {

        private final Object value;

        public final Object get()
        {
            return value;
        }

        ImmediateSuccessfulFuture(Object obj)
        {
            value = obj;
        }
    }


    private static final AsyncFunction DEREFERENCER = new AsyncFunction() {

        private static ListenableFuture apply(ListenableFuture listenablefuture)
        {
            return listenablefuture;
        }

        public final volatile ListenableFuture apply(Object obj)
            throws Exception
        {
            return apply((ListenableFuture)obj);
        }

    };
    private static final Ordering WITH_STRING_PARAM_FIRST = Ordering.natural().onResultOf(new Function() {

        private static Boolean apply(Constructor constructor)
        {
            return Boolean.valueOf(Arrays.asList(constructor.getParameterTypes()).contains(java/lang/String));
        }

        public final volatile Object apply(Object obj)
        {
            return apply((Constructor)obj);
        }

    }).reverse();

    public static ListenableFuture immediateFailedFuture(Throwable throwable)
    {
        Preconditions.checkNotNull(throwable);
        return new ImmediateFailedFuture(throwable);
    }

    public static ListenableFuture immediateFuture(Object obj)
    {
        return new ImmediateSuccessfulFuture(obj);
    }

    public static ListenableFuture transform(ListenableFuture listenablefuture, Function function)
    {
        return transform(listenablefuture, function, ((Executor) (MoreExecutors.sameThreadExecutor())));
    }

    private static ListenableFuture transform(ListenableFuture listenablefuture, Function function, Executor executor)
    {
        Preconditions.checkNotNull(function);
        return transform(listenablefuture, new AsyncFunction(function) {

            final Function val$function;

            public final ListenableFuture apply(Object obj)
            {
                return Futures.immediateFuture(function.apply(obj));
            }

            
            {
                function = function1;
                super();
            }
        }, executor);
    }

    private static ListenableFuture transform(ListenableFuture listenablefuture, AsyncFunction asyncfunction, Executor executor)
    {
        asyncfunction = new ChainingListenableFuture(asyncfunction, listenablefuture);
        listenablefuture.addListener(asyncfunction, executor);
        return asyncfunction;
    }

}
