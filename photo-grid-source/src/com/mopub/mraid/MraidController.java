// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.widget.FrameLayout;
import com.mopub.common.AdReport;
import com.mopub.common.CloseableLayout;
import com.mopub.common.MoPubBrowser;
import com.mopub.common.Preconditions;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.DeviceUtils;
import com.mopub.common.util.Dips;
import com.mopub.common.util.Intents;
import com.mopub.common.util.Utils;
import com.mopub.common.util.Views;
import com.mopub.exceptions.IntentNotResolvableException;
import com.mopub.exceptions.UrlParseException;
import com.mopub.mobileads.MraidVideoPlayerActivity;
import com.mopub.mobileads.util.WebViews;
import java.lang.ref.WeakReference;
import java.net.URI;

// Referenced classes of package com.mopub.mraid:
//            MraidBridge, PlacementType, q, ViewState, 
//            p, ag, k, l, 
//            ah, i, j, MraidNativeCommandHandler, 
//            h, o, r, m, 
//            MraidWebViewDebugListener, n

public class MraidController
{

    private final AdReport a;
    private final WeakReference b;
    private final Context c;
    private final PlacementType d;
    private final FrameLayout e;
    private final CloseableLayout f;
    private ViewGroup g;
    private final q h;
    private final ah i;
    private ViewState j;
    private MraidListener k;
    private UseCustomCloseListener l;
    private MraidWebViewDebugListener m;
    private MraidBridge.MraidWebView n;
    private MraidBridge.MraidWebView o;
    private final MraidBridge p;
    private final MraidBridge q;
    private p r;
    private Integer s;
    private boolean t;
    private ag u;
    private final MraidNativeCommandHandler v;
    private boolean w;
    private final MraidBridge.MraidBridgeListener x;
    private final MraidBridge.MraidBridgeListener y;

    public MraidController(Context context, AdReport adreport, PlacementType placementtype)
    {
        this(context, adreport, placementtype, new MraidBridge(adreport, placementtype), new MraidBridge(adreport, PlacementType.INTERSTITIAL), new q());
    }

    private MraidController(Context context, AdReport adreport, PlacementType placementtype, MraidBridge mraidbridge, MraidBridge mraidbridge1, q q1)
    {
        j = ViewState.LOADING;
        r = new p(this);
        t = true;
        u = ag.NONE;
        x = new k(this);
        y = new l(this);
        c = context.getApplicationContext();
        Preconditions.checkNotNull(c);
        a = adreport;
        if (context instanceof Activity)
        {
            b = new WeakReference((Activity)context);
        } else
        {
            b = new WeakReference(null);
        }
        d = placementtype;
        p = mraidbridge;
        q = mraidbridge1;
        h = q1;
        j = ViewState.LOADING;
        context = c.getResources().getDisplayMetrics();
        i = new ah(c, ((DisplayMetrics) (context)).density);
        e = new FrameLayout(c);
        f = new CloseableLayout(c);
        f.setOnCloseListener(new i(this));
        context = new View(c);
        context.setOnTouchListener(new j(this));
        f.addView(context, new android.widget.FrameLayout.LayoutParams(-1, -1));
        r.register(c);
        p.a(x);
        q.a(y);
        v = new MraidNativeCommandHandler();
    }

    private static int a(int i1, int j1, int k1)
    {
        return Math.max(i1, Math.min(j1, k1));
    }

    static MraidListener a(MraidController mraidcontroller)
    {
        return mraidcontroller.k;
    }

    private void a(int i1)
    {
        Activity activity = (Activity)b.get();
        if (activity == null || !a(u))
        {
            throw new h((new StringBuilder("Attempted to lock orientation to unsupported value: ")).append(u.name()).toString());
        }
        if (s == null)
        {
            s = Integer.valueOf(activity.getRequestedOrientation());
        }
        activity.setRequestedOrientation(i1);
    }

