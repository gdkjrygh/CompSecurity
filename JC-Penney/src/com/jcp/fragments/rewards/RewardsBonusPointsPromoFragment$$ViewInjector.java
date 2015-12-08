// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.jcp.views.PhoneTypefaceEditText;

// Referenced classes of package com.jcp.fragments.rewards:
//            RewardsBonusPointsPromoFragment, e, f, g, 
//            h, i

public class 
    implements butterknife..ViewInjector
{

    public void inject(butterknife..ViewInjector viewinjector, RewardsBonusPointsPromoFragment rewardsbonuspointspromofragment, Object obj)
    {
        rewardsbonuspointspromofragment.offerLayout = (LinearLayout)viewinjector.offerLayout((View)viewinjector.offerLayout(obj, 0x7f0e0420, "field 'offerLayout'"), 0x7f0e0420, "field 'offerLayout'");
        rewardsbonuspointspromofragment.getBonusPointsDetails = (TextView)viewinjector.getBonusPointsDetails((View)viewinjector.getBonusPointsDetails(obj, 0x7f0e0421, "field 'getBonusPointsDetails'"), 0x7f0e0421, "field 'getBonusPointsDetails'");
        rewardsbonuspointspromofragment.greyOutScreen = (RelativeLayout)viewinjector.greyOutScreen((View)viewinjector.greyOutScreen(obj, 0x7f0e0426, "field 'greyOutScreen'"), 0x7f0e0426, "field 'greyOutScreen'");
        View view = (View)viewinjector.greyOutScreen(obj, 0x7f0e0422, "field 'rewardsPhoneNumber' and method 'phoneNumberTextChanged'");
        rewardsbonuspointspromofragment.rewardsPhoneNumber = (PhoneTypefaceEditText)viewinjector.rewardsPhoneNumber(view, 0x7f0e0422, "field 'rewardsPhoneNumber'");
        ((TextView)view).addTextChangedListener(new e(this, rewardsbonuspointspromofragment));
        view = (View)viewinjector.ViewInjector(obj, 0x7f0e0423, "field 'rewardsEmail' and method 'emailTextChanged'");
        rewardsbonuspointspromofragment.rewardsEmail = (EditText)viewinjector.rewardsEmail(view, 0x7f0e0423, "field 'rewardsEmail'");
        ((TextView)view).addTextChangedListener(new f(this, rewardsbonuspointspromofragment));
        rewardsbonuspointspromofragment.successLayout = (LinearLayout)viewinjector.successLayout((View)viewinjector.successLayout(obj, 0x7f0e0427, "field 'successLayout'"), 0x7f0e0427, "field 'successLayout'");
        ((View)viewinjector.successLayout(obj, 0x7f0e0424, "method 'getBonusPoints'")).setOnClickListener(new g(this, rewardsbonuspointspromofragment));
        ((View)viewinjector.ViewInjector(obj, 0x7f0e0425, "method 'enrollNow'")).setOnClickListener(new h(this, rewardsbonuspointspromofragment));
        ((View)viewinjector.ViewInjector(obj, 0x7f0e02ca, "method 'startShopping'")).setOnClickListener(new i(this, rewardsbonuspointspromofragment));
    }

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (RewardsBonusPointsPromoFragment)obj, obj1);
    }

    public void reset(RewardsBonusPointsPromoFragment rewardsbonuspointspromofragment)
    {
        rewardsbonuspointspromofragment.offerLayout = null;
        rewardsbonuspointspromofragment.getBonusPointsDetails = null;
        rewardsbonuspointspromofragment.greyOutScreen = null;
        rewardsbonuspointspromofragment.rewardsPhoneNumber = null;
        rewardsbonuspointspromofragment.rewardsEmail = null;
        rewardsbonuspointspromofragment.successLayout = null;
    }

    public volatile void reset(Object obj)
    {
        reset((RewardsBonusPointsPromoFragment)obj);
    }

    public ()
    {
    }
}
