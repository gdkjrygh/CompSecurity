// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import butterknife.ButterKnife;
import com.jcp.fragments.t;

// Referenced classes of package com.jcp.fragments.rewards:
//            d, RewardsEnrollStaticPageFragment, at, RewardsSignInStaticPageFragment

public class RewardsLandingFragment extends d
{

    protected LinearLayout rewardsDetails;
    protected ScrollView scrollView;

    public RewardsLandingFragment()
    {
    }

    private void a(Fragment fragment, String s)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("intent_from_rewards_landing_page", true);
        fragment.g(bundle);
        a(i()).c(fragment, s);
    }

    protected String T()
    {
        return "JCP REWARDS (CAT1002850058)";
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03007c, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        a(a(0x7f070262), ((android.app.Activity) (i())));
        return layoutinflater;
    }

    protected String a()
    {
        return "Rewards Landing";
    }

    public void b()
    {
        a(a(0x7f070262));
        super.b();
    }

    public void enrollInRewards()
    {
        a(new RewardsEnrollStaticPageFragment(), "RewardsEnrollStaticFragment");
    }

    public void f()
    {
        super.f();
        ButterKnife.reset(this);
    }

    public void learnMore()
    {
        scrollView.post(new at(this));
    }

    public void signInToRewards()
    {
        a(new RewardsSignInStaticPageFragment(), "RewardsSignInStaticFragment");
    }
}
