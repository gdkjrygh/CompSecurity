// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;

// Referenced classes of package org.apache.cordova:
//            CordovaWebViewClient, CordovaInterface, CordovaWebView

class this._cls0
    implements Runnable
{

    final CordovaWebViewClient this$0;

    public void run()
    {
        try
        {
            Thread.sleep(2000L);
            cordova.getActivity().runOnUiThread(new Runnable() {

                final CordovaWebViewClient._cls1 this$1;

                public void run()
                {
                    appView.postMessage("spinner", "stop");
                }

            
            {
                this$1 = CordovaWebViewClient._cls1.this;
                super();
            }
            });
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }

    _cls1.this._cls1()
    {
        this$0 = CordovaWebViewClient.this;
        super();
    }
}
