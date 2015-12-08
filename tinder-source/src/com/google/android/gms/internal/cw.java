// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            cx, e, cv, ab, 
//            ac

public interface cw
{

    public abstract void a();

    public abstract void a(int i1);

    public abstract void a(AdSizeParcel adsizeparcel);

    public abstract void a(zzd zzd);

    public abstract void a(String s1);

    public abstract void a(String s1, Map map);

    public abstract void a(String s1, JSONObject jsonobject);

    public abstract void a(boolean flag);

    public abstract void b();

    public abstract void b(zzd zzd);

    public abstract void b(boolean flag);

    public abstract Activity c();

    public abstract void c(boolean flag);

    public abstract Context d();

    public abstract a e();

    public abstract zzd f();

    public abstract zzd g();

    public abstract Context getContext();

    public abstract android.view.ViewGroup.LayoutParams getLayoutParams();

    public abstract void getLocationOnScreen(int ai[]);

    public abstract int getMeasuredHeight();

    public abstract int getMeasuredWidth();

    public abstract ViewParent getParent();

    public abstract View getView();

    public abstract WebView getWebView();

    public abstract AdSizeParcel h();

    public abstract cx i();

    public abstract boolean j();

    public abstract e k();

    public abstract VersionInfoParcel l();

    public abstract void loadDataWithBaseURL(String s1, String s2, String s3, String s4, String s5);

    public abstract void loadUrl(String s1);

    public abstract boolean m();

    public abstract void measure(int i1, int j1);

    public abstract boolean n();

    public abstract void o();

    public abstract boolean p();

    public abstract cv q();

    public abstract ab r();

    public abstract ac s();

    public abstract void setBackgroundColor(int i1);

    public abstract void setContext(Context context);

    public abstract void setOnClickListener(android.view.View.OnClickListener onclicklistener);

    public abstract void setOnTouchListener(android.view.View.OnTouchListener ontouchlistener);

    public abstract void setRequestedOrientation(int i1);

    public abstract void setWebChromeClient(WebChromeClient webchromeclient);

    public abstract void setWebViewClient(WebViewClient webviewclient);

    public abstract void t();

    public abstract void u();
}
