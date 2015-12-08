// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.feedback;

import android.content.Context;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.User;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.feedback.RecommendationComplaintReason;
import com.pinterest.ui.actionsheet.ActionSheetFragment;

// Referenced classes of package com.pinterest.ui.feedback:
//            PinFeedbackBase

public class PinFeedbackPromoted extends PinFeedbackBase
{

    private static final int ADDITIONAL_SIZE = 4;
    private static final ElementType ELEMENT_ARRAY[];
    private static final int REASON_ARRAY[];
    private static final int TEXT_ARRAY[] = {
        0x7f0703aa, 0x7f070505, 0x7f0703d0, 0x7f07020a
    };

    public PinFeedbackPromoted(Context context, Pin pin)
    {
        super(context, pin);
    }

    public void setupOptions()
    {
        com.pinterest.ui.actionsheet.ActionSheetFragment.ActionSheetItem actionsheetitem = new com.pinterest.ui.actionsheet.ActionSheetFragment.ActionSheetItem(Resources.string(0x7f07046f, new Object[] {
            _pin.getPromoterUser().getFullName()
        }), null);
        actionsheetitem.setGrayOut(true);
        _sheet.addItem(actionsheetitem);
        actionsheetitem = new com.pinterest.ui.actionsheet.ActionSheetFragment.ActionSheetItem(0x7f0703a8, new _cls1());
        _sheet.addItem(actionsheetitem);
        if (_pin.isAlcoholAds())
        {
            actionsheetitem = new com.pinterest.ui.actionsheet.ActionSheetFragment.ActionSheetItem(0x7f0703ab, new _cls2());
            _sheet.addItem(actionsheetitem);
        }
        actionsheetitem = new com.pinterest.ui.actionsheet.ActionSheetFragment.ActionSheetItem(0x7f07031c, new _cls3());
        _sheet.addItem(actionsheetitem);
    }

    public void showAddtionalOptions()
    {
        final int index = 0;
        final ActionSheetFragment sheet = new ActionSheetFragment();
        sheet.setShowDivider(false);
        for (; index < 4; index++)
        {
            sheet.addItem(new com.pinterest.ui.actionsheet.ActionSheetFragment.ActionSheetItem(TEXT_ARRAY[index], new _cls4()));
        }

        sheet.show();
    }

    static 
    {
        REASON_ARRAY = (new int[] {
            RecommendationComplaintReason.NOT_INTERESTED.getValue(), RecommendationComplaintReason.SEEN_IT_BEFORE.getValue(), RecommendationComplaintReason.OFFENSIVE.getValue(), RecommendationComplaintReason.DO_NOT_LIKE_ADS.getValue()
        });
        ELEMENT_ARRAY = (new ElementType[] {
            ElementType.PIN_FEEDBACK_REASON_BUTTON_NOT_INTERESTED, ElementType.PIN_FEEDBACK_REASON_BUTTON_SEEN_BEFORE, ElementType.PIN_FEEDBACK_REASON_BUTTON_OFFENSIVE, ElementType.PIN_FEEDBACK_REASON_BUTTON_OFFENSIVE
        });
    }



    private class _cls1 extends PinFeedbackBase.ItemClickListener
    {

        final PinFeedbackPromoted this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.PIN_FEEDBACK_DIALOG_BUTTON_HIDE_PIN_PROMOTED, ComponentType.PIN_FEEDBACK_DIALOG_PROMOTED);
            _sheet.dismissImmediately();
            showAddtionalOptions();
        }

        _cls1()
        {
            this$0 = PinFeedbackPromoted.this;
            super(PinFeedbackPromoted.this);
        }
    }


    private class _cls2 extends PinFeedbackBase.ItemClickListener
    {

        final PinFeedbackPromoted this$0;

        public void onClick(View view)
        {
            super.onClick(view);
            Pinalytics.a(ElementType.PIN_FEEDBACK_DIALOG_BUTTON_HIDE_PIN_PROMOTED, ComponentType.PIN_FEEDBACK_DIALOG_PROMOTED);
            _pin.setFeedbackType(Integer.valueOf(FeedbackType.a.getValue()));
            _pin.setFeedbackState(new PinFeedbackState(PinFeedbackBase.STR_PIN_HIDDEN, null));
            PinApi.a(_pin.getUid(), _pin.getFeedbackType().intValue(), RecommendationComplaintReason.DO_NOT_WANT_ALCOHOL_ADS.getValue(), null, getApiTag());
        }

        _cls2()
        {
            this$0 = PinFeedbackPromoted.this;
            super(PinFeedbackPromoted.this);
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final PinFeedbackPromoted this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.PIN_FEEDBACK_DIALOG_BUTTON_LEARN_MORE_PROMOTED, ComponentType.PIN_FEEDBACK_DIALOG_PROMOTED);
            _sheet.dismissImmediately();
            ActivityHelper.goIntentView(_context, Resources.string(0x7f07074b));
        }

        _cls3()
        {
            this$0 = PinFeedbackPromoted.this;
            super();
        }
    }


    private class _cls4 extends PinFeedbackBase.ItemClickListener
    {

        final PinFeedbackPromoted this$0;
        final int val$index;
        final ActionSheetFragment val$sheet;

        public void onClick(View view)
        {
            super.onClick(view);
            sheet.dismiss();
            _pin.setFeedbackType(Integer.valueOf(FeedbackType.a.getValue()));
            _pin.setFeedbackState(new PinFeedbackState(PinFeedbackBase.STR_PIN_HIDDEN, null));
            Pinalytics.a(PinFeedbackPromoted.ELEMENT_ARRAY[index]);
            PinApi.a(_pin.getUid(), _pin.getFeedbackType().intValue(), PinFeedbackPromoted.REASON_ARRAY[index], null, getApiTag());
        }

        _cls4()
        {
            this$0 = PinFeedbackPromoted.this;
            sheet = actionsheetfragment;
            index = i;
            super(PinFeedbackPromoted.this);
        }
    }

}
