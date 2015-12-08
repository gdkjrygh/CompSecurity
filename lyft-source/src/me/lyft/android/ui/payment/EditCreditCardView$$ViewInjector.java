// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;

// Referenced classes of package me.lyft.android.ui.payment:
//            EditCreditCardView, BaseCreditCardView

public class A extends A
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (EditCreditCardView)obj, obj1);
    }

    public volatile void inject(butterknife...ViewInjector viewinjector, BaseCreditCardView basecreditcardview, Object obj)
    {
        inject(viewinjector, (EditCreditCardView)basecreditcardview, obj);
    }

    public void inject(butterknife...ViewInjector viewinjector, EditCreditCardView editcreditcardview, Object obj)
    {
        super.inject(viewinjector, editcreditcardview, obj);
        editcreditcardview.defaultCardView = (View)viewinjector.defaultCardView(obj, 0x7f0d01fa, "field 'defaultCardView'");
        editcreditcardview.deleteCardButton = (View)viewinjector.deleteCardButton(obj, 0x7f0d0334, "field 'deleteCardButton'");
        editcreditcardview.makeDefaultButton = (View)viewinjector.makeDefaultButton(obj, 0x7f0d01fc, "field 'makeDefaultButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((EditCreditCardView)obj);
    }

    public volatile void reset(BaseCreditCardView basecreditcardview)
    {
        reset((EditCreditCardView)basecreditcardview);
    }

    public void reset(EditCreditCardView editcreditcardview)
    {
        super.reset(editcreditcardview);
        editcreditcardview.defaultCardView = null;
        editcreditcardview.deleteCardButton = null;
        editcreditcardview.makeDefaultButton = null;
    }

    public A()
    {
    }
}
