// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Func1;
import rx.observers.SerializedSubscriber;
import rx.subscriptions.CompositeSubscription;

// Referenced classes of package rx.internal.operators:
//            OperatorWindowWithStartEndObservable, BufferUntilSubscriber

final class csub extends Subscriber
{

    final Subscriber child;
    final List chunks = new LinkedList();
    final CompositeSubscription csub;
    boolean done;
    final Object guard = new Object();
    final OperatorWindowWithStartEndObservable this$0;

    void beginWindow(Object obj)
    {
        final  s;
label0:
        {
            s = createSerializedSubject();
            synchronized (guard)
            {
                if (!done)
                {
                    break label0;
                }
            }
            return;
        }
        chunks.add(s);
        obj1;
        JVM INSTR monitorexit ;
        child.onNext(s.producer);
        try
        {
            obj = (Observable)windowClosingSelector.call(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            onError(((Throwable) (obj)));
            return;
        }
        s = new Subscriber() {

            boolean once;
            final OperatorWindowWithStartEndObservable.SourceSubscriber this$1;
            final OperatorWindowWithStartEndObservable.SerializedSubject val$s;

            public void onCompleted()
            {
                if (once)
                {
                    once = false;
                    endWindow(s);
                    csub.remove(this);
                }
            }

            public void onError(Throwable throwable)
            {
            }

            public void onNext(Object obj2)
            {
                onCompleted();
            }

            
            {
                this$1 = OperatorWindowWithStartEndObservable.SourceSubscriber.this;
                s = serializedsubject;
                super();
                once = true;
            }
        };
        csub.add(s);
        ((Observable) (obj)).unsafeSubscribe(s);
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

     createSerializedSubject()
    {
        BufferUntilSubscriber bufferuntilsubscriber = BufferUntilSubscriber.create();
        return new (bufferuntilsubscriber, bufferuntilsubscriber);
    }

    void endWindow( )
    {
label0:
        {
            synchronized (guard)
            {
                if (!done)
                {
                    break label0;
                }
            }
            return;
        }
        Iterator iterator;
        iterator = chunks.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_80;
            }
        } while (()iterator.next() != );
        boolean flag = true;
        iterator.remove();
_L1:
        obj;
        JVM INSTR monitorexit ;
        if (flag)
        {
            .consumer.onCompleted();
            return;
        } else
        {
            return;
        }
        ;
        obj;
        JVM INSTR monitorexit ;
        throw ;
        flag = false;
          goto _L1
    }

    public void onCompleted()
    {
label0:
        {
            synchronized (guard)
            {
                if (!done)
                {
                    break label0;
                }
            }
            csub.unsubscribe();
            return;
        }
        ArrayList arraylist;
        done = true;
        arraylist = new ArrayList(chunks);
        chunks.clear();
        obj;
        JVM INSTR monitorexit ;
        for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); (()((Iterator) (obj)).next()).consumer.onCompleted()) { }
        break MISSING_BLOCK_LABEL_103;
        obj;
        csub.unsubscribe();
        throw obj;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        child.onCompleted();
        csub.unsubscribe();
        return;
    }

    public void onError(Throwable throwable)
    {
label0:
        {
            synchronized (guard)
            {
                if (!done)
                {
                    break label0;
                }
            }
            csub.unsubscribe();
            return;
        }
        ArrayList arraylist;
        done = true;
        arraylist = new ArrayList(chunks);
        chunks.clear();
        obj;
        JVM INSTR monitorexit ;
        for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); (()((Iterator) (obj)).next()).consumer.onError(throwable)) { }
        break MISSING_BLOCK_LABEL_104;
        throwable;
        csub.unsubscribe();
        throw throwable;
        throwable;
        obj;
        JVM INSTR monitorexit ;
        throw throwable;
        child.onError(throwable);
        csub.unsubscribe();
        return;
    }

    public void onNext(Object obj)
    {
label0:
        {
            synchronized (guard)
            {
                if (!done)
                {
                    break label0;
                }
            }
            return;
        }
        ArrayList arraylist = new ArrayList(chunks);
        obj1;
        JVM INSTR monitorexit ;
        for (obj1 = arraylist.iterator(); ((Iterator) (obj1)).hasNext(); (()((Iterator) (obj1)).next()).consumer.onNext(obj)) { }
        break MISSING_BLOCK_LABEL_73;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void onStart()
    {
        request(0x7fffffffffffffffL);
    }

    public _cls1.once(Subscriber subscriber, CompositeSubscription compositesubscription)
    {
        this$0 = OperatorWindowWithStartEndObservable.this;
        super();
        child = new SerializedSubscriber(subscriber);
        csub = compositesubscription;
    }
}
