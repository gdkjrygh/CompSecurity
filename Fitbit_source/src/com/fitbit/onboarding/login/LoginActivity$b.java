// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.login;

import com.fitbit.home.ui.b;
import com.fitbit.ui.dialogs.a;
import com.fitbit.util.SimpleConfirmDialogFragment;

// Referenced classes of package com.fitbit.onboarding.login:
//            LoginActivity

private class _cls2 extends b
{

    final LoginActivity a;

    protected String a()
    {
        return com.fitbit.ui.dialogs.a.b(a);
    }

    public void a(Exception exception)
    {
        com.fitbit.onboarding.login.LoginActivity.a(a, true);
        super.a(exception);
    }

    public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
        com.fitbit.onboarding.login.LoginActivity.a(a, false);
        super.b(simpleconfirmdialogfragment);
    }

    public ener(LoginActivity loginactivity)
    {
        a = loginactivity;
    /* block-local class not found */
    class _cls1 {}

    /* block-local class not found */
    class _cls2 {}

        super(loginactivity, new _cls1(loginactivity), new _cls2(loginactivity));
    }
}
