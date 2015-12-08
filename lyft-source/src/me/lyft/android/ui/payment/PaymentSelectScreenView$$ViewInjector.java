// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.payment:
//            PaymentSelectScreenView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (PaymentSelectScreenView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, PaymentSelectScreenView paymentselectscreenview, Object obj)
    {
        paymentselectscreenview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
    }

    public volatile void reset(Object obj)
    {
        reset((PaymentSelectScreenView)obj);
    }

    public void reset(PaymentSelectScreenView paymentselectscreenview)
    {
        paymentselectscreenview.toolbar = null;
    }

    public ()
    {
    }
}
