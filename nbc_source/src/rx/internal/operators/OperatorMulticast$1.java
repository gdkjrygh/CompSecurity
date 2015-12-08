// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import rx.Subscriber;
import rx.subjects.Subject;

// Referenced classes of package rx.internal.operators:
//            OperatorMulticast

class val.waitingForConnect
    implements rx.be
{

    final AtomicReference val$connectedSubject;
    final Object val$guard;
    final List val$waitingForConnect;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        Object obj = val$guard;
        obj;
        JVM INSTR monitorenter ;
        if (val$connectedSubject.get() != null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        val$waitingForConnect.add(subscriber);
_L2:
        return;
        ((Subject)val$connectedSubject.get()).unsafeSubscribe(subscriber);
        if (true) goto _L2; else goto _L1
_L1:
        subscriber;
        obj;
        JVM INSTR monitorexit ;
        throw subscriber;
    }

    e()
    {
        val$guard = obj;
        val$connectedSubject = atomicreference;
        val$waitingForConnect = list;
        super();
    }
}
