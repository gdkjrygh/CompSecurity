// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import com.pinterest.activity.task.dialog.EditFieldDialog;

// Referenced classes of package com.pinterest.activity.report:
//            ReportUserDialog

class g.OnClickListener extends com.pinterest.activity.task.dialog.lickListener
{

    final ReportUserDialog this$0;
    final EditFieldDialog val$dialog;

    public void onNegativeClicked()
    {
        val$dialog.dismiss();
    }

    public void onPositiveClicked(String s, boolean flag)
    {
        if (flag)
        {
            s = s.trim();
            if (s.length() == 0)
            {
                val$dialog.setText("");
                return;
            }
            ReportUserDialog.access$200(ReportUserDialog.this, s);
        }
        val$dialog.dismiss();
    }

    g()
    {
        this$0 = final_reportuserdialog;
        val$dialog = EditFieldDialog.this;
        super();
    }
}
