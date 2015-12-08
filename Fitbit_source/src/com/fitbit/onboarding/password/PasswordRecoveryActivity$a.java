// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.password;

import com.fitbit.data.bl.exceptions.IncorrectTimestampException;
import com.fitbit.data.bl.exceptions.SendResetEmailException;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.home.ui.f;
import com.fitbit.home.ui.g;
import com.fitbit.ui.s;

// Referenced classes of package com.fitbit.onboarding.password:
//            PasswordRecoveryActivity

private class a extends g
{

    final PasswordRecoveryActivity a;

    public void a()
    {
        super.a();
        if (PasswordRecoveryActivity.a(a))
        {
            a.finish();
            return;
        } else
        {
            PasswordRecoveryActivity.b(a);
            return;
        }
    }

    public void a(Exception exception)
    {
label0:
        {
            if (!PasswordRecoveryActivity.a(a))
            {
                if (!(exception instanceof SendResetEmailException))
                {
                    break label0;
                }
                i().d();
                exception = a.getString(0x7f0804dc);
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
        }
        if ((exception instanceof ServerCommunicationException) && ((ServerCommunicationException)exception).e() == 400)
        {
            i().d();
            exception = a.getString(0x7f080427);
            s.a(m(), exception, 1).i();
            return;
        } else
        {
            super.a(exception);
            return;
        }
    }

    public (PasswordRecoveryActivity passwordrecoveryactivity)
    {
        a = passwordrecoveryactivity;
        super(passwordrecoveryactivity, 89);
    }
}
