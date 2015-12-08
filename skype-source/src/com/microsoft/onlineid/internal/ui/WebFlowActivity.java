// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.microsoft.onlineid.a.a;
import com.microsoft.onlineid.a.b;
import com.microsoft.onlineid.a.c;
import com.microsoft.onlineid.d.e;
import com.microsoft.onlineid.internal.a.f;
import com.microsoft.onlineid.internal.c.d;
import com.microsoft.onlineid.internal.c.h;
import com.microsoft.onlineid.internal.n;
import com.microsoft.onlineid.sms.SmsReceiver;
import java.util.Locale;
import java.util.Set;

// Referenced classes of package com.microsoft.onlineid.internal.ui:
//            ProgressView, f

public class WebFlowActivity extends Activity
{
    private final class a extends WebChromeClient
    {

        final WebFlowActivity a;

        public final boolean onCreateWindow(WebView webview, boolean flag, boolean flag1, Message message)
        {
            try
            {
                ((android.webkit.WebView.WebViewTransport)message.obj).setWebView(new WebView(a));
                message.sendToTarget();
                com.microsoft.onlineid.internal.ui.WebFlowActivity.c(a).a();
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                com.microsoft.onlineid.internal.e.a(false);
                return false;
            }
            return true;
        }

        private a()
        {
            a = WebFlowActivity.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    private final class b extends WebViewClient
    {

        final WebFlowActivity a;

        public final void onPageFinished(WebView webview, String s)
        {
            super.onPageFinished(webview, s);
            com.microsoft.onlineid.internal.ui.WebFlowActivity.b(a);
        }

        public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            super.onPageStarted(webview, s, bitmap);
            com.microsoft.onlineid.internal.ui.WebFlowActivity.a(a);
            com.microsoft.onlineid.internal.c.d.a((new StringBuilder("New page loaded: ")).append(s).toString());
        }

        public final void onReceivedError(WebView webview, int i, String s, String s1)
        {
            super.onReceivedError(webview, i, s, s1);
            com.microsoft.onlineid.internal.ui.WebFlowActivity.a(a, webview, i, s, s1);
        }

        public final boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            com.microsoft.onlineid.internal.ui.WebFlowActivity.a();
            return super.shouldOverrideUrlLoading(webview, s);
        }

        private b()
        {
            a = WebFlowActivity.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }


    protected ProgressView a;
    private com.microsoft.onlineid.internal.ui.f b;
    private h c;
    private SmsReceiver d;
    private String e;
    private c f;
    private WebView g;
    private String h;

    public WebFlowActivity()
    {
    }

    public static com.microsoft.onlineid.internal.b a(Context context, Uri uri, String s, boolean flag)
    {
        return new com.microsoft.onlineid.internal.b(context, (new Intent()).setClass(context, com/microsoft/onlineid/internal/ui/WebFlowActivity).setAction(s).setData(uri).putExtra("com.microsoft.onlineid.internal.ui.FullScreen", flag)) {

            public final void o()
            {
                b().startActivity(a());
            }

        };
    }

    static void a(WebFlowActivity webflowactivity)
    {
        webflowactivity.a.a();
        webflowactivity.f = com.microsoft.onlineid.a.a.a().b("Rendering", "WebWizard page load", webflowactivity.h).a();
    }

    static void a(WebFlowActivity webflowactivity, WebView webview, int i, String s, String s1)
    {
        webview.stopLoading();
        webview.loadUrl("about:blank");
        com.microsoft.onlineid.a.a.a().a("Performance", "No network connectivity", "During web flow");
        webflowactivity.a(1, (new com.microsoft.onlineid.internal.c()).a(new com.microsoft.onlineid.b.c(String.format(Locale.US, "Error code: %d, Error description: %s, Failing url: %s", new Object[] {
            Integer.valueOf(i), s, s1
        }))).a());
        webflowactivity.finish();
    }

    static boolean a()
    {
        return false;
    }

    static void b(WebFlowActivity webflowactivity)
    {
        webflowactivity.a.b();
        if (webflowactivity.f != null)
        {
            webflowactivity.f.b();
        }
    }

    static com.microsoft.onlineid.internal.ui.f c(WebFlowActivity webflowactivity)
    {
        return webflowactivity.b;
    }

    public final void a(int i, Bundle bundle)
    {
        com.microsoft.onlineid.internal.b b1 = new com.microsoft.onlineid.internal.b(getApplicationContext(), getIntent());
        Intent intent = b1.h();
        ResultReceiver resultreceiver = b1.i();
        if (intent != null && i == -1)
        {
            b1.a(new com.microsoft.onlineid.internal.c(bundle));
        } else
        if (resultreceiver != null)
        {
            resultreceiver.send(i, bundle);
        } else
        {
            if (bundle != null)
            {
                bundle = (new Intent()).putExtras(bundle);
            } else
            {
                bundle = null;
            }
            setResult(i, bundle);
        }
        finish();
        if (i == -1 && (getIntent().getFlags() & 0x10000) == 0x10000)
        {
            overridePendingTransition(0, 0);
        }
    }

