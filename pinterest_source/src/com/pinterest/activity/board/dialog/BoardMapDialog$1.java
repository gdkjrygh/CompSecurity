// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.dialog;

import android.view.View;
import android.widget.CheckBox;
import com.pinterest.api.remote.BoardApi;

// Referenced classes of package com.pinterest.activity.board.dialog:
//            BoardMapDialog

class val.isChecked
    implements android.view.ner
{

    final BoardMapDialog this$0;
    final CheckBox val$blockCb;
    final boolean val$isChecked;

    public void onClick(View view)
    {
        if (val$blockCb.isChecked() != val$isChecked)
        {
            if (val$blockCb.isChecked())
            {
                view = "places";
            } else
            {
                view = "default";
            }
            BoardApi.a(_boardUid, null, null, null, null, view, null, BoardMapDialog.access$000(BoardMapDialog.this), null);
        }
        dismiss();
    }

    ()
    {
        this$0 = final_boardmapdialog;
        val$blockCb = checkbox;
        val$isChecked = Z.this;
        super();
    }
}
