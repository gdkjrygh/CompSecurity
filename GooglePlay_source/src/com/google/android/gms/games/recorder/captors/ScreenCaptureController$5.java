// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.captors;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.GamesLog;

// Referenced classes of package com.google.android.gms.games.recorder.captors:
//            ScreenCaptureController

final class this._cls0 extends android.media.projection.nCaptureController._cls5
{

    final ScreenCaptureController this$0;

    public final void onStop()
    {
        super.nStop();
        Preconditions.checkNotMainThread("Projection onStop callback called on main thread");
        if (mIsVirtualDisplayActive)
        {
            GamesLog.e("ScreenCaptureController", "Media projection stopped unexpectedly");
            notifyErrorStatus(9004);
        }
    }

    ()
    {
        this$0 = ScreenCaptureController.this;
        super();
    }
}
