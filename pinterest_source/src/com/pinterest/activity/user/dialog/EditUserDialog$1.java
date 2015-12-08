// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.dialog;

import android.view.KeyEvent;
import android.widget.TextView;
import com.pinterest.ui.ViewHelper;

// Referenced classes of package com.pinterest.activity.user.dialog:
//            EditUserDialog

class this._cls0
    implements android.widget.ActionListener
{

    final EditUserDialog this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (ViewHelper.isKeyboardAction(2, i, keyevent))
        {
            EditUserDialog.access$000(EditUserDialog.this);
            return true;
        } else
        {
            return false;
        }
    }

    _cls9()
    {
        this$0 = EditUserDialog.this;
        super();
    }
}
