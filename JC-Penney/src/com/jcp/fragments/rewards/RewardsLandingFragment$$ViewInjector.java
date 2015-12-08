// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;

// Referenced classes of package com.jcp.fragments.rewards:
//            RewardsLandingFragment, aq, ar, as

public class 
    implements butterknife..ViewInjector
{

    public void inject(butterknife..ViewInjector viewinjector, RewardsLandingFragment rewardslandingfragment, Object obj)
    {
        rewardslandingfragment.scrollView = (ScrollView)viewinjector.scrollView((View)viewinjector.scrollView(obj, 0x7f0e02e3, "field 'scrollView'"), 0x7f0e02e3, "field 'scrollView'");
        rewardslandingfragment.rewardsDetails = (LinearLayout)viewinjector.rewardsDetails((View)viewinjector.rewardsDetails(obj, 0x7f0e02e6, "field 'rewardsDetails'"), 0x7f0e02e6, "field 'rewardsDetails'");
        ((View)viewinjector.rewardsDetails(obj, 0x7f0e02e5, "method 'learnMore'")).setOnClickListener(new aq(this, rewardslandingfragment));
        ((View)viewinjector.ViewInjector(obj, 0x7f0e02d3, "method 'enrollInRewards'")).setOnClickListener(new ar(this, rewardslandingfragment));
        ((View)viewinjector.ViewInjector(obj, 0x7f0e02e4, "method 'signInToRewards'")).setOnClickListener(new as(this, rewardslandingfragment));
    }

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (RewardsLandingFragment)obj, obj1);
    }

    public void reset(RewardsLandingFragment rewardslandingfragment)
    {
        rewardslandingfragment.scrollView = null;
        rewardslandingfragment.rewardsDetails = null;
    }

    public volatile void reset(Object obj)
    {
        reset((RewardsLandingFragment)obj);
    }

    public ()
    {
    }
}
