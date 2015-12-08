// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import java.util.LinkedList;

// Referenced classes of package org.apache.cordova:
//            NativeToJsMessageQueue, CordovaWebView

class this._cls1
    implements Runnable
{

    final this._cls1 this$1;

    public void run()
    {
        if (!NativeToJsMessageQueue.access$800(_fld0).isEmpty())
        {
            cess._mth902(this._cls1.this, false);
            NativeToJsMessageQueue.access$600(_fld0).setNetworkAvailable(cess._mth1000(this._cls1.this));
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
