// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.view;

import android.view.View;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.api.remote.BoardApi;
import com.pinterest.schemas.event.ComponentType;

// Referenced classes of package com.pinterest.activity.board.view:
//            BoardHeaderInviteView

class val.dialog
    implements android.view.rdHeaderInviteView._cls1
{

    final BoardHeaderInviteView this$0;
    final BaseDialog val$dialog;

    public void onClick(View view)
    {
        Pinalytics.a(null, ComponentType.MODAL_DIALOG, BoardHeaderInviteView.access$000(BoardHeaderInviteView.this).getUid());
        BoardApi.h(String.valueOf(BoardHeaderInviteView.access$000(BoardHeaderInviteView.this).getUid()), BoardHeaderInviteView.access$100(BoardHeaderInviteView.this), BoardHeaderInviteView.access$200(BoardHeaderInviteView.this));
        val$dialog.dismiss();
    }

    ()
    {
        this$0 = final_boardheaderinviteview;
        val$dialog = BaseDialog.this;
        super();
    }
}
