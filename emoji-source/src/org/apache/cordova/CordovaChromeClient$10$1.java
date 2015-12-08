// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;

// Referenced classes of package org.apache.cordova:
//            CordovaChromeClient, CordovaWebView, CordovaInterface

class this._cls1
    implements Runnable
{

    final e this$1;

    public void run()
    {
        appView.postMessage("spinner", "stop");
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class org/apache/cordova/CordovaChromeClient$10

/* anonymous class */
    class CordovaChromeClient._cls10
        implements Runnable
    {

        final CordovaChromeClient this$0;

        public void run()
        {
            try
            {
                Thread.sleep(2000L);
                cordova.getActivity().runOnUiThread(new CordovaChromeClient._cls10._cls1());
                return;
            }
            catch (InterruptedException interruptedexception)
            {
                return;
            }
        }

            
            {
                this$0 = CordovaChromeClient.this;
                super();
            }
    }

}
