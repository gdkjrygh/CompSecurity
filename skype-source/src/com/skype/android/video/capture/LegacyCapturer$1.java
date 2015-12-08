// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.capture;

import com.skype.android.video.capture.impl.FrameConsumer;

// Referenced classes of package com.skype.android.video.capture:
//            LegacyCapturer, AbstractPlatformCapturer

class this._cls0
    implements FrameConsumer
{

    final LegacyCapturer this$0;

    public void onFrameArrived(byte abyte0[], int i, int j)
    {
        if (LegacyCapturer.access$100(LegacyCapturer.this).isSet(ate.Flags.CallbackEnabled))
        {
            AbstractPlatformCapturer.onFrameCaptured(nativeObj, i, j, abyte0, AbstractPlatformCapturer.getNativeTimestamp());
        }
    }

    apturer()
    {
        this$0 = LegacyCapturer.this;
        super();
    }
}
