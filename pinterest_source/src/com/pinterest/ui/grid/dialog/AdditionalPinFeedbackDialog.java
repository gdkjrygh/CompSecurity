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
import com.pinterest.schemas.event.ComponentType;

public class AdditionalPinFeedbackDialog extends BaseDialog
{

    private ComponentType COMPONENT_TYPE;
    private Pin _pin;
    ApiResponseHandler onFeedback;

    public AdditionalPinFeedbackDialog()
    {
        onFeedback = new ApiResponseHandler();
    }

    public static AdditionalPinFeedbackDialog newInstance(Pin pin)
    {
        AdditionalPinFeedbackDialog additionalpinfeedbackdialog = new AdditionalPinFeedbackDialog();
        Bundle bundle = new Bundle();
        bundle.putString("com.pinterest.EXTRA_PIN_ID", pin.getUid());
        additionalpinfeedbackdialog.setArguments(bundle);
        return additionalpinfeedbackdialog;
    }

    public void make(LayoutInflater layoutinflater)
    {
        Object obj = getContext();
        if (obj == null)
        {
            return;
        } else
        {
            obj = new AdditionalPinFeedbackView(((Context) (obj)));
            ((AdditionalPinFeedbackView) (obj)).setPin(_pin);
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
            _pin = ModelHelper.getPin(bundle1.getString("com.pinterest.EXTRA_PIN_ID"));
        }
        super.onCreate(bundle);
    }



/*
    static ComponentType access$002(AdditionalPinFeedbackDialog additionalpinfeedbackdialog, ComponentType componenttype)
    {
        additionalpinfeedbackdialog.COMPONENT_TYPE = componenttype;
        return componenttype;
    }

*/

    private class AdditionalPinFeedbackView extends LinearLayout
        implements android.view.View.OnClickListener
    {

        private Pin _pin;
        final AdditionalPinFeedbackDialog this$0;

        private void init()
        {
            setOrientation(1);
            inflate(getContext(), 0x7f03005d, this);
            findViewById(0x7f0f012b).setOnClickListener(this);
            findViewById(0x7f0f012a).setOnClickListener(this);
            findViewById(0x7f0f012c).setOnClickListener(this);
        }

        public void onClick(View view)
        {
            int i = RecommendationComplaintReason.DO_NOT_LIKE_ADS.getValue();
            view.getId();
            JVM INSTR tableswitch 2131689770 2131689772: default 36
        //                       2131689770 131
        //                       2131689771 154
        //                       2131689772 177;
               goto _L1 _L2 _L3 _L4
_L1:
            break; /* Loop/switch isn't completed */
_L4:
            break MISSING_BLOCK_LABEL_177;
_L5:
            if (_pin != null && _pin.getRecommendationReason() != null)
            {
                PinApi.a(_pin.getUid(), _pin.getFeedbackType().intValue(), _pin.getRecommendationBoardUid(), Pin.getRecommendationUid(_pin.getRecommendationReason()), i, onFeedback);
            } else
            {
                PinApi.a(_pin.getUid(), _pin.getFeedbackType().intValue(), i, onFeedback, null);
            }
            _pin.setHiddenState(Integer.valueOf(2));
            Events.postSticky(new com.pinterest.api.model.Pin.EditEvent(_pin));
            dismiss();
            return;
_L2:
            i = RecommendationComplaintReason.NOT_INTERESTED.getValue();
            Pinalytics.a(ElementType.PIN_FEEDBACK_REASON_BUTTON_NOT_INTERESTED, COMPONENT_TYPE);
              goto _L5
_L3:
            i = RecommendationComplaintReason.OFFENSIVE.getValue();
            Pinalytics.a(ElementType.PIN_FEEDBACK_REASON_BUTTON_OFFENSIVE, COMPONENT_TYPE);
              goto _L5
            i = RecommendationComplaintReason.SEEN_IT_BEFORE.getValue();
            Pinalytics.a(ElementType.PIN_FEEDBACK_REASON_BUTTON_SEEN_BEFORE, COMPONENT_TYPE);
              goto _L5
        }

        public void setPin(Pin pin)
        {
            _pin = pin;
            if (_pin.getPromoterUid() != null)
            {
                COMPONENT_TYPE = ComponentType.PIN_FEEDBACK_DIALOG_PROMOTED_REASON;
                return;
            } else
            {
                COMPONENT_TYPE = ComponentType.PIN_FEEDBACK_DIALOG_PFY_REASON;
                return;
            }
        }

        public AdditionalPinFeedbackView(Context context)
        {
            this(context, null);
        }

        public AdditionalPinFeedbackView(Context context, AttributeSet attributeset)
        {
            this$0 = AdditionalPinFeedbackDialog.this;
            super(context, attributeset);
            init();
        }
    }

}
