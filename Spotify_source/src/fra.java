// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.spotify.mobile.android.ui.activity.upsell.PremiumSignupActivity;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.ViewUri;

public final class fra extends fyl
    implements fqw, ggt
{

    private fqm Y;
    private fqv Z;
    private com.spotify.mobile.android.util.viewuri.ViewUri.SubView a;
    private String aa;
    private Uri ab;
    private boolean ac;
    private String ad;
    private Flags ae;
    private ggq b;

    public fra()
    {
        dmz.a(fop);
    }

    private void G()
    {
        boolean flag2 = true;
        if (ab == null || aa == null || ac && ad == null)
        {
            boolean flag;
            boolean flag1;
            if (ab != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (aa != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (ad == null)
            {
                flag2 = false;
            }
            Logger.a("Not ready to load web, got web token uri: %s, got Google Play country: %s, arsenal token: %s", new Object[] {
                Boolean.valueOf(flag), Boolean.valueOf(flag1), Boolean.valueOf(flag2)
            });
            return;
        }
        if (ac)
        {
            WebSettings websettings = x_().getSettings();
            StringBuilder stringbuilder = new StringBuilder(websettings.getUserAgentString());
            stringbuilder.append(' ');
            stringbuilder.append("xperia");
            websettings.setUserAgentString(stringbuilder.toString());
        }
        Object obj = dkw.a(k());
        Object obj1 = ab.buildUpon().appendQueryParameter("app_version", Integer.toString(0x8c08aa));
        if (ac)
        {
            ((android.net.Uri.Builder) (obj1)).appendQueryParameter("sony_device", "true").appendQueryParameter("sony_token", ad).appendQueryParameter("sony_environment", ((String) (obj)));
        }
        obj = ((android.net.Uri.Builder) (obj1)).build();
        Object obj2 = Z;
        obj1 = aa;
        ctz.a(obj);
        ctz.a(obj1);
        StringBuilder stringbuilder1 = new StringBuilder();
        if (((fqv) (obj2)).e)
        {
            stringbuilder1.append("inapp");
        }
        if (((fqv) (obj2)).d)
        {
            if (stringbuilder1.length() > 0)
            {
                stringbuilder1.append(',');
            }
            stringbuilder1.append("subs");
        }
        obj2 = stringbuilder1.toString();
        if (((String) (obj2)).length() != 0)
        {
            obj = ((Uri) (obj)).buildUpon().appendQueryParameter("gpiab", ((String) (obj2))).appendQueryParameter("gpiab_country", ((String) (obj1))).build();
        }
        obj1 = obj;
        if (((gim)dmz.a(gim)).a(k(), "android.permission.READ_PHONE_STATE"))
        {
            obj1 = fsu.a(((Uri) (obj)), ae);
        }
        c(((Uri) (obj1)).toString());
    }

    static fqm a(fra fra1)
    {
        return fra1.Y;
    }

    public static fra a(Flags flags, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, String s)
    {
        fra fra1 = new fra();
        fyw.a(fra1, flags);
        fra1.g().putSerializable("sub_view", subview);
        fra1.g().putString("key_token", s);
        return fra1;
    }

    static String a(fra fra1, String s)
    {
        fra1.aa = s;
        return s;
    }

    static fqm b(fra fra1)
    {
        fra1.Y = null;
        return null;
    }

    static void c(fra fra1)
    {
        fra1.G();
    }

    public final void B()
    {
        super.B();
        if (b != null)
        {
            b.b();
            b = null;
        }
        if (Y != null)
        {
            Y.a();
            Y = null;
        }
        if (Z != null)
        {
            Z.a();
            Z = null;
        }
    }

    protected final void a()
    {
        u u1 = k();
        Object obj = u1.getIntent().getData();
        if (obj != null)
        {
            obj = ((Uri) (obj)).toString();
        } else
        {
            obj = b(0x7f080652);
        }
        b = ggq.a(u1, u1.S_());
        b.a(((String) (obj)), this);
    }

    public final void a(int i, int j, Intent intent)
    {
        if (i != 1) goto _L2; else goto _L1
_L1:
        j;
        JVM INSTR tableswitch -1 0: default 28
    //                   -1 49
    //                   0 106;
           goto _L3 _L4 _L5
_L3:
        Assertion.a((new StringBuilder("Unexpected result code ")).append(j).toString());
_L7:
        return;
_L4:
        fqv fqv1 = Z;
        fqv1.a(x_(), fqv.a(intent.getExtras()), intent.getStringExtra("INAPP_PURCHASE_DATA"), intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        fqv1.a.startService(dvv.a(fqv1.a, "com.spotify.mobile.android.service.action.googleiab.REGISTER_PURCHASES"));
        return;
_L5:
        if (y_()) goto _L7; else goto _L6
_L6:
        k().finish();
        return;
_L2:
        super.a(i, j, intent);
        return;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        ae = fyw.a(this);
        s();
        a = (com.spotify.mobile.android.util.viewuri.ViewUri.SubView)g().getSerializable("sub_view");
        Z = new fqv(k());
        Z.f = this;
        aa = "";
        ac = dkb.a(k()).a();
        bundle = g().getString("key_token");
        if (bundle == null)
        {
            bundle = "";
        }
        ad = bundle;
    }

    protected final boolean a(Uri uri)
    {
        PremiumSignupActivity premiumsignupactivity = (PremiumSignupActivity)k();
        if (premiumsignupactivity == null)
        {
            return false;
        }
        String s = uri.toString();
        boolean flag;
        if (s.startsWith("https://www.paypal.com/cgi-bin/webscr") || s.startsWith("https://www.sandbox.paypal.com/cgi-bin/webscr"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            x_().stopLoading();
            premiumsignupactivity.startActivity(new Intent("android.intent.action.VIEW", uri));
            premiumsignupactivity.finish();
            return true;
        }
        if (Z != null && Z.a(premiumsignupactivity, x_(), uri))
        {
            return true;
        }
        if (uri.getPath() != null)
        {
            String s1 = uri.getPath();
            if (s1.contains("account/csi/end/") || s1.contains("retailer/sony/response/success") || s1.contains("/mobile/close/"))
            {
                Object obj = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.H);
                ((ClientEvent) (obj)).a("exit_url", uri.toString());
                fop.a(premiumsignupactivity, ViewUri.aZ, a, ((ClientEvent) (obj)));
                obj = new Intent();
                ((Intent) (obj)).putExtra("reason", uri.getQueryParameter("reason"));
                premiumsignupactivity.setResult(-1, ((Intent) (obj)));
                premiumsignupactivity.finish();
            }
        }
        return false;
    }

    public final void a_(Uri uri)
    {
        if (b != null)
        {
            b.b();
            b = null;
        }
        ab = uri;
        G();
        if (Y != null)
        {
            Y.b();
        }
    }

    public final void b()
    {
        Y = new fqm(Z, new fqn() {

            private fra a;

            public final void a(String s)
            {
                fra.a(a).a();
                fra.b(a);
                fra.a(a, s);
                fra.c(a);
            }

            
            {
                a = fra.this;
                super();
            }
        });
        Y.a.a();
        if (ab != null)
        {
            Y.b();
        }
    }

    public final boolean y_()
    {
        WebView webview = x_();
        if (webview != null && webview.canGoBack())
        {
            WebBackForwardList webbackforwardlist = webview.copyBackForwardList();
            int j = webbackforwardlist.getCurrentIndex();
            int i;
            for (i = j - 1; i > 0 && webbackforwardlist.getItemAtIndex(i).getUrl().equals("about:blank"); i--) { }
            webview.goBackOrForward(i - j);
            return true;
        } else
        {
            return false;
        }
    }
}
