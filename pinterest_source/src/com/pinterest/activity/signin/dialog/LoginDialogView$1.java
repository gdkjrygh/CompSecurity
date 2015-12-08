// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.view.KeyEvent;
import android.view.View;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            LoginDialogView

class this._cls0
    implements android.view.
{

    final LoginDialogView this$0;

    public boolean onKey(View view, int i, KeyEvent keyevent)
    {
        if (keyevent.getAction() == 0 && i == 66)
        {
            LoginDialogView.access$100(LoginDialogView.this).performClick();
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = LoginDialogView.this;
        super();
    }
}
