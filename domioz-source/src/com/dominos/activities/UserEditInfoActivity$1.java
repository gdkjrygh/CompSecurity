// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.dominos.activities:
//            UserEditInfoActivity

class this._cls0
    implements android.widget.Listener
{

    final UserEditInfoActivity this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6 || i == 5)
        {
            saveAccount();
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = UserEditInfoActivity.this;
        super();
    }
}
