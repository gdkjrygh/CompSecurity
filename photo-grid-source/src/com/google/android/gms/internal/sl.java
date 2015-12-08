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
//            ry, sr, sq, sp, 
//            so, sn, sm, ss, 
//            qa

public class sl extends WebChromeClient
{

    private final ry a;

    public sl(ry ry1)
    {
        a = ry1;
    }

    private static Context a(WebView webview)
    {
        if (!(webview instanceof ry))
        {
            webview = webview.getContext();
        } else
        {
            ry ry1 = (ry)webview;
            android.app.Activity activity = ry1.e();
            webview = activity;
            if (activity == null)
            {
                return ry1.getContext();
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
            zzb.zzd("Fail to display Dialog.", context);
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
        builder.setView(s).setPositiveButton(0x104000a, new sr(jspromptresult, context)).setNegativeButton(0x1040000, new sq(jspromptresult)).setOnCancelListener(new sp(jspromptresult)).create().show();
        return true;
        builder.setMessage(s1).setPositiveButton(0x104000a, new so(jsresult)).setNegativeButton(0x1040000, new sn(jsresult)).setOnCancelListener(new sm(jsresult)).create().show();
        return true;
    }

    protected final void a(View view, int i, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        zzd zzd1 = a.h();
        if (zzd1 == null)
        {
            zzb.zzaH("Could not get ad overlay when showing custom view.");
            customviewcallback.onCustomViewHidden();
            return;
        } else
        {
            zzd1.zza(view, customviewcallback);
            zzd1.setRequestedOrientation(i);
            return;
        }
    }

    public final void onCloseWindow(WebView webview)
    {
        if (!(webview instanceof ry))
        {
            zzb.zzaH("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        webview = ((ry)webview).h();
        if (webview == null)
        {
            zzb.zzaH("Tried to close an AdWebView not associated with an overlay.");
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
        s = (new StringBuilder("JS: ")).append(consolemessage.message()).append(" (").append(consolemessage.sourceId()).append(":").append(consolemessage.lineNumber()).append(")").toString();
        if (s.contains("Application Cache"))
        {
            return super.onConsoleMessage(consolemessage);
        }
        ss.a[consolemessage.messageLevel().ordinal()];
        JVM INSTR tableswitch 1 5: default 108
    //                   1 118
    //                   2 125
    //                   3 132
    //                   4 132
    //                   5 139;
           goto _L1 _L2 _L3 _L4 _L4 _L5
_L1:
        zzb.zzaG(s);
_L7:
        return super.onConsoleMessage(consolemessage);
_L2:
        zzb.e(s);
        continue; /* Loop/switch isn't completed */
_L3:
        zzb.zzaH(s);
        continue; /* Loop/switch isn't completed */
_L4:
        zzb.zzaG(s);
        continue; /* Loop/switch isn't completed */
_L5:
        zzb.zzaF(s);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final boolean onCreateWindow(WebView webview, boolean flag, boolean flag1, Message message)
    {
        android.webkit.WebView.WebViewTransport webviewtransport = (android.webkit.WebView.WebViewTransport)message.obj;
        webview = new WebView(webview.getContext());
        webview.setWebViewClient(a.k());
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
        zzp.zzbv();
        if (qa.a(a.getContext().getPackageManager(), a.getContext().getPackageName(), "android.permission.ACCESS_FINE_LOCATION")) goto _L4; else goto _L3
_L3:
        zzp.zzbv();
        if (!qa.a(a.getContext().getPackageManager(), a.getContext().getPackageName(), "android.permission.ACCESS_COARSE_LOCATION")) goto _L5; else goto _L4
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
        zzd zzd1 = a.h();
        if (zzd1 == null)
        {
            zzb.zzaH("Could not get ad overlay when hiding custom view.");
            return;
        } else
        {
            zzd1.zzeD();
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
