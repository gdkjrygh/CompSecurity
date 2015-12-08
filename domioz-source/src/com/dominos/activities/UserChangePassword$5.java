// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.android.sdk.data.http.power.DelegatingCallback;
import com.dominos.android.sdk.data.http.power.PowerCallback;

// Referenced classes of package com.dominos.activities:
//            UserChangePassword

class rCallback extends DelegatingCallback
{

    final UserChangePassword this$0;
    final String val$password;

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        s = UserObject.from(s);
        UserChangePassword.access$200(UserChangePassword.this, val$password);
        mProfileManager.saveNewCurrentUser(s);
        getAllSavedCreditCards(s.getCustomerId());
    }

    rCallback(String s)
    {
        this$0 = final_userchangepassword;
        val$password = s;
        super(PowerCallback.this);
    }
}
