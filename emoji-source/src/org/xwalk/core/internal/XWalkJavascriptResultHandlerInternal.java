// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import org.chromium.base.ThreadUtils;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkJavascriptResultInternal, XWalkContentsClientBridge

public class XWalkJavascriptResultHandlerInternal
    implements XWalkJavascriptResultInternal
{

    private XWalkContentsClientBridge mBridge;
    private final int mId;

    XWalkJavascriptResultHandlerInternal()
    {
        mBridge = null;
        mId = -1;
    }

    XWalkJavascriptResultHandlerInternal(XWalkContentsClientBridge xwalkcontentsclientbridge, int i)
    {
        mBridge = xwalkcontentsclientbridge;
        mId = i;
    }

    public void cancel()
    {
        ThreadUtils.runOnUiThread(new Runnable() {

            final XWalkJavascriptResultHandlerInternal this$0;

            public void run()
            {
                if (mBridge != null)
                {
                    mBridge.cancelJsResult(mId);
                }
                mBridge = null;
            }

            
            {
                this$0 = XWalkJavascriptResultHandlerInternal.this;
                super();
            }
        });
    }

    public void confirm()
    {
        confirmWithResult(null);
    }

    public void confirmWithResult(final String promptResult)
    {
        ThreadUtils.runOnUiThread(new Runnable() {

            final XWalkJavascriptResultHandlerInternal this$0;
            final String val$promptResult;

            public void run()
            {
                if (mBridge != null)
                {
                    mBridge.confirmJsResult(mId, promptResult);
                }
                mBridge = null;
            }

            
            {
                this$0 = XWalkJavascriptResultHandlerInternal.this;
                promptResult = s;
                super();
            }
        });
    }



/*
    static XWalkContentsClientBridge access$002(XWalkJavascriptResultHandlerInternal xwalkjavascriptresulthandlerinternal, XWalkContentsClientBridge xwalkcontentsclientbridge)
    {
        xwalkjavascriptresulthandlerinternal.mBridge = xwalkcontentsclientbridge;
        return xwalkcontentsclientbridge;
    }

*/

}
