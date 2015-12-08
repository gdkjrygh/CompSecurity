// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieSyncManager;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pandora.android.activity.BaseFragmentActivity;
import com.pandora.android.data.l;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.android.view.PandoraWebView;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.y;
import com.pandora.radio.provider.i;
import com.pandora.radio.util.NetworkUtil;
import java.util.Locale;
import p.bz.k;
import p.cp.d;
import p.cw.c;
import p.cx.ab;
import p.dd.bh;
import p.df.a;

// Referenced classes of package p.ca:
//            o

public class ac extends o
{
    public static interface a
    {

        public abstract void a(String s1);
    }

    private static class b extends p.cp.a
    {

        private ac a;

        public void onReceivedTitle(WebView webview, String s1)
        {
label0:
            {
                webview = a.x();
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

        private b(ac ac1)
        {
            a = ac1;
        }

    }

    public class c extends p.cp.d
    {

        private BaseFragmentActivity a;
        private d b;
        final ac d;

        public void a(int i1)
        {
            DisplayMetrics displaymetrics = com.pandora.android.util.s.t();
            if (i1 > 0)
            {
                PandoraWebView pandorawebview = d.B();
                android.view.ViewGroup.LayoutParams layoutparams = pandorawebview.getLayoutParams();
                float f1 = i1;
                layoutparams.height = (int)(displaymetrics.density * f1);
                p.df.a.c("PandoraWebViewFragment", (new StringBuilder()).append("bannerHeightListener ").append(layoutparams.height).toString());
                pandorawebview.setLayoutParams(layoutparams);
                return;
            } else
            {
                f();
                return;
            }
        }

        protected void a(String s1, String s2)
        {
            super.a(s1, s2);
            ab.a().a(new Runnable(this, s2) {

                final String a;
                final c b;

                public void run()
                {
                    if (p.ca.ac.a(b.d) == null)
                    {
                        p.cw.c c1 = com.pandora.android.provider.b.a.b();
                        p.ca.ac.a(b.d, c1.y().a(com.pandora.android.provider.b.a.h(), a));
                    }
                }

            
            {
                b = c1;
                a = s1;
                super();
            }
            });
        }

        public boolean a(boolean flag)
        {
            return false;
        }

        public void d()
        {
            i().setResult(-1);
            i().finish();
        }

        public void e()
        {
        }

        public void f()
        {
            d();
        }

        public BaseFragmentActivity i()
        {
            return a;
        }

        public aa j()
        {
            return d.r.a;
        }

        public void onPageFinished(WebView webview, String s1)
        {
            if (com.pandora.android.provider.b.a.e() != null && p.ca.ac.b(d) != null)
            {
                com.pandora.android.provider.b.a.e().a(new p.bz.l(p.ca.ac.b(d)));
            }
            if (b != null && b.a(webview, s1))
            {
                d();
            }
            super.onPageFinished(webview, s1);
            webview.setVisibility(0);
            webview = d;
            if (webview.q())
            {
                webview.c(s1);
            } else
            {
                try
                {
                    CookieSyncManager.getInstance().sync();
                    if (l())
                    {
                        com.pandora.android.util.s.k();
                    }
                    webview = j();
                    if (aa.a(webview))
                    {
                        p.df.a.a("PandoraWebViewFragment", "onPageFinished.pushCurrentTrackData");
                        a(p.ca.ac.c(d), webview, p.ca.ac.a(d));
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
            if (b != null && b.a(webview, s1))
            {
                d();
            }
            super.onPageStarted(webview, s1, bitmap);
        }

        public void onReceivedError(WebView webview, int i1, String s1, String s2)
        {
            p.df.a.a("PandoraWebViewFragment", (new StringBuilder()).append("onReceivedError; errorCode = ").append(i1).append("; description = ").append(s1).append("; failingUrl = ").append(s2).toString());
            s1 = d;
            s1.c(true);
            s1.b(s2);
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
            d.a(null, d.z(), true);
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s1)
        {
            if (b != null && b.a(webview, s1))
            {
                d();
            } else
            if (!s1.equalsIgnoreCase("about:blank"))
            {
                if (!com.pandora.android.provider.b.a.b().u().b())
                {
                    d.b(s1);
                    d.a(null, d.z(), true);
                    return true;
                } else
                {
                    return super.shouldOverrideUrlLoading(webview, s1);
                }
            }
            return true;
        }

        public c(BaseFragmentActivity basefragmentactivity, d d1, WebView webview)
        {
            d = ac.this;
            super(basefragmentactivity, webview);
            a = basefragmentactivity;
            b = d1;
        }
    }

    public static interface d
    {

        public abstract boolean a(WebView webview, String s1);
    }

    class e
    {

        aa a;
        final ac b;

        public void onTrackState(bh bh1)
        {
            a = bh1.b;
            if (aa.a(a) && b.l != null && p.ca.ac.c(b) != null)
            {
                b.l.a(p.ca.ac.c(b), a, p.ca.ac.a(b));
            }
        }

        e()
        {
            b = ac.this;
            super();
        }
    }


    private boolean a;
    private boolean b;
    private PandoraWebView c;
    private boolean d;
    private a e;
    private boolean f;
    private String g;
    private boolean h;
    protected p.cp.d l;
    protected int m;
    protected String n;
    protected String o;
    protected boolean p;
    protected d q;
    e r;
    private boolean s;
    private boolean t;
    private int u;
    private l v;
    private y w;

    public ac()
    {
        p = false;
        q = null;
        u = 0;
    }

    static y a(ac ac1)
    {
        return ac1.w;
    }

    static y a(ac ac1, y y1)
    {
        ac1.w = y1;
        return y1;
    }

    private static ac a(l l1, String s1, String s2, boolean flag, int i)
    {
        ac ac1 = new ac();
        Bundle bundle = new Bundle();
        if (!com.pandora.android.util.s.a(s1))
        {
            bundle.putString("intent_uri", s1);
        }
        if (!com.pandora.android.util.s.a(s2))
        {
            bundle.putString("intent_html_content", s2);
        }
        if (l1 != null)
        {
            bundle.putSerializable("pandora.landing_page_data", l1);
        }
        bundle.putBoolean("intent_disable_webview_cache", flag);
        bundle.putInt("intent_color", i);
        ac1.setArguments(bundle);
        return ac1;
    }

    public static ac a(String s1, String s2, boolean flag, int i)
    {
        return a(null, s1, s2, flag, i);
    }

    static l b(ac ac1)
    {
        return ac1.v;
    }

    public static ac b(String s1, boolean flag, int i)
    {
        return a(s1, ((String) (null)), flag, i);
    }

    private void b(WebView webview, Bundle bundle)
    {
        if (webview != null)
        {
            a(a, m, true);
            WebSettings websettings = webview.getSettings();
            websettings.setSavePassword(h);
            websettings.setSaveFormData(s);
            websettings.setJavaScriptEnabled(t);
            if (!a(webview, bundle) && (!com.pandora.android.util.s.a(n) || !com.pandora.android.util.s.a(o)))
            {
                a(n, o, true);
                return;
            }
        }
    }

    static PandoraWebView c(ac ac1)
    {
        return ac1.c;
    }

    public BaseFragmentActivity A()
    {
        return (BaseFragmentActivity)super.getActivity();
    }

    public PandoraWebView B()
    {
        if (d)
        {
            return c;
        } else
        {
            return null;
        }
    }

    protected void C()
    {
        if (c != null)
        {
            c.clearHistory();
        }
    }

    protected void D()
    {
        if (c != null && android.os.Build.VERSION.SDK_INT < 16)
        {
            c.requestFocus(130);
            c.setOnTouchListener(new android.view.View.OnTouchListener() {

                final ac a;

                public boolean onTouch(View view, MotionEvent motionevent)
                {
                    motionevent.getAction();
                    JVM INSTR tableswitch 0 1: default 28
                //                               0 30
                //                               1 30;
                       goto _L1 _L2 _L2
_L1:
                    return false;
_L2:
                    if (!view.hasFocus())
                    {
                        view.requestFocus();
                    }
                    if (true) goto _L1; else goto _L3
_L3:
                }

            
            {
                a = ac.this;
                super();
            }
            });
        }
    }

    protected p.cp.d a(BaseFragmentActivity basefragmentactivity, WebView webview)
    {
        return new c(basefragmentactivity, q, webview);
    }

    public p.cp.d a(boolean flag, int i, android.webkit.WebSettings.ZoomDensity zoomdensity, boolean flag1)
    {
        p.cp.d d1 = a(flag, i, flag1);
        B().getSettings().setDefaultZoom(zoomdensity);
        return d1;
    }

    protected p.cp.d a(boolean flag, int i, boolean flag1)
    {
        PandoraWebView pandorawebview;
        Object obj;
        pandorawebview = B();
        pandorawebview.setBackgroundColor(i);
        obj = pandorawebview.getSettings();
        ((WebSettings) (obj)).setSupportZoom(flag1);
        ((WebSettings) (obj)).setBuiltInZoomControls(flag1);
        pandorawebview.setScrollBarStyle(0);
        if (flag)
        {
            ((WebSettings) (obj)).setCacheMode(2);
        }
        pandorawebview.setWebChromeClient(new b(this));
        obj = (ViewGroup)pandorawebview.getParent();
        if (!(obj instanceof FrameLayout)) goto _L2; else goto _L1
_L1:
        pandorawebview.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
_L4:
        pandorawebview.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            final ac a;

            public boolean onLongClick(View view)
            {
                return true;
            }

            
            {
                a = ac.this;
                super();
            }
        });
        l = a(A(), ((WebView) (pandorawebview)));
        l.b(false);
        return l;
_L2:
        if (obj instanceof LinearLayout)
        {
            pandorawebview.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void a(Bundle bundle)
    {
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        v = (l)bundle.getSerializable("pandora.landing_page_data");
        if (v != null)
        {
            n = v.a();
            o = v.b();
            a = bundle.getBoolean("intent_disable_webview_cache", false);
            m = v.c();
        } else
        {
            n = bundle.getString("intent_uri");
            o = bundle.getString("intent_html_content");
            a = bundle.getBoolean("intent_disable_webview_cache", false);
            m = bundle.getInt("intent_color", -1);
        }
        h = bundle.getBoolean("intent_web_view_save_password", false);
        s = bundle.getBoolean("intent_web_view_save_form_data", false);
        t = bundle.getBoolean("intent_web_view_enable_javascript", true);
        if (!bundle.containsKey("intent_web_view_client_class"))
        {
            break MISSING_BLOCK_LABEL_136;
        }
        bundle = (Class)bundle.getSerializable("intent_web_view_client_class");
        q = (d)bundle.newInstance();
        return;
        bundle;
        p.df.a.c("PandoraWebViewFragment", "Failed to create the WebViewClientListener although one was specified in intent", bundle);
        return;
    }

    public void a(aa aa, y y1)
    {
        if (l != null)
        {
            l.a(c, aa, y1);
        }
    }

    public void a(String s1, String s2, boolean flag)
    {
        b(s1, s2, flag, 0);
    }

    public void a(a a1)
    {
        e = a1;
    }

    protected boolean a(WebView webview, Bundle bundle)
    {
        return false;
    }

    public void b(String s1)
    {
        g = s1;
    }

    public void b(String s1, String s2, boolean flag, int i)
    {
        Object obj;
        boolean flag1;
        if (s1 == null && s2 != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (i == 0)
        {
            y();
            u = 0;
        }
        obj = B();
        if (obj == null)
        {
            p.df.a.c("PandoraWebViewFragment", "Yikes! loadWebView called but there's no webview");
            return;
        }
        try
        {
            if (p)
            {
                ((WebView) (obj)).setVisibility(4);
            }
        }
        catch (Exception exception)
        {
            ((WebView) (obj)).setVisibility(0);
            obj = (new StringBuilder()).append("PandoraWebViewFragment can't load ");
            if (flag1)
            {
                s1 = (new StringBuilder()).append("url: ").append(s1).toString();
            } else
            {
                s1 = (new StringBuilder()).append("rawHtml: ").append(s2).toString();
            }
            p.df.a.c("PandoraWebViewFragment", ((StringBuilder) (obj)).append(s1).toString(), exception);
            e();
            return;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        p.df.a.a("PandoraWebViewFragment", String.format(Locale.US, "loadWebView (%d), HTML %s", new Object[] {
            Integer.valueOf(getId()), s2
        }));
        ((WebView) (obj)).loadDataWithBaseURL(null, s2, "text/html", "utf-8", null);
_L1:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        com.pandora.android.util.s.j();
        b = true;
        return;
        p.df.a.a("PandoraWebViewFragment", String.format(Locale.US, "loadWebView (%d), navigating to %s", new Object[] {
            Integer.valueOf(getId()), s1
        }));
        ((WebView) (obj)).loadUrl(s1);
          goto _L1
    }

    public void b(String s1, boolean flag)
    {
        a(s1, ((String) (null)), flag);
    }

    public void c(String s1)
    {
        p.df.a.a("PandoraWebViewFragment", (new StringBuilder()).append("PandoraWebViewFragment.handlePageLoadError retryCount:").append(u).toString());
        y();
        if (u < 3)
        {
            u = u + 1;
            b(s1, null, true, u);
            return;
        } else
        {
            a(((String) (null)), z(), true);
            return;
        }
    }

    public void c(boolean flag)
    {
        f = flag;
    }

    public void e()
    {
        super.a(-1);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a(getArguments());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        r = new e();
        com.pandora.android.provider.b.a.b().b(r);
        if (c != null)
        {
            c.destroy();
        }
        c = new PandoraWebView(getActivity());
        c.setId(0x7f100011);
        com.pandora.android.util.s.a(c, false);
        d = true;
        b(c, bundle);
        return c;
    }

    public void onDestroy()
    {
        if (v != null && com.pandora.android.provider.b.a.e() != null)
        {
            com.pandora.android.provider.b.a.e().a(new k(v));
        }
        if (c != null)
        {
            if (c.getParent() != null)
            {
                ((ViewGroup)c.getParent()).removeView(c);
            }
            c.removeAllViews();
            c.destroy();
            c = null;
        }
        super.onDestroy();
    }

    public void onDestroyView()
    {
        d = false;
        com.pandora.android.provider.b.a.b().c(r);
        super.onDestroyView();
    }

    public boolean p()
    {
        return b;
    }

    public boolean q()
    {
        return f;
    }

    public String r()
    {
        return g;
    }

    protected void s()
    {
        PandoraWebView pandorawebview = B();
        if (pandorawebview != null)
        {
            pandorawebview.clearView();
        }
    }

    protected void t()
    {
        if (B() != null && (!com.pandora.android.util.s.a(n) || !com.pandora.android.util.s.a(o)))
        {
            a(a, m, true);
            WebSettings websettings = c.getSettings();
            websettings.setSavePassword(h);
            websettings.setSaveFormData(s);
            websettings.setJavaScriptEnabled(t);
            a(n, o, true);
        }
    }

    public boolean u()
    {
        if (!w())
        {
            return false;
        }
        Object obj = B().copyBackForwardList();
        int i = ((WebBackForwardList) (obj)).getCurrentIndex();
        if (((WebBackForwardList) (obj)).getSize() > 1)
        {
            obj = ((WebBackForwardList) (obj)).getItemAtIndex(i - 1);
            if (obj != null)
            {
                n = ((WebHistoryItem) (obj)).getUrl();
                if (e != null)
                {
                    e.a(((WebHistoryItem) (obj)).getTitle());
                }
            }
        }
        B().goBack();
        return true;
    }

    public boolean w()
    {
        PandoraWebView pandorawebview = B();
        if (pandorawebview == null)
        {
            return false;
        } else
        {
            return pandorawebview.canGoBack();
        }
    }

    public a x()
    {
        return e;
    }

    public void y()
    {
        c(false);
    }

    public String z()
    {
        String s3 = com.pandora.android.util.s.b(com.pandora.android.provider.b.a.h(), 0x7f070006);
        String s2 = r();
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
}
