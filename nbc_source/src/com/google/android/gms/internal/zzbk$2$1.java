// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;

// Referenced classes of package com.google.android.gms.internal:
//            zzbk, zzbh

class zzrH
    implements ValueCallback
{

    final rG zzrH;

    public void onReceiveValue(Object obj)
    {
        zzx((String)obj);
    }

    public void zzx(String s)
    {
        zzrH.rD.zza(zzrH.rF, zzrH.rG, s);
    }

    <init>(<init> <init>1)
    {
        zzrH = <init>1;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/zzbk$2

/* anonymous class */
    class zzbk._cls2
        implements Runnable
    {

        final zzbk zzrD;
        ValueCallback zzrE;
        final zzbh zzrF;
        final WebView zzrG;

        public void run()
        {
            if (!zzrG.getSettings().getJavaScriptEnabled())
            {
                break MISSING_BLOCK_LABEL_26;
            }
            zzrG.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", zzrE);
            return;
            Throwable throwable;
            throwable;
            zzrE.onReceiveValue("");
            return;
        }

            
            {
                zzrD = zzbk1;
                zzrF = zzbh;
                zzrG = webview;
                super();
                zzrE = new zzbk._cls2._cls1(this);
            }
    }

}
