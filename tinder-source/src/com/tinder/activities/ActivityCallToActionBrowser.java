// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.crashlytics.android.Crashlytics;
import com.facebook.a.e;
import com.facebook.a.g;
import com.tinder.base.a;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ManagerLiveRail;
import com.tinder.model.SparksEvent;
import com.tinder.utils.ad;
import com.tinder.utils.h;
import com.tinder.utils.v;

public class ActivityCallToActionBrowser extends a
{
    public static final class FailToLoadReason extends Enum
    {

        public static final FailToLoadReason a;
        public static final FailToLoadReason b;
        public static final FailToLoadReason c;
        public static final FailToLoadReason d;
        public static final FailToLoadReason e;
        public static final FailToLoadReason f;
        public static final FailToLoadReason g;
        private static final FailToLoadReason j[];
        Integer h;
        boolean i;

        public static FailToLoadReason valueOf(String s1)
        {
            return (FailToLoadReason)Enum.valueOf(com/tinder/activities/ActivityCallToActionBrowser$FailToLoadReason, s1);
        }

        public static FailToLoadReason[] values()
        {
            return (FailToLoadReason[])j.clone();
        }

        static 
        {
            a = new FailToLoadReason("NO_EXTRAS", 0, Integer.valueOf(0x7f060252), true);
            b = new FailToLoadReason("MISSING_URL", 1, Integer.valueOf(0x7f060251), true);
            c = new FailToLoadReason("ALREADY_RUNNING", 2, Integer.valueOf(0x7f06024c), false);
            d = new FailToLoadReason("BROWSER_ERROR", 3, Integer.valueOf(0x7f06024e), true);
            e = new FailToLoadReason("BROWSER_AUTH_REQUEST", 4, Integer.valueOf(0x7f06024d), true);
            f = new FailToLoadReason("BROWSER_SSL_ERROR", 5, Integer.valueOf(0x7f06024f), true);
            g = new FailToLoadReason("BROWSER_TOO_MANY_REDIRECTS", 6, Integer.valueOf(0x7f060250), true);
            j = (new FailToLoadReason[] {
                a, b, c, d, e, f, g
            });
        }

        private FailToLoadReason(String s1, int l, Integer integer, boolean flag)
        {
            super(s1, l);
            h = integer;
            i = flag;
        }
    }


    public static String a = "URL";
    private static boolean c = false;
    ManagerLiveRail b;
    private Handler d;
    private WebView e;
    private Menu f;
    private boolean g;
    private TextView h;
    private long i;
    private ProgressBar j;
    private ImageView k;
    private boolean q;
    private String r;
    private String s;
    private FailToLoadReason t;

    public ActivityCallToActionBrowser()
    {
        d = new Handler(Looper.getMainLooper());
    }

    static long a(ActivityCallToActionBrowser activitycalltoactionbrowser, long l)
    {
        activitycalltoactionbrowser.i = l;
        return l;
    }

    static String a(ActivityCallToActionBrowser activitycalltoactionbrowser)
    {
        return activitycalltoactionbrowser.r;
    }

    static String a(ActivityCallToActionBrowser activitycalltoactionbrowser, String s1)
    {
        activitycalltoactionbrowser.s = s1;
        return s1;
    }

    private void a(FailToLoadReason failtoloadreason)
    {
        if (failtoloadreason.i)
        {
            Toast.makeText(getApplicationContext(), getResources().getString(0x7f06010b), 0).show();
        }
        Object obj = failtoloadreason.h;
        if (obj != null)
        {
            obj = getResources().getString(((Integer) (obj)).intValue());
            v.b(String.format("Failed to load CTA browser: %s", new Object[] {
                obj
            }));
            Crashlytics.a("CTA browser", ((String) (obj)));
            c("AdDetails.Error").put("errorMessage", obj).fire();
        } else
        {
            v.b("Failed to load CTA browser, no error string provided");
        }
        t = failtoloadreason;
        if (!ActivityManager.isRunningInTestHarness())
        {
            finish();
        }
    }

    static void a(ActivityCallToActionBrowser activitycalltoactionbrowser, FailToLoadReason failtoloadreason)
    {
        activitycalltoactionbrowser.a(failtoloadreason);
    }

    static WebView b(ActivityCallToActionBrowser activitycalltoactionbrowser)
    {
        return activitycalltoactionbrowser.e;
    }

    static String b(ActivityCallToActionBrowser activitycalltoactionbrowser, String s1)
    {
        activitycalltoactionbrowser.r = s1;
        return s1;
    }

    static SparksEvent c(ActivityCallToActionBrowser activitycalltoactionbrowser, String s1)
    {
        return activitycalltoactionbrowser.c(s1);
    }

    private SparksEvent c(String s1)
    {
        return (new SparksEvent(s1)).put("creativeId", b.c).put("campaignId", b.b).put("provider", b.d).put("type", "webview").put("from", "recs").put("url", r).put("originalUrl", s).put("method", "BUTTON");
    }

    static String c(ActivityCallToActionBrowser activitycalltoactionbrowser)
    {
        return activitycalltoactionbrowser.s;
    }

