// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import me.lyft.android.ui.payment.cardinput.CreditCardInput;

// Referenced classes of package me.lyft.android.ui.payment:
//            AddChargeAccountView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (AddChargeAccountView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, AddChargeAccountView addchargeaccountview, Object obj)
    {
        addchargeaccountview.creditCardInput = (CreditCardInput)viewinjector.Input((View)viewinjector.Input(obj, 0x7f0d006c, "field 'creditCardInput'"), 0x7f0d006c, "field 'creditCardInput'");
        addchargeaccountview.editChargeAccountNote = (TextView)viewinjector.editChargeAccountNote((View)viewinjector.editChargeAccountNote(obj, 0x7f0d0176, "field 'editChargeAccountNote'"), 0x7f0d0176, "field 'editChargeAccountNote'");
        addchargeaccountview.saveButton = (Button)viewinjector.saveButton((View)viewinjector.saveButton(obj, 0x7f0d00c8, "field 'saveButton'"), 0x7f0d00c8, "field 'saveButton'");
        addchargeaccountview.addWalletButton = (View)viewinjector.addWalletButton(obj, 0x7f0d031d, "field 'addWalletButton'");
        addchargeaccountview.addPayPalButton = (View)viewinjector.addPayPalButton(obj, 0x7f0d031e, "field 'addPayPalButton'");
        addchargeaccountview.subTitleTextView = (View)viewinjector.subTitleTextView(obj, 0x7f0d0062, "field 'subTitleTextView'");
    }

    public volatile void reset(Object obj)
    {
        reset((AddChargeAccountView)obj);
    }

    public void reset(AddChargeAccountView addchargeaccountview)
    {
        addchargeaccountview.creditCardInput = null;
        addchargeaccountview.editChargeAccountNote = null;
        addchargeaccountview.saveButton = null;
        addchargeaccountview.addWalletButton = null;
        addchargeaccountview.addPayPalButton = null;
        addchargeaccountview.subTitleTextView = null;
    }

    public ()
    {
    }
}
