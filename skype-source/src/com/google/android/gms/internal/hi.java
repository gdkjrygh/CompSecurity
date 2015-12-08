// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.ViewParent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            v, hj, o

public interface hi
    extends v
{

    public abstract WebView a();

    public abstract void a(int i1);

    public abstract void a(Context context, AdSizeParcel adsizeparcel);

    public abstract void a(AdSizeParcel adsizeparcel);

    public abstract void a(c c1);

    public abstract void a(String s1);

    public abstract void a(String s1, String s2);

    public abstract void a(String s1, Map map);

    public abstract void a(String s1, JSONObject jsonobject);

    public abstract void b();

    public abstract void b(c c1);

    public abstract void b(String s1);

    public abstract void b(String s1, JSONObject jsonobject);

    public abstract void b(boolean flag);

    public abstract void c();

    public abstract void c(String s1);

    public abstract void c(boolean flag);

    public abstract Activity d();

    public abstract void d(boolean flag);

    public abstract void destroy();

    public abstract Context e();

    public abstract d f();

    public abstract c g();

    public abstract Context getContext();

    public abstract android.view.ViewGroup.LayoutParams getLayoutParams();

    public abstract void getLocationOnScreen(int ai[]);

    public abstract int getMeasuredHeight();

    public abstract int getMeasuredWidth();

    public abstract ViewParent getParent();

    public abstract c h();

    public abstract AdSizeParcel i();

    public abstract hj j();

    public abstract boolean k();

    public abstract o l();

    public abstract void loadData(String s1, String s2, String s3);

    public abstract void loadDataWithBaseURL(String s1, String s2, String s3, String s4, String s5);

    public abstract void loadUrl(String s1);

    public abstract VersionInfoParcel m();

    public abstract void measure(int i1, int j1);

    public abstract boolean n();

    public abstract int o();

    public abstract boolean p();

    public abstract void q();

    public abstract boolean r();

    public abstract String s();

    public abstract void setBackgroundColor(int i1);

    public abstract void setContext(Context context);

    public abstract void setOnClickListener(android.view.View.OnClickListener onclicklistener);

    public abstract void setOnTouchListener(android.view.View.OnTouchListener ontouchlistener);

    public abstract void setRequestedOrientation(int i1);

    public abstract void setWebViewClient(WebViewClient webviewclient);

    public abstract void setWillNotDraw(boolean flag);

    public abstract void stopLoading();

    public abstract void t();

    public abstract String u();

    public abstract boolean willNotDraw();
}
