// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.payment:
//            PaymentListItemView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (PaymentListItemView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, PaymentListItemView paymentlistitemview, Object obj)
    {
        paymentlistitemview.titleTextView = (TextView)viewinjector.titleTextView((View)viewinjector.titleTextView(obj, 0x7f0d0061, "field 'titleTextView'"), 0x7f0d0061, "field 'titleTextView'");
        paymentlistitemview.iconImageView = (ImageView)viewinjector.iconImageView((View)viewinjector.iconImageView(obj, 0x7f0d0337, "field 'iconImageView'"), 0x7f0d0337, "field 'iconImageView'");
        paymentlistitemview.subtitleTextView = (TextView)viewinjector.subtitleTextView((View)viewinjector.subtitleTextView(obj, 0x7f0d0062, "field 'subtitleTextView'"), 0x7f0d0062, "field 'subtitleTextView'");
        paymentlistitemview.rightIconView = (ImageView)viewinjector.rightIconView((View)viewinjector.rightIconView(obj, 0x7f0d0338, "field 'rightIconView'"), 0x7f0d0338, "field 'rightIconView'");
    }

    public volatile void reset(Object obj)
    {
        reset((PaymentListItemView)obj);
    }

    public void reset(PaymentListItemView paymentlistitemview)
    {
        paymentlistitemview.titleTextView = null;
        paymentlistitemview.iconImageView = null;
        paymentlistitemview.subtitleTextView = null;
        paymentlistitemview.rightIconView = null;
    }

    public ()
    {
    }
}
