// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.view.View;

// Referenced classes of package com.jcp.fragments.rewards:
//            ao, ap, RewardsEnrollStaticPageFragment

public class 
    implements butterknife..ViewInjector
{

    public void inject(butterknife..ViewInjector viewinjector, RewardsEnrollStaticPageFragment rewardsenrollstaticpagefragment, Object obj)
    {
        ((View)viewinjector.ViewInjector(obj, 0x7f0e026c, "method 'continueButton'")).setOnClickListener(new ao(this, rewardsenrollstaticpagefragment));
        ((View)viewinjector.ViewInjector(obj, 0x7f0e026d, "method 'noThanksButton'")).setOnClickListener(new ap(this, rewardsenrollstaticpagefragment));
    }

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (RewardsEnrollStaticPageFragment)obj, obj1);
    }

    public void reset(RewardsEnrollStaticPageFragment rewardsenrollstaticpagefragment)
    {
    }

    public volatile void reset(Object obj)
    {
        reset((RewardsEnrollStaticPageFragment)obj);
    }

    public ()
    {
    }
}
