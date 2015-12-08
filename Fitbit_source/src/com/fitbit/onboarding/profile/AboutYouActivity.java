// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.profile;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import com.fitbit.customui.LengthPicker;
import com.fitbit.customui.WeightPicker;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.ax;
import com.fitbit.data.bl.cq;
import com.fitbit.data.bl.dg;
import com.fitbit.data.bl.exceptions.IncorrectTimestampException;
import com.fitbit.data.bl.exceptions.SignupException;
import com.fitbit.data.bl.gd;
import com.fitbit.data.domain.Gender;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.WeightLogEntry;
import com.fitbit.e.a;
import com.fitbit.home.ui.g;
import com.fitbit.mixpanel.f;
import com.fitbit.onboarding.OnboardingFragmentActivity;
import com.fitbit.profile.ui.ProfileSaveModel;
import com.fitbit.profile.ui.b;
import com.fitbit.ui.EditText;
import com.fitbit.ui.dialogs.DatePickerFragment;
import com.fitbit.ui.dialogs.GenderDialogFragment;
import com.fitbit.ui.s;
import com.fitbit.ui.views.OnboardingGenderPicker;
import com.fitbit.util.bn;
import com.fitbit.util.format.e;
import com.fitbit.util.k;
import com.fitbit.util.o;
import com.fitbit.weight.Weight;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

