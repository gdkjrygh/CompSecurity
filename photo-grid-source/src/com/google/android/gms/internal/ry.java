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
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            aq, dm, zzja, ad, 
//            rx, dk, dl

public interface ry
    extends aq
{

    public abstract WebView a();

    public abstract void a(int i1);

    public abstract void a(Context context);

    public abstract void a(Context context, AdSizeParcel adsizeparcel, dm dm);

    public abstract void a(AdSizeParcel adsizeparcel);

    public abstract void a(zzd zzd);

    public abstract void a(String s1);

    public abstract void a(String s1, String s2);

    public abstract void a(String s1, Map map);

    public abstract void a(String s1, JSONObject jsonobject);

    public abstract void a(boolean flag);

    public abstract View b();

    public abstract void b(int i1);

    public abstract void b(zzd zzd);

    public abstract void b(String s1);

    public abstract void b(String s1, JSONObject jsonobject);

    public abstract void b(boolean flag);

    public abstract void c();

    public abstract void c(boolean flag);

    public abstract void clearCache(boolean flag);

    public abstract void d();

    public abstract void destroy();

    public abstract Activity e();

    public abstract Context f();

    public abstract com.google.android.gms.ads.internal.zzd g();

    public abstract Context getContext();

    public abstract android.view.ViewGroup.LayoutParams getLayoutParams();

    public abstract void getLocationOnScreen(int ai[]);

    public abstract int getMeasuredHeight();

    public abstract int getMeasuredWidth();

    public abstract ViewParent getParent();

    public abstract zzd h();

    public abstract zzd i();

    public abstract AdSizeParcel j();

    public abstract zzja k();

    public abstract boolean l();

    public abstract void loadData(String s1, String s2, String s3);

    public abstract void loadDataWithBaseURL(String s1, String s2, String s3, String s4, String s5);

    public abstract void loadUrl(String s1);

    public abstract ad m();

    public abstract void measure(int i1, int j1);

    public abstract VersionInfoParcel n();

    public abstract boolean o();

    public abstract int p();

    public abstract boolean q();

    public abstract void r();

    public abstract boolean s();

    public abstract void setBackgroundColor(int i1);

    public abstract void setOnClickListener(android.view.View.OnClickListener onclicklistener);

    public abstract void setOnTouchListener(android.view.View.OnTouchListener ontouchlistener);

    public abstract void setWebChromeClient(WebChromeClient webchromeclient);

    public abstract void setWebViewClient(WebViewClient webviewclient);

    public abstract void stopLoading();

    public abstract String t();

    public abstract rx u();

    public abstract dk v();

    public abstract dl w();

    public abstract void x();

    public abstract void y();
}
