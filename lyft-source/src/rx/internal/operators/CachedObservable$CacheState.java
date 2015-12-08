// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.internal.util.LinkedArrayList;
import rx.subscriptions.SerialSubscription;

// Referenced classes of package rx.internal.operators:
//            NotificationLite

final class EMPTY extends LinkedArrayList
    implements Observer
{

    static final cer EMPTY[] = new cer[0];
    final SerialSubscription connection = new SerialSubscription();
    volatile boolean isConnected;
    final NotificationLite nl = NotificationLite.instance();
    volatile cer producers[];
    final Observable source;
    boolean sourceDone;

    public void addProducer(cer cer)
    {
        SerialSubscription serialsubscription = connection;
        serialsubscription;
        JVM INSTR monitorenter ;
        cer acer1[];
        int i;
        cer acer[] = producers;
        i = acer.length;
        acer1 = new cer[i + 1];
        System.arraycopy(acer, 0, acer1, 0, i);
        acer1[i] = cer;
        producers = acer1;
        serialsubscription;
        JVM INSTR monitorexit ;
        return;
        cer;
        serialsubscription;
        JVM INSTR monitorexit ;
        throw cer;
    }

    public void connect()
    {
        Subscriber subscriber = new Subscriber() {

            final CachedObservable.CacheState this$0;

            public void onCompleted()
            {
                CachedObservable.CacheState.this.onCompleted();
            }

            public void onError(Throwable throwable)
            {
                CachedObservable.CacheState.this.onError(throwable);
            }

            public void onNext(Object obj)
            {
                CachedObservable.CacheState.this.onNext(obj);
            }

            
            {
                this$0 = CachedObservable.CacheState.this;
                super();
            }
        };
        connection.set(subscriber);
        source.unsafeSubscribe(subscriber);
        isConnected = true;
    }

    void dispatch()
    {
        cer acer[] = producers;
        int j = acer.length;
        for (int i = 0; i < j; i++)
        {
            acer[i].replay();
        }

    }

    public void onCompleted()
    {
        if (!sourceDone)
        {
            sourceDone = true;
            add(nl.completed());
            connection.unsubscribe();
            dispatch();
        }
    }

    public void onError(Throwable throwable)
    {
        if (!sourceDone)
        {
            sourceDone = true;
            add(nl.error(throwable));
            connection.unsubscribe();
            dispatch();
        }
    }

    public void onNext(Object obj)
    {
        if (!sourceDone)
        {
            add(nl.next(obj));
            dispatch();
        }
    }

    public void removeProducer(cer cer)
    {
        int i = 0;
        SerialSubscription serialsubscription = connection;
        serialsubscription;
        JVM INSTR monitorenter ;
        cer acer[];
        int j;
        acer = producers;
        j = acer.length;
_L6:
        if (i >= j) goto _L2; else goto _L1
_L1:
        if (!acer[i].equals(cer)) goto _L4; else goto _L3
_L3:
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        serialsubscription;
        JVM INSTR monitorexit ;
        return;
        if (j != 1)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        producers = EMPTY;
        serialsubscription;
        JVM INSTR monitorexit ;
        return;
        cer;
        serialsubscription;
        JVM INSTR monitorexit ;
        throw cer;
        cer = new cer[j - 1];
        System.arraycopy(acer, 0, cer, 0, i);
        System.arraycopy(acer, i + 1, cer, i, j - i - 1);
        producers = cer;
        serialsubscription;
        JVM INSTR monitorexit ;
        return;
_L2:
        i = -1;
        if (true) goto _L3; else goto _L4
_L4:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }


    public _cls1.this._cls0(Observable observable, int i)
    {
        super(i);
        source = observable;
        producers = EMPTY;
    }
}
