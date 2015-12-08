// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.facebook.accountsalpha.AccessToken;
import com.facebook.accountsalpha.AccountsAlpha;
import com.facebook.accountsalpha.AccountsAlphaException;
import com.facebook.accountsalpha.PhoneLoginRequest;
import com.facebook.accountsalpha.PhoneLoginTracker;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.kit.log.PLog;

// Referenced classes of package com.pinterest.activity.unauth.fragment:
//            StepOneSMSFragment, StepTwoPasswordFragment

class this._cls0 extends PhoneLoginTracker
{

    final StepOneSMSFragment this$0;

    protected void onCancel(PhoneLoginRequest phoneloginrequest)
    {
        PLog.log("User cancelled phone number signup", new Object[0]);
    }

    protected void onError(AccountsAlphaException accountsalphaexception)
    {
        Events.post(new DialogEvent(null));
        Application.showToast(accountsalphaexception.getLocalizedMessage());
        getActivity().onBackPressed();
    }

    protected void onStarted(PhoneLoginRequest phoneloginrequest)
    {
        Events.post(new DialogEvent(null));
        StepOneSMSFragment.access$202(StepOneSMSFragment.this, phoneloginrequest);
    }

    protected void onSuccess(PhoneLoginRequest phoneloginrequest)
    {
        AnalyticsApi.a("multistep_signup_step_1_complete");
        Object obj = AccountsAlpha.getCurrentAccessToken().getToken();
        phoneloginrequest = getArguments();
        phoneloginrequest.putString("com.pinterest.EXTRA_ACCESS_TOKEN", ((String) (obj)));
        obj = new StepTwoPasswordFragment();
        ((StepTwoPasswordFragment) (obj)).setArguments(phoneloginrequest);
        FragmentHelper.replaceFragment(getActivity(), ((android.support.v4.app.Fragment) (obj)), true, com.pinterest.activity.ion.FADE);
    }

    nt()
    {
        this$0 = StepOneSMSFragment.this;
        super();
    }
}
