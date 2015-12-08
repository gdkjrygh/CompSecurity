// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import android.view.KeyEvent;
import android.widget.TextView;
import com.pinterest.ui.ViewHelper;

// Referenced classes of package com.pinterest.activity.settings.dialog:
//            UsernameSettingDialog

class val.name
    implements android.widget.istener
{

    final UsernameSettingDialog this$0;
    final String val$name;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (ViewHelper.isKeyboardAction(2, i, keyevent))
        {
            UsernameSettingDialog.access$000(UsernameSettingDialog.this, val$name);
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = final_usernamesettingdialog;
        val$name = String.this;
        super();
    }
}
