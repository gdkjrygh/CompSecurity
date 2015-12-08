// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;

// Referenced classes of package com.google.android.gms.internal:
//            cb, bv, by

final class ca
    implements Runnable
{

    ValueCallback a;
    final bv b;
    final WebView c;
    final by d;

    ca(by by, bv bv, WebView webview)
    {
        d = by;
        b = bv;
        c = webview;
        super();
        a = new cb(this);
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
