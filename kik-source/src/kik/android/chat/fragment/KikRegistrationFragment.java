// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.text.format.DateUtils;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.ButterKnife;
import com.kik.android.a;
import com.kik.g.f;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.Timer;
import kik.a.d.aa;
import kik.a.e.n;
import kik.a.e.t;
import kik.a.e.v;
import kik.a.e.w;
import kik.a.f.f.ad;
import kik.a.f.f.af;
import kik.a.f.f.z;
import kik.a.h.h;
import kik.a.h.j;
import kik.android.a.b;
import kik.android.chat.KikApplication;
import kik.android.chat.activity.k;
import kik.android.e.d;
import kik.android.util.DeviceUtils;
import kik.android.util.ar;
import kik.android.util.bg;
import kik.android.util.cq;
import kik.android.util.cr;
import kik.android.util.cy;
import kik.android.util.p;
import kik.android.widget.KikAutoCompleteTextView;
import kik.android.widget.cd;
import kik.android.widget.ce;

// Referenced classes of package kik.android.chat.fragment:
//            KikIqFragmentBase, ok, ow, oy, 
//            oz, pa, oq, ou, 
//            ot, os, ox, ov, 
//            or, pc, pd, pe, 
//            pf, ol, om, on, 
//            op

public class KikRegistrationFragment extends KikIqFragmentBase
    implements d
{

    private DateFormat A;
    private final Date B = new Date();
    private boolean C;
    private boolean D;
    private Timer E;
    private final int F = KikApplication.a(17);
    private android.view.View.OnClickListener G;
    private android.view.View.OnClickListener H;
    private android.app.DatePickerDialog.OnDateSetListener I;
    private TextWatcher J;
    private TextWatcher K;
    EditText _birthdayField;
    KikAutoCompleteTextView _emailField;
    EditText _firstnameField;
    EditText _lastnameField;
    EditText _passwordField;
    ImageView _profPic;
    Button _registerButton;
    EditText _usernameField;
    protected a a;
    protected n b;
    protected t c;
    protected w d;
    protected v e;
    protected kik.a.e.f f;
    protected kik.a.f.k g;
    protected kik.a.aa h;
    protected ar i;
    private int j;
    private int k;
    private boolean l;
    private f m;
    private String n;
    private String o;
    private String p;
    private Drawable q;
    private Drawable r;
    private AnimationDrawable s;
    private Toast t;
    private com.kik.view.adapters.v x;
    private cd y;
    private Calendar z;

    public KikRegistrationFragment()
    {
        m = new f();
        o = "";
        z = Calendar.getInstance();
        A = DateFormat.getDateInstance();
        C = false;
        D = false;
        E = new Timer("UsernameCheckTimer");
        G = new ok(this);
        H = new ow(this);
        I = new oy(this);
        J = new oz(this);
        K = new pa(this);
    }

    static Timer a(KikRegistrationFragment kikregistrationfragment, Timer timer)
    {
        kikregistrationfragment.E = timer;
        return timer;
    }

    static cd a(KikRegistrationFragment kikregistrationfragment, cd cd)
    {
        kikregistrationfragment.y = cd;
        return cd;
    }

    static void a(KikRegistrationFragment kikregistrationfragment)
    {
        kikregistrationfragment.c();
    }

    static void a(KikRegistrationFragment kikregistrationfragment, Bundle bundle)
    {
        if (bundle == null)
        {
            kikregistrationfragment.f();
        } else
        {
            String s1 = bundle.getString("extra.resultUrl");
            if (s1 != null)
            {
                kikregistrationfragment.o = s1;
                kikregistrationfragment.c();
                return;
            }
            if (bundle.getBoolean("network", false))
            {
                kikregistrationfragment.t.setText(KikApplication.f(0x7f09017a));
                kikregistrationfragment.t.show();
                return;
            }
        }
    }

    static void a(KikRegistrationFragment kikregistrationfragment, String s1)
    {
        if (!kikregistrationfragment.D)
        {
            if (kikregistrationfragment.getActivity() != null)
            {
                kikregistrationfragment.getActivity().runOnUiThread(new oq(kikregistrationfragment));
            }
            kikregistrationfragment.a(((kik.a.f.f.y) (new af(kikregistrationfragment, s1))));
        }
    }

    public static void a(ar ar1)
    {
        ar1.a("com.kik.android.registerSharedPrefs").edit().clear().commit();
        kik.android.util.p.a().g();
        kik.android.util.p.a().h();
    }

    static Calendar b(KikRegistrationFragment kikregistrationfragment)
    {
        return kikregistrationfragment.z;
    }

    private void b()
    {
        if (DateUtils.isToday(z.getTimeInMillis()))
        {
            _birthdayField.setText("");
            return;
        } else
        {
            _birthdayField.setText(A.format(z.getTime()));
            return;
        }
    }

    static android.app.DatePickerDialog.OnDateSetListener c(KikRegistrationFragment kikregistrationfragment)
    {
        return kikregistrationfragment.I;
    }

    private void c()
    {
        j = j + 1;
        a.b("Register Complete").a("Attempts");
        String s1 = _usernameField.getText().toString();
        String s5 = _passwordField.getText().toString();
        String s2 = _emailField.getText().toString();
        String s3 = _firstnameField.getText().toString().trim();
        String s4 = _lastnameField.getText().toString().trim();
        long l1 = B.getTime() - z.getTimeInMillis();
        Resources resources = _firstnameField.getResources();
        if (resources != null)
        {
            if (!s3.matches(resources.getString(0x7f0901eb)))
            {
                t.setText(0x7f0901b8);
                t.show();
                s1 = "First Name";
            } else
            if (!s4.matches(resources.getString(0x7f0901eb)))
            {
                t.setText(0x7f0901b9);
                t.show();
                s1 = "Last Name";
            } else
            if (!s1.matches(resources.getString(0x7f0901ee)))
            {
                if (s1.length() < 2)
                {
                    t.setText(0x7f090356);
                    t.show();
                    s1 = "Username Too Short";
                } else
                if (s1.length() > 20)
                {
                    t.setText(0x7f090355);
                    t.show();
                    s1 = "Username Too Long";
                } else
                {
                    t.setText(0x7f090351);
                    t.show();
                    s1 = "Username Invalid";
                }
            } else
            if (!s2.matches(resources.getString(0x7f0901e9)))
            {
                t.setText(0x7f0900d2);
                t.show();
                s1 = "Email";
            } else
            if (!s5.matches(resources.getString(0x7f0901ec)))
            {
                t.setText(0x7f0901a7);
                t.show();
                s1 = "Password";
            } else
            if (DateUtils.isToday(z.getTimeInMillis()))
            {
                t.setText(resources.getString(0x7f090052));
                t.show();
                s1 = null;
            } else
            if (l1 < 0x2c15e09200L)
            {
                t.setText(resources.getString(0x7f090050));
                t.show();
                s1 = null;
            } else
            if (l1 < 0x5f84bbe700L)
            {
                t.setText(resources.getString(0x7f090051));
                t.show();
                J();
                s1 = null;
            } else
            {
                Hashtable hashtable = new Hashtable();
                hashtable.putAll(DeviceUtils.a(getActivity(), i));
                p = c.a(s5);
                s5 = cq.a(kik.a.h.h.a(p, s2, "niCRwL7isZHny24qgLvy"));
                String s6 = cq.a(kik.a.h.h.a(p, s1, "niCRwL7isZHny24qgLvy"));
                a(new ad(this, s2, KikApplication.b(), s5, s6, s1, s3, s4, z.getTime(), o, hashtable), resources.getString(0x7f0901ef), false);
                o = "";
                s1 = null;
            }
            if (s1 != null)
            {
                a.b("Register Error").a("Reason", s1).g().b();
                return;
            }
        }
    }

    static cd d(KikRegistrationFragment kikregistrationfragment)
    {
        return kikregistrationfragment.y;
    }

    private void d()
    {
        _emailField.post(new ou(this));
        a(i);
        SharedPreferences sharedpreferences = i.c();
        sharedpreferences.edit().putInt("kik.registration_count", sharedpreferences.getInt("kik.registration_count", 0) + 1).commit();
        a(new Bundle());
        J();
        kik.android.chat.activity.k.a(new KikConversationsFragment.a(), _emailField.getContext()).f();
        d.g();
    }

    static void e(KikRegistrationFragment kikregistrationfragment)
    {
        kikregistrationfragment.b();
    }

    static Timer f(KikRegistrationFragment kikregistrationfragment)
    {
        return kikregistrationfragment.E;
    }

    private void f()
    {
        t.setText(KikApplication.f(0x7f090063));
        t.show();
    }

    static Drawable g(KikRegistrationFragment kikregistrationfragment)
    {
        return kikregistrationfragment.r;
    }

    static boolean h(KikRegistrationFragment kikregistrationfragment)
    {
        kikregistrationfragment.D = false;
        return false;
    }

    static Drawable i(KikRegistrationFragment kikregistrationfragment)
    {
        return kikregistrationfragment.q;
    }

    static int j(KikRegistrationFragment kikregistrationfragment)
    {
        return kikregistrationfragment.F;
    }

    static AnimationDrawable k(KikRegistrationFragment kikregistrationfragment)
    {
        return kikregistrationfragment.s;
    }

    static void l(KikRegistrationFragment kikregistrationfragment)
    {
        kikregistrationfragment.f();
    }

    protected final int K()
    {
        return 0x7f0902dc;
    }

    protected final void a()
    {
        boolean flag1 = true;
        if (!l && _firstnameField != null)
        {
            com.kik.android.a.f f1 = a.b("Register Incomplete");
            boolean flag;
            if (_firstnameField.getText().length() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f1 = f1.a("First Name Set", flag);
            if (_lastnameField.getText().length() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f1 = f1.a("Last Name Set", flag);
            if (_usernameField.getText().length() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f1 = f1.a("Username Set", flag);
            if (_emailField.getText().length() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f1 = f1.a("Email Set", flag);
            if (_passwordField.getText().length() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f1 = f1.a("Password Set", flag);
            if (n != null && n.length() > 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            f1.a("Phone Number Set", flag).a("Photo Set", kik.android.util.p.a().f()).b("Failed Username Lookup Attempts", k).b("Attempts", j).g().b();
        }
    }

    public final void a(Bitmap bitmap)
    {
        w();
        d();
    }

    protected final void a(z z1)
    {
        boolean flag;
        flag = true;
        super.a(z1);
        if (!(z1 instanceof ad)) goto _L2; else goto _L1
_L1:
        z1 = (ad)z1;
        Object obj = _emailField.getContext();
        l = true;
        ce.a(((android.content.Context) (obj)));
        obj = d.d();
        obj.a = _emailField.getText().toString();
        d.a(((aa) (obj)));
        d.a(((aa) (obj)));
        d.a(z1.d());
        long l1 = kik.a.h.j.b();
        e.a("kik.registrationtime", Long.valueOf(l1));
        obj = new kik.a.d.j(z1.e(), g.o(), null);
        h.a(((kik.a.d.j) (obj)), p, true);
        obj = a.b("Register Complete").b("Attempts", 0L).a("Has Profile Picture", kik.android.util.p.a().f()).a("Failed Username Lookup Attempts", k);
        if (n == null || n.length() == 0)
        {
            flag = false;
        }
        ((com.kik.android.a.f) (obj)).a("Has Phone Number", flag).g().b();
        KikApplication.i().c().a(z1.e());
        KikApplication.i().a();
        if (!C) goto _L4; else goto _L3
_L3:
        _emailField.post(new ot(this));
_L6:
        return;
_L4:
        d();
        return;
_L2:
        if (z1 instanceof af)
        {
            D = true;
            boolean flag1 = ((af)z1).d().booleanValue();
            if (!flag1)
            {
                k = k + 1;
            }
            b(new os(this, flag1));
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final boolean b(z z1)
    {
        if (getActivity() == null)
        {
            return true;
        }
        if (!(z1 instanceof ad)) goto _L2; else goto _L1
_L1:
        String s1;
        ad ad1;
        Resources resources;
        ad1 = (ad)z1;
        s1 = "Unknown";
        resources = _firstnameField.getResources();
        ad1.l();
        JVM INSTR tableswitch 201 206: default 76
    //                   201 140
    //                   202 199
    //                   203 255
    //                   204 350
    //                   205 394
    //                   206 199;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L5
_L3:
        z1 = s1;
_L10:
        P = resources.getString(0x7f0901f2, new Object[] {
            (String)ad1.m()
        });
        Q = cy.a(ad1.l());
_L9:
        a.b("Register Error").a("Reason", z1).g().b();
        return true;
_L4:
        P = resources.getString(0x7f0901f2, new Object[] {
            (String)ad1.m()
        });
        Q = resources.getString(0x7f0900d0, new Object[] {
            (String)ad1.m()
        });
        z1 = "Email";
        continue; /* Loop/switch isn't completed */
_L5:
        P = resources.getString(0x7f0901f2, new Object[] {
            (String)ad1.m()
        });
        Q = resources.getString(0x7f090350, new Object[] {
            ad1.f()
        });
        z1 = "Username Unavailable";
        continue; /* Loop/switch isn't completed */
_L6:
        if (((ad)z1).g() != null)
        {
            z1 = ((ad)z1).g();
            kik.android.chat.activity.k.a((new com.kik.cards.browser.CaptchaWindowFragment.c()).a(z1), getActivity()).f().a(new ox(this));
            return false;
        }
        P = resources.getString(0x7f0901f2, new Object[] {
            (String)ad1.m()
        });
        Q = cy.a(ad1.l());
        z1 = s1;
        continue; /* Loop/switch isn't completed */
_L7:
        P = resources.getString(0x7f0901f2, new Object[] {
            (String)ad1.m()
        });
        Q = ((ad)z1).n();
        z1 = "Unknown";
        if (true) goto _L9; else goto _L8
_L8:
        t.setText(resources.getString(0x7f090051));
        t.show();
        a.b("Register Error").a("Reason", "Birthday").g().b();
        J();
        z1 = "Birthday";
        if (true) goto _L10; else goto _L2
_L2:
        if (z1 instanceof af)
        {
            k = k + 1;
            z1 = getActivity();
            if (z1 != null)
            {
                z1.runOnUiThread(new ov(this));
            }
        }
        return false;
    }

    public final void k_()
    {
        w();
        d();
        Toast.makeText(getActivity(), "Picture upload failed. Please retry from settings", 1).show();
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        Object obj = _firstnameField.getResources();
        if (i1 != 10334 && i1 != 10335 || j1 != -1) goto _L2; else goto _L1
_L1:
        if (!kik.android.util.p.a().a(this, getActivity(), i1, intent, b))
        {
            intent = ((Resources) (obj)).getString(0x7f0902ba);
            obj = ((Resources) (obj)).getString(0x7f090062);
            a((new KikDialogFragment.a(getResources())).a(intent).b(((String) (obj))).a(0x7f090193, new or(this)).a);
        }
_L4:
        return;
_L2:
        if (i1 != 10336 || j1 != -1) goto _L4; else goto _L3
_L3:
        _profPic.setBackgroundDrawable(kik.android.util.p.a().d());
        C = true;
        kik.android.util.p.a().g();
        return;
        intent;
        kik.android.util.p.a().g();
        throw intent;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        n = cr.a(activity.getApplicationContext());
        activity = (KikApplication)activity.getApplication();
        m.a(activity.o(), new pc(this));
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2 && _emailField != null && _emailField.isPopupShowing())
        {
            _emailField.dismissDropDown();
            _emailField.showDropDown();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        V().a(this);
        B.setMinutes(59);
        B.setHours(23);
        B.setMinutes(59);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030013, viewgroup, false);
        a.b("Register Shown").g().b();
        t = Toast.makeText(getActivity(), "", 1);
        layoutinflater.findViewById(0x7f0e001d).setOnClickListener(new pd(this));
        ButterKnife.inject(this, layoutinflater);
        _emailField.setContentDescription("AUTOMATION_TITLE_EMAIL");
        _registerButton.setContentDescription("AUTOMATION_TITLE_REGISTER");
        _birthdayField.setContentDescription("AUTOMATION_TITLE_BIRTHDAY");
        _registerButton.setOnClickListener(G);
        _birthdayField.setOnClickListener(H);
        _profPic.setOnClickListener(new pe(this));
        _passwordField = (EditText)layoutinflater.findViewById(0x7f0e0083);
        _passwordField.setTypeface(Typeface.DEFAULT);
        viewgroup = _firstnameField.getResources();
        q = viewgroup.getDrawable(0x7f020234);
        r = viewgroup.getDrawable(0x7f020233);
        s = (AnimationDrawable)viewgroup.getDrawable(0x7f070080);
        _firstnameField.addTextChangedListener(J);
        _usernameField.addTextChangedListener(K);
        _usernameField.setOnFocusChangeListener(new pf(this, viewgroup));
        _passwordField.addTextChangedListener(new ol(this, viewgroup));
        _emailField.addTextChangedListener(new om(this, viewgroup));
        bundle = new HashSet();
        Account aaccount[] = AccountManager.get(getActivity()).getAccounts();
        ArrayList arraylist = new ArrayList();
        int j1 = aaccount.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            Account account = aaccount[i1];
            if (account.name.matches(viewgroup.getString(0x7f0901e9)) && !account.type.contains("MOTHER_USER_CREDS_TYPE") && bundle.add(account.name.toLowerCase()))
            {
                arraylist.add(account.name);
            }
        }

        x = new com.kik.view.adapters.v(getActivity(), arraylist);
        _emailField.setAdapter(x);
        _emailField.setThreshold(1);
        _emailField.setOnFocusChangeListener(new on(this));
        x.registerDataSetObserver(new op(this));
        bundle = (TextView)layoutinflater.findViewById(0x7f0e0068);
        bundle.setText(Html.fromHtml(viewgroup.getString(0x7f090103, new Object[] {
            (new bg(getActivity())).a()
        })));
        bundle.setVisibility(0);
        Linkify.addLinks(bundle, 15);
        bundle.setMovementMethod(LinkMovementMethod.getInstance());
        f.o();
        viewgroup = i.a("com.kik.android.registerSharedPrefs");
        _firstnameField.setText(viewgroup.getString("firstNameRegister", null));
        _lastnameField.setText(viewgroup.getString("lastNameRegister", null));
        _usernameField.setText(viewgroup.getString("userNameRegister", null));
        _emailField.setText(viewgroup.getString("emailRegister", null));
        if (viewgroup.contains("birthdayRegister"))
        {
            z.setTimeInMillis(viewgroup.getLong("birthdayRegister", B.getTime()));
            b();
        }
        if (kik.android.util.p.a().f())
        {
            _profPic.setBackgroundDrawable(kik.android.util.p.a().d());
        }
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        a();
        ButterKnife.reset(this);
    }

    public void onPause()
    {
        super.onPause();
        android.content.SharedPreferences.Editor editor = i.a("com.kik.android.registerSharedPrefs").edit();
        editor.putString("firstNameRegister", _firstnameField.getText().toString());
        editor.putString("lastNameRegister", _lastnameField.getText().toString());
        editor.putString("userNameRegister", _usernameField.getText().toString());
        editor.putString("emailRegister", _emailField.getText().toString());
        if (!cq.c(_birthdayField.getText().toString()) && !DateUtils.isToday(z.getTimeInMillis()))
        {
            editor.putLong("birthdayRegister", z.getTimeInMillis());
        }
        editor.commit();
    }
}
