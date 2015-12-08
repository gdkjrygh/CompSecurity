// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.user;

import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;

// Referenced classes of package com.dominos.android.sdk.core.user:
//            UserProfileManager

class yCallback extends com.dominos.android.sdk.core.loyalty.llback
{

    final l.loginCallback this$1;
    final UserObject val$user;

    public void onLoyaltyFail()
    {
        UserProfileManager.access$400(_fld0, val$user, loginCallback);
    }

    public void onLoyaltySuccess()
    {
        if (fistTime)
        {
            UserProfileManager.access$200(_fld0).setNewLoyaltyMemberFlags();
        }
        UserProfileManager.access$400(_fld0, val$user, loginCallback);
    }

    ()
    {
        this$1 = final_;
        val$user = UserObject.this;
        super();
    }
}
