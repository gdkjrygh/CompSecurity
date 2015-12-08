// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkContentsClientBridge, XWalkViewInternal, XWalkNavigationHistoryInternal

class this._cls0 extends Handler
{

    final XWalkContentsClientBridge this$0;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            throw new IllegalStateException();

        case 100: // 'd'
            message = (XWalkViewInternal)message.obj;
            if (message == XWalkContentsClientBridge.access$100(XWalkContentsClientBridge.this))
            {
                throw new IllegalArgumentException("Parent XWalkView cannot host it's own popup window");
            }
            if (message != null && message.getNavigationHistory().size() != 0)
            {
                throw new IllegalArgumentException("New WebView for popup window must not have been previously navigated.");
            } else
            {
                XWalkContentsClientBridge.access$100(XWalkContentsClientBridge.this).completeWindowCreation(message);
                return;
            }

        case 101: // 'e'
            message = (String)message.obj;
            XWalkContentsClientBridge.access$300(XWalkContentsClientBridge.this, XWalkContentsClientBridge.access$200(XWalkContentsClientBridge.this), message);
            return;
        }
    }

    al()
    {
        this$0 = XWalkContentsClientBridge.this;
        super();
    }
}
