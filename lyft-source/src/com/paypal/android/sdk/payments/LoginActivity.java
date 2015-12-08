// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import com.paypal.android.sdk.R;
import com.paypal.android.sdk.bE;
import com.paypal.android.sdk.bM;
import com.paypal.android.sdk.bQ;
import com.paypal.android.sdk.bS;
import com.paypal.android.sdk.bk;
import com.paypal.android.sdk.bn;
import com.paypal.android.sdk.bq;
import com.paypal.android.sdk.bs;
import com.paypal.android.sdk.cp;
import com.paypal.android.sdk.cq;
import com.paypal.android.sdk.cs;
import com.paypal.android.sdk.cu;
import com.paypal.android.sdk.cv;
import com.paypal.android.sdk.cw;
import com.paypal.android.sdk.cx;
import com.paypal.android.sdk.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.paypal.android.sdk.payments:
//            O, af, PayPalService, aB, 
//            d, D, X, L, 
//            ae, J, K, aN, 
//            M, PayPalConfiguration, I, V, 
//            Y, Z, aa, ab, 
//            ac, ad, Q, R, 
//            S, T, U, W

public final class LoginActivity extends Activity
{

    private final String a = com/paypal/android/sdk/payments/LoginActivity.getSimpleName();
    private af b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private bM i;
    private String j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;
    private cv p;
    private boolean q;
    private PayPalService r;
    private final ServiceConnection s = new O(this);

    public LoginActivity()
    {
    }

    static int a(LoginActivity loginactivity, int i1)
    {
        loginactivity.o = i1;
        return i1;
    }

    private bM a(af af1)
    {
        g();
        if (af1 == af.b)
        {
            af1 = bk.a();
            if (f == null)
            {
                af1 = new bS(af1, e);
            } else
            {
                af1 = new bS(af1, new f(f), e);
            }
            return new bM(af1, g);
        }
        if (af1 == af.a)
        {
            return new bM(c, d);
        } else
        {
            return i;
        }
    }

    static PayPalService a(LoginActivity loginactivity, PayPalService paypalservice)
    {
        loginactivity.r = paypalservice;
        return paypalservice;
    }

    static void a(Activity activity, int i1, bq bq1, boolean flag, boolean flag1, String s1, PayPalConfiguration paypalconfiguration)
    {
        bq1 = new Intent(activity, com/paypal/android/sdk/payments/LoginActivity);
        bq1.putExtras(activity.getIntent());
        bq1.putExtra("com.paypal.android.sdk.payments.persistedLogin", null);
        bq1.putExtra("com.paypal.android.sdk.payments.useResponseTypeCode", true);
        bq1.putExtra("com.paypal.android.sdk.payments.forceLogin", false);
        bq1.putExtra("com.paypal.android.sdk.payments.requestedScopes", s1);
        bq1.putExtra("com.paypal.android.sdk.paypalConfiguration", paypalconfiguration);
        activity.startActivityForResult(bq1, 1);
    }

    static void a(LoginActivity loginactivity)
    {
        loginactivity.h();
    }

    static void a(LoginActivity loginactivity, View view)
    {
        view = loginactivity.a(loginactivity.b);
        if (loginactivity.b == af.b)
        {
            loginactivity.i = new bM(view.d(), null);
            loginactivity.b(af.d);
        } else
        {
            loginactivity.i = new bM(view.b(), null);
            loginactivity.b(af.c);
        }
        loginactivity.r.a(view, loginactivity.l, loginactivity.b(), loginactivity.c(), loginactivity.j);
    }

