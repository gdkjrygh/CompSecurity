// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.android.sync.SyncResult;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.collections:
//            CollectionsPresenter

class this._cls0
    implements f
{

    final CollectionsPresenter this$0;

    public Boolean call(SyncResult syncresult)
    {
        boolean flag;
        if (!CollectionsPresenter.access$200(CollectionsPresenter.this).isRefreshing())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public volatile Object call(Object obj)
    {
        return call((SyncResult)obj);
    }

    ()
    {
        this$0 = CollectionsPresenter.this;
        super();
    }
}
