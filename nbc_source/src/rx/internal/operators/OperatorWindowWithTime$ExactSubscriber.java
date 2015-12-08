// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Action0;
import rx.observers.SerializedSubscriber;
import rx.subscriptions.Subscriptions;

// Referenced classes of package rx.internal.operators:
//            OperatorWindowWithTime, NotificationLite, BufferUntilSubscriber

final class unsubscribe extends Subscriber
{

    final Subscriber child;
    boolean emitting;
    final Object guard = new Object();
    List queue;
    volatile nextWindow state;
    final OperatorWindowWithTime this$0;
    final rx.me worker;

    void complete()
    {
        Observer observer = state.state;
        state = state.state();
        if (observer != null)
        {
            observer.onCompleted();
        }
        child.onCompleted();
        unsubscribe();
    }

    boolean drain(List list)
    {
        if (list != null)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                Object obj = list.next();
                if (obj == OperatorWindowWithTime.NEXT_SUBJECT)
                {
                    if (!replaceSubject())
                    {
                        return false;
                    }
                } else
                {
                    if (OperatorWindowWithTime.nl.isError(obj))
                    {
                        error(OperatorWindowWithTime.nl.getError(obj));
                        return true;
                    }
                    if (OperatorWindowWithTime.nl.isCompleted(obj))
                    {
                        complete();
                        return true;
                    }
                    if (!emitValue(obj))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    boolean emitValue(Object obj)
    {
        emitValue emitvalue1 = state;
        emitValue emitvalue = emitvalue1;
        if (emitvalue1.state == null)
        {
            if (!replaceSubject())
            {
                return false;
            }
            emitvalue = state;
        }
        emitvalue.state.onNext(obj);
        if (emitvalue.state == size - 1)
        {
            emitvalue.state.onCompleted();
            obj = emitvalue.state();
        } else
        {
            obj = emitvalue.state();
        }
        state = ((state) (obj));
        return true;
    }

    void error(Throwable throwable)
    {
        Observer observer = state.state;
        state = state.state();
        if (observer != null)
        {
            observer.onError(throwable);
        }
        child.onError(throwable);
        unsubscribe();
    }

    void nextWindow()
    {
label0:
        {
            synchronized (guard)
            {
                if (!emitting)
                {
                    break label0;
                }
                if (queue == null)
                {
                    queue = new ArrayList();
                }
                queue.add(OperatorWindowWithTime.NEXT_SUBJECT);
            }
            return;
        }
        emitting = true;
        obj;
        JVM INSTR monitorexit ;
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = false;
        flag = flag2;
        boolean flag3 = replaceSubject();
        if (!flag3)
        {
            if (true)
            {
                synchronized (guard)
                {
                    emitting = false;
                }
                return;
            }
            break MISSING_BLOCK_LABEL_248;
        }
        break MISSING_BLOCK_LABEL_104;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
_L2:
        flag = flag2;
        obj1 = guard;
        flag = flag2;
        obj1;
        JVM INSTR monitorenter ;
        flag = flag1;
        obj3 = queue;
        if (obj3 != null)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        flag = flag1;
        emitting = false;
        flag = true;
        obj1;
        JVM INSTR monitorexit ;
        if (false)
        {
            synchronized (guard)
            {
                emitting = false;
            }
            return;
        }
        break MISSING_BLOCK_LABEL_248;
        obj3;
        obj1;
        JVM INSTR monitorexit ;
        throw obj3;
        flag = flag1;
        queue = null;
        flag = flag1;
        obj1;
        JVM INSTR monitorexit ;
        flag = flag2;
        flag3 = drain(((List) (obj3)));
        if (flag3) goto _L2; else goto _L1
_L1:
        if (true)
        {
            synchronized (guard)
            {
                emitting = false;
            }
            return;
        }
        break MISSING_BLOCK_LABEL_248;
        exception2;
        obj1;
        JVM INSTR monitorexit ;
        throw exception2;
        Exception exception3;
        exception3;
        obj1;
        JVM INSTR monitorexit ;
        throw exception3;
        exception3;
        if (!flag)
        {
            synchronized (guard)
            {
                emitting = false;
            }
        }
        throw exception3;
        exception4;
        obj2;
        JVM INSTR monitorexit ;
        throw exception4;
    }

    public void onCompleted()
    {
label0:
        {
            synchronized (guard)
            {
                if (!emitting)
                {
                    break label0;
                }
                if (queue == null)
                {
                    queue = new ArrayList();
                }
                queue.add(OperatorWindowWithTime.nl.completed());
            }
            return;
        }
        List list;
        list = queue;
        queue = null;
        emitting = true;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            drain(list);
        }
        catch (Throwable throwable)
        {
            error(throwable);
            return;
        }
        complete();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onError(Throwable throwable)
    {
label0:
        {
            synchronized (guard)
            {
                if (!emitting)
                {
                    break label0;
                }
                queue = Collections.singletonList(OperatorWindowWithTime.nl.error(throwable));
            }
            return;
        }
        queue = null;
        emitting = true;
        obj;
        JVM INSTR monitorexit ;
        error(throwable);
        return;
        throwable;
        obj;
        JVM INSTR monitorexit ;
        throw throwable;
    }

    public void onNext(Object obj)
    {
label0:
        {
            synchronized (guard)
            {
                if (!emitting)
                {
                    break label0;
                }
                if (queue == null)
                {
                    queue = new ArrayList();
                }
                queue.add(obj);
            }
            return;
        }
        emitting = true;
        obj1;
        JVM INSTR monitorexit ;
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = false;
        flag = flag2;
        boolean flag3 = emitValue(obj);
        if (!flag3)
        {
            if (true)
            {
                synchronized (guard)
                {
                    emitting = false;
                }
                return;
            }
            break MISSING_BLOCK_LABEL_247;
        }
        break MISSING_BLOCK_LABEL_103;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        flag = flag2;
        obj = guard;
        flag = flag2;
        obj;
        JVM INSTR monitorenter ;
        flag = flag1;
        obj2 = queue;
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        flag = flag1;
        emitting = false;
        flag = true;
        obj;
        JVM INSTR monitorexit ;
        if (false)
        {
            synchronized (guard)
            {
                emitting = false;
            }
            return;
        }
        break MISSING_BLOCK_LABEL_247;
        obj2;
        obj;
        JVM INSTR monitorexit ;
        throw obj2;
        flag = flag1;
        queue = null;
        flag = flag1;
        obj;
        JVM INSTR monitorexit ;
        flag = flag2;
        flag3 = drain(((List) (obj2)));
        if (flag3) goto _L2; else goto _L1
_L1:
        if (true)
        {
            synchronized (guard)
            {
                emitting = false;
            }
            return;
        }
        break MISSING_BLOCK_LABEL_247;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Exception exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        exception1;
        if (!flag)
        {
            synchronized (guard)
            {
                emitting = false;
            }
        }
        throw exception1;
        exception2;
        obj;
        JVM INSTR monitorexit ;
        throw exception2;
    }

    public void onStart()
    {
        request(0x7fffffffffffffffL);
    }

    boolean replaceSubject()
    {
        Observer observer = state.state;
        if (observer != null)
        {
            observer.onCompleted();
        }
        if (child.isUnsubscribed())
        {
            state = state.state();
            unsubscribe();
            return false;
        } else
        {
            BufferUntilSubscriber bufferuntilsubscriber = BufferUntilSubscriber.create();
            state = state.state(bufferuntilsubscriber, bufferuntilsubscriber);
            child.onNext(bufferuntilsubscriber);
            return true;
        }
    }

    void scheduleExact()
    {
        worker.worker(new Action0() {

            final OperatorWindowWithTime.ExactSubscriber this$1;

            public void call()
            {
                nextWindow();
            }

            
            {
                this$1 = OperatorWindowWithTime.ExactSubscriber.this;
                super();
            }
        }, 0L, timespan, unit);
    }

    public _cls2.this._cls1(Subscriber subscriber, rx.me me)
    {
        this.this$0 = OperatorWindowWithTime.this;
        super();
        child = new SerializedSubscriber(subscriber);
        worker = me;
        state = state();
        subscriber.add(Subscriptions.create(new Action0() {

            final OperatorWindowWithTime.ExactSubscriber this$1;
            final OperatorWindowWithTime val$this$0;

            public void call()
            {
                if (state.consumer == null)
                {
                    unsubscribe();
                }
            }

            
            {
                this$1 = OperatorWindowWithTime.ExactSubscriber.this;
                this$0 = operatorwindowwithtime;
                super();
            }
        }));
    }
}
