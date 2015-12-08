// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.captors;

import com.google.android.gms.games.util.VideoUtils;

// Referenced classes of package com.google.android.gms.games.recorder.captors:
//            ScreenCaptureController

final class this._cls0
    implements Runnable
{

    final ScreenCaptureController this$0;

    public final void run()
    {
        VideoUtils.logChatty("ScreenCaptureController", "running mCodecDrainedAction");
        ScreenCaptureController.access$400(ScreenCaptureController.this, true);
    }

    ()
    {
        this$0 = ScreenCaptureController.this;
        super();
    }
}
