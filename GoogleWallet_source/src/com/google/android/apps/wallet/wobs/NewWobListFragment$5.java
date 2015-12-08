// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.wobs.caching.WobTailListByCategoryEvent;
import com.google.android.apps.wallet.wobs.list.WoblListAdapter;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            NewWobListFragment

final class this._cls0
    implements EventHandler
{

    final NewWobListFragment this$0;

    private void handleEvent(WobTailListByCategoryEvent wobtaillistbycategoryevent)
    {
        if (wobtaillistbycategoryevent.hasError())
        {
            Toasts.show(getActivity(), com.google.android.apps.walletnfcrel.ng_error_details);
            NewWobListFragment.access$200(NewWobListFragment.this, stLoadStatus.ERROR);
            return;
        }
        wobListAdapter.addInstances(wobtaillistbycategoryevent.getWobs());
        NewWobListFragment.access$400(NewWobListFragment.this);
        if (wobtaillistbycategoryevent.moreToFetch())
        {
            NewWobListFragment.access$200(NewWobListFragment.this, stLoadStatus.PARTIALLY_LOADED);
            return;
        } else
        {
            NewWobListFragment.access$200(NewWobListFragment.this, stLoadStatus.COMPLETE);
            return;
        }
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((WobTailListByCategoryEvent)obj);
    }

    CategoryEvent()
    {
        this$0 = NewWobListFragment.this;
        super();
    }
}
