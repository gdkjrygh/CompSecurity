// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.pandora.android.data.l;
import com.pandora.android.util.k;
import com.pandora.android.util.s;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.x;
import com.pandora.radio.data.y;
import java.util.HashMap;
import p.cp.d;
import p.cq.b;
import p.cw.c;
import p.dd.bh;
import p.df.a;

// Referenced classes of package com.pandora.android.activity:
//            BaseFragmentActivity, a, PandoraIntent, PandoraIntentFilter, 
//            c

public class InterstitialBaseActivity extends BaseFragmentActivity
{
    protected class a extends d
    {

        final InterstitialBaseActivity b;

        public HashMap a(String s1, p.cq.b b1)
        {
            com.pandora.android.activity.InterstitialBaseActivity.a(b, s1);
            com.pandora.android.activity.InterstitialBaseActivity.a(b, b1);
            com.pandora.android.activity.InterstitialBaseActivity.a(b, System.currentTimeMillis());
            com.pandora.android.activity.a.b(b, s1);
            return j;
        }

        public void a(int i)
        {
        }

        public boolean a(boolean flag)
        {
            return false;
        }

        public void e()
        {
        }

        public void f()
        {
            b.d(104);
        }

        public a(Activity activity, WebView webview)
        {
            b = InterstitialBaseActivity.this;
            super(activity, webview);
        }
    }

    private class b
    {

        final InterstitialBaseActivity a;
        private aa b;
        private y c;

        private void a(aa aa1)
        {
            aa aa2 = b;
            b = aa1;
            if (aa.a(b) && aa1 != null)
            {
                c = com.pandora.android.provider.b.a.b().d().t();
                if (aa2 == null)
                {
                    a(aa1, c);
                } else
                if (!aa.a(aa2, "0").equals(aa.a(b, "0")))
                {
                    a(aa1, c);
                    return;
                }
            }
        }

        private void a(aa aa1, y y)
        {
            if (com.pandora.android.activity.InterstitialBaseActivity.a(a) == null)
            {
                return;
            } else
            {
                a.q.postDelayed(new Runnable(this, aa1, y) {

                    final aa a;
                    final y b;
                    final b c;

                    public void run()
                    {
                        com.pandora.android.activity.InterstitialBaseActivity.a(c.a).a(com.pandora.android.activity.InterstitialBaseActivity.b(c.a), a, b);
                    }

            
            {
                c = b1;
                a = aa;
                b = y;
                super();
            }
                }, 1000L);
                return;
            }
        }

        public void a()
        {
            com.pandora.android.provider.b.a.b().b(this);
            com.pandora.android.provider.b.a.e().c(this);
        }

        public void b()
        {
            com.pandora.android.provider.b.a.b().c(this);
            com.pandora.android.provider.b.a.e().b(this);
        }

        public void onStationData(y y)
        {
            c = y;
        }

        public void onTrackState(bh bh1)
        {
label0:
            {
                if (bh1.b != null)
                {
                    if (com.pandora.android.provider.b.a.d() != null)
                    {
                        break label0;
                    }
                    a.f("We've been signed out, exiting");
                }
                return;
            }
            a(bh1.b);
        }

        private b()
        {
            a = InterstitialBaseActivity.this;
            super();
        }

    }


    private d A;
    private int B;
    private int C;
    private int D;
    private b E;
    private String F;
    private p.cq.b G;
    private long H;
    protected l o;
    protected int p;
    Handler q;
    private WebView z;

    public InterstitialBaseActivity()
    {
        q = new Handler();
    }

    static long a(InterstitialBaseActivity interstitialbaseactivity, long l1)
    {
        interstitialbaseactivity.H = l1;
        return l1;
    }

    static String a(InterstitialBaseActivity interstitialbaseactivity, String s1)
    {
        interstitialbaseactivity.F = s1;
        return s1;
    }

