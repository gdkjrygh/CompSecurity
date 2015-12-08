// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import Br;
import Bt;
import HZ;
import Ic;
import Iq;
import Jo;
import KO;
import Ll;
import Mf;
import Pi;
import RK;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.analytics.RegistrationAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.api2.LoginTask;
import com.snapchat.android.database.SharedPreferenceKey;
import com.snapchat.android.fragments.verification.NewUserPhoneVerificationFragment;
import com.snapchat.android.ui.LinkFriendlyTextView;
import com.snapchat.android.ui.window.WindowConfiguration;
import com.snapchat.android.util.AlertDialogUtils;
import com.snapchat.android.util.crypto.DeviceTokenManager;
import com.snapchat.android.util.fragment.SnapchatFragment;
import fW;
import jQ;
import java.util.Locale;
import javax.inject.Provider;
import jw;
import un;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            PickUsernameFragment, TwoFactorCodeVerificationFragment

public class LoginFragment extends SnapchatFragment
    implements com.snapchat.android.api2.LoginTask.a
{

    private static int b = -1;
    private static int c = -1;
    public KO a;
    private EditText d;
    private TextView e;
    private TextView f;
    private ImageView g;
    private ImageView h;
    private EditText i;
    private View j;
    private TextView k;
    private Button l;
    private boolean m;
    private long n;
    private Drawable o;
    private int p;
    private final Provider q;
    private final RegistrationAnalytics r;
    private final un s;
    private final android.view.View.OnClickListener t;
    private final TextWatcher u;

    public LoginFragment()
    {
        Mf.a();
        Provider provider = Br.UNSAFE_USER_PROVIDER;
        DeviceTokenManager.getInstance();
        this(provider, RegistrationAnalytics.a(), new WindowConfiguration(), un.a());
    }

    public LoginFragment(WindowConfiguration windowconfiguration)
    {
        Mf.a();
        Provider provider = Br.UNSAFE_USER_PROVIDER;
        DeviceTokenManager.getInstance();
        this(provider, RegistrationAnalytics.a(), windowconfiguration, un.a());
    }

    private LoginFragment(Provider provider, RegistrationAnalytics registrationanalytics, WindowConfiguration windowconfiguration, un un1)
    {
        super(windowconfiguration);
        m = false;
        t = new android.view.View.OnClickListener() {

            private LoginFragment a;

            public final void onClick(View view)
            {
                ((InputMethodManager)a.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(LoginFragment.a(a).getApplicationWindowToken(), 0);
                LoginFragment.a(a).getText().toString().trim().toLowerCase(Locale.US);
                LoginFragment.b(a).getText().toString().trim();
                LoginFragment.c(a);
            }

            
            {
                a = LoginFragment.this;
                super();
            }
        };
        u = new TextWatcher() {

            private LoginFragment a;

            public final void afterTextChanged(Editable editable)
            {
                LoginFragment.d(a);
                LoginFragment.e(a);
                LoginFragment.f(a);
            }

            public final void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            
            {
                a = LoginFragment.this;
                super();
            }
        };
        SnapchatApplication.getDIComponent().a(this);
        q = provider;
        r = registrationanalytics;
        s = un1;
    }

    static EditText a(LoginFragment loginfragment)
    {
        return loginfragment.d;
    }

    private void a(String s1)
    {
        if (s1 == null)
        {
            e.setVisibility(4);
            g.setVisibility(4);
            return;
        } else
        {
            e.setVisibility(0);
            e.setText(s1);
            g.setVisibility(0);
            return;
        }
    }

    static EditText b(LoginFragment loginfragment)
    {
        return loginfragment.i;
    }

    private void b(String s1)
    {
        if (s1 == null)
        {
            f.setVisibility(4);
            h.setVisibility(4);
            return;
        } else
        {
            f.setVisibility(0);
            f.setText(s1);
            h.setVisibility(0);
            return;
        }
    }

    static void c(LoginFragment loginfragment)
    {
        loginfragment.j.setVisibility(0);
        loginfragment.k.setVisibility(8);
        loginfragment.k.setText(0x7f080315);
        loginfragment.k.postDelayed(loginfragment. new Runnable() {

            private LoginFragment a;

            public final void run()
            {
                LoginFragment.i(a).setVisibility(0);
            }

            
            {
                a = LoginFragment.this;
                super();
            }
        }, 5000L);
        loginfragment.l.setClickable(false);
        loginfragment.l.setText("");
        String s1 = loginfragment.d.getText().toString().trim().toLowerCase(Locale.US);
        String s2 = loginfragment.i.getText().toString().trim();
        Bt.e(true);
        (new LoginTask(s1, s2, loginfragment, null, loginfragment.a, loginfragment.q)).execute();
    }

    static void d(LoginFragment loginfragment)
    {
        loginfragment.o();
    }

    static void e(LoginFragment loginfragment)
    {
        loginfragment.a(((String) (null)));
    }

    static void f(LoginFragment loginfragment)
    {
        loginfragment.b(((String) (null)));
    }

    static Drawable g(LoginFragment loginfragment)
    {
        return loginfragment.o;
    }

    static int h()
    {
        return c;
    }

    static Button h(LoginFragment loginfragment)
    {
        return loginfragment.l;
    }

    static TextView i(LoginFragment loginfragment)
    {
        return loginfragment.k;
    }

    static int m()
    {
        return b;
    }

    private void n()
    {
        j.setVisibility(4);
        l.setVisibility(4);
    }

    private void o()
    {
        if (TextUtils.isEmpty(d.getText()) || TextUtils.isEmpty(i.getText())) goto _L2; else goto _L1
_L1:
        l.setText(0x7f080165);
        l.setClickable(true);
        l.setVisibility(0);
        if (!m) goto _L4; else goto _L3
_L3:
        return;
_L4:
        m = true;
        TransitionDrawable transitiondrawable = new TransitionDrawable(new Drawable[] {
            new ColorDrawable(b), new ColorDrawable(c)
        });
        int i1 = l.getPaddingBottom();
        l.setBackgroundDrawable(transitiondrawable);
        l.setPadding(i1, i1, i1, i1);
        transitiondrawable.startTransition(400);
        n = System.nanoTime();
        return;
_L2:
        l.setVisibility(4);
        if (m)
        {
            m = false;
            Runnable runnable = new Runnable() {

                private LoginFragment a;

                public final void run()
                {
                    TransitionDrawable transitiondrawable1 = new TransitionDrawable(new Drawable[] {
                        new ColorDrawable(LoginFragment.h()), new ColorDrawable(LoginFragment.m())
                    });
                    int j1 = LoginFragment.h(a).getPaddingBottom();
                    LoginFragment.h(a).setBackgroundDrawable(transitiondrawable1);
                    LoginFragment.h(a).setPadding(j1, j1, j1, j1);
                    transitiondrawable1.startTransition(400);
                }

            
            {
                a = LoginFragment.this;
                super();
            }
            };
            long l1 = System.nanoTime();
            long l2 = n;
            (new Handler()).postDelayed(runnable, 400L - 0xf4240L * (l1 - l2));
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final void R_()
    {
        if (!super.isAdded())
        {
            return;
        } else
        {
            n();
            PickUsernameFragment pickusernamefragment = new PickUsernameFragment(super.mWindowConfiguration);
            a(p, pickusernamefragment, pickusernamefragment.getClass().getSimpleName());
            return;
        }
    }

    public final void a()
    {
        if (!super.isAdded())
        {
            return;
        } else
        {
            k.setText(0x7f08017f);
            return;
        }
    }

    public final void a(int i1, String s1)
    {
        if (!super.isAdded())
        {
            return;
        }
        n();
        if (i1 == -101)
        {
            a(s1);
            return;
        }
        if (i1 == -100)
        {
            b(s1);
            return;
        } else
        {
            o();
            AlertDialogUtils.a(getActivity(), s1, getString(0x7f080183));
            return;
        }
    }

    public final void a(RK rk)
    {
        if (!super.isAdded())
        {
            return;
        } else
        {
            i.setText("");
            n();
            rk = TwoFactorCodeVerificationFragment.a(rk.u(), rk.s(), rk.v());
            a(p, ((android.support.v4.app.Fragment) (rk)), rk.getClass().getSimpleName());
            return;
        }
    }

    protected final com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode b()
    {
        if (Ic.SUPPORTS_TRANSPARENT_STATUS_BAR)
        {
            return super.b();
        } else
        {
            return com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BELOW_FOR_ADJUSTABLE_UI;
        }
    }

    public final void b(RK rk)
    {
        while (!super.isAdded() || Bt.q() == null) 
        {
            return;
        }
        Object obj = getActivity().getIntent();
        rk = r;
        obj = s.a(((android.content.Intent) (obj)));
        fW fw = new fW();
        if (obj != null)
        {
            fw.source = jQ.EXTERNAL;
            fw.deepLinkSource = ((gs) (obj));
        }
        ((RegistrationAnalytics) (rk)).mBlizzardEventLogger.a(fw);
        HZ.a(getActivity(), false);
    }

    public final void c()
    {
        if (!super.isAdded())
        {
            return;
        } else
        {
            n();
            NewUserPhoneVerificationFragment newuserphoneverificationfragment = new NewUserPhoneVerificationFragment(super.mWindowConfiguration);
            a(p, newuserphoneverificationfragment, newuserphoneverificationfragment.getClass().getSimpleName());
            return;
        }
    }

    protected final boolean o_()
    {
        return super.isAdded();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f04009d, viewgroup, false);
        if (b == -1)
        {
            b = getResources().getColor(0x7f0c005c);
        }
        if (c == -1)
        {
            c = getResources().getColor(0x7f0c005d);
        }
        p = viewgroup.getId();
        layoutinflater = getActivity();
        d = (EditText)d(0x7f0d0333);
        d.addTextChangedListener(u);
        Pi.a();
        if (!Pi.d())
        {
            ((LinkFriendlyTextView)d(0x7f0d0339)).setText(0x7f0800fe);
        }
        e = (TextView)d(0x7f0d0335);
        g = (ImageView)d(0x7f0d0334);
        g.setOnClickListener(new android.view.View.OnClickListener() {

            private LoginFragment a;

            public final void onClick(View view)
            {
                LoginFragment.a(a).setText("");
                LoginFragment.e(a);
            }

            
            {
                a = LoginFragment.this;
                super();
            }
        });
        i = (EditText)d(0x7f0d0336);
        i.setTypeface(Typeface.DEFAULT);
        i.setTransformationMethod(new PasswordTransformationMethod());
        i.addTextChangedListener(u);
        i.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            private LoginFragment a;

            public final boolean onEditorAction(TextView textview, int i1, KeyEvent keyevent)
            {
                LoginFragment.c(a);
                return false;
            }

            
            {
                a = LoginFragment.this;
                super();
            }
        });
        f = (TextView)d(0x7f0d0338);
        h = (ImageView)d(0x7f0d0337);
        h.setOnClickListener(new android.view.View.OnClickListener() {

            private LoginFragment a;

            public final void onClick(View view)
            {
                LoginFragment.b(a).setText("");
                LoginFragment.f(a);
            }

            
            {
                a = LoginFragment.this;
                super();
            }
        });
        l = (Button)d(0x7f0d033a);
        viewgroup = l;
        layoutinflater.getAssets();
        Iq.a(viewgroup);
        l.setOnClickListener(t);
        l.setOnTouchListener(new android.view.View.OnTouchListener() {

            private LoginFragment a;

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                LoginFragment.h(a).setBackgroundDrawable(LoginFragment.g(a));
                return false;
            }

            
            {
                a = LoginFragment.this;
                super();
            }
        });
        j = d(0x7f0d033b);
        k = (TextView)d(0x7f0d033c);
        viewgroup = PreferenceManager.getDefaultSharedPreferences(layoutinflater).getString(SharedPreferenceKey.LAST_SUCCESSFUL_LOGIN_USERNAME.getKey(), null);
        if (viewgroup == null) goto _L2; else goto _L1
_L1:
        d.setText(viewgroup);
        if (i.requestFocus())
        {
            Jo.g(layoutinflater);
        }
_L4:
        l.setVisibility(4);
        o = getResources().getDrawable(0x7f020238);
        return mFragmentLayout;
_L2:
        viewgroup = r;
        bundle = new jw();
        ((RegistrationAnalytics) (viewgroup)).mBlizzardEventLogger.a(bundle);
        if (d.requestFocus())
        {
            Jo.g(layoutinflater);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        d = null;
        i = null;
        j = null;
        l = null;
    }

    public void onResume()
    {
        super.onResume();
        ad();
    }

}
