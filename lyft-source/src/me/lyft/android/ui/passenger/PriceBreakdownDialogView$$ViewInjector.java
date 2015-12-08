// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PriceBreakdownDialogView

public class _cls2.val.target
    implements butterknife.ew..ViewInjector
{

    public volatile void inject(butterknife.ew..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (PriceBreakdownDialogView)obj, obj1);
    }

    public void inject(butterknife.ew..ViewInjector viewinjector, final PriceBreakdownDialogView target, Object obj)
    {
        target.container = (LinearLayout)viewinjector.container((View)viewinjector.container(obj, 0x7f0d0218, "field 'container'"), 0x7f0d0218, "field 'container'");
        target.chargedLabel = (View)viewinjector.chargedLabel(obj, 0x7f0d034f, "field 'chargedLabel'");
        target.totalAmount = (TextView)viewinjector.totalAmount((View)viewinjector.totalAmount(obj, 0x7f0d021a, "field 'totalAmount'"), 0x7f0d021a, "field 'totalAmount'");
        ((View)viewinjector.totalAmount(obj, 0x7f0d0350, "method 'onPricingInfoClicked'")).setOnClickListener(new DebouncingOnClickListener() {

            final PriceBreakdownDialogView..ViewInjector this$0;
            final PriceBreakdownDialogView val$target;

            public void doClick(View view)
            {
                target.onPricingInfoClicked();
            }

            
            {
                this$0 = PriceBreakdownDialogView..ViewInjector.this;
                target = pricebreakdowndialogview;
                super();
            }
        });
        ((View)viewinjector.ew(obj, 0x7f0d00b2, "method 'onCancelClicked'")).setOnClickListener(new DebouncingOnClickListener() {

            final PriceBreakdownDialogView..ViewInjector this$0;
            final PriceBreakdownDialogView val$target;

            public void doClick(View view)
            {
                target.onCancelClicked();
            }

            
            {
                this$0 = PriceBreakdownDialogView..ViewInjector.this;
                target = pricebreakdowndialogview;
                super();
            }
        });
    }

    public volatile void reset(Object obj)
    {
        reset((PriceBreakdownDialogView)obj);
    }

    public void reset(PriceBreakdownDialogView pricebreakdowndialogview)
    {
        pricebreakdowndialogview.container = null;
        pricebreakdowndialogview.chargedLabel = null;
        pricebreakdowndialogview.totalAmount = null;
    }

    public _cls2.val.target()
    {
    }
}
