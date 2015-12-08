// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.payment:
//            PaymentScreenView, PaymentView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (PaymentScreenView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, PaymentScreenView paymentscreenview, Object obj)
    {
        paymentscreenview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        paymentscreenview.paymentView = (PaymentView)viewinjector.paymentView((View)viewinjector.paymentView(obj, 0x7f0d031a, "field 'paymentView'"), 0x7f0d031a, "field 'paymentView'");
    }

    public volatile void reset(Object obj)
    {
        reset((PaymentScreenView)obj);
    }

    public void reset(PaymentScreenView paymentscreenview)
    {
        paymentscreenview.toolbar = null;
        paymentscreenview.paymentView = null;
    }

    public ()
    {
    }
}
