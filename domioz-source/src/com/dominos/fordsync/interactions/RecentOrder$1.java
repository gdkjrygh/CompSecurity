// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.interactions;

import com.dominos.android.sdk.core.models.LabsOrder;
import com.google.a.a.t;

// Referenced classes of package com.dominos.fordsync.interactions:
//            RecentOrder

class this._cls0
    implements t
{

    final RecentOrder this$0;

    public volatile Object apply(Object obj)
    {
        return apply((LabsOrder)obj);
    }

    public String apply(LabsOrder labsorder)
    {
        return labsorder.getPlaceOrderTime();
    }

    ()
    {
        this$0 = RecentOrder.this;
        super();
    }
}
