// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.captors;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.util.VideoHandler;
import com.google.android.gms.games.util.VideoUtils;

// Referenced classes of package com.google.android.gms.games.recorder.captors:
//            ScreenCaptureController

public final class this._cls0
    implements Runnable
{

    final ScreenCaptureController this$0;

    public final void run()
    {
        ScreenCaptureController screencapturecontroller = ScreenCaptureController.this;
        VideoUtils.logChatty("ScreenCaptureController", "calling doStopCapture");
        Preconditions.checkNotMainThread("Stop capturing called on main thread");
        screencapturecontroller.stopCodecPipeline();
        VideoUtils.logChatty("ScreenCaptureController", "doStopCapture - posting drain timeout to codec handler");
        screencapturecontroller.mCodecHandler.postDelayed("ScreenCaptureController", "mCodecDrainTimeoutAction", screencapturecontroller.mCodecDrainTimeoutAction, 250L);
    }

    public ()
    {
        this$0 = ScreenCaptureController.this;
        super();
    }
}
