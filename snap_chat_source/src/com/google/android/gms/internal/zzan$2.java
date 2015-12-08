// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;

// Referenced classes of package com.google.android.gms.internal:
//            zzan, zzak

class zzov
    implements Runnable
{

    final zzan zzos;
    ValueCallback zzot;
    final zzak zzou;
    final WebView zzov;

    public void run()
    {
        if (!zzov.getSettings().getJavaScriptEnabled())
        {
            break MISSING_BLOCK_LABEL_26;
        }
        zzov.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", zzot);
        return;
        Throwable throwable;
        throwable;
        zzot.onReceiveValue("");
        return;
    }

    _cls1.zzow(zzan zzan1, zzak zzak, WebView webview)
    {
        zzos = zzan1;
        zzou = zzak;
        zzov = webview;
        super();
        zzot = new ValueCallback() {

            final zzan._cls2 zzow;

            public void onReceiveValue(Object obj)
            {
                zzk((String)obj);
            }

            public void zzk(String s)
            {
                zzow.zzos.zza(zzow.zzou, zzow.zzov, s);
            }

            
            {
                zzow = zzan._cls2.this;
                super();
            }
        };
    }
}
