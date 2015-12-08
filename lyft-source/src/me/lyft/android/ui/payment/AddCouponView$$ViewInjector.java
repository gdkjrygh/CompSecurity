// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import me.lyft.android.controls.AdvancedEditText;

// Referenced classes of package me.lyft.android.ui.payment:
//            AddCouponView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (AddCouponView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, AddCouponView addcouponview, Object obj)
    {
        addcouponview.couponEditText = (AdvancedEditText)viewinjector.t((View)viewinjector.t(obj, 0x7f0d0066, "field 'couponEditText'"), 0x7f0d0066, "field 'couponEditText'");
        addcouponview.applyCouponButton = (Button)viewinjector.applyCouponButton((View)viewinjector.applyCouponButton(obj, 0x7f0d0067, "field 'applyCouponButton'"), 0x7f0d0067, "field 'applyCouponButton'");
        addcouponview.inlineCouponError = (TextView)viewinjector.inlineCouponError((View)viewinjector.inlineCouponError(obj, 0x7f0d0068, "field 'inlineCouponError'"), 0x7f0d0068, "field 'inlineCouponError'");
    }

    public volatile void reset(Object obj)
    {
        reset((AddCouponView)obj);
    }

    public void reset(AddCouponView addcouponview)
    {
        addcouponview.couponEditText = null;
        addcouponview.applyCouponButton = null;
        addcouponview.inlineCouponError = null;
    }

    public ()
    {
    }
}
