// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import android.widget.LinearLayout;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.payment:
//            ChangeChargeAccountLabelView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (ChangeChargeAccountLabelView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, ChangeChargeAccountLabelView changechargeaccountlabelview, Object obj)
    {
        changechargeaccountlabelview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        changechargeaccountlabelview.labelList = (LinearLayout)viewinjector.labelList((View)viewinjector.labelList(obj, 0x7f0d0322, "field 'labelList'"), 0x7f0d0322, "field 'labelList'");
    }

    public volatile void reset(Object obj)
    {
        reset((ChangeChargeAccountLabelView)obj);
    }

    public void reset(ChangeChargeAccountLabelView changechargeaccountlabelview)
    {
        changechargeaccountlabelview.toolbar = null;
        changechargeaccountlabelview.labelList = null;
    }

    public ()
    {
    }
}
