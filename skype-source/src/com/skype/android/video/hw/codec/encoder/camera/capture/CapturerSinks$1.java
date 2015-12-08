// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.capture;


// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.capture:
//            CapturerSinks

class stractSink
    implements com.skype.android.video.hw.codec.encoder.camera.gl.gTarget.Events
{

    final CapturerSinks this$0;
    final stractSink val$sink;

    public void onFrameRendered(long l)
    {
        val$sink.onFrameCaptured(l);
    }

    stractSink()
    {
        this$0 = final_capturersinks;
        val$sink = stractSink.this;
        super();
    }
}
