// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.DialogInterface;
import android.os.Handler;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelWebView, AdMarvelInternalWebView

class val.adMarvelInternalWebView
    implements android.content.ener
{

    final _cls1.val.callback this$1;
    private final AdMarvelInternalWebView val$adMarvelInternalWebView;
    private final String val$callback;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (val$callback != null)
        {
            ess._mth0(this._cls1.this).post(new Runnable() {

                final AdMarvelWebView.InnerJS._cls11 this$2;
                private final AdMarvelInternalWebView val$adMarvelInternalWebView;
                private final String val$callback;

                public void run()
                {
                    adMarvelInternalWebView.loadUrl((new StringBuilder("javascript:")).append(callback).append("(\"NO\")").toString());
                }

            
            {
                this$2 = AdMarvelWebView.InnerJS._cls11.this;
                adMarvelInternalWebView = admarvelinternalwebview;
                callback = s;
                super();
            }
            });
        }
        dialoginterface.cancel();
    }

    _cls1.val.callback()
    {
        this$1 = final_callback1;
        val$callback = s;
        val$adMarvelInternalWebView = AdMarvelInternalWebView.this;
        super();
    }
}
