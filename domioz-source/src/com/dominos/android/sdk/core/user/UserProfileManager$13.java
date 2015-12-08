// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.user;

import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;
import com.dominos.android.sdk.data.http.power.PowerRestCallback;

// Referenced classes of package com.dominos.android.sdk.core.user:
//            UserProfileManager

class k extends PowerRestCallback
{

    final UserProfileManager this$0;
    final com.dominos.android.sdk.core.loyalty.allback val$callback;

    public void onBegin()
    {
        super.onBegin();
        val$callback.onBegin();
    }

    public void onError(Exception exception, String s)
    {
        val$callback.onLoyaltyOptOutFail();
    }

    public void onFinish()
    {
        super.onFinish();
        val$callback.onFinish();
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        s = UserObject.from(s);
        if (UserProfileManager.access$200(UserProfileManager.this).isCustomerLoyaltyOptOutSuccess(s.getCustomerLoyalty()))
        {
            UserProfileManager.access$200(UserProfileManager.this).setCustomerLoyalty(s.getCustomerLoyalty());
            val$callback.onLoyaltyOptOutSuccess();
            return;
        } else
        {
            val$callback.onLoyaltyOptOutFail();
            return;
        }
    }

    utCallback()
    {
        this$0 = final_userprofilemanager;
        val$callback = com.dominos.android.sdk.core.loyalty.allback.this;
        super();
    }
}
