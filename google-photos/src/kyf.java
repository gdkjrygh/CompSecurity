// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class kyf extends WebChromeClient
{

    private final kxu a;

    public kyf(kxu kxu1)
    {
        a = kxu1;
    }

    private static Context a(WebView webview)
    {
        if (!(webview instanceof kxu))
        {
            webview = webview.getContext();
        } else
        {
            kxu kxu1 = (kxu)webview;
            Activity activity = kxu1.d();
            webview = activity;
            if (activity == null)
            {
                return kxu1.getContext();
            }
        }
        return webview;
    }

    private static boolean a(Context context, String s, String s1, String s2, JsResult jsresult, JsPromptResult jspromptresult, boolean flag)
    {
        android.app.AlertDialog.Builder builder;
        try
        {
            builder = new android.app.AlertDialog.Builder(context);
            builder.setTitle(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            b.b("Fail to display Dialog.", context);
            return true;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        s = new LinearLayout(context);
        s.setOrientation(1);
        jsresult = new TextView(context);
        jsresult.setText(s1);
        context = new EditText(context);
        context.setText(s2);
        s.addView(jsresult);
        s.addView(context);
        builder.setView(s).setPositiveButton(0x104000a, new kyl(jspromptresult, context)).setNegativeButton(0x1040000, new kyk(jspromptresult)).setOnCancelListener(new kyj(jspromptresult)).create().show();
        return true;
        builder.setMessage(s1).setPositiveButton(0x104000a, new kyi(jsresult)).setNegativeButton(0x1040000, new kyh(jsresult)).setOnCancelListener(new kyg(jsresult)).create().show();
        return true;
    }

    protected final void a(View view, int i, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        jov jov1 = a.g();
        if (jov1 == null)
        {
            b.m("Could not get ad overlay when showing custom view.");
            customviewcallback.onCustomViewHidden();
            return;
        } else
        {
            jov1.h = new FrameLayout(jov1.a);
            jov1.h.setBackgroundColor(0xff000000);
            jov1.h.addView(view, -1, -1);
            jov1.a.setContentView(jov1.h);
            jov1.k = true;
            jov1.i = customviewcallback;
            jov1.g = true;
            jov1.a(i);
            return;
        }
    }

    public final void onCloseWindow(WebView webview)
    {
        if (!(webview instanceof kxu))
        {
            b.m("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        webview = ((kxu)webview).g();
        if (webview == null)
        {
            b.m("Tried to close an AdWebView not associated with an overlay.");
            return;
        } else
        {
            webview.a();
            return;
        }
    }

    public final boolean onConsoleMessage(ConsoleMessage consolemessage)
    {
        String s;
        s = (new StringBuilder("JS: ")).append(consolemessage.message()).append(" (").append(consolemessage.sourceId()).append(":").append(consolemessage.lineNumber()).append(")").toString();
        if (s.contains("Application Cache"))
        {
            return super.onConsoleMessage(consolemessage);
        }
        kym.a[consolemessage.messageLevel().ordinal()];
        JVM INSTR tableswitch 1 5: default 108
    //                   1 119
    //                   2 126
    //                   3 133
    //                   4 133
    //                   5 141;
           goto _L1 _L2 _L3 _L4 _L4 _L5
_L1:
        b.p(4);
_L7:
        return super.onConsoleMessage(consolemessage);
_L2:
        b.l(s);
        continue; /* Loop/switch isn't completed */
_L3:
        b.m(s);
        continue; /* Loop/switch isn't completed */
_L4:
        b.p(4);
        continue; /* Loop/switch isn't completed */
_L5:
        b.p(3);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final boolean onCreateWindow(WebView webview, boolean flag, boolean flag1, Message message)
    {
        android.webkit.WebView.WebViewTransport webviewtransport = (android.webkit.WebView.WebViewTransport)message.obj;
        webview = new WebView(webview.getContext());
        webview.setWebViewClient(a.j());
        webviewtransport.setWebView(webview);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String s, String s1, long l, long l1, long l2, android.webkit.WebStorage.QuotaUpdater quotaupdater)
    {
        long l3;
        l3 = 0x500000L - l2;
        if (l3 <= 0L)
        {
            quotaupdater.updateQuota(l);
            return;
        }
        if (l != 0L) goto _L2; else goto _L1
_L1:
        if (l1 > l3 || l1 > 0x100000L)
        {
            l1 = 0L;
        }
_L4:
        quotaupdater.updateQuota(l1);
        return;
_L2:
        if (l1 != 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        l2 = Math.min(Math.min(0x20000L, l3) + l, 0x100000L);
_L5:
        l1 = l2;
        if (true) goto _L4; else goto _L3
_L3:
        l2 = l;
        if (l1 <= Math.min(0x100000L - l, l3))
        {
            l2 = l + l1;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public final void onGeolocationPermissionsShowPrompt(String s, android.webkit.GeolocationPermissions.Callback callback)
    {
        if (callback == null) goto _L2; else goto _L1
_L1:
        jqc.c();
        if (kwz.a(a.getContext().getPackageManager(), a.getContext().getPackageName(), "android.permission.ACCESS_FINE_LOCATION")) goto _L4; else goto _L3
_L3:
        jqc.c();
        if (!kwz.a(a.getContext().getPackageManager(), a.getContext().getPackageName(), "android.permission.ACCESS_COARSE_LOCATION")) goto _L5; else goto _L4
_L4:
        boolean flag = true;
_L7:
        callback.invoke(s, flag, true);
_L2:
        return;
_L5:
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void onHideCustomView()
    {
        jov jov1 = a.g();
        if (jov1 == null)
        {
            b.m("Could not get ad overlay when hiding custom view.");
            return;
        } else
        {
            jov1.b();
            return;
        }
    }

    public final boolean onJsAlert(WebView webview, String s, String s1, JsResult jsresult)
    {
        return a(a(webview), s, s1, null, jsresult, null, false);
    }

    public final boolean onJsBeforeUnload(WebView webview, String s, String s1, JsResult jsresult)
    {
        return a(a(webview), s, s1, null, jsresult, null, false);
    }

    public final boolean onJsConfirm(WebView webview, String s, String s1, JsResult jsresult)
    {
        return a(a(webview), s, s1, null, jsresult, null, false);
    }

    public final boolean onJsPrompt(WebView webview, String s, String s1, String s2, JsPromptResult jspromptresult)
    {
        return a(a(webview), s, s1, s2, null, jspromptresult, true);
    }

    public final void onReachedMaxAppCacheSize(long l, long l1, android.webkit.WebStorage.QuotaUpdater quotaupdater)
    {
        l = 0x20000L + l;
        if (0x500000L - l1 < l)
        {
            quotaupdater.updateQuota(0L);
            return;
        } else
        {
            quotaupdater.updateQuota(l);
            return;
        }
    }

    public final void onShowCustomView(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        a(view, -1, customviewcallback);
    }
}