    public void onBackPressed()
    {
        if (g.canGoBack() && !g.getUrl().startsWith(e))
        {
            g.loadUrl("javascript:OnBack()");
            return;
        } else
        {
            a(0, null);
            return;
        }
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Object obj = new RelativeLayout(this);
        ((RelativeLayout) (obj)).setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -2));
        ((RelativeLayout) (obj)).setBackgroundColor(-1);
        g = new WebView(this);
        bundle = getIntent().getAction();
        int i;
        boolean flag;
        if ("com.microsoft.onlineid.internal.SIGN_IN".equals(bundle))
        {
            bundle = "msa_sdk_webflow_webview_sign_in";
        } else
        if ("com.microsoft.onlineid.internal.SIGN_UP".equals(bundle))
        {
            bundle = "msa_sdk_webflow_webview_sign_up";
        } else
        {
            bundle = "msa_sdk_webflow_webview_resolve_interrupt";
        }
        i = getApplicationContext().getResources().getIdentifier(bundle, "id", getApplicationContext().getPackageName());
        g.setId(i);
        bundle = new android.widget.RelativeLayout.LayoutParams(-2, -1);
        bundle.addRule(10);
        ((RelativeLayout) (obj)).addView(g, bundle);
        a = new ProgressView(this);
        bundle = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        bundle.addRule(10);
        ((RelativeLayout) (obj)).addView(a, bundle);
        setContentView(((android.view.View) (obj)));
        CookieSyncManager.createInstance(this);
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().removeAllCookie();
        b = new com.microsoft.onlineid.internal.ui.f(this);
        g.addJavascriptInterface(b, "external");
        bundle = g.getSettings();
        bundle.setUserAgentString(com.microsoft.onlineid.internal.transport.b.b(bundle.getUserAgentString(), com.microsoft.onlineid.internal.transport.b.a(getApplicationContext())));
        bundle.setJavaScriptEnabled(true);
        bundle.setJavaScriptCanOpenWindowsAutomatically(true);
        bundle.setSupportMultipleWindows(true);
        g.setWebViewClient(new b((byte)0));
        g.setWebChromeClient(new a((byte)0));
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            g.getSettings().setSavePassword(false);
        }
        com.microsoft.onlineid.internal.a.f.a();
        bundle = getIntent().getData();
        obj = getApplicationContext();
        if (!TextUtils.isEmpty(bundle.getQueryParameter("mkt")))
        {
            com.microsoft.onlineid.internal.c.d.b("Given URL already has mkt parameter set.");
        } else
        {
            obj = (new n(((Context) (obj)))).a("app_market");
            android.net.Uri.Builder builder = bundle.buildUpon();
            bundle = ((Bundle) (obj));
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                bundle = "en";
            }
            bundle = builder.appendQueryParameter("mkt", bundle).build();
        }
        obj = getApplicationContext();
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            if (android.provider.Settings.System.getInt(((Context) (obj)).getContentResolver(), "airplane_mode_on", 0) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        if (android.provider.Settings.Global.getInt(((Context) (obj)).getContentResolver(), "airplane_mode_on", 0) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = bundle;
        if (!flag)
        {
            obj = new e(getApplicationContext());
            if (!TextUtils.isEmpty(bundle.getQueryParameter("phone")))
            {
                com.microsoft.onlineid.internal.c.d.b("Given URL already has phone parameter set.");
                obj = bundle;
            } else
            {
                String s = ((e) (obj)).a();
                obj = bundle.buildUpon();
                if (TextUtils.isEmpty(s))
                {
                    bundle = "";
                } else
                {
                    bundle = s.replaceAll("[^\\d]+", "");
                }
                obj = ((android.net.Uri.Builder) (obj)).appendQueryParameter("phone", bundle).build();
            }
        }
        bundle = new com.microsoft.onlineid.d.a(getApplicationContext());
        if (!TextUtils.isEmpty(((Uri) (obj)).getQueryParameter("email")))
        {
            com.microsoft.onlineid.internal.c.d.b("Given URL already has email parameter set.");
        } else
        {
            bundle = bundle.a();
            obj = ((Uri) (obj)).buildUpon();
            if (bundle.isEmpty())
            {
                bundle = "";
            } else
            {
                bundle = TextUtils.join(",", bundle);
            }
            obj = ((android.net.Uri.Builder) (obj)).appendQueryParameter("email", bundle).build();
        }
        e = ((Uri) (obj)).toString();
        com.microsoft.onlineid.internal.a.f.a();
        g.loadUrl(e);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (c != null)
        {
            c.a(i);
        }
        return super.onKeyDown(i, keyevent);
    }

    public void onPause()
    {
        super.onPause();
        unregisterReceiver(d);
    }

    protected void onResume()
    {
        super.onResume();
        d = new SmsReceiver(b);
        IntentFilter intentfilter = new IntentFilter("android.provider.Telephony.SMS_RECEIVED");
        intentfilter.setPriority(0x7fffffff);
        registerReceiver(d, intentfilter);
    }

    public final void onStart()
    {
        super.onStart();
        String s = getIntent().getAction();
        if ("com.microsoft.onlineid.internal.SIGN_IN".equals(s))
        {
            h = "sign in";
        } else
        if ("com.microsoft.onlineid.internal.SIGN_UP".equals(s))
        {
            h = "sign up";
        } else
        if ("com.microsoft.onlineid.internal.RESOLVE_INTERRUPT".equals(s))
        {
            h = "auth url";
        } else
        if (TextUtils.isEmpty(s))
        {
            h = "not specified";
        } else
        {
            h = s;
        }
        com.microsoft.onlineid.a.a.a().a((new StringBuilder("Web wizard (")).append(h).append(")").toString());
    }
}
