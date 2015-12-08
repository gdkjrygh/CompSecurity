// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import org.chromium.base.ThreadUtils;
import org.chromium.content_public.browser.WebContents;

public abstract class WebContentsObserverAndroid
{

    private long mNativeWebContentsObserverAndroid;

    public WebContentsObserverAndroid(WebContents webcontents)
    {
        ThreadUtils.assertOnUiThread();
        mNativeWebContentsObserverAndroid = nativeInit(webcontents);
    }

    private native void nativeDestroy(long l);

    private native long nativeInit(WebContents webcontents);

    public void detachFromWebContents()
    {
        if (mNativeWebContentsObserverAndroid != 0L)
        {
            nativeDestroy(mNativeWebContentsObserverAndroid);
            mNativeWebContentsObserverAndroid = 0L;
        }
    }

    public void didAttachInterstitialPage()
    {
    }

    public void didChangeThemeColor(int i)
    {
    }

    public void didCommitProvisionalLoadForFrame(long l, boolean flag, String s, int i)
    {
    }

    public void didDetachInterstitialPage()
    {
    }

    public void didFailLoad(boolean flag, boolean flag1, int i, String s, String s1)
    {
    }

    public void didFinishLoad(long l, String s, boolean flag)
    {
    }

    public void didFirstVisuallyNonEmptyPaint()
    {
    }

    public void didNavigateAnyFrame(String s, String s1, boolean flag)
    {
    }

    public void didNavigateMainFrame(String s, String s1, boolean flag, boolean flag1)
    {
    }

    public void didNavigateMainFrame(String s, String s1, boolean flag, boolean flag1, int i)
    {
        didNavigateMainFrame(s, s1, flag, flag1);
    }

    public void didStartLoading(String s)
    {
    }

    public void didStartProvisionalLoadForFrame(long l, long l1, boolean flag, String s, boolean flag1, 
            boolean flag2)
    {
    }

    public void didStopLoading(String s)
    {
    }

    public void documentLoadedInFrame(long l)
    {
    }

    public void navigationEntryCommitted()
    {
    }

    public void renderProcessGone(boolean flag)
    {
    }
}
