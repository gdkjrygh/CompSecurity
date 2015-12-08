// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.widget.rewards;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.jcp.widget.rewards:
//            TermsAndConditionsFooter, c, d, e

public class 
    implements butterknife.ewInjector
{

    public void inject(butterknife.ewInjector ewinjector, TermsAndConditionsFooter termsandconditionsfooter, Object obj)
    {
        View view = (View)ewinjector.ewInjector(obj, 0x7f0e0454, "field 'termsAndConditions' and method 'openRewardsTermsAndConditions'");
        termsandconditionsfooter.termsAndConditions = (TextView)ewinjector.msAndConditions(view, 0x7f0e0454, "field 'termsAndConditions'");
        view.setOnClickListener(new c(this, termsandconditionsfooter));
        view = (View)ewinjector.ewInjector(obj, 0x7f0e0456, "field 'programDetails' and method 'openRewardsProgramDetails'");
        termsandconditionsfooter.programDetails = (TextView)ewinjector.gramDetails(view, 0x7f0e0456, "field 'programDetails'");
        view.setOnClickListener(new d(this, termsandconditionsfooter));
        obj = (View)ewinjector.ewInjector(obj, 0x7f0e0455, "field 'rewardsFaq' and method 'openRewardsFaq'");
        termsandconditionsfooter.rewardsFaq = (TextView)ewinjector.ardsFaq(((View) (obj)), 0x7f0e0455, "field 'rewardsFaq'");
        ((View) (obj)).setOnClickListener(new e(this, termsandconditionsfooter));
    }

    public volatile void inject(butterknife.ewInjector ewinjector, Object obj, Object obj1)
    {
        inject(ewinjector, (TermsAndConditionsFooter)obj, obj1);
    }

    public void reset(TermsAndConditionsFooter termsandconditionsfooter)
    {
        termsandconditionsfooter.termsAndConditions = null;
        termsandconditionsfooter.programDetails = null;
        termsandconditionsfooter.rewardsFaq = null;
    }

    public volatile void reset(Object obj)
    {
        reset((TermsAndConditionsFooter)obj);
    }

    public ()
    {
    }
}
