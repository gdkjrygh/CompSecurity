// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import me.lyft.android.ui.payment.cardinput.CreditCardInput;

// Referenced classes of package me.lyft.android.ui.payment:
//            DebtChargeAccountView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (DebtChargeAccountView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, DebtChargeAccountView debtchargeaccountview, Object obj)
    {
        debtchargeaccountview.saveButton = (Button)viewinjector.saveButton((View)viewinjector.saveButton(obj, 0x7f0d00c8, "field 'saveButton'"), 0x7f0d00c8, "field 'saveButton'");
        debtchargeaccountview.backButton = (ImageButton)viewinjector.backButton((View)viewinjector.backButton(obj, 0x7f0d0173, "field 'backButton'"), 0x7f0d0173, "field 'backButton'");
        debtchargeaccountview.titleTxt = (TextView)viewinjector.titleTxt((View)viewinjector.titleTxt(obj, 0x7f0d0174, "field 'titleTxt'"), 0x7f0d0174, "field 'titleTxt'");
        debtchargeaccountview.subTitleTxt = (TextView)viewinjector.subTitleTxt((View)viewinjector.subTitleTxt(obj, 0x7f0d0175, "field 'subTitleTxt'"), 0x7f0d0175, "field 'subTitleTxt'");
        debtchargeaccountview.creditCardInput = (CreditCardInput)viewinjector.nput((View)viewinjector.nput(obj, 0x7f0d006c, "field 'creditCardInput'"), 0x7f0d006c, "field 'creditCardInput'");
        debtchargeaccountview.editCardNote = (TextView)viewinjector.editCardNote((View)viewinjector.editCardNote(obj, 0x7f0d0176, "field 'editCardNote'"), 0x7f0d0176, "field 'editCardNote'");
    }

    public volatile void reset(Object obj)
    {
        reset((DebtChargeAccountView)obj);
    }

    public void reset(DebtChargeAccountView debtchargeaccountview)
    {
        debtchargeaccountview.saveButton = null;
        debtchargeaccountview.backButton = null;
        debtchargeaccountview.titleTxt = null;
        debtchargeaccountview.subTitleTxt = null;
        debtchargeaccountview.creditCardInput = null;
        debtchargeaccountview.editCardNote = null;
    }

    public ()
    {
    }
}
