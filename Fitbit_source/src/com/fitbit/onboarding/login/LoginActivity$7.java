// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.login;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.fitbit.onboarding.login:
//            LoginActivity

class a
    implements android.widget.rActionListener
{

    final LoginActivity a;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (keyevent != null && keyevent.getAction() != 0)
        {
            return false;
        } else
        {
            LoginActivity.b(a);
            return true;
        }
    }

    er(LoginActivity loginactivity)
    {
        a = loginactivity;
        super();
    }
}
