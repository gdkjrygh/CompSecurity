// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;

// Referenced classes of package com.google.android.gms.internal:
//            an, ak

class _cls1.k
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

    _cls1.nF(an an1, ak ak, WebView webview)
    {
        nB = an1;
        nD = ak;
        nE = webview;
        super();
        nC = new ValueCallback() {

            final an._cls2 nF;

            public void k(String s)
            {
                nF.nB.a(nF.nD, nF.nE, s);
            }

            public void onReceiveValue(Object obj)
            {
                k((String)obj);
            }

            
            {
                nF = an._cls2.this;
                super();
            }
        };
    }
}
