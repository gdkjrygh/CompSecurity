// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.view.View;

// Referenced classes of package com.jcp.fragments.rewards:
//            au, av, RewardsSignInStaticPageFragment

public class 
    implements butterknife..ViewInjector
{

    public void inject(butterknife..ViewInjector viewinjector, RewardsSignInStaticPageFragment rewardssigninstaticpagefragment, Object obj)
    {
        ((View)viewinjector.ViewInjector(obj, 0x7f0e02f8, "method 'connectExistingAccounts'")).setOnClickListener(new au(this, rewardssigninstaticpagefragment));
        ((View)viewinjector.ViewInjector(obj, 0x7f0e02f9, "method 'createNewJCPProfile'")).setOnClickListener(new av(this, rewardssigninstaticpagefragment));
    }

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (RewardsSignInStaticPageFragment)obj, obj1);
    }

    public void reset(RewardsSignInStaticPageFragment rewardssigninstaticpagefragment)
    {
    }

    public volatile void reset(Object obj)
    {
        reset((RewardsSignInStaticPageFragment)obj);
    }

    public ()
    {
    }
}
