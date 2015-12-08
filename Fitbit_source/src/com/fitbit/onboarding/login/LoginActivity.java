// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.login;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fitbit.data.bl.ac;
import com.fitbit.data.bl.ad;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.dg;
import com.fitbit.data.bl.exceptions.AccountValidationException;
import com.fitbit.data.bl.exceptions.AuthenticationException;
import com.fitbit.data.bl.exceptions.IncorrectTimestampException;
import com.fitbit.data.bl.j;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.e.a;
import com.fitbit.home.ui.g;
import com.fitbit.mixpanel.f;
import com.fitbit.onboarding.OnboardingFragmentActivity;
import com.fitbit.onboarding.password.PasswordRecoveryActivity;
import com.fitbit.onboarding.profile.AboutYouActivity;
import com.fitbit.runtrack.data.b;
import com.fitbit.savedstate.ServerSavedState;
import com.fitbit.savedstate.UISavedState;
import com.fitbit.savedstate.d;
import com.fitbit.serverinteraction.q;
import com.fitbit.ui.EditText;
import com.fitbit.ui.WebViewActivity;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.bh;
import com.fitbit.util.bq;
import com.fitbit.util.s;
import java.util.Iterator;
import java.util.List;

public class LoginActivity extends OnboardingFragmentActivity
{
    private class a extends g
    {

        final LoginActivity a;

        public void a()
        {
            com.fitbit.onboarding.login.LoginActivity.a(a, false);
            super.a();
            com.fitbit.onboarding.login.LoginActivity.d(a);
        }

        public void a(Exception exception)
        {
label0:
            {
                if (LoginActivity.e(a))
                {
                    com.fitbit.onboarding.login.LoginActivity.a(a, false);
                    if (!exception.getClass().isAssignableFrom(com/fitbit/data/bl/exceptions/AuthenticationException))
                    {
                        break label0;
                    }
                    i().d();
                    exception = a.getString(0x7f08005f);
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
            } else
            {
                super.a(exception);
                return;
            }
        }

        public a()
        {
            a = LoginActivity.this;
            super(LoginActivity.this, 80);
        }
    }

    private class b extends com.fitbit.home.ui.b
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

        public b()
        {
            a = LoginActivity.this;
        /* block-local class not found */
        class _cls1 {}

        /* block-local class not found */
        class _cls2 {}

            super(LoginActivity.this, new _cls1(LoginActivity.this), new _cls2(LoginActivity.this));
        }
    }

