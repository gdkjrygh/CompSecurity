// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;

// Referenced classes of package org.apache.cordova:
//            NativeToJsMessageQueue, CordovaInterface, CordovaWebView

private class <init> extends <init>
{

    final Runnable runnable;
    final NativeToJsMessageQueue this$0;

    void onNativeToJsMessageAvailable()
    {
        NativeToJsMessageQueue.access$700(NativeToJsMessageQueue.this).getActivity().runOnUiThread(runnable);
    }

    private _cls1.this._cls1()
    {
        this$0 = NativeToJsMessageQueue.this;
        super(NativeToJsMessageQueue.this, null);
        runnable = new Runnable() {

            final NativeToJsMessageQueue.LoadUrlBridgeMode this$1;

            public void run()
            {
                String s = NativeToJsMessageQueue.access$500(this$0);
                if (s != null)
                {
                    NativeToJsMessageQueue.access$600(this$0).loadUrlNow((new StringBuilder()).append("javascript:").append(s).toString());
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
