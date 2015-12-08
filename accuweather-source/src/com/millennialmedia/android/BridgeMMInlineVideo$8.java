// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Callable;

// Referenced classes of package com.millennialmedia.android:
//            BridgeMMInlineVideo, MMWebView, MMLayout, MMJSResponse

class val.parameters
    implements Callable
{

    final BridgeMMInlineVideo this$0;
    final Map val$parameters;

    public MMJSResponse call()
    {
        Object obj = (MMWebView)mmWebViewRef.get();
        if (obj != null)
        {
            obj = ((MMWebView) (obj)).getMMLayout();
            String s = (String)val$parameters.get("streamVideoURI");
            if (obj != null && s != null)
            {
                ((MMLayout) (obj)).setVideoSource(s);
                return MMJSResponse.responseWithSuccess();
            }
        }
        return MMJSResponse.responseWithError();
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = final_bridgemminlinevideo;
        val$parameters = Map.this;
        super();
    }
}
