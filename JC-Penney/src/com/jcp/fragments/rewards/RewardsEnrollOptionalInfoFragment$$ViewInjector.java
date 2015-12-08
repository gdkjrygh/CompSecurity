// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.view.View;

// Referenced classes of package com.jcp.fragments.rewards:
//            RewardsEnrollOptionalInfoFragment, am, an, BaseRewardsEnrollFragment

public class  extends 
{

    public volatile void inject(butterknife..ViewInjector viewinjector, BaseRewardsEnrollFragment baserewardsenrollfragment, Object obj)
    {
        inject(viewinjector, (RewardsEnrollOptionalInfoFragment)baserewardsenrollfragment, obj);
    }

    public void inject(butterknife..ViewInjector viewinjector, RewardsEnrollOptionalInfoFragment rewardsenrolloptionalinfofragment, Object obj)
    {
        super.inject(viewinjector, rewardsenrolloptionalinfofragment, obj);
        ((View)viewinjector.inject(obj, 0x7f0e02e1, "method 'onCreateRewardsAccountClick'")).setOnClickListener(new am(this, rewardsenrolloptionalinfofragment));
        ((View)viewinjector.ViewInjector(obj, 0x7f0e02e2, "method 'onSkipClick'")).setOnClickListener(new an(this, rewardsenrolloptionalinfofragment));
    }

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (RewardsEnrollOptionalInfoFragment)obj, obj1);
    }

    public volatile void reset(BaseRewardsEnrollFragment baserewardsenrollfragment)
    {
        reset((RewardsEnrollOptionalInfoFragment)baserewardsenrollfragment);
    }

    public void reset(RewardsEnrollOptionalInfoFragment rewardsenrolloptionalinfofragment)
    {
        super.reset(rewardsenrolloptionalinfofragment);
    }

    public volatile void reset(Object obj)
    {
        reset((RewardsEnrollOptionalInfoFragment)obj);
    }

    public ()
    {
    }
}
