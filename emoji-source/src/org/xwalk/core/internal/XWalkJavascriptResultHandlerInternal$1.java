// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;


// Referenced classes of package org.xwalk.core.internal:
//            XWalkJavascriptResultHandlerInternal, XWalkContentsClientBridge

class val.promptResult
    implements Runnable
{

    final XWalkJavascriptResultHandlerInternal this$0;
    final String val$promptResult;

    public void run()
    {
        if (XWalkJavascriptResultHandlerInternal.access$000(XWalkJavascriptResultHandlerInternal.this) != null)
        {
            XWalkJavascriptResultHandlerInternal.access$000(XWalkJavascriptResultHandlerInternal.this).confirmJsResult(XWalkJavascriptResultHandlerInternal.access$100(XWalkJavascriptResultHandlerInternal.this), val$promptResult);
        }
        XWalkJavascriptResultHandlerInternal.access$002(XWalkJavascriptResultHandlerInternal.this, null);
    }

    ()
    {
        this$0 = final_xwalkjavascriptresulthandlerinternal;
        val$promptResult = String.this;
        super();
    }
}
