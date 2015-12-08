// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.inmobi.rendering;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Binder;
import android.os.Handler;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.inmobi.commons.a.a;
import com.inmobi.commons.core.utilities.Logger;
import com.inmobi.commons.core.utilities.info.DisplayInfo;
import com.inmobi.rendering.mraid.MraidMediaProcessor;
import com.inmobi.rendering.mraid.c;
import com.inmobi.rendering.mraid.d;
import com.inmobi.rendering.mraid.h;
import com.inmobi.rendering.mraid.i;
import com.inmobi.rendering.mraid.j;
import com.inmobi.rendering.mraid.k;
import com.inmobi.rendering.mraid.l;
import com.inmobi.rendering.mraid.m;
import com.inmobi.rendering.mraid.n;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.inmobi.rendering:
//            InMobiAdActivity, a, RenderingProperties, CustomView

public final class RenderView extends WebView
{
    public static interface b
    {

        public abstract void a(RenderView renderview);

        public abstract void a(RenderView renderview, HashMap hashmap);

        public abstract void b(RenderView renderview);

        public abstract void b(RenderView renderview, HashMap hashmap);

        public abstract void c(RenderView renderview);

        public abstract void d(RenderView renderview);

        public abstract void e(RenderView renderview);

        public abstract void f(RenderView renderview);

        public abstract void g(RenderView renderview);
    }


    private static final String a = com/inmobi/rendering/RenderView.getSimpleName();
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private String F;
    private boolean G;
    private boolean H;
    private final Object I = new Object();
    private final Object J = new Object();
    private boolean K;
    private boolean L;
    private View M;
    private android.webkit.WebChromeClient.CustomViewCallback N;
    private int O;
    private final InMobiAdActivity.b P = new _cls4();
    private final WebViewClient Q = new _cls5();
    private final WebChromeClient R = new _cls6();
    private RenderView b;
    private List c;
    private Activity d;
    private ViewGroup e;
    private b f;
    private RenderViewState g;
    private RenderingProperties h;
    private h i;
    private k j;
    private MraidMediaProcessor k;
    private n l;
    private com.inmobi.rendering.a m;
    private com.inmobi.ads.b.e n;
    private com.inmobi.ads.b.c o;
    private List p;
    private a q;
    private boolean r;
    private boolean s;
    private d t;
    private m u;
    private l v;
    private JSONObject w;
    private JSONObject x;
    private boolean y;
    private boolean z;

    public RenderView(Context context, RenderingProperties renderingproperties)
    {
        super(context);
        c = new ArrayList();
    /* block-local class not found */
    class RenderViewState {}

        g = RenderViewState.DEFAULT;
        p = new ArrayList();
    /* block-local class not found */
    class a {}

        q = new a(null);
        y = true;
        z = true;
        A = false;
        B = false;
        C = false;
        D = false;
        E = false;
        F = null;
        G = false;
        H = false;
        L = true;
        O = -1;
        b = null;
        h = renderingproperties;
        K = false;
    }

    static View a(RenderView renderview, View view)
    {
        renderview.M = view;
        return view;
    }

    static android.webkit.WebChromeClient.CustomViewCallback a(RenderView renderview, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        renderview.N = customviewcallback;
        return customviewcallback;
    }

    private void a(int i1, int j1)
    {
        b((new StringBuilder()).append("window.mraidview.broadcastEvent('sizeChange',").append(i1).append(",").append(j1).append(");").toString());
    }

    static void a(RenderView renderview, String s1)
    {
        renderview.i(s1);
    }

    private boolean a(Vibrator vibrator)
    {
        return vibrator.hasVibrator();
    }

    static boolean a(RenderView renderview)
    {
        return renderview.H;
    }

    static boolean a(RenderView renderview, boolean flag)
    {
        renderview.K = flag;
        return flag;
    }

    static RenderingProperties b(RenderView renderview)
    {
        return renderview.h;
    }

    static void b(RenderView renderview, String s1)
    {
        renderview.j(s1);
    }

    static boolean b(RenderView renderview, boolean flag)
    {
        renderview.G = flag;
        return flag;
    }

    static RenderView c(RenderView renderview)
    {
        return renderview.b;
    }

    private void c(boolean flag)
    {
        if (!K)
        {
            C = flag;
            if (!flag)
            {
                l.a(getRenderViewContext());
            } else
            {
                f.d(this);
            }
            d(C);
        }
    }

    static b d(RenderView renderview)
    {
        return renderview.f;
    }

    private void d(boolean flag)
    {
        b((new StringBuilder()).append("window.mraidview.broadcastEvent('viewableChange',").append(flag).append(");").toString());
    }

    static RenderViewState e(RenderView renderview)
    {
        return renderview.g;
    }

    static MraidMediaProcessor f(RenderView renderview)
    {
        return renderview.k;
    }

    static List g(RenderView renderview)
    {
        return renderview.p;
    }

    private void h(String s1)
    {
        b((new StringBuilder()).append("window.mraidview.broadcastEvent('stateChange','").append(s1).append("');").toString());
    }

    static boolean h(RenderView renderview)
    {
        return renderview.G;
    }

    static void i(RenderView renderview)
    {
        renderview.t();
    }

    private void i(String s1)
    {
        loadUrl(s1);
    }

    static View j(RenderView renderview)
    {
        return renderview.M;
    }

    private void j(String s1)
    {
        evaluateJavascript(s1, null);
    }

    static android.webkit.WebChromeClient.CustomViewCallback k(RenderView renderview)
    {
        return renderview.N;
    }

    static String q()
    {
        return a;
    }

