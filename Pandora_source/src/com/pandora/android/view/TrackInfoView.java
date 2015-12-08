// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.content.j;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.pandora.android.activity.BaseFragmentActivity;
import com.pandora.android.tablet.TabletHome;
import com.pandora.android.util.p;
import com.pandora.android.util.s;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.af;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.y;
import com.pandora.radio.provider.i;
import com.pandora.radio.util.NetworkUtil;
import java.security.InvalidParameterException;
import java.util.Locale;
import org.json.JSONObject;
import p.bz.v;
import p.ca.ae;
import p.cp.b;
import p.cp.d;
import p.cx.ab;
import p.dd.at;
import p.dd.ay;
import p.dd.bh;
import p.df.a;

public class TrackInfoView extends WebView
{
    public static interface a
    {

        public abstract void a(String s1);
    }

    public static interface b
    {

        public abstract boolean a(WebView webview, String s1);
    }

    private class c
    {

        aa a;
        final TrackInfoView b;

        public void a()
        {
            com.pandora.android.provider.b.a.b().c(this);
        }

        public void onStationData(at at1)
        {
            com.pandora.android.view.TrackInfoView.a(b, at1.a);
        }

        public void onStationStateChange(ay ay1)
        {
            static class _cls2
            {

                static final int a[];

                static 
                {
                    a = new int[p.dd.ay.a.values().length];
                    try
                    {
                        a[p.dd.ay.a.c.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[p.dd.ay.a.d.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[p.dd.ay.a.b.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[p.dd.ay.a.a.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (com.pandora.android.view._cls2.a[ay1.b.ordinal()])
            {
            default:
                throw new InvalidParameterException((new StringBuilder()).append("onStationStateChange called with unknown stationStateChangeType: ").append(ay1.b).toString());

            case 3: // '\003'
            case 4: // '\004'
                b.clearView();
                // fall through

            case 1: // '\001'
            case 2: // '\002'
                return;
            }
        }

        public void onTrackState(bh bh1)
        {
            a = bh1.b;
            if (aa.a(a) && TrackInfoView.c(b) != null)
            {
                TrackInfoView.c(b).a(TrackInfoView.c(b).j(), a, com.pandora.android.view.TrackInfoView.a(b));
            }
        }

        public c()
        {
            b = TrackInfoView.this;
            super();
            com.pandora.android.provider.b.a.b().b(this);
        }
    }

    private static class d extends p.cp.a
    {

        private TrackInfoView a;

        public void onReceivedTitle(WebView webview, String s1)
        {
label0:
            {
                webview = a.getOnTitleChangeListener();
                if (webview != null)
                {
                    if (!"Webpage not available".equalsIgnoreCase(s1))
                    {
                        break label0;
                    }
                    webview.a("");
                }
                return;
            }
            if (p.cp.b.h(s1))
            {
                webview.a("");
                return;
            } else
            {
                webview.a(s1);
                return;
            }
        }

        private d(TrackInfoView trackinfoview)
        {
            a = trackinfoview;
        }

    }

    public class e extends p.cp.d
    {

        final TrackInfoView a;
        private BaseFragmentActivity b;
        private b c;
        private WebView d;

        public void a(int i1)
        {
            DisplayMetrics displaymetrics = s.t();
            if (i1 > 0)
            {
                android.view.ViewGroup.LayoutParams layoutparams = a.getLayoutParams();
                float f1 = i1;
                layoutparams.height = (int)(displaymetrics.density * f1);
                p.df.a.c("TrackInfoWebView", (new StringBuilder()).append("bannerHeightListener ").append(layoutparams.height).toString());
                a.setLayoutParams(layoutparams);
                return;
            } else
            {
                f();
                return;
            }
        }

        protected void a(String s1, String s2)
        {
            ab.a().a(new Runnable(this, s2, s1) {

                final String a;
                final String b;
                final e c;

                public void run()
                {
                    p.cw.c c1 = com.pandora.android.provider.b.a.b();
                    if (s.a(a) && s.a(b) && c1.d().p())
                    {
                        c1.d().a(p.cw.b.c.a);
                    } else
                    {
                        if (com.pandora.android.view.TrackInfoView.a(c.a) == null)
                        {
                            com.pandora.android.view.TrackInfoView.a(c.a, c1.y().a(com.pandora.android.provider.b.a.h(), a));
                        }
                        if (com.pandora.android.view.TrackInfoView.a(c.a) != null && com.pandora.android.view.TrackInfoView.a(c.a).A() && (s.a(a) || com.pandora.android.view.TrackInfoView.a(c.a).h().equals(a)))
                        {
                            com.pandora.android.activity.a.a(com.pandora.android.view.TrackInfoView.a(c.a), b, true, false, p.cw.b.b.c, null);
                            return;
                        }
                    }
                }

            
            {
                c = e1;
                a = s1;
                b = s2;
                super();
            }
            });
        }

        protected void a(String s1, String s2, String s3, String s4, String s5, String s6)
        {
            if (s.u())
            {
                s3 = (new StringBuilder()).append(s1);
                if (s1.contains("?"))
                {
                    s2 = "&pat=";
                } else
                {
                    s2 = "?pat=";
                }
                s3 = s3.append(s2).append(s.b(com.pandora.android.provider.b.a.d().b())).toString();
                s2 = new Bundle();
                s2.putSerializable("intent_detail_url", s1);
                s1 = null;
                if (s3.indexOf("artist_detail") != -1)
                {
                    s1 = p.D;
                } else
                if (s3.indexOf("track_detail") != -1)
                {
                    s1 = p.C;
                } else
                if (s3.indexOf("album_detail") != -1)
                {
                    s1 = p.E;
                }
                if (s1 == null)
                {
                    return;
                } else
                {
                    com.pandora.android.provider.b.a.C().a(TabletHome.a(s1, s2));
                    return;
                }
            } else
            {
                com.pandora.android.provider.b.a.b().k().e(System.currentTimeMillis());
                super.a(s1, s2, s3, s4, s5, s6);
                return;
            }
        }

        protected void a(JSONObject jsonobject)
        {
            super.a(jsonobject);
            if (jsonobject.has("trackUnavailable"))
            {
                boolean flag;
                if (!jsonobject.optBoolean("trackUnavailable"))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.pandora.android.provider.b.a.e().a(new v(flag));
            }
        }

        public boolean a()
        {
            return true;
        }

        public boolean a(boolean flag)
        {
            return false;
        }

        protected void b(String s1, String s2)
        {
            if (com.pandora.android.view.TrackInfoView.a(a) == null || !com.pandora.android.view.TrackInfoView.a(a).c().equals(s1))
            {
                return;
            } else
            {
                com.pandora.android.provider.b.a.b().d().a(com.pandora.android.view.TrackInfoView.a(a).c(), s2);
                return;
            }
        }

        public void d()
        {
            g().setResult(-1);
            g().finish();
        }

        public void e()
        {
        }

        public void f()
        {
            d();
        }

        public BaseFragmentActivity g()
        {
            return b;
        }

        public aa i()
        {
            return com.pandora.android.view.TrackInfoView.b(a).a;
        }

        public WebView j()
        {
            return d;
        }

        public void onPageFinished(WebView webview, String s1)
        {
            p.df.a.a("TrackInfoWebView", (new StringBuilder()).append("TrackInfoView.onPageFinished; url = ").append(s1).toString());
            if (c != null && c.a(webview, s1))
            {
                d();
            }
            super.onPageFinished(webview, s1);
            webview.setVisibility(0);
            webview = a;
            if (webview.b())
            {
                webview.a(s1);
            } else
            {
                try
                {
                    CookieSyncManager.getInstance().sync();
                    if (l())
                    {
                        s.k();
                    }
                    s1 = i();
                    if (aa.a(s1))
                    {
                        p.df.a.a("TrackInfoWebView", "onPageFinished.pushCurrentTrackData");
                        a(webview, s1, com.pandora.android.view.TrackInfoView.a(a));
                        return;
                    }
                }
                // Misplaced declaration of an exception variable
                catch (WebView webview)
                {
                    return;
                }
            }
        }

        public void onPageStarted(WebView webview, String s1, Bitmap bitmap)
        {
            if (c != null && c.a(webview, s1))
            {
                d();
            }
            super.onPageStarted(webview, s1, bitmap);
            if (com.pandora.android.view.TrackInfoView.a(a) != null && com.pandora.android.view.TrackInfoView.a(a).A())
            {
                com.pandora.android.provider.b.a.e().a(new v(true));
            }
        }

        public void onReceivedError(WebView webview, int i1, String s1, String s2)
        {
            p.df.a.a("TrackInfoWebView", (new StringBuilder()).append("onReceivedError; errorCode = ").append(i1).append("; description = ").append(s1).append("; failingUrl = ").append(s2).toString());
            s1 = a;
            s1.setWebViewReceivedError(true);
            s1.setWebViewFailingUrl(s2);
            try
            {
                webview.stopLoading();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
            try
            {
                webview.clearView();
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview) { }
            a.a(null, a.getDefaultWebErrorPage(), true);
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s1)
        {
            p.df.a.a("TrackInfoWebView", (new StringBuilder()).append("shouldOverrideUrlLoading: ").append(s1).toString());
            if (c != null && c.a(webview, s1))
            {
                d();
            } else
            if (!s1.equalsIgnoreCase("about:blank"))
            {
                if (!com.pandora.android.provider.b.a.b().u().b())
                {
                    a.setWebViewFailingUrl(s1);
                    a.a(null, a.getDefaultWebErrorPage(), true);
                    return true;
                } else
                {
                    return super.shouldOverrideUrlLoading(webview, s1);
                }
            }
            return true;
        }

        public e(BaseFragmentActivity basefragmentactivity, b b1, WebView webview)
        {
            a = TrackInfoView.this;
            super(basefragmentactivity, webview);
            b = basefragmentactivity;
            c = b1;
            d = webview;
        }
    }


    protected p.cp.d a;
    protected int b;
    protected String c;
    protected String d;
    protected boolean e;
    protected b f;
    private int g;
    private String h;
    private boolean i;
    private a j;
    private ae k;
    private y l;
    private String m;
    private int n;
    private c o;
    private e p;

    public TrackInfoView(Context context)
    {
        super(context);
        g = 0;
        e = false;
        f = null;
        k = new ae();
        n = -1;
    }

    public TrackInfoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        g = 0;
        e = false;
        f = null;
        k = new ae();
        n = -1;
    }

    public TrackInfoView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        g = 0;
        e = false;
        f = null;
        k = new ae();
        n = -1;
    }

    public static TrackInfoView a(Context context, boolean flag, int i1)
    {
        context = new TrackInfoView(context);
        context.a(flag, i1);
        return context;
    }

    static y a(TrackInfoView trackinfoview)
    {
        return trackinfoview.l;
    }

    static y a(TrackInfoView trackinfoview, y y1)
    {
        trackinfoview.l = y1;
        return y1;
    }

    private void a(int i1)
    {
        Activity activity = (Activity)getContext();
        if (activity != null)
        {
            activity.setResult(i1);
            activity.finish();
        }
    }

    private boolean a(aa aa1, int i1)
    {
        while (!s.u() || m == null || aa1 == null || !m.equals(aa1.w()) || n != i1) 
        {
            return true;
        }
        return false;
    }

    static c b(TrackInfoView trackinfoview)
    {
        return trackinfoview.o;
    }

    static e c(TrackInfoView trackinfoview)
    {
        return trackinfoview.p;
    }

    protected p.cp.d a(BaseFragmentActivity basefragmentactivity)
    {
        p = new e(basefragmentactivity, f, this);
        return p;
    }

    public p.cp.d a(boolean flag, int i1, android.webkit.WebSettings.ZoomDensity zoomdensity, boolean flag1)
    {
        p.cp.d d1 = a(flag, i1, flag1);
        getSettings().setDefaultZoom(zoomdensity);
        return d1;
    }

    protected p.cp.d a(boolean flag, int i1, boolean flag1)
    {
        setBackgroundColor(i1);
        WebSettings websettings = getSettings();
        websettings.setSupportZoom(flag1);
        websettings.setBuiltInZoomControls(flag1);
        setScrollBarStyle(0);
        if (flag)
        {
            websettings.setCacheMode(2);
        }
        setWebChromeClient(new d(this));
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        setOnLongClickListener(new android.view.View.OnLongClickListener() {

            final TrackInfoView a;

            public boolean onLongClick(View view)
            {
                return true;
            }

            
            {
                a = TrackInfoView.this;
                super();
            }
        });
        a = a((BaseFragmentActivity)getContext());
        a.b(false);
        return a;
    }

    public void a()
    {
        setWebViewReceivedError(false);
    }

    public void a(aa aa1, int i1, String s1)
    {
        p.df.a.a("TrackInfoWebView", (new StringBuilder()).append("TrackInfoView.onTrackSelected - ").append(aa1.w()).append(" trackPosition:").append(i1).toString());
        if (a(aa1, i1)) goto _L2; else goto _L1
_L1:
        p.df.a.a("TrackInfoWebView", (new StringBuilder()).append("not reloading - already loaded ").append(aa1.w()).append(" trackPosition:").append(i1).toString());
_L4:
        return;
_L2:
        m = aa1.w();
        n = i1;
        String s2;
        String s3;
        s3 = p.cp.b.a(aa1);
        if (p.cp.b.d(s3) < 3)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (l == null)
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = l.h();
_L5:
        aa1 = p.cp.b.a(s3, s2, s1, aa1.W());
        p.df.a.c("TrackInfoWebView", (new StringBuilder()).append("trackInfoURL :").append(aa1).toString());
        if (!s.a(aa1))
        {
            a(true, b, android.webkit.WebSettings.ZoomDensity.MEDIUM, false);
            a(((String) (aa1)), ((String) (null)), false, 0);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        try
        {
            s2 = aa1.r();
        }
        // Misplaced declaration of an exception variable
        catch (aa aa1)
        {
            p.df.a.c("TrackInfoWebView", "Error setting track info view.", aa1);
            return;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public void a(String s1)
    {
        p.df.a.a("TrackInfoWebView", (new StringBuilder()).append("TrackInfoView.handlePageLoadError retryCount:").append(g).toString());
        a();
        if (g < 3)
        {
            g = g + 1;
            a(s1, ((String) (null)), true, g);
            return;
        } else
        {
            a(((String) (null)), getDefaultWebErrorPage(), true);
            return;
        }
    }

    public void a(String s1, String s2, boolean flag)
    {
        a(s1, s2, flag, 0);
    }

    public void a(String s1, String s2, boolean flag, int i1)
    {
        boolean flag1;
        if (s1 == null && s2 != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (i1 == 0)
        {
            a();
            g = 0;
        }
        try
        {
            if (e)
            {
                setVisibility(4);
            }
        }
        catch (Exception exception)
        {
            setVisibility(0);
            StringBuilder stringbuilder = (new StringBuilder()).append("TrackInfoView can't load ");
            if (flag1)
            {
                s1 = (new StringBuilder()).append("url: ").append(s1).toString();
            } else
            {
                s1 = (new StringBuilder()).append("rawHtml: ").append(s2).toString();
            }
            p.df.a.c("TrackInfoWebView", stringbuilder.append(s1).toString(), exception);
            a(-1);
            return;
        }
        if (!flag1) goto _L2; else goto _L1
_L1:
        p.df.a.a("TrackInfoWebView", String.format(Locale.US, "loadWebView (%d), HTML %s", new Object[] {
            Integer.valueOf(getId()), s2
        }));
        loadDataWithBaseURL(null, s2, "text/html", "utf-8", null);
_L4:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        s.j();
        return;
_L2:
        p.df.a.a("TrackInfoWebView", String.format(Locale.US, "loadWebView (%d), navigating to %s", new Object[] {
            Integer.valueOf(getId()), s1
        }));
        loadUrl(s1);
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void a(boolean flag, int i1)
    {
        e = flag;
        a(false, i1, true);
        getSettings().setJavaScriptEnabled(true);
        if (!s.a(c) || !s.a(d))
        {
            a(c, d, true);
        }
        setTag("trackInfoView");
    }

    public boolean b()
    {
        return i;
    }

    public String getDefaultWebErrorPage()
    {
        String s3 = s.b(com.pandora.android.provider.b.a.h(), 0x7f070006);
        String s2 = getWebViewFailingUrl();
        String s1 = s2;
        if (s2 == null)
        {
            s1 = "#";
        }
        if (s3.indexOf("$__reload_url__$") != -1)
        {
            return s3.replace("$__reload_url__$", s1);
        } else
        {
            return s3;
        }
    }

    public a getOnTitleChangeListener()
    {
        return j;
    }

    public String getWebViewFailingUrl()
    {
        return h;
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        k.a((Activity)getContext());
        o = new c();
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        k.b();
        o.a();
        o = null;
    }

    public void setOnTitleChangeListener(a a1)
    {
        j = a1;
    }

    public void setWebViewFailingUrl(String s1)
    {
        h = s1;
    }

    public void setWebViewReceivedError(boolean flag)
    {
        i = flag;
    }
}
