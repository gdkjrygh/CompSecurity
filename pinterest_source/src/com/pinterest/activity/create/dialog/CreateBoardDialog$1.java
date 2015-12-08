// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.dialog;

import android.view.KeyEvent;
import android.widget.TextView;
import com.pinterest.ui.text.PEditText;

// Referenced classes of package com.pinterest.activity.create.dialog:
//            CreateBoardDialog

class this._cls0
    implements android.widget.ionListener
{

    final CreateBoardDialog this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6)
        {
            CreateBoardDialog.access$000(CreateBoardDialog.this);
        } else
        if (i == 5)
        {
            if (_boardDescriptionEt != null)
            {
                _boardDescriptionEt.requestFocus();
                return true;
            }
        } else
        {
            return false;
        }
        return true;
    }

    ()
    {
        this$0 = CreateBoardDialog.this;
        super();
    }
}
