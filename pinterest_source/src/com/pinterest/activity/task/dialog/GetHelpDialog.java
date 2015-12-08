// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.dialog;

import android.app.Activity;

// Referenced classes of package com.pinterest.activity.task.dialog:
//            BaseDialog

public class GetHelpDialog extends BaseDialog
{

    public GetHelpDialog()
    {
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        setContent(new GetHelpView(activity), 0);
    }

    private class GetHelpView extends LinearLayout
        implements android.view.View.OnClickListener
    {

        final GetHelpDialog this$0;

        private void init()
        {
            setOrientation(1);
            inflate(getContext(), 0x7f030075, this);
            findViewById(0x7f0f016f).setOnClickListener(this);
            findViewById(0x7f0f0170).setOnClickListener(this);
        }

        public void onClick(View view)
        {
            switch (view.getId())
            {
            default:
                return;

            case 2131689839: 
                Pinalytics.a(ElementType.SUPPORT_BUTTON, ComponentType.NAVIGATION);
                ActivityHelper.goIntentView(getContext(), Resources.string(0x7f07074e));
                dismiss();
                return;

            case 2131689840: 
                ActivityHelper.goIntentView(getContext(), Resources.string(0x7f07073f));
                break;
            }
            dismiss();
        }

        public GetHelpView(Context context)
        {
            this(context, null);
        }

        public GetHelpView(Context context, AttributeSet attributeset)
        {
            this$0 = GetHelpDialog.this;
            super(context, attributeset);
            init();
        }
    }

}
