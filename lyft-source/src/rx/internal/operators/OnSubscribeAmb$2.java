// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import rx.Producer;

// Referenced classes of package rx.internal.operators:
//            OnSubscribeAmb

class this._cls0
    implements Producer
{

    final OnSubscribeAmb this$0;

    public void request(long l)
    {
        bSubscriber bsubscriber = (bSubscriber)choice.get();
        if (bsubscriber != null)
        {
            bSubscriber.access._mth300(bsubscriber, l);
        } else
        {
            Iterator iterator = selection.ambSubscribers.iterator();
            while (iterator.hasNext()) 
            {
                bSubscriber bsubscriber1 = (bSubscriber)iterator.next();
                if (!bsubscriber1.isUnsubscribed())
                {
                    if (choice.get() == bsubscriber1)
                    {
                        bSubscriber.access._mth300(bsubscriber1, l);
                        return;
                    }
                    bSubscriber.access._mth300(bsubscriber1, l);
                }
            }
        }
    }

    lection()
    {
        this$0 = OnSubscribeAmb.this;
        super();
    }
}
