// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package me.lyft.android.ui.payment:
//            PaymentView, AddCouponView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (PaymentView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, PaymentView paymentview, Object obj)
    {
        paymentview.cardList = (LinearLayout)viewinjector.cardList((View)viewinjector.cardList(obj, 0x7f0d0170, "field 'cardList'"), 0x7f0d0170, "field 'cardList'");
        paymentview.addCard = (LinearLayout)viewinjector.addCard((View)viewinjector.addCard(obj, 0x7f0d031c, "field 'addCard'"), 0x7f0d031c, "field 'addCard'");
        paymentview.addCoupon = (AddCouponView)viewinjector.ew((View)viewinjector.ew(obj, 0x7f0d0065, "field 'addCoupon'"), 0x7f0d0065, "field 'addCoupon'");
    }

    public volatile void reset(Object obj)
    {
        reset((PaymentView)obj);
    }

    public void reset(PaymentView paymentview)
    {
        paymentview.cardList = null;
        paymentview.addCard = null;
        paymentview.addCoupon = null;
    }

    public ()
    {
    }
}
