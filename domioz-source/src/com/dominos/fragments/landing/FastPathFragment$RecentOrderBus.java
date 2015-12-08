// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.landing;

import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.user.UserProfileManager;
import java.util.ArrayList;

// Referenced classes of package com.dominos.fragments.landing:
//            FastPathFragment

class <init>
{

    final FastPathFragment this$0;

    public void reOrderMostRecentOrder(com.dominos.bus.events.Selection selection)
    {
        if (FastPathFragment.access$100(FastPathFragment.this).getOrderHistoryList() != null && !FastPathFragment.access$100(FastPathFragment.this).getOrderHistoryList().isEmpty())
        {
            selection = (LabsOrder)FastPathFragment.access$100(FastPathFragment.this).getOrderHistoryList().get(selection.getIndex());
            reorder(selection);
        }
    }

    public void showRecentOrder(com.dominos.bus.events.rderList rderlist)
    {
        showOrderHistoryActivity();
    }

    private t()
    {
        this$0 = FastPathFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
