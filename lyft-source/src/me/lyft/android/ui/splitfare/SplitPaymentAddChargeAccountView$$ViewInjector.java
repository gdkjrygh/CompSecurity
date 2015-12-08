// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import android.view.View;
import me.lyft.android.ui.payment.AddChargeAccountView;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            SplitPaymentAddChargeAccountView

public class Q
    implements butterknife.ew..ViewInjector
{

    public volatile void inject(butterknife.ew..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (SplitPaymentAddChargeAccountView)obj, obj1);
    }

    public void inject(butterknife.ew..ViewInjector viewinjector, SplitPaymentAddChargeAccountView splitpaymentaddchargeaccountview, Object obj)
    {
        splitpaymentaddchargeaccountview.addChargeAccountView = (AddChargeAccountView)viewinjector.addChargeAccountView((View)viewinjector.addChargeAccountView(obj, 0x7f0d03e7, "field 'addChargeAccountView'"), 0x7f0d03e7, "field 'addChargeAccountView'");
    }

    public volatile void reset(Object obj)
    {
        reset((SplitPaymentAddChargeAccountView)obj);
    }

    public void reset(SplitPaymentAddChargeAccountView splitpaymentaddchargeaccountview)
    {
        splitpaymentaddchargeaccountview.addChargeAccountView = null;
    }

    public Q()
    {
    }
}
