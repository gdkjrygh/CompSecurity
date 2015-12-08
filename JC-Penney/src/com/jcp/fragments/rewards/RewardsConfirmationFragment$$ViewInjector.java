// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.view.View;
import android.widget.ImageView;
import com.jcp.views.TypefaceTextView;

// Referenced classes of package com.jcp.fragments.rewards:
//            RewardsConfirmationFragment, n, o

public class I
    implements butterknife..ViewInjector
{

    public void inject(butterknife..ViewInjector viewinjector, RewardsConfirmationFragment rewardsconfirmationfragment, Object obj)
    {
        rewardsconfirmationfragment.linkImage = (ImageView)viewinjector.linkImage((View)viewinjector.linkImage(obj, 0x7f0e02c8, "field 'linkImage'"), 0x7f0e02c8, "field 'linkImage'");
        rewardsconfirmationfragment.tvConfirmation = (TypefaceTextView)viewinjector.tvConfirmation((View)viewinjector.tvConfirmation(obj, 0x7f0e02c9, "field 'tvConfirmation'"), 0x7f0e02c9, "field 'tvConfirmation'");
        ((View)viewinjector.tvConfirmation(obj, 0x7f0e02ca, "method 'startShopping'")).setOnClickListener(new n(this, rewardsconfirmationfragment));
        ((View)viewinjector.ViewInjector(obj, 0x7f0e02cb, "method 'myProfile'")).setOnClickListener(new o(this, rewardsconfirmationfragment));
    }

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (RewardsConfirmationFragment)obj, obj1);
    }

    public void reset(RewardsConfirmationFragment rewardsconfirmationfragment)
    {
        rewardsconfirmationfragment.linkImage = null;
        rewardsconfirmationfragment.tvConfirmation = null;
    }

    public volatile void reset(Object obj)
    {
        reset((RewardsConfirmationFragment)obj);
    }

    public I()
    {
    }
}
