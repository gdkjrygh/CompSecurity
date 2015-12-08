// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.payment:
//            DebtListItemView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (DebtListItemView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, DebtListItemView debtlistitemview, Object obj)
    {
        debtlistitemview.accountTypeImage = (ImageView)viewinjector.accountTypeImage((View)viewinjector.accountTypeImage(obj, 0x7f0d0171, "field 'accountTypeImage'"), 0x7f0d0171, "field 'accountTypeImage'");
        debtlistitemview.accountText = (TextView)viewinjector.accountText((View)viewinjector.accountText(obj, 0x7f0d0172, "field 'accountText'"), 0x7f0d0172, "field 'accountText'");
    }

    public volatile void reset(Object obj)
    {
        reset((DebtListItemView)obj);
    }

    public void reset(DebtListItemView debtlistitemview)
    {
        debtlistitemview.accountTypeImage = null;
        debtlistitemview.accountText = null;
    }

    public ()
    {
    }
}
