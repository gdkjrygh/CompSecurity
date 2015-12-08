// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.feedback;

import android.content.Context;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.PinApi;
import com.pinterest.base.Events;
import com.pinterest.fantasio.thrift.ReasonToChoose;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.actionsheet.ActionSheetFragment;
import java.util.Set;

// Referenced classes of package com.pinterest.ui.feedback:
//            PinFeedbackPromoted, PinFeedbackNotRelevant, PinFeedbackTopic, PinFeedbackPFY, 
//            PinFeedbackRelated, PinFeedbackFollowing

public abstract class PinFeedbackBase
{

    private static final Set SHOW_NOT_RELEVANT = new _cls1();
    public static final String STR_GOT_IT = Resources.string(0x7f0702de);
    public static final String STR_PIN_HIDDEN = Resources.string(0x7f070408);
    public static final String STR_REPORTED = Resources.string(0x7f0704b0);
    public static final String STR_THANKS = Resources.string(0x7f070589);
    public static final String STR_UNFOLLOWED = Resources.string(0x7f0705c5);
    protected Context _context;
    protected Pin _pin;
    protected ActionSheetFragment _sheet;

    public PinFeedbackBase(Context context, Pin pin)
    {
        _context = context;
        _pin = pin;
    }

    public static PinFeedbackBase get(Context context, Pin pin)
    {
        return get(context, pin, null);
    }

    public static PinFeedbackBase get(Context context, Pin pin, BaseFragment basefragment)
    {
        if (pin.shouldShowPromoterInGrid())
        {
            return new PinFeedbackPromoted(context, pin);
        }
        if (showNotRelevantOption(basefragment))
        {
            return new PinFeedbackNotRelevant(context, pin, basefragment);
        }
        if (pin.getRecommendationReason() != null)
        {
            if (Pin.getRecommendationEnum(pin.getRecommendationReason()) == ReasonToChoose.f)
            {
                return new PinFeedbackTopic(context, pin);
            } else
            {
                return new PinFeedbackPFY(context, pin);
            }
        }
        if (pin.getIsDynamicallyInserted())
        {
            return new PinFeedbackRelated(context, pin);
        } else
        {
            return new PinFeedbackFollowing(context, pin);
        }
    }

    public static boolean showNotRelevantOption(BaseFragment basefragment)
    {
        if (basefragment == null)
        {
            return false;
        } else
        {
            return SHOW_NOT_RELEVANT.contains(basefragment.getClass());
        }
    }

    protected void dematerializePin()
    {
        PinApi.a(_pin.getUid(), getApiTag());
    }

    protected String getApiTag()
    {
        return getClass().getName();
    }

    public void setupCommonOptions()
    {
        com.pinterest.ui.actionsheet.ActionSheetFragment.ActionSheetItem actionsheetitem = new com.pinterest.ui.actionsheet.ActionSheetFragment.ActionSheetItem(0x7f0704b3, new _cls2());
        _sheet.addItem(actionsheetitem);
    }

    public abstract void setupOptions();

    public void showFeedBack()
    {
        if (_pin == null)
        {
            return;
        } else
        {
            _sheet = new ActionSheetFragment();
            _sheet.setShowDivider(false);
            setupOptions();
            setupCommonOptions();
            _sheet.show();
            return;
        }
    }

    protected void updateAndDismiss()
    {
        _pin.setHiddenState(Integer.valueOf(3));
        Events.postSticky(new com.pinterest.api.model.Pin.EditEvent(_pin));
        if (_sheet != null)
        {
            _sheet.dismiss();
            _sheet = null;
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final PinFeedbackBase this$0;

        public void onClick(View view)
        {
            view = new ReportPinDialog(_pin.getUid());
            view.setFromGrid(true);
            Events.post(new DialogEvent(view));
            _sheet.dismiss();
        }

        _cls2()
        {
            this$0 = PinFeedbackBase.this;
            super();
        }
    }


    private class _cls1 extends HashSet
    {

        _cls1()
        {
            add(com/pinterest/activity/category/fragment/CategoryFragment);
            add(com/pinterest/activity/interest/InterestFragment);
            add(com/pinterest/activity/search/GuidedSearchFragment);
        }
    }

}