    private void a(ViewState viewstate, Runnable runnable)
    {
        MoPubLog.d((new StringBuilder("MRAID state set to ")).append(viewstate).toString());
        j = viewstate;
        p.a(viewstate);
        if (q.e())
        {
            q.a(viewstate);
        }
        if (k == null) goto _L2; else goto _L1
_L1:
        if (viewstate != ViewState.EXPANDED) goto _L4; else goto _L3
_L3:
        k.onExpand();
_L2:
        a(runnable);
        return;
_L4:
        if (viewstate == ViewState.HIDDEN)
        {
            k.onClose();
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    private void a(Runnable runnable)
    {
        h.a();
        View view = e();
        if (view == null)
        {
            return;
        } else
        {
            h.a(new View[] {
                e, view
            }).a(new o(this, view, runnable));
            return;
        }
    }

    private boolean a(ag ag1)
    {
        boolean flag2 = false;
        boolean flag;
        if (ag1 == ag.NONE)
        {
            flag = true;
        } else
        {
            Object obj = (Activity)b.get();
            flag = flag2;
            if (obj != null)
            {
                int i1;
                try
                {
                    obj = ((Activity) (obj)).getPackageManager().getActivityInfo(new ComponentName(((Context) (obj)), obj.getClass()), 0);
                }
                // Misplaced declaration of an exception variable
                catch (ag ag1)
                {
                    return false;
                }
                i1 = ((ActivityInfo) (obj)).screenOrientation;
                if (i1 != -1)
                {
                    flag = flag2;
                    if (i1 == ag1.a())
                    {
                        return true;
                    }
                } else
                {
                    boolean flag3 = Utils.bitMaskContainsFlag(((ActivityInfo) (obj)).configChanges, 128);
                    boolean flag1 = flag3;
                    if (android.os.Build.VERSION.SDK_INT >= 13)
                    {
                        if (flag3 && Utils.bitMaskContainsFlag(((ActivityInfo) (obj)).configChanges, 1024))
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                    }
                    return flag1;
                }
            }
        }
        return flag;
    }

    static MraidBridge b(MraidController mraidcontroller)
    {
        return mraidcontroller.q;
    }

    static MraidBridge c(MraidController mraidcontroller)
    {
        return mraidcontroller.p;
    }

    static Context d(MraidController mraidcontroller)
    {
        return mraidcontroller.c;
    }

    private View e()
    {
        if (q.d())
        {
            return o;
        } else
        {
            return n;
        }
    }

    static boolean e(MraidController mraidcontroller)
    {
        Activity activity = (Activity)mraidcontroller.b.get();
        if (activity == null || mraidcontroller.e() == null)
        {
            return false;
        } else
        {
            return MraidNativeCommandHandler.a(activity, mraidcontroller.e());
        }
    }

    private ViewGroup f()
    {
        if (g == null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 19)
            {
                Preconditions.checkState(e.isAttachedToWindow());
            }
            g = (ViewGroup)e.getRootView().findViewById(0x1020002);
        }
        return g;
    }

    static PlacementType f(MraidController mraidcontroller)
    {
        return mraidcontroller.d;
    }

    static ViewState g(MraidController mraidcontroller)
    {
        return mraidcontroller.j;
    }

    private void g()
    {
        if (u == ag.NONE)
        {
            if (t)
            {
                h();
                return;
            }
            Activity activity = (Activity)b.get();
            if (activity == null)
            {
                throw new h("Unable to set MRAID expand orientation to 'none'; expected passed in Activity Context.");
            } else
            {
                a(DeviceUtils.getScreenOrientation(activity));
                return;
            }
        } else
        {
            a(u.a());
            return;
        }
    }

    static ah h(MraidController mraidcontroller)
    {
        return mraidcontroller.i;
    }

    private void h()
    {
        Activity activity = (Activity)b.get();
        if (activity != null && s != null)
        {
            activity.setRequestedOrientation(s.intValue());
        }
        s = null;
    }

    static ViewGroup i(MraidController mraidcontroller)
    {
        return mraidcontroller.f();
    }

    static FrameLayout j(MraidController mraidcontroller)
    {
        return mraidcontroller.e;
    }

    static int k(MraidController mraidcontroller)
    {
        return ((WindowManager)mraidcontroller.c.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    final void a()
    {
        a(ViewState.DEFAULT, ((Runnable) (new m(this))));
        if (k != null)
        {
            k.onLoaded(e);
        }
    }

    final void a(int i1, int j1, int k1, int l1, com.mopub.common.CloseableLayout.ClosePosition closeposition, boolean flag)
    {
        Object obj;
        if (n == null)
        {
            throw new h("Unable to resize after the WebView is destroyed");
        }
        if (j == ViewState.LOADING || j == ViewState.HIDDEN)
        {
            return;
        }
        if (j == ViewState.EXPANDED)
        {
            throw new h("Not allowed to resize from an already expanded ad");
        }
        if (d == PlacementType.INTERSTITIAL)
        {
            throw new h("Not allowed to resize from an interstitial ad");
        }
        int i2 = Dips.dipsToIntPixels(i1, c);
        int j2 = Dips.dipsToIntPixels(j1, c);
        int l2 = Dips.dipsToIntPixels(k1, c);
        int k2 = Dips.dipsToIntPixels(l1, c);
        l2 += i.f().left;
        k2 += i.f().top;
        Rect rect = new Rect(l2, k2, i2 + l2, k2 + j2);
        if (!flag)
        {
            Rect rect1 = i.b();
            if (rect.width() > rect1.width() || rect.height() > rect1.height())
            {
                throw new h((new StringBuilder("resizeProperties specified a size (")).append(i1).append(", ").append(j1).append(") and offset (").append(k1).append(", ").append(l1).append(") that doesn't allow the ad to appear within the max allowed size (").append(i.c().width()).append(", ").append(i.c().height()).append(")").toString());
            }
            rect.offsetTo(a(rect1.left, rect.left, rect1.right - rect.width()), a(rect1.top, rect.top, rect1.bottom - rect.height()));
        }
        obj = new Rect();
        f.applyCloseRegionBounds(closeposition, rect, ((Rect) (obj)));
        if (!i.b().contains(((Rect) (obj))))
        {
            throw new h((new StringBuilder("resizeProperties specified a size (")).append(i1).append(", ").append(j1).append(") and offset (").append(k1).append(", ").append(l1).append(") that doesn't allow the close region to appear within the max allowed size (").append(i.c().width()).append(", ").append(i.c().height()).append(")").toString());
        }
        if (!rect.contains(((Rect) (obj))))
        {
            throw new h((new StringBuilder("resizeProperties specified a size (")).append(i1).append(", ").append(j2).append(") and offset (").append(k1).append(", ").append(l1).append(") that don't allow the close region to appear within the resized ad.").toString());
        }
        f.setCloseVisible(false);
        f.setClosePosition(closeposition);
        obj = new android.widget.FrameLayout.LayoutParams(rect.width(), rect.height());
        obj.leftMargin = rect.left - i.b().left;
        obj.topMargin = rect.top - i.b().top;
        if (j != ViewState.DEFAULT) goto _L2; else goto _L1
_L1:
        e.removeView(n);
        e.setVisibility(4);
        f.addView(n, new android.widget.FrameLayout.LayoutParams(-1, -1));
        f().addView(f, ((android.view.ViewGroup.LayoutParams) (obj)));
_L4:
        f.setClosePosition(closeposition);
        a(ViewState.RESIZED, ((Runnable) (null)));
        return;
_L2:
        if (j == ViewState.RESIZED)
        {
            f.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    final void a(String s1)
    {
        MraidVideoPlayerActivity.startMraid(c, s1);
    }

    final void a(URI uri, boolean flag)
    {
        boolean flag1;
        if (n == null)
        {
            throw new h("Unable to expand after the WebView is destroyed");
        }
        while (d == PlacementType.INTERSTITIAL || j != ViewState.DEFAULT && j != ViewState.RESIZED) 
        {
            return;
        }
        g();
        if (uri != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            o = new MraidBridge.MraidWebView(c);
            q.a(o);
            q.setContentUrl(uri.toString());
        }
        uri = new android.widget.FrameLayout.LayoutParams(-1, -1);
        if (j != ViewState.DEFAULT) goto _L2; else goto _L1
_L1:
        if (flag1)
        {
            f.addView(o, uri);
        } else
        {
            e.removeView(n);
            e.setVisibility(4);
            f.addView(n, uri);
        }
        f().addView(f, new android.widget.FrameLayout.LayoutParams(-1, -1));
_L4:
        f.setLayoutParams(uri);
        a(flag);
        a(ViewState.EXPANDED, ((Runnable) (null)));
        return;
_L2:
        if (j == ViewState.RESIZED && flag1)
        {
            f.removeView(n);
            e.addView(n, uri);
            e.setVisibility(4);
            f.addView(o, uri);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    final void a(boolean flag)
    {
        boolean flag3 = true;
        boolean flag1;
        if (!f.isCloseVisible())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag != flag1)
        {
            CloseableLayout closeablelayout = f;
            boolean flag2;
            if (!flag)
            {
                flag2 = flag3;
            } else
            {
                flag2 = false;
            }
            closeablelayout.setCloseVisible(flag2);
            if (l != null)
            {
                l.useCustomCloseChanged(flag);
                return;
            }
        }
    }

    final void a(boolean flag, ag ag1)
    {
        if (!a(ag1))
        {
            throw new h((new StringBuilder("Unable to force orientation to ")).append(ag1).toString());
        }
        t = flag;
        u = ag1;
        if (j == ViewState.EXPANDED || d == PlacementType.INTERSTITIAL)
        {
            g();
        }
    }

    final boolean a(ConsoleMessage consolemessage)
    {
        if (m != null)
        {
            return m.onConsoleMessage(consolemessage);
        } else
        {
            return true;
        }
    }

    final boolean a(String s1, JsResult jsresult)
    {
        if (m != null)
        {
            return m.onJsAlert(s1, jsresult);
        } else
        {
            jsresult.confirm();
            return true;
        }
    }

    final void b()
    {
        a(new n(this));
    }

    final void b(String s1)
    {
        MoPubLog.d((new StringBuilder("Opening url: ")).append(s1).toString());
        if (k != null)
        {
            k.onOpen();
        }
        if (Intents.isAboutScheme(s1))
        {
            MoPubLog.d("Link to about page ignored.");
            return;
        }
        if (Intents.isNativeBrowserScheme(s1))
        {
            try
            {
                Intent intent = Intents.intentForNativeBrowserScheme(s1);
                Intents.startActivity(c, intent);
                return;
            }
            catch (UrlParseException urlparseexception)
            {
                MoPubLog.d((new StringBuilder("Unable to load mopub native browser url: ")).append(s1).append(". ").append(urlparseexception.getMessage()).toString());
                return;
            }
            catch (IntentNotResolvableException intentnotresolvableexception)
            {
                MoPubLog.d((new StringBuilder("Unable to load mopub native browser url: ")).append(s1).append(". ").append(intentnotresolvableexception.getMessage()).toString());
            }
            return;
        }
        if (Intents.isHttpUrl(s1))
        {
            Object obj = new Bundle();
            ((Bundle) (obj)).putString("URL", s1);
            obj = Intents.getStartActivityIntent(c, com/mopub/common/MoPubBrowser, ((Bundle) (obj)));
            try
            {
                Intents.startActivity(c, ((Intent) (obj)));
                return;
            }
            catch (IntentNotResolvableException intentnotresolvableexception1)
            {
                MoPubLog.d((new StringBuilder("Unable to launch intent for URL: ")).append(s1).append(".").toString());
            }
            return;
        }
        if (Intents.canHandleApplicationUrl(c, s1))
        {
            Intent intent1 = new Intent("android.intent.action.VIEW", Uri.parse(s1));
            try
            {
                Intents.startActivity(c, intent1);
                return;
            }
            catch (IntentNotResolvableException intentnotresolvableexception2)
            {
                MoPubLog.d((new StringBuilder("Unable to resolve application url: ")).append(s1).toString());
            }
            return;
        } else
        {
            MoPubLog.d((new StringBuilder("Link ignored. Unable to handle url: ")).append(s1).toString());
            return;
        }
    }

    final void c()
    {
        a(((Runnable) (null)));
    }

    final void d()
    {
        if (n != null && j != ViewState.LOADING && j != ViewState.HIDDEN)
        {
            if (j == ViewState.EXPANDED || d == PlacementType.INTERSTITIAL)
            {
                h();
            }
            if (j == ViewState.RESIZED || j == ViewState.EXPANDED)
            {
                if (q.d() && o != null)
                {
                    f.removeView(o);
                    q.a();
                } else
                {
                    f.removeView(n);
                    e.addView(n, new android.widget.FrameLayout.LayoutParams(-1, -1));
                    e.setVisibility(0);
                }
                f().removeView(f);
                a(ViewState.DEFAULT, ((Runnable) (null)));
                return;
            }
            if (j == ViewState.DEFAULT)
            {
                e.setVisibility(4);
                a(ViewState.HIDDEN, ((Runnable) (null)));
                return;
            }
        }
    }

    public void destroy()
    {
        h.a();
        try
        {
            r.unregister();
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            if (!illegalargumentexception.getMessage().contains("Receiver not registered"))
            {
                throw illegalargumentexception;
            }
        }
        if (!w)
        {
            pause(true);
        }
        Views.removeFromParent(f);
        p.a();
        if (n != null)
        {
            n.destroy();
            n = null;
        }
        q.a();
        if (o != null)
        {
            o.destroy();
            o = null;
        }
    }

    public FrameLayout getAdContainer()
    {
        return e;
    }

    public Context getContext()
    {
        return c;
    }

    public void loadContent(String s1)
    {
        boolean flag;
        if (n == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "loadContent should only be called once");
        n = new MraidBridge.MraidWebView(c);
        p.a(n);
        e.addView(n, new android.widget.FrameLayout.LayoutParams(-1, -1));
        p.setContentHtml(s1);
    }

    public void loadJavascript(String s1)
    {
        p.a(s1);
    }

    public void pause(boolean flag)
    {
        w = true;
        if (n != null)
        {
            WebViews.onPause(n, flag);
        }
        if (o != null)
        {
            WebViews.onPause(o, flag);
        }
    }

    public void resume()
    {
        w = false;
        if (n != null)
        {
            WebViews.onResume(n);
        }
        if (o != null)
        {
            WebViews.onResume(o);
        }
    }

    public void setDebugListener(MraidWebViewDebugListener mraidwebviewdebuglistener)
    {
        m = mraidwebviewdebuglistener;
    }

    public void setMraidListener(MraidListener mraidlistener)
    {
        k = mraidlistener;
    }

    public void setUseCustomCloseListener(UseCustomCloseListener usecustomcloselistener)
    {
        l = usecustomcloselistener;
    }

    private class MraidListener
    {

        public abstract void onClose();

        public abstract void onExpand();

        public abstract void onFailedToLoad();

        public abstract void onLoaded(View view);

        public abstract void onOpen();
    }


    private class UseCustomCloseListener
    {

        public abstract void useCustomCloseChanged(boolean flag);
    }

}
