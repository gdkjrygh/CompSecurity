// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.view.View;
import com.dominos.android.sdk.core.order.OrderManager;

// Referenced classes of package com.dominos.activities:
//            UserAddLocation

class this._cls0
    implements android.view.er
{

    final UserAddLocation this$0;

    public void onClick(View view)
    {
        mOrderManager.createOrderForDelivery(UserAddLocation.access$1300(UserAddLocation.this), new liveryOrderCallback(UserAddLocation.this, null));
    }

    anager()
    {
        this$0 = UserAddLocation.this;
        super();
    }
}
