// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.payment:
//            DebtView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (DebtView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, DebtView debtview, Object obj)
    {
        debtview.closeButton = (ImageButton)viewinjector.closeButton((View)viewinjector.closeButton(obj, 0x7f0d0069, "field 'closeButton'"), 0x7f0d0069, "field 'closeButton'");
        debtview.debtAmountTxt = (TextView)viewinjector.debtAmountTxt((View)viewinjector.debtAmountTxt(obj, 0x7f0d016e, "field 'debtAmountTxt'"), 0x7f0d016e, "field 'debtAmountTxt'");
        debtview.cardList = (LinearLayout)viewinjector.cardList((View)viewinjector.cardList(obj, 0x7f0d0170, "field 'cardList'"), 0x7f0d0170, "field 'cardList'");
    }

    public volatile void reset(Object obj)
    {
        reset((DebtView)obj);
    }

    public void reset(DebtView debtview)
    {
        debtview.closeButton = null;
        debtview.debtAmountTxt = null;
        debtview.cardList = null;
    }

    public ()
    {
    }
}
