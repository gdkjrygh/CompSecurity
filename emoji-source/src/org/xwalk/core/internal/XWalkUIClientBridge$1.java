// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.webkit.ValueCallback;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkUIClientBridge, ReflectionHelper, XWalkViewBridge

class val.callbackFinal
    implements ValueCallback
{

    final XWalkUIClientBridge this$0;
    final ValueCallback val$callbackFinal;

    public void onReceiveValue(Object obj)
    {
        val$callbackFinal.onReceiveValue((XWalkViewBridge)ReflectionHelper.getBridgeOrWrapper(obj));
    }

    ()
    {
        this$0 = final_xwalkuiclientbridge;
        val$callbackFinal = ValueCallback.this;
        super();
    }
}