    private void r()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            s = isHardwareAccelerated();
        }
    }

    private boolean s()
    {
        long l1 = (new i()).c();
        return System.currentTimeMillis() / 1000L - l1 > getMraidConfig().a();
    }

    private void t()
    {
        b("window.imaiview.broadcastEvent('ready');");
        b("window.mraidview.broadcastEvent('ready');");
    }

    private boolean u()
    {
        return F != null;
    }

    private void v()
    {
        ((InMobiAdActivity)com.inmobi.rendering.InMobiAdActivity.a().getFullScreenActivity()).a(true);
        com.inmobi.rendering.InMobiAdActivity.a().getFullScreenActivity().finish();
        if (O != -1)
        {
            com.inmobi.rendering.InMobiAdActivity.a().getFullScreenActivity().overridePendingTransition(0, O);
        }
    }

    private void w()
    {
        k.c();
    }

    private void x()
    {
        if (RenderViewState.DEFAULT == g)
        {
            return;
        } else
        {
            K = true;
            i.a();
            v();
            K = false;
            return;
        }
    }

    private void y()
    {
        if (RenderViewState.DEFAULT == g)
        {
            return;
        } else
        {
            K = true;
            j.b();
            setAndUpdateViewState(RenderViewState.DEFAULT);
            f.f(this);
            K = false;
            return;
        }
    }

    private void z()
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((c)iterator.next()).cancel(true)) { }
        c.clear();
        com.inmobi.commons.a.a.a(com.inmobi.commons.a.a.a(getRenderViewContext()), String.valueOf(hashCode()));
    }

    public void a(b b1, com.inmobi.ads.b.e e1, com.inmobi.ads.b.c c1)
    {
        n = e1;
        o = c1;
        f = b1;
        e = (ViewGroup)getParent();
        if ("production".equals("staging") && android.os.Build.VERSION.SDK_INT >= 19)
        {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        if (getRenderingConfig() != null)
        {
            setBackgroundColor(getRenderingConfig().d());
        }
        if (getMraidConfig() != null && s())
        {
            (new j(getMraidConfig().d(), getMraidConfig().b(), getMraidConfig().c())).a();
        }
        setScrollContainer(false);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        getSettings().setJavaScriptEnabled(true);
        getSettings().setGeolocationEnabled(true);
        setWebViewClient(Q);
        setWebChromeClient(R);
        m = new com.inmobi.rendering.a(this, h);
        addJavascriptInterface(m, "sdkController");
        i = new h(this);
        j = new k(this);
        k = new MraidMediaProcessor(this);
        l = new n(this);
        t = new d();
        u = new m();
        v = new l();
    }

    public void a(String s1)
    {
        K = false;
        (new Handler(getRenderViewContext().getMainLooper())).post(new _cls1(s1));
    }

    public void a(String s1, int i1, String s2, String s3, String s4)
    {
        if (!g("postToSocial"))
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "postToSocial called even when it is not supported");
            return;
        } else
        {
            l.a(s1, getRenderViewContext(), i1, s2, s3, s4);
            return;
        }
    }

    public void a(String s1, String s2)
    {
        b((new StringBuilder()).append(s1).append(".").append(s2).toString());
    }

    public void a(String s1, String s2, int i1)
    {
        if (RenderingProperties.PlacementType.FULL_SCREEN != h.a() && RenderViewState.EXPANDED != getViewState())
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "Media playback controls are only supported on full screen ads! Ignoring request ...");
            return;
        } else
        {
            k.a(s1, s2, i1);
            return;
        }
    }

    public void a(String s1, String s2, com.inmobi.rendering.mraid.MraidMediaProcessor.MediaContentType mediacontenttype)
    {
        if (RenderingProperties.PlacementType.FULL_SCREEN != h.a() && RenderViewState.EXPANDED != getViewState())
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "Media playback is only supported on full screen ads! Ignoring request ...");
            return;
        }
        if (d == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "Media playback is  not allowed before it is visible! Ignoring request ...");
            a(s1, "Media playback is  not allowed before it is visible! Ignoring request ...", "playVideo");
            return;
        } else
        {
            k.a(s1, s2, mediacontenttype, d);
            return;
        }
    }

    public void a(String s1, String s2, String s3)
    {
        a(s1, (new StringBuilder()).append("broadcastEvent('error',\"").append(s2).append("\", \"").append(s3).append("\")").toString());
    }

    public void a(String s1, String s2, String s3, String s4, String s5, String s6, String s7, 
            String s8, String s9, String s10, String s11)
    {
        l.a(s1, getRenderViewContext(), s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
    }

    public void a(boolean flag)
    {
        setCloseRegionDisabled(flag);
        Object obj = getRootView();
        if (obj != null)
        {
            obj = (CustomView)(CustomView)((View) (obj)).findViewById(65531);
            if (obj != null)
            {
                byte byte0;
                if (D)
                {
                    byte0 = 8;
                } else
                {
                    byte0 = 0;
                }
                ((CustomView) (obj)).setVisibility(byte0);
            }
        }
    }

    public boolean a()
    {
        return C;
    }

    public void b(String s1)
    {
        (new Handler(getRenderViewContext().getMainLooper())).post(new _cls2(s1));
    }

    public void b(String s1, String s2)
    {
        if (RenderingProperties.PlacementType.FULL_SCREEN != h.a() && RenderViewState.EXPANDED != getViewState())
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "Media playback controls are only supported on full screen ads! Ignoring request ...");
            return;
        } else
        {
            k.a(s1, s2);
            return;
        }
    }

    public void b(String s1, String s2, int i1)
    {
        if (RenderingProperties.PlacementType.FULL_SCREEN != h.a() && RenderViewState.EXPANDED != getViewState())
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "Media playback controls are only supported on full screen ads! Ignoring request ...");
            return;
        } else
        {
            k.b(s1, s2, i1);
            return;
        }
    }

    public void b(String s1, String s2, String s3)
    {
        try
        {
            Intent intent = Intent.parseUri(s3, 0);
            intent.setFlags(0x10000000);
            getRenderViewContext().startActivity(intent);
        }
        catch (URISyntaxException urisyntaxexception)
        {
            a(s2, (new StringBuilder()).append("Cannot resolve URI (").append(s3).append(")").toString(), s1);
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, (new StringBuilder()).append("Error message in processing openExternal: ").append(urisyntaxexception.getMessage()).toString());
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            a(s2, (new StringBuilder()).append("No app can handle the URI (").append(s3).append(")").toString(), s1);
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, (new StringBuilder()).append("Error message in processing openExternal: ").append(activitynotfoundexception.getMessage()).toString());
            return;
        }
        getListener().g(this);
        a(s2, (new StringBuilder()).append("broadcastEvent('").append(s1).append("Successful','").append(s3).append("');").toString());
    }

    public void b(boolean flag)
    {
        setUseCustomClose(flag);
        if (getRootView() != null)
        {
            CustomView customview = (CustomView)getRootView().findViewById(65532);
            if (customview != null)
            {
                byte byte0;
                if (A)
                {
                    byte0 = 8;
                } else
                {
                    byte0 = 0;
                }
                customview.setVisibility(byte0);
            }
        }
    }

    public boolean b()
    {
        return y;
    }

    public void c(String s1)
    {
        F = s1;
    }

    public void c(String s1, String s2)
    {
        if (RenderingProperties.PlacementType.FULL_SCREEN != h.a() && RenderViewState.EXPANDED != getViewState())
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "Media playback controls are only supported on full screen ads! Ignoring request ...");
            return;
        } else
        {
            k.b(s1, s2);
            return;
        }
    }

    public void c(String s1, String s2, int i1)
    {
        if (!g("vibrate"))
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "vibrate called despite the fact that it is not supported");
            return;
        }
        if (!a())
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "Creative not visible. Will not vibrate.");
            a(s1, "Creative not visible. Will not vibrate.", "vibrate");
            return;
        } else
        {
            l.a(s1, getRenderViewContext(), s2, i1);
            return;
        }
    }

    public void c(String s1, String s2, String s3)
    {
        if (s3 == null || s3.startsWith("http") && !URLUtil.isValidUrl(s3))
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, (new StringBuilder()).append(s1).append(" called with invalid url (").append(s3).append(")").toString());
            a(s2, "Invalid URL", s1);
            return;
        }
        if (s3.startsWith("http") && !s3.contains("play.google.com") && !s3.contains("market.android.com") && !s3.contains("market%3A%2F%2F"))
        {
            w();
            InMobiAdActivity.b(this);
            Intent intent = new Intent(getRenderViewContext(), com/inmobi/rendering/InMobiAdActivity);
            intent.putExtra("com.inmobi.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 100);
            if (!(getRenderViewContext() instanceof Activity))
            {
                intent.setFlags(0x10000000);
            }
            intent.putExtra("com.inmobi.rendering.InMobiAdActivity.IN_APP_BROWSER_URL", s3);
            getRenderViewContext().startActivity(intent);
            a(s2, (new StringBuilder()).append("broadcastEvent('").append(s1).append("Successful','").append(s3).append("');").toString());
            return;
        } else
        {
            b(s1, s2, s3);
            return;
        }
    }

    public boolean c()
    {
        return z;
    }

    public void d(String s1)
    {
        if (!r)
        {
            r = true;
            q.a(s1);
            k.d().a(q);
        }
    }

    public void d(String s1, String s2)
    {
        if (RenderingProperties.PlacementType.FULL_SCREEN != h.a() && RenderViewState.EXPANDED != getViewState())
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "Media playback controls are only supported on full screen ads! Ignoring request ...");
            return;
        } else
        {
            k.c(s1, s2);
            return;
        }
    }

    public void d(String s1, String s2, String s3)
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, (new StringBuilder()).append("saveContent called: content ID: ").append(s2).append("; URL: ").append(s3).toString());
        if (!g("saveContent"))
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "saveContent called despite the fact that it is not supported");
            JSONObject jsonobject = new JSONObject();
            try
            {
                jsonobject.put("url", s3);
                jsonobject.put("reason", 5);
            }
            // Misplaced declaration of an exception variable
            catch (String s3)
            {
                s3.printStackTrace();
            }
            s3 = jsonobject.toString().replace("\"", "\\\"");
            a(s1, (new StringBuilder()).append("sendSaveContentResult(\"saveContent_").append(s2).append("\", 'failed', \"").append(s3).append("\");").toString());
            return;
        }
        Object obj = new File(com.inmobi.commons.a.a.a(getRenderViewContext()), String.valueOf(hashCode()));
        if (!((File) (obj)).mkdirs() && !((File) (obj)).isDirectory())
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "Cannot create temp directory to save ");
            obj = new JSONObject();
            try
            {
                ((JSONObject) (obj)).put("url", s3);
                ((JSONObject) (obj)).put("reason", 9);
            }
            // Misplaced declaration of an exception variable
            catch (String s3)
            {
                s3.printStackTrace();
            }
            s3 = ((JSONObject) (obj)).toString().replace("\"", "\\\"");
            a(s1, (new StringBuilder()).append("sendSaveContentResult(\"saveContent_").append(s2).append("\", 'failed', \"").append(s3).append("\");").toString());
            return;
        } else
        {
            s1 = new c(s1, new File(((File) (obj)), UUID.randomUUID().toString()), s3, s2, this);
            c.add(s1);
            s1.execute(new Void[0]);
            return;
        }
    }

    public boolean d()
    {
        return A;
    }

    public void destroy()
    {
        H = true;
        K = true;
        O = -1;
        removeJavascriptInterface("sdkController");
        z();
        super.destroy();
    }

    public int e(String s1, String s2)
    {
        if (RenderingProperties.PlacementType.FULL_SCREEN != h.a() && RenderViewState.EXPANDED != getViewState())
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "Media playback controls are only supported on full screen ads! Ignoring request ...");
            return 0;
        } else
        {
            return k.e(s1, s2);
        }
    }

    public void e(String s1)
    {
        if (!g("vibrate"))
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "vibrate called despite the fact that it is not supported");
            return;
        }
        if (!a())
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "Creative not visible. Will not vibrate.");
            a(s1, "Creative not visible. Will not vibrate.", "vibrate");
            return;
        } else
        {
            l.a(s1, getRenderViewContext());
            return;
        }
    }

    public boolean e()
    {
        return D;
    }

    public void f(String s1)
    {
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            c c1 = (c)iterator.next();
            if (s1 == null || s1.trim().length() == 0 || !s1.equals(c1.a()))
            {
                continue;
            }
            c1.cancel(true);
            break;
        } while (true);
    }

    public boolean f()
    {
        return E;
    }

    public boolean f(String s1, String s2)
    {
        if (RenderingProperties.PlacementType.FULL_SCREEN != h.a() && RenderViewState.EXPANDED != getViewState())
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "Media playback controls are only supported on full screen ads! Ignoring request ...");
            return false;
        } else
        {
            return k.d(s1, s2);
        }
    }

    public void g()
    {
        F = null;
    }

    public void g(String s1, String s2)
    {
        if (RenderingProperties.PlacementType.FULL_SCREEN != h.a() && RenderViewState.EXPANDED != getViewState())
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "Media playback controls are only supported on full screen ads! Ignoring request ...");
            return;
        } else
        {
            k.a(s1, s2, false);
            return;
        }
    }

    public boolean g(String s1)
    {
        PackageManager packagemanager;
        byte byte0;
        boolean flag2;
        boolean flag4;
        flag2 = true;
        flag4 = true;
        packagemanager = getRenderViewContext().getPackageManager();
        byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 14: default 144
    //                   -1886160473: 256
    //                   -1647691422: 286
    //                   -587360353: 396
    //                   -178324674: 364
    //                   114009: 316
    //                   114715: 226
    //                   451310959: 428
    //                   459238621: 412
    //                   1247233375: 348
    //                   1370921258: 271
    //                   1509574865: 301
    //                   1642189884: 332
    //                   1895570642: 380
    //                   1921345160: 241;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
        boolean flag1 = flag4;
        byte0;
        JVM INSTR tableswitch 0 13: default 220
    //                   0 444
    //                   1 223
    //                   2 223
    //                   3 489
    //                   4 520
    //                   5 520
    //                   6 589
    //                   7 629
    //                   8 664
    //                   9 706
    //                   10 776
    //                   11 825
    //                   12 885
    //                   13 892;
           goto _L16 _L17 _L18 _L18 _L19 _L20 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28
_L16:
        flag1 = false;
_L18:
        return flag1;
_L7:
        if (s1.equals("tel"))
        {
            byte0 = 0;
        }
        continue; /* Loop/switch isn't completed */
_L15:
        if (s1.equals("postToSocial"))
        {
            byte0 = 1;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (s1.equals("playVideo"))
        {
            byte0 = 2;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        if (s1.equals("microphone"))
        {
            byte0 = 3;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (s1.equals("inlineVideo"))
        {
            byte0 = 4;
        }
        continue; /* Loop/switch isn't completed */
_L12:
        if (s1.equals("html5video"))
        {
            byte0 = 5;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (s1.equals("sms"))
        {
            byte0 = 6;
        }
        continue; /* Loop/switch isn't completed */
_L13:
        if (s1.equals("saveContent"))
        {
            byte0 = 7;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        if (s1.equals("sendMail"))
        {
            byte0 = 8;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (s1.equals("calendar"))
        {
            byte0 = 9;
        }
        continue; /* Loop/switch isn't completed */
_L14:
        if (s1.equals("takeCameraPicture"))
        {
            byte0 = 10;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (s1.equals("getGalleryImage"))
        {
            byte0 = 11;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        if (s1.equals("storePicture"))
        {
            byte0 = 12;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (s1.equals("vibrate"))
        {
            byte0 = 13;
        }
        continue; /* Loop/switch isn't completed */
_L17:
        s1 = new Intent("android.intent.action.DIAL");
        s1.setData(Uri.parse("tel:123456789"));
        flag1 = flag4;
        if (getRenderViewContext().getPackageManager().resolveActivity(s1, 0x10000) != null) goto _L18; else goto _L29
_L29:
        return false;
_L19:
        if (com.inmobi.commons.a.a.a("android.permission.RECORD_AUDIO") && packagemanager.hasSystemFeature("android.hardware.microphone"))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return flag1;
_L20:
        flag1 = flag2;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            if (s && p())
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
        }
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, (new StringBuilder()).append("HTML5 video supported:").append(flag1).toString());
        return flag1;
_L21:
        s1 = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:123456789"));
        flag1 = flag4;
        if (getRenderViewContext().getPackageManager().resolveActivity(s1, 0x10000) != null) goto _L18; else goto _L30
_L30:
        return false;
_L22:
        flag1 = flag4;
        if (android.os.Build.VERSION.SDK_INT >= 19) goto _L18; else goto _L31
_L31:
        flag1 = flag4;
        if (packagemanager.checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", packagemanager.getNameForUid(Binder.getCallingUid())) == 0) goto _L18; else goto _L32
_L32:
        return false;
_L23:
        s1 = new Intent("android.intent.action.SEND");
        s1.setType("plain/text");
        flag1 = flag4;
        if (getRenderViewContext().getPackageManager().resolveActivity(s1, 0x10000) != null) goto _L18; else goto _L33
_L33:
        return false;
_L24:
        s1 = new Intent("android.intent.action.VIEW");
        s1.setType("vnd.android.cursor.item/event");
        s1 = getRenderViewContext().getPackageManager().resolveActivity(s1, 0x10000);
        flag1 = com.inmobi.commons.a.a.a("android.permission.WRITE_CALENDAR");
        flag2 = com.inmobi.commons.a.a.a("android.permission.READ_CALENDAR");
        if (s1 == null || !flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag4;
        if (flag2) goto _L18; else goto _L34
_L34:
        return false;
_L25:
        s1 = new Intent("android.media.action.IMAGE_CAPTURE");
        s1 = getRenderViewContext().getPackageManager().resolveActivity(s1, 0x10000);
        flag2 = com.inmobi.commons.a.a.a("android.permission.WRITE_EXTERNAL_STORAGE");
        if (s1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag4;
        if (flag2) goto _L18; else goto _L35
_L35:
        return false;
_L26:
        s1 = new Intent("android.intent.action.PICK", android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        s1 = getRenderViewContext().getPackageManager().resolveActivity(s1, 0x10000);
        boolean flag;
        boolean flag3;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag3 = com.inmobi.commons.a.a.a("android.permission.READ_EXTERNAL_STORAGE");
        } else
        {
            flag3 = true;
        }
        if (s1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag4;
        if (flag3) goto _L18; else goto _L36
_L36:
        return false;
_L27:
        return com.inmobi.commons.a.a.a("android.permission.WRITE_EXTERNAL_STORAGE");
_L28:
        if (packagemanager.checkPermission("android.permission.VIBRATE", packagemanager.getNameForUid(Binder.getCallingUid())) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s1 = (Vibrator)getRenderViewContext().getSystemService("vibrator");
        if (!flag || s1 == null || android.os.Build.VERSION.SDK_INT < 11)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag4;
        if (a(s1)) goto _L18; else goto _L37
_L37:
        return false;
        if (true) goto _L1; else goto _L38
_L38:
    }

    public InMobiAdActivity.b getAdScreenEventsListener()
    {
        return P;
    }

    public String getCurrentPosition()
    {
        if (x == null)
        {
            return "";
        } else
        {
            return x.toString();
        }
    }

    public Object getCurrentPositionMonitor()
    {
        return J;
    }

    public String getDefaultPosition()
    {
        if (w == null)
        {
            return "";
        } else
        {
            return w.toString();
        }
    }

    public Object getDefaultPositionMonitor()
    {
        return I;
    }

    public d getExpandProperties()
    {
        return t;
    }

    public Activity getFullScreenActivity()
    {
        return d;
    }

    public b getListener()
    {
        if (f == null)
        {
            _cls3 _lcls3 = new _cls3();
            f = _lcls3;
            return _lcls3;
        } else
        {
            return f;
        }
    }

    public MraidMediaProcessor getMediaProcessor()
    {
        return k;
    }

    public com.inmobi.ads.b.c getMraidConfig()
    {
        return o;
    }

    public String getMraidJsString()
    {
        String s1 = (new i()).b();
        if (s1 == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "Returning default Mraid Js string.");
            return "var imIsObjValid=function(a){return\"undefined\"!=typeof a&&null!=a?!0:!1},EventListeners=function(a){this.event=a;this.count=0;var b={};this.add=function(a){var d=String(a);b[d]||(b[d]=a,this.count++)};this.remove=function(a){a=String(a);return b[a]?(b[a]=null,delete b[a],this.count--,!0):!1};this.removeAll=function(){for(var a in b)this.remove(b[a])};this.broadcast=function(a){for(var d in b)b[d].apply({},a)};this.toString=function(){var c=[a,\":\"],d;for(d in b)c.push(\"|\",d,\"|\");return c.join(\"\")}},\nInmobiObj=function(){this.listeners=[];this.addEventListener=function(a,b){try{if(imIsObjValid(b)&&imIsObjValid(a)){var c=this.listeners;c[a]||(c[a]=new EventListeners);c[a].add(b);\"micIntensityChange\"==a&&window.imraidview.startListeningMicIntensity();\"deviceMuted\"==a&&window.imraidview.startListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&window.imraidview.startListeningDeviceVolumeChange();\"volumeChange\"==a&&window.imraidview.startListeningVolumeChange();\"headphones\"==a&&window.imraidview.startListeningHeadphonePluggedEvents();\n\"backButtonPressed\"==a&&window.imraidview.startListeningForBackButtonPressedEvent()}}catch(d){this.log(d)}};this.removeEventListener=function(a,b){if(imIsObjValid(a)){var c=this.listeners;imIsObjValid(c[a])&&(imIsObjValid(b)?c[a].remove(b):c[a].removeAll());\"micIntensityChange\"==a&&0==c[a].count&&window.imraidview.stopListeningMicIntensity();\"deviceMuted\"==a&&0==c[a].count&&window.imraidview.stopListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningDeviceVolumeChange();\n\"volumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningVolumeChange();\"headphones\"==a&&0==c[a].count&&window.imraidview.stopListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&0==c[a].count&&window.imraidview.stopListeningForBackButtonPressedEvent()}};this.broadcastEvent=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)b[c]=arguments[c];c=b.shift();try{this.listeners[c]&&this.listeners[c].broadcast(b)}catch(d){}}};this.sendSaveContentResult=\nfunction(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)if(2==c){var d=arguments[c],d=JSON.parse(d);b[c]=d}else b[c]=arguments[c];d=b[1];\"success\"!=d&&(c=b[0].substring(b[0].indexOf(\"_\")+1),imraid.saveContentIDMap[c]&&delete imraid.saveContentIDMap[c]);window.imraid.broadcastEvent(b[0],b[1],b[2])}}},__im__iosNativeCall={nativeCallInFlight:!1,nativeCallQueue:[],executeNativeCall:function(a){this.nativeCallInFlight?this.nativeCallQueue.push(a):(this.nativeCallInFlight=\n!0,window.location=a)},nativeCallComplete:function(a){0==this.nativeCallQueue.length?this.nativeCallInFlight=!1:(a=this.nativeCallQueue.shift(),window.location=a)}},IOSNativeCall=function(){this.urlScheme=\"\";this.executeNativeCall=function(a){for(var b=this.urlScheme+\"://\"+a,c,d=!0,e=1;e<arguments.length;e+=2)c=arguments[e+1],null!=c&&(d?(b+=\"?\",d=!1):b+=\"&\",b+=arguments[e]+\"=\"+escape(c));__im__iosNativeCall.executeNativeCall(b);return\"OK\"};this.nativeCallComplete=function(a){__im__iosNativeCall.nativeCallComplete(a);\nreturn\"OK\"};this.updateKV=function(a,b){this[a]=b;var c=this.broadcastMap[a];c&&this.broadcastEvent(c,b)}};\n(function(){var a=window.mraidview={};a.orientationProperties={allowOrientationChange:!0,forceOrientation:\"none\",direction:\"right\"};var b=[],c=!1;a.zeroPad=function(a){var e=\"\";10>a&&(e+=\"0\");return e+a};a.supports=function(a){console.log(\"bridge: supports (MRAID)\");if(\"string\"!=typeof a)window.mraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\"supports\");else return\"false\"!=sdkController.supports(\"window.mraidview\",a)};a.useCustomClose=function(a){try{sdkController.useCustomClose(\"window.mraidview\",\na)}catch(e){imraidview.showAlert(\"use CustomClose: \"+e)}};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(a){imraidview.showAlert(\"close: \"+a)}};a.stackCommands=function(a,e){c?b.push(a):(eval(a),e&&(c=!0))};a.expand=function(a){try{\"undefined\"==typeof a&&(a=null),sdkController.expand(\"window.mraidview\",a)}catch(e){imraidview.showAlert(\"executeNativeExpand: \"+e+\", URL = \"+a)}};a.setExpandProperties=function(d){try{d?this.props=d:d=null;if(\"undefined\"!=typeof d.lockOrientation&&\nnull!=d.lockOrientation&&\"undefined\"!=typeof d.orientation&&null!=d.orientation){var e={};e.allowOrientationChange=!d.lockOrientation;e.forceOrientation=d.orientation;a.setOrientationProperties(e)}sdkController.setExpandProperties(\"window.mraidview\",a.stringify(d))}catch(b){imraidview.showAlert(\"executeNativesetExpandProperties: \"+b+\", props = \"+d)}};a.getExpandProperties=function(){try{return eval(\"(\"+sdkController.getExpandProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getExpandProperties: \"+\na)}};a.setOrientationProperties=function(d){try{d?(\"undefined\"!=typeof d.allowOrientationChange&&(a.orientationProperties.allowOrientationChange=d.allowOrientationChange),\"undefined\"!=typeof d.forceOrientation&&(a.orientationProperties.forceOrientation=d.forceOrientation)):d=null,sdkController.setOrientationProperties(\"window.mraidview\",a.stringify(a.orientationProperties))}catch(e){imraidview.showAlert(\"setOrientationProperties: \"+e+\", props = \"+d)}};a.getOrientationProperties=function(){return{forceOrientation:a.orientationProperties.forceOrientation,\nallowOrientationChange:a.orientationProperties.allowOrientationChange}};a.resizeProps=null;a.setResizeProperties=function(d){var e,b;try{e=parseInt(d.width);b=parseInt(d.height);if(isNaN(e)||isNaN(b)||1>e||1>b)throw\"Invalid\";d.width=e;d.height=b;a.resizeProps=d;sdkController.setResizeProperties(\"window.mraidview\",a.stringify(d))}catch(c){window.mraid.broadcastEvent(\"error\",\"Invalid properties.\",\"setResizeProperties\")}};a.getResizeProperties=function(){try{return eval(\"(\"+sdkController.getResizeProperties(\"window.mraidview\")+\n\")\")}catch(a){imraidview.showAlert(\"getResizeProperties: \"+a)}};a.open=function(a){\"undefined\"==typeof a&&(a=null);try{sdkController.open(\"window.mraidview\",a)}catch(e){imraidview.showAlert(\"open: \"+e)}};a.getScreenSize=function(){try{return eval(\"(\"+sdkController.getScreenSize(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getScreenSize: \"+a)}};a.getMaxSize=function(){try{return eval(\"(\"+sdkController.getMaxSize(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getMaxSize: \"+a)}};\na.getCurrentPosition=function(){try{return eval(\"(\"+sdkController.getCurrentPosition(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getCurrentPosition: \"+a)}};a.getDefaultPosition=function(){try{return eval(\"(\"+sdkController.getDefaultPosition(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getDefaultPosition: \"+a)}};a.getState=function(){try{return String(sdkController.getState(\"window.mraidview\"))}catch(a){imraidview.showAlert(\"getState: \"+a)}};a.isViewable=function(){try{return sdkController.isViewable(\"window.mraidview\")}catch(a){imraidview.showAlert(\"isViewable: \"+\na)}};a.getPlacementType=function(){return sdkController.getPlacementType(\"window.mraidview\")};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(a){imraidview.showAlert(\"close: \"+a)}};\"function\"!=typeof String.prototype.startsWith&&(String.prototype.startsWith=function(a){return 0==this.indexOf(a)});a.playVideo=function(a){var e=\"\";null!=a&&(e=a);try{sdkController.playVideo(\"window.mraidview\",e)}catch(b){imraidview.showAlert(\"playVideo: \"+b)}};a.stringify=function(d){if(\"undefined\"===\ntypeof JSON){var e=\"\",b;if(\"undefined\"==typeof d.length)return a.stringifyArg(d);for(b=0;b<d.length;b++)0<b&&(e+=\",\"),e+=a.stringifyArg(d[b]);return e+\"]\"}return JSON.stringify(d)};a.stringifyArg=function(a){var e,b,c;b=typeof a;e=\"\";if(\"number\"===b||\"boolean\"===b)e+=args;else if(a instanceof Array)e=e+\"[\"+a+\"]\";else if(a instanceof Object){b=!0;e+=\"{\";for(c in a)null!==a[c]&&(b||(e+=\",\"),e=e+'\"'+c+'\":',b=typeof a[c],e=\"number\"===b||\"boolean\"===b?e+a[c]:\"function\"===typeof a[c]?e+'\"\"':a[c]instanceof\nObject?e+this.stringify(args[i][c]):e+'\"'+a[c]+'\"',b=!1);e+=\"}\"}else a=a.replace(/\\\\/g,\"\\\\\\\\\"),a=a.replace(/\"/g,'\\\\\"'),e=e+'\"'+a+'\"';imraidview.showAlert(\"json:\"+e);return e};getPID=function(a){var e=\"\";null!=a&&(\"undefined\"!=typeof a.id&&null!=a.id)&&(e=a.id);return e};a.resize=function(){if(null==a.resizeProps)window.mraid.broadcastEvent(\"error\",\"Valid resize dimensions must be provided before calling resize\",\"resize\");else try{sdkController.resize(\"window.mraidview\")}catch(b){imraidview.showAlert(\"resize called in bridge\")}};\na.createCalendarEvent=function(a){var e={};\"object\"!=typeof a&&window.mraid.broadcastEvent(\"error\",\"createCalendarEvent method expects parameter\",\"createCalendarEvent\");if(\"string\"!=typeof a.start||\"string\"!=typeof a.end)window.mraid.broadcastEvent(\"error\",\"createCalendarEvent method expects string parameters for start and end dates\",\"createCalendarEvent\");else{\"string\"!=typeof a.id&&(a.id=\"\");\"string\"!=typeof a.location&&(a.location=\"\");\"string\"!=typeof a.description&&(a.description=\"\");\"string\"!=\ntypeof a.summary&&(a.summary=\"\");\"string\"==typeof a.status&&(\"pending\"==a.status||\"tentative\"==a.status||\"confirmed\"==a.status||\"cancelled\"==a.status)||(a.status=\"\");\"string\"==typeof a.transparency&&(\"opaque\"==a.transparency||\"transparent\"==a.transparency)||(a.transparency=\"\");if(null==a.recurrence||\"\"==a.recurrence)e={};else{\"string\"==typeof a.summary&&(e.frequency=a.recurrence.frequency);null!=a.recurrence.interval&&(e.interval=a.recurrence.interval);\"string\"==typeof a.summary&&(e.expires=a.recurrence.expires);\nnull!=a.recurrence.exceptionDates&&(e.exceptionDates=a.recurrence.exceptionDates);if(null!=a.recurrence.daysInWeek){var b=formatDaysInWeek(a.recurrence.daysInWeek);null!=b?e.daysInWeek=b:imraidview.showAlert(\"daysInWeek invalid format \")}e.daysInMonth=a.recurrence.daysInMonth;e.daysInYear=a.recurrence.daysInYear;e.weeksInMonth=a.recurrence.weeksInMonth;e.monthsInYear=a.recurrence.monthsInYear}\"string\"!=typeof a.reminder&&(a.reminder=\"\");try{sdkController.createCalendarEvent(\"window.mraidview\",a.id,\na.start,a.end,a.location,a.description,a.summary,a.status,a.transparency,JSON.stringify(e),a.reminder)}catch(c){sdkController.createCalendarEvent(\"window.mraidview\",a.start,a.end,a.location,a.description)}}};formatDaysInWeek=function(a){try{if(0!=a.length){for(var e=0;e<a.length;e++)switch(a[e]){case 0:a[e]=\"SU\";break;case 1:a[e]=\"MO\";break;case 2:a[e]=\"TU\";break;case 3:a[e]=\"WE\";break;case 4:a[e]=\"TH\";break;case 5:a[e]=\"FR\";break;case 6:a[e]=\"SA\";break;default:return null}return a}}catch(b){}return null};\na.storePicture=function(b){console.log(\"bridge: storePicture\");if(\"string\"!=typeof b)window.mraid.broadcastEvent(\"error\",\"storePicture method expects url as string parameter\",\"storePicture\");else{if(a.supports(\"storePicture\"))return!window.confirm(\"Do you want to download the file?\")?(window.mraid.broadcastEvent(\"error\",\"Store picture on \"+b+\" was cancelled by user.\",\"storePicture\"),!1):sdkController.storePicture(\"window.mraidview\",b);window.mraid.broadcastEvent(\"error\",\"Store picture on \"+b+\" was cancelled because it is unsupported in this device/app.\",\n\"storePicture\")}};a.fireMediaTrackingEvent=function(a,e){};a.fireMediaErrorEvent=function(a,e){};a.fireMediaTimeUpdateEvent=function(a,e,b){};a.fireMediaCloseEvent=function(a,e,b){};a.fireMediaVolumeChangeEvent=function(a,e,b){};a.broadcastEvent=function(){window.mraid.broadcastEvent.apply(window.mraid,arguments)}})();\n(function(){var a=window.mraid=new InmobiObj,b=window.mraidview;a.useCustomClose=b.useCustomClose;a.close=b.close;a.getExpandProperties=b.getExpandProperties;a.setExpandProperties=function(c){\"undefined\"!=typeof c&&(\"useCustomClose\"in c&&\"undefined\"!=typeof a.getState()&&\"expanded\"!=a.getState())&&a.useCustomClose(c.useCustomClose);b.setExpandProperties(c)};a.getResizeProperties=b.getResizeProperties;a.setResizeProperties=b.setResizeProperties;a.getOrientationProperties=b.getOrientationProperties;\na.setOrientationProperties=b.setOrientationProperties;a.expand=b.expand;a.getMaxSize=b.getMaxSize;a.getState=b.getState;a.isViewable=b.isViewable;a.createCalendarEvent=b.createCalendarEvent;a.open=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"URL is required.\",\"open\"):b.open(c)};a.resize=b.resize;a.getVersion=function(){return\"2.0\"};a.getPlacementType=b.getPlacementType;a.playVideo=function(a){b.playVideo(a)};a.getScreenSize=b.getScreenSize;a.getCurrentPosition=b.getCurrentPosition;a.getDefaultPosition=\nb.getDefaultPosition;a.supports=function(a){return b.supports(a)};a.storePicture=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a valid URL\",\"storePicture\"):b.storePicture(c)}})();\n(function(){var a=window.imraidview={},b,c=!0;a.setOrientationProperties=function(e){try{e?(\"undefined\"!=typeof e.allowOrientationChange&&(mraidview.orientationProperties.allowOrientationChange=e.allowOrientationChange),\"undefined\"!=typeof e.forceOrientation&&(mraidview.orientationProperties.forceOrientation=e.forceOrientation),\"undefined\"!=typeof e.direction&&(mraidview.orientationProperties.direction=e.direction)):e=null,sdkController.setOrientationProperties(\"window.imraidview\",mraidview.stringify(mraidview.orientationProperties))}catch(b){a.showAlert(\"setOrientationProperties: \"+\nb+\", props = \"+e)}};a.getOrientationProperties=function(){return mraidview.orientationProperties};a.getWindowOrientation=function(){var a=window.orientation;0>a&&(a+=360);window.innerWidth!==this.previousWidth&&0==a&&window.innerWidth>window.innerHeight&&(a=90);return a};var d=function(){window.setTimeout(function(){if(c||a.getWindowOrientation()!==b)c=!1,b=a.getWindowOrientation(),sdkController.onOrientationChange(\"window.imraidview\"),imraid.broadcastEvent(\"orientationChange\",b)},200)};a.registerOrientationListener=\nfunction(){b=a.getWindowOrientation();window.addEventListener(\"resize\",d,!1);window.addEventListener(\"orientationchange\",d,!1)};a.unRegisterOrientationListener=function(){window.removeEventListener(\"resize\",d,!1);window.removeEventListener(\"orientationchange\",d,!1)};window.imraidview.registerOrientationListener();a.firePostStatusEvent=function(a){window.imraid.broadcastEvent(\"postStatus\",a)};a.fireMediaTrackingEvent=function(a,b){var c={};c.name=a;var d=\"inmobi_media_\"+a;\"undefined\"!=typeof b&&(null!=\nb&&\"\"!=b)&&(d=d+\"_\"+b);window.imraid.broadcastEvent(d,c)};a.fireMediaErrorEvent=function(a,b){var c={name:\"error\"};c.code=b;var d=\"inmobi_media_\"+c.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(d=d+\"_\"+a);window.imraid.broadcastEvent(d,c)};a.fireMediaTimeUpdateEvent=function(a,b,c){var d={name:\"timeupdate\",target:{}};d.target.currentTime=b;d.target.duration=c;b=\"inmobi_media_\"+d.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,d)};a.saveContent=function(a,\nb,c){window.imraid.addEventListener(\"saveContent_\"+a,c);sdkController.saveContent(\"window.imraidview\",a,b)};a.cancelSaveContent=function(a){sdkController.cancelSaveContent(\"window.imraidview\",a)};a.disableCloseRegion=function(a){sdkController.disableCloseRegion(\"window.imraidview\",a)};a.fireGalleryImageSelectedEvent=function(a,b,c){var d=new Image;d.src=\"data:image/jpeg;base64,\"+a;d.width=b;d.height=c;window.imraid.broadcastEvent(\"galleryImageSelected\",d)};a.fireCameraPictureCatpturedEvent=function(a,\nb,c){var d=new Image;d.src=\"data:image/jpeg;base64,\"+a;d.width=b;d.height=c;window.imraid.broadcastEvent(\"cameraPictureCaptured\",d)};a.fireMediaCloseEvent=function(a,b,c){var d={name:\"close\"};d.viaUserInteraction=b;d.target={};d.target.currentTime=c;b=\"inmobi_media_\"+d.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,d)};a.fireMediaVolumeChangeEvent=function(a,b,c){var d={name:\"volumechange\",target:{}};d.target.volume=b;d.target.muted=c;b=\"inmobi_media_\"+d.name;\n\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,d)};a.fireDeviceMuteChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceMuted\",a)};a.fireDeviceVolumeChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceVolumeChange\",a)};a.fireHeadphonePluggedEvent=function(a){window.imraid.broadcastEvent(\"headphones\",a)};a.showAlert=function(a){sdkController.showAlert(\"window.imraidview\",a)};a.openExternal=function(b){try{sdkController.openExternal(\"window.imraidview\",\nb)}catch(c){a.showAlert(\"openExternal: \"+c)}};a.log=function(b){try{sdkController.log(\"window.imraidview\",b)}catch(c){a.showAlert(\"log: \"+c)}};a.getPlatform=function(){return\"android\"};a.asyncPing=function(b){try{sdkController.asyncPing(\"window.imraidview\",b)}catch(c){a.showAlert(\"asyncPing: \"+c)}};a.makeCall=function(b){try{b.startsWith(\"tel:\")?sdkController.openExternal(\"window.imraidview\",b):sdkController.openExternal(\"window.imraidview\",\"tel:\"+b)}catch(c){a.showAlert(\"makeCall: \"+c)}};a.sendMail=\nfunction(b,c,d){try{null==c&&(c=\"\"),null==d&&(d=\"\"),sdkController.sendMail(\"window.imraidview\",b,c,d)}catch(f){a.showAlert(\"sendMail: \"+f)}};a.sendSMS=function(b,c){try{null==c&&(c=\"\"),sdkController.sendSMS(\"window.imraidview\",b,c)}catch(d){a.showAlert(\"sendSMS: \"+d)}};a.pauseAudio=function(b){try{var c=getPID(b);sdkController.pauseAudio(\"window.imraidview\",c)}catch(d){a.showAlert(\"pauseAudio: \"+d)}};a.muteAudio=function(b){try{var c=getPID(b);sdkController.muteAudio(\"window.imraidview\",c)}catch(d){a.showAlert(\"muteAudio: \"+\nd)}};a.unMuteAudio=function(b){try{var c=getPID(b);sdkController.unMuteAudio(\"window.imraidview\",c)}catch(d){a.showAlert(\"unMuteAudio: \"+d)}};a.isAudioMuted=function(b){try{var c=getPID(b);return sdkController.isAudioMuted(\"window.imraidview\",c)}catch(d){a.showAlert(\"isAudioMuted: \"+d)}};a.setAudioVolume=function(b,c){try{var d=getPID(b);c=parseInt(c);sdkController.setAudioVolume(\"window.imraidview\",d,c)}catch(f){a.showAlert(\"setAudioVolume: \"+f)}};a.getAudioVolume=function(b){try{var c=getPID(b);\nreturn sdkController.getAudioVolume(\"window.imraidview\",c)}catch(d){a.showAlert(\"getAudioVolume: \"+d)}};a.seekAudio=function(b,c){try{var d=getPID(b);c=parseInt(c);isNaN(c)?window.imraid.broadcastEvent(\"error\",\"seek position must be a number\",\"seekAudio\"):sdkController.seekAudio(\"window.imraidview\",d,c)}catch(f){a.showAlert(\"seekAudio: \"+f)}};a.playVideo=function(b,c){var d=!1,f=!0,g=!0,p=!1,l=-99999,k=-99999,m=-99999,q=-99999,r=\"normal\",s=\"exit\",t=\"\",u=getPID(c);null!=b&&(t=b);null!=c&&(\"undefined\"!=\ntypeof c.audio&&\"muted\"==c.audio&&(d=!0),\"undefined\"!=typeof c.autoplay&&!1===c.autoplay&&(f=!1),\"undefined\"!=typeof c.controls&&!1===c.controls&&(g=!1),\"undefined\"!=typeof c.loop&&!0===c.loop&&(p=!0),\"undefined\"!=typeof c.inline&&null!=c.inline&&(l=c.inline.top,k=c.inline.left),\"undefined\"!=typeof c.width&&null!=c.width&&(m=c.width),\"undefined\"!=typeof c.height&&null!=c.height&&(q=c.height),\"undefined\"!=typeof c.startStyle&&null!=c.startStyle&&(r=c.startStyle),\"undefined\"!=typeof c.stopStyle&&null!=\nc.stopStyle&&(s=c.stopStyle),l=parseInt(l).toString(),k=parseInt(k).toString(),m=parseInt(m).toString(),q=parseInt(q).toString());try{sdkController.playVideo(\"window.imraidview\",t,d,f,g,p,l,k,m,q,r,s,u)}catch(v){a.showAlert(\"playVideo: \"+v)}};a.playAudio=function(b,c){var d=!0,f=!1,g=\"normal\",p=\"normal\",l=!0,k=\"\",m=getPID(c);null!=b&&(k=b);null!=c&&(\"undefined\"!=typeof c.autoplay&&!1===c.autoplay&&(d=!1),\"undefined\"!=typeof c.loop&&!0===c.loop&&(f=!0),\"undefined\"!=typeof c.startStyle&&null!=c.startStyle&&\n(g=c.startStyle),\"undefined\"!=typeof c.stopStyle&&null!=c.stopStyle&&(p=c.stopStyle),\"fullscreen\"==g&&(l=!0));try{sdkController.playAudio(\"window.imraidview\",k,d,l,f,g,p,m)}catch(q){a.showAlert(\"playAudio: \"+q)}};a.pauseVideo=function(b){try{var c=getPID(b);sdkController.pauseVideo(\"window.imraidview\",c)}catch(d){a.showAlert(\"pauseVideo: \"+d)}};a.closeVideo=function(b){try{var c=getPID(b);sdkController.closeVideo(\"window.imraidview\",c)}catch(d){a.showAlert(\"closeVideo: \"+d)}};a.hideVideo=function(b){try{var c=\ngetPID(b);sdkController.hideVideo(\"window.imraidview\",c)}catch(d){a.showAlert(\"hideVideo: \"+d)}};a.showVideo=function(b){try{var c=getPID(b);sdkController.showVideo(\"window.imraidview\",c)}catch(d){a.showAlert(\"showVideo: \"+d)}};a.muteVideo=function(b){try{var c=getPID(b);sdkController.muteVideo(\"window.imraidview\",c)}catch(d){a.showAlert(\"muteVideo: \"+d)}};a.unMuteVideo=function(b){try{var c=getPID(b);sdkController.unMuteVideo(\"window.imraidview\",c)}catch(d){a.showAlert(\"unMuteVideo: \"+d)}};a.seekVideo=\nfunction(b,c){try{var d=getPID(b);c=parseInt(c);isNaN(c)?window.imraid.broadcastEvent(\"error\",\"seek position must be a number\",\"seekVideo\"):sdkController.seekVideo(\"window.imraidview\",d,c)}catch(f){a.showAlert(\"seekVideo: \"+f)}};a.isVideoMuted=function(b){try{var c=getPID(b);return sdkController.isVideoMuted(\"window.imraidview\",c)}catch(d){a.showAlert(\"isVideoMuted: \"+d)}};a.setVideoVolume=function(b,c){try{var d=getPID(b);c=parseInt(c);sdkController.setVideoVolume(\"window.imraidview\",d,c)}catch(f){a.showAlert(\"setVideoVolume: \"+\nf)}};a.getVideoVolume=function(b){try{var c=getPID(b);return sdkController.getVideoVolume(\"window.imraidview\",c)}catch(d){a.showAlert(\"getVideoVolume: \"+d)}};a.startListeningMicIntensity=function(){sdkController.registerMicListener(\"window.imraidview\")};a.stopListeningMicIntensity=function(){sdkController.unRegisterMicListener(\"window.imraidview\")};a.startListeningDeviceMuteEvents=function(){sdkController.registerDeviceMuteEventListener(\"window.imraidview\")};a.stopListeningDeviceMuteEvents=function(){sdkController.unregisterDeviceMuteEventListener(\"window.imraidview\")};\na.startListeningVolumeChange=function(){sdkController.registerDeviceVolumeChangeEventListener(\"window.imraidview\")};a.stopListeningVolumeChange=function(){sdkController.unregisterDeviceVolumeChangeEventListener(\"window.imraidview\")};a.startListeningHeadphonePluggedEvents=function(){sdkController.registerHeadphonePluggedEventListener(\"window.imraidview\")};a.stopListeningHeadphonePluggedEvents=function(){sdkController.unregisterHeadphonePluggedEventListener(\"window.imraidview\")};getSdkVersionInt=function(){for(var b=\na.getSdkVersion().split(\".\"),c=b.length,d=\"\",f=0;f<c;f++)d+=b[f];return parseInt(d)};a.vibrate=function(a){if(null==a||420>getSdkVersionInt())sdkController.vibrate(\"window.imraidview\");else{if(0===arguments.length)return sdkController.vibrate(\"window.imraidview\"),null;if(1==arguments.length)0===a||\"length\"in a&&0===a.length?sdkController.vibrate(\"window.imraidview\",\"[]\",-1):sdkController.vibrate(\"window.imraidview\",\"[0,\"+a+\"]\",-1);else{var b=Array.prototype.slice.call(arguments);sdkController.vibrate(\"window.imraidview\",\n\"[0,\"+String(b)+\"]\",-1)}}};a.takeCameraPicture=function(){sdkController.takeCameraPicture(\"window.imraidview\")};a.getGalleryImage=function(){return sdkController.getGalleryImage(\"window.imraidview\")};a.getSdkVersion=function(){return window._im_imaiview.getSdkVersion()};a.supports=function(a){console.log(\"bridge: supports (IMRAID)\");if(\"string\"!=typeof a)window.imraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\"supports\");else return\"false\"!=sdkController.supports(\"window.imraidview\",\na)};a.postToSocial=function(a,b,c,d){a=parseInt(a);isNaN(a)?window.imraid.broadcastEvent(\"error\",\"socialType must be an integer\",\"postToSocial\"):(\"string\"!=typeof b&&(b=\"\"),\"string\"!=typeof c&&(c=\"\"),\"string\"!=typeof d&&(d=\"\"),sdkController.postToSocial(\"window.imraidview\",a,b,c,d))};a.getMicIntensity=function(){return sdkController.getMicIntensity(\"window.imraidview\")};a.incentCompleted=function(a){if(\"object\"!=typeof a||null==a)sdkController.incentCompleted(\"window.imraidview\",null);else try{sdkController.incentCompleted(\"window.imraidview\",\nJSON.stringify(a))}catch(b){sdkController.incentCompleted(\"window.imraidview\",null)}};a.getOrientation=function(){try{return String(sdkController.getOrientation(\"window.imraidview\"))}catch(b){a.showAlert(\"getOrientation: \"+b)}};a.acceptAction=function(b){try{sdkController.acceptAction(\"window.imraidview\",mraidview.stringify(b))}catch(c){a.showAlert(\"acceptAction: \"+c+\", params = \"+b)}};a.rejectAction=function(b){try{sdkController.rejectAction(\"window.imraidview\",mraidview.stringify(b))}catch(c){a.showAlert(\"rejectAction: \"+\nc+\", params = \"+b)}};a.updateToPassbook=function(b){window.imraid.broadcastEvent(\"error\",\"Method not supported\",\"updateToPassbook\");a.log(\"Method not supported\")};a.isDeviceMuted=function(){return\"false\"!=sdkController.isDeviceMuted(\"window.imraidview\")};a.isHeadPhonesPlugged=function(){return\"false\"!=sdkController.isHeadphonePlugged(\"window.imraidview\")};a.sendSaveContentResult=function(){window.imraid.sendSaveContentResult.apply(window.imraid,arguments)};a.broadcastEvent=function(){window.imraid.broadcastEvent.apply(window.imraid,\narguments)};a.disableBackButton=function(a){void 0==a||\"boolean\"!=typeof a?console.log(\"disableBackButton called with invalid params\"):sdkController.disableBackButton(\"window.imraidview\",a)};a.isBackButtonDisabled=function(){return sdkController.isBackButtonDisabled(\"window.imraidview\")};a.startListeningForBackButtonPressedEvent=function(){sdkController.registerBackButtonPressedEventListener(\"window.imraidview\")};a.stopListeningForBackButtonPressedEvent=function(){sdkController.unregisterBackButtonPressedEventListener(\"window.imraidview\")}})();\n(function(){var a=window.imraid=new InmobiObj,b=window.imraidview;a.getOrientation=b.getOrientation;a.setOrientationProperties=b.setOrientationProperties;a.getOrientationProperties=b.getOrientationProperties;a.saveContentIDMap={};a.saveContent=function(c,d,e){var n=arguments.length,h,f=null;if(3>n){if(\"function\"===typeof arguments[n-1])h=arguments[n-1];else return;f={reason:1}}else a.saveContentIDMap[c]&&(h=arguments[2],f={reason:11,url:arguments[1]});\"function\"!==!h&&(f?(window.imraid.addEventListener(\"saveContent_failed_\"+\nc,h),window.imraid.sendSaveContentResult(\"saveContent_failed_\"+c,\"failed\",JSON.stringify(f))):(a.removeEventListener(\"saveContent_\"+c),a.saveContentIDMap[c]=!0,b.saveContent(c,d,e)))};a.cancelSaveContent=function(a){b.cancelSaveContent(a)};a.asyncPing=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"URL is required.\",\"asyncPing\"):b.asyncPing(c)};a.disableCloseRegion=b.disableCloseRegion;a.getSdkVersion=b.getSdkVersion;a.log=function(c){\"undefined\"==typeof c?a.broadcastEvent(\"error\",\"message is required.\",\n\"log\"):\"string\"==typeof c?b.log(c):b.log(JSON.stringify(c))};a.getInMobiAIVersion=function(){return\"2.0\"};a.makeCall=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must provide a number to call.\",\"makeCall\"):b.makeCall(c)};a.sendMail=function(c,d,e){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a recipient.\",\"sendMail\"):b.sendMail(c,d,e)};a.sendSMS=function(c,d){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a recipient.\",\"sendSMS\"):b.sendSMS(c,\nd)};a.playAudio=function(a,d){\"object\"!=typeof d?\"string\"==typeof a?b.playAudio(a,null):\"object\"==typeof a?b.playAudio(null,a):b.playAudio(null,null):b.playAudio(a,d)};a.getGalleryImage=b.getGalleryImage;a.pauseAudio=b.pauseAudio;a.muteAudio=b.muteAudio;a.unMuteAudio=b.unMuteAudio;a.isAudioMuted=b.isAudioMuted;a.setAudioVolume=function(c){if(\"object\"!=typeof c&&null!=c)a.broadcastEvent(\"error\",\"Request must specify a valid properties\",\"setAudioVolume\");else{var d=c.volume;isNaN(d)?a.broadcastEvent(\"error\",\n\"Request must specify a valid volume in the range [0,100]\",\"setAudioVolume\"):(0>d?d=0:100<d&&(d=100),b.setAudioVolume(c,d))}};a.getAudioVolume=b.getAudioVolume;a.pauseVideo=b.pauseVideo;a.closeVideo=b.closeVideo;a.hideVideo=b.hideVideo;a.showVideo=b.showVideo;a.muteVideo=b.muteVideo;a.unMuteVideo=b.unMuteVideo;a.isVideoMuted=b.isVideoMuted;a.setVideoVolume=function(c){if(\"object\"!=typeof c&&null!=c)a.broadcastEvent(\"error\",\"Request must specify a valid properties\",\"setAudioVolume\");else{var d=c.volume;\nisNaN(d)?a.broadcastEvent(\"error\",\"Request must specify a valid volume in the range [0,100]\",\"setVideoVolume\"):(0>d?d=0:100<d&&(d=100),b.setVideoVolume(c,d))}};a.getVideoVolume=b.getVideoVolume;a.seekAudio=function(c){if(\"object\"!=typeof c&&null!=c)a.broadcastEvent(\"error\",\"Request must specify a valid properties\",\"seekAudio\");else{var d=c.time;imIsObjValid(d)?b.seekAudio(c,d):a.broadcastEvent(\"error\",\"Request must specify a valid time\",\"seekAudio\")}};a.seekVideo=function(c){if(\"object\"!=typeof c&&\nnull!=c)a.broadcastEvent(\"error\",\"Request must specify a valid time\",\"seekVideo\");else{var d=c.time;imIsObjValid(d)?b.seekVideo(c,d):a.broadcastEvent(\"error\",\"Request must specify a valid time\",\"seekVideo\")}};a.openExternal=b.openExternal;a.updateToPassbook=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a valid URL\",\"updateToPassbook\"):b.updateToPassbook(c)};a.vibrate=b.vibrate;a.takeCameraPicture=b.takeCameraPicture;a.getMicIntensity=function(){return!imIsObjValid(a.listeners.micIntensityChange)?\n-1:b.getMicIntensity()};a.postToSocial=b.postToSocial;a.getPlatform=b.getPlatform;a.incentCompleted=b.incentCompleted;a.loadSKStore=b.loadSKStore;a.showSKStore=b.showSKStore;a.playVideo=function(a,d){\"object\"!=typeof d?\"string\"==typeof a?b.playVideo(a,null):\"object\"==typeof a?b.playVideo(null,a):b.playVideo(null,null):b.playVideo(a,d)};a.supports=function(a){return b.supports(a)};a.isDeviceMuted=function(){return!imIsObjValid(a.listeners.deviceMuted)?-1:b.isDeviceMuted()};a.isHeadPhonesPlugged=function(){return!imIsObjValid(a.listeners.headphones)?\n!1:b.isHeadPhonesPlugged()};a.getDeviceVolume=function(){return b.getDeviceVolume()};a.setDeviceVolume=function(a){b.setDeviceVolume(a)};a.hideStatusBar=function(){b.hideStatusBar()};a.setOpaqueBackground=function(){b.setOpaqueBackground()};a.disableBackButton=b.disableBackButton;a.isBackButtonDisabled=b.isBackButtonDisabled})();\n(function(){var a=window._im_imaiview={ios:{}};window.imaiview=a;a.broadcastEvent=function(){for(var a=Array(arguments.length),c=0;c<arguments.length;c++)a[c]=arguments[c];c=a.shift();try{window.mraid.broadcastEvent(c,a)}catch(d){}};a.getPlatform=function(){return\"android\"};a.getPlatformVersion=function(){return sdkController.getPlatformVersion(\"window.imaiview\")};a.log=function(a){sdkController.log(\"window.imaiview\",a)};a.openEmbedded=function(a){sdkController.openEmbedded(\"window.imaiview\",a)};\na.openExternal=function(a){sdkController.openExternal(\"window.imaiview\",a)};a.ping=function(a,c){sdkController.ping(\"window.imaiview\",a,c)};a.pingInWebView=function(a,c){sdkController.pingInWebView(\"window.imaiview\",a,c)};a.getSdkVersion=function(){try{var a=sdkController.getSdkVersion(\"window.imaiview\");if(\"string\"==typeof a&&null!=a)return a}catch(c){return\"3.7.0\"}};a.onUserInteraction=function(a){if(\"object\"!=typeof a||null==a)sdkController.onUserInteraction(\"window.imaiview\",null);else try{sdkController.onUserInteraction(\"window.imaiview\",\nJSON.stringify(a))}catch(c){sdkController.onUserInteraction(\"window.imaiview\",null)}};a.fireAdReady=function(){sdkController.fireAdReady(\"window.imaiview\")};a.fireAdFailed=function(){sdkController.fireAdFailed(\"window.imaiview\")};a.broadcastEvent=function(){window.imai.broadcastEvent.apply(window.imai,arguments)}})();\n(function(){var a=window._im_imaiview;window._im_imai=new InmobiObj;window._im_imai.ios=new InmobiObj;var b=window._im_imai;window.imai=window._im_imai;b.matchString=function(a,b){if(\"string\"!=typeof a||null==a||null==b)return-1;var e=-1;try{e=a.indexOf(b)}catch(n){}return e};b.isHttpUrl=function(a){return\"string\"!=typeof a||null==a?!1:0==b.matchString(a,\"http://\")?!0:0==b.matchString(a,\"https://\")?!0:!1};b.appendTapParams=function(a,d,e){if(!imIsObjValid(d)||!imIsObjValid(e))return a;b.isHttpUrl(a)&&\n(a=-1==b.matchString(a,\"?\")?a+(\"?u-tap-o=\"+d+\",\"+e):a+(\"&u-tap-o=\"+d+\",\"+e));return a};b.performAdClick=function(a,d){d=d||event;if(imIsObjValid(a)){var e=a.clickConfig,n=a.landingConfig;if(!imIsObjValid(e)&&!imIsObjValid(n))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var h=null,f=null,g=null,p=null,l=null,k=null,m=null;if(imIsObjValid(d))try{p=d.changedTouches[0].pageX,l=d.changedTouches[0].pageY}catch(q){l=\np=0}imIsObjValid(n)?imIsObjValid(e)?(k=n.url,m=n.urlType,h=e.url,f=e.pingWV,g=e.fr):(k=n.url,m=n.urlType):(k=e.url,m=e.urlType);e=b.getPlatform();try{if(\"boolean\"!=typeof g&&\"number\"!=typeof g||null==g)g=!0;if(0>g||1<g)g=!0;if(\"boolean\"!=typeof f&&\"number\"!=typeof f||null==f)f=!0;if(0>f||1<f)f=!0;if(\"number\"!=typeof m||null==m)m=0;h=b.appendTapParams(h,p,l);imIsObjValid(h)?!0==f?b.pingInWebView(h,g):b.ping(h,g):b.log(\"clickurl provided is null.\");if(imIsObjValid(k))switch(imIsObjValid(h)||(k=b.appendTapParams(k,\np,l)),m){case 1:b.openEmbedded(k);break;case 2:\"ios\"==e?b.ios.openItunesProductView(k):this.broadcastEvent(\"error\",\"Cannot process openItunesProductView for os\"+e);break;default:b.openExternal(k)}else b.log(\"Landing url provided is null.\")}catch(r){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.performActionClick=function(a,d){d=d||event;if(imIsObjValid(a)){var e=a.clickConfig,n=a.landingConfig;if(!imIsObjValid(e)&&!imIsObjValid(n))b.log(\"click/landing config are invalid, Nothing to process .\"),\nthis.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var h=null,f=null,g=null,p=null,l=null;if(imIsObjValid(d))try{p=d.changedTouches[0].pageX,l=d.changedTouches[0].pageY}catch(k){l=p=0}imIsObjValid(e)&&(h=e.url,f=e.pingWV,g=e.fr);try{if(\"boolean\"!=typeof g&&\"number\"!=typeof g||null==g)g=!0;if(0>g||1<g)g=!0;if(\"boolean\"!=typeof f&&\"number\"!=typeof f||null==f)f=!0;if(0>f||1<f)f=!0;h=b.appendTapParams(h,p,l);imIsObjValid(h)?!0==f?b.pingInWebView(h,g):b.ping(h,g):\nb.log(\"clickurl provided is null.\");b.onUserInteraction(n)}catch(m){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.getVersion=function(){return\"1.0\"};b.getPlatform=a.getPlatform;b.getPlatformVersion=a.getPlatformVersion;b.log=a.log;b.openEmbedded=a.openEmbedded;b.openExternal=a.openExternal;b.ping=a.ping;b.pingInWebView=a.pingInWebView;b.onUserInteraction=a.onUserInteraction;b.getSdkVersion=a.getSdkVersion;b.ios.openItunesProductView=\na.ios.openItunesProductView;b.fireAdReady=a.fireAdReady;b.fireAdFailed=a.fireAdFailed})();";
        } else
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "Returning fetched Mraid Js string.");
            return s1;
        }
    }

    public l getOrientationProperties()
    {
        return v;
    }

    public RenderView getOriginalRenderView()
    {
        return b;
    }

    public Context getRenderViewContext()
    {
        if (d != null)
        {
            return d;
        } else
        {
            return getContext();
        }
    }

    public com.inmobi.ads.b.e getRenderingConfig()
    {
        return n;
    }

    public m getResizeProperties()
    {
        return u;
    }

    public RenderViewState getState()
    {
        return g;
    }

    public RenderViewState getViewState()
    {
        return g;
    }

    public void h()
    {
        if (u())
        {
            a(F, "broadcastEvent('backButtonPressed')");
        }
    }

    public void h(String s1, String s2)
    {
        if (RenderingProperties.PlacementType.FULL_SCREEN != h.a() && RenderViewState.EXPANDED != getViewState())
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "Media playback controls are only supported on full screen ads! Ignoring request ...");
            return;
        } else
        {
            k.f(s1, s2);
            return;
        }
    }

    public void i()
    {
        if (RenderViewState.DEFAULT != g && RenderViewState.RESIZED != g)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "Render view state must be either DEFAULT or RESIZED to admit the resize request");
            return;
        }
        if (getResizeProperties() == null)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "Render view state can not resize with invalid resize properties");
            return;
        } else
        {
            K = true;
            j.a();
            requestLayout();
            invalidate();
            B = true;
            setFocusable(true);
            setFocusableInTouchMode(true);
            requestFocus();
            setAndUpdateViewState(RenderViewState.RESIZED);
            f.e(this);
            K = false;
            return;
        }
    }

    public void i(String s1, String s2)
    {
        if (RenderingProperties.PlacementType.FULL_SCREEN != h.a() && RenderViewState.EXPANDED != getViewState())
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "Media playback controls are only supported on full screen ads! Ignoring request ...");
            return;
        } else
        {
            k.g(s1, s2);
            return;
        }
    }

    public void j()
    {
        z();
        k.b();
        if (RenderViewState.EXPANDED != g) goto _L2; else goto _L1
_L1:
        x();
_L4:
        p.clear();
        B = false;
        return;
_L2:
        if (RenderViewState.RESIZED == g)
        {
            y();
        } else
        if (RenderViewState.DEFAULT == g)
        {
            setAndUpdateViewState(RenderViewState.HIDDEN);
            if (h.a() == RenderingProperties.PlacementType.FULL_SCREEN)
            {
                v();
            } else
            {
                ((ViewGroup)getParent()).removeAllViews();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void j(String s1, String s2)
    {
        if (RenderViewState.DEFAULT != g && RenderViewState.RESIZED != g)
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, (new StringBuilder()).append("Render view state must be either DEFAULT or RESIZED to admit the expand request. Current state:").append(g).toString());
            return;
        } else
        {
            K = true;
            i.a(s1, s2);
            requestLayout();
            invalidate();
            B = true;
            setFocusable(true);
            setFocusableInTouchMode(true);
            requestFocus();
            return;
        }
    }

    public void k()
    {
        if (g == RenderViewState.RESIZED && getResizeProperties() != null)
        {
            j.a();
        }
    }

    public void l()
    {
        setVisibility(0);
        requestLayout();
    }

    public void loadDataWithBaseURL(String s1, String s2, String s3, String s4, String s5)
    {
        super.loadDataWithBaseURL(s1, s2, s3, s4, s5);
    }

    public double m()
    {
        return com.inmobi.rendering.mraid.MraidMediaProcessor.a.a();
    }

    public void n()
    {
        if (r)
        {
            r = false;
            k.d().b(q);
        }
    }

    public void o()
    {
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "disableHardwareAcceleration called.");
        L = false;
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        getClass().getMethod("setLayerType", new Class[] {
            Integer.TYPE, android/graphics/Paint
        }).invoke(this, new Object[] {
            Integer.valueOf(1), null
        });
        return;
        Object obj;
        obj;
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "disableHardwareAcceleration failed.", ((Throwable) (obj)));
        return;
        obj;
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "disableHardwareAcceleration failed.", ((Throwable) (obj)));
        return;
        obj;
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "disableHardwareAcceleration failed.", ((Throwable) (obj)));
        return;
        obj;
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "disableHardwareAcceleration failed.", ((Throwable) (obj)));
        return;
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        r();
        if (e == null)
        {
            e = (ViewGroup)getParent();
        }
    }

    public void onDetachedFromWindow()
    {
        p.clear();
        m.unRegisterBroadcastListener();
        n();
        getMediaProcessor().f();
        getMediaProcessor().g();
        getMediaProcessor().i();
        l.a(getRenderViewContext());
        super.onDetachedFromWindow();
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, (new StringBuilder()).append("onSizeChanged (").append(i1).append(", ").append(j1).append(")").toString());
        if (i1 != 0 && j1 != 0)
        {
            a(DisplayInfo.a(i1), DisplayInfo.a(j1));
        }
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        if (C == flag)
        {
            return;
        } else
        {
            c(flag);
            return;
        }
    }

    public void onWindowVisibilityChanged(int i1)
    {
        super.onWindowVisibilityChanged(i1);
        boolean flag;
        if (i1 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (C == flag)
        {
            return;
        } else
        {
            c(flag);
            return;
        }
    }

    public boolean p()
    {
        return L;
    }

    public void setAdActiveFlag(boolean flag)
    {
        B = flag;
    }

    public void setAndUpdateViewState(RenderViewState renderviewstate)
    {
        g = renderviewstate;
        Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, (new StringBuilder()).append("set state:").append(g).toString());
        h(g.toString().toLowerCase(Locale.ENGLISH));
    }

    public void setCloseRegionDisabled(boolean flag)
    {
        D = flag;
    }

    public void setCurrentPosition()
    {
        x = new JSONObject();
        int ai[] = new int[2];
        getLocationOnScreen(ai);
        try
        {
            x.put("x", DisplayInfo.a(ai[0]));
            x.put("y", DisplayInfo.a(ai[1]));
            int i1 = DisplayInfo.a(getWidth());
            int j1 = DisplayInfo.a(getHeight());
            x.put("width", i1);
            x.put("height", j1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((JSONException) (obj)).printStackTrace();
        }
        synchronized (J)
        {
            z = false;
            J.notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setCurrentPositionLock()
    {
        z = true;
    }

    public void setDefaultPosition()
    {
        int ai[] = new int[2];
        w = new JSONObject();
        if (e == null)
        {
            e = (ViewGroup)getParent();
        }
        if (e != null)
        {
            e.getLocationOnScreen(ai);
            try
            {
                w.put("x", DisplayInfo.a(ai[0]));
                w.put("y", DisplayInfo.a(ai[1]));
                int i1 = DisplayInfo.a(e.getWidth());
                int j1 = DisplayInfo.a(e.getHeight());
                w.put("width", i1);
                w.put("height", j1);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((JSONException) (obj)).printStackTrace();
            }
        } else
        {
            try
            {
                w.put("x", 0);
                w.put("y", 0);
                w.put("width", 0);
                w.put("height", 0);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((JSONException) (obj)).printStackTrace();
            }
        }
        synchronized (I)
        {
            y = false;
            I.notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setDefaultPositionLock()
    {
        y = true;
    }

    public void setDisableBackButton(boolean flag)
    {
        E = flag;
    }

    public void setExpandProperties(d d1)
    {
        if (d1.b())
        {
            setUseCustomClose(d1.a());
        }
        t = d1;
    }

    public void setFullScreenActivity(Activity activity)
    {
        d = activity;
        if (v != null)
        {
            setOrientationProperties(v);
        }
    }

    public void setFullScreenExitAnimation(int i1)
    {
        O = i1;
    }

    public void setOrientationProperties(l l1)
    {
        boolean flag1;
        flag1 = true;
        v = l1;
        if (d == null || l1.a) goto _L2; else goto _L1
_L1:
        String s1;
        byte byte0;
        s1 = l1.b;
        byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 2: default 60
    //                   729267099: 121
    //                   1430647483: 106;
           goto _L3 _L4 _L5
_L3:
        byte0;
        JVM INSTR tableswitch 0 1: default 84
    //                   0 136
    //                   1 220;
           goto _L6 _L7 _L8
_L6:
        if (DisplayInfo.b() != com.inmobi.commons.core.utilities.info.DisplayInfo.ORIENTATION_VALUES.REVERSE_PORTRAIT.getValue()) goto _L10; else goto _L9
_L9:
        d.setRequestedOrientation(9);
_L2:
        return;
_L5:
        if (s1.equals("landscape"))
        {
            byte0 = 0;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (s1.equals("portrait"))
        {
            byte0 = 1;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        boolean flag = flag1;
        if (DisplayInfo.b() != com.inmobi.commons.core.utilities.info.DisplayInfo.ORIENTATION_VALUES.LANDSCAPE.getValue())
        {
            if (DisplayInfo.b() == com.inmobi.commons.core.utilities.info.DisplayInfo.ORIENTATION_VALUES.REVERSE_LANDSCAPE.getValue())
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        if (flag) goto _L2; else goto _L11
_L11:
        if (l1.c.equals("left"))
        {
            d.setRequestedOrientation(8);
            return;
        }
        if (!l1.c.equals("right")) goto _L2; else goto _L12
_L12:
        d.setRequestedOrientation(0);
        return;
_L8:
        if (DisplayInfo.b() == com.inmobi.commons.core.utilities.info.DisplayInfo.ORIENTATION_VALUES.REVERSE_PORTRAIT.getValue())
        {
            d.setRequestedOrientation(9);
            return;
        } else
        {
            d.setRequestedOrientation(1);
            return;
        }
_L10:
        if (DisplayInfo.b() == com.inmobi.commons.core.utilities.info.DisplayInfo.ORIENTATION_VALUES.REVERSE_LANDSCAPE.getValue())
        {
            d.setRequestedOrientation(8);
            return;
        }
        if (DisplayInfo.b() == com.inmobi.commons.core.utilities.info.DisplayInfo.ORIENTATION_VALUES.LANDSCAPE.getValue())
        {
            d.setRequestedOrientation(0);
            return;
        }
        d.setRequestedOrientation(1);
        return;
        if (true) goto _L3; else goto _L13
_L13:
    }

    public void setOriginalRenderView(RenderView renderview)
    {
        b = renderview;
    }

    public void setResizeProperties(m m1)
    {
        u = m1;
    }

    public void setUseCustomClose(boolean flag)
    {
        A = flag;
    }


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}

}
