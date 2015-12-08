// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.dialog;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.pinterest.ui.ViewHelper;

// Referenced classes of package com.pinterest.activity.task.dialog:
//            EditFieldDialog

class this._cls0
    implements android.widget.ctionListener
{

    final EditFieldDialog this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        boolean flag = false;
        if (ViewHelper.isKeyboardAction(2, i, keyevent))
        {
            if (EditFieldDialog.access$000(EditFieldDialog.this) != null)
            {
                textview = _editText.getText().toString();
                keyevent = EditFieldDialog.access$000(EditFieldDialog.this);
                if (!TextUtils.equals(textview, _prefilledText))
                {
                    flag = true;
                }
                keyevent.onPositiveClicked(textview, flag);
            }
            return true;
        } else
        {
            return false;
        }
    }

    ClickListener()
    {
        this$0 = EditFieldDialog.this;
        super();
    }
}
