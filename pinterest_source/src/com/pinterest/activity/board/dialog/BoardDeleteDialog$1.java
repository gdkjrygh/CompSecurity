// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.dialog;

import android.view.View;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.board.dialog:
//            BoardDeleteDialog

class this._cls0
    implements android.view.
{

    final BoardDeleteDialog this$0;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.BOARD_DELETE_BUTTON, ComponentType.MODAL_DIALOG, _boardUid);
        BoardDeleteDialog.access$100(BoardDeleteDialog.this);
        dismiss();
    }

    ()
    {
        this$0 = BoardDeleteDialog.this;
        super();
    }
}
