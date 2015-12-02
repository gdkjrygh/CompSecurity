// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Dialog;
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
import com.paypal.android.sdk.bK;
import com.paypal.android.sdk.payments.FuturePaymentInfoActivity;
import com.paypal.android.sdk.payments.LoginActivity;
import com.paypal.android.sdk.payments.PayPalAuthorization;
import com.paypal.android.sdk.payments.PayPalConfiguration;
import com.paypal.android.sdk.payments.PayPalOAuthScopes;
import com.paypal.android.sdk.payments.PayPalService;
import com.paypal.android.sdk.payments.b;
import com.paypal.android.sdk.payments.bE;
import com.paypal.android.sdk.payments.bx;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public abstract class ccy extends Activity
{

    private static final String d = ccy.getSimpleName();
    private static final Map l = new cda();
    protected PayPalService a;
    public PayPalOAuthScopes b;
    protected bva c;
    private boolean e;
    private ccv f;
    private boolean g;
    private boolean h;
    private boolean i;
    private bx j;
    private final ServiceConnection k = new cdg(this);

    public ccy()
    {
    }

    private void a(int i1, PayPalAuthorization paypalauthorization)
    {
        Intent intent = new Intent();
        intent.putExtra("com.paypal.android.sdk.authorization", paypalauthorization);
        setResult(i1, intent);
    }

    private void a(int i1, String s, String s1, byw byw1)
    {
        s = new SpannableString(Html.fromHtml((new StringBuilder()).append(s1).append(s).toString()));
        if (byw1 != null)
        {
            s1 = (URLSpan[])s.getSpans(0, s.length(), android/text/style/URLSpan);
            if (s1.length > 0)
            {
                s1 = s1[0];
                s.setSpan(new b(s1, this, com/paypal/android/sdk/payments/FuturePaymentInfoActivity, new ccz(this), byw1), s.getSpanStart(s1), s.getSpanEnd(s1), 33);
                s.removeSpan(s1);
            }
        } else
        {
            a(((SpannableString) (s)));
        }
        s.setSpan(new BulletSpan(15), 0, s.length(), 0);
        c.c[i1].setVisibility(0);
        c.c[i1].setFocusable(true);
        c.c[i1].setNextFocusLeftId((i1 + 100) - 1);
        c.c[i1].setNextFocusRightId(i1 + 100 + 1);
        c.c[i1].setText(s);
    }

    private void a(SpannableString spannablestring)
    {
        int i1 = 0;
        URLSpan aurlspan[] = (URLSpan[])spannablestring.getSpans(0, spannablestring.length(), android/text/style/URLSpan);
        for (int j1 = aurlspan.length; i1 < j1; i1++)
        {
            URLSpan urlspan = aurlspan[i1];
            spannablestring.setSpan(new bE(urlspan, new cdb(this)), spannablestring.getSpanStart(urlspan), spannablestring.getSpanEnd(urlspan), 33);
            spannablestring.removeSpan(urlspan);
        }

    }

    private void a(ccv ccv1)
    {
        a.c().j = ccv1.a;
        a.c().f = ccv1.b;
        a.c().d = ccv1.c;
        j();
    }

    static void a(ccy ccy1)
    {
        ccy1.k();
    }

    static void a(ccy ccy1, buw buw1)
    {
        ccy1.a.a(buw1);
    }

    static void a(ccy ccy1, bwf bwf)
    {
        ccy1.j = new bx(bwf);
        ccy1.getIntent().putExtra("com.paypal.android.sdk.payments.ppAppInfo", ccy1.j);
        ccy1.f();
        ccy1.k();
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
            spannablestring.setSpan(new bE(urlspan, new cdc(this)), spannablestring.getSpanStart(urlspan), spannablestring.getSpanEnd(urlspan), 33);
            spannablestring.removeSpan(urlspan);
        }

    }

    static void b(ccy ccy1)
    {
        ccy1.i();
    }

    private void c()
    {
label0:
        {
            if (a != null)
            {
                showDialog(2);
                if (a.i())
                {
                    break label0;
                }
                (new StringBuilder("token is expired, get new one. AccessToken: ")).append(a.c().c);
                a.a(new cdd(this), true);
            }
            return;
        }
        a.p();
    }

    static void c(ccy ccy1)
    {
        ccy1.e();
    }

    private void d()
    {
        e = bindService(ccm.b(this), k, 1);
    }

    static void d(ccy ccy1)
    {
        (new StringBuilder()).append(d).append(".postBindSetup()");
        (new StringBuilder()).append(d).append(".startLoginIfNeeded (access token: ").append(ccy1.a.c().h).append(")");
        bva bva1;
        boolean flag;
        if (!ccy1.a.j() && !ccy1.h)
        {
            (new StringBuilder()).append(d).append(" -- doing the login...");
            ccy1.h = true;
            ccy1.e();
            flag = true;
        } else
        {
            flag = false;
        }
        bva1 = ccy1.c;
        if (ccy1.i)
        {
            ccy1.i = false;
            ccy1.j();
        }
        if (!ccy1.g)
        {
            ccy1.g = true;
            ccy1.a.a(buw.q);
        }
        ccm.a(bva1.f.b, ccy1.a.e());
        ccy1.a.b(new cde(ccy1));
        ccy1.f();
        if (!flag && ccy1.j == null)
        {
            ccy1.c();
        }
    }

    private void e()
    {
        (new StringBuilder()).append(d).append(".doLogin");
        if (ccw.a(this, a))
        {
            new bqn();
            Intent intent = bqn.b(a.d().k(), bqo.b, bqp.b, a.b().d().e());
            (new StringBuilder("startActivityForResult(")).append(intent).append(", 2)");
            Log.w("paypal.sdk", "requesting code with scope=null from Authenticator.");
            startActivityForResult(intent, 2);
            return;
        } else
        {
            LoginActivity.a(this, null, true, false, b.b(), a.d());
            return;
        }
    }

    static void e(ccy ccy1)
    {
        ccy1.a.a(buw.s);
        ccy1.finish();
    }

    private void f()
    {
        if (b != null && j != null && a != null)
        {
            Object obj = a.d().l();
            if (j.d() != null)
            {
                obj = j.d();
            }
            String s1 = a.d().m().toString();
            if (j.b() != null)
            {
                s1 = j.b();
            }
            String s2 = a.d().n().toString();
            if (j.c() != null)
            {
                s2 = j.c();
            }
            Object obj1 = String.format(bux.a(buz.V), new Object[] {
                (new StringBuilder("<b>")).append(((String) (obj))).append("</b>").toString()
            });
            String s;
            int i1;
            int j1;
            int k1;
            if (bux.a)
            {
                s = "\u200F";
            } else
            {
                s = "";
            }
            c.c[0].setText(Html.fromHtml((new StringBuilder()).append(s).append(((String) (obj1))).toString()));
            if (bux.a)
            {
                c.c[0].setGravity(5);
            }
            c.c[0].setVisibility(0);
            obj1 = b.a();
            if (((List) (obj1)).contains(bqk.a.a()) || ((List) (obj1)).contains(bqk.i.a()) || ((List) (obj1)).contains(bqk.j.a()))
            {
                a(1, String.format(bux.a(buz.Y), new Object[] {
                    "future-payment-consent", (new StringBuilder("<b>")).append(((String) (obj))).append("</b>").toString(), (new StringBuilder("<b>")).append(((String) (obj))).append("</b>").toString()
                }), s, byw.a);
                j1 = 2;
            } else
            {
                j1 = 1;
            }
            i1 = j1;
            if (((List) (obj1)).contains(bqk.h.a()))
            {
                a(j1, bux.a(buz.X), s, null);
                i1 = j1 + 1;
            }
            j1 = i1;
            if (((List) (obj1)).contains(bqk.k.a()))
            {
                a(i1, bux.a(buz.W), s, byw.b);
                j1 = i1 + 1;
            }
            i1 = j1;
            if (((List) (obj1)).contains(bqk.l.a()))
            {
                a(j1, String.format(bux.a(buz.ac), new Object[] {
                    "", obj
                }), s, byw.c);
                i1 = j1 + 1;
            }
            j1 = i1;
            if (((List) (obj1)).contains(bqk.m.a()))
            {
                a(i1, String.format(bux.a(buz.ab), new Object[] {
                    "", obj
                }), s, byw.d);
                j1 = i1 + 1;
            }
            k1 = j1;
            if (((List) (obj1)).contains(bqk.n.a()))
            {
                a(j1, bux.a(buz.Z), s, null);
                k1 = j1 + 1;
            }
            i1 = k1;
            if (((List) (obj1)).contains(bqk.o.a()))
            {
                a(k1, bux.a(buz.U), s, null);
                i1 = k1 + 1;
            }
            k1 = i1;
            if (!Collections.disjoint(((Collection) (obj1)), bqk.p))
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
                    a(i1, String.format(bux.a(buz.T), new Object[] {
                        h()
                    }), s, null);
                    k1 = i1 + 1;
                }
            }
            a(k1, String.format(bux.a(buz.aa), new Object[] {
                (new StringBuilder("<b>")).append(((String) (obj))).append("</b>").toString(), s1, s2
            }), s, null);
            c.c[k1].setNextFocusRightId(2);
            s2 = bux.a(buz.aD);
            s1 = Locale.getDefault().getCountry().toLowerCase(Locale.US);
            obj = s1;
            if (bwq.c(s1))
            {
                obj = "us";
            }
            obj = String.format(s2, new Object[] {
                String.format("https://www.paypal.com/%s/cgi-bin/webscr?cmd=p/gen/ua/policy_privacy-outside", new Object[] {
                    obj
                })
            });
            obj = new SpannableString(Html.fromHtml((new StringBuilder()).append(s).append(((String) (obj))).toString()));
            b(((SpannableString) (obj)));
            c.d.setText(((CharSequence) (obj)));
            c.d.setMovementMethod(LinkMovementMethod.getInstance());
            c.d.setNextFocusLeftId((k1 + 1 + 100) - 1);
            c.d.setNextFocusRightId(1);
            obj = bwq.b(a.d().a());
            if (obj != null)
            {
                c.e.setText(((CharSequence) (obj)));
                c.e.setVisibility(0);
            }
            c.i.setText(bux.a(buz.F));
            c.g.setOnClickListener(new cdi(this));
            c.h.setOnClickListener(new byn(this));
            c.h.setEnabled(true);
            if (f != null)
            {
                a(f);
                f = null;
                return;
            }
        }
    }

    static void f(ccy ccy1)
    {
        ccy1.a.a(buw.r);
        if (!ccy1.a.k())
        {
            (new StringBuilder("code/nonce invalid.  code:")).append(ccy1.a.c().f).append(", nonce:").append(ccy1.a.c().j);
            ccm.a(ccy1, bux.a(buz.aL), 4);
            return;
        } else
        {
            ccy1.showDialog(2);
            ccy1.a.a(ccy1.b.a());
            return;
        }
    }

    private Set g()
    {
        List list = b.a();
        LinkedHashSet linkedhashset = new LinkedHashSet();
        byo abyo[] = byo.values();
        int j1 = abyo.length;
        int i1 = 0;
        do
        {
            while (i1 < j1) 
            {
                Object obj = abyo[i1];
                if (j.a().contains(((byo) (obj)).name()) && list.contains(((bqk)l.get(obj)).a()))
                {
                    if (obj == byo.a)
                    {
                        obj = null;
                    } else
                    if (obj == byo.k)
                    {
                        obj = bux.a(buz.G);
                    } else
                    if (obj == byo.i)
                    {
                        obj = bux.a(buz.H);
                    } else
                    if (obj == byo.j)
                    {
                        obj = bux.a(buz.I);
                    } else
                    if (obj == byo.m || obj == byo.n || obj == byo.o || obj == byo.p || obj == byo.q || obj == byo.r)
                    {
                        obj = bux.a(buz.J);
                    } else
                    if (obj == byo.h)
                    {
                        obj = bux.a(buz.K);
                    } else
                    if (obj == byo.d)
                    {
                        obj = bux.a(buz.L);
                    } else
                    if (obj == byo.l)
                    {
                        obj = bux.a(buz.M);
                    } else
                    if (obj == byo.b)
                    {
                        obj = bux.a(buz.N);
                    } else
                    if (obj == byo.c)
                    {
                        obj = bux.a(buz.O);
                    } else
                    if (obj == byo.g)
                    {
                        obj = bux.a(buz.P);
                    } else
                    if (obj == byo.f)
                    {
                        obj = bux.a(buz.Q);
                    } else
                    if (obj == byo.s)
                    {
                        obj = bux.a(buz.R);
                    } else
                    if (obj == byo.e)
                    {
                        obj = bux.a(buz.S);
                    } else
                    {
                        obj = ((byo) (obj)).name();
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
            String s = (String)iterator.next();
            if (!flag)
            {
                stringbuilder.append(", ");
            } else
            {
                flag = false;
            }
            stringbuilder.append(s);
        }
        return stringbuilder.toString();
    }

    private void i()
    {
        a(-1, new PayPalAuthorization(a.e(), a.c().f.b(), a.c().d));
        finish();
    }

    private void j()
    {
        String s = a.c().f.a();
        if (s != null && Arrays.asList(s.split(" ")).containsAll(b.a()))
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

    public abstract void a();

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
            intent = ccx.a(intent.getExtras());
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
        a.a(buw.s);
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        (new StringBuilder()).append(d).append(".onCreate");
        if (bundle == null)
        {
            if (!ccm.a(this))
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
        j = (bx)getIntent().getParcelableExtra("com.paypal.android.sdk.payments.ppAppInfo");
        d();
        bwq.b(this);
        bwq.a(this);
        c = new bva(this);
        setContentView(c.a);
        ccm.a(this, c.b, null);
        c.g.setText(bux.a(buz.f));
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
            return ccm.a(this, buz.bk, bundle);

        case 2: // '\002'
            return ccm.a(this, buz.aE, buz.bp);

        case 3: // '\003'
            return ccm.a(this, buz.an, bundle, i1);

        case 4: // '\004'
            return ccm.a(this, buz.aM, bundle, new cdf(this));
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
