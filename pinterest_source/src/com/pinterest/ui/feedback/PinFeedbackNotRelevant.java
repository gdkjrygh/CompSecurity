// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.feedback;

import android.content.Context;
import com.pinterest.activity.category.fragment.CategoryFragment;
import com.pinterest.activity.interest.InterestFragment;
import com.pinterest.activity.search.GuidedSearchFragment;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.api.model.Pin;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.actionsheet.ActionSheetFragment;

// Referenced classes of package com.pinterest.ui.feedback:
//            PinFeedbackBase

public class PinFeedbackNotRelevant extends PinFeedbackBase
{

    private BaseFragment _fragment;

    public PinFeedbackNotRelevant(Context context, Pin pin, BaseFragment basefragment)
    {
        super(context, pin);
        _fragment = basefragment;
    }

    public void setupOptions()
    {
        if (_fragment != null)
        {
            final Object name;
            if ((_fragment instanceof InterestFragment) || (_fragment instanceof CategoryFragment))
            {
                name = ((CategoryFragment)_fragment).getContentTitle();
            } else
            if (_fragment instanceof GuidedSearchFragment)
            {
                name = Resources.string(0x7f070384);
            } else
            {
                name = null;
            }
            if (name != null)
            {
                name = new com.pinterest.ui.actionsheet.ActionSheetFragment.ActionSheetItem(Resources.string(0x7f070311, new Object[] {
                    name
                }), new _cls1());
                _sheet.addItem(((com.pinterest.ui.actionsheet.ActionSheetFragment.ActionSheetItem) (name)));
                return;
            }
        }
    }


    private class _cls1 extends PinFeedbackBase.ItemClickListener
    {

        final PinFeedbackNotRelevant this$0;
        final String val$name;

        public void onClick(View view)
        {
            super.onClick(view);
            view = Resources.string(0x7f07061d);
            _pin.setFeedbackState(new PinFeedbackState(0x7f02003b, 0x7f020253, PinFeedbackBase.STR_THANKS, view));
            if (_fragment instanceof GuidedSearchFragment)
            {
                SearchApi.a(_pin.getUid(), name, getApiTag());
            } else
            if (_fragment instanceof InterestFragment)
            {
                InterestsApi.a(_pin.getInterest().getUid(), _pin.getCacheableId(), "downvote", getApiTag());
            } else
            {
                BaseFragment _tmp = _fragment;
            }
            dematerializePin();
        }

        _cls1()
        {
            this$0 = PinFeedbackNotRelevant.this;
            name = s;
            super(PinFeedbackNotRelevant.this);
        }
    }

}
