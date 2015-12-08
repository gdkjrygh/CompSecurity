// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.view.KeyEvent;
import android.widget.TextView;
import com.pandora.android.view.ValidatingEditText;

// Referenced classes of package com.pandora.android.activity:
//            ForgotPasswordActivity

class a
    implements android.widget.stener
{

    final ForgotPasswordActivity a;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6)
        {
            if (ForgotPasswordActivity.a(a).b())
            {
                a.m();
            } else
            {
                ForgotPasswordActivity.a(a).d();
            }
            return true;
        } else
        {
            return false;
        }
    }

    (ForgotPasswordActivity forgotpasswordactivity)
    {
        a = forgotpasswordactivity;
        super();
    }
}
