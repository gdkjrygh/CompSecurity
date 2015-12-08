// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

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
import com.facebook.av;
import com.facebook.ay;
import com.facebook.l;
import com.facebook.m;

// Referenced classes of package com.facebook.internal:
//            av, aw, bk, be, 
//            bf, bg, bj, bh

public class bd extends Dialog
{

    private String a;
    private String b;
    private bk c;
    private WebView d;
    private ProgressDialog e;
    private ImageView f;
    private FrameLayout g;
    private boolean h;
    private boolean i;
    private boolean j;

    public bd(Context context, String s)
    {
        this(context, s, (byte)0);
    }

    private bd(Context context, String s, byte byte0)
    {
        super(context, 0x1030010);
        b = "fbconnect://success";
        h = false;
        i = false;
        j = false;
        a = s;
    }

    public bd(Context context, String s, Bundle bundle, int k, bk bk1)
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
        a = aw.a(av.a(), (new StringBuilder()).append(av.d()).append("/dialog/").append(s).toString(), context).toString();
        c = bk1;
    }

    private static int a(int k, float f1, int i1, int j1)
    {
        double d1;
        int k1;
        d1 = 0.5D;
        k1 = (int)((float)k / f1);
        if (k1 > i1) goto _L2; else goto _L1
_L1:
        d1 = 1.0D;
_L4:
        return (int)(d1 * (double)k);
_L2:
        if (k1 < j1)
        {
            d1 = 0.5D + ((double)(j1 - k1) / (double)(j1 - i1)) * 0.5D;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static String a(bd bd1)
    {
        return bd1.b;
    }

    static boolean b(bd bd1)
    {
        return bd1.i;
    }

    static ProgressDialog c(bd bd1)
    {
        return bd1.e;
    }

    static FrameLayout d(bd bd1)
    {
        return bd1.g;
    }

    static WebView e(bd bd1)
    {
        return bd1.d;
    }

    static ImageView f(bd bd1)
    {
        return bd1.f;
    }

    static boolean g(bd bd1)
    {
        bd1.j = true;
        return true;
    }

    protected Bundle a(String s)
    {
        s = Uri.parse(s);
        Bundle bundle = aw.c(s.getQuery());
        bundle.putAll(aw.c(s.getFragment()));
        return bundle;
    }

    protected final void a(Bundle bundle)
    {
        if (c != null && !h)
        {
            h = true;
            c.a(bundle, null);
            dismiss();
        }
    }

    public final void a(bk bk1)
    {
        c = bk1;
    }

    protected final void a(Throwable throwable)
    {
        if (c != null && !h)
        {
            h = true;
            throwable = (l)throwable;
            c.a(null, throwable);
            dismiss();
        }
    }

    protected final boolean a()
    {
        return h;
    }

    protected final void b(String s)
    {
        b = s;
    }

    protected final boolean b()
    {
        return j;
    }

    protected final WebView c()
    {
        return d;
    }

    public void cancel()
    {
        if (c != null && !h)
        {
            a(new m());
        }
    }

    public final void d()
    {
        Display display = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        display.getMetrics(displaymetrics);
        int k;
        int i1;
        if (displaymetrics.widthPixels < displaymetrics.heightPixels)
        {
            k = displaymetrics.widthPixels;
        } else
        {
            k = displaymetrics.heightPixels;
        }
        if (displaymetrics.widthPixels < displaymetrics.heightPixels)
        {
            i1 = displaymetrics.heightPixels;
        } else
        {
            i1 = displaymetrics.widthPixels;
        }
        k = Math.min(a(k, displaymetrics.density, 480, 800), displaymetrics.widthPixels);
        i1 = Math.min(a(i1, displaymetrics.density, 800, 1280), displaymetrics.heightPixels);
        getWindow().setLayout(k, i1);
    }

    public void dismiss()
    {
        if (d != null)
        {
            d.stopLoading();
        }
        if (!i && e.isShowing())
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
        e.setMessage(getContext().getString(ay.e));
        e.setOnCancelListener(new be(this));
        requestWindowFeature(1);
        g = new FrameLayout(getContext());
        d();
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        f = new ImageView(getContext());
        f.setOnClickListener(new bf(this));
        bundle = getContext().getResources().getDrawable(av.c);
        f.setImageDrawable(bundle);
        f.setVisibility(4);
        int k = f.getDrawable().getIntrinsicWidth() / 2 + 1;
        bundle = new LinearLayout(getContext());
        d = new bg(this, getContext());
        d.setVerticalScrollBarEnabled(false);
        d.setHorizontalScrollBarEnabled(false);
        d.setWebViewClient(new bj(this, (byte)0));
        d.getSettings().setJavaScriptEnabled(true);
        d.loadUrl(a);
        d.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        d.setVisibility(4);
        d.getSettings().setSavePassword(false);
        d.getSettings().setSaveFormData(false);
        d.setFocusable(true);
        d.setFocusableInTouchMode(true);
        d.setOnTouchListener(new bh(this));
        bundle.setPadding(k, k, k, k);
        bundle.addView(d);
        bundle.setBackgroundColor(0xcc000000);
        g.addView(bundle);
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
