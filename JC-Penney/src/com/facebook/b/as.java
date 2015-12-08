// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.az;
import com.facebook.bc;
import com.facebook.m;
import com.facebook.n;

// Referenced classes of package com.facebook.b:
//            ak, al, av, ay, 
//            aw, au, az, at

public class as extends Dialog
{

    private String a;
    private String b;
    private com.facebook.b.az c;
    private WebView d;
    private ProgressDialog e;
    private ImageView f;
    private FrameLayout g;
    private boolean h;
    private boolean i;
    private boolean j;

    public as(Context context, String s)
    {
        this(context, s, 0x1030010);
    }

    public as(Context context, String s, int k)
    {
        super(context, k);
        b = "fbconnect://success";
        h = false;
        i = false;
        j = false;
        a = s;
    }

    public as(Context context, String s, Bundle bundle, int k, com.facebook.b.az az1)
    {
        super(context, k);
        b = "fbconnect://success";
        h = false;
        i = false;
        j = false;
        context = bundle;
        if (bundle == null)
        {
            context = new Bundle();
        }
        context.putString("redirect_uri", "fbconnect://success");
        context.putString("display", "touch");
        a = al.a(ak.a(), (new StringBuilder()).append(ak.d()).append("/").append("dialog/").append(s).toString(), context).toString();
        c = az1;
    }

    private int a(int k, float f1, int l, int i1)
    {
        double d1;
        int j1;
        d1 = 0.5D;
        j1 = (int)((float)k / f1);
        if (j1 > l) goto _L2; else goto _L1
_L1:
        d1 = 1.0D;
_L4:
        return (int)(d1 * (double)k);
_L2:
        if (j1 < i1)
        {
            d1 = 0.5D + ((double)(i1 - j1) / (double)(i1 - l)) * 0.5D;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static String a(as as1)
    {
        return as1.b;
    }

    private void a(int k)
    {
        LinearLayout linearlayout = new LinearLayout(getContext());
        d = new av(this, getContext().getApplicationContext());
        d.setVerticalScrollBarEnabled(false);
        d.setHorizontalScrollBarEnabled(false);
        d.setWebViewClient(new ay(this, null));
        d.getSettings().setJavaScriptEnabled(true);
        d.loadUrl(a);
        d.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        d.setVisibility(4);
        d.getSettings().setSavePassword(false);
        d.getSettings().setSaveFormData(false);
        d.setFocusable(true);
        d.setFocusableInTouchMode(true);
        d.setOnTouchListener(new aw(this));
        linearlayout.setPadding(k, k, k, k);
        linearlayout.addView(d);
        linearlayout.setBackgroundColor(0xcc000000);
        g.addView(linearlayout);
    }

    static boolean a(as as1, boolean flag)
    {
        as1.j = flag;
        return flag;
    }

    static boolean b(as as1)
    {
        return as1.i;
    }

    static ProgressDialog c(as as1)
    {
        return as1.e;
    }

    static FrameLayout d(as as1)
    {
        return as1.g;
    }

    static WebView e(as as1)
    {
        return as1.d;
    }

    private void e()
    {
        f = new ImageView(getContext());
        f.setOnClickListener(new au(this));
        Drawable drawable = getContext().getResources().getDrawable(az.com_facebook_close);
        f.setImageDrawable(drawable);
        f.setVisibility(4);
    }

    static ImageView f(as as1)
    {
        return as1.f;
    }

    protected Bundle a(String s)
    {
        s = Uri.parse(s);
        Bundle bundle = al.b(s.getQuery());
        bundle.putAll(al.b(s.getFragment()));
        return bundle;
    }

    protected void a(Bundle bundle)
    {
        if (c != null && !h)
        {
            h = true;
            c.a(bundle, null);
            dismiss();
        }
    }

    public void a(com.facebook.b.az az1)
    {
        c = az1;
    }

    protected void a(Throwable throwable)
    {
        if (c != null && !h)
        {
            h = true;
            if (throwable instanceof m)
            {
                throwable = (m)throwable;
            } else
            {
                throwable = new m(throwable);
            }
            c.a(null, throwable);
            dismiss();
        }
    }

    protected boolean a()
    {
        return h;
    }

    protected void b(String s)
    {
        b = s;
    }

    protected boolean b()
    {
        return j;
    }

    protected WebView c()
    {
        return d;
    }

    public void cancel()
    {
        if (c != null && !h)
        {
            a(new n());
        }
    }

    public void d()
    {
        Display display = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        display.getMetrics(displaymetrics);
        int k;
        int l;
        if (displaymetrics.widthPixels < displaymetrics.heightPixels)
        {
            k = displaymetrics.widthPixels;
        } else
        {
            k = displaymetrics.heightPixels;
        }
        if (displaymetrics.widthPixels < displaymetrics.heightPixels)
        {
            l = displaymetrics.heightPixels;
        } else
        {
            l = displaymetrics.widthPixels;
        }
        k = Math.min(a(k, displaymetrics.density, 480, 800), displaymetrics.widthPixels);
        l = Math.min(a(l, displaymetrics.density, 800, 1280), displaymetrics.heightPixels);
        getWindow().setLayout(k, l);
    }

    public void dismiss()
    {
        if (d != null)
        {
            d.stopLoading();
        }
        if (!i && e != null && e.isShowing())
        {
            e.dismiss();
        }
        super.dismiss();
    }

    public void onAttachedToWindow()
    {
        i = false;
        super.onAttachedToWindow();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        e = new ProgressDialog(getContext());
        e.requestWindowFeature(1);
        e.setMessage(getContext().getString(bc.com_facebook_loading));
        e.setOnCancelListener(new at(this));
        requestWindowFeature(1);
        g = new FrameLayout(getContext());
        d();
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        e();
        a(f.getDrawable().getIntrinsicWidth() / 2 + 1);
        g.addView(f, new android.view.ViewGroup.LayoutParams(-2, -2));
        setContentView(g);
    }

    public void onDetachedFromWindow()
    {
        i = true;
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int k, KeyEvent keyevent)
    {
        if (k == 4)
        {
            cancel();
        }
        return super.onKeyDown(k, keyevent);
    }

    protected void onStart()
    {
        super.onStart();
        d();
    }
}
