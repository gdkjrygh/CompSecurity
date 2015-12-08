// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.login;

import com.fitbit.data.bl.exceptions.AuthenticationException;
import com.fitbit.data.bl.exceptions.IncorrectTimestampException;
import com.fitbit.home.ui.f;
import com.fitbit.home.ui.g;
import com.fitbit.ui.s;

// Referenced classes of package com.fitbit.onboarding.login:
//            LoginActivity

private class a extends g
{

    final LoginActivity a;

    public void a()
    {
        LoginActivity.a(a, false);
        super.a();
        LoginActivity.d(a);
    }

    public void a(Exception exception)
    {
label0:
        {
            if (LoginActivity.e(a))
            {
                LoginActivity.a(a, false);
                if (!exception.getClass().isAssignableFrom(com/fitbit/data/bl/exceptions/AuthenticationException))
                {
                    break label0;
                }
                i().d();
                exception = a.getString(0x7f08005f);
                s.a(m(), exception, 1).i();
            }
            return;
        }
        if (exception instanceof IncorrectTimestampException)
        {
            i().d();
            exception = a.getString(0x7f080286);
            s.a(m(), exception, 1).i();
            return;
        } else
        {
            super.a(exception);
            return;
        }
    }

    public tampException(LoginActivity loginactivity)
    {
        a = loginactivity;
        super(loginactivity, 80);
    }
}
