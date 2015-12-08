// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.components.web_contents_delegate_android;

import android.view.KeyEvent;
import org.chromium.content.browser.ContentViewCore;

public class WebContentsDelegateAndroid
{

    public static final int INVALIDATE_TYPE_LOAD = 4;
    public static final int INVALIDATE_TYPE_TAB = 2;
    public static final int INVALIDATE_TYPE_TITLE = 8;
    public static final int INVALIDATE_TYPE_URL = 1;
    public static final int LOG_LEVEL_ERROR = 3;
    public static final int LOG_LEVEL_LOG = 1;
    public static final int LOG_LEVEL_TIP = 0;
    public static final int LOG_LEVEL_WARNING = 2;
    private int mMostRecentProgress;

    public WebContentsDelegateAndroid()
    {
        mMostRecentProgress = 100;
    }

    private final void notifyLoadProgressChanged(double d)
    {
        mMostRecentProgress = (int)(100D * d);
        onLoadProgressChanged(mMostRecentProgress);
    }

    public void activateContents()
    {
    }

    public boolean addMessageToConsole(int i, String s, int j, String s1)
    {
        return false;
    }

    public void closeContents()
    {
    }

    public int getMostRecentProgress()
    {
        return mMostRecentProgress;
    }

    public void handleKeyboardEvent(KeyEvent keyevent)
    {
    }

    public boolean isFullscreenForTabOrPending()
    {
        return false;
    }

    public void navigationStateChanged(int i)
    {
    }

    public void onLoadProgressChanged(int i)
    {
    }

    public void onLoadStarted()
    {
    }

    public void onLoadStopped()
    {
    }

    public void onUpdateUrl(String s)
    {
    }

    public void openNewTab(String s, String s1, byte abyte0[], int i, boolean flag)
    {
    }

    public void rendererResponsive()
    {
    }

    public void rendererUnresponsive()
    {
    }

    public void showRepostFormWarningDialog(ContentViewCore contentviewcore)
    {
    }

    public boolean takeFocus(boolean flag)
    {
        return false;
    }

    public void toggleFullscreenModeForTab(boolean flag)
    {
    }

    public void visibleSSLStateChanged()
    {
    }
}
