// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings;

import android.widget.CheckedTextView;
import com.pinterest.activity.task.dialog.BaseDialog;

// Referenced classes of package com.pinterest.activity.settings:
//            UpdatedAccountSettingsFragment

class val.socialCb
    implements com.pinterest.activity.task.dialog..socialCb
{

    final UpdatedAccountSettingsFragment this$0;
    final CheckedTextView val$socialCb;

    public void onDismiss(BaseDialog basedialog)
    {
        val$socialCb.setChecked(true);
    }

    ()
    {
        this$0 = final_updatedaccountsettingsfragment;
        val$socialCb = CheckedTextView.this;
        super();
    }
}
