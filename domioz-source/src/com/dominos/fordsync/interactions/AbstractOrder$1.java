// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.interactions;

import com.dominos.android.sdk.core.models.LabsTopping;
import com.google.a.a.t;

// Referenced classes of package com.dominos.fordsync.interactions:
//            AbstractOrder

class this._cls0
    implements t
{

    final AbstractOrder this$0;

    public volatile Object apply(Object obj)
    {
        return apply((LabsTopping)obj);
    }

    public String apply(LabsTopping labstopping)
    {
        return labstopping.getPartWithQuantity();
    }

    ()
    {
        this$0 = AbstractOrder.this;
        super();
    }
}
