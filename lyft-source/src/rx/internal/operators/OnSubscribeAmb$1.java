// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicReference;
import rx.functions.Action0;

// Referenced classes of package rx.internal.operators:
//            OnSubscribeAmb

class this._cls0
    implements Action0
{

    final OnSubscribeAmb this$0;

    public void call()
    {
        bSubscriber bsubscriber = (bSubscriber)choice.get();
        if (bsubscriber != null)
        {
            bsubscriber.unsubscribe();
        }
        OnSubscribeAmb.access$100(selection.ambSubscribers);
    }

    lection()
    {
        this$0 = OnSubscribeAmb.this;
        super();
    }
}
