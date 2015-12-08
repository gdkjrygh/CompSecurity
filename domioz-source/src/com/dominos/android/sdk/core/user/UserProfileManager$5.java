// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.user;

import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.data.http.power.PowerRestCallback;

// Referenced classes of package com.dominos.android.sdk.core.user:
//            UserProfileManager

class ck extends PowerRestCallback
{

    final UserProfileManager this$0;
    final dateCreditCardCallback val$updateCreditCardCallback;

    public void onError(Exception exception, String s)
    {
        LogUtil.e("UserProfileManager", s, new Object[0]);
        val$updateCreditCardCallback.onCreditCardSavingError(UserProfileManager.access$000(UserProfileManager.this, s));
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        val$updateCreditCardCallback.onCreditCardSaved();
    }

    dateCreditCardCallback()
    {
        this$0 = final_userprofilemanager;
        val$updateCreditCardCallback = dateCreditCardCallback.this;
        super();
    }
}
