// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.login;

import android.widget.CheckBox;
import com.fitbit.data.bl.exceptions.AccountValidationException;
import com.fitbit.data.bl.exceptions.IncorrectTimestampException;
import com.fitbit.home.ui.f;
import com.fitbit.home.ui.g;
import com.fitbit.onboarding.profile.AboutYouActivity;
import com.fitbit.serverinteraction.q;
import com.fitbit.ui.s;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.onboarding.login:
//            LoginActivity

private class a extends g
{

    final LoginActivity a;

    public void a()
    {
        super.a();
        if (com.fitbit.onboarding.login.LoginActivity.g(a))
        {
            a.setResult(0);
            a.finish();
            return;
        } else
        {
            android.content.Intent intent = AboutYouActivity.a(m(), LoginActivity.h(a), LoginActivity.i(a), a.e.isChecked());
            a.startActivityForResult(intent, 4907);
            return;
        }
    }

    public void a(Exception exception)
    {
label0:
        {
            if (!com.fitbit.onboarding.login.LoginActivity.g(a))
            {
                if (!(exception instanceof AccountValidationException))
                {
                    break label0;
                }
                i().d();
                AccountValidationException accountvalidationexception = (AccountValidationException)exception;
                exception = "";
                for (Iterator iterator = accountvalidationexception.a().iterator(); iterator.hasNext();)
                {
                    q q1 = (q)iterator.next();
                    Object obj = exception;
                    if (!exception.equals(""))
                    {
                        obj = (new StringBuilder()).append(exception).append("\n").toString();
                    }
                    if ("email".equals(q1.a()))
                    {
                        exception = (new StringBuilder()).append(((String) (obj))).append(a.getString(0x7f080187)).toString();
                    } else
                    {
                        exception = (new StringBuilder()).append(((String) (obj))).append(q1.b().replace("<em>", "").replace("</em>", "")).toString();
                    }
                }

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
        super(loginactivity, 89);
    }
}
