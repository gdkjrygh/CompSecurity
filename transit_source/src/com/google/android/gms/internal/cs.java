// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.google.android.gms.internal:
//            cq, cn, bf

public class cs extends WebChromeClient
{

    private final cq fG;

    public cs(cq cq1)
    {
        fG = cq1;
    }

    private static void a(android.app.AlertDialog.Builder builder, String s, JsResult jsresult)
    {
        builder.setMessage(s).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener(jsresult) {

            final JsResult ii;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                ii.confirm();
            }

            
            {
                ii = jsresult;
                super();
            }
        }).setNegativeButton(0x1040000, new android.content.DialogInterface.OnClickListener(jsresult) {

            final JsResult ii;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                ii.cancel();
            }

            
            {
                ii = jsresult;
                super();
            }
        }).setOnCancelListener(new android.content.DialogInterface.OnCancelListener(jsresult) {

            final JsResult ii;

            public void onCancel(DialogInterface dialoginterface)
            {
                ii.cancel();
            }

            
            {
                ii = jsresult;
                super();
            }
        }).create().show();
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
        builder.setView(linearlayout).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener(jspromptresult, context) {

            final JsPromptResult ij;
            final EditText ik;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                ij.confirm(ik.getText().toString());
            }

            
            {
                ij = jspromptresult;
                ik = edittext;
                super();
            }
        }).setNegativeButton(0x1040000, new android.content.DialogInterface.OnClickListener(jspromptresult) {

            final JsPromptResult ij;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                ij.cancel();
            }

            
            {
                ij = jspromptresult;
                super();
            }
        }).setOnCancelListener(new android.content.DialogInterface.OnCancelListener(jspromptresult) {

            final JsPromptResult ij;

            public void onCancel(DialogInterface dialoginterface)
            {
                ij.cancel();
            }

            
            {
                ij = jspromptresult;
                super();
            }
        }).create().show();
    }

    private static boolean a(Context context, String s, String s1, String s2, JsResult jsresult, JsPromptResult jspromptresult, boolean flag)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        builder.setTitle(s);
        if (flag)
        {
            a(context, builder, s1, s2, jspromptresult);
        } else
        {
            a(builder, s1, jsresult);
        }
        return true;
    }

    protected final void a(View view, int i, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        bf bf1 = fG.au();
        if (bf1 == null)
        {
            cn.q("Could not get ad overlay when showing custom view.");
            customviewcallback.onCustomViewHidden();
            return;
        } else
        {
            bf1.a(view, customviewcallback);
            bf1.setRequestedOrientation(i);
            return;
        }
    }

    public final void onCloseWindow(WebView webview)
    {
        if (!(webview instanceof cq))
        {
            cn.q("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        webview = ((cq)webview).au();
        if (webview == null)
        {
            cn.q("Tried to close an AdWebView not associated with an overlay.");
            return;
        } else
        {
            webview.close();
            return;
        }
    }

    public final boolean onConsoleMessage(ConsoleMessage consolemessage)
    {
        String s = (new StringBuilder()).append("JS: ").append(consolemessage.message()).append(" (").append(consolemessage.sourceId()).append(":").append(consolemessage.lineNumber()).append(")").toString();
        static class _cls7
        {

            static final int il[];

            static 
            {
                il = new int[android.webkit.ConsoleMessage.MessageLevel.values().length];
                try
                {
                    il[android.webkit.ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    il[android.webkit.ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    il[android.webkit.ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    il[android.webkit.ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    il[android.webkit.ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls7.il[consolemessage.messageLevel().ordinal()];
        JVM INSTR tableswitch 1 5: default 96
    //                   1 106
    //                   2 113
    //                   3 120
    //                   4 120
    //                   5 127;
           goto _L1 _L2 _L3 _L4 _L4 _L5
_L1:
        cn.o(s);
_L7:
        return super.onConsoleMessage(consolemessage);
_L2:
        cn.n(s);
        continue; /* Loop/switch isn't completed */
_L3:
        cn.q(s);
        continue; /* Loop/switch isn't completed */
_L4:
        cn.o(s);
        continue; /* Loop/switch isn't completed */
_L5:
        cn.m(s);
        if (true) goto _L7; else goto _L6
_L6:
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

    public final void onHideCustomView()
    {
        bf bf1 = fG.au();
        if (bf1 == null)
        {
            cn.q("Could not get ad overlay when hiding custom view.");
            return;
        } else
        {
            bf1.R();
            return;
        }
    }

    public final boolean onJsAlert(WebView webview, String s, String s1, JsResult jsresult)
    {
        return a(webview.getContext(), s, s1, null, jsresult, null, false);
    }

    public final boolean onJsBeforeUnload(WebView webview, String s, String s1, JsResult jsresult)
    {
        return a(webview.getContext(), s, s1, null, jsresult, null, false);
    }

    public final boolean onJsConfirm(WebView webview, String s, String s1, JsResult jsresult)
    {
        return a(webview.getContext(), s, s1, null, jsresult, null, false);
    }

    public final boolean onJsPrompt(WebView webview, String s, String s1, String s2, JsPromptResult jspromptresult)
    {
        return a(webview.getContext(), s, s1, s2, null, jspromptresult, true);
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
