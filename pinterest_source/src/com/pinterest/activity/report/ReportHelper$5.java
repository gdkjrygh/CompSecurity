// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import android.view.View;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.api.model.User;

// Referenced classes of package com.pinterest.activity.report:
//            ReportHelper

final class val.dialog
    implements android.view.tener
{

    final boolean val$blocked;
    final BaseDialog val$dialog;
    final User val$user;

    public final void onClick(View view)
    {
        if (val$blocked)
        {
            ReportHelper.unblockUser(val$user, null);
        } else
        {
            ReportHelper.blockUser(val$user, null);
        }
        val$dialog.dismiss();
    }

    ()
    {
        val$blocked = flag;
        val$user = user1;
        val$dialog = basedialog;
        super();
    }
}
