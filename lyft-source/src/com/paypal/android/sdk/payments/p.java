// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.BulletSpan;
import android.text.style.URLSpan;
import android.util.Log;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.paypal.android.sdk.L;
import com.paypal.android.sdk.O;
import com.paypal.android.sdk.P;
import com.paypal.android.sdk.Q;
import com.paypal.android.sdk.R;
import com.paypal.android.sdk.ar;
import com.paypal.android.sdk.b;
import com.paypal.android.sdk.bn;
import com.paypal.android.sdk.bz;
import com.paypal.android.sdk.cc;
import com.paypal.android.sdk.cp;
import com.paypal.android.sdk.cq;
import com.paypal.android.sdk.cs;
import com.paypal.android.sdk.ct;
import com.paypal.android.sdk.cu;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.paypal.android.sdk.payments:
//            r, x, aO, s, 
//            b, FuturePaymentInfoActivity, q, PayPalService, 
//            m, aL, t, u, 
//            d, v, n, PayPalConfiguration, 
//            PayPalOAuthScopes, LoginActivity, F, z, 
//            A, B, PayPalAuthorization, o, 
//            e, w

abstract class p extends Activity
{

    private static final String d = com/paypal/android/sdk/payments/p.getSimpleName();
    private static final Map l = new r();
    protected PayPalService a;
    protected PayPalOAuthScopes b;
    protected ct c;
    private boolean e;
    private m f;
    private boolean g;
    private boolean h;
    private boolean i;
    private aL j;
    private final ServiceConnection k = new x(this);

    p()
    {
    }

    private void a(int i1, PayPalAuthorization paypalauthorization)
    {
        Intent intent = new Intent();
        intent.putExtra("com.paypal.android.sdk.authorization", paypalauthorization);
        setResult(i1, intent);
    }

    private void a(int i1, String s1, String s2, F f1)
    {
        s1 = new SpannableString(Html.fromHtml((new StringBuilder()).append(s2).append(s1).toString()));
        if (f1 != null)
        {
            a(((SpannableString) (s1)), f1);
        } else
        {
            a(((SpannableString) (s1)));
        }
        s1.setSpan(new BulletSpan(15), 0, s1.length(), 0);
        c.c[i1].setVisibility(0);
        c.c[i1].setFocusable(true);
        c.c[i1].setNextFocusLeftId((i1 + 100) - 1);
        c.c[i1].setNextFocusRightId(i1 + 100 + 1);
        c.c[i1].setText(s1);
    }

    private void a(SpannableString spannablestring)
    {
        int i1 = 0;
        URLSpan aurlspan[] = (URLSpan[])spannablestring.getSpans(0, spannablestring.length(), android/text/style/URLSpan);
        for (int j1 = aurlspan.length; i1 < j1; i1++)
        {
            URLSpan urlspan = aurlspan[i1];
            spannablestring.setSpan(new aO(urlspan, new s(this)), spannablestring.getSpanStart(urlspan), spannablestring.getSpanEnd(urlspan), 33);
            spannablestring.removeSpan(urlspan);
        }

    }

