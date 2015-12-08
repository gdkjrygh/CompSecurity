// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;

// Referenced classes of package com.google.android.gms.internal:
//            an, ak

class nP
    implements ValueCallback
{

    final k nP;

    public void k(String s)
    {
        nP..a(nP., nP., s);
    }

    public void onReceiveValue(Object obj)
    {
        k((String)obj);
    }

    <init>(<init> <init>1)
    {
        nP = <init>1;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/an$2

/* anonymous class */
    class an._cls2
        implements Runnable
    {

        final an nL;
        ValueCallback nM;
        final ak nN;
        final WebView nO;

        public void run()
        {
            if (nO.getSettings().getJavaScriptEnabled())
            {
                nO.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", nM);
            }
        }

            
            {
                nL = an1;
                nN = ak;
                nO = webview;
                super();
                nM = new an._cls2._cls1(this);
            }
    }

}
