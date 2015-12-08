// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;

public class ash extends Dialog
{

    public String a;
    public asl b;
    public WebView c;
    public boolean d;
    private String e;
    private ProgressDialog f;
    private ImageView g;
    private FrameLayout h;
    private boolean i;
    private boolean j;

    public ash(Context context, String s)
    {
        this(context, s, (byte)0);
    }

    private ash(Context context, String s, byte byte0)
    {
        super(context, 0x1030010);
        a = "fbconnect://success";
        d = false;
        i = false;
        j = false;
        e = s;
    }

    public ash(Context context, String s, Bundle bundle, int k, asl asl1)
    {
        super(context, k);
        a = "fbconnect://success";
        d = false;
        i = false;
        j = false;
        context = bundle;
        if (bundle == null)
        {
            context = new Bundle();
        }
        context.putString("redirect_uri", "fbconnect://success");
        context.putString("display", "touch");
        e = arp.a(ark.a(), (new StringBuilder()).append(ark.d()).append("/dialog/").append(s).toString(), context).toString();
        b = asl1;
    }

    private static int a(int k, float f1, int l, int i1)
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

    static String a(ash ash1)
    {
        return ash1.a;
    }

    static boolean b(ash ash1)
    {
        return ash1.i;
    }

    static ProgressDialog c(ash ash1)
    {
        return ash1.f;
    }

    static FrameLayout d(ash ash1)
    {
        return ash1.h;
    }

    static WebView e(ash ash1)
    {
        return ash1.c;
    }

    static ImageView f(ash ash1)
    {
        return ash1.g;
    }

    public Bundle a(String s)
    {
        s = Uri.parse(s);
        Bundle bundle = arp.c(s.getQuery());
        bundle.putAll(arp.c(s.getFragment()));
        return bundle;
    }

    public final void a()
    {
        a(((Throwable) (new FacebookOperationCanceledException())));
    }

    protected final void a(Throwable throwable)
    {
        if (b != null && !d)
        {
            d = true;
            throwable = (FacebookException)throwable;
            b.a(null, throwable);
            dismiss();
        }
    }

    public void dismiss()
    {
        if (!j)
        {
            j = true;
            if (!d)
            {
                a();
            }
            if (c != null)
            {
                c.stopLoading();
            }
            if (!i)
            {
                if (f.isShowing())
                {
                    f.dismiss();
                }
                super.dismiss();
                return;
            }
        }
    }

    public void onAttachedToWindow()
    {
        i = false;
        super.onAttachedToWindow();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        f = new ProgressDialog(getContext());
        f.requestWindowFeature(1);
        f.setMessage(getContext().getString(0x7f0805fb));
        f.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            private ash a;

            public final void onCancel(DialogInterface dialoginterface)
            {
                a.dismiss();
            }

            
            {
                a = ash.this;
                super();
            }
        });
        requestWindowFeature(1);
        h = new FrameLayout(getContext());
        bundle = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        bundle.getMetrics(displaymetrics);
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
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        g = new ImageView(getContext());
        g.setOnClickListener(new android.view.View.OnClickListener() {

            private ash a;

            public final void onClick(View view)
            {
                a.dismiss();
            }

            
            {
                a = ash.this;
                super();
            }
        });
        bundle = getContext().getResources().getDrawable(0x7f020127);
        g.setImageDrawable(bundle);
        g.setVisibility(4);
        k = g.getDrawable().getIntrinsicWidth() / 2 + 1;
        bundle = new LinearLayout(getContext());
        c = new WebView(getContext()) {

            public final void onWindowFocusChanged(boolean flag)
            {
                try
                {
                    super.onWindowFocusChanged(flag);
                    return;
                }
                catch (NullPointerException nullpointerexception)
                {
                    return;
                }
            }

        };
        c.setVerticalScrollBarEnabled(false);
        c.setHorizontalScrollBarEnabled(false);
        c.setWebViewClient(new ask(this, (byte)0));
        c.getSettings().setJavaScriptEnabled(true);
        c.loadUrl(e);
        c.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        c.setVisibility(4);
        c.getSettings().setSavePassword(false);
        c.getSettings().setSaveFormData(false);
        bundle.setPadding(k, k, k, k);
        bundle.addView(c);
        bundle.setBackgroundColor(0xcc000000);
        h.addView(bundle);
        h.addView(g, new android.view.ViewGroup.LayoutParams(-2, -2));
        setContentView(h);
    }

    public void onDetachedFromWindow()
    {
        i = true;
        super.onDetachedFromWindow();
    }
}
