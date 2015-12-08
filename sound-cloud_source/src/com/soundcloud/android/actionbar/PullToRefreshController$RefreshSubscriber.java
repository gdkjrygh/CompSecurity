// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.actionbar;

import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.view.adapters.ReactiveAdapter;

// Referenced classes of package com.soundcloud.android.actionbar:
//            PullToRefreshController

private final class adapter extends DefaultSubscriber
{

    private final ReactiveAdapter adapter;
    final PullToRefreshController this$0;

    public final void onError(Throwable throwable)
    {
        stopRefreshing();
        super.onError(throwable);
    }

    public final void onNext(Iterable iterable)
    {
        adapter.clear();
        adapter.onNext(iterable);
        stopRefreshing();
        unsubscribe();
    }

    public final volatile void onNext(Object obj)
    {
        onNext((Iterable)obj);
    }

    public (ReactiveAdapter reactiveadapter)
    {
        this$0 = PullToRefreshController.this;
        super();
        adapter = reactiveadapter;
    }
}
