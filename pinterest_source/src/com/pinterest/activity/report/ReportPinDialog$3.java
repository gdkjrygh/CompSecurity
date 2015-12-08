// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import com.pinterest.activity.task.dialog.EditFieldDialog;

// Referenced classes of package com.pinterest.activity.report:
//            ReportPinDialog

class  extends com.pinterest.activity.task.dialog.ClickListener
{

    final ReportPinDialog this$0;
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
            ReportPinDialog.access$200(ReportPinDialog.this, s);
        }
        val$dialog.dismiss();
    }

    og()
    {
        this$0 = final_reportpindialog;
        val$dialog = EditFieldDialog.this;
        super();
    }
}
