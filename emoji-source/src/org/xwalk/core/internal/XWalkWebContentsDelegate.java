// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.view.KeyEvent;
import org.chromium.components.web_contents_delegate_android.WebContentsDelegateAndroid;

abstract class XWalkWebContentsDelegate extends WebContentsDelegateAndroid
{

    XWalkWebContentsDelegate()
    {
    }

    public abstract void activateContents();

    public abstract boolean addNewContents(boolean flag, boolean flag1);

    public abstract void closeContents();

    public abstract void handleKeyboardEvent(KeyEvent keyevent);

    public boolean isFullscreen()
    {
        return false;
    }

    public abstract void rendererResponsive();

    public abstract void rendererUnresponsive();

    public abstract boolean shouldOpenWithDefaultBrowser(String s);

    public abstract boolean shouldOverrideRunFileChooser(int i, int j, int k, String s, boolean flag);

    public void toggleFullscreen(boolean flag)
    {
    }

    public void updatePreferredSize(int i, int j)
    {
    }
}
