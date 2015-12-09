// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;
import java.util.LinkedList;
import org.apache.cordova.api.CordovaInterface;

// Referenced classes of package org.apache.cordova:
//            NativeToJsMessageQueue, CordovaWebView

private class online
    implements online
{

    boolean online;
    final Runnable runnable = new Runnable() {

        final NativeToJsMessageQueue.OnlineEventsBridgeMode this$1;

        public void run()
        {
            if (!NativeToJsMessageQueue.access$500(this$0).isEmpty())
            {
                NativeToJsMessageQueue.OnlineEventsBridgeMode onlineeventsbridgemode = NativeToJsMessageQueue.OnlineEventsBridgeMode.this;
                boolean flag;
                if (!online)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                onlineeventsbridgemode.online = flag;
                NativeToJsMessageQueue.access$300(this$0).setNetworkAvailable(online);
            }
        }

            
            {
                this$1 = NativeToJsMessageQueue.OnlineEventsBridgeMode.this;
                super();
            }
    };
    final NativeToJsMessageQueue this$0;

    public void onNativeToJsMessageAvailable()
    {
        NativeToJsMessageQueue.access$400(NativeToJsMessageQueue.this).getActivity().runOnUiThread(runnable);
    }

    _cls1.this._cls1()
    {
        this$0 = NativeToJsMessageQueue.this;
        super();
        online = true;
        NativeToJsMessageQueue.access$300(NativeToJsMessageQueue.this).setNetworkAvailable(true);
    }
}
