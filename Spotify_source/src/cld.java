// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;
import org.json.JSONObject;

final class cld extends FrameLayout
    implements ckw
{

    private final ckw a;
    private final ckv b;

    public cld(ckw ckw1)
    {
        super(ckw1.f());
        a = ckw1;
        b = new ckv(ckw1.f(), this, this);
        ckw1 = a.k();
        if (ckw1 != null)
        {
            ckw1.a(this);
        }
        addView(a.b());
    }

    public final WebView a()
    {
        return a.a();
    }

    public final void a(int i1)
    {
        a.a(i1);
    }

    public final void a(Context context)
    {
        a.a(context);
    }

    public final void a(Context context, AdSizeParcel adsizeparcel, cbk cbk)
    {
        a.a(context, adsizeparcel, cbk);
    }

    public final void a(bzw bzw, boolean flag)
    {
        a.a(bzw, flag);
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

    public final void a(String s1, String s2)
    {
        a.a(s1, s2);
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

    public final View b()
    {
        return this;
    }

    public final void b(int i1)
    {
        a.b(i1);
    }

    public final void b(zzd zzd)
    {
        a.b(zzd);
    }

    public final void b(String s1)
    {
        a.b(s1);
    }

    public final void b(String s1, JSONObject jsonobject)
    {
        a.b(s1, jsonobject);
    }

    public final void b(boolean flag)
    {
        a.b(flag);
    }

    public final void c()
    {
        a.c();
    }

    public final void c(boolean flag)
    {
        a.c(flag);
    }

    public final void clearCache(boolean flag)
    {
        a.clearCache(flag);
    }

    public final void d()
    {
        a.d();
    }

    public final void destroy()
    {
        a.destroy();
    }

    public final Activity e()
    {
        return a.e();
    }

    public final Context f()
    {
        return a.f();
    }

    public final bkf g()
    {
        return a.g();
    }

    public final zzd h()
    {
        return a.h();
    }

    public final zzd i()
    {
        return a.i();
    }

    public final AdSizeParcel j()
    {
        return a.j();
    }

    public final ckx k()
    {
        return a.k();
    }

    public final boolean l()
    {
        return a.l();
    }

    public final void loadData(String s1, String s2, String s3)
    {
        a.loadData(s1, s2, s3);
    }

    public final void loadDataWithBaseURL(String s1, String s2, String s3, String s4, String s5)
    {
        a.loadDataWithBaseURL(s1, s2, s3, s4, s5);
    }

    public final void loadUrl(String s1)
    {
        a.loadUrl(s1);
    }

    public final bzm m()
    {
        return a.m();
    }

    public final VersionInfoParcel n()
    {
        return a.n();
    }

    public final boolean o()
    {
        return a.o();
    }

    public final int p()
    {
        return a.p();
    }

    public final boolean q()
    {
        return a.q();
    }

    public final void r()
    {
        Object obj = b;
        btl.b("onDestroy must be called from the UI thread.");
        if (((ckv) (obj)).d != null)
        {
            obj = ((ckv) (obj)).d;
            bic bic1 = ((bhw) (obj)).b;
            bic1.a = true;
            cjj.a.removeCallbacks(bic1);
            if (((bhw) (obj)).c != null)
            {
                ((bhw) (obj)).c.b();
            }
            ((bhw) (obj)).i();
        }
        a.r();
    }

    public final boolean s()
    {
        return a.s();
    }

    public final void setBackgroundColor(int i1)
    {
        a.setBackgroundColor(i1);
    }

    public final void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        a.setOnClickListener(onclicklistener);
    }

    public final void setOnTouchListener(android.view.View.OnTouchListener ontouchlistener)
    {
        a.setOnTouchListener(ontouchlistener);
    }

    public final void setWebChromeClient(WebChromeClient webchromeclient)
    {
        a.setWebChromeClient(webchromeclient);
    }

    public final void setWebViewClient(WebViewClient webviewclient)
    {
        a.setWebViewClient(webviewclient);
    }

    public final void stopLoading()
    {
        a.stopLoading();
    }

    public final String t()
    {
        return a.t();
    }

    public final ckv u()
    {
        return b;
    }

    public final cbi v()
    {
        return a.v();
    }

    public final cbj w()
    {
        return a.w();
    }

    public final void x()
    {
        a.x();
    }

    public final void y()
    {
        a.y();
    }
}
