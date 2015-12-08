// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicReference;
import rx.Subscription;
import rx.functions.Action0;

// Referenced classes of package rx.internal.operators:
//            OperatorMulticast

class e
    implements Action0
{

    final OperatorMulticast this$0;
    final AtomicReference val$gs;

    public void call()
    {
label0:
        {
            rx.Subscriber subscriber;
            synchronized (guard)
            {
                if (OperatorMulticast.access$000(OperatorMulticast.this) != val$gs.get())
                {
                    break label0;
                }
                subscriber = OperatorMulticast.access$100(OperatorMulticast.this);
                OperatorMulticast.access$102(OperatorMulticast.this, null);
                OperatorMulticast.access$002(OperatorMulticast.this, null);
                connectedSubject.set(null);
            }
            if (subscriber != null)
            {
                subscriber.unsubscribe();
            }
            return;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    e()
    {
        this$0 = final_operatormulticast;
        val$gs = AtomicReference.this;
        super();
    }
}
