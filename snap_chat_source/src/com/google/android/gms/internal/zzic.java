// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.ViewParent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzba, zzel, zzid, zzk, 
//            zzhy

public interface zzic
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

    public abstract void zzA(boolean flag);

    public abstract void zzB(boolean flag);

    public abstract void zza(Context context, zzba zzba);

    public abstract void zza(zzba zzba);

    public abstract void zza(zzel zzel);

    public abstract void zza(String s, JSONObject jsonobject);

    public abstract zzba zzad();

    public abstract void zzb(String s, String s1);

    public abstract void zzb(String s, Map map);

    public abstract void zzb(String s, JSONObject jsonobject);

    public abstract void zzdh();

    public abstract Activity zzeD();

    public abstract Context zzeE();

    public abstract zzel zzeF();

    public abstract zzid zzeG();

    public abstract boolean zzeH();

    public abstract zzk zzeI();

    public abstract zzhy zzeJ();

    public abstract boolean zzeK();

    public abstract void zzeL();

    public abstract void zzp(int i);
}
