// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import me.lyft.android.controls.AdvancedEditText;

// Referenced classes of package me.lyft.android.ui.payment:
//            ChargeAccountCustomLabelDialogView

public class _cls2.val.target
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (ChargeAccountCustomLabelDialogView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, final ChargeAccountCustomLabelDialogView target, Object obj)
    {
        target.customLabelEditText = (AdvancedEditText)viewinjector.customLabelEditText((View)viewinjector.customLabelEditText(obj, 0x7f0d0328, "field 'customLabelEditText'"), 0x7f0d0328, "field 'customLabelEditText'");
        target.inlineErrorText = (TextView)viewinjector.inlineErrorText((View)viewinjector.inlineErrorText(obj, 0x7f0d006d, "field 'inlineErrorText'"), 0x7f0d006d, "field 'inlineErrorText'");
        ((View)viewinjector.inlineErrorText(obj, 0x7f0d00c8, "method 'onSaveButtonClick'")).setOnClickListener(new DebouncingOnClickListener() {

            final ChargeAccountCustomLabelDialogView..ViewInjector this$0;
            final ChargeAccountCustomLabelDialogView val$target;

            public void doClick(View view)
            {
                target.onSaveButtonClick();
            }

            
            {
                this$0 = ChargeAccountCustomLabelDialogView..ViewInjector.this;
                target = chargeaccountcustomlabeldialogview;
                super();
            }
        });
        ((View)viewinjector.(obj, 0x7f0d00b2, "method 'onCancelButtonClick'")).setOnClickListener(new DebouncingOnClickListener() {

            final ChargeAccountCustomLabelDialogView..ViewInjector this$0;
            final ChargeAccountCustomLabelDialogView val$target;

            public void doClick(View view)
            {
                target.onCancelButtonClick();
            }

            
            {
                this$0 = ChargeAccountCustomLabelDialogView..ViewInjector.this;
                target = chargeaccountcustomlabeldialogview;
                super();
            }
        });
    }

    public volatile void reset(Object obj)
    {
        reset((ChargeAccountCustomLabelDialogView)obj);
    }

    public void reset(ChargeAccountCustomLabelDialogView chargeaccountcustomlabeldialogview)
    {
        chargeaccountcustomlabeldialogview.customLabelEditText = null;
        chargeaccountcustomlabeldialogview.inlineErrorText = null;
    }

    public _cls2.val.target()
    {
    }
}
