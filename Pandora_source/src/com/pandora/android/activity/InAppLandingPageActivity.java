// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.h;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import com.crashlytics.android.d;
import com.pandora.android.ads.VideoAdManager;
import com.pandora.android.artist.e;
import com.pandora.android.data.l;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.y;
import com.pandora.radio.util.k;
import p.ca.ac;
import p.cw.c;
import p.dd.bh;
import p.df.a;

// Referenced classes of package com.pandora.android.activity:
//            BaseFragmentActivity, PandoraIntent, c, PandoraIntentFilter, 
//            InterstitialBaseActivity, a

public class InAppLandingPageActivity extends BaseFragmentActivity
    implements com.pandora.android.ads.c.a
{
    public static class a extends ac
    {

        private InAppLandingPageActivity a;

        static InAppLandingPageActivity a(a a1)
        {
            return a1.a;
        }

        protected p.cp.d a(BaseFragmentActivity basefragmentactivity, WebView webview)
        {
            return new a(this, basefragmentactivity, q, webview);
        }

        public void onAttach(Activity activity)
        {
            super.onAttach(activity);
            try
            {
                a = (InAppLandingPageActivity)activity;
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                p.df.a.e("InAppLandingPageActivity", "Casting activity fail while attaching InAppLandingPageWebFragment", activity);
            }
            d.a(activity);
        }

        public a()
        {
        }
    }

    class a.a extends p.ca.ac.c
    {

        final a a;

        public void onPageFinished(WebView webview, String s1)
        {
            super.onPageFinished(webview, s1);
            if (com.pandora.android.activity.a.a(a) != null && !com.pandora.android.activity.a.a(a).n())
            {
                com.pandora.android.activity.InAppLandingPageActivity.a(com.pandora.android.activity.a.a(a), com.pandora.radio.util.k.a.g);
                com.pandora.android.activity.a.a(a).c(true);
            }
        }

        public a.a(a a1, BaseFragmentActivity basefragmentactivity, p.ca.ac.d d, WebView webview)
        {
            a = a1;
            super(a1, basefragmentactivity, d, webview);
        }
    }


    private y A;
    private l B;
    private boolean C;
    private boolean D;
    private p.cq.b o;
    private aa p;
    private boolean q;
    private ac z;

    public InAppLandingPageActivity()
    {
        B = null;
        C = false;
        D = false;
    }

    public static Bundle a(l l1, boolean flag)
    {
        Bundle bundle = new Bundle(3);
        bundle.putBoolean("intent_disable_webview_cache", flag);
        bundle.putSerializable("pandora.landing_page_data", l1);
        return bundle;
    }

    static void a(InAppLandingPageActivity inapplandingpageactivity, com.pandora.radio.util.k.a a1)
    {
        inapplandingpageactivity.a(a1);
    }

    private void a(aa aa1)
    {
        aa aa2 = p;
        p = aa1;
        if (aa.a(p))
        {
            if (aa2 == null)
            {
                if (z != null && z.isAdded())
                {
                    z.a(aa1, A);
                }
            } else
            if (!aa.a(aa2, "0").equals(aa.a(p, "0")) && z != null && z.isAdded())
            {
                z.a(aa1, A);
                return;
            }
        }
    }

    private void a(com.pandora.radio.util.k.a a1)
    {
        com.pandora.radio.data.b b1;
        if (B != null)
        {
            b1 = B.f();
        } else
        {
            b1 = new com.pandora.radio.data.b();
        }
        b.a.b().o().a(a1, com.pandora.android.ads.h.a.n.name(), (String)null, b1);
    }

    protected void K()
    {
        super.K();
        if (D)
        {
            return;
        } else
        {
            p.df.a.a("InAppLandingPageActivity", "registerAdAction: onStop about to check... ");
            a(com.pandora.radio.util.k.a.i);
            return;
        }
    }

    protected void L()
    {
        super.L();
        a(com.pandora.radio.util.k.a.j);
    }

    protected void a(Context context, Intent intent, String s1)
    {
        if (com.pandora.android.activity.PandoraIntent.a("complimentary_p1_trial_started").equals(s1))
        {
            if (o != null)
            {
                o.a(true, null);
                o = null;
            }
        } else
        if (com.pandora.android.activity.PandoraIntent.a("close_pandora_browser").equals(s1))
        {
            m();
            return;
        }
    }

    public void a(p.cq.b b1)
    {
        o = b1;
    }

    protected a b(l l1, boolean flag)
    {
        a a1 = new a();
        Bundle bundle = new Bundle();
        if (l1 != null)
        {
            bundle.putSerializable("pandora.landing_page_data", l1);
        }
        bundle.putBoolean("intent_disable_webview_cache", flag);
        a1.setArguments(bundle);
        return a1;
    }

    public void b(String s1)
    {
    }

    public void c(boolean flag)
    {
        C = flag;
    }

    protected void k()
    {
        com.pandora.android.activity.c.a().d(this);
    }

    protected IntentFilter l()
    {
        PandoraIntentFilter pandoraintentfilter = new PandoraIntentFilter();
        pandoraintentfilter.a("complimentary_p1_trial_started");
        pandoraintentfilter.a("close_pandora_browser");
        return pandoraintentfilter;
    }

    void m()
    {
        setResult(-1);
        finish();
    }

    public boolean n()
    {
        return C;
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        switch (i)
        {
        default:
            super.onActivityResult(i, j, intent);
            return;

        case 123: // '{'
            com.pandora.android.activity.InterstitialBaseActivity.a(this, j);
            break;
        }
    }

    public void onBackPressed()
    {
        if (z != null && z.w())
        {
            z.u();
            return;
        } else
        {
            a(com.pandora.radio.util.k.a.h);
            D = true;
            m();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        if (!s.u())
        {
            setTheme(0x7f0d0078);
        }
        super.onCreate(bundle);
        setContentView(0x7f040074);
        getWindow().setBackgroundDrawable(new com.pandora.android.view.c());
        Object obj = getActionBar();
        boolean flag;
        if (s.u())
        {
            ((ActionBar) (obj)).setLogo(0x7f020199);
        } else
        {
            ((ActionBar) (obj)).setLogo(0x7f02019d);
        }
        obj = getIntent();
        if (obj != null)
        {
            B = (l)((Intent) (obj)).getSerializableExtra("pandora.landing_page_data");
            flag = ((Intent) (obj)).getBooleanExtra("intent_disable_webview_cache", false);
            q = ((Intent) (obj)).getBooleanExtra("intent_back_to_video_action", false);
        } else
        {
            flag = false;
        }
        if (bundle == null)
        {
            bundle = f().a();
            if (B != null)
            {
                z = b(B, flag);
                bundle.a(B.h(), B.i());
            }
            bundle.a(0x7f1001da, z, null);
            bundle.b();
        }
        bundle = B.j();
        if (s.a(bundle))
        {
            h(false);
            return;
        } else
        {
            getActionBar().setTitle(bundle);
            return;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        android.view.MenuInflater menuinflater = getMenuInflater();
        if (!s.u())
        {
            com.pandora.android.activity.a.a(menu, menuinflater, new android.view.View.OnClickListener() {

                final InAppLandingPageActivity a;

                public void onClick(View view)
                {
                    com.pandora.android.activity.a.d(a, 0x7f10000f);
                }

            
            {
                a = InAppLandingPageActivity.this;
                super();
            }
            });
            MenuItem menuitem = menu.findItem(0x7f10000f);
            if (menuitem != null)
            {
                boolean flag;
                if (!com.pandora.android.ads.VideoAdManager.c.a().l())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                menuitem.setVisible(flag);
            }
        }
        if (!s.a(B.a()))
        {
            com.pandora.android.activity.a.d(menu, menuinflater);
        }
        super.onCreateOptionsMenu(menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        int i = menuitem.getItemId();
        if (q && i == 0x7f10000f)
        {
            onBackPressed();
            return true;
        }
        if (i == 0x7f10000f)
        {
            com.pandora.android.activity.a.d(this, menuitem.getItemId());
            finish();
            return true;
        }
        if (i == 0x7f100019)
        {
            menuitem = new Intent("android.intent.action.SEND");
            menuitem.setType("text/plain");
            menuitem.putExtra("android.intent.extra.TEXT", B.a());
            menuitem = e.a(B, menuitem);
            menuitem.show(f(), menuitem.getTag());
            return true;
        } else
        {
            super.onOptionsItemSelected(menuitem);
            return true;
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        if (!s.u())
        {
            MenuItem menuitem = menu.findItem(0x7f10000f);
            if (menuitem != null)
            {
                boolean flag;
                if (!com.pandora.android.ads.VideoAdManager.c.a().l())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                menuitem.setVisible(flag);
            }
        }
        super.onPrepareOptionsMenu(menu);
        return true;
    }

    public void onTrackState(bh bh1)
    {
label0:
        {
            if (bh1.b != null)
            {
                if (b.a.d() != null)
                {
                    break label0;
                }
                f("We've been signed out, exiting");
            }
            return;
        }
        a(bh1.b);
    }
}
