// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import android.view.View;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.api.model.Board;

// Referenced classes of package com.pinterest.activity.report:
//            ReportHelper

final class val.dialog
    implements android.view.tener
{

    final Board val$board;
    final BaseDialog val$dialog;

    public final void onClick(View view)
    {
        ReportHelper.unfollowBoard(val$board, null);
        val$dialog.dismiss();
    }

    ()
    {
        val$board = board1;
        val$dialog = basedialog;
        super();
    }
}
