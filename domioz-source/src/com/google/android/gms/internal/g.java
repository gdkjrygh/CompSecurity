// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;

// Referenced classes of package com.google.android.gms.internal:
//            h, b, e

final class g
    implements Runnable
{

    ValueCallback a;
    final b b;
    final WebView c;
    final e d;

    g(e e, b b1, WebView webview)
    {
        d = e;
        b = b1;
        c = webview;
        super();
        a = new h(this);
    }

    public final void run()
    {
        if (!c.getSettings().getJavaScriptEnabled())
        {
            break MISSING_BLOCK_LABEL_26;
        }
        c.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", a);
        return;
        Throwable throwable;
        throwable;
        a.onReceiveValue("");
        return;
    }
}
