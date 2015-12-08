// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import android.widget.LinearLayout;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.payment:
//            AddCreditCardFraudView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (AddCreditCardFraudView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, AddCreditCardFraudView addcreditcardfraudview, Object obj)
    {
        addcreditcardfraudview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        addcreditcardfraudview.scanCardButton = (LinearLayout)viewinjector.scanCardButton((View)viewinjector.scanCardButton(obj, 0x7f0d0156, "field 'scanCardButton'"), 0x7f0d0156, "field 'scanCardButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((AddCreditCardFraudView)obj);
    }

    public void reset(AddCreditCardFraudView addcreditcardfraudview)
    {
        addcreditcardfraudview.toolbar = null;
        addcreditcardfraudview.scanCardButton = null;
    }

    public ()
    {
    }
}
