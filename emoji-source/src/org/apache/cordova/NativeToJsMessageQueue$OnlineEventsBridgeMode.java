// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;
import java.util.LinkedList;

// Referenced classes of package org.apache.cordova:
//            NativeToJsMessageQueue, CordovaInterface, CordovaWebView

private class <init> extends <init>
{

    private boolean ignoreNextFlush;
    private boolean online;
    final Runnable resetNetworkRunnable;
    final NativeToJsMessageQueue this$0;
    final Runnable toggleNetworkRunnable;

    void notifyOfFlush(boolean flag)
    {
        if (flag && !ignoreNextFlush)
        {
            if (!online)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            online = flag;
        }
    }

    void onNativeToJsMessageAvailable()
    {
        NativeToJsMessageQueue.access$700(NativeToJsMessageQueue.this).getActivity().runOnUiThread(toggleNetworkRunnable);
    }

    void reset()
    {
        NativeToJsMessageQueue.access$700(NativeToJsMessageQueue.this).getActivity().runOnUiThread(resetNetworkRunnable);
    }



/*
    static boolean access$1002(_cls2 _pcls2, boolean flag)
    {
        _pcls2.online = flag;
        return flag;
    }

*/


/*
    static boolean access$902(online online1, boolean flag)
    {
        online1.ignoreNextFlush = flag;
        return flag;
    }

*/

    private _cls2.this._cls1()
    {
        this$0 = NativeToJsMessageQueue.this;
        super(NativeToJsMessageQueue.this, null);
        toggleNetworkRunnable = new Runnable() {

            final NativeToJsMessageQueue.OnlineEventsBridgeMode this$1;

            public void run()
            {
                if (!NativeToJsMessageQueue.access$800(this$0).isEmpty())
                {
                    ignoreNextFlush = false;
                    NativeToJsMessageQueue.access$600(this$0).setNetworkAvailable(online);
                }
            }

            
            {
                this$1 = NativeToJsMessageQueue.OnlineEventsBridgeMode.this;
                super();
            }
        };
        resetNetworkRunnable = new Runnable() {

            final NativeToJsMessageQueue.OnlineEventsBridgeMode this$1;

            public void run()
            {
                online = false;
                ignoreNextFlush = true;
                NativeToJsMessageQueue.access$600(this$0).setNetworkAvailable(true);
            }

            
            {
                this$1 = NativeToJsMessageQueue.OnlineEventsBridgeMode.this;
                super();
            }
        };
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
