// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.password;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.fitbit.onboarding.password:
//            PasswordRecoveryActivity

class a
    implements android.widget.ener
{

    final PasswordRecoveryActivity a;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (keyevent != null && keyevent.getAction() != 0)
        {
            return false;
        } else
        {
            a.e();
            return true;
        }
    }

    (PasswordRecoveryActivity passwordrecoveryactivity)
    {
        a = passwordrecoveryactivity;
        super();
    }
}
