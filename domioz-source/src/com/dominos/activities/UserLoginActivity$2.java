// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.dominos.activities:
//            UserLoginActivity

class this._cls0
    implements android.widget.ionListener
{

    final UserLoginActivity this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6)
        {
            UserLoginActivity.access$000(UserLoginActivity.this);
            return true;
        } else
        {
            return false;
        }
    }

    ner()
    {
        this$0 = UserLoginActivity.this;
        super();
    }
}
