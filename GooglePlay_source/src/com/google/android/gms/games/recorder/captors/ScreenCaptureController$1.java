// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.captors;

import com.google.android.gms.games.recorder.encode.MediaEncoder;
import com.google.android.gms.games.util.VideoHandler;
import com.google.android.gms.games.util.VideoUtils;

// Referenced classes of package com.google.android.gms.games.recorder.captors:
//            ScreenCaptureController

final class this._cls0
    implements com.google.android.gms.games.recorder.encode.llback
{

    private boolean mAudioEos;
    private boolean mVideoEos;
    final ScreenCaptureController this$0;

    public final void onEndOfStream(MediaEncoder mediaencoder)
    {
        VideoUtils.logChatty("ScreenCaptureController", "Calling EndOfStreamCallback#onEndOfStream");
        if (mediaencoder == mVideoEncoder)
        {
            mVideoEos = true;
        }
        if (mediaencoder == mAudioEncoder)
        {
            mAudioEos = true;
        }
        if (mVideoEos && mAudioEos)
        {
            VideoUtils.logChatty("ScreenCaptureController", "EndOfStreamCallback#onEndOfStream - posting code drain to codec handler");
            mCodecHandler.post("ScreenCaptureController", "mCodecDrainedAction", mCodecDrainedAction);
        }
    }

    lback()
    {
        this$0 = ScreenCaptureController.this;
        super();
    }
}
