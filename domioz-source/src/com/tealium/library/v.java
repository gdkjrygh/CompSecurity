// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Locale;

// Referenced classes of package com.tealium.library:
//            E, d, s, B, 
//            u

final class v extends WebViewClient
{

    private final E a;
    private final s b;
    private final boolean c;

    public v(Tealium.Config config, s s1)
    {
        b = s1;
        c = config.d();
        a = new E(config);
        d.a(a);
    }

    public final void onLoadResource(WebView webview, String s1)
    {
        super.onLoadResource(webview, s1);
    }

    public final void onPageFinished(WebView webview, String s1)
    {
        super.onPageFinished(webview, s1);
        d.a(false, "(function(){var e=document.childNodes;if(e.length>0){var t=0;var n=46;var r=e[0].data;if(r!=undefined&&r.length>n+12){var i=r.substring(n,n+4);var s=r.substring(n+4,n+6);var o=r.substring(n+6,n+8);var u=r.substring(n+8,n+10);var a=r.substring(n+10,n+12);t=Date.parse(s+'/'+o+'/'+i+' '+u+':'+a+' UTC');if(isNaN(t)){t=0}}}var f=document.cookie.indexOf('trace_id=');var l='';if(f>=0){l=document.cookie.substring(f+9,f+14)}var c=typeof utag==='object'?/\"load\":1/.test(JSON.stringify(utag.loader.cfg)):false;var h=typeof mps==='undefined'?'':JSON.stringify(mps);var p=typeof nativeAppLiveHandlerData==='undefined'?'':JSON.stringify(nativeAppLiveHandlerData);if(typeof WCC==='undefined'){console.log({tags:c,published:t,pub_settings:h,config:p,trace_id:l})}else{WCC.receivedConfig(c,t,h,p,l)}})()");
    }

    public final void onReceivedError(WebView webview, int i, String s1, String s2)
    {
        super.onReceivedError(webview, i, s1, s2);
        b.a(H.a.c);
        b.a(System.currentTimeMillis());
    }

    public final void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        if (!c)
        {
            sslerrorhandler.proceed();
        }
        super.onReceivedSslError(webview, sslerrorhandler, sslerror);
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s1)
    {
        if (B.a(s1))
        {
            try
            {
                a.a(new B(s1));
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                u.a(webview);
                return true;
            }
            return true;
        } else
        {
            u.d(String.format(Locale.ROOT, "Suppressed a tag trying to open <%s>, please inspect your tealiumiq settings.", new Object[] {
                s1
            }));
            return true;
        }
    }
}
