// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.ConcurrentLinkedQueue;
import rx.Subscriber;
import rx.functions.Action0;
import rx.subscriptions.Subscriptions;

// Referenced classes of package rx.internal.operators:
//            BufferUntilSubscriber, NotificationLite

static final class state
    implements rx..OnSubscribeAction
{

    final state state;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        boolean flag;
        if (!state.ef(null, subscriber))
        {
            break MISSING_BLOCK_LABEL_149;
        }
        subscriber.add(Subscriptions.create(new Action0() {

            final BufferUntilSubscriber.OnSubscribeAction this$0;

            public void call()
            {
                state.observerRef = BufferUntilSubscriber.access$000();
            }

            
            {
                this$0 = BufferUntilSubscriber.OnSubscribeAction.this;
                super();
            }
        }));
        flag = false;
        subscriber = ((Subscriber) (state.state));
        subscriber;
        JVM INSTR monitorenter ;
        if (state.state)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        state.state = true;
        flag = true;
        subscriber;
        JVM INSTR monitorexit ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        subscriber = NotificationLite.instance();
_L2:
label0:
        do
        {
            Object obj = state.state.poll();
            Exception exception;
            if (obj != null)
            {
                subscriber.accept(state.state, obj);
            } else
            {
label1:
                {
                    synchronized (state.state)
                    {
                        if (!state.state.isEmpty())
                        {
                            break label1;
                        }
                        state.state = false;
                    }
                    return;
                }
            }
        } while (true);
        exception;
        subscriber;
        JVM INSTR monitorexit ;
        throw exception;
        obj1;
        JVM INSTR monitorexit ;
        if (true) goto _L2; else goto _L1
_L1:
        subscriber;
        obj1;
        JVM INSTR monitorexit ;
        throw subscriber;
        subscriber.onError(new IllegalStateException("Only one subscriber allowed!"));
    }

    public _cls1.this._cls0(_cls1.this._cls0 _pcls0)
    {
        state = _pcls0;
    }
}