    private class c extends g
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
                Intent intent = AboutYouActivity.a(m(), LoginActivity.h(a), LoginActivity.i(a), a.e.isChecked());
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
            } else
            {
                super.a(exception);
                return;
            }
        }

        public c()
        {
            a = LoginActivity.this;
            super(LoginActivity.this, 89);
        }
    }

    private class d extends com.fitbit.home.ui.b
    {

        final LoginActivity a;

        protected String a()
        {
            return com.fitbit.ui.dialogs.a.b(a);
        }

        public d()
        {
            a = LoginActivity.this;
        /* block-local class not found */
        class _cls1 {}

        /* block-local class not found */
        class _cls2 {}

            super(LoginActivity.this, new _cls1(LoginActivity.this), new _cls2(LoginActivity.this));
        }
    }


    private static final String h = "LoginActivity";
    private static final String i = "com.fitbit.onboarding.login.LoginActivity.ACTION_AUTO_LOG_IN";
    private static final String j = "com.fitbit.onboarding.login.LoginActivity.ACTION_LOG_IN";
    private static final String k = "com.fitbit.onboarding.login.LoginActivity.ACTION_SIGN_UP";
    private static final int l = 4907;
    protected EditText a;
    protected EditText b;
    protected TextView c;
    protected TextView d;
    protected CheckBox e;
    protected CheckBox f;
    protected TextView g;
    private g m;
    private com.fitbit.home.ui.b n;
    private volatile boolean o;
    private volatile boolean p;
    private String q;
    private String r;
    private volatile boolean s;
    private boolean t;

    public LoginActivity()
    {
        o = false;
        p = false;
        q = null;
        r = null;
        s = false;
        t = false;
    }

    private Bundle a(String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("Entered Login", s1);
        return bundle;
    }

    public static void a(Activity activity)
    {
        Intent intent = new Intent(activity, com/fitbit/onboarding/login/LoginActivity);
        intent.setAction("com.fitbit.onboarding.login.LoginActivity.ACTION_AUTO_LOG_IN");
        activity.startActivity(intent);
    }

    public static void a(Activity activity, int i1)
    {
        Intent intent = new Intent(activity, com/fitbit/onboarding/login/LoginActivity);
        intent.setAction("com.fitbit.onboarding.login.LoginActivity.ACTION_SIGN_UP");
        activity.startActivityForResult(intent, i1);
    }

    static void a(LoginActivity loginactivity)
    {
        loginactivity.m();
    }

    static boolean a(LoginActivity loginactivity, boolean flag)
    {
        loginactivity.p = flag;
        return flag;
    }

    private boolean a(String s1, String s2)
    {
        int i1;
        if (!com.fitbit.util.s.a(s1))
        {
            a.c(0x7f080185);
            i1 = 1;
        } else
        {
            a.c(0);
            i1 = 0;
        }
        if (s2 == null || s2.length() == 0)
        {
            i1++;
            b.c(0x7f080186);
        } else
        {
            b.c(0);
        }
        return i1 == 0;
    }

    public static void b(Activity activity)
    {
        Intent intent = new Intent(activity, com/fitbit/onboarding/login/LoginActivity);
        intent.setAction("com.fitbit.onboarding.login.LoginActivity.ACTION_LOG_IN");
        activity.startActivity(intent);
    }

    public static void b(Activity activity, int i1)
    {
        Intent intent = new Intent(activity, com/fitbit/onboarding/login/LoginActivity);
        intent.setAction("com.fitbit.onboarding.login.LoginActivity.ACTION_LOG_IN");
        activity.startActivityForResult(intent, i1);
    }

    static void b(LoginActivity loginactivity)
    {
        loginactivity.j();
    }

    static boolean b(LoginActivity loginactivity, boolean flag)
    {
        loginactivity.s = flag;
        return flag;
    }

    public static void c(Activity activity)
    {
        Intent intent = new Intent(activity, com/fitbit/onboarding/login/LoginActivity);
        intent.setAction("com.fitbit.onboarding.login.LoginActivity.ACTION_SIGN_UP");
        activity.startActivity(intent);
    }

    static void c(LoginActivity loginactivity)
    {
        loginactivity.o();
    }

    static void d(LoginActivity loginactivity)
    {
        loginactivity.n();
    }

    static boolean e(LoginActivity loginactivity)
    {
        return loginactivity.p;
    }

    private void f()
    {
        if ("com.fitbit.onboarding.login.LoginActivity.ACTION_SIGN_UP".equals(getIntent().getAction()))
        {
            n = new d();
            m = new c();
            m.a(n);
            return;
        } else
        {
            n = new b();
            m = new a();
            m.a(n);
            return;
        }
    }

    static void f(LoginActivity loginactivity)
    {
        loginactivity.k();
    }

    private void g()
    {
        Object obj1 = an.a().h();
        Object obj;
        if (obj1 == null)
        {
            obj = com.fitbit.savedstate.d.h();
        } else
        {
            obj = ((ad) (obj1)).a;
        }
        if (obj != null && !"com.fitbit.onboarding.login.LoginActivity.ACTION_SIGN_UP".equals(getIntent().getAction()))
        {
            if (UISavedState.v())
            {
                a.setText(((CharSequence) (obj)));
            }
            if (obj1 != null && ((ad) (obj1)).b != null)
            {
                b.setText(((ad) (obj1)).b);
            }
        }
        h();
        if ("com.fitbit.onboarding.login.LoginActivity.ACTION_SIGN_UP".equals(getIntent().getAction()))
        {
            obj = getString(0x7f0803aa);
            obj1 = getString(0x7f0803a2);
            Object obj2 = bh.a(getBaseContext(), 0x7f0803a7, new String[] {
                obj, obj1
            });
            int i1 = ((String) (obj2)).indexOf(((String) (obj)));
            int j1 = ((String) (obj)).length() + i1;
            int k1 = ((String) (obj2)).indexOf(((String) (obj1)));
            int l1 = ((String) (obj1)).length() + k1;
            obj = new SpannableString(((CharSequence) (obj2)));
            obj1 = new ClickableSpan() {

                final LoginActivity a;

                public void onClick(View view)
                {
                    view = String.format("file:///android_asset/%s", new Object[] {
                        a.getString(0x7f08005e)
                    });
                    WebViewActivity.a(a, null, view, true);
                }

            
            {
                a = LoginActivity.this;
                super();
            }
            };
            obj2 = new ClickableSpan() {

                final LoginActivity a;

                public void onClick(View view)
                {
                    view = String.format("file:///android_asset/%s", new Object[] {
                        a.getString(0x7f08005d)
                    });
                    WebViewActivity.a(a, null, view, true);
                }

            
            {
                a = LoginActivity.this;
                super();
            }
            };
            ((SpannableString) (obj)).setSpan(obj1, i1, j1, 33);
            ((SpannableString) (obj)).setSpan(new ForegroundColorSpan(getResources().getColor(0x7f0f0172)), i1, j1, 33);
            ((SpannableString) (obj)).setSpan(obj2, k1, l1, 33);
            ((SpannableString) (obj)).setSpan(new ForegroundColorSpan(getResources().getColor(0x7f0f0172)), k1, l1, 33);
            obj1 = getString(0x7f0803a4);
            obj2 = new SpannableString(((CharSequence) (obj1)));
            ((SpannableString) (obj2)).setSpan(new ForegroundColorSpan(getResources().getColor(0x7f0f0174)), 0, ((String) (obj1)).length(), 33);
            g.setText(((CharSequence) (obj)));
            g.setMovementMethod(LinkMovementMethod.getInstance());
            e.setText(((CharSequence) (obj2)));
            d.setText(0x7f0803a3);
        } else
        {
            String s1 = getString(0x7f0803a5);
            SpannableString spannablestring = new SpannableString(s1);
            spannablestring.setSpan(new ForegroundColorSpan(getResources().getColor(0x7f0f0174)), 0, s1.length(), 33);
            c.setText(spannablestring);
            d.setText(0x7f080398);
        }
        b.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final LoginActivity a;

            public boolean onEditorAction(TextView textview, int i2, KeyEvent keyevent)
            {
                if (keyevent != null && keyevent.getAction() != 0)
                {
                    return false;
                } else
                {
                    com.fitbit.onboarding.login.LoginActivity.b(a);
                    return true;
                }
            }

            
            {
                a = LoginActivity.this;
                super();
            }
        });
    }

    static boolean g(LoginActivity loginactivity)
    {
        return loginactivity.s;
    }

    static String h(LoginActivity loginactivity)
    {
        return loginactivity.q;
    }

    private void h()
    {
        if ("com.fitbit.onboarding.login.LoginActivity.ACTION_SIGN_UP".equals(getIntent().getAction()))
        {
            c.setEnabled(false);
            c.setVisibility(4);
            c.setHeight(0);
            return;
        } else
        {
            LinearLayout linearlayout = (LinearLayout)findViewById(0x7f110168);
            linearlayout.setEnabled(false);
            android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)linearlayout.getLayoutParams();
            layoutparams.height = 0;
            linearlayout.setLayoutParams(layoutparams);
            return;
        }
    }

    static String i(LoginActivity loginactivity)
    {
        return loginactivity.r;
    }

    private void i()
    {
        Intent intent = getIntent();
        t = "com.fitbit.onboarding.login.LoginActivity.ACTION_AUTO_LOG_IN".equals(intent.getAction());
        if (t)
        {
            intent.setAction("com.fitbit.onboarding.login.LoginActivity.ACTION_LOG_IN");
            setIntent(intent);
        }
    }

    private void j()
    {
        a.setError(null);
        b.setError(null);
        if ("com.fitbit.onboarding.login.LoginActivity.ACTION_SIGN_UP".equals(getIntent().getAction()))
        {
            if (f.isChecked())
            {
                ServerSavedState.m();
                l();
                return;
            } else
            {
                a(a.getText().toString(), b.getText().toString());
                com.fitbit.ui.s.a(this, 0x7f0803a9, 1).i();
                return;
            }
        } else
        {
            k();
            return;
        }
    }

    static void j(LoginActivity loginactivity)
    {
        loginactivity.l();
    }

    private void k()
    {
label0:
        {
            String s1;
            String s2;
label1:
            {
                if (!p)
                {
                    s1 = a.getText().toString();
                    s2 = b.getText().toString();
                    boolean flag = a(s1, s2);
                    an an1 = an.a();
                    if (com.fitbit.savedstate.d.m())
                    {
                        Object obj = an1.h();
                        if (obj == null)
                        {
                            obj = com.fitbit.savedstate.d.h();
                        } else
                        {
                            obj = ((ad) (obj)).a;
                        }
                        if (obj != null && !s1.equals(obj))
                        {
                            com.fitbit.e.a.a("LoginActivity", "User tryed to log in with another credentials. Drop all data for previous user.", new Object[0]);
                            com.fitbit.savedstate.d.c(false);
                            DaoFactory.getInstance().cleanUpStore();
                            (new com.fitbit.runtrack.data.b()).b();
                            an.a().a(true);
                            an.a().d();
                        }
                    }
                    if (!flag)
                    {
                        break label0;
                    }
                    p = true;
                    n.a(a(s1));
                    if (!an1.g())
                    {
                        break label1;
                    }
                    m.a(ac.a(this));
                }
                return;
            }
            m.a(ac.a(this, s1, s2));
            return;
        }
        com.fitbit.ui.s.a(this, getString(0x7f080183), 1).i();
    }

    private void l()
    {
        s = false;
        if (isFinishing() || m.l() || !f.isChecked())
        {
            return;
        }
        String s1 = a.getText().toString();
        String s2 = b.getText().toString();
        if (a(s1, s2))
        {
            q = s1;
            r = s2;
            n.a(a(q));
            m.a(com.fitbit.data.bl.j.a(this, q, r));
            return;
        } else
        {
            com.fitbit.ui.s.a(this, getString(0x7f080183), 1).i();
            return;
        }
    }

    private void m()
    {
        if (!o && !m.l())
        {
            o = true;
            com.fitbit.savedstate.d.a(a.getText().toString());
            PasswordRecoveryActivity.a(this, a.getText().toString());
        }
    }

    private void n()
    {
        if (!dg.d().f())
        {
            dg.d().c(true);
            an.a().d();
            return;
        } else
        {
            bq.a(this);
            com.fitbit.savedstate.d.c(false);
            setResult(-1);
            finish();
            com.fitbit.mixpanel.f.c("Auth: Login");
            return;
        }
    }

    private void o()
    {
        a.c(0);
        UISavedState.d(false);
    }

    protected void d()
    {
        b.c(0);
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (i1 == 4907 && j1 == -1)
        {
            setResult(j1);
            finish();
        }
    }

    public void onBackPressed()
    {
        an.a().d();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040034);
        c = (TextView)findViewById(0x7f11016c);
        a = (EditText)findViewById(0x7f110165);
        e = (CheckBox)findViewById(0x7f11016b);
        b = (EditText)findViewById(0x7f110166);
        d = (TextView)findViewById(0x7f11016d);
        f = (CheckBox)findViewById(0x7f110169);
        g = (TextView)findViewById(0x7f11016a);
        bundle = findViewById(0x7f11016c);
        if (bundle != null)
        {
            bundle.setOnClickListener(new android.view.View.OnClickListener() {

                final LoginActivity a;

                public void onClick(View view)
                {
                    com.fitbit.onboarding.login.LoginActivity.a(a);
                }

            
            {
                a = LoginActivity.this;
                super();
            }
            });
        }
        bundle = findViewById(0x7f11016d);
        if (bundle != null)
        {
            bundle.setOnClickListener(new android.view.View.OnClickListener() {

                final LoginActivity a;

                public void onClick(View view)
                {
                    com.fitbit.onboarding.login.LoginActivity.b(a);
                }

            
            {
                a = LoginActivity.this;
                super();
            }
            });
        }
        bundle = (TextView)findViewById(0x7f110165);
        if (bundle != null)
        {
            bundle.addTextChangedListener(new TextWatcher() {

                final LoginActivity a;

                public void afterTextChanged(Editable editable)
                {
                }

                public void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
                {
                }

                public void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
                {
                    LoginActivity.c(a);
                }

            
            {
                a = LoginActivity.this;
                super();
            }
            });
        }
        bundle = (TextView)findViewById(0x7f110166);
        if (bundle != null)
        {
            bundle.addTextChangedListener(new TextWatcher() {

                final LoginActivity a;

                public void afterTextChanged(Editable editable)
                {
                }

                public void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
                {
                }

                public void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
                {
                    a.d();
                }

            
            {
                a = LoginActivity.this;
                super();
            }
            });
        }
        i();
        f();
    }

    public void onResume()
    {
        super.onResume();
        g();
        a.i();
        b.i();
        o = false;
        if (t)
        {
            k();
        }
    }
}
