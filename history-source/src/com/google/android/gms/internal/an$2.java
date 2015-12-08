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

    _cls1.nP(an an1, ak ak, WebView webview)
    {
        nL = an1;
        nN = ak;
        nO = webview;
        super();
        nM = new ValueCallback() {

            final an._cls2 nP;

            public void k(String s)
            {
                nP.nL.a(nP.nN, nP.nO, s);
            }

            public void onReceiveValue(Object obj)
            {
                k((String)obj);
            }

            
            {
                nP = an._cls2.this;
                super();
            }
        };
    }
}
