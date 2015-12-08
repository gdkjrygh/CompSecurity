// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.AccessToken;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.g;
import java.util.Locale;

// Referenced classes of package com.facebook.internal:
//            l, m, n

public class o extends Dialog
{
    public static class a
    {

        public Context a;
        public String b;
        public int c;
        public c d;
        public Bundle e;
        private String f;
        private AccessToken g;

        private void a(Context context, String s, Bundle bundle)
        {
            a = context;
            f = s;
            if (bundle != null)
            {
                e = bundle;
                return;
            } else
            {
                e = new Bundle();
                return;
            }
        }

        public o a()
        {
            if (g != null)
            {
                e.putString("app_id", g.g);
                e.putString("access_token", g.d);
            } else
            {
                e.putString("app_id", b);
            }
            return new o(a, f, e, c, d);
        }

        public a(Context context, String s, Bundle bundle)
        {
label0:
            {
                super();
                c = 0x1030010;
                g = AccessToken.a();
                if (g == null)
                {
                    String s1 = m.a(context);
                    if (s1 == null)
                    {
                        break label0;
                    }
                    b = s1;
                }
                a(context, s, bundle);
                return;
            }
            throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
        }

        public a(Context context, String s, String s1, Bundle bundle)
        {
            c = 0x1030010;
            String s2 = s;
            if (s == null)
            {
                s2 = m.a(context);
            }
            n.a(s2, "applicationId");
            b = s2;
            a(context, s1, bundle);
        }
    }

    private final class b extends WebViewClient
    {

        final o a;

        public final void onPageFinished(WebView webview, String s)
        {
            super.onPageFinished(webview, s);
            if (!o.b(a))
            {
                o.c(a).dismiss();
            }
            o.d(a).setBackgroundColor(0);
            o.e(a).setVisibility(0);
            o.f(a).setVisibility(0);
            com.facebook.internal.o.g(a);
        }

        public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            m.a("FacebookSDK.WebDialog", (new StringBuilder("Webview loading URL: ")).append(s).toString());
            super.onPageStarted(webview, s, bitmap);
            if (!o.b(a))
            {
                o.c(a).show();
            }
        }

        public final void onReceivedError(WebView webview, int k, String s, String s1)
        {
            super.onReceivedError(webview, k, s, s1);
            a.a(new FacebookDialogException(s, k, s1));
        }

        public final void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
        {
            super.onReceivedSslError(webview, sslerrorhandler, sslerror);
            sslerrorhandler.cancel();
            a.a(new FacebookDialogException(null, -11, null));
        }

