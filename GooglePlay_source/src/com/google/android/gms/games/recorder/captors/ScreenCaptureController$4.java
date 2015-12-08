// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.captors;

import android.hardware.display.VirtualDisplay;
import android.view.Display;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.GamesLog;

// Referenced classes of package com.google.android.gms.games.recorder.captors:
//            ScreenCaptureController

final class this._cls0
    implements android.hardware.display.ener
{

    final ScreenCaptureController this$0;

    public final void onDisplayAdded(int i)
    {
    }

    public final void onDisplayChanged(int i)
    {
    }

    public final void onDisplayRemoved(int i)
    {
        Preconditions.checkNotMainThread("DisplayListener onDisplayRemoved called on main thread");
        Display display;
        if (mVirtualDisplay != null)
        {
            if ((display = mVirtualDisplay.getDisplay()) != null && mIsVirtualDisplayActive && display.getDisplayId() == i)
            {
                GamesLog.e("ScreenCaptureController", (new StringBuilder("Unexpectedly lost the virtual display: ")).append(i).toString());
                notifyErrorStatus(9004);
                return;
            }
        }
    }

    ()
    {
        this$0 = ScreenCaptureController.this;
        super();
    }
}
