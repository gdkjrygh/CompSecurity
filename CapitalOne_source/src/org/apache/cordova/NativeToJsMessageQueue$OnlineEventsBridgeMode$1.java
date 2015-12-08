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

    final line this$1;

    public void run()
    {
        if (!NativeToJsMessageQueue.access$500(_fld0).isEmpty())
        {
            this._cls1 _lcls1 = this._cls1.this;
            boolean flag;
            if (!line)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            _lcls1.line = flag;
            NativeToJsMessageQueue.access$300(_fld0).setNetworkAvailable(line);
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
