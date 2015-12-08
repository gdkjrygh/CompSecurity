// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import org.chromium.components.navigation_interception.InterceptNavigationDelegate;
import org.chromium.components.navigation_interception.NavigationParams;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkContentsClientBridge, XWalkNavigationHandler, XWalkContentsClient, XWalkContentsClientCallbackHelper

private class mContentsClient
    implements InterceptNavigationDelegate
{

    private XWalkContentsClient mContentsClient;
    final XWalkContentsClientBridge this$0;

    public boolean shouldIgnoreNavigation(NavigationParams navigationparams)
    {
        String s = navigationparams.url;
        boolean flag;
        if (shouldOverrideUrlLoading(s) || XWalkContentsClientBridge.access$000(XWalkContentsClientBridge.this) != null && XWalkContentsClientBridge.access$000(XWalkContentsClientBridge.this).handleNavigation(navigationparams))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            mContentsClient.getCallbackHelper().postOnPageStarted(s);
        }
        return flag;
    }

    public (XWalkContentsClient xwalkcontentsclient)
    {
        this$0 = XWalkContentsClientBridge.this;
        super();
        mContentsClient = xwalkcontentsclient;
    }
}
