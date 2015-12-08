// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            SplitPaymentRequestView

public class _cls2.val.target
    implements butterknife.ew..ViewInjector
{

    public volatile void inject(butterknife.ew..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (SplitPaymentRequestView)obj, obj1);
    }

    public void inject(butterknife.ew..ViewInjector viewinjector, final SplitPaymentRequestView target, Object obj)
    {
        target.userImage = (ImageView)viewinjector.userImage((View)viewinjector.userImage(obj, 0x7f0d03e8, "field 'userImage'"), 0x7f0d03e8, "field 'userImage'");
        target.splitPaymentLabel = (TextView)viewinjector.splitPaymentLabel((View)viewinjector.splitPaymentLabel(obj, 0x7f0d03e9, "field 'splitPaymentLabel'"), 0x7f0d03e9, "field 'splitPaymentLabel'");
        target.splitPaymentFee = (TextView)viewinjector.splitPaymentFee((View)viewinjector.splitPaymentFee(obj, 0x7f0d023c, "field 'splitPaymentFee'"), 0x7f0d023c, "field 'splitPaymentFee'");
        ((View)viewinjector.splitPaymentFee(obj, 0x7f0d005e, "method 'onAcceptClicked'")).setOnClickListener(new DebouncingOnClickListener() {

            final SplitPaymentRequestView..ViewInjector this$0;
            final SplitPaymentRequestView val$target;

            public void doClick(View view)
            {
                target.onAcceptClicked();
            }

            
            {
                this$0 = SplitPaymentRequestView..ViewInjector.this;
                target = splitpaymentrequestview;
                super();
            }
        });
        ((View)viewinjector.ew(obj, 0x7f0d03ea, "method 'onDeclineClicked'")).setOnClickListener(new DebouncingOnClickListener() {

            final SplitPaymentRequestView..ViewInjector this$0;
            final SplitPaymentRequestView val$target;

            public void doClick(View view)
            {
                target.onDeclineClicked();
            }

            
            {
                this$0 = SplitPaymentRequestView..ViewInjector.this;
                target = splitpaymentrequestview;
                super();
            }
        });
    }

    public volatile void reset(Object obj)
    {
        reset((SplitPaymentRequestView)obj);
    }

    public void reset(SplitPaymentRequestView splitpaymentrequestview)
    {
        splitpaymentrequestview.userImage = null;
        splitpaymentrequestview.splitPaymentLabel = null;
        splitpaymentrequestview.splitPaymentFee = null;
    }

    public _cls2.val.target()
    {
    }
}
