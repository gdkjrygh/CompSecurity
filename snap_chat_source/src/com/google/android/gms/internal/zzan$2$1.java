// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;

// Referenced classes of package com.google.android.gms.internal:
//            zzan, zzak

class zzow
    implements ValueCallback
{

    final ov zzow;

    public void onReceiveValue(Object obj)
    {
        zzk((String)obj);
    }

    public void zzk(String s)
    {
        zzow.os.zza(zzow.ou, zzow.ov, s);
    }

    <init>(<init> <init>1)
    {
        zzow = <init>1;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/zzan$2

/* anonymous class */
    class zzan._cls2
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

            
            {
                zzos = zzan1;
                zzou = zzak;
                zzov = webview;
                super();
                zzot = new zzan._cls2._cls1(this);
            }
    }

}
