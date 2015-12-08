// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import android.widget.TextView;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.ui.payment.cardinput.CreditCardInput;

// Referenced classes of package me.lyft.android.ui.payment:
//            BaseCreditCardView

public class A
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (BaseCreditCardView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, BaseCreditCardView basecreditcardview, Object obj)
    {
        basecreditcardview.creditCardInput = (CreditCardInput)viewinjector.rdInput((View)viewinjector.rdInput(obj, 0x7f0d006c, "field 'creditCardInput'"), 0x7f0d006c, "field 'creditCardInput'");
        basecreditcardview.editChargeAccountNote = (TextView)viewinjector.editChargeAccountNote((View)viewinjector.editChargeAccountNote(obj, 0x7f0d0176, "field 'editChargeAccountNote'"), 0x7f0d0176, "field 'editChargeAccountNote'");
        basecreditcardview.selectedLabelTxt = (TextView)viewinjector.selectedLabelTxt((View)viewinjector.selectedLabelTxt(obj, 0x7f0d032a, "field 'selectedLabelTxt'"), 0x7f0d032a, "field 'selectedLabelTxt'");
        basecreditcardview.changeLabelButton = (View)viewinjector.changeLabelButton(obj, 0x7f0d0329, "field 'changeLabelButton'");
        basecreditcardview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
    }

    public volatile void reset(Object obj)
    {
        reset((BaseCreditCardView)obj);
    }

    public void reset(BaseCreditCardView basecreditcardview)
    {
        basecreditcardview.creditCardInput = null;
        basecreditcardview.editChargeAccountNote = null;
        basecreditcardview.selectedLabelTxt = null;
        basecreditcardview.changeLabelButton = null;
        basecreditcardview.toolbar = null;
    }

    public A()
    {
    }
}
