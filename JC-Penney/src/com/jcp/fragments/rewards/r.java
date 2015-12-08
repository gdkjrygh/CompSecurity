// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.fragments.rewards:
//            RewardsConnectAccountsSignInToJCPFragment

class r extends DebouncingOnClickListener
{

    final RewardsConnectAccountsSignInToJCPFragment a;
    final RewardsConnectAccountsSignInToJCPFragment..ViewInjector b;

    r(RewardsConnectAccountsSignInToJCPFragment..ViewInjector viewinjector, RewardsConnectAccountsSignInToJCPFragment rewardsconnectaccountssignintojcpfragment)
    {
        b = viewinjector;
        a = rewardsconnectaccountssignintojcpfragment;
        super();
    }

    public void doClick(View view)
    {
        a.forgotPassword();
    }
}
