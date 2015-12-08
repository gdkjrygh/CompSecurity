// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.dialog;

import android.app.Activity;

// Referenced classes of package com.pinterest.activity.task.dialog:
//            BaseDialog

public class ShakeMenuDialog extends BaseDialog
{

    public ShakeMenuDialog()
    {
    }

    public ShakeMenuDialog(Activity activity)
    {
        setContent(new ShakeMenuView(activity));
    }

    private class ShakeMenuView extends LinearLayout
        implements android.view.View.OnClickListener
    {

        final ShakeMenuDialog this$0;

        private void init()
        {
            LayoutInflater.from(getContext()).inflate(0x7f03008b, this);
            findViewById(0x7f0f0199).setOnClickListener(this);
            findViewById(0x7f0f019a).setOnClickListener(this);
            View view = findViewById(0x7f0f019b);
            ViewHelper.setVisibility(view, ApplicationInfo.isOta());
            ViewHelper.setVisibility(findViewById(0x7f0f0068), ApplicationInfo.isOta());
            view.setOnClickListener(this);
        }

        public void onClick(View view)
        {
            dismiss();
            switch (view.getId())
            {
            default:
                return;

            case 2131689881: 
                DeveloperHelper.a(getActivity());
                return;

            case 2131689882: 
                (new ReportBugDialog(getActivity())).show(getFragmentManager(), "reportBug");
                return;

            case 2131689883: 
                AutoUpdateManager.a().startUpdate(null);
                break;
            }
        }

        public ShakeMenuView(Context context)
        {
            this$0 = ShakeMenuDialog.this;
            super(context);
            init();
        }

        public ShakeMenuView(Context context, AttributeSet attributeset)
        {
            this$0 = ShakeMenuDialog.this;
            super(context, attributeset);
            init();
        }
    }

}
