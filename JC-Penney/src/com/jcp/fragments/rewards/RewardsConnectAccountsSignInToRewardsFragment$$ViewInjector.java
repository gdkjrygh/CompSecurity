// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

// Referenced classes of package com.jcp.fragments.rewards:
//            RewardsConnectAccountsSignInToRewardsFragment, s, t, u, 
//            v

public class 
    implements butterknife..ViewInjector
{

    public void inject(butterknife..ViewInjector viewinjector, RewardsConnectAccountsSignInToRewardsFragment rewardsconnectaccountssignintorewardsfragment, Object obj)
    {
        rewardsconnectaccountssignintorewardsfragment.greenBox = (LinearLayout)viewinjector.greenBox((View)viewinjector.greenBox(obj, 0x7f0e0355, "field 'greenBox'"), 0x7f0e0355, "field 'greenBox'");
        rewardsconnectaccountssignintorewardsfragment.etEmail = (EditText)viewinjector.etEmail((View)viewinjector.etEmail(obj, 0x7f0e02cd, "field 'etEmail'"), 0x7f0e02cd, "field 'etEmail'");
        rewardsconnectaccountssignintorewardsfragment.etPassword = (EditText)viewinjector.etPassword((View)viewinjector.etPassword(obj, 0x7f0e02ce, "field 'etPassword'"), 0x7f0e02ce, "field 'etPassword'");
        rewardsconnectaccountssignintorewardsfragment.rewardsEnrollContainer = (View)viewinjector.rewardsEnrollContainer(obj, 0x7f0e02d2, "field 'rewardsEnrollContainer'");
        ((View)viewinjector.rewardsEnrollContainer(obj, 0x7f0e02cf, "method 'connectAccountsClicked'")).setOnClickListener(new s(this, rewardsconnectaccountssignintorewardsfragment));
        ((View)viewinjector.ViewInjector(obj, 0x7f0e02d3, "method 'enrollInRewards'")).setOnClickListener(new t(this, rewardsconnectaccountssignintorewardsfragment));
        ((View)viewinjector.ViewInjector(obj, 0x7f0e02d1, "method 'resendWelcomeEmail'")).setOnClickListener(new u(this, rewardsconnectaccountssignintorewardsfragment));
        ((View)viewinjector.ViewInjector(obj, 0x7f0e02d0, "method 'forgotPassword'")).setOnClickListener(new v(this, rewardsconnectaccountssignintorewardsfragment));
    }

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (RewardsConnectAccountsSignInToRewardsFragment)obj, obj1);
    }

    public void reset(RewardsConnectAccountsSignInToRewardsFragment rewardsconnectaccountssignintorewardsfragment)
    {
        rewardsconnectaccountssignintorewardsfragment.greenBox = null;
        rewardsconnectaccountssignintorewardsfragment.etEmail = null;
        rewardsconnectaccountssignintorewardsfragment.etPassword = null;
        rewardsconnectaccountssignintorewardsfragment.rewardsEnrollContainer = null;
    }

    public volatile void reset(Object obj)
    {
        reset((RewardsConnectAccountsSignInToRewardsFragment)obj);
    }

    public ()
    {
    }
}
