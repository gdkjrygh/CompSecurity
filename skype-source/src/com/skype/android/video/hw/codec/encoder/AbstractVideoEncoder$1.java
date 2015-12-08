// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder;

import android.media.MediaCodec;
import com.skype.android.video.hw.codec.OmxWrapper;
import com.skype.android.video.hw.codec.encoder.control.AbstractVideoEncoderControl;
import com.skype.android.video.hw.utils.DebugUtils;
import com.skype.android.video.hw.utils.Log;

// Referenced classes of package com.skype.android.video.hw.codec.encoder:
//            AbstractVideoEncoder

class coderControl extends AbstractVideoEncoderControl
{

    final AbstractVideoEncoder this$0;

    private void LogAndThrowNotImplemented(String s)
        throws INotImplementedException
    {
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(s).append(" is not implemented (neither QC nor OMX extensions are available)").toString());
        }
        throw new INotImplementedException(s, "neither QC nor OMX extensions are available");
    }

    public void markLtrFrame(int i)
        throws INotImplementedException
    {
        LogAndThrowNotImplemented((new StringBuilder()).append(getClass().getSimpleName()).append('#').append(DebugUtils.getMethodName()).toString());
    }

    public void setBaseLayerPID(int i)
        throws INotImplementedException
    {
        LogAndThrowNotImplemented((new StringBuilder()).append(getClass().getSimpleName()).append('#').append(DebugUtils.getMethodName()).toString());
    }

    public void setNumTempLayers(int i)
        throws INotImplementedException
    {
        LogAndThrowNotImplemented((new StringBuilder()).append(getClass().getSimpleName()).append('#').append(DebugUtils.getMethodName()).toString());
    }

    public void setQp(int i)
        throws INotImplementedException
    {
        LogAndThrowNotImplemented((new StringBuilder()).append(getClass().getSimpleName()).append('#').append(DebugUtils.getMethodName()).toString());
    }

    public void setRcFrameRate(float f)
        throws INotImplementedException
    {
        LogAndThrowNotImplemented((new StringBuilder()).append(getClass().getSimpleName()).append('#').append(DebugUtils.getMethodName()).toString());
    }

    public void useLTRFrame(int i)
        throws INotImplementedException
    {
        LogAndThrowNotImplemented((new StringBuilder()).append(getClass().getSimpleName()).append('#').append(DebugUtils.getMethodName()).toString());
    }

    INotImplementedException(MediaCodec mediacodec, OmxWrapper omxwrapper)
    {
        this$0 = AbstractVideoEncoder.this;
        super(mediacodec, omxwrapper);
    }
}
