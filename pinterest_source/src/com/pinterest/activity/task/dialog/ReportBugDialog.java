// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.dialog;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import android.widget.CheckBox;
import com.pinterest.activity.task.dialog.view.ReportBugView;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.base.ApplicationInfo;
import com.pinterest.base.Device;
import com.pinterest.kit.utils.ImageUtils;
import com.pinterest.kit.utils.NetworkUtils;

// Referenced classes of package com.pinterest.activity.task.dialog:
//            BaseDialog

public class ReportBugDialog extends BaseDialog
{

    public ReportBugDialog()
    {
    }

    public ReportBugDialog(final Activity reportForm)
    {
        final Bitmap ss = ImageUtils.bitmapFromView(reportForm.getWindow().getDecorView());
        reportForm = new ReportBugView(reportForm);
        reportForm.setScreenShot(ss);
        setTitle(0x7f0704a2);
        setContent(reportForm);
        setPositiveButton(0x7f070508, new _cls1());
        setNegativeButton(0x7f0700af, null);
    }

    private String getDeviceInfo()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Object obj = MyUser.get();
        if (obj != null)
        {
            stringbuilder.append("Full name: ").append(((User) (obj)).getFullName()).append("\n");
            stringbuilder.append("User: ").append(((User) (obj)).getUsername()).append("\n");
        }
        StringBuilder stringbuilder1 = stringbuilder.append("Form factor: ");
        if (Device.isTablet())
        {
            obj = "Tablet";
        } else
        {
            obj = "Phone";
        }
        stringbuilder1.append(((String) (obj))).append("\n");
        stringbuilder.append("Version: ").append(ApplicationInfo.getVersionName()).append("\n");
        stringbuilder.append("Carrier: ").append(NetworkUtils.getInstance().getCarrierName()).append("\n");
        stringbuilder.append("Device: ").append(Build.DEVICE).append(";").append(android.os.Build.VERSION.RELEASE).append("\n");
        return stringbuilder.toString();
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final ReportBugDialog this$0;
        final CheckBox val$logsCheckbox;
        final ReportBugView val$reportForm;
        final Bitmap val$ss;

        public void onClick(View view)
        {
            view = getDeviceInfo();
            class _cls1 extends BaseApiResponseHandler
            {

                final _cls1 this$1;

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
                    this$1 = _cls1.this;
                    super();
                }
            }

            AnalyticsApi.a(reportForm.getTitleText(), (new StringBuilder()).append(reportForm.getMessageText()).append("\n\n---\n\n").append(view).toString(), ss, logsCheckbox.isChecked(), new _cls1());
            dismiss();
        }

        _cls1()
        {
            this$0 = ReportBugDialog.this;
            reportForm = reportbugview;
            ss = bitmap;
            logsCheckbox = checkbox;
            super();
        }
    }

}
