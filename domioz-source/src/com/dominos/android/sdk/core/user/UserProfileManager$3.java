// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.user;

import com.dominos.android.sdk.common.dom.useraccounts.CreditCardToken;
import com.dominos.android.sdk.data.http.power.PowerRestCallback;

// Referenced classes of package com.dominos.android.sdk.core.user:
//            UserProfileManager

class ck extends PowerRestCallback
{

    final UserProfileManager this$0;
    final veCardCallback val$callback;

    public void onBegin()
    {
        val$callback.onBegin();
    }

    public void onError(Exception exception, String s)
    {
        val$callback.onCreditCardSavingError(UserProfileManager.access$000(UserProfileManager.this, s));
    }

    public void onFinish()
    {
        val$callback.onFinish();
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        s = CreditCardToken.parseCreditCardToken(s);
        val$callback.onCreditCardSaved(s.getId());
    }

    veCardCallback()
    {
        this$0 = final_userprofilemanager;
        val$callback = veCardCallback.this;
        super();
    }
}