        public final boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            boolean flag;
            flag = false;
            m.a("FacebookSDK.WebDialog", (new StringBuilder("Redirect URL: ")).append(s).toString());
            if (!s.startsWith(o.a(a))) goto _L2; else goto _L1
_L1:
            Bundle bundle = a.a(s);
            webview = bundle.getString("error");
            s = webview;
            if (webview == null)
            {
                s = bundle.getString("error_type");
            }
            Object obj = bundle.getString("error_msg");
            webview = ((WebView) (obj));
            if (obj == null)
            {
                webview = bundle.getString("error_message");
            }
            obj = webview;
            if (webview == null)
            {
                obj = bundle.getString("error_description");
            }
            webview = bundle.getString("error_code");
            int k;
            if (!m.a(webview))
            {
                try
                {
                    k = Integer.parseInt(webview);
                }
                // Misplaced declaration of an exception variable
                catch (WebView webview)
                {
                    k = -1;
                }
            } else
            {
                k = -1;
            }
            if (m.a(s) && m.a(((String) (obj))) && k == -1)
            {
                webview = a;
                if (((o) (webview)).b != null && !((o) (webview)).d)
                {
                    webview.d = true;
                    ((o) (webview)).b.a(bundle, null);
                    webview.dismiss();
                }
            } else
            if (s != null && (s.equals("access_denied") || s.equals("OAuthAccessDeniedException")))
            {
                a.cancel();
            } else
            if (k == 4201)
            {
                a.cancel();
            } else
            {
                webview = new FacebookRequestError(k, s, ((String) (obj)));
                a.a(new FacebookServiceException(webview, ((String) (obj))));
            }
            flag = true;
_L4:
            return flag;
_L2:
            if (s.startsWith("fbconnect://cancel"))
            {
                a.cancel();
                return true;
            }
            if (s.contains("touch")) goto _L4; else goto _L3
_L3:
            a.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
            return true;
            webview;
            return false;
            if (true) goto _L6; else goto _L5
_L6:
            break MISSING_BLOCK_LABEL_187;
_L5:
        }

        private b()
        {
            a = o.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }

    public static interface c
    {

        public abstract void a(Bundle bundle, FacebookException facebookexception);
    }


    String a;
    c b;
    WebView c;
    boolean d;
    boolean e;
    private String f;
    private ProgressDialog g;
    private ImageView h;
    private FrameLayout i;
    private boolean j;

    public o(Context context, String s)
    {
        this(context, s, (byte)0);
    }

    private o(Context context, String s, byte byte0)
    {
        super(context, 0x1030010);
        a = "fbconnect://success";
        d = false;
        j = false;
        e = false;
        f = s;
    }

    public o(Context context, String s, Bundle bundle, int k, c c1)
    {
        int i1 = k;
        if (k == 0)
        {
            i1 = 0x1030010;
        }
        super(context, i1);
        a = "fbconnect://success";
        d = false;
        j = false;
        e = false;
        context = bundle;
        if (bundle == null)
        {
            context = new Bundle();
        }
        context.putString("redirect_uri", "fbconnect://success");
        context.putString("display", "touch");
        context.putString("sdk", String.format(Locale.ROOT, "android-%s", new Object[] {
            com.facebook.g.h()
        }));
        f = m.a(l.a(), (new StringBuilder()).append(l.d()).append("/dialog/").append(s).toString(), context).toString();
        b = c1;
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

    static String a(o o1)
    {
        return o1.a;
    }

    static boolean b(o o1)
    {
        return o1.j;
    }

    static ProgressDialog c(o o1)
    {
        return o1.g;
    }

    static FrameLayout d(o o1)
    {
        return o1.i;
    }

    static WebView e(o o1)
    {
        return o1.c;
    }

    static ImageView f(o o1)
    {
        return o1.h;
    }

    static boolean g(o o1)
    {
        o1.e = true;
        return true;
    }

    protected Bundle a(String s)
    {
        s = Uri.parse(s);
        Bundle bundle = m.b(s.getQuery());
        bundle.putAll(m.b(s.getFragment()));
        return bundle;
    }

    public final void a()
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

    public void cancel()
    {
        if (b != null && !d)
        {
            a(new FacebookOperationCanceledException());
        }
    }

    public void dismiss()
    {
        if (c != null)
        {
            c.stopLoading();
        }
        if (!j && g != null && g.isShowing())
        {
            g.dismiss();
        }
        super.dismiss();
    }

    public void onAttachedToWindow()
    {
        j = false;
        super.onAttachedToWindow();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        g = new ProgressDialog(getContext());
        g.requestWindowFeature(1);
        g.setMessage(getContext().getString(com.facebook.p.e.com_facebook_loading));
        g.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final o a;

            public final void onCancel(DialogInterface dialoginterface)
            {
                a.cancel();
            }

            
            {
                a = o.this;
                super();
            }
        });
        requestWindowFeature(1);
        i = new FrameLayout(getContext());
        a();
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        h = new ImageView(getContext());
        h.setOnClickListener(new android.view.View.OnClickListener() {

            final o a;

            public final void onClick(View view)
            {
                a.cancel();
            }

            
            {
                a = o.this;
                super();
            }
        });
        bundle = getContext().getResources().getDrawable(com.facebook.p.b.com_facebook_close);
        h.setImageDrawable(bundle);
        h.setVisibility(4);
        int k = h.getDrawable().getIntrinsicWidth() / 2 + 1;
        bundle = new LinearLayout(getContext());
        c = new WebView(getContext().getApplicationContext()) {

            final o a;

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

            
            {
                a = o.this;
                super(context);
            }
        };
        c.setVerticalScrollBarEnabled(false);
        c.setHorizontalScrollBarEnabled(false);
        c.setWebViewClient(new b((byte)0));
        c.getSettings().setJavaScriptEnabled(true);
        c.loadUrl(f);
        c.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        c.setVisibility(4);
        c.getSettings().setSavePassword(false);
        c.getSettings().setSaveFormData(false);
        c.setFocusable(true);
        c.setFocusableInTouchMode(true);
        c.setOnTouchListener(new android.view.View.OnTouchListener() {

            final o a;

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                if (!view.hasFocus())
                {
                    view.requestFocus();
                }
                return false;
            }

            
            {
                a = o.this;
                super();
            }
        });
        bundle.setPadding(k, k, k, k);
        bundle.addView(c);
        bundle.setBackgroundColor(0xcc000000);
        i.addView(bundle);
        i.addView(h, new android.view.ViewGroup.LayoutParams(-2, -2));
        setContentView(i);
    }

    public void onDetachedFromWindow()
    {
        j = true;
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
        a();
    }
}
