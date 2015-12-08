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
        String s = NativeToJsMessageQueue.access$500(_fld0);
        if (s != null)
        {
            NativeToJsMessageQueue.access$600(_fld0).loadUrlNow((new StringBuilder()).append("javascript:").append(s).toString());
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
