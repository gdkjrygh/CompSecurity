// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Producer;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorElementAt

class currentIndex extends Subscriber
{

    private int currentIndex;
    final OperatorElementAt this$0;
    final Subscriber val$child;

    public void onCompleted()
    {
label0:
        {
            if (currentIndex <= OperatorElementAt.access$000(OperatorElementAt.this))
            {
                if (!OperatorElementAt.access$100(OperatorElementAt.this))
                {
                    break label0;
                }
                val$child.onNext(OperatorElementAt.access$200(OperatorElementAt.this));
                val$child.onCompleted();
            }
            return;
        }
        val$child.onError(new IndexOutOfBoundsException((new StringBuilder()).append(OperatorElementAt.access$000(OperatorElementAt.this)).append(" is out of bounds").toString()));
    }

    public void onError(Throwable throwable)
    {
        val$child.onError(throwable);
    }

    public void onNext(Object obj)
    {
        int i = currentIndex;
        currentIndex = i + 1;
        if (i == OperatorElementAt.access$000(OperatorElementAt.this))
        {
            val$child.onNext(obj);
            val$child.onCompleted();
            unsubscribe();
        }
    }

    public void setProducer(Producer producer)
    {
        val$child.setProducer(new nerProducer(producer));
    }

    nerProducer()
    {
        this$0 = final_operatorelementat;
        val$child = Subscriber.this;
        super();
        currentIndex = 0;
    }
}
