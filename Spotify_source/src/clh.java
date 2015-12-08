// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
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
import com.google.android.gms.ads.internal.overlay.zzd;

public class clh extends WebChromeClient
{

    private final ckw a;

    public clh(ckw ckw1)
    {
        a = ckw1;
    }

    private static Context a(WebView webview)
    {
        if (!(webview instanceof ckw))
        {
            webview = webview.getContext();
        } else
        {
            ckw ckw1 = (ckw)webview;
            Activity activity = ckw1.e();
            webview = activity;
            if (activity == null)
            {
                return ckw1.getContext();
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
            bka.c("Fail to display Dialog.", context);
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
        builder.setView(s).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener(jspromptresult, context) {

            private JsPromptResult a;
            private EditText b;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                a.confirm(b.getText().toString());
            }

            
            {
                a = jspromptresult;
                b = edittext;
                super();
            }
        }).setNegativeButton(0x1040000, new android.content.DialogInterface.OnClickListener(jspromptresult) {

            private JsPromptResult a;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                a.cancel();
            }

            
            {
                a = jspromptresult;
                super();
            }
        }).setOnCancelListener(new android.content.DialogInterface.OnCancelListener(jspromptresult) {

            private JsPromptResult a;

            public final void onCancel(DialogInterface dialoginterface)
            {
                a.cancel();
            }

            
            {
                a = jspromptresult;
                super();
            }
        }).create().show();
        return true;
        builder.setMessage(s1).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener(jsresult) {

            private JsResult a;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                a.confirm();
            }

            
            {
                a = jsresult;
                super();
            }
        }).setNegativeButton(0x1040000, new android.content.DialogInterface.OnClickListener(jsresult) {

            private JsResult a;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                a.cancel();
            }

            
            {
                a = jsresult;
                super();
            }
        }).setOnCancelListener(new android.content.DialogInterface.OnCancelListener(jsresult) {

            private JsResult a;

            public final void onCancel(DialogInterface dialoginterface)
            {
                a.cancel();
            }

            
            {
                a = jsresult;
                super();
            }
        }).create().show();
        return true;
    }

    protected final void a(View view, int i, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        zzd zzd1 = a.h();
        if (zzd1 == null)
        {
            bka.e("Could not get ad overlay when showing custom view.");
            customviewcallback.onCustomViewHidden();
            return;
        } else
        {
            zzd1.e = new FrameLayout(zzd1.a);
            zzd1.e.setBackgroundColor(0xff000000);
            zzd1.e.addView(view, -1, -1);
            zzd1.a.setContentView(zzd1.e);
            zzd1.i = true;
            zzd1.f = customviewcallback;
            zzd1.d = true;
            zzd1.a(i);
            return;
        }
    }

    public final void onCloseWindow(WebView webview)
    {
        if (!(webview instanceof ckw))
        {
            bka.e("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        webview = ((ckw)webview).h();
        if (webview == null)
        {
            bka.e("Tried to close an AdWebView not associated with an overlay.");
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
        final class _cls7
        {

            static final int a[];

            static 
            {
                a = new int[android.webkit.ConsoleMessage.MessageLevel.values().length];
                try
                {
                    a[android.webkit.ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[android.webkit.ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[android.webkit.ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[android.webkit.ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[android.webkit.ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls7.a[consolemessage.messageLevel().ordinal()];
        JVM INSTR tableswitch 1 5: default 108
    //                   1 118
    //                   2 125
    //                   3 132
    //                   4 132
    //                   5 139;
           goto _L1 _L2 _L3 _L4 _L4 _L5
_L1:
        bka.c(s);
_L7:
        return super.onConsoleMessage(consolemessage);
_L2:
        bka.b(s);
        continue; /* Loop/switch isn't completed */
_L3:
        bka.e(s);
        continue; /* Loop/switch isn't completed */
_L4:
        bka.c(s);
        continue; /* Loop/switch isn't completed */
_L5:
        bka.a(s);
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
        bkv.e();
        if (cjj.a(a.getContext().getPackageManager(), a.getContext().getPackageName(), "android.permission.ACCESS_FINE_LOCATION")) goto _L4; else goto _L3
_L3:
        bkv.e();
        if (!cjj.a(a.getContext().getPackageManager(), a.getContext().getPackageName(), "android.permission.ACCESS_COARSE_LOCATION")) goto _L5; else goto _L4
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
            bka.e("Could not get ad overlay when hiding custom view.");
            return;
        } else
        {
            zzd1.b();
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
