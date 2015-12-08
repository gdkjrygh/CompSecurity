// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;

public class PromotedPinFeedbackDialog extends BaseDialog
{

    private boolean _fromPinCloseUpView;
    private Pin _pin;
    ApiResponseHandler onFeedback;

    public PromotedPinFeedbackDialog()
    {
        _fromPinCloseUpView = false;
        onFeedback = new ApiResponseHandler();
    }

    public static PromotedPinFeedbackDialog newInstance(Pin pin, boolean flag)
    {
        PromotedPinFeedbackDialog promotedpinfeedbackdialog = new PromotedPinFeedbackDialog();
        Bundle bundle = new Bundle();
        bundle.putString("com.pinterest.EXTRA_PIN_ID", pin.getUid());
        bundle.putBoolean("com.pinterest.EXTRA_PROMOTED_DIALOG_FROM_PIN_CLOSEUP", flag);
        promotedpinfeedbackdialog.setArguments(bundle);
        return promotedpinfeedbackdialog;
    }

    public void make(LayoutInflater layoutinflater)
    {
        Object obj = getContext();
        if (obj == null)
        {
            return;
        } else
        {
            obj = new PromotedPinView(((Context) (obj)));
            ((PromotedPinView) (obj)).setPin(_pin);
            setContent(((View) (obj)), 0);
            super.make(layoutinflater);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        Bundle bundle1 = getArguments();
        if (bundle1 != null && bundle1.getString("com.pinterest.EXTRA_PIN_ID") != null)
        {
            if (bundle1.getString("com.pinterest.EXTRA_PIN_ID") != null)
            {
                _pin = ModelHelper.getPin(bundle1.getString("com.pinterest.EXTRA_PIN_ID"));
            }
            if (bundle1.containsKey("com.pinterest.EXTRA_PROMOTED_DIALOG_FROM_PIN_CLOSEUP"))
            {
                _fromPinCloseUpView = bundle1.getBoolean("com.pinterest.EXTRA_PROMOTED_DIALOG_FROM_PIN_CLOSEUP");
            }
        }
        super.onCreate(bundle);
    }


    private class PromotedPinView extends LinearLayout
        implements android.view.View.OnClickListener
    {

        private TextView _message;
        private String _messageText;
        private Pin _pin;
        private TextView _title;
        final PromotedPinFeedbackDialog this$0;

        private void init()
        {
            setOrientation(1);
            inflate(getContext(), 0x7f030082, this);
            _message = (TextView)findViewById(0x7f0f0129);
            if (StringUtils.isNotBlank(_messageText))
            {
                _message.setText(Html.fromHtml(_messageText));
            }
            findViewById(0x7f0f0183).setOnClickListener(this);
            findViewById(0x7f0f0184).setOnClickListener(this);
        }

        public void onClick(View view)
        {
            view.getId();
            JVM INSTR tableswitch 2131689859 2131689860: default 28
        //                       2131689859 36
        //                       2131689860 60;
               goto _L1 _L2 _L3
_L1:
            dismiss();
            return;
_L2:
            Pinalytics.a(ElementType.PIN_FEEDBACK_DIALOG_BUTTON_LEARN_MORE_PROMOTED, ComponentType.PIN_FEEDBACK_DIALOG_PROMOTED);
            ActivityHelper.goIntentView(getContext(), Resources.string(0x7f07074b));
            continue; /* Loop/switch isn't completed */
_L3:
            _pin.setHiddenState(Integer.valueOf(1));
            Events.postSticky(new com.pinterest.api.model.Pin.EditEvent(_pin));
            _pin.setFeedbackType(Integer.valueOf(FeedbackType.a.getValue()));
            PinApi.a(_pin.getUid(), _pin.getFeedbackType().intValue(), onFeedback);
            Pinalytics.a(ElementType.PIN_FEEDBACK_DIALOG_BUTTON_HIDE_PIN_PROMOTED, ComponentType.PIN_FEEDBACK_DIALOG_PROMOTED);
            if (_fromPinCloseUpView)
            {
                view = getActivity();
                if (view != null)
                {
                    view.onBackPressed();
                }
            }
            if (true) goto _L1; else goto _L4
_L4:
        }

        public void setPin(Pin pin)
        {
            if (pin == null)
            {
                return;
            }
            _pin = pin;
            _pin.getBoard();
            _messageText = Resources.string(0x7f07046f, new Object[] {
                _pin.getPromoterUser().getFullName()
            });
            if (StringUtils.isNotBlank(_messageText))
            {
                _message.setText(Html.fromHtml(_messageText));
                return;
            } else
            {
                _message.setText("");
                return;
            }
        }

        public PromotedPinView(Context context)
        {
            this(context, null);
        }

        public PromotedPinView(Context context, AttributeSet attributeset)
        {
            this$0 = PromotedPinFeedbackDialog.this;
            super(context, attributeset);
            init();
        }
    }

}
