// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.landing:
//            SignupPromoBannerView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (SignupPromoBannerView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, SignupPromoBannerView signuppromobannerview, Object obj)
    {
        signuppromobannerview.signupPromoTextview = (TextView)viewinjector.signupPromoTextview((View)viewinjector.signupPromoTextview(obj, 0x7f0d03de, "field 'signupPromoTextview'"), 0x7f0d03de, "field 'signupPromoTextview'");
        signuppromobannerview.defaultTextview = (TextView)viewinjector.defaultTextview((View)viewinjector.defaultTextview(obj, 0x7f0d03dc, "field 'defaultTextview'"), 0x7f0d03dc, "field 'defaultTextview'");
        signuppromobannerview.signupPromoLayout = (View)viewinjector.signupPromoLayout(obj, 0x7f0d03dd, "field 'signupPromoLayout'");
    }

    public volatile void reset(Object obj)
    {
        reset((SignupPromoBannerView)obj);
    }

    public void reset(SignupPromoBannerView signuppromobannerview)
    {
        signuppromobannerview.signupPromoTextview = null;
        signuppromobannerview.defaultTextview = null;
        signuppromobannerview.signupPromoLayout = null;
    }

    public ()
    {
    }
}
