// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;

// Referenced classes of package com.google.android.gms.internal:
//            an, ak

class nF
    implements ValueCallback
{

    final k nF;

    public void k(String s)
    {
        nF..a(nF., nF., s);
    }

    public void onReceiveValue(Object obj)
    {
        k((String)obj);
    }

    <init>(<init> <init>1)
    {
        nF = <init>1;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/an$2

/* anonymous class */
    class an._cls2
        implements Runnable
    {

        final an nB;
        ValueCallback nC;
        final ak nD;
        final WebView nE;

        public void run()
        {
            if (nE.getSettings().getJavaScriptEnabled())
            {
                nE.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", nC);
            }
        }

            
            {
                nB = an1;
                nD = ak;
                nE = webview;
                super();
                nC = new an._cls2._cls1(this);
            }
    }

}