    private void a(SpannableString spannablestring, F f1)
    {
        URLSpan aurlspan[] = (URLSpan[])spannablestring.getSpans(0, spannablestring.length(), android/text/style/URLSpan);
        int j1 = aurlspan.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            URLSpan urlspan = aurlspan[i1];
            spannablestring.setSpan(new com.paypal.android.sdk.payments.b(urlspan, this, com/paypal/android/sdk/payments/FuturePaymentInfoActivity, new q(this), f1), spannablestring.getSpanStart(urlspan), spannablestring.getSpanEnd(urlspan), 33);
            spannablestring.removeSpan(urlspan);
        }

    }

    private void a(m m1)
    {
        a.d().j = m1.a;
        a.d().f = m1.b;
        a.d().d = m1.c;
        j();
    }

    static void a(p p1)
    {
        p1.k();
    }

    static void a(p p1, cc cc)
    {
        p1.j = new aL(cc);
        p1.getIntent().putExtra("com.paypal.android.sdk.payments.ppAppInfo", p1.j);
        p1.f();
        p1.k();
    }

    static void a(p p1, cp cp1)
    {
        p1.a.a(cp1);
    }

    static String b()
    {
        return d;
    }

    private void b(SpannableString spannablestring)
    {
        int i1 = 0;
        URLSpan aurlspan[] = (URLSpan[])spannablestring.getSpans(0, spannablestring.length(), android/text/style/URLSpan);
        for (int j1 = aurlspan.length; i1 < j1; i1++)
        {
            URLSpan urlspan = aurlspan[i1];
            spannablestring.setSpan(new aO(urlspan, new t(this)), spannablestring.getSpanStart(urlspan), spannablestring.getSpanEnd(urlspan), 33);
            spannablestring.removeSpan(urlspan);
        }

    }

    static void b(p p1)
    {
        p1.i();
    }

    private void c()
    {
label0:
        {
            if (a != null)
            {
                showDialog(2);
                if (a.j())
                {
                    break label0;
                }
                (new StringBuilder("token is expired, get new one. AccessToken: ")).append(a.d().c);
                a.a(new u(this), true);
            }
            return;
        }
        a.p();
    }

    static void c(p p1)
    {
        p1.e();
    }

    private void d()
    {
        e = bindService(com.paypal.android.sdk.payments.d.a(this), k, 1);
    }

    static void d(p p1)
    {
        (new StringBuilder()).append(d).append(".postBindSetup()");
        (new StringBuilder()).append(d).append(".startLoginIfNeeded (access token: ").append(p1.a.d().h).append(")");
        ct ct1;
        boolean flag;
        if (!p1.a.k() && !p1.h)
        {
            (new StringBuilder()).append(d).append(" -- doing the login...");
            p1.h = true;
            p1.e();
            flag = true;
        } else
        {
            flag = false;
        }
        ct1 = p1.c;
        if (p1.i)
        {
            p1.i = false;
            p1.j();
        }
        if (!p1.g)
        {
            p1.g = true;
            p1.a.a(cp.k);
        }
        com.paypal.android.sdk.payments.d.a(ct1.f.b, p1.a.f());
        p1.a.b(new v(p1));
        p1.f();
        if (!flag && p1.j == null)
        {
            p1.c();
        }
    }

    private void e()
    {
        (new StringBuilder()).append(d).append(".doLogin");
        if (n.a(this, a))
        {
            Intent intent = (new O()).a(a.e().j(), P.a, Q.a, a.c().d().e());
            (new StringBuilder("startActivityForResult(")).append(intent).append(", 2").append(")");
            Log.w("paypal.sdk", "requesting code with scope=null from Authenticator.");
            startActivityForResult(intent, 2);
            return;
        } else
        {
            LoginActivity.a(this, 1, null, true, false, b.b(), a.e());
            return;
        }
    }

    static void e(p p1)
    {
        p1.a.a(cp.m);
        p1.finish();
    }

    private void f()
    {
        if (b != null && j != null && a != null)
        {
            Object obj = a.e().k();
            if (j.d() != null)
            {
                obj = j.d();
            }
            String s2 = a.e().l().toString();
            if (j.b() != null)
            {
                s2 = j.b();
            }
            String s3 = a.e().m().toString();
            if (j.c() != null)
            {
                s3 = j.c();
            }
            Object obj1 = String.format(cq.a(cs.U), new Object[] {
                (new StringBuilder("<b>")).append(((String) (obj))).append("</b>").toString()
            });
            String s1;
            int i1;
            int j1;
            int k1;
            if (cq.a)
            {
                s1 = "\u200F";
            } else
            {
                s1 = "";
            }
            c.c[0].setText(Html.fromHtml((new StringBuilder()).append(s1).append(((String) (obj1))).toString()));
            if (cq.a)
            {
                c.c[0].setGravity(5);
            }
            c.c[0].setVisibility(0);
            obj1 = b.a();
            if (((List) (obj1)).contains(L.a.a()) || ((List) (obj1)).contains(L.i.a()) || ((List) (obj1)).contains(L.j.a()))
            {
                a(1, String.format(cq.a(cs.X), new Object[] {
                    "future-payment-consent", (new StringBuilder("<b>")).append(((String) (obj))).append("</b>").toString(), (new StringBuilder("<b>")).append(((String) (obj))).append("</b>").toString()
                }), s1, F.a);
                j1 = 2;
            } else
            {
                j1 = 1;
            }
            i1 = j1;
            if (((List) (obj1)).contains(L.h.a()))
            {
                a(j1, cq.a(cs.W), s1, null);
                i1 = j1 + 1;
            }
            j1 = i1;
            if (((List) (obj1)).contains(L.k.a()))
            {
                a(i1, cq.a(cs.V), s1, com.paypal.android.sdk.payments.F.b);
                j1 = i1 + 1;
            }
            i1 = j1;
            if (((List) (obj1)).contains(L.l.a()))
            {
                a(j1, cq.a(cs.ab), s1, F.c);
                i1 = j1 + 1;
            }
            j1 = i1;
            if (((List) (obj1)).contains(L.m.a()))
            {
                a(i1, cq.a(cs.aa), s1, F.d);
                j1 = i1 + 1;
            }
            i1 = j1;
            if (((List) (obj1)).contains(L.n.a()))
            {
                a(j1, cq.a(cs.Y), s1, null);
                i1 = j1 + 1;
            }
            k1 = i1;
            if (!Collections.disjoint(((Collection) (obj1)), L.o))
            {
                if (g().size() > 0)
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                k1 = i1;
                if (j1 != 0)
                {
                    a(i1, String.format(cq.a(cs.T), new Object[] {
                        h()
                    }), s1, null);
                    k1 = i1 + 1;
                }
            }
            a(k1, String.format(cq.a(cs.Z), new Object[] {
                (new StringBuilder("<b>")).append(((String) (obj))).append("</b>").toString(), s2, s3
            }), s1, null);
            c.c[k1].setNextFocusRightId(2);
            s3 = cq.a(cs.aC);
            s2 = Locale.getDefault().getCountry().toLowerCase(Locale.US);
            obj = s2;
            if (R.b(s2))
            {
                obj = "us";
            }
            obj = String.format(s3, new Object[] {
                String.format("https://www.paypal.com/%s/cgi-bin/webscr?cmd=p/gen/ua/policy_privacy-outside", new Object[] {
                    obj
                })
            });
            obj = new SpannableString(Html.fromHtml((new StringBuilder()).append(s1).append(((String) (obj))).toString()));
            b(((SpannableString) (obj)));
            c.d.setText(((CharSequence) (obj)));
            c.d.setMovementMethod(LinkMovementMethod.getInstance());
            c.d.setNextFocusLeftId((k1 + 1 + 100) - 1);
            c.d.setNextFocusRightId(1);
            obj = R.b(a.e().a());
            if (obj != null)
            {
                c.e.setText(((CharSequence) (obj)));
                c.e.setVisibility(0);
            }
            c.i.setText(cq.a(cs.F));
            c.g.setOnClickListener(new z(this));
            c.h.setOnClickListener(new A(this));
            c.h.setEnabled(true);
            if (f != null)
            {
                a(f);
                f = null;
                return;
            }
        }
    }

    static void f(p p1)
    {
        p1.a.a(cp.l);
        if (!p1.a.l() || !p1.a.j())
        {
            com.paypal.android.sdk.payments.d.a(p1, cq.a(cs.aK), 4);
            return;
        } else
        {
            p1.showDialog(2);
            p1.a.a(p1.b.a());
            return;
        }
    }

    private Set g()
    {
        List list = b.a();
        LinkedHashSet linkedhashset = new LinkedHashSet();
        B ab[] = B.values();
        int j1 = ab.length;
        int i1 = 0;
        do
        {
            while (i1 < j1) 
            {
                Object obj = ab[i1];
                if (j.a().contains(((B) (obj)).name()) && list.contains(((L)l.get(obj)).a()))
                {
                    if (obj == B.a)
                    {
                        obj = null;
                    } else
                    if (obj == B.k)
                    {
                        obj = cq.a(cs.G);
                    } else
                    if (obj == B.i)
                    {
                        obj = cq.a(cs.H);
                    } else
                    if (obj == B.j)
                    {
                        obj = cq.a(cs.I);
                    } else
                    if (obj == B.m || obj == B.n || obj == B.o || obj == B.p || obj == B.q || obj == B.r)
                    {
                        obj = cq.a(cs.J);
                    } else
                    if (obj == B.h)
                    {
                        obj = cq.a(cs.K);
                    } else
                    if (obj == B.d)
                    {
                        obj = cq.a(cs.L);
                    } else
                    if (obj == B.l)
                    {
                        obj = cq.a(cs.M);
                    } else
                    if (obj == com.paypal.android.sdk.payments.B.b)
                    {
                        obj = cq.a(cs.N);
                    } else
                    if (obj == B.c)
                    {
                        obj = cq.a(cs.O);
                    } else
                    if (obj == B.g)
                    {
                        obj = cq.a(cs.P);
                    } else
                    if (obj == B.f)
                    {
                        obj = cq.a(cs.Q);
                    } else
                    if (obj == B.s)
                    {
                        obj = cq.a(cs.R);
                    } else
                    if (obj == B.e)
                    {
                        obj = cq.a(cs.S);
                    } else
                    {
                        obj = ((B) (obj)).name();
                    }
                    if (obj != null)
                    {
                        linkedhashset.add(obj);
                    }
                }
                i1++;
            }
            return linkedhashset;
        } while (true);
    }

    private String h()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = g().iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            String s1 = (String)iterator.next();
            if (!flag)
            {
                stringbuilder.append(", ");
            } else
            {
                flag = false;
            }
            stringbuilder.append(s1);
        }
        return stringbuilder.toString();
    }

    private void i()
    {
        a(-1, new PayPalAuthorization(a.f(), a.d().f.b(), a.d().d));
        finish();
    }

    private void j()
    {
        String s1 = a.d().f.a();
        if (s1 != null && Arrays.asList(s1.split(" ")).containsAll(b.a()))
        {
            i();
            return;
        } else
        {
            c();
            return;
        }
    }

    private void k()
    {
        try
        {
            dismissDialog(2);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            return;
        }
    }

    protected abstract void a();

    public void finish()
    {
        super.finish();
        (new StringBuilder()).append(d).append(".finish");
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        (new StringBuilder()).append(d).append(".onActivityResult(").append(i1).append(",").append(j1).append(",").append(intent).append(")");
        switch (i1)
        {
        default:
            Log.e(d, (new StringBuilder("unhandled requestCode ")).append(i1).toString());
            return;

        case 1: // '\001'
            if (j1 == -1)
            {
                if (a == null)
                {
                    i = true;
                    return;
                } else
                {
                    j();
                    return;
                }
            } else
            {
                a(j1, ((PayPalAuthorization) (null)));
                finish();
                return;
            }

        case 2: // '\002'
            break;
        }
        if (j1 == -1)
        {
            intent = o.a(intent.getExtras());
            if (a == null)
            {
                f = intent;
                return;
            } else
            {
                a(intent);
                return;
            }
        } else
        {
            a(j1, ((PayPalAuthorization) (null)));
            finish();
            return;
        }
    }

    public void onBackPressed()
    {
        a.a(cp.m);
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        (new StringBuilder()).append(d).append(".onCreate");
        if (bundle == null)
        {
            bundle = getClass().getName();
            Object obj = getCallingActivity();
            boolean flag;
            if (obj == null)
            {
                Log.e("paypal.sdk", (new StringBuilder()).append(bundle).append(" called by a null activity, not allowed").toString());
                flag = false;
            } else
            {
                obj = ((ComponentName) (obj)).getClassName();
                if (!((String) (obj)).startsWith("com.paypal.android.sdk.payments."))
                {
                    Log.e("paypal.sdk", (new StringBuilder()).append(bundle).append(" called by ").append(((String) (obj))).append(" which is not part of the SDK, not allowed").toString());
                    flag = false;
                } else
                {
                    flag = true;
                }
            }
            if (!flag)
            {
                finish();
            }
            g = false;
        } else
        {
            g = bundle.getBoolean("pageTrackingSent");
            h = bundle.getBoolean("isLoginActivityStarted");
        }
        a();
        j = (aL)getIntent().getParcelableExtra("com.paypal.android.sdk.payments.ppAppInfo");
        d();
        R.b(this);
        R.a(this);
        c = new ct(this);
        setContentView(c.a);
        com.paypal.android.sdk.payments.d.a(this, c.b, null);
        c.g.setText(cq.a(cs.f));
        c.g.setVisibility(0);
        f();
    }

    protected Dialog onCreateDialog(int i1, Bundle bundle)
    {
        switch (i1)
        {
        default:
            return null;

        case 1: // '\001'
            return com.paypal.android.sdk.payments.d.a(this, cs.bj, bundle.getString("alert_errors"), new e());

        case 2: // '\002'
            return com.paypal.android.sdk.payments.d.a(this, cs.aD, cs.bo);

        case 3: // '\003'
            return com.paypal.android.sdk.payments.d.a(this, cs.am, bundle, i1);

        case 4: // '\004'
            return com.paypal.android.sdk.payments.d.a(this, cs.aL, bundle, new w(this));
        }
    }

    protected void onDestroy()
    {
        (new StringBuilder()).append(d).append(".onDestroy");
        if (a != null)
        {
            a.m();
        }
        if (e)
        {
            unbindService(k);
            e = false;
        }
        super.onDestroy();
    }

    protected void onRestart()
    {
        super.onRestart();
        d();
    }

    protected void onResume()
    {
        super.onResume();
        (new StringBuilder()).append(d).append(".onResume");
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("pageTrackingSent", g);
        bundle.putBoolean("isLoginActivityStarted", h);
    }

}