    static d a(InterstitialBaseActivity interstitialbaseactivity)
    {
        return interstitialbaseactivity.A;
    }

    static p.cq.b a(InterstitialBaseActivity interstitialbaseactivity, p.cq.b b1)
    {
        interstitialbaseactivity.G = b1;
        return b1;
    }

    public static void a(FragmentActivity fragmentactivity, int i)
    {
        switch (i)
        {
        default:
            throw new UnsupportedOperationException((new StringBuilder()).append("Unknown landing page result code ").append(i).toString());

        case 103: // 'g'
            com.pandora.android.activity.a.a(fragmentactivity);
            // fall through

        case 0: // '\0'
        case 100: // 'd'
        case 101: // 'e'
        case 102: // 'f'
        case 104: // 'h'
            return;
        }
    }

    static WebView b(InterstitialBaseActivity interstitialbaseactivity)
    {
        return interstitialbaseactivity.z;
    }

    private d b(WebView webview)
    {
        return new d(this, webview) {

            final InterstitialBaseActivity a;

            protected HashMap a(l l1, p.cq.c c1)
            {
                if (l1 == null || s.a(l1.a()))
                {
                    p.df.a.c("InterstitialBaseActivity", "handleOpenLandingPage url is missing");
                    return null;
                } else
                {
                    c1 = new Bundle(1);
                    c1.putSerializable("LANDING_PAGE_DATA", l1);
                    com.pandora.android.activity.c.a().a(a, com/pandora/android/activity/InterstitialBaseActivity, 0, c1, 123);
                    return null;
                }
            }

            protected HashMap a(HashMap hashmap)
            {
                a.d(101);
                return null;
            }

            public boolean a()
            {
                return true;
            }

            public void d()
            {
                a.finish();
            }

            
            {
                a = InterstitialBaseActivity.this;
                super(activity, webview);
            }
        };
    }

    private void c(Intent intent)
    {
        if (!s.a(F) && G != null)
        {
            intent = (x)intent.getSerializableExtra("intent_sponsorship_data");
            boolean flag = o();
            p.df.a.a("InterstitialBaseActivity", (new StringBuilder()).append("handleTrialStarted: withinAppropriateTime = ").append(flag).append("; sponsor = ").append(intent.b()).toString());
            if (F.equals(intent.b()) && flag)
            {
                G.a(true, null);
            }
            F = null;
            G = null;
        }
    }

    private Runnable e(int i)
    {
        return new Runnable(i) {

            final int a;
            final InterstitialBaseActivity b;

            public void run()
            {
                b.setResult(a);
                Intent intent = (Intent)b.getIntent().getParcelableExtra("intent_followon_intent");
                if (intent != null)
                {
                    b.S();
                    b.N();
                    com.pandora.android.provider.b.a.c(intent);
                    return;
                } else
                {
                    b.finish();
                    return;
                }
            }

            
            {
                b = InterstitialBaseActivity.this;
                a = i;
                super();
            }
        };
    }

    private boolean o()
    {
        long l1 = System.currentTimeMillis();
        return H != 0L && H + 60000L >= l1;
    }

    protected d a(WebView webview)
    {
        return new a(this, webview) {

            final InterstitialBaseActivity a;

            public void d()
            {
                a.finish();
            }

            
            {
                a = InterstitialBaseActivity.this;
                super(activity, webview);
            }
        };
    }

    protected void a(Context context, Intent intent, String s1)
    {
        if (com.pandora.android.activity.PandoraIntent.a("close_pandora_browser").equals(s1))
        {
            d(101);
        } else
        {
            if (com.pandora.android.activity.PandoraIntent.a("complimentary_p1_trial_started").equals(s1))
            {
                c(intent);
                return;
            }
            if (com.pandora.android.activity.PandoraIntent.a("complimentary_p1_trial_exist").equals(s1))
            {
                c(intent);
                return;
            }
        }
    }

