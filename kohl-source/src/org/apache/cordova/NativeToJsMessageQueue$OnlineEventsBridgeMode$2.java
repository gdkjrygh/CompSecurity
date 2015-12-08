// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;


// Referenced classes of package org.apache.cordova:
//            NativeToJsMessageQueue, CordovaWebView

class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public void run()
    {
        cess._mth1002(this._cls1.this, false);
        cess._mth902(this._cls1.this, true);
        NativeToJsMessageQueue.access$600(_fld0).setNetworkAvailable(true);
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
