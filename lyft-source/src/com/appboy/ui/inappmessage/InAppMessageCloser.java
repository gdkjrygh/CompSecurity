// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import com.appboy.models.IInAppMessage;

// Referenced classes of package com.appboy.ui.inappmessage:
//            InAppMessageViewWrapper

public class InAppMessageCloser
{

    private InAppMessageViewWrapper mInAppMessageViewWrapper;

    public InAppMessageCloser(InAppMessageViewWrapper inappmessageviewwrapper)
    {
        mInAppMessageViewWrapper = inappmessageviewwrapper;
    }

    public void close(boolean flag)
    {
        if (flag)
        {
            mInAppMessageViewWrapper.getInAppMessage().setAnimateOut(true);
        } else
        {
            mInAppMessageViewWrapper.getInAppMessage().setAnimateOut(false);
        }
        mInAppMessageViewWrapper.close();
    }
}
