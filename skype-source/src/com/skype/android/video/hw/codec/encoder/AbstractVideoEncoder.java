// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import com.skype.android.video.hw.codec.AbstractMediaCodec;
import com.skype.android.video.hw.codec.OmxWrapper;
import com.skype.android.video.hw.codec.encoder.control.AbstractVideoEncoderControl;
import com.skype.android.video.hw.codec.encoder.control.VideoEncoderControlOmx;
import com.skype.android.video.hw.format.VideoFormat;
import com.skype.android.video.hw.utils.DebugUtils;
import com.skype.android.video.hw.utils.Log;

public abstract class AbstractVideoEncoder extends AbstractMediaCodec
{
    public static class APINotImplementedException extends Exception
    {

        private static final long serialVersionUID = 1L;
        private String failedApiName;

        public String getFailedApiName()
        {
            return failedApiName;
        }

        public APINotImplementedException(String s, String s1)
        {
            super(s1);
            failedApiName = s;
        }
    }


    private AbstractVideoEncoderControl encControl;
    private final Bundle setBitrateRequest = new Bundle();
    private final Bundle suspendRequest = new Bundle();
    private final Bundle syncFrameRequest = new Bundle();

    protected AbstractVideoEncoder(String s)
    {
        super(s, true);
        encControl = null;
        if (omxWrapper != null)
        {
            encControl = new VideoEncoderControlOmx(mediaCodec, omxWrapper);
            return;
        } else
        {
            encControl = new AbstractVideoEncoderControl(mediaCodec, null) {

                final AbstractVideoEncoder this$0;

                private void LogAndThrowNotImplemented(String s1)
                    throws APINotImplementedException
                {
                    if (Log.isLoggable("SLIQ", 4))
                    {
                        Log.i("SLIQ", (new StringBuilder()).append(s1).append(" is not implemented (neither QC nor OMX extensions are available)").toString());
                    }
                    throw new APINotImplementedException(s1, "neither QC nor OMX extensions are available");
                }

                public void markLtrFrame(int i)
                    throws APINotImplementedException
                {
                    LogAndThrowNotImplemented((new StringBuilder()).append(getClass().getSimpleName()).append('#').append(DebugUtils.getMethodName()).toString());
                }

                public void setBaseLayerPID(int i)
                    throws APINotImplementedException
                {
                    LogAndThrowNotImplemented((new StringBuilder()).append(getClass().getSimpleName()).append('#').append(DebugUtils.getMethodName()).toString());
                }

                public void setNumTempLayers(int i)
                    throws APINotImplementedException
                {
                    LogAndThrowNotImplemented((new StringBuilder()).append(getClass().getSimpleName()).append('#').append(DebugUtils.getMethodName()).toString());
                }

                public void setQp(int i)
                    throws APINotImplementedException
                {
                    LogAndThrowNotImplemented((new StringBuilder()).append(getClass().getSimpleName()).append('#').append(DebugUtils.getMethodName()).toString());
                }

                public void setRcFrameRate(float f)
                    throws APINotImplementedException
                {
                    LogAndThrowNotImplemented((new StringBuilder()).append(getClass().getSimpleName()).append('#').append(DebugUtils.getMethodName()).toString());
                }

                public void useLTRFrame(int i)
                    throws APINotImplementedException
                {
                    LogAndThrowNotImplemented((new StringBuilder()).append(getClass().getSimpleName()).append('#').append(DebugUtils.getMethodName()).toString());
                }

            
            {
                this$0 = AbstractVideoEncoder.this;
                super(mediacodec, omxwrapper);
            }
            };
            return;
        }
    }

    protected void doConfigureDynamic(VideoFormat videoformat)
    {
        int i;
        int j;
        if (videoformat.getSvcAlways())
        {
            i = Math.min(Math.max(videoformat.getNumLayers(), 1), 2);
        } else
        {
            i = 0;
        }
        j = Math.min(Math.max(videoformat.getBaseLayerPriorityId(), 0), 63);
        try
        {
            encControl.setNumTempLayers(i);
            encControl.setBaseLayerPID(j);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (VideoFormat videoformat)
        {
            videoformat.printStackTrace();
        }
    }

    protected void doConfigureMediaFormat(MediaFormat mediaformat, VideoFormat videoformat)
    {
        encControl.doConfigureMediaFormat(mediaformat, videoformat);
    }

    protected int doGetMediaCodecFlags()
    {
        return 1;
    }

    public void markLtrFrame(int i)
        throws APINotImplementedException
    {
        if (!isOpen())
        {
            throw new IllegalStateException("closed");
        }
        if (i < 0 || i > 4)
        {
            throw new IllegalArgumentException("longTermFrameIdx out of range [0;4]");
        } else
        {
            encControl.markLtrFrame(i);
            return;
        }
    }

    public void requestSyncFrame()
    {
        if (!isOpen())
        {
            throw new IllegalStateException("closed");
        }
        syncFrameRequest.putInt("request-sync", 0);
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Setting ").append(syncFrameRequest).append(" on ").append(mediaCodec).toString());
        }
        mediaCodec.setParameters(syncFrameRequest);
    }

    public void setBaseLayerPID(int i)
        throws APINotImplementedException
    {
        if (!isOpen())
        {
            throw new IllegalStateException("closed");
        }
        if (i < 0 || i > 63)
        {
            throw new IllegalArgumentException("baseLayerPID out of range [1;6]");
        } else
        {
            encControl.setBaseLayerPID(i);
            return;
        }
    }

    public void setBitrate(int i)
    {
        if (!isOpen())
        {
            throw new IllegalStateException("closed");
        }
        if (i > 0x7fffffff || i < 0)
        {
            throw new IllegalArgumentException("bitrate out of range");
        }
        setBitrateRequest.putInt("video-bitrate", i);
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Setting ").append(setBitrateRequest).append(" on ").append(mediaCodec).toString());
        }
        mediaCodec.setParameters(setBitrateRequest);
    }

    public void setNumTempLayers(int i)
        throws APINotImplementedException
    {
        if (!isOpen())
        {
            throw new IllegalStateException("closed");
        }
        if (i > 6 || i <= 0)
        {
            throw new IllegalArgumentException("numTempLayers out of range [1;6]");
        } else
        {
            encControl.setNumTempLayers(i);
            return;
        }
    }

    public void setQp(int i)
        throws APINotImplementedException
    {
        if (!isOpen())
        {
            throw new IllegalStateException("closed");
        }
        if (i < 0 || i > 51)
        {
            throw new IllegalArgumentException("QP out of range");
        } else
        {
            encControl.setQp(i);
            return;
        }
    }

    public void setRcFrameRate(float f)
        throws APINotImplementedException
    {
        if (!isOpen())
        {
            throw new IllegalStateException("closed");
        } else
        {
            encControl.setRcFrameRate(f);
            return;
        }
    }

    public void suspend()
    {
        if (!isOpen())
        {
            throw new IllegalStateException("closed");
        }
        suspendRequest.putInt("drop-input-frames", 1);
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Setting ").append(suspendRequest).append(" on ").append(mediaCodec).toString());
        }
        mediaCodec.setParameters(suspendRequest);
    }

    public void useLTRFrame(int i)
        throws APINotImplementedException
    {
        if (!isOpen())
        {
            throw new IllegalStateException("closed");
        }
        if (i < 0 || i > 63)
        {
            throw new IllegalArgumentException("useLTRFrameIdxBitMap out of range [0;63]");
        } else
        {
            encControl.useLTRFrame(i);
            return;
        }
    }
}
