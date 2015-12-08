// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.os.Handler;
import android.os.Message;
import android.webkit.ValueCallback;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkContentsClientBridge, XWalkViewInternal

class this._cls0
    implements ValueCallback
{

    final XWalkContentsClientBridge this$0;

    public volatile void onReceiveValue(Object obj)
    {
        onReceiveValue((XWalkViewInternal)obj);
    }

    public void onReceiveValue(XWalkViewInternal xwalkviewinternal)
    {
        XWalkContentsClientBridge.access$400(XWalkContentsClientBridge.this).obtainMessage(100, xwalkviewinternal).sendToTarget();
    }

    _cls9()
    {
        this$0 = XWalkContentsClientBridge.this;
        super();
    }
}
