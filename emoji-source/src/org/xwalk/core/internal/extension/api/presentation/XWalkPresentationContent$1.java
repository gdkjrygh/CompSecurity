// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.presentation;

import org.xwalk.core.internal.XWalkUIClientInternal;
import org.xwalk.core.internal.XWalkViewInternal;

// Referenced classes of package org.xwalk.core.internal.extension.api.presentation:
//            XWalkPresentationContent

class this._cls0 extends XWalkUIClientInternal
{

    final XWalkPresentationContent this$0;

    public void onJavascriptCloseWindow(XWalkViewInternal xwalkviewinternal)
    {
        XWalkPresentationContent.access$002(XWalkPresentationContent.this, -1);
        XWalkPresentationContent.access$100(XWalkPresentationContent.this);
    }

    public void onPageLoadStopped(XWalkViewInternal xwalkviewinternal, String s, org.xwalk.core.internal.tatusInternal tatusinternal)
    {
        if (tatusinternal == org.xwalk.core.internal.tatusInternal.FINISHED)
        {
            XWalkPresentationContent.access$002(XWalkPresentationContent.this, XWalkPresentationContent.access$200(XWalkPresentationContent.this).getContentID());
            XWalkPresentationContent.access$300(XWalkPresentationContent.this);
        }
    }

    (XWalkViewInternal xwalkviewinternal)
    {
        this$0 = XWalkPresentationContent.this;
        super(xwalkviewinternal);
    }
}
