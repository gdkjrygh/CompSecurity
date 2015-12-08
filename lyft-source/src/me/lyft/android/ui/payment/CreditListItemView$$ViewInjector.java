// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.payment:
//            CreditListItemView

public class A
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (CreditListItemView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, CreditListItemView creditlistitemview, Object obj)
    {
        creditlistitemview.creditListItemText = (TextView)viewinjector.creditListItemText((View)viewinjector.creditListItemText(obj, 0x7f0d0162, "field 'creditListItemText'"), 0x7f0d0162, "field 'creditListItemText'");
    }

    public volatile void reset(Object obj)
    {
        reset((CreditListItemView)obj);
    }

    public void reset(CreditListItemView creditlistitemview)
    {
        creditlistitemview.creditListItemText = null;
    }

    public A()
    {
    }
}
