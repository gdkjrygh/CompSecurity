// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            RecoverActivity

class val.recoverBtn
    implements android.widget.ctionListener
{

    final RecoverActivity this$0;
    final Button val$recoverBtn;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6 || keyevent != null && keyevent.getKeyCode() == 66 && keyevent.getAction() == 0)
        {
            return val$recoverBtn.performClick();
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = final_recoveractivity;
        val$recoverBtn = Button.this;
        super();
    }
}
