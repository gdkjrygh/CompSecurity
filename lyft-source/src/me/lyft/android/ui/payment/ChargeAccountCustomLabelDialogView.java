// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.IHandleBack;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.dialogs.DialogContainerView;
import me.lyft.android.utils.Keyboard;

public class ChargeAccountCustomLabelDialogView extends DialogContainerView
    implements IHandleBack
{

    AppFlow appFlow;
    MessageBus bus;
    private String customLabel;
    AdvancedEditText customLabelEditText;
    DialogFlow dialogFlow;
    TextView inlineErrorText;
    private final PaymentDialogs.ChargeAccountCustomLabelDialog params;

    public ChargeAccountCustomLabelDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (PaymentDialogs.ChargeAccountCustomLabelDialog)context.a();
        customLabel = params.getCustomLabel();
    }

    public void onCancelButtonClick()
    {
        Keyboard.hideKeyboard(customLabelEditText);
        dialogFlow.dismiss();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        if (!Strings.isNullOrEmpty(customLabel))
        {
            customLabelEditText.setText(customLabel);
        }
        customLabelEditText.setValidationMessageView(inlineErrorText);
        Keyboard.showKeyboard(customLabelEditText);
    }

    public void onSaveButtonClick()
    {
        if (Strings.isNullOrEmpty(customLabelEditText.getEditableText().toString().trim()))
        {
            customLabelEditText.setValidationErrorId(Integer.valueOf(0x7f070273));
            return;
        } else
        {
            ChangeChargeAccountLabelView.ResponseData responsedata = new ChangeChargeAccountLabelView.ResponseData(params.getCardLabelType(), customLabelEditText.getEditableText().toString());
            bus.post(me/lyft/android/ui/payment/ChangeChargeAccountLabelView$ResponseEvent, responsedata);
            Keyboard.hideKeyboard(customLabelEditText);
            dialogFlow.dismiss();
            appFlow.goBack();
            return;
        }
    }
}
