// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.view.ViewParent;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;
import org.json.JSONObject;

public interface kxu
{

    public abstract WebView a();

    public abstract void a(int i1);

    public abstract void a(Context context);

    public abstract void a(AdSizeParcel adsizeparcel);

    public abstract void a(String s1);

    public abstract void a(String s1, Map map);

    public abstract void a(String s1, JSONObject jsonobject);

    public abstract void a(jov jov);

    public abstract void a(boolean flag);

    public abstract void b();

    public abstract void b(int i1);

    public abstract void b(jov jov);

    public abstract void b(boolean flag);

    public abstract void c();

    public abstract void c(boolean flag);

    public abstract Activity d();

    public abstract Context e();

    public abstract im f();

    public abstract jov g();

    public abstract Context getContext();

    public abstract android.view.ViewGroup.LayoutParams getLayoutParams();

    public abstract void getLocationOnScreen(int ai[]);

    public abstract int getMeasuredHeight();

    public abstract int getMeasuredWidth();

    public abstract ViewParent getParent();

    public abstract jov h();

    public abstract AdSizeParcel i();

    public abstract kxv j();

    public abstract boolean k();

    public abstract ksq l();

    public abstract void loadDataWithBaseURL(String s1, String s2, String s3, String s4, String s5);

    public abstract void loadUrl(String s1);

    public abstract VersionInfoParcel m();

    public abstract void measure(int i1, int j1);

    public abstract boolean n();

    public abstract boolean o();

    public abstract void p();

    public abstract boolean q();

    public abstract void r();

    public abstract String s();

    public abstract void setBackgroundColor(int i1);

    public abstract boolean willNotDraw();
}
