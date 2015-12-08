// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.dialogs;

import com.dominos.activities.BaseActivity;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.utils.AnalyticsUtil;

// Referenced classes of package com.dominos.dialogs:
//            LoginDialogFragment

class  extends com.dominos.android.sdk.core.user.nCallback
{

    final LoginDialogFragment this$0;

    public void onBegin()
    {
        super.onBegin();
        if (getActivity() instanceof BaseActivity)
        {
            ((BaseActivity)getActivity()).blockOrientation();
        }
    }

    public void onFinish()
    {
        super.onFinish();
        if (getActivity() instanceof BaseActivity)
        {
            ((BaseActivity)getActivity()).unblockOrientation();
        }
    }

    public void onLoginError()
    {
        showLoginError();
    }

    public void onLoginFailed()
    {
        showLoginFailedAlert();
    }

    public void onLoginSuccessful()
    {
        handleLoginSuccess();
        mAnalyticsUtil.postLogin(LoginDialogFragment.access$000(LoginDialogFragment.this).getCurrentUser().getCustomerId());
        if (LoginDialogFragment.access$200(LoginDialogFragment.this) != null)
        {
            LoginDialogFragment.access$200(LoginDialogFragment.this).onLoginSuccess();
        }
    }

    ctionListener()
    {
        this$0 = LoginDialogFragment.this;
        super();
    }
}
