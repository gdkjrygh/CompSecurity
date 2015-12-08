// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;

// Referenced classes of package com.google.android.gms.internal:
//            zzae, zzab

class _cls1.a
    implements Runnable
{

    ValueCallback a;
    final zzab b;
    final WebView c;
    final zzae d;

    public void run()
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

    _cls1.a(zzae zzae1, zzab zzab, WebView webview)
    {
        d = zzae1;
        b = zzab;
        c = webview;
        super();
        a = new ValueCallback() {

            final zzae._cls2 a;

            public void a(String s)
            {
                a.d.zza(a.b, a.c, s);
            }

            public void onReceiveValue(Object obj)
            {
                a((String)obj);
            }

            
            {
                a = zzae._cls2.this;
                super();
            }
        };
    }
}
