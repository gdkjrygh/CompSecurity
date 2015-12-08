// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.webkit.ValueCallback;
import org.chromium.content_public.browser.JavaScriptCallback;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkContent

class val.fCallback
    implements JavaScriptCallback
{

    final XWalkContent this$0;
    final ValueCallback val$fCallback;

    public void handleJavaScriptResult(String s)
    {
        val$fCallback.onReceiveValue(s);
    }

    aScriptCallback()
    {
        this$0 = final_xwalkcontent;
        val$fCallback = ValueCallback.this;
        super();
    }
}
