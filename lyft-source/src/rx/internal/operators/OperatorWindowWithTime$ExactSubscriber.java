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
        boolean flag;
        boolean flag1;
label0:
        {
            flag1 = true;
            flag = false;
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
        boolean flag2 = replaceSubject();
        if (!flag2)
        {
            synchronized (guard)
            {
                emitting = false;
            }
            return;
        }
        break MISSING_BLOCK_LABEL_96;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
_L4:
        obj2 = guard;
        obj2;
        JVM INSTR monitorenter ;
        obj1 = queue;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        emitting = false;
        obj2;
        JVM INSTR monitorexit ;
        return;
_L6:
        flag1 = flag;
        obj2;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
_L5:
        if (!flag)
        {
            synchronized (guard)
            {
                emitting = false;
            }
        }
        throw obj1;
_L2:
        queue = null;
        obj2;
        JVM INSTR monitorexit ;
        flag2 = drain(((List) (obj1)));
        if (flag2) goto _L4; else goto _L3
_L3:
        synchronized (guard)
        {
            emitting = false;
        }
        return;
        obj2;
        obj1;
        JVM INSTR monitorexit ;
        throw obj2;
        obj1;
        obj2;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
          goto _L5
        obj1;
        flag = false;
          goto _L6
        obj1;
        flag = flag1;
          goto _L6
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
        boolean flag;
        boolean flag1;
label0:
        {
            flag1 = true;
            flag = false;
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
        boolean flag2 = emitValue(obj);
        if (!flag2)
        {
            synchronized (guard)
            {
                emitting = false;
            }
            return;
        }
        break MISSING_BLOCK_LABEL_95;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
_L4:
        obj2 = guard;
        obj2;
        JVM INSTR monitorenter ;
        obj = queue;
        if (obj != null) goto _L2; else goto _L1
_L1:
        emitting = false;
        obj2;
        JVM INSTR monitorexit ;
        return;
_L6:
        flag1 = flag;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
_L5:
        if (!flag)
        {
            synchronized (guard)
            {
                emitting = false;
            }
        }
        throw obj;
_L2:
        queue = null;
        obj2;
        JVM INSTR monitorexit ;
        flag2 = drain(((List) (obj)));
        if (flag2) goto _L4; else goto _L3
_L3:
        synchronized (guard)
        {
            emitting = false;
        }
        return;
        obj2;
        obj;
        JVM INSTR monitorexit ;
        throw obj2;
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
          goto _L5
        obj;
        flag = false;
          goto _L6
        obj;
        flag = flag1;
          goto _L6
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
