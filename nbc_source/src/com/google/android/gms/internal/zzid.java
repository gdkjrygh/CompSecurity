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
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzie, zzan

public interface zzid
{

    public abstract void destroy();

    public abstract Context getContext();

    public abstract android.view.ViewGroup.LayoutParams getLayoutParams();

    public abstract void getLocationOnScreen(int ai[]);

    public abstract int getMeasuredHeight();

    public abstract int getMeasuredWidth();

    public abstract ViewParent getParent();

    public abstract int getRequestedOrientation();

    public abstract WebView getWebView();

    public abstract boolean isDestroyed();

    public abstract void loadData(String s, String s1, String s2);

    public abstract void loadDataWithBaseURL(String s, String s1, String s2, String s3, String s4);

    public abstract void loadUrl(String s);

    public abstract void measure(int i, int j);

    public abstract void setBackgroundColor(int i);

    public abstract void setContext(Context context);

    public abstract void setOnClickListener(android.view.View.OnClickListener onclicklistener);

    public abstract void setOnTouchListener(android.view.View.OnTouchListener ontouchlistener);

    public abstract void setRequestedOrientation(int i);

    public abstract void setWebViewClient(WebViewClient webviewclient);

    public abstract void setWillNotDraw(boolean flag);

    public abstract void stopLoading();

    public abstract boolean willNotDraw();

    public abstract void zzB(boolean flag);

    public abstract void zzC(boolean flag);

    public abstract void zza(Context context, AdSizeParcel adsizeparcel);

    public abstract void zza(AdSizeParcel adsizeparcel);

    public abstract void zza(zzc zzc1);

    public abstract void zza(String s, String s1);

    public abstract void zza(String s, JSONObject jsonobject);

    public abstract void zzaD(String s);

    public abstract AdSizeParcel zzaN();

    public abstract void zzb(zzc zzc1);

    public abstract void zzb(String s, JSONObject jsonobject);

    public abstract void zzc(String s, Map map);

    public abstract void zzew();

    public abstract void zzgA();

    public abstract Activity zzgB();

    public abstract Context zzgC();

    public abstract zzc zzgD();

    public abstract zzc zzgE();

    public abstract zzie zzgF();

    public abstract boolean zzgG();

    public abstract zzan zzgH();

    public abstract VersionInfoParcel zzgI();

    public abstract boolean zzgJ();

    public abstract void zzgK();

    public abstract void zzgL();

    public abstract void zzv(int i);
}
