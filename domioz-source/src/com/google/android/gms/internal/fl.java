// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.ViewParent;
import android.webkit.WebView;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            co, zzba, fm, hj, 
//            zzhy

public interface fl
{

    public abstract WebView a();

    public abstract void a(int i1);

    public abstract void a(Context context);

    public abstract void a(co co);

    public abstract void a(zzba zzba);

    public abstract void a(String s, Map map);

    public abstract void a(String s, JSONObject jsonobject);

    public abstract void a(boolean flag);

    public abstract void b();

    public abstract void b(int i1);

    public abstract void b(boolean flag);

    public abstract Activity c();

    public abstract Context d();

    public abstract co e();

    public abstract zzba f();

    public abstract fm g();

    public abstract Context getContext();

    public abstract android.view.ViewGroup.LayoutParams getLayoutParams();

    public abstract void getLocationOnScreen(int ai[]);

    public abstract int getMeasuredHeight();

    public abstract int getMeasuredWidth();

    public abstract ViewParent getParent();

    public abstract boolean h();

    public abstract hj i();

    public abstract zzhy j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract void loadDataWithBaseURL(String s, String s1, String s2, String s3, String s4);

    public abstract void loadUrl(String s);

    public abstract void m();

    public abstract void measure(int i1, int j1);

    public abstract void setBackgroundColor(int i1);

    public abstract boolean willNotDraw();
}
