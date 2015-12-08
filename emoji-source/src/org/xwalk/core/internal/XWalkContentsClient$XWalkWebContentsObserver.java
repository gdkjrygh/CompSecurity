// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import org.chromium.content.browser.WebContentsObserverAndroid;
import org.chromium.content_public.browser.WebContents;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkContentsClient, ErrorCodeConversionHelper

public class this._cls0 extends WebContentsObserverAndroid
{

    final XWalkContentsClient this$0;

    public void didFailLoad(boolean flag, boolean flag1, int i, String s, String s1)
    {
        if (i == -3 || !flag1)
        {
            return;
        } else
        {
            onReceivedError(ErrorCodeConversionHelper.convertErrorCode(i), s, s1);
            return;
        }
    }

    public void didFinishLoad(long l, String s, boolean flag)
    {
    }

    public void didNavigateAnyFrame(String s, String s1, boolean flag)
    {
        doUpdateVisitedHistory(s, flag);
    }

    public void didStopLoading(String s)
    {
        onPageFinished(s);
    }

    public (WebContents webcontents)
    {
        this$0 = XWalkContentsClient.this;
        super(webcontents);
    }
}
