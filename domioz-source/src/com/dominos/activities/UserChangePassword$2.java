// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.data.http.power.PowerRestCallback;

// Referenced classes of package com.dominos.activities:
//            UserChangePassword

class rRestCallback extends PowerRestCallback
{

    final UserChangePassword this$0;

    public void onBegin()
    {
        showLoading();
    }

    public void onError(Exception exception, String s)
    {
        hideLoading();
        showInvalidEmail();
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        hideLoading();
        showPasswordResetDialog();
    }

    rRestCallback()
    {
        this$0 = UserChangePassword.this;
        super();
    }
}