    protected boolean a(Context context, Intent intent)
    {
        a(context, intent, intent.getAction());
        return false;
    }

    protected void d(int i)
    {
        runOnUiThread(e(i));
    }

    protected IntentFilter l()
    {
        PandoraIntentFilter pandoraintentfilter = new PandoraIntentFilter();
        pandoraintentfilter.a("close_pandora_browser");
        pandoraintentfilter.a("complimentary_p1_trial_started");
        pandoraintentfilter.a("complimentary_p1_trial_exist");
        return pandoraintentfilter;
    }

    protected int m()
    {
        return 0x7f040062;
    }

    protected void n()
    {
        setRequestedOrientation(1);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        switch (i)
        {
        default:
            super.onActivityResult(i, j, intent);
            return;

        case 123: // '{'
            a(this, j);
            break;
        }
    }

    public void onBackPressed()
    {
        d(102);
    }

    public void onCreate(Bundle bundle)
    {
        com.pandora.android.data.l.a a1;
        k.a().a(true);
        requestWindowFeature(1);
        super.onCreate(bundle);
        bundle = getIntent();
        if (bundle == null || !bundle.hasExtra("LANDING_PAGE_DATA"))
        {
            d(100);
            return;
        }
        o = (l)bundle.getSerializableExtra("LANDING_PAGE_DATA");
        a1 = o.d();
        C = 0x7f05000a;
        D = 0x7f05000a;
        static class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[com.pandora.android.data.l.a.values().length];
                try
                {
                    a[com.pandora.android.data.l.a.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.pandora.android.data.l.a.d.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.pandora.android.data.l.a.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.pandora.android.data.l.a.e.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.pandora.android.data.l.a.a.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.pandora.android.activity._cls4.a[a1.ordinal()];
        JVM INSTR tableswitch 1 5: default 120
    //                   1 154
    //                   2 323
    //                   3 354
    //                   4 385
    //                   5 416;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_416;
_L1:
        throw new UnsupportedOperationException((new StringBuilder()).append("Unknown transition type").append(o.d()).toString());
_L2:
        B = 0x7f05000f;
        p = 0x7f050010;
_L7:
        overridePendingTransition(B, C);
        n();
        setContentView(m());
        z = (WebView)findViewById(0x7f1001a2);
        s.a(z, false);
        z.setBackgroundColor(0);
        z.getSettings().setCacheMode(2);
        boolean flag;
        if (bundle.hasExtra("TEST_AD_WEB_PAGE"))
        {
            flag = bundle.getBooleanExtra("TEST_AD_WEB_PAGE", false);
        } else
        {
            flag = false;
        }
        if (flag)
        {
            A = b(z);
            z.setWebChromeClient(new p.cp.a());
        } else
        {
            A = a(z);
        }
        E = new b();
        if (!s.a(o.a()))
        {
            z.loadUrl(o.a());
            return;
        }
        break MISSING_BLOCK_LABEL_448;
_L3:
        B = 0x7f050007;
        C = 0x7f050008;
        D = 0x7f050007;
        p = 0x7f050008;
          goto _L7
_L4:
        B = 0x7f050009;
        C = 0x7f050014;
        D = 0x7f050009;
        p = 0x7f050014;
          goto _L7
_L5:
        B = 0x7f050009;
        C = 0x7f050014;
        D = 0x7f050009;
        p = 0x7f050014;
          goto _L7
        B = 0x7f05000b;
        p = 0x7f05000c;
          goto _L7
        if (!s.a(o.b()))
        {
            bundle = o.a(this, p.cp.d.b.b);
            z.loadDataWithBaseURL(null, bundle, "text/html", "utf-8", null);
            return;
        } else
        {
            finish();
            return;
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        k.a().a(false);
    }

    public void onPause()
    {
        overridePendingTransition(B, C);
        super.onPause();
        if (E != null)
        {
            E.b();
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (E != null)
        {
            E.a();
        }
    }
}