public class AboutYouActivity extends OnboardingFragmentActivity
    implements android.app.DatePickerDialog.OnDateSetListener, android.content.DialogInterface.OnCancelListener, android.support.v4.app.LoaderManager.LoaderCallbacks, android.view.View.OnFocusChangeListener, com.fitbit.ui.views.OnboardingGenderPicker.a
{
    public static class WhyAreWeAskingDialogFragment extends DialogFragment
    {

        public Dialog onCreateDialog(Bundle bundle)
        {
            bundle = new android.app.AlertDialog.Builder(new ContextThemeWrapper(getActivity(), 0x7f0c01d0));
            bundle.setMessage(0x7f08059d);
            bundle.setTitle(0x7f08059e);
            bundle.setPositiveButton(0x7f08042e, null);
            return bundle.create();
        }

        public WhyAreWeAskingDialogFragment()
        {
        }
    }


    private static final String a = "AboutYouActivity";
    private static final String b = "com.fitbit.onboarding.profile.AboutYouActivity.ARG_LOAD_PROFILE_FORCED";
    private static final String c = "com.fitbit.onboarding.profile.AboutYouActivity.EXTRA_SAVE_MODEL";
    private static final String d = (new StringBuilder()).append(com/fitbit/onboarding/profile/AboutYouActivity.getName()).append(".FRAGMENT_DATE_PICKER").toString();
    private static final String e = (new StringBuilder()).append(com/fitbit/onboarding/profile/AboutYouActivity.getName()).append(".FRAGMENT_GENDER_PICKER").toString();
    private TextWatcher A;
    private View f;
    private View g;
    private EditText h;
    private EditText i;
    private LengthPicker j;
    private WeightPicker k;
    private EditText l;
    private Button m;
    private TextView n;
    private boolean o;
    private String p;
    private String q;
    private boolean r;
    private boolean s;
    private Profile t;
    private b u;
    private ProfileSaveModel v;
    private Handler w;
    private g x;
    private boolean y;
    private Runnable z;

    public AboutYouActivity()
    {
        s = false;
        w = new Handler(Looper.getMainLooper());
        z = new Runnable() {

            final AboutYouActivity a;

            public void run()
            {
                com.fitbit.onboarding.profile.AboutYouActivity.a(a).setVisibility(0);
                com.fitbit.onboarding.profile.AboutYouActivity.a(a).setAnimation(AnimationUtils.loadAnimation(a, 0x7f050009));
            }

            
            {
                a = AboutYouActivity.this;
                super();
            }
        };
        A = new TextWatcher() {

            final AboutYouActivity a;

            public void afterTextChanged(Editable editable)
            {
            }

            public void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            public void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
                if (charsequence != null && AboutYouActivity.h(a) != null)
                {
                    AboutYouActivity.h(a).a(charsequence.toString().trim());
                }
                if (com.fitbit.onboarding.profile.AboutYouActivity.g(a) && AboutYouActivity.i(a).getError() != null)
                {
                    AboutYouActivity.i(a).c(0);
                }
            }

            
            {
                a = AboutYouActivity.this;
                super();
            }
        };
    }

    public static Intent a(Activity activity, String s1, String s2, boolean flag)
    {
        activity = new Intent(activity, com/fitbit/onboarding/profile/AboutYouActivity);
        activity.putExtra("signup_mode", true);
        activity.putExtra("username", s1);
        activity.putExtra("password", s2);
        activity.putExtra("email_newsletter", flag);
        return activity;
    }

    static View a(AboutYouActivity aboutyouactivity)
    {
        return aboutyouactivity.g;
    }

    private void a(int i1, int j1, int k1)
    {
        int i2 = com.fitbit.util.o.a(this);
        int l1 = i1;
        if (i1 < i2)
        {
            l1 = i2;
        }
        GregorianCalendar gregoriancalendar = new GregorianCalendar(bn.c());
        gregoriancalendar.set(1, l1);
        gregoriancalendar.set(2, j1);
        gregoriancalendar.set(5, k1);
        gregoriancalendar.set(11, 0);
        gregoriancalendar.set(12, 0);
        gregoriancalendar.set(13, 0);
        a(gregoriancalendar.getTime());
    }

    private void a(Gender gender)
    {
        u.a(gender);
        u();
    }

    private void a(EditText edittext)
    {
        edittext.setInputType(0);
        edittext.setKeyListener(null);
        edittext.setOnFocusChangeListener(this);
    }

    private void a(Date date)
    {
        u.a(date);
        r();
    }

    static void b(AboutYouActivity aboutyouactivity)
    {
        aboutyouactivity.i();
    }

    static void c(AboutYouActivity aboutyouactivity)
    {
        aboutyouactivity.j();
    }

    static void d(AboutYouActivity aboutyouactivity)
    {
        aboutyouactivity.k();
    }

    static void e(AboutYouActivity aboutyouactivity)
    {
        aboutyouactivity.w();
    }

    private void f()
    {
        if (o)
        {
            x = new g(this, 83) {

                final AboutYouActivity a;

                public void a()
                {
                    super.a();
                    if (com.fitbit.onboarding.profile.AboutYouActivity.f(a))
                    {
                        dg.d().c(true);
                        an.a().d();
                        m().setResult(0);
                        m().finish();
                        return;
                    } else
                    {
                        m().setResult(-1);
                        m().finish();
                        return;
                    }
                }

                public void a(Exception exception)
                {
                    if (com.fitbit.onboarding.profile.AboutYouActivity.f(a)) goto _L2; else goto _L1
_L1:
                    Iterator iterator;
                    if (!(exception instanceof SignupException))
                    {
                        break MISSING_BLOCK_LABEL_373;
                    }
                    i().d();
                    SignupException signupexception = (SignupException)exception;
                    exception = "";
                    iterator = signupexception.a().iterator();
_L10:
                    Object obj;
                    Pair pair;
                    if (!iterator.hasNext())
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    pair = (Pair)iterator.next();
                    obj = exception;
                    if (!exception.equals(""))
                    {
                        obj = (new StringBuilder()).append(exception).append("\n").toString();
                    }
                    ((Integer)pair.first).intValue();
                    JVM INSTR tableswitch 1 5: default 140
                //                               1 183
                //                               2 241
                //                               3 271
                //                               4 301
                //                               5 330;
                       goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
                    exception = (new StringBuilder()).append(((String) (obj))).append(((String)pair.second).replace("<em>", "").replace("</em>", "")).toString();
                    continue; /* Loop/switch isn't completed */
_L4:
                    exception = a.getString(0x7f080187);
                    obj = new android.app.AlertDialog.Builder(m());
                    ((android.app.AlertDialog.Builder) (obj)).setPositiveButton(0x7f08042e, null);
                    ((android.app.AlertDialog.Builder) (obj)).setMessage(exception);
                    exception = ((android.app.AlertDialog.Builder) (obj)).create();
                /* block-local class not found */
                class _cls1 {}

                    exception.setOnDismissListener(new _cls1());
                    exception.show();
_L2:
                    return;
_L5:
                    exception = (new StringBuilder()).append(((String) (obj))).append(a.getString(0x7f08018f)).toString();
                    continue; /* Loop/switch isn't completed */
_L6:
                    exception = (new StringBuilder()).append(((String) (obj))).append(a.getString(0x7f08018f)).toString();
                    continue; /* Loop/switch isn't completed */
_L7:
                    exception = (new StringBuilder()).append(((String) (obj))).append((String)pair.second).toString();
                    continue; /* Loop/switch isn't completed */
_L8:
                    exception = (new StringBuilder()).append(((String) (obj))).append(a.getString(0x7f08018f)).toString();
                    if (true) goto _L10; else goto _L9
_L9:
                    com.fitbit.ui.s.a(m(), exception, 1).i();
                    return;
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

            
            {
                a = AboutYouActivity.this;
                super(fragmentactivity, i1);
            }
            };
            com.fitbit.home.ui.b.a a1 = new com.fitbit.home.ui.b.a() {

                final AboutYouActivity a;

                public void a(com.fitbit.home.ui.b b1)
                {
                    if (com.fitbit.onboarding.profile.AboutYouActivity.g(a))
                    {
                        com.fitbit.onboarding.profile.AboutYouActivity.b(a);
                    }
                }

            
            {
                a = AboutYouActivity.this;
                super();
            }
            };
            x.a(new com.fitbit.home.ui.b(this, a1, this) {

                final AboutYouActivity a;

                protected String a()
                {
                    return com.fitbit.ui.dialogs.a.a(a);
                }

            
            {
                a = AboutYouActivity.this;
                super(fragmentactivity, a1, oncancellistener);
            }
            });
        }
    }

    static boolean f(AboutYouActivity aboutyouactivity)
    {
        return aboutyouactivity.y;
    }

    private void g()
    {
        h.setError(null);
        i.setError(null);
        j.j();
        k.j();
        l.setError(null);
    }

    static boolean g(AboutYouActivity aboutyouactivity)
    {
        return aboutyouactivity.s;
    }

    static b h(AboutYouActivity aboutyouactivity)
    {
        return aboutyouactivity.u;
    }

    private void h()
    {
        h.addTextChangedListener(A);
        a(i);
        a(l);
        if (j != null)
        {
            j.b(1);
        }
        if (o)
        {
            a(((Profile) (null)));
            return;
        } else
        {
            w.postDelayed(z, 500L);
            Bundle bundle = new Bundle();
            bundle.putBoolean("com.fitbit.onboarding.profile.AboutYouActivity.ARG_LOAD_PROFILE_FORCED", true);
            getSupportLoaderManager().initLoader(23, bundle, this);
            return;
        }
    }

    static EditText i(AboutYouActivity aboutyouactivity)
    {
        return aboutyouactivity.h;
    }

    private void i()
    {
        g();
        boolean flag = com.fitbit.util.k.a();
        com.fitbit.e.a.a("AboutYouActivity", "Join allowed by coppa = %s", new Object[] {
            Boolean.valueOf(flag)
        });
        if (!flag)
        {
            com.fitbit.util.k.a(this, false);
        } else
        if (s && (!o || !x.l()) && (o || t != null))
        {
            y = false;
            o();
            if (l())
            {
                if (o)
                {
                    x.a(ax.a(this, p, q, u.a(), u.b(), u.c(), u.d(), u.e(), r));
                    return;
                }
                t.e(u.a());
                t.a(u.b());
                t.c(u.c());
                t.b((com.fitbit.data.domain.Length.LengthUnits)u.c().a());
                t.a((com.fitbit.data.domain.WeightLogEntry.WeightUnits)u.d().a());
                t.a(u.e());
                t.g(null);
                an.a().a(t, this);
                if (u.d() != null)
                {
                    WeightLogEntry weightlogentry = new WeightLogEntry();
                    weightlogentry.a(u.d());
                    weightlogentry.setLogDate(new Date());
                    gd.a().a(weightlogentry, this);
                }
                startService(cq.a(this, new Date(), true, new com.fitbit.data.bl.SyncDataForDayOperation.DailyDataType[] {
                    com.fitbit.data.bl.SyncDataForDayOperation.DailyDataType.b, com.fitbit.data.bl.SyncDataForDayOperation.DailyDataType.a, com.fitbit.data.bl.SyncDataForDayOperation.DailyDataType.c
                }));
                setResult(-1);
                finish();
                com.fitbit.mixpanel.f.c("Auth: Sign Up - Complete Profile");
                return;
            }
        }
    }

    private void j()
    {
        Calendar calendar = Calendar.getInstance(bn.c());
        calendar.setTime(u.b());
        Object obj = getSupportFragmentManager().findFragmentByTag(d);
        if (obj != null)
        {
            getSupportFragmentManager().beginTransaction().remove(((android.support.v4.app.Fragment) (obj)));
        }
        obj = new DatePickerFragment();
        ((DatePickerFragment) (obj)).setArguments(DatePickerFragment.a(calendar));
        ((DatePickerFragment) (obj)).a(this);
        ((DatePickerFragment) (obj)).show(getSupportFragmentManager(), d);
    }

    private void k()
    {
        GenderDialogFragment genderdialogfragment = (GenderDialogFragment)getSupportFragmentManager().findFragmentByTag(e);
        if (genderdialogfragment != null)
        {
            genderdialogfragment.dismiss();
        }
        genderdialogfragment = GenderDialogFragment.c();
        genderdialogfragment.a(u.e());
        genderdialogfragment.a(this);
        genderdialogfragment.show(getSupportFragmentManager(), e);
    }

    private boolean l()
    {
        int i1 = u.f();
        int j1;
        if (i1 > 0)
        {
            h.c(i1);
            i1 = 1;
        } else
        {
            h.c(0);
            i1 = 0;
        }
        j1 = u.g();
        if (j1 > 0)
        {
            j.c(j1);
            i1 = 1;
        } else
        {
            j.c(0);
        }
        j1 = u.h();
        if (j1 > 0)
        {
            k.c(j1);
            i1 = 1;
        } else
        {
            k.c(0);
        }
        j1 = u.i();
        if (j1 > 0)
        {
            l.c(j1);
            j1 = 1;
        } else
        {
            l.c(0);
            j1 = i1;
        }
        i1 = u.j();
        if (i1 > 0)
        {
            if (0x7f080295 == i1)
            {
                i.setError(null);
                i1 = 1;
            } else
            {
                i.c(i1);
                i1 = 1;
            }
        } else
        {
            i.c(0);
            i1 = 0;
        }
        if (i1 != 0)
        {
            m();
            return false;
        }
        if (j1 != 0)
        {
            com.fitbit.ui.s.a(this, getString(0x7f080183), 1).i();
            return false;
        } else
        {
            return true;
        }
    }

    private void m()
    {
        com.fitbit.util.k.a(this, true);
    }

    private void n()
    {
        u = new b();
        u.a(t);
        u.a(v);
    }

    private void o()
    {
        u.a((Length)j.g());
        u.a((Weight)k.g());
    }

    private void p()
    {
        q();
        r();
        s();
        t();
        u();
    }

    private void q()
    {
        if (u.a() != null && !u.a().isEmpty())
        {
            h.setText(u.a());
            h.c(0);
            return;
        } else
        {
            h.i();
            return;
        }
    }

    private void r()
    {
        i.setText(com.fitbit.util.format.e.e(getApplicationContext(), u.b()));
        DatePickerFragment datepickerfragment;
        if (u.j() == 0)
        {
            i.c(0);
        } else
        {
            i.i();
        }
        datepickerfragment = (DatePickerFragment)getSupportFragmentManager().findFragmentByTag(d);
        if (datepickerfragment != null)
        {
            datepickerfragment.a(this);
        }
    }

    private void s()
    {
        int i1 = u.g();
        j.c(i1);
        j.a(u.c());
    }

    private void t()
    {
        int i1 = u.h();
        k.c(i1);
        k.a(u.d());
    }

    private void u()
    {
        int i1 = u.e().getStringId();
        if (i1 > 0)
        {
            l.setText(i1);
            l.setError(null);
            return;
        } else
        {
            l.i();
            return;
        }
    }

    private void v()
    {
        g.setVisibility(8);
        if (f.getVisibility() != 0)
        {
            f.setAnimation(AnimationUtils.loadAnimation(this, 0x7f050009));
            f.setVisibility(0);
        }
    }

    private void w()
    {
        if (s)
        {
            (new WhyAreWeAskingDialogFragment()).show(getSupportFragmentManager(), null);
        }
    }

    public void a(Loader loader, Profile profile)
    {
        if (profile == null)
        {
            finish();
            return;
        } else
        {
            w.removeCallbacks(z);
            a(profile);
            v();
            return;
        }
    }

    void a(Profile profile)
    {
        t = profile;
        n();
        p();
    }

    public void a(OnboardingGenderPicker onboardinggenderpicker)
    {
        a(onboardinggenderpicker.a());
    }

    public void onBackPressed()
    {
        an.a().d();
        super.onBackPressed();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        y = true;
        dg.d().c(false);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040000);
        if (bundle != null)
        {
            v = (ProfileSaveModel)bundle.get("com.fitbit.onboarding.profile.AboutYouActivity.EXTRA_SAVE_MODEL");
        }
        f = findViewById(0x7f11006c);
        g = findViewById(0x7f11006b);
        h = (EditText)findViewById(0x7f110070);
        i = (EditText)findViewById(0x7f110071);
        j = (LengthPicker)findViewById(0x7f110072);
        k = (WeightPicker)findViewById(0x7f110073);
        l = (EditText)findViewById(0x7f110074);
        m = (Button)findViewById(0x7f110075);
        n = (TextView)findViewById(0x7f11006e);
        bundle = getIntent().getExtras();
        o = bundle.getBoolean("signup_mode", false);
        p = bundle.getString("username", null);
        q = bundle.getString("password", null);
        r = bundle.getBoolean("email_newsletter", true);
        m.setOnClickListener(new android.view.View.OnClickListener() {

            final AboutYouActivity a;

            public void onClick(View view)
            {
                com.fitbit.onboarding.profile.AboutYouActivity.b(a);
            }

            
            {
                a = AboutYouActivity.this;
                super();
            }
        });
        i.setOnClickListener(new android.view.View.OnClickListener() {

            final AboutYouActivity a;

            public void onClick(View view)
            {
                AboutYouActivity.c(a);
            }

            
            {
                a = AboutYouActivity.this;
                super();
            }
        });
        l.setOnClickListener(new android.view.View.OnClickListener() {

            final AboutYouActivity a;

            public void onClick(View view)
            {
                AboutYouActivity.d(a);
            }

            
            {
                a = AboutYouActivity.this;
                super();
            }
        });
        n.setOnClickListener(new android.view.View.OnClickListener() {

            final AboutYouActivity a;

            public void onClick(View view)
            {
                com.fitbit.onboarding.profile.AboutYouActivity.e(a);
            }

            
            {
                a = AboutYouActivity.this;
                super();
            }
        });
        f();
        h();
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        return new com.fitbit.profile.ui.a(this, bundle.getBoolean("com.fitbit.onboarding.profile.AboutYouActivity.ARG_LOAD_PROFILE_FORCED", true));
    }

    public void onDateSet(DatePicker datepicker, int i1, int j1, int k1)
    {
        a(i1, j1, k1);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        w.removeCallbacks(z);
    }

    public void onFocusChange(View view, boolean flag)
    {
        if (flag && s && u != null)
        {
            if (view == i)
            {
                j();
            } else
            if (view == l)
            {
                k();
                return;
            }
        }
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (Profile)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    protected void onPause()
    {
        s = false;
        super.onPause();
        g();
    }

    protected void onResume()
    {
        s = true;
        super.onResume();
        p();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (u != null)
        {
            ProfileSaveModel profilesavemodel = new ProfileSaveModel();
            profilesavemodel.a(u);
            bundle.putSerializable("com.fitbit.onboarding.profile.AboutYouActivity.EXTRA_SAVE_MODEL", profilesavemodel);
        }
    }

}
