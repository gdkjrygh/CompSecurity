// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.password;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import com.fitbit.data.bl.ad;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.aw;
import com.fitbit.data.bl.exceptions.IncorrectTimestampException;
import com.fitbit.data.bl.exceptions.SendResetEmailException;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.home.ui.f;
import com.fitbit.home.ui.g;
import com.fitbit.onboarding.OnboardingFragmentActivity;
import com.fitbit.savedstate.d;
import com.fitbit.ui.EditText;
import com.fitbit.util.bq;
import com.fitbit.util.s;

// Referenced classes of package com.fitbit.onboarding.password:
//            PasswordRecoveryActivity_

public class PasswordRecoveryActivity extends OnboardingFragmentActivity
{
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
                    com.fitbit.ui.s.a(m(), exception, 1).i();
                }
                return;
            }
            if (exception instanceof IncorrectTimestampException)
            {
                i().d();
                exception = a.getString(0x7f080286);
                com.fitbit.ui.s.a(m(), exception, 1).i();
                return;
            }
            if ((exception instanceof ServerCommunicationException) && ((ServerCommunicationException)exception).e() == 400)
            {
                i().d();
                exception = a.getString(0x7f080427);
                com.fitbit.ui.s.a(m(), exception, 1).i();
                return;
            } else
            {
                super.a(exception);
                return;
            }
        }

        public a()
        {
            a = PasswordRecoveryActivity.this;
            super(PasswordRecoveryActivity.this, 89);
        }
    }

    private class b extends com.fitbit.home.ui.b
    {

        final PasswordRecoveryActivity a;

        protected String a()
        {
            return com.fitbit.ui.dialogs.a.b(a);
        }

        public b()
        {
            a = PasswordRecoveryActivity.this;
            super(PasswordRecoveryActivity.this, new _cls1(), new _cls2());
        }
    }


    private static final String c = "com.fitbit.onboarding.password.PasswordRecoveryActivity";
    protected EditText a;
    protected TextView b;
    private g d;
    private String e;
    private volatile boolean f;

    public PasswordRecoveryActivity()
    {
        e = null;
        f = false;
    }

    public static void a(Activity activity, String s1)
    {
        Intent intent = PasswordRecoveryActivity_.a(activity).a();
        if (!TextUtils.isEmpty(s1))
        {
            intent.putExtra("com.fitbit.onboarding.password.PasswordRecoveryActivity", s1);
        }
        activity.startActivity(intent);
    }

    static boolean a(PasswordRecoveryActivity passwordrecoveryactivity)
    {
        return passwordrecoveryactivity.f;
    }

    static boolean a(PasswordRecoveryActivity passwordrecoveryactivity, boolean flag)
    {
        passwordrecoveryactivity.f = flag;
        return flag;
    }

    static void b(PasswordRecoveryActivity passwordrecoveryactivity)
    {
        passwordrecoveryactivity.i();
    }

    static void c(PasswordRecoveryActivity passwordrecoveryactivity)
    {
        passwordrecoveryactivity.h();
    }

    private void f()
    {
        d = new a();
        d.a(new b());
    }

    private void g()
    {
        Object obj = an.a().h();
        Intent intent;
        if (obj == null)
        {
            obj = com.fitbit.savedstate.d.h();
        } else
        {
            obj = ((ad) (obj)).a;
        }
        intent = getIntent();
        if (intent != null && intent.hasExtra("com.fitbit.onboarding.password.PasswordRecoveryActivity"))
        {
            a.setText(intent.getStringExtra("com.fitbit.onboarding.password.PasswordRecoveryActivity"));
        } else
        {
            a.setText(((CharSequence) (obj)));
        }
        a.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final PasswordRecoveryActivity a;

            public boolean onEditorAction(TextView textview, int j, KeyEvent keyevent)
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

            
            {
                a = PasswordRecoveryActivity.this;
                super();
            }
        });
    }

    private void h()
    {
        boolean flag = false;
        f = false;
        if (isFinishing() || d.l())
        {
            return;
        }
        String s1 = a.getText().toString();
        if (!s.a(s1))
        {
            a.c(0x7f080185);
            flag = true;
        } else
        {
            a.c(0);
        }
        if (!flag)
        {
            bq.a(this);
            e = s1;
            d.a(aw.a(this, e));
            return;
        } else
        {
            com.fitbit.ui.s.a(this, getString(0x7f080183), 1).i();
            return;
        }
    }

    private void i()
    {
        com.fitbit.ui.s.a(this, 0x7f08043c, 1).a(new android.content.DialogInterface.OnClickListener() {

            final PasswordRecoveryActivity a;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                a.finish();
            }

            
            {
                a = PasswordRecoveryActivity.this;
                super();
            }
        }).i();
    }

    protected void d()
    {
        f();
        g();
    }

    protected void e()
    {
        h();
    }

    public void onPause()
    {
        super.onPause();
        a.setError(null);
    }

    public void onResume()
    {
        super.onResume();
        a.i();
    }

    // Unreferenced inner class com/fitbit/onboarding/password/PasswordRecoveryActivity$b$1

/* anonymous class */
    class b._cls1
        implements com.fitbit.home.ui.b.a
    {

        final PasswordRecoveryActivity a;

        public void a(com.fitbit.home.ui.b b1)
        {
            PasswordRecoveryActivity.c(a);
        }

            
            {
                a = PasswordRecoveryActivity.this;
                super();
            }
    }


    // Unreferenced inner class com/fitbit/onboarding/password/PasswordRecoveryActivity$b$2

/* anonymous class */
    class b._cls2
        implements android.content.DialogInterface.OnCancelListener
    {

        final PasswordRecoveryActivity a;

        public void onCancel(DialogInterface dialoginterface)
        {
            PasswordRecoveryActivity.a(a, true);
            a.finish();
        }

            
            {
                a = PasswordRecoveryActivity.this;
                super();
            }
    }

}
