// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import me.lyft.android.controls.AdvancedEditText;

// Referenced classes of package me.lyft.android.ui.payment:
//            AddCreditCardView, BaseCreditCardView

public class  extends 
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (AddCreditCardView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, AddCreditCardView addcreditcardview, Object obj)
    {
        super.inject(viewinjector, addcreditcardview, obj);
        addcreditcardview.cardNumberEditText = (AdvancedEditText)viewinjector.cardNumberEditText((View)viewinjector.cardNumberEditText(obj, 0x7f0d0154, "field 'cardNumberEditText'"), 0x7f0d0154, "field 'cardNumberEditText'");
        addcreditcardview.expiresEditText = (AdvancedEditText)viewinjector.expiresEditText((View)viewinjector.expiresEditText(obj, 0x7f0d0157, "field 'expiresEditText'"), 0x7f0d0157, "field 'expiresEditText'");
    }

    public volatile void inject(butterknife...ViewInjector viewinjector, BaseCreditCardView basecreditcardview, Object obj)
    {
        inject(viewinjector, (AddCreditCardView)basecreditcardview, obj);
    }

    public volatile void reset(Object obj)
    {
        reset((AddCreditCardView)obj);
    }

    public void reset(AddCreditCardView addcreditcardview)
    {
        super.reset(addcreditcardview);
        addcreditcardview.cardNumberEditText = null;
        addcreditcardview.expiresEditText = null;
    }

    public volatile void reset(BaseCreditCardView basecreditcardview)
    {
        reset((AddCreditCardView)basecreditcardview);
    }

    public ()
    {
    }
}
