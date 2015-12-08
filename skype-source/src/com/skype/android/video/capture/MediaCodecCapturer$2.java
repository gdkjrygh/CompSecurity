// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.capture;


// Referenced classes of package com.skype.android.video.capture:
//            MediaCodecCapturer

class this._cls0
    implements com.skype.android.video.hw.codec.encoder.camera.capture.
{

    final MediaCodecCapturer this$0;

    public void onFrameCaptured(long l)
    {
        MediaCodecCapturer.onFrameCaptured(nativeObj, 0, 0, null, l);
    }

    re.Capturer.SinkEvents()
    {
        this$0 = MediaCodecCapturer.this;
        super();
    }
}
