// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.functions.Action0;
import rx.subscriptions.Subscriptions;

// Referenced classes of package rx.internal.operators:
//            BufferUntilSubscriber, OperatorWindowWithSize

final class child extends Subscriber
{

    final Subscriber child;
    final List chunks = new LinkedList();
    int count;
    volatile boolean noWindow;
    final OperatorWindowWithSize this$0;

    child createCountedSubject()
    {
        BufferUntilSubscriber bufferuntilsubscriber = BufferUntilSubscriber.create();
        return new it>(bufferuntilsubscriber, bufferuntilsubscriber);
    }

    void init()
    {
        child.add(Subscriptions.create(new Action0() {

            final OperatorWindowWithSize.InexactSubscriber this$1;

            public void call()
            {
                if (noWindow)
                {
                    unsubscribe();
                }
            }

            
            {
                this$1 = OperatorWindowWithSize.InexactSubscriber.this;
                super();
            }
        }));
        child.setProducer(new Producer() {

            final OperatorWindowWithSize.InexactSubscriber this$1;

            public void request(long l)
            {
                if (l > 0L)
                {
                    long l2 = (long)size * l;
                    long l1 = l2;
                    if (l2 >>> 31 != 0L)
                    {
                        l1 = l2;
                        if (l2 / l != (long)size)
                        {
                            l1 = 0x7fffffffffffffffL;
                        }
                    }
                    requestMore(l1);
                }
            }

            
            {
                this$1 = OperatorWindowWithSize.InexactSubscriber.this;
                super();
            }
        });
    }

    public void onCompleted()
    {
        Object obj = new ArrayList(chunks);
        chunks.clear();
        noWindow = true;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((noWindow)((Iterator) (obj)).next()).sumer.onCompleted()) { }
        child.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        Object obj = new ArrayList(chunks);
        chunks.clear();
        noWindow = true;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((noWindow)((Iterator) (obj)).next()).sumer.onError(throwable)) { }
        child.onError(throwable);
    }

    public void onNext(Object obj)
    {
        int i = count;
        count = i + 1;
        if (i % skip == 0 && !child.isUnsubscribed())
        {
            if (chunks.isEmpty())
            {
                noWindow = false;
            }
            child child1 = createCountedSubject();
            chunks.add(child1);
            child.onNext(child1.ducer);
        }
        Iterator iterator = chunks.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            child child2 = (chunks)iterator.next();
            child2.sumer.onNext(obj);
            int j = child2.nt + 1;
            child2.nt = j;
            if (j == size)
            {
                iterator.remove();
                child2.sumer.onCompleted();
            }
        } while (true);
        if (chunks.isEmpty())
        {
            noWindow = true;
            if (child.isUnsubscribed())
            {
                unsubscribe();
            }
        }
    }

    void requestMore(long l)
    {
        request(l);
    }

    public _cls2.this._cls1(Subscriber subscriber)
    {
        this$0 = OperatorWindowWithSize.this;
        super();
        noWindow = true;
        child = subscriber;
    }
}
