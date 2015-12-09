// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

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
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            hs, gw

public class hw extends WebChromeClient
{

    private final hs a;

    public hw(hs hs1)
    {
        a = hs1;
    }

    private final Context a(WebView webview)
    {
        if (!(webview instanceof hs))
        {
            webview = webview.getContext();
        } else
        {
            hs hs1 = (hs)webview;
            android.app.Activity activity = hs1.c();
            webview = activity;
            if (activity == null)
            {
                return hs1.getContext();
            }
        }
        return webview;
    }

    private static void a(android.app.AlertDialog.Builder builder, String s, JsResult jsresult)
    {
        builder.setMessage(s).setPositiveButton(0x104000a, new _cls3(jsresult)).setNegativeButton(0x1040000, new _cls2(jsresult)).setOnCancelListener(new _cls1(jsresult)).create().show();
    }

    private static void a(Context context, android.app.AlertDialog.Builder builder, String s, String s1, JsPromptResult jspromptresult)
    {
        LinearLayout linearlayout = new LinearLayout(context);
        linearlayout.setOrientation(1);
        TextView textview = new TextView(context);
        textview.setText(s);
        context = new EditText(context);
        context.setText(s1);
        linearlayout.addView(textview);
        linearlayout.addView(context);
        builder.setView(linearlayout).setPositiveButton(0x104000a, new _cls6(jspromptresult, context)).setNegativeButton(0x1040000, new _cls5(jspromptresult)).setOnCancelListener(new _cls4(jspromptresult)).create().show();
    }

    private final boolean a()
    {
        return zzp.zzbx().a(a.getContext().getPackageManager(), a.getContext().getPackageName(), "android.permission.ACCESS_FINE_LOCATION") || zzp.zzbx().a(a.getContext().getPackageManager(), a.getContext().getPackageName(), "android.permission.ACCESS_COARSE_LOCATION");
    }

    protected final void a(View view, int i, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        zzd zzd1 = a.f();
        if (zzd1 == null)
        {
            zzb.zzaE("Could not get ad overlay when showing custom view.");
            customviewcallback.onCustomViewHidden();
            return;
        } else
        {
            zzd1.zza(view, customviewcallback);
            zzd1.setRequestedOrientation(i);
            return;
        }
    }

    protected boolean a(Context context, String s, String s1, String s2, JsResult jsresult, JsPromptResult jspromptresult, boolean flag)
    {
        android.app.AlertDialog.Builder builder;
        builder = new android.app.AlertDialog.Builder(context);
        builder.setTitle(s);
        if (flag)
        {
            try
            {
                a(context, builder, s1, s2, jspromptresult);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                zzb.zzd("Fail to display Dialog.", context);
            }
            break MISSING_BLOCK_LABEL_54;
        }
        a(builder, s1, jsresult);
        return true;
    }

    public final void onCloseWindow(WebView webview)
    {
        if (!(webview instanceof hs))
        {
            zzb.zzaE("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        webview = ((hs)webview).f();
        if (webview == null)
        {
            zzb.zzaE("Tried to close an AdWebView not associated with an overlay.");
            return;
        } else
        {
            webview.close();
            return;
        }
    }

    public final boolean onConsoleMessage(ConsoleMessage consolemessage)
    {
        String s;
        s = (new StringBuilder()).append("JS: ").append(consolemessage.message()).append(" (").append(consolemessage.sourceId()).append(":").append(consolemessage.lineNumber()).append(")").toString();
        if (s.contains("Application Cache"))
        {
            return super.onConsoleMessage(consolemessage);
        }
    /* anonymous class not found */
    class _anm7 {}

        _cls7.a[consolemessage.messageLevel().ordinal()];
        JVM INSTR tableswitch 1 5: default 112
    //                   1 122
    //                   2 129
    //                   3 136
    //                   4 136
    //                   5 143;
           goto _L1 _L2 _L3 _L4 _L4 _L5
_L1:
        zzb.zzaD(s);
_L7:
        return super.onConsoleMessage(consolemessage);
_L2:
        zzb.e(s);
        continue; /* Loop/switch isn't completed */
_L3:
        zzb.zzaE(s);
        continue; /* Loop/switch isn't completed */
_L4:
        zzb.zzaD(s);
        continue; /* Loop/switch isn't completed */
_L5:
        zzb.zzaC(s);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final boolean onCreateWindow(WebView webview, boolean flag, boolean flag1, Message message)
    {
        android.webkit.WebView.WebViewTransport webviewtransport = (android.webkit.WebView.WebViewTransport)message.obj;
        webview = new WebView(webview.getContext());
        webview.setWebViewClient(a.i());
        webviewtransport.setWebView(webview);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String s, String s1, long l, long l1, long l2, android.webkit.WebStorage.QuotaUpdater quotaupdater)
    {
        long l3 = 0x500000L - l2;
        if (l3 <= 0L)
        {
            quotaupdater.updateQuota(l);
            return;
        }
        if (l == 0L)
        {
            if (l1 > l3 || l1 > 0x100000L)
            {
                l1 = 0L;
            }
        } else
        if (l1 == 0L)
        {
            l1 = Math.min(Math.min(0x20000L, l3) + l, 0x100000L);
        } else
        {
            l2 = l;
            if (l1 <= Math.min(0x100000L - l, l3))
            {
                l2 = l + l1;
            }
            l1 = l2;
        }
        quotaupdater.updateQuota(l1);
    }

    public final void onGeolocationPermissionsShowPrompt(String s, android.webkit.GeolocationPermissions.Callback callback)
    {
        if (callback != null)
        {
            callback.invoke(s, a(), true);
        }
    }

    public final void onHideCustomView()
    {
        zzd zzd1 = a.f();
        if (zzd1 == null)
        {
            zzb.zzaE("Could not get ad overlay when hiding custom view.");
            return;
        } else
        {
            zzd1.zzex();
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

    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls4 {}

}
