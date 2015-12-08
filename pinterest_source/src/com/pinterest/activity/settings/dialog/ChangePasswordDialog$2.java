// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import android.view.KeyEvent;
import android.widget.TextView;
import com.pinterest.ui.ViewHelper;

// Referenced classes of package com.pinterest.activity.settings.dialog:
//            ChangePasswordDialog

class this._cls0
    implements android.widget.Listener
{

    final ChangePasswordDialog this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (ViewHelper.isKeyboardAction(2, i, keyevent))
        {
            ChangePasswordDialog.access$000(ChangePasswordDialog.this);
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = ChangePasswordDialog.this;
        super();
    }
}
