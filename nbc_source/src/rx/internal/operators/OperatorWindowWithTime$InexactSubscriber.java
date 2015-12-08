// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Action0;

// Referenced classes of package rx.internal.operators:
//            OperatorWindowWithTime, BufferUntilSubscriber

final class worker extends Subscriber
{

    final Subscriber child;
    final List chunks = new LinkedList();
    boolean done;
    final Object guard = new Object();
    final OperatorWindowWithTime this$0;
    final rx. worker;

    ubject createCountedSerializedSubject()
    {
        BufferUntilSubscriber bufferuntilsubscriber = BufferUntilSubscriber.create();
        return new ubject(bufferuntilsubscriber, bufferuntilsubscriber);
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
            return;
        }
        ArrayList arraylist;
        done = true;
        arraylist = new ArrayList(chunks);
        chunks.clear();
        obj;
        JVM INSTR monitorexit ;
        for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); ((ubject)((Iterator) (obj)).next()).consumer.onCompleted()) { }
        break MISSING_BLOCK_LABEL_86;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        child.onCompleted();
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
            return;
        }
        ArrayList arraylist;
        done = true;
        arraylist = new ArrayList(chunks);
        chunks.clear();
        obj;
        JVM INSTR monitorexit ;
        for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); ((ubject)((Iterator) (obj)).next()).consumer.onError(throwable)) { }
        break MISSING_BLOCK_LABEL_87;
        throwable;
        obj;
        JVM INSTR monitorexit ;
        throw throwable;
        child.onError(throwable);
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
        ArrayList arraylist;
        arraylist = new ArrayList(chunks);
        Iterator iterator1 = chunks.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            ubject ubject1 = (ubject)iterator1.next();
            int i = ubject1.count + 1;
            ubject1.count = i;
            if (i == size)
            {
                iterator1.remove();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_105;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        obj1;
        JVM INSTR monitorexit ;
        Iterator iterator = arraylist.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ubject ubject = (ubject)iterator.next();
            ubject.consumer.onNext(obj);
            if (ubject.count == size)
            {
                ubject.consumer.onCompleted();
            }
        } while (true);
        return;
    }

    public void onStart()
    {
        request(0x7fffffffffffffffL);
    }

    void scheduleChunk()
    {
        worker.worker(new Action0() {

            final OperatorWindowWithTime.InexactSubscriber this$1;

            public void call()
            {
                startNewChunk();
            }

            
            {
                this$1 = OperatorWindowWithTime.InexactSubscriber.this;
                super();
            }
        }, timeshift, timeshift, unit);
    }

    void startNewChunk()
    {
        final ubject chunk;
label0:
        {
            chunk = createCountedSerializedSubject();
            synchronized (guard)
            {
                if (!done)
                {
                    break label0;
                }
            }
            return;
        }
        chunks.add(chunk);
        obj;
        JVM INSTR monitorexit ;
        try
        {
            child.onNext(chunk.producer);
        }
        catch (Throwable throwable)
        {
            onError(throwable);
            return;
        }
        worker.worker(new Action0() {

            final OperatorWindowWithTime.InexactSubscriber this$1;
            final OperatorWindowWithTime.CountedSerializedSubject val$chunk;

            public void call()
            {
                terminateChunk(chunk);
            }

            
            {
                this$1 = OperatorWindowWithTime.InexactSubscriber.this;
                chunk = countedserializedsubject;
                super();
            }
        }, timespan, unit);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void terminateChunk(ubject ubject)
    {
        boolean flag1;
label0:
        {
            flag1 = false;
            synchronized (guard)
            {
                if (!done)
                {
                    break label0;
                }
            }
            return;
        }
        Iterator iterator = chunks.iterator();
_L2:
        boolean flag = flag1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_65;
        }
        if ((ubject)iterator.next() != ubject) goto _L2; else goto _L1
_L1:
        flag = true;
        iterator.remove();
        obj;
        JVM INSTR monitorexit ;
        if (flag)
        {
            ubject.consumer.onCompleted();
            return;
        } else
        {
            return;
        }
        ubject;
        obj;
        JVM INSTR monitorexit ;
        throw ubject;
    }

    public _cls2.val.chunk(Subscriber subscriber, rx. )
    {
        this$0 = OperatorWindowWithTime.this;
        super(subscriber);
        child = subscriber;
        worker = ;
    }
}
