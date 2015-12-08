// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;
import org.apache.cordova.api.CordovaInterface;

// Referenced classes of package org.apache.cordova:
//            NativeToJsMessageQueue, CordovaWebView

private class <init>
    implements <init>
{

    final Runnable runnable;
    final NativeToJsMessageQueue this$0;

    public void onNativeToJsMessageAvailable()
    {
        NativeToJsMessageQueue.access$400(NativeToJsMessageQueue.this).getActivity().runOnUiThread(runnable);
    }

    private _cls1.this._cls1()
    {
        this$0 = NativeToJsMessageQueue.this;
        super();
        runnable = new Runnable() {

            final NativeToJsMessageQueue.LoadUrlBridgeMode this$1;

            public void run()
            {
                String s = NativeToJsMessageQueue.access$200(this$0);
                if (s != null)
                {
                    NativeToJsMessageQueue.access$300(this$0).loadUrlNow((new StringBuilder()).append("javascript:").append(s).toString());
                }
            }

            
            {
                this$1 = NativeToJsMessageQueue.LoadUrlBridgeMode.this;
                super();
            }
        };
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
