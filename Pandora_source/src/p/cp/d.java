// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.j;
import android.support.v4.view.e;
import android.telephony.TelephonyManager;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieSyncManager;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.pandora.android.activity.HomeTabsActivity;
import com.pandora.android.activity.InAppLandingPageActivity;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.activity.PandoraIntentFilter;
import com.pandora.android.ads.VideoAdManager;
import com.pandora.android.ads.c;
import com.pandora.android.ads.g;
import com.pandora.android.data.l;
import com.pandora.android.data.o;
import com.pandora.android.data.p;
import com.pandora.android.data.q;
import com.pandora.android.data.t;
import com.pandora.android.util.f;
import com.pandora.android.util.s;
import com.pandora.android.util.w;
import com.pandora.android.view.PandoraWebView;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.af;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.ai;
import com.pandora.radio.data.b;
import com.pandora.radio.data.y;
import com.pandora.radio.util.NetworkUtil;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.cm.ab;
import p.cm.am;
import p.cm.n;
import p.cm.r;
import p.cr.k;
import p.dd.bh;
import p.df.a;
import p.dg.i;

// Referenced classes of package p.cp:
//            c, b

public class p.cp.d extends WebViewClient
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        private static final a k[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(p/cp/d$a, s1);
        }

        public static a[] values()
        {
            return (a[])k.clone();
        }

        static 
        {
            a = new a("PANDORA_APP", 0);
            b = new a("PANDORA_IPHONE_APP", 1);
            c = new a("PANDORA_BROWSER", 2);
            d = new a("PANDORA_SCHEME", 3);
            e = new a("PANDORA_INTERNAL_SCHEME", 4);
            f = new a("TELEPHONE", 5);
            g = new a("PANDORA_INTERNAL_SCHEME_OFFER_UPGRADE", 6);
            h = new a("PANDORA_START_VALUE_EXCHANGE", 7);
            i = new a("PANDORA_STAGE_OPEN_PAGE", 8);
            j = new a("PANDORA_STAGE_SCHEME", 9);
            k = (new a[] {
                a, b, c, d, e, f, g, h, i, j
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        private static final b c[];

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(p/cp/d$b, s1);
        }

        public static b[] values()
        {
            return (b[])c.clone();
        }

        static 
        {
            a = new b("Javascript", 0);
            b = new b("Script", 1);
            c = (new b[] {
                a, b
            });
        }

        private b(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    private class c
        implements android.view.GestureDetector.OnGestureListener
    {

        final p.cp.d a;

        public boolean onDown(MotionEvent motionevent)
        {
            return false;
        }

        public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
        {
            return false;
        }

        public void onLongPress(MotionEvent motionevent)
        {
        }

        public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
        {
            return false;
        }

        public void onShowPress(MotionEvent motionevent)
        {
        }

        public boolean onSingleTapUp(MotionEvent motionevent)
        {
            a.c(true);
            return false;
        }

        private c()
        {
            a = p.cp.d.this;
            super();
        }

    }

    protected static interface d
    {
    }

    protected static final class e extends Enum
    {

        public static final e a;
        public static final e b;
        public static final e c;
        private static final e d[];

        public static e a(String s1)
        {
            if (a.toString().equalsIgnoreCase(s1))
            {
                return a;
            }
            if (b.toString().equalsIgnoreCase(s1))
            {
                return b;
            } else
            {
                return c;
            }
        }

        public static e valueOf(String s1)
        {
            return (e)Enum.valueOf(p/cp/d$e, s1);
        }

        public static e[] values()
        {
            return (e[])d.clone();
        }

        static 
        {
            a = new e("TRACK", 0);
            b = new e("STATION", 1);
            c = new e("NONE", 2);
            d = (new e[] {
                a, b, c
            });
        }

        private e(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    private static class f
    {

        private WeakReference a;

        public void onStartValueExchangeEvent(p.bz.s s1)
        {
            com.pandora.android.provider.b.a.e().b(this);
            HashMap hashmap = new HashMap();
            Object obj;
            if (s1.a)
            {
                obj = "true";
            } else
            {
                obj = "false";
            }
            hashmap.put("success", obj);
            for (obj = (p.cp.d)a.get(); obj == null || s1.b == null;)
            {
                return;
            }

            ((p.cp.d) (obj)).a(p.cp.d.b(((p.cp.d) (obj))), s1.b, s1.c, hashmap);
        }

        public f(p.cp.d d1)
        {
            a = new WeakReference(d1);
        }
    }

    public class g extends RuntimeException
    {

        final p.cp.d a;

        public g(String s1)
        {
            a = p.cp.d.this;
            super(s1);
        }
    }

    protected static final class h extends Enum
    {

        public static final h a;
        public static final h b;
        public static final h c;
        private static final h d[];

        public static h valueOf(String s1)
        {
            return (h)Enum.valueOf(p/cp/d$h, s1);
        }

        public static h[] values()
        {
            return (h[])d.clone();
        }

        static 
        {
            a = new h("Height", 0);
            b = new h("Fullscreen", 1);
            c = new h("Hide", 2);
            d = (new h[] {
                a, b, c
            });
        }

        private h(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    public static String f = null;
    public static String g = null;
    public static String h = null;
    public static String i = null;
    protected static final HashMap j = new HashMap();
    private Activity a;
    private Context b;
    private boolean c;
    private boolean d;
    private boolean e;
    protected boolean k;
    private HashMap l;
    private com.pandora.radio.data.b m;
    private Handler n;
    private WebView o;
    private f p;
    private boolean q;
    private DownloadListener r;

    public p.cp.d(Activity activity, WebView webview)
    {
        c = true;
        l = new HashMap();
        m = new com.pandora.radio.data.b();
        n = new Handler();
        p = null;
        q = true;
        r = new DownloadListener() {

            final p.cp.d a;

            public void onDownloadStart(String s1, String s2, String s3, String s4, long l1)
            {
                if (p.cp.d.c(a) != null)
                {
                    s1 = new Intent("android.intent.action.VIEW", Uri.parse(s1));
                    p.cp.d.c(a).startActivity(s1);
                }
            }

            
            {
                a = p.cp.d.this;
                super();
            }
        };
        a = activity;
        b(webview);
        g();
    }

    static Handler a(p.cp.d d1)
    {
        return d1.n;
    }

    private static String a(Context context, String s1, String s2, int i1)
    {
        context = com.pandora.android.util.s.b(context, i1);
        StringBuilder stringbuilder = new StringBuilder(context.length() + 32);
        stringbuilder.append(s1);
        stringbuilder.append(context);
        stringbuilder.append(s2);
        return stringbuilder.toString();
    }

    public static String a(Context context, b b1)
    {
        static class _cls7
        {

            static final int a[];
            static final int b[];
            static final int c[];
            static final int d[];

            static 
            {
                d = new int[h.values().length];
                try
                {
                    d[p.cp.h.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror65) { }
                try
                {
                    d[p.cp.h.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror64) { }
                try
                {
                    d[p.cp.h.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror63) { }
                c = new int[e.values().length];
                try
                {
                    c[p.cp.e.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror62) { }
                try
                {
                    c[p.cp.e.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror61) { }
                b = new int[b.values().length];
                try
                {
                    b[p.cp.b.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror60) { }
                try
                {
                    b[p.cp.b.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror59) { }
                a = new int[p.cp.c.a.values().length];
                try
                {
                    a[p.cp.c.a.o.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror58) { }
                try
                {
                    a[p.cp.c.a.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror57) { }
                try
                {
                    a[p.cp.c.a.t.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror56) { }
                try
                {
                    a[p.cp.c.a.i.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror55) { }
                try
                {
                    a[p.cp.c.a.g.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror54) { }
                try
                {
                    a[c.a.h.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror53) { }
                try
                {
                    a[p.cp.c.a.af.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror52) { }
                try
                {
                    a[p.cp.c.a.ab.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror51) { }
                try
                {
                    a[c.a.ad.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror50) { }
                try
                {
                    a[c.a.R.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror49) { }
                try
                {
                    a[p.cp.c.a.q.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror48) { }
                try
                {
                    a[c.a.S.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror47) { }
                try
                {
                    a[p.cp.c.a.s.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror46) { }
                try
                {
                    a[c.a.z.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror45) { }
                try
                {
                    a[c.a.G.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror44) { }
                try
                {
                    a[c.a.u.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror43) { }
                try
                {
                    a[c.a.v.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror42) { }
                try
                {
                    a[p.cp.c.a.j.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror41) { }
                try
                {
                    a[c.a.L.ordinal()] = 19;
                }
                catch (NoSuchFieldError nosuchfielderror40) { }
                try
                {
                    a[p.cp.c.a.b.ordinal()] = 20;
                }
                catch (NoSuchFieldError nosuchfielderror39) { }
                try
                {
                    a[c.a.m.ordinal()] = 21;
                }
                catch (NoSuchFieldError nosuchfielderror38) { }
                try
                {
                    a[p.cp.c.a.y.ordinal()] = 22;
                }
                catch (NoSuchFieldError nosuchfielderror37) { }
                try
                {
                    a[p.cp.c.a.n.ordinal()] = 23;
                }
                catch (NoSuchFieldError nosuchfielderror36) { }
                try
                {
                    a[p.cp.c.a.w.ordinal()] = 24;
                }
                catch (NoSuchFieldError nosuchfielderror35) { }
                try
                {
                    a[c.a.x.ordinal()] = 25;
                }
                catch (NoSuchFieldError nosuchfielderror34) { }
                try
                {
                    a[p.cp.c.a.l.ordinal()] = 26;
                }
                catch (NoSuchFieldError nosuchfielderror33) { }
                try
                {
                    a[c.a.d.ordinal()] = 27;
                }
                catch (NoSuchFieldError nosuchfielderror32) { }
                try
                {
                    a[p.cp.c.a.e.ordinal()] = 28;
                }
                catch (NoSuchFieldError nosuchfielderror31) { }
                try
                {
                    a[p.cp.c.a.f.ordinal()] = 29;
                }
                catch (NoSuchFieldError nosuchfielderror30) { }
                try
                {
                    a[p.cp.c.a.p.ordinal()] = 30;
                }
                catch (NoSuchFieldError nosuchfielderror29) { }
                try
                {
                    a[p.cp.c.a.r.ordinal()] = 31;
                }
                catch (NoSuchFieldError nosuchfielderror28) { }
                try
                {
                    a[p.cp.c.a.c.ordinal()] = 32;
                }
                catch (NoSuchFieldError nosuchfielderror27) { }
                try
                {
                    a[c.a.E.ordinal()] = 33;
                }
                catch (NoSuchFieldError nosuchfielderror26) { }
                try
                {
                    a[c.a.F.ordinal()] = 34;
                }
                catch (NoSuchFieldError nosuchfielderror25) { }
                try
                {
                    a[c.a.B.ordinal()] = 35;
                }
                catch (NoSuchFieldError nosuchfielderror24) { }
                try
                {
                    a[c.a.D.ordinal()] = 36;
                }
                catch (NoSuchFieldError nosuchfielderror23) { }
                try
                {
                    a[c.a.C.ordinal()] = 37;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                try
                {
                    a[c.a.Y.ordinal()] = 38;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    a[c.a.X.ordinal()] = 39;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    a[c.a.Z.ordinal()] = 40;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    a[p.cp.c.a.aa.ordinal()] = 41;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    a[p.cp.c.a.k.ordinal()] = 42;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    a[c.a.T.ordinal()] = 43;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    a[c.a.H.ordinal()] = 44;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    a[c.a.J.ordinal()] = 45;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    a[c.a.I.ordinal()] = 46;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    a[c.a.K.ordinal()] = 47;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    a[c.a.N.ordinal()] = 48;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    a[c.a.O.ordinal()] = 49;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    a[c.a.P.ordinal()] = 50;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[c.a.A.ordinal()] = 51;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[c.a.V.ordinal()] = 52;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[c.a.ac.ordinal()] = 53;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[c.a.M.ordinal()] = 54;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[c.a.ae.ordinal()] = 55;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[c.a.Q.ordinal()] = 56;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.cp.c.a.ag.ordinal()] = 57;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[c.a.U.ordinal()] = 58;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[c.a.W.ordinal()] = 59;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (p.cp._cls7.b[b1.ordinal()])
        {
        default:
            throw new UnsupportedOperationException("unknown javascriptAdornment");

        case 1: // '\001'
            if (f == null)
            {
                f = a(context, "javascript:(function() {", "})();", 0x7f070002);
            }
            return f;

        case 2: // '\002'
            break;
        }
        if (g == null)
        {
            g = a(context, "<script>", "</script>", 0x7f070002);
        }
        return g;
    }

    private String a(HashMap hashmap, String s1)
    {
        if (!hashmap.containsKey(s1))
        {
            return null;
        } else
        {
            return com.pandora.android.util.s.c((String)hashmap.get(s1));
        }
    }

    private HashMap a(HashMap hashmap, p.cp.c c1)
    {
        String s1;
        if (hashmap.containsKey("buttonLabel"))
        {
            s1 = (String)hashmap.get("buttonLabel");
        } else
        {
            s1 = null;
        }
        if (hashmap.containsKey("placeholderText"))
        {
            hashmap = (String)hashmap.get("placeholderText");
        } else
        {
            hashmap = null;
        }
        a(c1.a(), s1, ((String) (hashmap)));
        return j;
    }

    private HashMap a(HashMap hashmap, p.cp.c c1, WebView webview)
    {
        Object obj = null;
        if (!hashmap.containsKey("url") || !hashmap.containsKey("gain"))
        {
            p.df.a.c("WebViewClientBase", (new StringBuilder()).append("handlePlaySampleTrack missing parameter:  ").append(hashmap.toString()).toString());
            return null;
        }
        String s1 = (String)hashmap.get("url");
        String s2 = (String)hashmap.get("gain");
        if (webview != null && c1 != null)
        {
            hashmap = obj;
        } else
        {
            hashmap = new Runnable(webview, c1) {

                final WebView a;
                final p.cp.c b;
                final p.cp.d c;

                public void run()
                {
                    c.a(a, b.a(), null);
                }

            
            {
                c = p.cp.d.this;
                a = webview;
                b = c1;
                super();
            }
            };
        }
        a(s1, s2, ((Runnable) (hashmap)));
        com.pandora.android.ads.c.b().a(-1, "play_sample", false);
        return j;
    }

    private HashMap a(p.cp.c c1)
    {
        c1 = new HashMap();
        c1.put("result", p());
        return c1;
    }

    private HashMap a(p.cp.c c1, WebView webview)
    {
        c1 = new BroadcastReceiver(webview, c1) {

            final WebView a;
            final p.cp.c b;
            final p.cp.d c;

            public void onReceive(Context context, Intent intent)
            {
label0:
                {
                    if (PandoraIntent.a("cmd_send_facebook_user_data_result").equals(intent.getAction()) && p.cm.ae.a.valueOf(intent.getStringExtra("intent_reason")) == p.cm.ae.a.b && intent.getBooleanExtra("intent_success", false))
                    {
                        com.pandora.android.provider.b.a.C().a(this);
                        context = p.bx.d.a().b().h();
                        if (com.pandora.android.util.s.a(context))
                        {
                            break label0;
                        }
                        intent = new HashMap();
                        intent.put("fbId", context);
                        c.a(a, b.a(), intent);
                    }
                    return;
                }
                p.df.a.c("WebViewClientBase", "invalid facebook Id");
            }

            
            {
                c = p.cp.d.this;
                a = webview;
                b = c1;
                super();
            }
        };
        webview = new PandoraIntentFilter();
        webview.a("cmd_send_facebook_user_data_result");
        com.pandora.android.provider.b.a.C().a(c1, webview);
        h();
        return j;
    }

    private HashMap a(p.cp.c c1, HashMap hashmap)
    {
        c1 = a(hashmap, "url");
        if (com.pandora.android.util.s.a(c1))
        {
            return d("error", "url is required");
        } else
        {
            return d(c1);
        }
    }

    private HashMap a(p.cp.c c1, HashMap hashmap, WebView webview)
    {
        switch (p.cp._cls7.a[c1.c().ordinal()])
        {
        case 2: // '\002'
        case 4: // '\004'
        case 26: // '\032'
        default:
            return null;

        case 14: // '\016'
            return c(hashmap);

        case 1: // '\001'
            return a(c1, hashmap);

        case 15: // '\017'
            return f(c1, hashmap);

        case 16: // '\020'
            return g(c1, hashmap, webview);

        case 17: // '\021'
            return a(hashmap);

        case 18: // '\022'
            if (hashmap.containsKey("stationId"))
            {
                hashmap.put("token", hashmap.get("stationId"));
                hashmap.put("type", "stationId");
            }
            return g(hashmap);

        case 19: // '\023'
            return b(c1);

        case 3: // '\003'
            return b(hashmap, c1);

        case 20: // '\024'
            return p(hashmap);

        case 5: // '\005'
            return h(c1, hashmap, webview);

        case 6: // '\006'
        case 21: // '\025'
            return i(c1, hashmap, webview);

        case 22: // '\026'
            return b(hashmap, c1, webview);

        case 23: // '\027'
            return e(c1, hashmap, webview);

        case 24: // '\030'
            return f(c1, hashmap, webview);

        case 25: // '\031'
            return a(c1);

        case 27: // '\033'
            return b(c1, hashmap, webview);

        case 28: // '\034'
            return b(hashmap);

        case 29: // '\035'
            return q(hashmap);

        case 13: // '\r'
            return o(hashmap);

        case 30: // '\036'
            return a(c1, p.cp.h.a, hashmap);

        case 11: // '\013'
            return a(c1, p.cp.h.b, hashmap);

        case 31: // '\037'
            return a(c1, p.cp.h.c, hashmap);

        case 32: // ' '
            return b(c1, hashmap);

        case 33: // '!'
            return c(c1, hashmap, webview);

        case 34: // '"'
            return d(hashmap);

        case 35: // '#'
        case 36: // '$'
        case 37: // '%'
            return c(c1, hashmap);

        case 38: // '&'
            return e(hashmap);

        case 39: // '\''
            return d(c1, hashmap);

        case 40: // '('
            return f(hashmap);

        case 41: // ')'
            return i();

        case 42: // '*'
            if (hashmap.containsKey("musicId"))
            {
                hashmap.put("token", hashmap.get("musicId"));
                hashmap.put("type", "musicId");
            }
            // fall through

        case 43: // '+'
            return g(hashmap);

        case 44: // ','
        case 45: // '-'
            return e(c1, hashmap);

        case 46: // '.'
        case 47: // '/'
            return h(hashmap);

        case 48: // '0'
            return i(hashmap);

        case 49: // '1'
            return a(hashmap, c1, webview);

        case 50: // '2'
            return j(hashmap);

        case 51: // '3'
            return d(c1, hashmap, webview);

        case 8: // '\b'
            return k(hashmap);

        case 52: // '4'
            return l(hashmap);

        case 53: // '5'
            return a(hashmap, c1);

        case 54: // '6'
            if (com.pandora.android.data.n.a.i.toString().equals(com.pandora.android.util.s.d((String)hashmap.get("screen"))))
            {
                return a(c1, webview);
            } else
            {
                return m(hashmap);
            }

        case 12: // '\f'
            return n(hashmap);

        case 9: // '\t'
            return r(hashmap);

        case 55: // '7'
            return s(hashmap);

        case 7: // '\007'
            return t(hashmap);

        case 56: // '8'
            return b(c1, webview);

        case 57: // '9'
            return u(hashmap);

        case 58: // ':'
            return h(c1, hashmap);

        case 59: // ';'
            return v(hashmap);

        case 10: // '\n'
            return g(c1, hashmap);
        }
    }

    private HashMap a(p.cp.c c1, h h1, HashMap hashmap)
    {
        _cls7.d[h1.ordinal()];
        JVM INSTR tableswitch 1 3: default 151
    //                   1 36
    //                   2 139
    //                   3 145;
           goto _L1 _L2 _L3 _L4
_L2:
        int i1 = c(hashmap, "height");
        if (i1 == 0)
        {
            try
            {
                f();
            }
            // Misplaced declaration of an exception variable
            catch (p.cp.c c1)
            {
                p.df.a.e("WebViewClientBase", (new StringBuilder()).append("handleSetViewportHeight missing parameter: ").append(hashmap.toString()).toString());
                h1 = new HashMap();
                h1.put("error", c1.getLocalizedMessage());
                return h1;
            }
            // Misplaced declaration of an exception variable
            catch (p.cp.c c1)
            {
                h1 = new HashMap();
                h1.put("error", c1.getLocalizedMessage());
                return h1;
            }
            return null;
        }
        a(i1);
        return null;
_L3:
        e();
        return null;
_L4:
        f();
        return null;
_L1:
        return null;
    }

    static HashMap a(p.cp.d d1, String s1, String s2)
    {
        return d1.d(s1, s2);
    }

    private void a(Uri uri, WebView webview)
    {
        if (!c(uri))
        {
            webview = (new StringBuilder()).append("Invalid tap URI: ");
            if (uri == null)
            {
                uri = null;
            } else
            {
                uri = uri.toString();
            }
            throw new RuntimeException(webview.append(uri).toString());
        }
        Object obj = uri.toString();
        try
        {
            URL url = new URL(((String) (obj)));
            if ("pandoraappinternal".equalsIgnoreCase(url.getProtocol()) || "pandorastage".equalsIgnoreCase(url.getProtocol()) || "pandora".equalsIgnoreCase(url.getProtocol()))
            {
                a(url, webview);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (WebView webview)
        {
            a("processCustomActionUri", ((Throwable) (webview)));
        }
        if (p.cr.k.c(uri))
        {
            p.cr.k.a(uri);
            return;
        }
        obj = ((String) (obj)).substring(((String) (obj)).indexOf("/") + 1);
        int i1 = ((String) (obj)).indexOf("?");
        String s1;
        if (i1 > 0)
        {
            webview = ((String) (obj)).substring(0, i1);
            String as[] = ((String) (obj)).substring(i1 + 1).split("&");
            obj = webview;
            webview = as;
        } else
        {
            webview = new String[0];
        }
        s1 = l(((String) (obj)));
        obj = new HashMap();
        i1 = 0;
        while (i1 < webview.length) 
        {
            int j1 = webview[i1].indexOf("=");
            if (j1 >= 0)
            {
                ((Map) (obj)).put(webview[i1].substring(0, j1), webview[i1].substring(j1 + 1));
            }
            i1++;
        }
        if ("createStationFromStationId".equals(s1))
        {
            uri = new PandoraIntent("cmd_create_station");
            uri.putExtra("intent_music_token", (String)((Map) (obj)).get("stationId"));
            uri.putExtra("intent_station_creation_source", p.cx.x.e.h.ordinal());
            if (t().c())
            {
                uri.putExtra("intent_ad_id", t());
            }
            com.pandora.android.provider.b.a.C().a(uri);
            return;
        }
        if ("playMovie".equals(s1))
        {
            webview = (String)((Map) (obj)).get("cellURL");
            s1 = (String)((Map) (obj)).get("wifiURL");
            uri = (String)((Map) (obj)).get("adServerCorrelationId");
            if (com.pandora.android.util.s.a(uri))
            {
                uri = "";
            }
            p.df.a.c("WebViewClientBase", (new StringBuilder()).append("TAP_COMMAND_PLAY_MOVIE - playMovie parameterMap:").append(obj).toString());
            a(s1, ((String) (webview)), true, 0, null, null, null, null, null, null, null, 0, ((String) (uri)));
            return;
        }
        if ("telephone".equals(s1))
        {
            e((String)((Map) (obj)).get("number"));
            return;
        }
        if (s1 != null && s1.startsWith("tel:"))
        {
            e(s1.substring("tel:".length()));
            return;
        }
        if (s1 != null && s1.startsWith("launchPandoraOneTrial"))
        {
            uri = m(s1);
            com.pandora.android.activity.a.b(com.pandora.android.provider.b.a.h(), uri);
            return;
        } else
        {
            p.df.a.e("WebViewClientBase", (new StringBuilder()).append("processCustomActionUri() unhandled uri: ").append(uri).toString(), new Exception());
            return;
        }
    }

    private void a(String s1, Throwable throwable)
    {
        if (throwable.getMessage().startsWith("Unknown protocol: pandora"))
        {
            return;
        } else
        {
            p.df.a.a("WebViewClientBase", s1, throwable);
            return;
        }
    }

    private void a(URL url, WebView webview)
    {
        try
        {
            p.cp.c c1 = a(url);
            HashMap hashmap = a(c1, c1.b(), webview);
            if (hashmap != j)
            {
                a(webview, c1, hashmap);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (WebView webview)
        {
            p.df.a.b("WebViewClientBase", (new StringBuilder()).append("Error handling javascript callback: ").append(url).toString(), webview);
        }
    }

    public static boolean a(Uri uri)
    {
        String s1 = uri.getScheme();
        uri = uri.getHost();
        return ("http".equalsIgnoreCase(s1) || "https".equalsIgnoreCase(s1)) && !"play.google.com".equalsIgnoreCase(uri) && !"market.android.com".equalsIgnoreCase(uri);
    }

    private boolean a(String s1, String s2, int i1)
    {
        if (com.pandora.android.util.s.a(s1))
        {
            return false;
        }
        if (com.pandora.android.util.s.a(s2))
        {
            p.df.a.a("VIDEO AD", "playMovie - start reward failed: rewardProperties are required");
            return false;
        }
        try
        {
            new JSONObject(s2);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            p.df.a.a("VIDEO AD", "playMovie - start reward failed: json error with rewardProperties ", s1);
            return false;
        }
        return true;
    }

    private boolean a(HashMap hashmap, String s1, boolean flag)
    {
        if (!hashmap.containsKey(s1))
        {
            return flag;
        } else
        {
            return Boolean.parseBoolean(com.pandora.android.util.s.c((String)hashmap.get(s1)));
        }
    }

    private long b(HashMap hashmap, String s1)
    {
        if (!hashmap.containsKey(s1))
        {
            return 0L;
        } else
        {
            return Long.parseLong(com.pandora.android.util.s.c((String)hashmap.get(s1)));
        }
    }

    static WebView b(p.cp.d d1)
    {
        return d1.o;
    }

    public static String b(Context context, b b1)
    {
        switch (p.cp._cls7.b[b1.ordinal()])
        {
        default:
            throw new UnsupportedOperationException("unknown javascriptAdornment");

        case 1: // '\001'
            if (h == null)
            {
                h = a(context, "javascript:(function() {", "})();", 0x7f070003);
            }
            return h;

        case 2: // '\002'
            break;
        }
        if (i == null)
        {
            i = a(context, "<script>", "</script>", 0x7f070003);
        }
        return i;
    }

    private HashMap b(HashMap hashmap)
    {
        p.df.a.c("WebViewClientBase", (new StringBuilder()).append("handlePrefetchMovie ").append(hashmap.toString()).toString());
        Object obj = (String)hashmap.get("cellURL");
        hashmap = (String)hashmap.get("wifiURL");
        if (com.pandora.android.util.s.a(((String) (obj))) && com.pandora.android.util.s.a(hashmap))
        {
            obj = new HashMap();
            if (com.pandora.android.util.s.a(hashmap))
            {
                hashmap = "wifiURL";
            } else
            {
                hashmap = "cellURL";
            }
            ((HashMap) (obj)).put("error", String.format("%s is missing", new Object[] {
                hashmap
            }));
            return ((HashMap) (obj));
        } else
        {
            return a(new t(hashmap, ((String) (obj))));
        }
    }

    private HashMap b(HashMap hashmap, p.cp.c c1)
    {
        return r();
    }

    private HashMap b(HashMap hashmap, p.cp.c c1, WebView webview)
    {
        c1 = new p.cq.b(webview, c1) {

            final WebView a;
            final p.cp.c b;
            final p.cp.d c;

            public void a(boolean flag, HashMap hashmap1)
            {
                if (flag)
                {
                    hashmap1.put("confirmed", "yes");
                }
                c.a(a, b, hashmap1);
            }

            
            {
                c = p.cp.d.this;
                a = webview;
                b = c1;
                super();
            }
        };
        if (hashmap.containsKey("fields") && hashmap.containsKey("who"))
        {
            if (!com.pandora.android.util.s.a((String)hashmap.get("fields")))
            {
                return a(hashmap, c1);
            } else
            {
                return null;
            }
        }
        if (hashmap.containsKey("privacyPolicyUrl") && hashmap.containsKey("imageBannerUrl") && hashmap.containsKey("submitUrl") && hashmap.containsKey("learnMoreUrl"))
        {
            return a(new com.pandora.android.data.j(hashmap), c1);
        } else
        {
            throw new IllegalArgumentException("missing parameters when calling getPersonalInfo()");
        }
    }

    private HashMap b(p.cp.c c1)
    {
        q();
        return null;
    }

    private HashMap b(p.cp.c c1, WebView webview)
    {
        if (com.pandora.android.util.s.a(c1.a()))
        {
            return j;
        } else
        {
            return a(new d(webview, c1.a(), c1.d()) {

                final WebView a;
                final String b;
                final String c;
                final p.cp.d d;

                private void a()
                {
                    if (com.pandora.android.provider.b.a.b() != null)
                    {
                        com.pandora.android.provider.b.a.b().c(this);
                    }
                }

                public void nowPlayingTrackData(bh bh1)
                {
                    Object obj = null;
                    if (bh1 != null && bh1.a == p.dd.bh.a.a)
                    {
                        return;
                    }
                    HashMap hashmap;
                    if (bh1 != null)
                    {
                        bh1 = bh1.b;
                    } else
                    {
                        bh1 = null;
                    }
                    hashmap = obj;
                    if (bh1 != null)
                    {
                        hashmap = obj;
                        if (!bh1.M())
                        {
                            hashmap = new HashMap();
                            y y1 = com.pandora.android.provider.b.a.b().d().t();
                            hashmap.put("musicToken", bh1.w());
                            hashmap.put("songName", bh1.s());
                            hashmap.put("albumName", bh1.u());
                            hashmap.put("artistName", bh1.t());
                            hashmap.put("albumArtUrl", bh1.v());
                            if (y1 != null)
                            {
                                bh1 = y1.c();
                            } else
                            {
                                bh1 = "";
                            }
                            hashmap.put("stationToken", bh1);
                        }
                    }
                    try
                    {
                        d.a(a, b, c, hashmap);
                    }
                    // Misplaced declaration of an exception variable
                    catch (bh bh1)
                    {
                        p.df.a.c("WebViewClientBase", "callback exception", bh1);
                    }
                    a();
                }

            
            {
                d = p.cp.d.this;
                a = webview;
                b = s1;
                c = s2;
                super();
            }
            });
        }
    }

    private HashMap b(p.cp.c c1, HashMap hashmap)
    {
        c1 = a(hashmap, "number");
        if (com.pandora.android.util.s.a(c1))
        {
            p.df.a.c("WebViewClientBase", (new StringBuilder()).append("handleTelephone missing parameter: ").append(hashmap.toString()).toString());
            return d("error", "Invalid phone number");
        } else
        {
            return e(c1);
        }
    }

    private HashMap b(p.cp.c c1, HashMap hashmap, WebView webview)
    {
        p.df.a.c("WebViewClientBase", (new StringBuilder()).append("handlePlayMovie ").append(hashmap.toString()).toString());
        String s3 = (String)hashmap.get("cellURL");
        String s2 = (String)hashmap.get("wifiURL");
        if (com.pandora.android.util.s.a(s3) && com.pandora.android.util.s.a(s2))
        {
            hashmap = new HashMap();
            if (com.pandora.android.util.s.a(s2))
            {
                c1 = "wifiURL";
            } else
            {
                c1 = "cellURL";
            }
            hashmap.put("error", String.format("%s is missing", new Object[] {
                c1
            }));
            return hashmap;
        }
        String s1;
        String s4;
        String s5;
        String s6;
        String s7;
        String s8;
        int i1;
        int j1;
        boolean flag;
        if (com.pandora.android.provider.b.a.b().u().c() && !com.pandora.android.util.s.a(s2))
        {
            s1 = s2;
        } else
        {
            s1 = s3;
        }
        if (!com.pandora.android.util.s.a(c1.a()))
        {
            p.cq.d.a(this, webview, s1, c1.a(), c1.d());
        }
        flag = a(hashmap, "showScrubber", true);
        i1 = c(hashmap, "skipDelaySeconds");
        webview = (String)hashmap.get("startUrl");
        s1 = (String)hashmap.get("firstQuartileUrl");
        s4 = (String)hashmap.get("secondQuartileUrl");
        s5 = (String)hashmap.get("thirdQuartileUrl");
        s6 = (String)hashmap.get("completeUrl");
        s7 = (String)hashmap.get("offerName");
        s8 = (String)hashmap.get("rewardProperties");
        j1 = c(hashmap, "rewardThresholdSeconds");
        c1 = (String)hashmap.get("adServerCorrelationId");
        if (com.pandora.android.util.s.a(c1))
        {
            c1 = "";
        }
        return a(s2, s3, flag, i1, webview, s1, s4, s5, s6, s7, s8, j1, c1);
    }

    private a b(Uri uri)
    {
        String s1 = uri.toString().toLowerCase(Locale.US);
        if (s1.startsWith("pandoraappinternal://offerupgrade"))
        {
            return p.cp.a.g;
        }
        if (s1.startsWith("pandorastage://openpage"))
        {
            return p.cp.a.i;
        }
        if (s1.startsWith("pandora://startvalueexchange"))
        {
            return a.h;
        }
        if (s1.startsWith("pandoraapp:/"))
        {
            return p.cp.a.a;
        }
        if (s1.startsWith("http://pandoraiphoneapp.com/"))
        {
            return p.cp.a.b;
        }
        if (s1.startsWith("http://browser.pandora.com/"))
        {
            return p.cp.a.c;
        }
        if (p.cr.k.c(uri))
        {
            return a.d;
        }
        if (s1.startsWith("pandoraappinternal"))
        {
            return p.cp.a.e;
        }
        if (s1.startsWith("tel:"))
        {
            return p.cp.a.f;
        }
        if (s1.startsWith("pandorastage"))
        {
            return p.cp.a.j;
        }
        if (s1.startsWith("pandora"))
        {
            return a.d;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Uknown CustomUriType. Make sure the uri type is declared in WebViewClientBase.CustomUriType. uri = ").append(uri).toString());
        }
    }

    private void b(WebView webview)
    {
        o = webview;
        o.getSettings().setJavaScriptEnabled(true);
        o.getSettings().setDomStorageEnabled(true);
        o.setWebViewClient(this);
        o.setDownloadListener(r);
        webview = new android.support.v4.view.e(m(), new c());
        o.setOnTouchListener(new android.view.View.OnTouchListener(webview) {

            final android.support.v4.view.e a;
            final p.cp.d b;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                a.a(motionevent);
                motionevent.getAction();
                JVM INSTR tableswitch 0 1: default 36
            //                           0 38
            //                           1 38;
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
                b = p.cp.d.this;
                a = e1;
                super();
            }
        });
    }

    private int c(HashMap hashmap, String s1)
    {
        if (!hashmap.containsKey(s1))
        {
            return 0;
        } else
        {
            return Integer.parseInt(com.pandora.android.util.s.c((String)hashmap.get(s1)));
        }
    }

    static Activity c(p.cp.d d1)
    {
        return d1.a;
    }

    private HashMap c(HashMap hashmap)
    {
        hashmap = a(hashmap, "message");
        if (!com.pandora.android.util.s.a(hashmap) && a != null)
        {
            b(hashmap);
        }
        return null;
    }

    private HashMap c(p.cp.c c1, HashMap hashmap)
    {
        p.df.a.c("WebViewClientBase", (new StringBuilder()).append("handleLaunchGenrePanel : ").append(hashmap).toString());
        switch (p.cp._cls7.a[c1.c().ordinal()])
        {
        default:
            return null;

        case 36: // '$'
        case 37: // '%'
            String s1 = a(hashmap, "category");
            c1 = s1;
            if (com.pandora.android.util.s.a(s1))
            {
                c1 = a(hashmap, "genreName");
            }
            s1 = a(hashmap, "name");
            if (com.pandora.android.util.s.a(c1))
            {
                p.df.a.c("WebViewClientBase", (new StringBuilder()).append("handleLaunchGenrePanel missing parameter: ").append(hashmap.toString()).toString());
                return d("error", "category is required");
            } else
            {
                return c(((String) (c1)), s1);
            }

        case 35: // '#'
            c1 = a(hashmap, "gcat");
            break;
        }
        if (com.pandora.android.util.s.a(c1))
        {
            p.df.a.c("WebViewClientBase", (new StringBuilder()).append("handleLaunchGenrePanel missing parameter: ").append(hashmap.toString()).toString());
            return d("error", "gcat is required");
        } else
        {
            return f(c1);
        }
    }

    private HashMap c(p.cp.c c1, HashMap hashmap, WebView webview)
    {
        if (hashmap == null || hashmap.isEmpty())
        {
            throw new IllegalArgumentException(String.format("Parameters cannot be null or empty", new Object[0]));
        }
        String as[] = new String[6];
        as[0] = "who";
        as[1] = "title";
        as[2] = "startTimeMillis";
        as[3] = "endTimeMillis";
        as[4] = "description";
        as[5] = "location";
        int j1 = as.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            String s1 = as[i1];
            if (!hashmap.containsKey(s1))
            {
                throw new IllegalArgumentException(String.format("Parameter %s is missing", new Object[] {
                    s1
                }));
            }
        }

        c1 = new p.cq.a(webview, c1) {

            final WebView a;
            final p.cp.c b;
            final p.cp.d c;

            public void a(boolean flag, String s2)
            {
                if (flag)
                {
                    s2 = p.cp.d.a(c, "success", "true");
                } else
                {
                    HashMap hashmap1 = p.cp.d.a(c, "success", "false");
                    String s3 = s2;
                    if (com.pandora.android.util.s.a(s2))
                    {
                        s3 = "Fail to add Calendar Event";
                    }
                    hashmap1.put("error", s3);
                    s2 = hashmap1;
                }
                c.a(a, b, s2);
            }

            
            {
                c = p.cp.d.this;
                a = webview;
                b = c1;
                super();
            }
        };
        return a(a(hashmap, "who"), a(hashmap, "title"), b(hashmap, "startTimeMillis"), b(hashmap, "endTimeMillis"), a(hashmap, "description"), a(hashmap, "location"), c1);
    }

    private void c(WebView webview)
    {
        boolean flag1 = true;
        String s1;
        Object obj;
        boolean flag;
        if (h == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s1 = b(p.cp.b.a);
        if (flag)
        {
            if (s1.indexOf("$__stage_cmds__$") != -1)
            {
                obj = s1.replace("$__stage_cmds__$", p.cp.c.e());
            } else
            {
                obj = s1;
            }
            s1 = ((String) (obj));
            if (((String) (obj)).indexOf("$__version__$") != -1)
            {
                s1 = ((String) (obj)).replace("$__version__$", com.pandora.android.provider.b.a.i());
            }
            obj = com.pandora.android.provider.b.a.b().k();
            if (((ag) (obj)).t() != null)
            {
                flag1 = ((ag) (obj)).t().n();
            }
            obj = s1;
            if (s1.indexOf("$__explicitContentFilterEnabled__$") != -1)
            {
                if (!flag1)
                {
                    obj = "true";
                } else
                {
                    obj = "false";
                }
                obj = s1.replace("$__explicitContentFilterEnabled__$", ((CharSequence) (obj)));
            }
            h = ((String) (obj));
        } else
        {
            obj = s1;
        }
        webview.loadUrl(((String) (obj)));
    }

    private static boolean c(Uri uri)
    {
        if (uri != null && !com.pandora.android.util.s.a(uri.toString()))
        {
            String s1 = uri.getScheme();
            String s2 = uri.toString().toLowerCase(Locale.US);
            if (s2.startsWith("pandoraapp:/") || s2.startsWith("http://pandoraiphoneapp.com/") || s2.startsWith("http://browser.pandora.com/") || p.cr.k.c(uri) || s1.equalsIgnoreCase("pandoraappinternal") || s1.equalsIgnoreCase("pandorastage") || s1.equalsIgnoreCase("pandora") || s2.startsWith("tel:"))
            {
                return true;
            }
        }
        return false;
    }

    private HashMap d(String s1, String s2)
    {
        HashMap hashmap = new HashMap();
        hashmap.put(s1, s2);
        return hashmap;
    }

    private HashMap d(HashMap hashmap)
    {
        p.df.a.c("WebViewClientBase", (new StringBuilder()).append("handleAuthorizeFacebook : ").append(hashmap).toString());
        if (d)
        {
            return null;
        } else
        {
            d = true;
            p.bx.d.a().b(true);
            a.onBackPressed();
            return null;
        }
    }

    private HashMap d(p.cp.c c1, HashMap hashmap)
    {
        p.df.a.c("WebViewClientBase", (new StringBuilder()).append("handleOpenExternalPage : ").append(hashmap).toString());
        c1 = (String)hashmap.get("url");
        if (com.pandora.android.util.s.a(c1))
        {
            return d("error", "url is required");
        }
        if (!c(c1))
        {
            return d("success", String.valueOf(false));
        } else
        {
            return g(c1);
        }
    }

    private HashMap d(p.cp.c c1, HashMap hashmap, WebView webview)
    {
        String s1;
        s1 = a(hashmap, "tag");
        if (com.pandora.android.util.s.a(s1))
        {
            s1 = a(hashmap, "token");
        }
        hashmap = (String)hashmap.get("type");
        if (com.pandora.android.util.s.a(hashmap) || com.pandora.android.util.s.a(s1))
        {
            c1 = new HashMap();
            c1.put("error", "type and token values are required");
            return c1;
        }
        p.cp._cls7.c[p.cp.e.a(hashmap).ordinal()];
        JVM INSTR tableswitch 1 2: default 223
    //                   1 153
    //                   2 202;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException(String.format("Share type: %s is not supported", new Object[] {
            hashmap
        }));
_L2:
        byte byte0;
        hashmap = "";
        byte0 = 2;
_L5:
        p.cq.b b1 = null;
        try
        {
            if (!com.pandora.android.util.s.a(c1.a()))
            {
                b1 = new p.cq.b(webview, c1) {

                    final WebView a;
                    final p.cp.c b;
                    final p.cp.d c;

                    public void a(boolean flag, HashMap hashmap1)
                    {
                        HashMap hashmap2 = hashmap1;
                        if (hashmap1 == null)
                        {
                            hashmap2 = new HashMap();
                        }
                        if (flag)
                        {
                            hashmap2.put("success", "true");
                        }
                        c.a(a, b, hashmap2);
                    }

            
            {
                c = p.cp.d.this;
                a = webview;
                b = c1;
                super();
            }
                };
            }
            c1 = a(b1, Integer.valueOf(byte0), hashmap, s1);
        }
        // Misplaced declaration of an exception variable
        catch (p.cp.c c1)
        {
            hashmap = new HashMap();
            hashmap.put("error", c1.getLocalizedMessage());
            return hashmap;
        }
        return c1;
_L3:
        String s2 = "";
        byte0 = 1;
        hashmap = s1;
        s1 = s2;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private boolean d(WebView webview)
    {
        return a.isFinishing() || e(webview);
    }

    private HashMap e(HashMap hashmap)
    {
        p.df.a.c("WebViewClientBase", (new StringBuilder()).append("handleOpenPage : ").append(hashmap).toString());
        String s1 = (String)hashmap.get("url");
        if (com.pandora.android.util.s.a(s1))
        {
            p.df.a.c("WebViewClientBase", (new StringBuilder()).append("handleOpenPage missing parameter url:  ").append(hashmap.toString()).toString());
            return null;
        } else
        {
            String s2 = (String)hashmap.get("type");
            a(s1, (String)hashmap.get("cat"), (String)hashmap.get("title"), (String)hashmap.get("bg"), s2, (String)hashmap.get("tag"));
            return null;
        }
    }

    private HashMap e(p.cp.c c1, HashMap hashmap)
    {
        n();
        return null;
    }

    private HashMap e(p.cp.c c1, HashMap hashmap, WebView webview)
    {
        hashmap = (String)hashmap.get("complimentarySponsor");
        if (com.pandora.android.util.s.a(hashmap))
        {
            c1 = new HashMap();
            c1.put("error", "complimentarySponsor is required");
            return c1;
        } else
        {
            return a(hashmap, new p.cq.b(c1.a(), webview, c1.d()) {

                final String a;
                final WebView b;
                final String c;
                final p.cp.d d;

                public void a(boolean flag, HashMap hashmap1)
                {
                    if (com.pandora.android.util.s.a(a))
                    {
                        return;
                    } else
                    {
                        hashmap1 = p.cp.d.a(d, "success", Boolean.toString(flag));
                        d.a(b, a, c, hashmap1);
                        return;
                    }
                }

            
            {
                d = p.cp.d.this;
                a = s1;
                b = webview;
                c = s2;
                super();
            }
            });
        }
    }

    private void e(boolean flag)
    {
        if (l != null)
        {
            a aa1[] = a.values();
            int j1 = aa1.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                a a1 = aa1[i1];
                if (flag || a1 != p.cp.a.i)
                {
                    l.put(a1, Long.valueOf(0L));
                }
            }

        }
    }

    private boolean e(WebView webview)
    {
        if (webview == null)
        {
            return true;
        }
        try
        {
            webview.getSettings();
        }
        // Misplaced declaration of an exception variable
        catch (WebView webview)
        {
            return true;
        }
        if (webview instanceof PandoraWebView)
        {
            return ((PandoraWebView)webview).a();
        } else
        {
            return false;
        }
    }

    private HashMap f(HashMap hashmap)
    {
        p.df.a.c("WebViewClientBase", (new StringBuilder()).append("handleOpenModalPage: ").append(hashmap).toString());
        if (!hashmap.containsKey("url") || !hashmap.containsKey("type"))
        {
            p.df.a.c("WebViewClientBase", (new StringBuilder()).append("handleOpenModalPage missing parameter: ").append(hashmap.toString()).toString());
            return null;
        } else
        {
            a((String)hashmap.get("url"), (String)hashmap.get("type"), (String)hashmap.get("title"), (String)hashmap.get("bg"), (String)hashmap.get("okayHandler"));
            return null;
        }
    }

    private HashMap f(p.cp.c c1, HashMap hashmap)
    {
        c();
        return d("success", "true");
    }

    private HashMap f(p.cp.c c1, HashMap hashmap, WebView webview)
    {
        String s1;
        if (hashmap != null)
        {
            hashmap = (String)hashmap.get("product");
        } else
        {
            hashmap = null;
        }
        s1 = c1.a();
        c1 = c1.d();
        if (!com.pandora.android.util.s.a(s1))
        {
            a(hashmap, new com.pandora.android.iap.b(webview, s1, c1) {

                final WebView a;
                final String b;
                final String c;
                final p.cp.d d;

                public void a(boolean flag)
                {
                    boolean flag2 = true;
                    boolean flag1 = flag2;
                    if (flag)
                    {
                        String s2 = a.getUrl();
                        if (s2 != null)
                        {
                            s2 = Uri.parse(s2).getPath();
                        } else
                        {
                            s2 = null;
                        }
                        flag1 = flag2;
                        if (s2 != null)
                        {
                            flag1 = flag2;
                            if (s2.endsWith("content/mobile/p1"))
                            {
                                a.loadUrl(p.cp.b.e());
                                flag1 = false;
                            }
                        }
                    }
                    if (!flag1 || com.pandora.android.util.s.a(b))
                    {
                        return;
                    } else
                    {
                        HashMap hashmap1 = new HashMap();
                        hashmap1.put("success", Boolean.valueOf(flag));
                        d.a(a, b, c, hashmap1);
                        return;
                    }
                }

            
            {
                d = p.cp.d.this;
                a = webview;
                b = s1;
                c = s2;
                super();
            }
            });
            return j;
        } else
        {
            a(hashmap, ((com.pandora.android.iap.b) (null)));
            return null;
        }
    }

    private HashMap g(HashMap hashmap)
    {
        if (hashmap == null || hashmap.isEmpty())
        {
            throw new NullPointerException("Parameters cannot be null or empty");
        }
        String s2 = (String)hashmap.get("type");
        if (com.pandora.android.util.s.a(s2))
        {
            throw new IllegalArgumentException("Parameter 'type' is missing");
        }
        String s3 = (String)hashmap.get("token");
        if (com.pandora.android.util.s.a(s3))
        {
            throw new IllegalArgumentException("Parameter 'token' is missing");
        }
        String s1 = (String)hashmap.get("adServerCorrelationId");
        if (com.pandora.android.util.s.a(s1))
        {
            s1 = "";
        }
        if (s2.equals("stationId") || s2.equals("musicId"))
        {
            return a(s3, s2, (String)hashmap.get("startingTrackToken"), t(), s1);
        } else
        {
            throw new IllegalArgumentException(String.format("Token type: %s is not supported", new Object[] {
                s2
            }));
        }
    }

    private HashMap g(p.cp.c c1, HashMap hashmap)
    {
        try
        {
            c1 = (String)hashmap.get("visibility");
            if (com.pandora.android.util.s.a(c1) || !"true".equalsIgnoreCase(c1) && !"false".equalsIgnoreCase(c1))
            {
                throw new IllegalArgumentException(String.format("Parameter %s is required with values 'true'  or 'false'", new Object[] {
                    "visibility"
                }));
            }
        }
        // Misplaced declaration of an exception variable
        catch (p.cp.c c1)
        {
            return d("error", c1.getLocalizedMessage());
        }
        c1 = d("success", String.valueOf(a(a(hashmap, "visibility", true))));
        return c1;
    }

    private HashMap g(p.cp.c c1, HashMap hashmap, WebView webview)
    {
label0:
        {
            Object obj = null;
            Object obj1 = a(hashmap, "pageURL");
            String s1 = a(hashmap, "pageHTML");
            if (com.pandora.android.util.s.a(((String) (obj1))) && com.pandora.android.util.s.a(s1))
            {
                p.df.a.c("WebViewClientBase", (new StringBuilder()).append("handleOpenLandingPage missing parameter: ").append(hashmap.toString()).toString());
                c1 = new HashMap();
                c1.put("error", "pageURL or pageHTML is required");
                return c1;
            }
            String s2 = (String)hashmap.get("backgroundColor");
            hashmap = (String)hashmap.get("transitionType");
            int i1;
            if (!com.pandora.android.util.s.a(s2))
            {
                i1 = Color.parseColor(s2);
            } else
            {
                i1 = 0;
            }
            if (!com.pandora.android.util.s.a(hashmap))
            {
                hashmap = com.pandora.android.data.l.a.valueOf(hashmap);
            } else
            {
                hashmap = com.pandora.android.data.l.a.a;
            }
            obj1 = new l(t(), ((String) (obj1)), s1, i1, hashmap, null);
            if (com.pandora.android.util.s.a(null))
            {
                hashmap = obj;
                if (com.pandora.android.util.s.a(null))
                {
                    break label0;
                }
            }
            hashmap = new p.cq.c(this, webview, ((l) (obj1)).f(), null, null, c1.d());
        }
        return a(((l) (obj1)), hashmap);
    }

    private void g()
    {
        l = new HashMap();
        e(true);
    }

    private HashMap h(HashMap hashmap)
    {
        String s1 = (String)hashmap.get("stationId");
        hashmap = (String)hashmap.get("trackToken");
        if (!com.pandora.android.util.s.a(hashmap) && com.pandora.android.util.s.a(s1))
        {
            return null;
        }
        if (com.pandora.android.provider.b.a.c().i())
        {
            com.pandora.android.util.s.e("Sorry, this feature is not available when casting.");
            return null;
        } else
        {
            a(hashmap, s1);
            return null;
        }
    }

    private HashMap h(p.cp.c c1, HashMap hashmap)
    {
        String s3 = (String)hashmap.get("offerName");
        String s4 = (String)hashmap.get("rewardProperties");
        String s2 = (String)hashmap.get("adServerCorrelationId");
        String s1;
        if (com.pandora.android.util.s.a(s2))
        {
            s2 = "";
        }
        s1 = null;
        if (com.pandora.android.util.s.a(s3))
        {
            s1 = "offerName is required";
        }
        hashmap = s1;
        if (s1 != null)
        {
            hashmap = s1;
            if (com.pandora.android.util.s.a(s4))
            {
                hashmap = "rewardProperties are required";
            }
        }
        if (hashmap != null) goto _L2; else goto _L1
_L1:
        try
        {
            if (p == null)
            {
                p = new f(this);
            }
            com.pandora.android.provider.b.a.e().c(p);
            a(s3, new JSONObject(s4), s2, m, c1);
        }
        // Misplaced declaration of an exception variable
        catch (p.cp.c c1)
        {
            c1 = (new StringBuilder()).append("json error with rewardProperties ").append(c1.getMessage()).toString();
            com.pandora.android.provider.b.a.e().b(p);
            continue; /* Loop/switch isn't completed */
        }
        c1 = hashmap;
_L4:
        if (c1 != null)
        {
            com.pandora.android.util.s.e(m().getString(0x7f080287));
            hashmap = new HashMap();
            hashmap.put("error", c1);
            return hashmap;
        } else
        {
            return j;
        }
_L2:
        c1 = hashmap;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private HashMap h(p.cp.c c1, HashMap hashmap, WebView webview)
    {
        String s1 = a(hashmap, "url");
        String s2 = a(hashmap, "params");
        String s3 = a(hashmap, "method");
        if (com.pandora.android.util.s.a(s1))
        {
            p.df.a.c("WebViewClientBase", (new StringBuilder()).append("handlefetchURL missing parameter: ").append(hashmap.toString()).toString());
            return d("error", "url is required");
        } else
        {
            return a(webview, s1, s2, s3, c1.a(), c1.d());
        }
    }

    private HashMap i()
    {
        p.df.a.c("WebViewClientBase", "handleCloseModalPage");
        b();
        return null;
    }

    private HashMap i(HashMap hashmap)
    {
        if (!hashmap.containsKey("samples"))
        {
            p.df.a.c("WebViewClientBase", (new StringBuilder()).append("handlePlaySampleTrack missing parameter:  ").append(hashmap.toString()).toString());
            return null;
        }
        hashmap = new JSONArray((String)hashmap.get("samples"));
        if (hashmap.length() >= 0)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        hashmap = hashmap.optJSONObject(0);
        if (hashmap == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        try
        {
            a(hashmap.optString("url"), hashmap.optString("gain"), ((Runnable) (null)));
        }
        // Misplaced declaration of an exception variable
        catch (HashMap hashmap)
        {
            p.df.a.b("WebViewClientBase", "Error with sample JSON");
        }
        return j;
        p.df.a.c("WebViewClientBase", "No samples in array");
        break MISSING_BLOCK_LABEL_91;
    }

    private HashMap i(p.cp.c c1, HashMap hashmap, WebView webview)
    {
        String s1;
        s1 = a(hashmap, "url");
        if (com.pandora.android.util.s.a(s1))
        {
            return d("error", "url is required");
        }
        hashmap = com.pandora.android.provider.b.a.d();
        if (hashmap == null)
        {
            return d("error", "Could not find authorized user");
        }
        String s2 = URLEncoder.encode(hashmap.b(), "UTF-8");
        if (s1.contains("?"))
        {
            hashmap = "&";
        } else
        {
            hashmap = "?";
        }
        try
        {
            return a(webview, (new StringBuilder()).append(s1).append(hashmap).append("at=").append(s2).toString(), null, null, c1.a(), c1.d());
        }
        // Misplaced declaration of an exception variable
        catch (p.cp.c c1)
        {
            c1.printStackTrace();
        }
        return d("error", c1.getLocalizedMessage());
    }

    private Uri j(String s1)
    {
        Uri uri = Uri.parse(s1);
        s1 = uri;
        if ("intent".equalsIgnoreCase(uri.getScheme()))
        {
            s1 = uri.getFragment();
            if (s1 == null)
            {
                throw new InvalidParameterException("missing uri fragment");
            }
            int i1 = s1.indexOf("scheme=");
            if (i1 == -1)
            {
                throw new InvalidParameterException("missing scheme decleartion in uri fragment");
            }
            i1 += "scheme=".length();
            s1 = s1.substring(i1, s1.indexOf(';', i1));
            s1 = uri.buildUpon().scheme(s1).fragment(null).build();
        }
        return s1;
    }

    private HashMap j(HashMap hashmap)
    {
        o();
        return null;
    }

    private HashMap k(HashMap hashmap)
    {
        String s2 = a(hashmap, "interaction");
        String s1 = s2;
        if (com.pandora.android.util.s.a(s2))
        {
            s1 = "handleRefreshAd";
        }
        boolean flag = a(hashmap, "force", false);
        com.pandora.android.ads.c.b().a(-1, s1, Boolean.valueOf(flag).booleanValue());
        return null;
    }

    public static void k()
    {
        URLStreamHandlerFactory urlstreamhandlerfactory = new URLStreamHandlerFactory() {

            public URLStreamHandler createURLStreamHandler(String s1)
            {
                if (s1.equalsIgnoreCase("pandoraappinternal") || s1.equalsIgnoreCase("pandora") || s1.equalsIgnoreCase("pandorastage"))
                {
                    return new URLStreamHandler(this) {

                        final _cls1 a;

                        protected URLConnection openConnection(URL url)
                            throws IOException
                        {
                            return null;
                        }

            
            {
                a = _pcls1;
                super();
            }
                    };
                } else
                {
                    return null;
                }
            }

        };
        try
        {
            URL.setURLStreamHandlerFactory(urlstreamhandlerfactory);
            return;
        }
        catch (Throwable throwable)
        {
            p.df.a.b("WebViewClientBase", "Error calling setURLStreamHandlerFactory", throwable);
        }
    }

    private boolean k(String s1)
    {
        s1 = new URL(s1);
        if (!"pandoraappinternal".equalsIgnoreCase(s1.getProtocol()) && !"pandora".equalsIgnoreCase(s1.getProtocol()) && !"pandorastage".equalsIgnoreCase(s1.getProtocol()))
        {
            break MISSING_BLOCK_LABEL_151;
        }
        s1 = a(s1).c();
        p.cp._cls7.a[s1.ordinal()];
        JVM INSTR tableswitch 1 13: default 151
    //                   1 132
    //                   2 132
    //                   3 132
    //                   4 132
    //                   5 132
    //                   6 132
    //                   7 132
    //                   8 132
    //                   9 132
    //                   10 132
    //                   11 132
    //                   12 132
    //                   13 132;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2
_L1:
        break MISSING_BLOCK_LABEL_151;
_L2:
        e(false);
        return false;
        s1;
        a("isUserWebCommand", s1);
        return true;
    }

    private String l(String s1)
    {
        for (; s1.charAt(0) == '/'; s1 = s1.substring(1)) { }
        return s1;
    }

    private HashMap l(HashMap hashmap)
    {
        int i1 = c(hashmap, "delaySeconds");
        a(Math.min(com.pandora.android.provider.b.a.d().E(), i1) * 1000);
        return null;
    }

    private static String m(String s1)
    {
        Object obj = null;
        int i1 = s1.indexOf("/");
        String s2 = obj;
        if (i1 > -1)
        {
            s2 = obj;
            if (i1 < s1.length())
            {
                s2 = s1.substring(i1 + 1);
            }
        }
        return s2;
    }

    private HashMap m(HashMap hashmap)
    {
        p.df.a.c("WebViewClientBase", (new StringBuilder()).append("handleGoToScreen : ").append(hashmap).toString());
        if (!hashmap.containsKey("screen"))
        {
            p.df.a.c("WebViewClientBase", (new StringBuilder()).append("handleGoToScreen missing parameter screen:  ").append(hashmap.toString()).toString());
            return null;
        } else
        {
            return a((String)hashmap.get("screen"));
        }
    }

    private HashMap n(HashMap hashmap)
    {
        p.df.a.c("WebViewClientBase", (new StringBuilder()).append("handleSendEvent : ").append(hashmap).toString());
        if (!hashmap.containsKey("context"))
        {
            p.df.a.c("WebViewClientBase", (new StringBuilder()).append("handleSendEvent missing parameter screen:  ").append(hashmap.toString()).toString());
            return null;
        }
        try
        {
            b(new JSONObject((String)hashmap.get("context")));
        }
        // Misplaced declaration of an exception variable
        catch (HashMap hashmap)
        {
            p.df.a.c("WebViewClientBase", "Error handling sendEvent", hashmap);
            return null;
        }
        return null;
    }

    private HashMap o(HashMap hashmap)
    {
        hashmap = a(hashmap, "url");
        if (!com.pandora.android.util.s.a(hashmap))
        {
            h(hashmap);
        }
        return null;
    }

    private HashMap p(HashMap hashmap)
    {
        return i(a(hashmap, "value"));
    }

    private HashMap q(HashMap hashmap)
    {
        if (!hashmap.containsKey("fromAddress") || !hashmap.containsKey("template"))
        {
            p.df.a.c("WebViewClientBase", (new StringBuilder()).append("handleSendEmail missing parameter: ").append(hashmap.toString()).toString());
        }
        return null;
    }

    private HashMap r(HashMap hashmap)
    {
        p.df.a.c("WebViewClientBase", (new StringBuilder()).append("handleRefreshStationList : ").append(hashmap).toString());
        (new ab()).execute(new Object[] {
            Boolean.TRUE
        });
        return null;
    }

    private HashMap s(HashMap hashmap)
    {
        p.df.a.c("WebViewClientBase", (new StringBuilder()).append("handleLaunchAddSeed : ").append(hashmap).toString());
        if (com.pandora.android.util.s.u())
        {
            com.pandora.android.activity.a.a(a, (String)hashmap.get("stationId"));
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putString("intent_station_token", (String)hashmap.get("stationId"));
            HomeTabsActivity.b(a, bundle);
        }
        return null;
    }

    private HashMap t(HashMap hashmap)
    {
        p.df.a.c("WebViewClientBase", (new StringBuilder()).append("handlePlaylistUpdated : ").append(hashmap).toString());
        String s1 = (String)hashmap.get("stationId");
        hashmap = (String)hashmap.get("startingTrackToken");
        if (com.pandora.android.util.s.a(s1))
        {
            return null;
        } else
        {
            b(s1, hashmap);
            return null;
        }
    }

    private HashMap u(HashMap hashmap)
    {
        String s1 = a(hashmap, "amazonAlbumDigitalAsin");
        String s2 = a(hashmap, "amazonSongDigitialAsin");
        String s3 = a(hashmap, "search");
        String s4 = a(hashmap, "default");
        String s5 = a(hashmap, "defaultType");
        String s6 = a(hashmap, "musicid");
        if (com.pandora.android.util.s.a(s4))
        {
            p.df.a.c("WebViewClientBase", (new StringBuilder()).append("missing required parameter default url:  ").append(hashmap.toString()).toString());
            return null;
        } else
        {
            b(s1, s2, s3, s6, s5, s4);
            return null;
        }
    }

    private HashMap v(HashMap hashmap)
    {
        if (hashmap.containsKey("trackingDescriptors")) goto _L2; else goto _L1
_L1:
        p.df.a.c("WebViewClientBase", (new StringBuilder()).append("pingImpressionUrls missing parameter:  ").append(hashmap.toString()).toString());
_L4:
        return null;
_L2:
        p ap[];
        int i1;
        int j1;
        try
        {
            hashmap = new JSONArray((String)hashmap.get("trackingDescriptors"));
            j1 = hashmap.length();
        }
        // Misplaced declaration of an exception variable
        catch (HashMap hashmap)
        {
            p.df.a.b("WebViewClientBase", "Invalid JSON", hashmap);
            return null;
        }
        if (j1 <= 0) goto _L4; else goto _L3
_L3:
        ap = new p[j1];
        i1 = 0;
_L6:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        ap[i1] = new q(hashmap.optJSONObject(i1));
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
        a(ap);
        return null;
    }

    public String a(b b1)
    {
        return a(m(), b1);
    }

    protected HashMap a(WebView webview, String s1, String s2, String s3, String s4, String s5)
    {
        s4 = new p.cm.r.a(webview, s4, s5) {

            final WebView a;
            final String b;
            final String c;
            final p.cp.d d;

            public void a(String s6, String s7)
            {
                p.cp.d.a(d).post(new Runnable(this, s7) {

                    final String a;
                    final _cls4 b;

                    public void run()
                    {
                        HashMap hashmap1 = p.cp.d.a(b.d, "responseText", a);
                        HashMap hashmap;
                        boolean flag;
                        if (a != null && !a.equalsIgnoreCase("false"))
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        hashmap = hashmap1;
                        if (hashmap1 == null)
                        {
                            hashmap = new HashMap();
                        }
                        if (flag)
                        {
                            hashmap.put("success", String.valueOf(true));
                        } else
                        {
                            hashmap.put("success", String.valueOf(false));
                        }
                        b.d.a(b.a, b.b, b.c, hashmap);
                    }

            
            {
                b = _pcls4;
                a = s1;
                super();
            }
                });
            }

            
            {
                d = p.cp.d.this;
                a = webview;
                b = s1;
                c = s2;
                super();
            }
        };
        if ("post".equalsIgnoreCase(s3))
        {
            webview = p.cm.r.b.b;
        } else
        {
            webview = p.cm.r.b.a;
        }
        s3 = new WeakReference(s4);
        (new r(new String[] {
            s1
        }, s2, webview, s3)).execute(new Object[0]);
        return j;
    }

    protected HashMap a(com.pandora.android.data.j j1, p.cq.b b1)
    {
        return null;
    }

    protected HashMap a(l l1, p.cq.c c1)
    {
        PandoraIntent pandoraintent = new PandoraIntent("launch_pandora_browser");
        if (c1 != null)
        {
            c1.a(com.pandora.android.provider.b.a.e());
        }
        pandoraintent.putExtra("pandora.landing_page_data", l1);
        com.pandora.android.provider.b.a.C().a(pandoraintent);
        return null;
    }

    protected HashMap a(t t1)
    {
        p.bu.e.a().a(t1);
        return j;
    }

    protected HashMap a(String s1)
    {
        boolean flag;
        if ("share".equals(s1))
        {
            s1 = new PandoraIntent("handle_share_now_playing");
            com.pandora.android.provider.b.a.C().a(s1);
            flag = true;
        } else
        {
            flag = HomeTabsActivity.b(s1);
        }
        return d("success", String.valueOf(flag));
    }

    protected HashMap a(String s1, String s2, long l1, long l2, String s3, 
            String s4, p.cq.a a1)
    {
        HashMap hashmap = j;
        com.pandora.android.activity.a.a(a, s1, s2, l1, l2, s3, s4, a1);
        return hashmap;
    }

    protected HashMap a(String s1, String s2, String s3, com.pandora.radio.data.b b1, String s4)
    {
        s2 = new PandoraIntent("cmd_create_station");
        s2.putExtra("intent_music_token", s1);
        s2.putExtra("intent_allow_video_ad_opportunity", true);
        s2.putExtra("intent_station_creation_source", p.cx.x.e.h.ordinal());
        s2.putExtra("intent_ad_server_correlation_id", s4);
        if (b1 != null)
        {
            s2.putExtra("intent_ad_id", b1);
        }
        if (!com.pandora.android.util.s.a(s3))
        {
            s2.putExtra("intent_start_track_token", s3);
        }
        com.pandora.android.provider.b.a.C().a(s2);
        return null;
    }

    protected HashMap a(String s1, String s2, boolean flag, int i1, String s3, String s4, String s5, 
            String s6, String s7, String s8, String s9, int j1, String s10)
    {
        p.df.a.c("WebViewClientBase", "playMovie");
        String s11;
        if (com.pandora.android.provider.b.a.b().u().c() && !com.pandora.android.util.s.a(s1))
        {
            s11 = s1;
        } else
        {
            s11 = s2;
        }
        if (!com.pandora.android.util.s.a(s11))
        {
            s1 = new t(s1, s2);
            if (a(s8, s9, j1))
            {
                p.df.a.a("WebViewClientBase", "playMovie - start video with reward");
                s1 = new com.pandora.android.data.r(t(), s11, i1, s3, s4, s5, s6, s7, s1, s10, s8, s9, j1);
            } else
            {
                s1 = new o(t(), s11, flag, i1, s3, s4, s5, s6, s7, s1, s10);
            }
            com.pandora.android.ads.VideoAdManager.c.a().a(com.pandora.android.provider.c.a(s1), false);
        }
        return j;
    }

    public HashMap a(String s1, p.cq.b b1)
    {
        Activity activity = a;
        if (activity instanceof InAppLandingPageActivity)
        {
            ((InAppLandingPageActivity)activity).a(b1);
        }
        com.pandora.android.activity.a.b(activity, s1);
        return j;
    }

    protected HashMap a(HashMap hashmap)
    {
        hashmap = new PandoraIntent("close_pandora_browser");
        com.pandora.android.provider.b.a.C().a(hashmap);
        return null;
    }

    protected HashMap a(HashMap hashmap, p.cq.b b1)
    {
        String s2 = a(hashmap, "who");
        String s1;
        ArrayList arraylist;
        HashMap hashmap1;
        af af1;
        StringBuffer stringbuffer;
        String s3;
        int j1;
        int k1;
        if (hashmap.containsKey("why"))
        {
            s1 = a(hashmap, "why");
        } else
        {
            s1 = null;
        }
        hashmap = ((String)hashmap.get("fields")).split(",");
        arraylist = new ArrayList();
        k1 = hashmap.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            arraylist.add(hashmap[i1]);
        }

        if (a == null)
        {
            p.df.a.c("WebViewClientBase", "getPersonalInfo - no activity to handle, doing nothing");
            return null;
        }
        if (com.pandora.android.util.s.a(s2))
        {
            s2 = "This advertiser";
        }
        af1 = com.pandora.android.provider.b.a.d();
        hashmap1 = new HashMap();
        stringbuffer = new StringBuffer();
        j1 = 0;
_L3:
        if (j1 >= arraylist.size())
        {
            break MISSING_BLOCK_LABEL_369;
        }
        s3 = (String)arraylist.get(j1);
        if (stringbuffer.length() > 0)
        {
            if (arraylist.size() > 2)
            {
                stringbuffer.append(",");
            }
            stringbuffer.append(" ");
            if (j1 == arraylist.size() - 1)
            {
                stringbuffer.append("and ");
            }
        }
        stringbuffer.append(s3);
        if (!s3.equals("email")) goto _L2; else goto _L1
_L1:
        hashmap = af1.c();
_L4:
        hashmap1.put(s3, hashmap);
        j1++;
          goto _L3
_L2:
label0:
        {
            if (!s3.equals("zip"))
            {
                break label0;
            }
            hashmap = af1.m();
        }
          goto _L4
label1:
        {
            if (!s3.equals("age"))
            {
                break label1;
            }
            hashmap = String.valueOf(af1.k());
        }
          goto _L4
label2:
        {
            if (!s3.equals("gender"))
            {
                break label2;
            }
            hashmap = af1.l();
        }
          goto _L4
        try
        {
            throw new RuntimeException("Invalid Field. Field should contain at least one of the values for 'email', 'zip', 'age' or 'gender'");
        }
        // Misplaced declaration of an exception variable
        catch (HashMap hashmap)
        {
            p.df.a.c("WebViewClientBase", hashmap.getMessage(), hashmap);
        }
        hashmap.printStackTrace();
        b1.a(false, null);
_L5:
        return j;
        hashmap = (new StringBuilder()).append(s2).append(" would like to use your").append(" ").append(stringbuffer.toString());
        if (!com.pandora.android.util.s.a(s1))
        {
            hashmap.append(" ").append(s1);
        }
        hashmap.append(".");
        hashmap.append("  Is this OK?");
        (new android.app.AlertDialog.Builder(a)).setMessage(hashmap.toString()).setCancelable(false).setPositiveButton(0x7f080195, new android.content.DialogInterface.OnClickListener(b1, hashmap1) {

            final p.cq.b a;
            final HashMap b;
            final p.cp.d c;

            public void onClick(DialogInterface dialoginterface, int l1)
            {
                a.a(true, b);
                dialoginterface.cancel();
            }

            
            {
                c = p.cp.d.this;
                a = b1;
                b = hashmap;
                super();
            }
        }).setNegativeButton(0x7f080194, new android.content.DialogInterface.OnClickListener(b1) {

            final p.cq.b a;
            final p.cp.d b;

            public void onClick(DialogInterface dialoginterface, int l1)
            {
                a.a(false, null);
                dialoginterface.cancel();
            }

            
            {
                b = p.cp.d.this;
                a = b1;
                super();
            }
        }).create().show();
          goto _L5
    }

    protected HashMap a(d d1)
    {
        if (com.pandora.android.provider.b.a.b() != null && d1 != null)
        {
            com.pandora.android.provider.b.a.b().b(d1);
            return j;
        } else
        {
            return null;
        }
    }

    protected HashMap a(p.cq.b b1, Integer integer, String s1, String s2)
    {
        (new p.cm.l()).execute(new Object[] {
            integer, s1, s2, a, b1
        });
        return j;
    }

    protected p.cp.c a(URL url)
    {
        String s2 = url.getProtocol();
        String s3 = url.getHost();
        String s1 = null;
        if (!com.pandora.android.util.s.a(url.getPath()))
        {
            s1 = url.getPath().substring(1);
        }
        return new p.cp.c(s2, s3, p.cp.b.a(url), s1);
    }

    protected void a(int i1)
    {
    }

    protected void a(long l1)
    {
        com.pandora.android.ads.c.b().a(l1, com.pandora.android.ads.h.b.b);
    }

    public void a(WebView webview)
    {
        if (webview != null)
        {
            webview.loadUrl(a(p.cp.b.a));
            if (a())
            {
                c(webview);
                return;
            }
        }
    }

    public void a(WebView webview, aa aa1, y y1)
    {
        JSONObject jsonobject;
        if (webview == null || aa1 == null || d(webview))
        {
            return;
        }
        jsonobject = new JSONObject();
        jsonobject.put("musicToken", aa1.w());
        jsonobject.put("songName", aa1.s());
        jsonobject.put("albumName", aa1.u());
        jsonobject.put("artistName", aa1.t());
        jsonobject.put("albumArtUrl", aa1.v());
        if (y1 == null) goto _L2; else goto _L1
_L1:
        aa1 = y1.c();
_L3:
        jsonobject.put("stationToken", aa1);
_L4:
        aa1 = "SongPlayed";
        if (!com.pandora.android.provider.b.a.b().d().m())
        {
            aa1 = "SongPaused";
        }
        aa1 = String.format("if (typeof(Pandora) != 'undefined') {Pandora.fireEvent('%s', %s);}", new Object[] {
            aa1, jsonobject.toString()
        });
        webview.loadUrl((new StringBuilder()).append("javascript:(function() {").append(aa1).append("})();").toString());
        return;
_L2:
        aa1 = "";
          goto _L3
        aa1;
          goto _L4
    }

    public void a(WebView webview, String s1)
    {
        if (d(webview))
        {
            return;
        } else
        {
            webview.loadUrl(String.format("javascript:%s", new Object[] {
                s1
            }));
            return;
        }
    }

    public void a(WebView webview, String s1, String s2, HashMap hashmap)
    {
        while (d(webview) || com.pandora.android.util.s.a(s1)) 
        {
            return;
        }
        if (hashmap == null)
        {
            hashmap = "{}";
        } else
        {
            hashmap = (new JSONObject(hashmap)).toString();
        }
        webview.loadUrl(String.format("javascript:%s._methodResponse('%s',%s);", new Object[] {
            s2, s1, hashmap
        }));
    }

    public void a(WebView webview, String s1, HashMap hashmap)
    {
        while (d(webview) || com.pandora.android.util.s.a(s1)) 
        {
            return;
        }
        if (hashmap == null)
        {
            hashmap = "{}";
        } else
        {
            hashmap = (new JSONObject(hashmap)).toString();
        }
        webview.loadUrl(String.format("javascript:Stage._methodResponse('%s',%s);", new Object[] {
            s1, hashmap
        }));
    }

    protected void a(WebView webview, p.cp.c c1, HashMap hashmap)
    {
        a(webview, c1.a(), c1.d(), hashmap);
    }

    public void a(com.pandora.radio.data.b b1)
    {
        m = b1;
    }

    protected void a(String s1, com.pandora.android.iap.b b1)
    {
        com.pandora.android.iap.d.a().a(a, s1, b1);
    }

    protected void a(String s1, String s2)
    {
        if (com.pandora.android.util.s.a(s2) && com.pandora.android.util.s.a(s1))
        {
            com.pandora.android.provider.b.a.b().d().a(p.cw.b.c.a);
        }
    }

    protected void a(String s1, String s2, Runnable runnable)
    {
        w.a(s1, s2, runnable);
    }

    protected void a(String s1, String s2, String s3)
    {
        p.df.a.c("WebViewClientBase", String.format("unhandled showTextInput (callback=%s; label=%s; hint=%s)", new Object[] {
            s1, s2, s3
        }));
    }

    protected void a(String s1, String s2, String s3, String s4, String s5)
    {
    }

    protected void a(String s1, String s2, String s3, String s4, String s5, String s6)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(s1);
        if (s1.contains("?"))
        {
            s1 = "&pat=";
        } else
        {
            s1 = "?pat=";
        }
        s1 = stringbuilder.append(s1).append(com.pandora.android.util.s.b(com.pandora.android.provider.b.a.d().b())).toString();
        com.pandora.android.activity.a.a(a, s1, s2, s3, s4, s5, s6);
    }

    protected void a(String s1, JSONObject jsonobject, String s2, com.pandora.radio.data.b b1, p.cp.c c1)
    {
        (new am(com.pandora.android.provider.b.a.b(), s1, jsonobject, b1, c1.a(), c1.d(), null, s2)).execute(new Object[0]);
    }

    protected void a(JSONObject jsonobject)
    {
        k = true;
        jsonobject = jsonobject.optJSONObject("adIdentifiers");
        if (jsonobject != null)
        {
            String s1 = jsonobject.optString("lineId", null);
            m = new com.pandora.radio.data.b(jsonobject.optString("creativeId", null), s1);
        }
    }

    protected transient void a(p ap[])
    {
    }

    protected boolean a()
    {
        return false;
    }

    public boolean a(Uri uri, a a1)
    {
        if (l != null)
        {
            long l1 = System.currentTimeMillis() - ((Long)l.get(a1)).longValue();
            if (l1 < 1300L)
            {
                p.df.a.c("WebViewClientBase", (new StringBuilder()).append("shouldOverrideUrlLoading, too soon to load URL, possibly not be a user click. _lastTimeCustomActionUriProcessed: ").append(l1).append(" ms ago. uriType = ").append(a1).append(" uri = ").append(uri).toString());
                return true;
            }
        }
        return false;
    }

    protected boolean a(boolean flag)
    {
        return false;
    }

    public String b(b b1)
    {
        return b(m(), b1);
    }

    protected void b()
    {
    }

    protected void b(String s1)
    {
        (new android.app.AlertDialog.Builder(a)).setMessage(s1).setPositiveButton(0x104000a, null).setCancelable(false).create().show();
    }

    protected void b(String s1, String s2)
    {
        p.df.a.c("WebViewClientBase", String.format("unhandled playlistUpdated (staitonId=%s, startingTrackToken=%s)", new Object[] {
            s1, s2
        }));
    }

    protected void b(String s1, String s2, String s3, String s4, String s5, String s6)
    {
        com.pandora.android.util.f.a(a, s1, s2, s3, s4, s5, s6);
    }

    protected void b(JSONObject jsonobject)
    {
        k = false;
        a(jsonobject);
        if (!k)
        {
            throw new g((new StringBuilder()).append("Activity ").append(getClass().getSimpleName()).append(" did not call through to super.onResume()").toString());
        } else
        {
            return;
        }
    }

    public void b(boolean flag)
    {
        c = flag;
    }

    protected HashMap c(String s1, String s2)
    {
        (new n(s1, s2)).execute(new Object[0]);
        return null;
    }

    protected void c()
    {
        d();
    }

    public void c(boolean flag)
    {
        e = flag;
        e(true);
    }

    protected boolean c(String s1)
    {
        boolean flag = false;
        if (a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(s1)), 0).size() > 0)
        {
            flag = true;
        }
        return flag;
    }

    protected HashMap d(String s1)
    {
        if (c(s1))
        {
            return d("canOpenURL", "1");
        } else
        {
            return d("canOpenURL", "0");
        }
    }

    protected void d()
    {
    }

    public void d(boolean flag)
    {
        q = flag;
    }

    protected HashMap e(String s1)
    {
        if (((TelephonyManager)m().getSystemService("phone")).getPhoneType() != 0)
        {
            com.pandora.android.activity.a.b(a, s1);
            return d("success", "true");
        } else
        {
            return d("error", "Phone dialer is not supported");
        }
    }

    protected void e()
    {
    }

    protected HashMap f(String s1)
    {
        (new n(s1)).execute(new Object[0]);
        return null;
    }

    protected void f()
    {
    }

    protected HashMap g(String s1)
    {
        com.pandora.android.activity.a.a(a, s1);
        return null;
    }

    protected void h()
    {
    }

    protected void h(String s1)
    {
    }

    protected HashMap i(String s1)
    {
        return d("value", s1);
    }

    public boolean l()
    {
        return q;
    }

    protected Context m()
    {
        if (a != null)
        {
            return a;
        } else
        {
            return b;
        }
    }

    protected void n()
    {
        com.pandora.android.provider.b.a.b().d().b(p.cw.b.c.a);
    }

    protected void o()
    {
        com.pandora.android.provider.b.a.b().f().a();
    }

    public void onPageFinished(WebView webview, String s1)
    {
        super.onPageFinished(webview, s1);
        a(webview);
        CookieSyncManager.getInstance().sync();
        if (q)
        {
            com.pandora.android.util.s.k();
        }
    }

    public void onPageStarted(WebView webview, String s1, Bitmap bitmap)
    {
        super.onPageStarted(webview, s1, bitmap);
        a(webview);
    }

    protected String p()
    {
        String s2 = "unknown";
        af af1 = com.pandora.android.provider.b.a.d();
        String s1 = s2;
        if (af1 != null)
        {
            s1 = s2;
            if (af1.w())
            {
                s1 = "complimentary";
            }
            if (af1.i())
            {
                s1 = "subscriber";
            } else
            if (af1.a())
            {
                return "registered";
            }
        }
        return s1;
    }

    protected void q()
    {
        PandoraIntent pandoraintent = new PandoraIntent("hide_banner_ad");
        pandoraintent.putExtra("ad_close_extra", com.pandora.radio.util.k.a.b);
        pandoraintent.putExtra("hide_all_banners", false);
        com.pandora.android.provider.b.a.C().a(pandoraintent);
    }

    protected HashMap r()
    {
        PandoraIntent pandoraintent = new PandoraIntent("disable_video_ads_until_next_station_change");
        com.pandora.android.provider.b.a.C().a(pandoraintent);
        boolean flag = true;
_L2:
        return d("success", String.valueOf(flag));
        Exception exception;
        exception;
        p.df.a.c("WebViewClientBase", "disableVideoAdsUntilNextStationChange exception", exception);
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void s()
    {
        e(false);
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s1)
    {
        boolean flag;
        p.df.a.a("WebViewClientBase", (new StringBuilder()).append("shouldOverrideUrlLoading, url = ").append(s1).toString());
        if (com.pandora.android.util.s.a(s1))
        {
            return false;
        }
        flag = e;
        e = false;
        Uri uri;
        Object obj;
        boolean flag1;
        uri = j(s1);
        obj = m();
        if (!c(uri))
        {
            break MISSING_BLOCK_LABEL_161;
        }
        obj = b(uri);
        flag1 = k(s1);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        if (a(uri, ((a) (obj))))
        {
            return true;
        }
        try
        {
            a(uri, webview);
        }
        // Misplaced declaration of an exception variable
        catch (WebView webview)
        {
            p.df.a.e("WebViewClientBase", (new StringBuilder()).append("Error processing url: ").append(s1).toString(), webview);
            return false;
        }
        if (!flag || obj == null || !flag1)
        {
            break MISSING_BLOCK_LABEL_345;
        }
        p.df.a.a("WebViewClientBase", (new StringBuilder()).append("_lastTimeCustomActionUriProcessed.put current time: ").append(obj).toString());
        l.put(obj, Long.valueOf(System.currentTimeMillis()));
        break MISSING_BLOCK_LABEL_345;
        flag1 = a(uri);
        if (!c || !flag1 || !flag)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        p.df.a.a("WebViewClientBase", (new StringBuilder()).append("shouldOverrideUrlLoading, fall through to open landing page - url = ").append(s1).toString());
        webview = new l(t(), s1, null, -1, com.pandora.android.data.l.a.a, null);
        com.pandora.android.activity.a.a(a, webview, true, 124);
        return true;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_273;
        }
        p.df.a.a("WebViewClientBase", (new StringBuilder()).append("shouldOverrideUrlLoading, doing default for url = ").append(s1).toString());
        return false;
        p.df.a.a("WebViewClientBase", (new StringBuilder()).append("shouldOverrideUrlLoading, delegating to outside the app for url = ").append(s1).toString());
        ((Context) (obj)).startActivity(new Intent("android.intent.action.VIEW", uri));
        return true;
        return true;
    }

    public com.pandora.radio.data.b t()
    {
        return m;
    }

}
