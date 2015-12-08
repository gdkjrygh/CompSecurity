// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.h;
import com.google.android.gms.ads.internal.overlay.l;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.u;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            cw, cv, cx, cl, 
//            e, ab, ac

public final class cz extends FrameLayout
    implements cw
{

    private final cw a;
    private final cv b;

    public cz(cw cw1)
    {
        super(cw1.d());
        a = cw1;
        b = new cv(cw1.d(), this, this);
        cw1 = a.i();
        if (cw1 != null)
        {
            cw1.a(this);
        }
        addView(a.getView());
    }

    public final void a()
    {
        a.a();
    }

    public final void a(int i1)
    {
        a.a(i1);
    }

    public final void a(AdSizeParcel adsizeparcel)
    {
        a.a(adsizeparcel);
    }

    public final void a(zzd zzd)
    {
        a.a(zzd);
    }

    public final void a(String s1)
    {
        a.a(s1);
    }

    public final void a(String s1, Map map)
    {
        a.a(s1, map);
    }

    public final void a(String s1, JSONObject jsonobject)
    {
        a.a(s1, jsonobject);
    }

    public final void a(boolean flag)
    {
        a.a(flag);
    }

    public final void b()
    {
        a.b();
    }

    public final void b(zzd zzd)
    {
        a.b(zzd);
    }

    public final void b(boolean flag)
    {
        a.b(flag);
    }

    public final Activity c()
    {
        return a.c();
    }

    public final void c(boolean flag)
    {
        a.c(flag);
    }

    public final Context d()
    {
        return a.d();
    }

    public final a e()
    {
        return a.e();
    }

    public final zzd f()
    {
        return a.f();
    }

    public final zzd g()
    {
        return a.g();
    }

    public final View getView()
    {
        return this;
    }

    public final WebView getWebView()
    {
        return a.getWebView();
    }

    public final AdSizeParcel h()
    {
        return a.h();
    }

    public final cx i()
    {
        return a.i();
    }

    public final boolean j()
    {
        return a.j();
    }

    public final e k()
    {
        return a.k();
    }

    public final VersionInfoParcel l()
    {
        return a.l();
    }

    public final void loadDataWithBaseURL(String s1, String s2, String s3, String s4, String s5)
    {
        a.loadDataWithBaseURL(s1, s2, s3, s4, s5);
    }

    public final void loadUrl(String s1)
    {
        a.loadUrl(s1);
    }

    public final boolean m()
    {
        return a.m();
    }

    public final boolean n()
    {
        return a.n();
    }

    public final void o()
    {
        Object obj = b;
        com.google.android.gms.common.internal.u.b("onDestroy must be called from the UI thread.");
        if (((cv) (obj)).d != null)
        {
            obj = ((cv) (obj)).d;
            l l1 = ((h) (obj)).c;
            l1.a = true;
            com.google.android.gms.internal.cl.a.removeCallbacks(l1);
            if (((h) (obj)).a.c() != null && ((h) (obj)).e && !((h) (obj)).f)
            {
                ((h) (obj)).a.c().getWindow().clearFlags(128);
                obj.e = false;
            }
        }
        a.o();
    }

    public final boolean p()
    {
        return a.p();
    }

    public final cv q()
    {
        return b;
    }

    public final ab r()
    {
        return a.r();
    }

    public final ac s()
    {
        return a.s();
    }

    public final void setBackgroundColor(int i1)
    {
        a.setBackgroundColor(i1);
    }

    public final void setContext(Context context)
    {
        a.setContext(context);
    }

    public final void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        a.setOnClickListener(onclicklistener);
    }

    public final void setOnTouchListener(android.view.View.OnTouchListener ontouchlistener)
    {
        a.setOnTouchListener(ontouchlistener);
    }

    public final void setRequestedOrientation(int i1)
    {
        a.setRequestedOrientation(i1);
    }

    public final void setWebChromeClient(WebChromeClient webchromeclient)
    {
        a.setWebChromeClient(webchromeclient);
    }

    public final void setWebViewClient(WebViewClient webviewclient)
    {
        a.setWebViewClient(webviewclient);
    }

    public final void t()
    {
        a.t();
    }

    public final void u()
    {
        a.u();
    }
}
