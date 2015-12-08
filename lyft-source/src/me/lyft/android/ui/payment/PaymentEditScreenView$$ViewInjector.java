// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.payment:
//            PaymentEditScreenView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (PaymentEditScreenView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, PaymentEditScreenView paymenteditscreenview, Object obj)
    {
        paymenteditscreenview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
    }

    public volatile void reset(Object obj)
    {
        reset((PaymentEditScreenView)obj);
    }

    public void reset(PaymentEditScreenView paymenteditscreenview)
    {
        paymenteditscreenview.toolbar = null;
    }

    public ()
    {
    }
}
