// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.password;

import android.content.DialogInterface;

// Referenced classes of package com.fitbit.onboarding.password:
//            PasswordRecoveryActivity

class a
    implements android.content.ner
{

    final PasswordRecoveryActivity a;

    public void onCancel(DialogInterface dialoginterface)
    {
        PasswordRecoveryActivity.a(a, true);
        a.finish();
    }

    A(PasswordRecoveryActivity passwordrecoveryactivity)
    {
        a = passwordrecoveryactivity;
        super();
    }
}
