// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import org.chromium.content_public.browser.WebContents;

// Referenced classes of package org.chromium.content.browser:
//            WebContentsObserverAndroid, ContentViewCore

class  extends WebContentsObserverAndroid
{

    final ContentViewCore this$0;

    public void didNavigateMainFrame(String s, String s1, boolean flag, boolean flag1)
    {
        if (!flag)
        {
            return;
        } else
        {
            ContentViewCore.access$800(ContentViewCore.this);
            ContentViewCore.access$900(ContentViewCore.this);
            ContentViewCore.access$1000(ContentViewCore.this);
            return;
        }
    }

    public void renderProcessGone(boolean flag)
    {
        ContentViewCore.access$800(ContentViewCore.this);
        ContentViewCore.access$900(ContentViewCore.this);
    }

    (WebContents webcontents)
    {
        this$0 = ContentViewCore.this;
        super(webcontents);
    }
}
