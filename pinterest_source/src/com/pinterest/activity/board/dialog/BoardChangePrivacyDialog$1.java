// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.dialog;

import android.view.View;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.board.dialog:
//            BoardChangePrivacyDialog

class this._cls0
    implements android.view.dChangePrivacyDialog._cls1
{

    final BoardChangePrivacyDialog this$0;

    public void onClick(View view)
    {
        boolean flag;
        if (_board.getSecret().booleanValue())
        {
            view = ElementType.BOARD_SECRET;
        } else
        {
            view = ElementType.PIN_BOARD;
        }
        Pinalytics.a(view, ComponentType.MODAL_DIALOG, _boardUid);
        view = _board;
        if (!_board.getSecret().booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ModelHelper.updateBoard(view, null, null, null, Boolean.valueOf(flag), null, BoardChangePrivacyDialog.access$000(BoardChangePrivacyDialog.this), null);
        dismiss();
    }

    ()
    {
        this$0 = BoardChangePrivacyDialog.this;
        super();
    }
}
