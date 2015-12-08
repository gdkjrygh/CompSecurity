// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.user;

import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;

// Referenced classes of package com.dominos.android.sdk.core.user:
//            UserProfileManager

class altyCallback extends com.dominos.android.sdk.core.loyalty.yCallback
{

    final UserProfileManager this$0;
    final UserObject val$userObject;

    public void onLoyaltyFail()
    {
        loadAndWaitForOrderHistoryAndCards(val$userObject.getCustomerId());
        LogUtil.d("UserProfileManager", "Remembered user logged in.", new Object[0]);
    }

    public void onLoyaltySuccess()
    {
        loadAndWaitForOrderHistoryAndCards(val$userObject.getCustomerId());
        LogUtil.d("UserProfileManager", "Remembered user logged in.", new Object[0]);
    }

    ect()
    {
        this$0 = final_userprofilemanager;
        val$userObject = UserObject.this;
        super();
    }
}
