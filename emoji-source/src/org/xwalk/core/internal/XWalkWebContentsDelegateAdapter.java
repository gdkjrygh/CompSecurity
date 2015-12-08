// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.view.KeyEvent;
import org.chromium.content.browser.ContentVideoView;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkWebContentsDelegate, XWalkContentsClient

class XWalkWebContentsDelegateAdapter extends XWalkWebContentsDelegate
{

    private XWalkContentsClient mXWalkContentsClient;

    public XWalkWebContentsDelegateAdapter(XWalkContentsClient xwalkcontentsclient)
    {
        mXWalkContentsClient = xwalkcontentsclient;
    }

    public void activateContents()
    {
        if (mXWalkContentsClient != null)
        {
            mXWalkContentsClient.onRequestFocus();
        }
    }

    public boolean addNewContents(boolean flag, boolean flag1)
    {
        return mXWalkContentsClient.onCreateWindow(flag, flag1);
    }

    public void closeContents()
    {
        if (mXWalkContentsClient != null)
        {
            mXWalkContentsClient.onCloseWindow();
        }
    }

    public void handleKeyboardEvent(KeyEvent keyevent)
    {
        if (mXWalkContentsClient != null)
        {
            mXWalkContentsClient.onUnhandledKeyEvent(keyevent);
        }
    }

    public boolean isFullscreen()
    {
        if (mXWalkContentsClient != null)
        {
            return mXWalkContentsClient.hasEnteredFullscreen();
        } else
        {
            return false;
        }
    }

    public void onLoadProgressChanged(int i)
    {
        if (mXWalkContentsClient != null)
        {
            mXWalkContentsClient.onProgressChanged(i);
        }
    }

    public void rendererResponsive()
    {
        if (mXWalkContentsClient != null)
        {
            mXWalkContentsClient.onRendererResponsive();
        }
    }

    public void rendererUnresponsive()
    {
        if (mXWalkContentsClient != null)
        {
            mXWalkContentsClient.onRendererUnresponsive();
        }
    }

    public boolean shouldOpenWithDefaultBrowser(String s)
    {
        if (mXWalkContentsClient != null)
        {
            return mXWalkContentsClient.shouldOpenWithDefaultBrowser(s);
        } else
        {
            return false;
        }
    }

    public boolean shouldOverrideRunFileChooser(int i, int j, int k, String s, boolean flag)
    {
        if (mXWalkContentsClient != null)
        {
            return mXWalkContentsClient.shouldOverrideRunFileChooser(i, j, k, s, flag);
        } else
        {
            return false;
        }
    }

    public void toggleFullscreen(boolean flag)
    {
        if (!flag)
        {
            ContentVideoView contentvideoview = ContentVideoView.getContentVideoView();
            if (contentvideoview != null)
            {
                contentvideoview.exitFullscreen(false);
            }
        }
        if (mXWalkContentsClient != null)
        {
            mXWalkContentsClient.onToggleFullscreen(flag);
        }
    }
}
