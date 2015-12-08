// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.webkit.ValueCallback;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkContentsClientBridge

class val.id
    implements ValueCallback
{

    final XWalkContentsClientBridge this$0;
    final int val$id;

    public void onReceiveValue(Boolean boolean1)
    {
        XWalkContentsClientBridge.access$700(XWalkContentsClientBridge.this, boolean1.booleanValue(), val$id);
    }

    public volatile void onReceiveValue(Object obj)
    {
        onReceiveValue((Boolean)obj);
    }

    _cls9()
    {
        this$0 = final_xwalkcontentsclientbridge;
        val$id = I.this;
        super();
    }
}
