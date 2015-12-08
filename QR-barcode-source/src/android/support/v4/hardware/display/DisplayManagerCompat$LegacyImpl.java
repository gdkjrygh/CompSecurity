// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.hardware.display;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;

// Referenced classes of package android.support.v4.hardware.display:
//            DisplayManagerCompat

private static class mWindowManager extends DisplayManagerCompat
{

    private final WindowManager mWindowManager;

    public Display getDisplay(int i)
    {
        Display display = mWindowManager.getDefaultDisplay();
        if (display.getDisplayId() == i)
        {
            return display;
        } else
        {
            return null;
        }
    }

    public Display[] getDisplays()
    {
        return (new Display[] {
            mWindowManager.getDefaultDisplay()
        });
    }

    public Display[] getDisplays(String s)
    {
        if (s == null)
        {
            return getDisplays();
        } else
        {
            return new Display[0];
        }
    }

    public I(Context context)
    {
        mWindowManager = (WindowManager)context.getSystemService("window");
    }
}
