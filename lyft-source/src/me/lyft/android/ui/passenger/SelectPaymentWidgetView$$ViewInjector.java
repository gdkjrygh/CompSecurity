// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.passenger:
//            SelectPaymentWidgetView

public class 
    implements butterknife.ew..ViewInjector
{

    public volatile void inject(butterknife.ew..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (SelectPaymentWidgetView)obj, obj1);
    }

    public void inject(butterknife.ew..ViewInjector viewinjector, SelectPaymentWidgetView selectpaymentwidgetview, Object obj)
    {
        selectpaymentwidgetview.creditCardImage = (ImageView)viewinjector.creditCardImage((View)viewinjector.creditCardImage(obj, 0x7f0d03b9, "field 'creditCardImage'"), 0x7f0d03b9, "field 'creditCardImage'");
        selectpaymentwidgetview.creditCardLabel = (TextView)viewinjector.creditCardLabel((View)viewinjector.creditCardLabel(obj, 0x7f0d02db, "field 'creditCardLabel'"), 0x7f0d02db, "field 'creditCardLabel'");
        selectpaymentwidgetview.concurImage = (ImageView)viewinjector.concurImage((View)viewinjector.concurImage(obj, 0x7f0d02b5, "field 'concurImage'"), 0x7f0d02b5, "field 'concurImage'");
    }

    public volatile void reset(Object obj)
    {
        reset((SelectPaymentWidgetView)obj);
    }

    public void reset(SelectPaymentWidgetView selectpaymentwidgetview)
    {
        selectpaymentwidgetview.creditCardImage = null;
        selectpaymentwidgetview.creditCardLabel = null;
        selectpaymentwidgetview.concurImage = null;
    }

    public ()
    {
    }
}
