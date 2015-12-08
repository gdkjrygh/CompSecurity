// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.DialogInterface;
import android.os.Handler;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelWebView, AdMarvelInternalWebView

class val.callback
    implements Runnable
{

    final val.callback this$2;
    private final AdMarvelInternalWebView val$adMarvelInternalWebView;
    private final String val$callback;

    public void run()
    {
        val$adMarvelInternalWebView.loadUrl((new StringBuilder("javascript:")).append(val$callback).append("(\"NO\")").toString());
    }

    l.adMarvelInternalWebView()
    {
        this$2 = final_admarvelinternalwebview;
        val$adMarvelInternalWebView = admarvelinternalwebview1;
        val$callback = String.this;
        super();
    }

    // Unreferenced inner class com/admarvel/android/ads/AdMarvelWebView$InnerJS$11

/* anonymous class */
    class AdMarvelWebView.InnerJS._cls11
        implements android.content.DialogInterface.OnClickListener
    {

        final AdMarvelWebView.InnerJS this$1;
        private final AdMarvelInternalWebView val$adMarvelInternalWebView;
        private final String val$callback;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            if (callback != null)
            {
                AdMarvelWebView.InnerJS.access$0(AdMarvelWebView.InnerJS.this).post(callback. new AdMarvelWebView.InnerJS._cls11._cls1());
            }
            dialoginterface.cancel();
        }

            
            {
                this$1 = final_innerjs;
                callback = s;
                adMarvelInternalWebView = AdMarvelInternalWebView.this;
                super();
            }
    }

}
