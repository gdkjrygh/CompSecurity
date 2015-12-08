// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.dialog;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.pinterest.activity.task.dialog:
//            EditFieldDialog

class this._cls0
    implements android.view.er
{

    final EditFieldDialog this$0;

    public void onClick(View view)
    {
        if (EditFieldDialog.access$000(EditFieldDialog.this) != null)
        {
            view = _editText.getText().toString();
            ClickListener clicklistener = EditFieldDialog.access$000(EditFieldDialog.this);
            boolean flag;
            if (!TextUtils.equals(view, _prefilledText))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            clicklistener.onPositiveClicked(view, flag);
        }
    }

    ClickListener()
    {
        this$0 = EditFieldDialog.this;
        super();
    }
}
