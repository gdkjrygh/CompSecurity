// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings;

import android.view.View;
import android.widget.CheckedTextView;
import com.pinterest.activity.task.dialog.SimpleTextDialog;

// Referenced classes of package com.pinterest.activity.settings:
//            UpdatedAccountSettingsFragment

class val.dialog
    implements android.view.SettingsFragment._cls7
{

    final UpdatedAccountSettingsFragment this$0;
    final SimpleTextDialog val$dialog;
    final CheckedTextView val$socialCb;

    public void onClick(View view)
    {
        val$socialCb.setChecked(true);
        val$dialog.dismiss();
    }

    ()
    {
        this$0 = final_updatedaccountsettingsfragment;
        val$socialCb = checkedtextview;
        val$dialog = SimpleTextDialog.this;
        super();
    }
}
