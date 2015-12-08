// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rx.functions.Action0;

// Referenced classes of package rx.internal.operators:
//            OperatorGroupBy

class this._cls0
    implements Action0
{

    final subscribe this$0;

    public void call()
    {
        if (P_FOR_UNSUBSCRIBE_UPDATER.decrementAndGet(lf) == 0)
        {
            lf.subscribe();
        }
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
