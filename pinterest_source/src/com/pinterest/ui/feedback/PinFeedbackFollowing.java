// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.feedback;

import android.content.Context;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.User;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.actionsheet.ActionSheetFragment;
import org.apache.commons.lang3.BooleanUtils;

// Referenced classes of package com.pinterest.ui.feedback:
//            PinFeedbackBase

public class PinFeedbackFollowing extends PinFeedbackBase
{

    public PinFeedbackFollowing(Context context, Pin pin)
    {
        super(context, pin);
    }

    public void setupOptions()
    {
        if (_pin.getBoard() != null && BooleanUtils.isTrue(_pin.getBoard().getFollowing()))
        {
            com.pinterest.ui.actionsheet.ActionSheetFragment.ActionSheetItem actionsheetitem = new com.pinterest.ui.actionsheet.ActionSheetFragment.ActionSheetItem(Resources.string(0x7f0705bd, new Object[] {
                _pin.getBoard().getName()
            }), new _cls1());
            _sheet.addItem(actionsheetitem);
        }
        if (_pin.getUser() != null)
        {
            com.pinterest.ui.actionsheet.ActionSheetFragment.ActionSheetItem actionsheetitem1 = new com.pinterest.ui.actionsheet.ActionSheetFragment.ActionSheetItem(Resources.string(0x7f0705bd, new Object[] {
                _pin.getUser().getFullName()
            }), new _cls2());
            _sheet.addItem(actionsheetitem1);
        }
    }

    private class _cls1 extends PinFeedbackBase.ItemClickListener
    {

        final PinFeedbackFollowing this$0;

        public void onClick(View view)
        {
            super.onClick(view);
            view = Resources.string(0x7f07039e, new Object[] {
                _pin.getBoard().getName()
            });
            _pin.setFeedbackState((new PinFeedbackState(PinFeedbackBase.STR_UNFOLLOWED, view)).setDestination(new Navigation(Location.BOARD, _pin.getBoard())));
            BoardApi.j(_pin.getBoardUid(), null, getApiTag());
            dematerializePin();
        }

        _cls1()
        {
            this$0 = PinFeedbackFollowing.this;
            super(PinFeedbackFollowing.this);
        }
    }


    private class _cls2 extends PinFeedbackBase.ItemClickListener
    {

        final PinFeedbackFollowing this$0;

        public void onClick(View view)
        {
            super.onClick(view);
            view = Resources.string(0x7f07039e, new Object[] {
                _pin.getUser().getFullName()
            });
            _pin.setFeedbackState((new PinFeedbackState(PinFeedbackBase.STR_UNFOLLOWED, view)).setDestination(new Navigation(Location.USER, _pin.getUser())));
            UserApi.h(_pin.getUserUid(), null, getApiTag());
            dematerializePin();
        }

        _cls2()
        {
            this$0 = PinFeedbackFollowing.this;
            super(PinFeedbackFollowing.this);
        }
    }

}
