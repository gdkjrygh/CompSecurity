// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.dialog;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.CheckBox;
import com.pinterest.activity.task.dialog.view.ReportBugView;
import com.pinterest.api.remote.AnalyticsApi;

// Referenced classes of package com.pinterest.activity.task.dialog:
//            ReportBugDialog

class val.logsCheckbox
    implements android.view.er
{

    final ReportBugDialog this$0;
    final CheckBox val$logsCheckbox;
    final ReportBugView val$reportForm;
    final Bitmap val$ss;

    public void onClick(View view)
    {
        view = ReportBugDialog.access$000(ReportBugDialog.this);
        class _cls1 extends BaseApiResponseHandler
        {

            final ReportBugDialog._cls1 this$1;

            public void onFailure(Throwable throwable, ApiResponse apiresponse)
            {
                Application.showToast("Report failed, try again.");
                super.onFailure(throwable, apiresponse);
            }

            public void onFinish()
            {
                ss.recycle();
            }

            public void onStart()
            {
                Application.showToast("Sending report...");
                super.onStart();
            }

            public void onSuccess(ApiResponse apiresponse)
            {
                Application.showToast("Report sent!");
                super.onSuccess(apiresponse);
            }

            _cls1()
            {
                this$1 = ReportBugDialog._cls1.this;
                super();
            }
        }

        AnalyticsApi.a(val$reportForm.getTitleText(), (new StringBuilder()).append(val$reportForm.getMessageText()).append("\n\n---\n\n").append(view).toString(), val$ss, val$logsCheckbox.isChecked(), new _cls1());
        dismiss();
    }

    ()
    {
        this$0 = final_reportbugdialog;
        val$reportForm = reportbugview;
        val$ss = bitmap;
        val$logsCheckbox = CheckBox.this;
        super();
    }
}
