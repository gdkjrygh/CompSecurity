// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.actionbar;

import com.soundcloud.android.view.RefreshableListComponent;
import com.soundcloud.android.view.adapters.ReactiveAdapter;
import rx.b;

// Referenced classes of package com.soundcloud.android.actionbar:
//            PullToRefreshController

class val.adapter
    implements android.support.v4.widget.shListener
{

    final PullToRefreshController this$0;
    final ReactiveAdapter val$adapter;
    final RefreshableListComponent val$component;

    public void onRefresh()
    {
        b b1 = val$component.refreshObservable();
        PullToRefreshController.access$002(PullToRefreshController.this, b1.subscribe(new freshSubscriber(PullToRefreshController.this, val$adapter)));
        val$component.connectObservable(b1);
    }

    freshSubscriber()
    {
        this$0 = final_pulltorefreshcontroller;
        val$component = refreshablelistcomponent;
        val$adapter = ReactiveAdapter.this;
        super();
    }
}
