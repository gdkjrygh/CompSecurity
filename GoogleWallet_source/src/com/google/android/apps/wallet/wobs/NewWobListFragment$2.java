// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.wobs.caching.WobCategory;
import com.google.android.apps.wallet.wobs.list.WoblListAdapter;
import com.google.android.apps.wallet.wobs.provider.WobUpdateEvent;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            NewWobListFragment

final class this._cls0
    implements EventHandler
{

    final NewWobListFragment this$0;

    private void handleEvent(WobUpdateEvent wobupdateevent)
    {
        while (wobupdateevent.hasError() || wobupdateevent.getWobInstance().categoryId != null && NewWobListFragment.access$300(NewWobListFragment.this).getId() != wobupdateevent.getWobInstance().categoryId.intValue()) 
        {
            return;
        }
        wobListAdapter.upsertInstance(wobupdateevent.getWobInstance());
        NewWobListFragment.access$400(NewWobListFragment.this);
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((WobUpdateEvent)obj);
    }

    nt()
    {
        this$0 = NewWobListFragment.this;
        super();
    }
}
