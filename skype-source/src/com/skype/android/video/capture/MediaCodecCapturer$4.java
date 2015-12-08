// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.capture;

import com.skype.android.video.hw.codec.encoder.camera.capture.Capturer;

// Referenced classes of package com.skype.android.video.capture:
//            MediaCodecCapturer, AbstractPlatformCapturer

class re.Capturer extends Capturer
{

    final MediaCodecCapturer this$0;

    protected long doOverrideFrameTimestamp(long l)
    {
        return AbstractPlatformCapturer.getNativeTimestamp();
    }

    rer()
    {
        this$0 = MediaCodecCapturer.this;
        super();
    }
}
