// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import android.view.KeyEvent;
import android.widget.TextView;
import com.pinterest.ui.ViewHelper;

// Referenced classes of package com.pinterest.activity.settings.dialog:
//            EmailSettingDialog

class this._cls0
    implements android.widget.onListener
{

    final EmailSettingDialog this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (ViewHelper.isKeyboardAction(2, i, keyevent))
        {
            EmailSettingDialog.access$100(EmailSettingDialog.this, EmailSettingDialog.access$000(EmailSettingDialog.this));
            return true;
        } else
        {
            return false;
        }
    }

    A()
    {
        this$0 = EmailSettingDialog.this;
        super();
    }
}