    static Menu d(ActivityCallToActionBrowser activitycalltoactionbrowser)
    {
        return activitycalltoactionbrowser.f;
    }

    static boolean e(ActivityCallToActionBrowser activitycalltoactionbrowser)
    {
        return activitycalltoactionbrowser.q;
    }

    static boolean f(ActivityCallToActionBrowser activitycalltoactionbrowser)
    {
        activitycalltoactionbrowser.q = true;
        return true;
    }

    static ImageView g(ActivityCallToActionBrowser activitycalltoactionbrowser)
    {
        return activitycalltoactionbrowser.k;
    }

    static ProgressBar h(ActivityCallToActionBrowser activitycalltoactionbrowser)
    {
        return activitycalltoactionbrowser.j;
    }

    static Handler i(ActivityCallToActionBrowser activitycalltoactionbrowser)
    {
        return activitycalltoactionbrowser.d;
    }

    protected final void A_()
    {
        super.A_();
        overridePendingTransition(0x7f04000a, 0);
    }

    public final void a(String s1)
    {
        String s2 = s1;
        if (com.tinder.utils.h.a(s1))
        {
            s2 = getResources().getString(0x7f06010a);
        }
        if (h != null)
        {
            h.setText(s2);
        }
    }

    public void finish()
    {
        c("AdDetails.Close").put("timeViewed", Long.valueOf(System.currentTimeMillis() - i)).fire();
        super.finish();
        c = false;
    }

