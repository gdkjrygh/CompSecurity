// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import com.pinterest.ui.ViewHelper;

// Referenced classes of package com.pinterest.activity.sendapin.ui:
//            AddMessageDialog

class this._cls0
    implements android.widget.tionListener
{

    final AddMessageDialog this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (ViewHelper.isKeyboardAction(6, i, keyevent))
        {
            AddMessageDialog.access$000(AddMessageDialog.this, _messageEt);
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = AddMessageDialog.this;
        super();
    }
}
