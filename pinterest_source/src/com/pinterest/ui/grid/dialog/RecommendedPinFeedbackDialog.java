// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.smartfeed.thrift.FeedbackType;

public class RecommendedPinFeedbackDialog extends BaseDialog
{

    private Pin _pin;
    ApiResponseHandler onFeedback;

    public RecommendedPinFeedbackDialog()
    {
        onFeedback = new ApiResponseHandler();
    }

    public static String getThroughObjectUid(Pin pin, boolean flag)
    {
        String s = null;
        if (pin.getRecommendationBoardUid() != null)
        {
            if (flag)
            {
                pin.setFeedbackType(Integer.valueOf(FeedbackType.b.getValue()));
                Pinalytics.a(ElementType.PIN_FEEDBACK_DIALOG_BUTTON_PFY_STOP_RECS_FROM_THROUGH_BOARD, ComponentType.PIN_FEEDBACK_DIALOG_PFY);
            }
            s = pin.getRecommendationBoardUid();
        } else
        {
            if (pin.getRecommendationPin() != null)
            {
                if (flag)
                {
                    pin.setFeedbackType(Integer.valueOf(FeedbackType.d.getValue()));
                    Pinalytics.a(ElementType.PIN_FEEDBACK_DIALOG_BUTTON_PFY_STOP_RECS_FROM_THROUGH_PIN, ComponentType.PIN_FEEDBACK_DIALOG_PFY);
                }
                return pin.getRecommendationPin().getCacheableId();
            }
            if (pin.getRecommendationInterestUid() != null)
            {
                if (flag)
                {
                    pin.setFeedbackType(Integer.valueOf(FeedbackType.e.getValue()));
                    Pinalytics.a(ElementType.PIN_FEEDBACK_DIALOG_BUTTON_PFY_STOP_RECS_FROM_THROUGH_INTEREST, ComponentType.PIN_FEEDBACK_DIALOG_PFY);
                }
                return pin.getRecommendationInterestUid();
            }
        }
        return s;
    }

    public static RecommendedPinFeedbackDialog newInstance(Pin pin)
    {
        RecommendedPinFeedbackDialog recommendedpinfeedbackdialog = new RecommendedPinFeedbackDialog();
        Bundle bundle = new Bundle();
        bundle.putString("com.pinterest.EXTRA_PIN_ID", pin.getUid());
        recommendedpinfeedbackdialog.setArguments(bundle);
        return recommendedpinfeedbackdialog;
    }

    public void make(LayoutInflater layoutinflater)
    {
        Object obj = getContext();
        if (obj == null)
        {
            return;
        } else
        {
            obj = new RecommendedPinView(((Context) (obj)));
            ((RecommendedPinView) (obj)).setPin(_pin);
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

    private class RecommendedPinView extends LinearLayout
        implements android.view.View.OnClickListener
    {

        private TextView _message;
        private String _messageText;
        private Pin _pin;
        final RecommendedPinFeedbackDialog this$0;

        private void init()
        {
            setOrientation(1);
            inflate(getContext(), 0x7f030083, this);
            _message = (TextView)findViewById(0x7f0f0129);
            View view;
            View view1;
            if (StringUtils.isNotBlank(_messageText))
            {
                _message.setText(Html.fromHtml(_messageText));
                _message.setVisibility(0);
            } else
            {
                _message.setVisibility(8);
            }
            view = findViewById(0x7f0f0185);
            view1 = findViewById(0x7f0f0184);
            view.setOnClickListener(this);
            view1.setOnClickListener(this);
        }

        public void onClick(View view)
        {
            if (_pin == null)
            {
                return;
            }
            view.getId();
            JVM INSTR tableswitch 2131689860 2131689861: default 36
        //                       2131689860 122
        //                       2131689861 99;
               goto _L1 _L2 _L3
_L1:
            view = null;
_L4:
            Events.postSticky(new com.pinterest.api.model.Pin.EditEvent(_pin));
            PinApi.a(_pin.getUid(), _pin.getFeedbackType().intValue(), view, Pin.getRecommendationUid(_pin.getRecommendationReason()), onFeedback, null);
            dismiss();
            return;
_L3:
            _pin.setHiddenState(Integer.valueOf(1));
            view = RecommendedPinFeedbackDialog.getThroughObjectUid(_pin, true);
            if (true) goto _L4; else goto _L2
_L2:
            _pin.setHiddenState(Integer.valueOf(1));
            _pin.setFeedbackType(Integer.valueOf(FeedbackType.a.getValue()));
            Pinalytics.a(ElementType.PIN_FEEDBACK_DIALOG_BUTTON_HIDE_PIN_PFY, ComponentType.PIN_FEEDBACK_DIALOG_PFY);
            if (true) goto _L1; else goto _L5
_L5:
        }

        public void setPin(Pin pin)
        {
            _pin = pin;
            if (_pin != null)
            {
                pin = _pin.getRecommendationReason();
                String s = _pin.getRecommendationMessage();
                Board board = _pin.getRecommendationBoard();
                Pin pin1 = _pin.getRecommendationPin();
                Interest interest = _pin.getRecommendationInterest();
                TextView textview = (TextView)findViewById(0x7f0f0185);
                textview.setVisibility(8);
                if (board != null && StringUtils.isNotBlank(board.getName()))
                {
                    _messageText = Resources.string(0x7f070593, new Object[] {
                        board.getName()
                    });
                    textview.setText(Resources.string(0x7f0702e6));
                    textview.setVisibility(0);
                } else
                if (pin1 != null)
                {
                    if (StringUtils.isNotEmpty(pin1.getRichTitle()))
                    {
                        pin = pin1.getRichTitle();
                    } else
                    {
                        pin = pin1.getDescription();
                    }
                    if (StringUtils.isNotEmpty(pin))
                    {
                        _messageText = Resources.string(0x7f070595, new Object[] {
                            pin1.getDescription()
                        });
                        textview.setText(Resources.string(0x7f0702e8));
                        textview.setVisibility(0);
                    }
                } else
                if (interest != null && StringUtils.isNotBlank(interest.getName()))
                {
                    _messageText = Resources.string(0x7f070594, new Object[] {
                        interest.getName()
                    });
                    textview.setText(Resources.string(0x7f0702e7));
                    textview.setVisibility(0);
                } else
                if (pin != null && s != null)
                {
                    _messageText = Resources.string(0x7f070031);
                } else
                {
                    _messageText = "";
                }
            } else
            {
                _messageText = "";
            }
            if (StringUtils.isNotBlank(_messageText))
            {
                _message.setText(Html.fromHtml(_messageText));
                _message.setVisibility(0);
                return;
            } else
            {
                _message.setText("");
                _message.setVisibility(8);
                return;
            }
        }

        public RecommendedPinView(Context context)
        {
            this(context, null);
        }

        public RecommendedPinView(Context context, AttributeSet attributeset)
        {
            this$0 = RecommendedPinFeedbackDialog.this;
            super(context, attributeset);
            init();
        }
    }

}
