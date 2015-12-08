// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.dialog;

import android.view.View;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.BoardApi;

// Referenced classes of package com.pinterest.activity.board.dialog:
//            BoardLeaveDialog

class this._cls0
    implements android.view.r
{

    final BoardLeaveDialog this$0;

    public void onClick(View view)
    {
        view = String.valueOf(MyUser.getUid());
        BoardApi.a(String.valueOf(_boardUid), view, false, BoardLeaveDialog.access$000(BoardLeaveDialog.this), null);
        dismiss();
    }

    ()
    {
        this$0 = BoardLeaveDialog.this;
        super();
    }
}
