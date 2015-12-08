// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.android.sdk.data.http.power.PowerRestCallback;

// Referenced classes of package com.dominos.activities:
//            UserEditInfoActivity

class estCallback extends PowerRestCallback
{

    final UserEditInfoActivity this$0;

    public void onBegin()
    {
        showLoading();
    }

    public void onError(Exception exception, String s)
    {
        hideLoading();
        showShortToast(getString(0x7f08011a));
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        hideLoading();
        if (UserEditInfoActivity.access$000(UserEditInfoActivity.this) != null)
        {
            mProfileManager.saveNewCurrentUser(UserEditInfoActivity.access$000(UserEditInfoActivity.this));
        }
        showShortToast(getString(0x7f080294));
        setResult(-1);
        finish();
    }

    anager()
    {
        this$0 = UserEditInfoActivity.this;
        super();
    }
}
