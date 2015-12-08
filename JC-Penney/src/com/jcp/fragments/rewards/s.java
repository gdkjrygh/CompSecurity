// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.fragments.rewards:
//            RewardsConnectAccountsSignInToRewardsFragment

class s extends DebouncingOnClickListener
{

    final RewardsConnectAccountsSignInToRewardsFragment a;
    final RewardsConnectAccountsSignInToRewardsFragment..ViewInjector b;

    s(RewardsConnectAccountsSignInToRewardsFragment..ViewInjector viewinjector, RewardsConnectAccountsSignInToRewardsFragment rewardsconnectaccountssignintorewardsfragment)
    {
        b = viewinjector;
        a = rewardsconnectaccountssignintorewardsfragment;
        super();
    }

    public void doClick(View view)
    {
        a.connectAccountsClicked();
    }
}
