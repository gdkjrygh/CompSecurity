// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.user.UserProfileManager;

// Referenced classes of package com.dominos.activities:
//            BaseActivity

class this._cls0
    implements Runnable
{

    final BaseActivity this$0;

    public void run()
    {
        mOrderManager.getOrder().clearPersonalInfo();
        mProfileManager.clearCurrentUser();
        onSessionTimedOut();
    }

    ProfileManager()
    {
        this$0 = BaseActivity.this;
        super();
    }
}
