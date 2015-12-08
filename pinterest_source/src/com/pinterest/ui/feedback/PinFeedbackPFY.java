// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.feedback;

import android.content.Context;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.Pin;
import com.pinterest.fantasio.thrift.ReasonToChoose;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.actionsheet.ActionSheetFragment;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.ui.feedback:
//            PinFeedbackBase

public class PinFeedbackPFY extends PinFeedbackBase
{

    public PinFeedbackPFY(Context context, Pin pin)
    {
        super(context, pin);
    }

    private void addNotIntoPinOption()
    {
        com.pinterest.ui.actionsheet.ActionSheetFragment.ActionSheetItem actionsheetitem = new com.pinterest.ui.actionsheet.ActionSheetFragment.ActionSheetItem(0x7f0703a8, new _cls1());
        _sheet.addItem(actionsheetitem);
    }

    private void addNotIntoType(final boolean isRecentActivity)
    {
        final String name;
        if (isRecentActivity)
        {
            name = Resources.string(0x7f070383);
        } else
        {
            name = getRecommendedName(_pin);
        }
        if (StringUtils.isEmpty(name))
        {
            return;
        } else
        {
            name = new com.pinterest.ui.actionsheet.ActionSheetFragment.ActionSheetItem(Resources.string(0x7f0703a7, new Object[] {
                name
            }), new _cls2());
            _sheet.addItem(name);
            return;
        }
    }

    public static String getRecommendedName(Pin pin)
    {
        String s = null;
        if (pin.getRecommendationBoard() != null)
        {
            s = pin.getRecommendationBoard().getName();
        } else
        {
            if (pin.getRecommendationPin() != null)
            {
                return Resources.string(0x7f0703f3);
            }
            if (pin.getRecommendationInterest() != null)
            {
                return pin.getRecommendationInterest().getName();
            }
        }
        return s;
    }

    public void setupOptions()
    {
        addNotIntoPinOption();
        ReasonToChoose reasontochoose = Pin.getRecommendationEnum(_pin.getRecommendationReason());
        switch (_cls3..SwitchMap.com.pinterest.fantasio.thrift.ReasonToChoose[reasontochoose.ordinal()])
        {
        default:
            addNotIntoType(false);
            return;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            addNotIntoType(true);
            break;
        }
    }

    private class _cls1 extends PinFeedbackBase.ItemClickListener
    {

        final PinFeedbackPFY this$0;

        public void onClick(View view)
        {
            super.onClick(view);
            _pin.setFeedbackState(new PinFeedbackState(PinFeedbackBase.STR_PIN_HIDDEN, null));
            _pin.setFeedbackType(Integer.valueOf(FeedbackType.a.getValue()));
            view = RecommendedPinFeedbackDialog.getThroughObjectUid(_pin, false);
            PinApi.a(_pin.getUid(), _pin.getFeedbackType().intValue(), view, Pin.getRecommendationUid(_pin.getRecommendationReason()), null, getApiTag());
        }

        _cls1()
        {
            this$0 = PinFeedbackPFY.this;
            super(PinFeedbackPFY.this);
        }
    }


    private class _cls2 extends PinFeedbackBase.ItemClickListener
    {

        final PinFeedbackPFY this$0;
        final boolean val$isRecentActivity;
        final String val$name;

        public void onClick(View view)
        {
            super.onClick(view);
            view = Resources.string(0x7f07039f, new Object[] {
                name
            });
            _pin.setFeedbackState(new PinFeedbackState(0x7f02003b, 0x7f020253, PinFeedbackBase.STR_GOT_IT, view));
            if (!isRecentActivity)
            {
                view = RecommendedPinFeedbackDialog.getThroughObjectUid(_pin, true);
            } else
            {
                _pin.setFeedbackType(Integer.valueOf(FeedbackType.d.getValue()));
                if (_pin.getRecommendationPin() != null)
                {
                    view = _pin.getRecommendationPin().getCacheableId();
                } else
                {
                    view = null;
                }
            }
            PinApi.a(_pin.getUid(), _pin.getFeedbackType().intValue(), view, Pin.getRecommendationUid(_pin.getRecommendationReason()), null, getApiTag());
        }

        _cls2()
        {
            this$0 = PinFeedbackPFY.this;
            name = s;
            isRecentActivity = flag;
            super(PinFeedbackPFY.this);
        }
    }


    private class _cls3
    {

        static final int $SwitchMap$com$pinterest$fantasio$thrift$ReasonToChoose[];

        static 
        {
            $SwitchMap$com$pinterest$fantasio$thrift$ReasonToChoose = new int[ReasonToChoose.values().length];
            try
            {
                $SwitchMap$com$pinterest$fantasio$thrift$ReasonToChoose[ReasonToChoose.e.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$pinterest$fantasio$thrift$ReasonToChoose[ReasonToChoose.g.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$fantasio$thrift$ReasonToChoose[ReasonToChoose.k.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$fantasio$thrift$ReasonToChoose[ReasonToChoose.p.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
