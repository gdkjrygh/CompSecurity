// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings;

import android.view.View;
import android.widget.CheckedTextView;
import com.pinterest.activity.task.dialog.SimpleTextDialog;
import com.pinterest.reporting.CrashReporting;
import java.lang.reflect.Method;

// Referenced classes of package com.pinterest.activity.settings:
//            UpdatedAccountSettingsFragment

class val.dialog
    implements android.view.SettingsFragment._cls6
{

    final UpdatedAccountSettingsFragment this$0;
    final SimpleTextDialog val$dialog;
    final String val$methodName;
    final CheckedTextView val$socialCb;

    public void onClick(View view)
    {
        try
        {
            val$socialCb.setChecked(false);
            com/pinterest/activity/settings/UpdatedAccountSettingsFragment.getDeclaredMethod(val$methodName, null).invoke(UpdatedAccountSettingsFragment.this, null);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            CrashReporting.a(view);
        }
        val$dialog.dismiss();
    }

    ()
    {
        this$0 = final_updatedaccountsettingsfragment;
        val$socialCb = checkedtextview;
        val$methodName = s;
        val$dialog = SimpleTextDialog.this;
        super();
    }
}