    static void a(LoginActivity loginactivity, aB ab1)
    {
        if (ab1.b())
        {
            loginactivity.d();
            return;
        }
        boolean flag;
        if (ab1.a() && ab1.b.equals("invalid_user"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            loginactivity.o();
            com.paypal.android.sdk.payments.d.a(loginactivity, cq.a(cs.br), 3);
            return;
        }
        if (ab1.c())
        {
            loginactivity.o();
            com.paypal.android.sdk.payments.d.a(loginactivity, cq.a(ab1.b), 3);
            return;
        }
        if ("invalid_nonce".equals(ab1.b))
        {
            loginactivity.h = null;
            loginactivity.o();
            com.paypal.android.sdk.payments.d.a(loginactivity, cq.a(cs.aK), 5);
            return;
        } else
        {
            loginactivity.h = null;
            loginactivity.o();
            com.paypal.android.sdk.payments.d.a(loginactivity, cq.a(ab1.b), 4);
            return;
        }
    }

    static void a(LoginActivity loginactivity, af af1)
    {
        loginactivity.b(af1);
    }

    static void a(LoginActivity loginactivity, String s1)
    {
        loginactivity.d = null;
        loginactivity.g = null;
        loginactivity.o();
        com.paypal.android.sdk.payments.d.a(loginactivity, cq.a(s1), 1);
    }

    private String b()
    {
        if (c())
        {
            return "code";
        } else
        {
            return "token";
        }
    }

    static void b(LoginActivity loginactivity)
    {
        loginactivity.i();
    }

    static void b(LoginActivity loginactivity, View view)
    {
        loginactivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(D.a())));
        loginactivity.r.a(cp.i, Boolean.valueOf(loginactivity.l));
    }

    static void b(LoginActivity loginactivity, String s1)
    {
        loginactivity.o();
        if ("invalid_nonce".equals(s1))
        {
            com.paypal.android.sdk.payments.d.a(loginactivity, cq.a(cs.aK), 5);
            return;
        } else
        {
            com.paypal.android.sdk.payments.d.a(loginactivity, cq.a(s1), 2);
            return;
        }
    }

    private void b(af af1)
    {
        (new StringBuilder("changeLoginState:")).append(af1);
        if (af1 != null)
        {
            b = af1;
        } else
        {
            (new StringBuilder("null loginState, refreshing:")).append(b);
        }
        try
        {
            dismissDialog(20);
            dismissDialog(21);
        }
        // Misplaced declaration of an exception variable
        catch (af af1) { }
        X.a[b.ordinal()];
        JVM INSTR tableswitch 1 13: default 112
    //                   1 252
    //                   2 302
    //                   3 406
    //                   4 488
    //                   5 671
    //                   6 178
    //                   7 215
    //                   8 258
    //                   9 308
    //                   10 330
    //                   11 494
    //                   12 568
    //                   13 677;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
        break; /* Loop/switch isn't completed */
_L14:
        break MISSING_BLOCK_LABEL_677;
_L15:
        switch (X.a[b.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            r.a(new ae(this));
            return;

        case 3: // '\003'
        case 4: // '\004'
            r.a(new J(this));
            return;

        case 5: // '\005'
            r.a(new K(this));
            break;
        }
        break MISSING_BLOCK_LABEL_798;
_L7:
        j();
        m();
        p.b.setEnabled(true);
        p.d.setEnabled(true);
        h();
          goto _L15
_L8:
        j();
        n();
        p.b.setEnabled(true);
        p.d.setEnabled(true);
        h();
          goto _L15
_L2:
        showDialog(20);
_L9:
        j();
        m();
        p.b.setEnabled(false);
        p.d.setEnabled(false);
        p.h.setEnabled(false);
          goto _L15
_L3:
        showDialog(20);
_L10:
        j();
        n();
        p.h.setEnabled(false);
          goto _L15
_L11:
        l();
        k();
        p.o.c.setText(cq.a(cs.aX));
        p.l.setEnabled(false);
        p.l.setVisibility(8);
        p.m.setEnabled(false);
        p.m.setVisibility(8);
          goto _L15
_L4:
        showDialog(21);
        l();
        k();
        p.o.c.setText(cq.a(cs.aY));
        p.l.setEnabled(false);
        p.l.setVisibility(8);
        p.m.setEnabled(false);
        p.m.setVisibility(8);
          goto _L15
_L5:
        showDialog(21);
_L12:
        l();
        k();
        p.o.c.setText(cq.a(cs.aY));
        p.l.setEnabled(false);
        p.l.setVisibility(0);
        p.m.setEnabled(false);
        p.m.setVisibility(0);
          goto _L15
_L13:
        l();
        k();
        p.o.c.setText(cq.a(cs.aY));
        p.l.setEnabled(true);
        p.l.setVisibility(0);
        af1 = p.l;
        af1.requestFocus();
        (new Handler()).postDelayed(new L(this, af1), 200L);
        p.m.setVisibility(0);
        i();
          goto _L15
_L6:
        showDialog(20);
        l();
        k();
        p.o.c.setText(cq.a(cs.aY));
        p.l.setEnabled(false);
        p.l.setVisibility(0);
        p.m.setEnabled(false);
        p.m.setVisibility(0);
          goto _L15
    }

    static void c(LoginActivity loginactivity)
    {
        loginactivity.e();
    }

    static void c(LoginActivity loginactivity, View view)
    {
        loginactivity.g();
        boolean flag;
        if (loginactivity.b == af.b)
        {
            loginactivity.b(af.a);
        } else
        {
            loginactivity.b(af.b);
        }
        loginactivity.f();
        view = loginactivity.p;
        if (loginactivity.b == af.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.a(flag);
    }

    private boolean c()
    {
        return getIntent().getBooleanExtra("com.paypal.android.sdk.payments.useResponseTypeCode", false);
    }

    private void d()
    {
        if (r.d().g.a.isEmpty())
        {
            o();
            com.paypal.android.sdk.payments.d.a(this, cq.a(cs.aZ), 10);
            return;
        } else
        {
            b(af.g);
            return;
        }
    }

    static void d(LoginActivity loginactivity)
    {
        loginactivity.d();
    }

    static void d(LoginActivity loginactivity, View view)
    {
        loginactivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aN.a())));
        loginactivity.r.a(cp.h, Boolean.valueOf(loginactivity.l));
    }

    static cv e(LoginActivity loginactivity)
    {
        return loginactivity.p;
    }

    private void e()
    {
        setResult(-1);
        finish();
    }

    static void e(LoginActivity loginactivity, View view)
    {
        if (loginactivity.b == af.j)
        {
            loginactivity.b(af.i);
        } else
        {
            loginactivity.b(af.h);
        }
        loginactivity.p.l.setText("");
        loginactivity.r.a(loginactivity.o);
    }

    static PayPalService f(LoginActivity loginactivity)
    {
        return loginactivity.r;
    }

    private void f()
    {
        com.paypal.android.sdk.payments.d.a(p.c.b, r.f());
        b(((af) (null)));
    }

    static void f(LoginActivity loginactivity, View view)
    {
        loginactivity.b(af.k);
        loginactivity.r.a(loginactivity.a(loginactivity.b), loginactivity.p.l.getText().toString(), loginactivity.l, loginactivity.b(), loginactivity.c(), loginactivity.j);
    }

    private void g()
    {
        if (b == af.b)
        {
            e = p.b.getText().toString();
            g = p.d.getText().toString();
            return;
        } else
        {
            c = p.b.getText().toString();
            d = p.d.getText().toString();
            return;
        }
    }

    static void g(LoginActivity loginactivity)
    {
        switch (X.a[loginactivity.b.ordinal()])
        {
        case 10: // '\n'
        case 12: // '\f'
        default:
            (new StringBuilder()).append(loginactivity.b).append(" case not handled");
            return;

        case 8: // '\b'
            loginactivity.b(af.a);
            return;

        case 9: // '\t'
            loginactivity.b(af.b);
            return;

        case 13: // '\r'
            loginactivity.b(af.j);
            return;

        case 11: // '\013'
            loginactivity.b(af.j);
            return;
        }
    }

    private void h()
    {
        String s1;
        String s2;
        boolean flag;
        flag = true;
        s1 = p.b.getText().toString();
        s2 = p.d.getText().toString();
        if (b != af.b) goto _L2; else goto _L1
_L1:
        if (!bQ.d(s1) || !bQ.b(s2))
        {
            flag = false;
        }
_L4:
        p.h.setEnabled(flag);
        p.h.setFocusable(flag);
        return;
_L2:
        if (!bQ.a(s1) || !bQ.c(s2))
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void h(LoginActivity loginactivity)
    {
        if (loginactivity.i.a())
        {
            loginactivity.b(af.a);
            return;
        } else
        {
            loginactivity.b(af.b);
            return;
        }
    }

    private void i()
    {
        boolean flag;
        if (6 == p.l.getText().toString().length())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.m.setEnabled(flag);
    }

    private void j()
    {
        p.o.a.setVisibility(8);
        p.k.setEnabled(false);
        p.k.setVisibility(8);
        p.o.c.setVisibility(8);
        p.m.setEnabled(false);
        p.m.setVisibility(8);
        p.l.setEnabled(false);
        p.l.setVisibility(8);
    }

    private void k()
    {
        com.paypal.android.sdk.payments.d.a(this, null, cs.aS);
        p.k.setEnabled(true);
        p.k.setVisibility(0);
        (new StringBuilder("phone numbers: ")).append(r.d().g.a);
        ArrayList arraylist = new ArrayList(r.d().g.a.values());
        p.o.a((String)arraylist.get(o));
        p.o.a.setVisibility(0);
        if (arraylist.size() > 1)
        {
            p.o.a(true);
            cw cw1 = new cw(this, arraylist, o);
            (new ListView(this)).setAdapter(cw1);
            p.o.b.setOnClickListener(new M(this, cw1, arraylist));
        } else
        {
            p.o.a(false);
        }
        p.o.c.setVisibility(0);
    }

    private void l()
    {
        p.h.setEnabled(false);
        p.h.setVisibility(8);
        p.b.setEnabled(false);
        p.b.setVisibility(8);
        p.d.setEnabled(false);
        p.d.setVisibility(8);
        p.e.setEnabled(false);
        p.e.setVisibility(8);
    }

    private void m()
    {
        com.paypal.android.sdk.payments.d.a(this, null, cs.ap);
        p.b.setVisibility(0);
        p.b.setText(c);
        p.b.setHint(cq.a(cs.ad));
        p.b.setInputType(33);
        p.d.setVisibility(0);
        p.d.setText(d);
        p.d.setHint(cq.a(cs.at));
        p.d.setInputType(129);
        if (p.b.getText().length() > 0 && p.d.getText().length() == 0)
        {
            p.d.requestFocus();
        }
        p.h.setVisibility(0);
        p.e.setVisibility(0);
        p.f.setVisibility(0);
        p.g.setVisibility(0);
        p.j.setText(cq.a(cs.bn));
    }

    private void n()
    {
        com.paypal.android.sdk.payments.d.a(this, null, cs.ap);
        p.b.setVisibility(0);
        p.b.setText(e);
        p.b.setHint(cq.a(cs.az));
        p.b.setInputType(3);
        p.d.setVisibility(0);
        p.d.setText(g);
        p.d.setHint(cq.a(cs.aA));
        EditText edittext = p.d;
        byte byte0;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            byte0 = 2;
        } else
        {
            byte0 = 18;
        }
        edittext.setInputType(byte0);
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            edittext.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (p.b.getText().length() > 0 && p.d.getText().length() == 0)
        {
            p.d.requestFocus();
        }
        p.h.setVisibility(0);
        p.e.setVisibility(0);
        p.f.setVisibility(0);
        p.g.setVisibility(4);
        p.j.setText(cq.a(cs.bm));
    }

    private void o()
    {
        switch (X.a[b.ordinal()])
        {
        default:
            (new StringBuilder()).append(b).append(" case not handled");
            return;

        case 1: // '\001'
            b(af.e);
            return;

        case 2: // '\002'
            b(com.paypal.android.sdk.payments.af.f);
            return;

        case 5: // '\005'
            b(af.m);
            return;

        case 3: // '\003'
        case 4: // '\004'
            b(af.l);
            return;
        }
    }

    final void a()
    {
        boolean flag;
        flag = true;
        PayPalConfiguration paypalconfiguration = r.e();
        if (cq.a)
        {
            p.d.setGravity(5);
            p.b.setGravity(5);
            p.l.setGravity(5);
        }
        if (!bQ.f(Locale.getDefault().getCountry().toLowerCase(Locale.US)) || !r.d().i)
        {
            p.j.setVisibility(4);
        }
        if (m)
        {
            m = false;
            c = paypalconfiguration.c();
            String s1 = paypalconfiguration.d();
            if (s1 != null)
            {
                e = s1;
            }
            s1 = paypalconfiguration.e();
            if (s1 != null)
            {
                f = s1;
            }
            if (paypalconfiguration.f() && !paypalconfiguration.b().equals("live"))
            {
                d = paypalconfiguration.g();
                g = paypalconfiguration.h();
            }
        }
        if (getIntent().getBooleanExtra("com.paypal.android.sdk.payments.forceLogin", false) && !n)
        {
            n = true;
            r.i();
        }
        if (r.k()) goto _L2; else goto _L1
_L1:
        if (!k)
        {
            k = true;
            r.a(cp.e, Boolean.valueOf(l));
        }
        if (b != null) goto _L4; else goto _L3
_L3:
        bq bq1 = (bq)getIntent().getParcelableExtra("com.paypal.android.sdk.payments.persistedLogin");
        if (bq1 == null) goto _L6; else goto _L5
_L5:
        l = true;
        if (R.a(c))
        {
            if (R.a(bq1.b()))
            {
                flag = false;
            }
            if (flag)
            {
                c = bq1.b();
            }
        }
        if (e == null && bq1.a() != null)
        {
            e = bq1.a().a(bk.a());
        }
        X.b[bq1.c().ordinal()];
        JVM INSTR tableswitch 1 2: default 368
    //                   1 378
    //                   2 388;
           goto _L4 _L7 _L8
_L4:
        f();
        return;
_L7:
        b(af.a);
        continue; /* Loop/switch isn't completed */
_L8:
        b(af.b);
        continue; /* Loop/switch isn't completed */
_L6:
        b(af.a);
        if (true) goto _L4; else goto _L2
_L2:
        e();
        return;
    }

    public final void onBackPressed()
    {
        r.a(cp.j, Boolean.valueOf(l));
        super.onBackPressed();
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        (new StringBuilder()).append(getClass().getSimpleName()).append(".onCreate");
        j = getIntent().getExtras().getString("com.paypal.android.sdk.payments.requestedScopes");
        q = bindService(com.paypal.android.sdk.payments.d.a(this), s, 1);
        R.b(this);
        R.a(this);
        p = new cv(this);
        setContentView(p.a);
        p.f.setText(cq.a(cs.aN));
        p.g.setText(cq.a(cs.ai));
        p.i.setText(cq.a(cs.ao));
        p.i.setHint(cq.a(cs.ao));
        p.k.setText(cq.a(cs.aT));
        p.l.setHint(cq.a(cs.aV));
        p.n.setText(cq.a(cs.ao));
        p.o.b(cq.a(cs.aW));
        I i1 = new I(this);
        p.b.addTextChangedListener(i1);
        p.d.addTextChangedListener(i1);
        p.h.setOnClickListener(new V(this));
        p.g.setOnClickListener(new Y(this));
        p.j.setOnClickListener(new Z(this));
        p.f.setOnClickListener(new aa(this));
        p.o.c.setOnClickListener(new ab(this));
        p.l.addTextChangedListener(new ac(this));
        p.m.setOnClickListener(new ad(this));
        if (bundle == null)
        {
            k = false;
            m = true;
        } else
        {
            m = false;
            k = bundle.getBoolean("PP_PageTrackingSent");
            b = (af)bundle.getParcelable("PP_LoginType");
            c = bundle.getString("PP_SavedEmail");
            e = bundle.getString("PP_SavedPhone");
            f = bundle.getString("PP_savedPhoneCountryCode");
            d = bundle.getString("PP_SavedPassword");
            g = bundle.getString("PP_SavedPIN");
            l = bundle.getBoolean("PP_IsReturningUser");
            n = bundle.getBoolean("PP_IsClearedLogin");
            j = bundle.getString("PP_RequestedScopes");
            h = bundle.getString("PP_SavedOTP");
            i = (bM)bundle.getParcelable("PP_OriginalLoginData");
            o = bundle.getInt("PP_TwoFaSelectedPhoneNumberIndex");
        }
        p.l.setText(h);
    }

    protected final Dialog onCreateDialog(int i1, Bundle bundle)
    {
        switch (i1)
        {
        default:
            return null;

        case 1: // '\001'
            return com.paypal.android.sdk.payments.d.a(this, cs.bl, bundle, new Q(this));

        case 2: // '\002'
            return com.paypal.android.sdk.payments.d.a(this, cs.bg, bundle, new com.paypal.android.sdk.payments.R(this));

        case 3: // '\003'
            return com.paypal.android.sdk.payments.d.a(this, cs.bl, bundle, new S(this));

        case 4: // '\004'
            return com.paypal.android.sdk.payments.d.a(this, cs.bl, bundle, new T(this));

        case 5: // '\005'
            return com.paypal.android.sdk.payments.d.a(this, cs.aL, bundle, new U(this));

        case 10: // '\n'
            return com.paypal.android.sdk.payments.d.a(this, cs.bl, bundle, new W(this));

        case 20: // '\024'
            return com.paypal.android.sdk.payments.d.a(this, cs.c, cs.bo);

        case 21: // '\025'
            return com.paypal.android.sdk.payments.d.a(this, cs.aU, cs.bo);
        }
    }

    protected final void onDestroy()
    {
        (new StringBuilder()).append(getClass().getSimpleName()).append(".onDestroy");
        if (r != null)
        {
            r.n();
        }
        if (q)
        {
            unbindService(s);
            q = false;
        }
        super.onDestroy();
    }

    protected final void onResume()
    {
        super.onResume();
        (new StringBuilder()).append(getClass().getSimpleName()).append(".onResume");
        if (r != null)
        {
            f();
        }
    }

    protected final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        g();
        bundle.putParcelable("PP_LoginType", b);
        bundle.putString("PP_SavedEmail", c);
        bundle.putString("PP_SavedPhone", e);
        bundle.putString("PP_savedPhoneCountryCode", f);
        bundle.putString("PP_SavedPassword", d);
        bundle.putString("PP_SavedPIN", g);
        bundle.putBoolean("PP_IsReturningUser", l);
        bundle.putBoolean("PP_PageTrackingSent", k);
        bundle.putBoolean("PP_IsClearedLogin", n);
        bundle.putString("PP_RequestedScopes", j);
        bundle.putString("PP_SavedOTP", h);
        bundle.putParcelable("PP_OriginalLoginData", i);
        bundle.putInt("PP_TwoFaSelectedPhoneNumberIndex", o);
    }
}
