// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import me.lyft.android.common.Unit;
import me.lyft.android.logging.L;
import me.lyft.android.rx.SimpleSubscriber;

// Referenced classes of package me.lyft.android.services:
//            WatchListenerService

class this._cls0 extends SimpleSubscriber
{

    final WatchListenerService this$0;

    public void onError(Throwable throwable)
    {
        super.onError(throwable);
        L.w(throwable, "failed to request ride from watch", new Object[0]);
    }

    public volatile void onNext(Object obj)
    {
        onNext((Unit)obj);
    }

    public void onNext(Unit unit)
    {
        super.onNext(unit);
    }

    ()
    {
        this$0 = WatchListenerService.this;
        super();
    }
}