    public void onBackPressed()
    {
        if (e.canGoBackOrForward(-2))
        {
            e.goBack();
            return;
        } else
        {
            finish();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        ManagerApp.h().a(this);
        if (c)
        {
            a(FailToLoadReason.c);
        }
        c = true;
        setContentView(0x7f03001c);
        bundle = (LinearLayout)LayoutInflater.from(this).inflate(0x7f030000, null);
        getSupportActionBar().setCustomView(bundle);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayUseLogoEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(false);
        ((Toolbar)bundle.getParent()).setContentInsetsAbsolute(0, 0);
        h = (TextView)bundle.findViewById(0x7f0e005c);
        android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {

            final ActivityCallToActionBrowser a;

            public final void onClick(View view)
            {
                a.finish();
            }

            
            {
                a = ActivityCallToActionBrowser.this;
                super();
            }
        };
        h.setOnClickListener(onclicklistener);
        bundle.findViewById(0x7f0e005b).setOnClickListener(onclicklistener);
        boolean flag;
        if (com.tinder.utils.h.b(b.k) && com.tinder.utils.h.b(b.j))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        a(getResources().getString(0x7f06010a));
        j = (ProgressBar)findViewById(0x7f0e00a3);
        k = (ImageView)findViewById(0x7f0e00a2);
        e = (WebView)findViewById(0x7f0e00a1);
        e.setLayerType(2, null);
        e.getSettings().setJavaScriptEnabled(true);
        e.getSettings().setLoadWithOverviewMode(true);
        e.getSettings().setUseWideViewPort(true);
        e.setWebChromeClient(new WebChromeClient() {

            final ActivityCallToActionBrowser a;

            public final void onReceivedTitle(WebView webview, String s1)
            {
                super.onReceivedTitle(webview, s1);
                a.a(webview.getTitle());
            }

            
            {
                a = ActivityCallToActionBrowser.this;
                super();
            }
        });
        e.setWebViewClient(new WebViewClient() {

            final ActivityCallToActionBrowser a;
            private final String b[] = {
                "http", "https", "ftp"
            };

            public final void onPageFinished(WebView webview, String s1)
            {
                super.onPageFinished(webview, s1);
                if (!com.tinder.activities.ActivityCallToActionBrowser.e(a))
                {
                    ActivityCallToActionBrowser.f(a);
                    ActivityCallToActionBrowser.i(a).post(new Runnable(this) {

                        final _cls3 a;

                        public final void run()
                        {
                            com.tinder.utils.a.a().a(1.0D).b(0.0D).a(new g(this) {

                                final _cls1 a;

                                public final void onSpringActivate(e e1)
                                {
                                    com.tinder.activities.ActivityCallToActionBrowser.h(a.a.a).setVisibility(0);
                                    com.tinder.activities.ActivityCallToActionBrowser.g(a.a.a).setVisibility(0);
                                }

                                public final void onSpringAtRest(e e1)
                                {
                                    com.tinder.activities.ActivityCallToActionBrowser.h(a.a.a).setVisibility(8);
                                    com.tinder.activities.ActivityCallToActionBrowser.g(a.a.a).setVisibility(8);
                                }

                                public final void onSpringEndStateChange(e e1)
                                {
                                }

                                public final void onSpringUpdate(e e1)
                                {
                                    ad.a(com.tinder.activities.ActivityCallToActionBrowser.g(a.a.a), (float)Math.min(1.0D, e1.d.a));
                                }

            
            {
                a = _pcls1;
                super();
            }
                            });
                        }

            
            {
                a = _pcls3;
                super();
            }
                    });
                    com.tinder.activities.ActivityCallToActionBrowser.h(a).setVisibility(8);
                }
                ActivityCallToActionBrowser.c(a, "AdDetails.BrowseEnd").put("url", s1).fire();
            }

            public final void onPageStarted(WebView webview, String s1, Bitmap bitmap)
            {
                super.onPageStarted(webview, s1, bitmap);
                if (ActivityCallToActionBrowser.c(a) == null)
                {
                    com.tinder.activities.ActivityCallToActionBrowser.a(a, s1);
                }
                ActivityCallToActionBrowser.b(a, s1);
                a.onPrepareOptionsMenu(ActivityCallToActionBrowser.d(a));
                if (ActivityCallToActionBrowser.b(a).copyBackForwardList().getSize() == 1)
                {
                    com.tinder.activities.ActivityCallToActionBrowser.a(a, System.currentTimeMillis());
                    ActivityCallToActionBrowser.c(a, "AdDetails.Open").fire();
                    return;
                } else
                {
                    ActivityCallToActionBrowser.c(a, "AdDetails.BrowseStart").put("url", s1).fire();
                    return;
                }
            }

            public final void onReceivedError(WebView webview, int l, String s1, String s2)
            {
                com.tinder.activities.ActivityCallToActionBrowser.a(a, FailToLoadReason.d);
            }

            public final void onReceivedHttpAuthRequest(WebView webview, HttpAuthHandler httpauthhandler, String s1, String s2)
            {
                com.tinder.activities.ActivityCallToActionBrowser.a(a, com.tinder.activities.FailToLoadReason.e);
            }

            public final void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
            {
                com.tinder.activities.ActivityCallToActionBrowser.a(a, FailToLoadReason.f);
            }

            public final void onTooManyRedirects(WebView webview, Message message, Message message1)
            {
                com.tinder.activities.ActivityCallToActionBrowser.a(a, com.tinder.activities.FailToLoadReason.g);
            }

            public final boolean shouldOverrideUrlLoading(WebView webview, String s1)
            {
                String s2;
                String as[];
                int l;
                int i1;
                s2 = Uri.parse(s1).getScheme();
                as = b;
                i1 = as.length;
                l = 0;
_L5:
                if (l >= i1)
                {
                    break MISSING_BLOCK_LABEL_114;
                }
                if (!s2.equals(as[l])) goto _L2; else goto _L1
_L1:
                l = 1;
_L3:
                boolean flag1;
                if (com.tinder.activities.ActivityCallToActionBrowser.a(a) != null && s1 != null && s1.equals(com.tinder.activities.ActivityCallToActionBrowser.a(a)))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (flag1 && ActivityCallToActionBrowser.b(a).canGoBack())
                {
                    ActivityCallToActionBrowser.b(a).goBack();
                    return false;
                }
                break MISSING_BLOCK_LABEL_126;
_L2:
                l++;
                continue; /* Loop/switch isn't completed */
                l = 0;
                  goto _L3
                if (l != 0)
                {
                    webview.loadUrl(s1);
                    return true;
                }
                webview = new Intent("android.intent.action.VIEW");
                webview.setData(Uri.parse(s1));
                a.startActivity(webview);
                return true;
                webview;
                webview = Uri.parse(s1).getScheme();
                webview = (new StringBuilder()).append(Character.toUpperCase(webview.charAt(0))).append(webview.substring(1)).toString();
                Toast.makeText(a, String.format(a.getResources().getString(0x7f060253), new Object[] {
                    webview
                }), 0).show();
                return true;
                if (true) goto _L5; else goto _L4
_L4:
            }

            
            {
                a = ActivityCallToActionBrowser.this;
                super();
            }
        });
        if (getIntent().getExtras() == null)
        {
            a(com.tinder.activities.FailToLoadReason.a);
        } else
        {
            bundle = getIntent().getExtras().getString(a);
            if (bundle != null && !bundle.trim().isEmpty())
            {
                e.loadUrl(bundle);
            } else
            {
                a(FailToLoadReason.b);
            }
        }
        c = true;
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f0f0000, menu);
        f = menu;
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR tableswitch 2131624829 2131624829: default 24
    //                   2131624829 26;
           goto _L1 _L2
_L1:
        return true;
_L2:
        menuitem = new Intent("android.intent.action.SEND");
        menuitem.setType("text/plain");
        menuitem.putExtra("android.intent.extra.SUBJECT", b.j);
        menuitem.putExtra("android.intent.extra.TEXT", (new StringBuilder()).append(b.j).append(' ').append(b.k).toString());
        startActivity(Intent.createChooser(menuitem, getResources().getText(0x7f06010c)));
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onPause()
    {
        ad.a(e.getWindowToken(), this);
        super.onPause();
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        if (f != null)
        {
            menu = menu.findItem(0x7f0e037d);
            menu.getIcon().setColorFilter(getResources().getColor(0x7f0d0002), android.graphics.PorterDuff.Mode.SRC_ATOP);
            menu.setVisible(g);
        }
        return true;
    }

    protected final void y_()
    {
        super.y_();
        overridePendingTransition(0, 0x7f04000b);
    }

}
