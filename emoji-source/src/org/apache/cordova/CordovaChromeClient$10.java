// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;

// Referenced classes of package org.apache.cordova:
//            CordovaChromeClient, CordovaInterface, CordovaWebView

class this._cls0
    implements Runnable
{

    final CordovaChromeClient this$0;

    public void run()
    {
        try
        {
            Thread.sleep(2000L);
            cordova.getActivity().runOnUiThread(new Runnable() {

                final CordovaChromeClient._cls10 this$1;

                public void run()
                {
                    appView.postMessage("spinner", "stop");
                }

            
            {
                this$1 = CordovaChromeClient._cls10.this;
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
        this$0 = CordovaChromeClient.this;
        super();
    }
}
