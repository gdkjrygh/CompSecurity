// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.wobs.caching.WobCategory;
import com.google.android.apps.wallet.wobs.list.WoblListAdapter;
import com.google.android.apps.wallet.wobs.provider.WobDeletionEvent;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            NewWobListFragment

final class this._cls0
    implements EventHandler
{

    final NewWobListFragment this$0;

    private void handleEvent(WobDeletionEvent wobdeletionevent)
    {
        while (wobdeletionevent.hasError() || wobdeletionevent.getWobInstance().categoryId != null && NewWobListFragment.access$300(NewWobListFragment.this).getId() != wobdeletionevent.getWobInstance().categoryId.intValue()) 
        {
            return;
        }
        wobListAdapter.deleteWobById(wobdeletionevent.getWobInstance().id);
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((WobDeletionEvent)obj);
    }

    vent()
    {
        this$0 = NewWobListFragment.this;
        super();
    }
}
