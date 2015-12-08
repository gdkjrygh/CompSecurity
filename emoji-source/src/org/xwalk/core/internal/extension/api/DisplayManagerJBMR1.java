// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import java.util.ArrayList;

// Referenced classes of package org.xwalk.core.internal.extension.api:
//            XWalkDisplayManager

public class DisplayManagerJBMR1 extends XWalkDisplayManager
    implements android.hardware.display.DisplayManager.DisplayListener
{

    private DisplayManager mDisplayManager;

    public DisplayManagerJBMR1(Context context)
    {
        mDisplayManager = (DisplayManager)context.getSystemService("display");
    }

    public Display getDisplay(int i)
    {
        return mDisplayManager.getDisplay(i);
    }

    public Display[] getDisplays()
    {
        return mDisplayManager.getDisplays();
    }

    public Display[] getPresentationDisplays()
    {
        return mDisplayManager.getDisplays("android.hardware.display.category.PRESENTATION");
    }

    public void onDisplayAdded(int i)
    {
        notifyDisplayAdded(i);
    }

    public void onDisplayChanged(int i)
    {
        notifyDisplayChanged(i);
    }

    public void onDisplayRemoved(int i)
    {
        notifyDisplayRemoved(i);
    }

    public void registerDisplayListener(XWalkDisplayManager.DisplayListener displaylistener)
    {
        super.registerDisplayListener(displaylistener);
        if (mListeners.size() == 1)
        {
            mDisplayManager.registerDisplayListener(this, null);
        }
    }

    public void unregisterDisplayListener(XWalkDisplayManager.DisplayListener displaylistener)
    {
        super.unregisterDisplayListener(displaylistener);
        if (mListeners.size() == 0)
        {
            mDisplayManager.unregisterDisplayListener(this);
        }
    }
}
