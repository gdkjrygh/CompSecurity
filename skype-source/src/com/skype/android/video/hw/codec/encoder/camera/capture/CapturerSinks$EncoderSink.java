// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.capture;

import com.skype.android.video.hw.codec.encoder.camera.gl.ChannelPushFrame;
import com.skype.android.video.hw.codec.encoder.camera.gl.GLException;
import com.skype.android.video.hw.utils.Log;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.capture:
//            CapturerSinks, CapturerException

private class channel extends 
{

    private volatile ChannelPushFrame channel;
    private float targetFps;
    final CapturerSinks this$0;

    public boolean canReleaseSurface()
    {
        return true;
    }

    public float getTargetFrameRate()
    {
        return targetFps;
    }

    public com.skype.android.video.hw.codec.encoder.camera.gl.utType getType()
    {
        return com.skype.android.video.hw.codec.encoder.camera.gl.utType.ENCODER;
    }

    public void onFrameCaptured(long l)
    {
        cb.eCaptured(l);
    }

    public boolean pushFrame()
        throws CapturerException
    {
        if (channel != null)
        {
            boolean flag;
            try
            {
                flag = channel.executePushFrame(id);
            }
            catch (GLException glexception)
            {
                throw new CapturerException("Push encoder frame failed", glexception);
            }
            return flag;
        }
        if (Log.isLoggable("SLIQ", 5))
        {
            Log.w("SLIQ", "Attempt to push frame when channel does not exist");
        }
        return false;
    }

    public void setChannel(ChannelPushFrame channelpushframe)
    {
        channel = channelpushframe;
    }

    public void setTargetFrameRate(float f)
    {
        CapturerSinks.access$000(CapturerSinks.this).set(true);
        targetFps = f;
    }

    public e(Object obj, e e, int i, ChannelPushFrame channelpushframe)
    {
        this$0 = CapturerSinks.this;
        super(CapturerSinks.this, obj, e, i);
        targetFps = 30F;
        channel = channelpushframe;
    }
}
