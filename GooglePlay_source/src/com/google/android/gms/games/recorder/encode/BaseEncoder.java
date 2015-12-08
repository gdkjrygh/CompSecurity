// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.encode;

import android.media.MediaCodec;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.recorder.instrumentation.Profiler;
import com.google.android.gms.games.util.VideoUtils;
import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.games.recorder.encode:
//            MediaEncoder, MediaMux

public abstract class BaseEncoder extends android.media.MediaCodec.Callback
    implements MediaEncoder
{

    protected MediaCodec mEncoder;
    private MediaEncoder.EndOfStreamCallback mEosCallback;
    private boolean mEosReached;
    private boolean mEosRequested;
    private MediaEncoder.ErrorCallback mErrorCallback;
    private boolean mIsReleased;
    private boolean mIsStarted;
    private boolean mIsStopped;
    private long mLastTimestamp;
    protected final MediaMux mMediaMux;
    protected final MediaFormat mOriginalFormat;
    private int mTrackIndex;

    public BaseEncoder(MediaFormat mediaformat, MediaMux mediamux)
        throws IOException
    {
        mTrackIndex = -1;
        mLastTimestamp = -1L;
        mEncoder = null;
        if (mediaformat != null)
        {
            MediaCodecList mediacodeclist = new MediaCodecList(0);
            String s = null;
            Integer integer = s;
            if (!PlatformVersion.checkVersion(23))
            {
                integer = s;
                if (mediaformat.containsKey("frame-rate"))
                {
                    integer = Integer.valueOf(mediaformat.getInteger("frame-rate"));
                    mediaformat.setString("frame-rate", null);
                }
            }
            s = mediacodeclist.findEncoderForFormat(mediaformat);
            if (integer != null)
            {
                mediaformat.setInteger("frame-rate", integer.intValue());
            }
            if (s != null)
            {
                mEncoder = MediaCodec.createByCodecName(s);
            }
        }
        if (mEncoder == null)
        {
            GamesLog.v("BaseEncoder", "Failed to create encoder; falling through to default creation method");
            mEncoder = MediaCodec.createEncoderByType(mediaformat.getString("mime"));
        }
        mEncoder.setCallback(this);
        mEncoder.configure(mediaformat, null, null, 1);
        mOriginalFormat = mediaformat;
        mMediaMux = mediamux;
    }

    private static void copyFormatIntField(MediaFormat mediaformat, MediaFormat mediaformat1, String s)
    {
        if (!mediaformat.containsKey(s) && mediaformat1.containsKey(s))
        {
            mediaformat.setInteger(s, mediaformat1.getInteger(s));
        }
    }

    private void finishStream()
    {
        mEosReached = true;
        if (mEosCallback != null)
        {
            mEosCallback.onEndOfStream(this);
        }
    }

    protected final void notifyError(int i)
    {
        if (mErrorCallback != null)
        {
            mErrorCallback.onError$1d13998f(i);
        }
    }

    public void onError(MediaCodec mediacodec, android.media.MediaCodec.CodecException codecexception)
    {
        GamesLog.e("BaseEncoder", "Encoder encountered error", codecexception);
        notifyError(9005);
    }

    public void onOutputBufferAvailable(MediaCodec mediacodec, int i, android.media.MediaCodec.BufferInfo bufferinfo)
    {
        if (mediacodec != mEncoder || mTrackIndex < 0)
        {
            GamesLog.e("BaseEncoder", "Skipping request to process buffer on missing codec");
            return;
        }
        if (i < 0)
        {
            GamesLog.e("BaseEncoder", (new StringBuilder("Unexpected buffer index for codec: ")).append(i).toString());
            return;
        }
        if (mEosReached)
        {
            GamesLog.e("BaseEncoder", "More buffers after EOS on codec");
            return;
        }
        ByteBuffer bytebuffer = mediacodec.getOutputBuffer(i);
        if (bytebuffer == null)
        {
            try
            {
                GamesLog.e("BaseEncoder", "Codec produced no output data in its buffer");
                notifyError(9005);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (MediaCodec mediacodec)
            {
                GamesLog.e("BaseEncoder", "Codec experienced an error", mediacodec);
            }
            Profiler profiler;
            if (mEosRequested)
            {
                finishStream();
                return;
            } else
            {
                notifyError(9005);
                return;
            }
        }
        if ((bufferinfo.flags & 2) != 0)
        {
            bufferinfo.size = 0;
        }
        if (bufferinfo.size != 0)
        {
            if (mLastTimestamp > 0L && bufferinfo.presentationTimeUs < mLastTimestamp + 100L)
            {
                GamesLog.e("BaseEncoder", (new StringBuilder("Timewarp. Last frame at ")).append(mLastTimestamp).append(" is too close to current frame at ").append(bufferinfo.presentationTimeUs).toString());
                bufferinfo.presentationTimeUs = mLastTimestamp + 100L;
            }
            mLastTimestamp = bufferinfo.presentationTimeUs;
            if (mMediaMux != null && mMediaMux.isStarted())
            {
                bytebuffer.position(bufferinfo.offset);
                bytebuffer.limit(bufferinfo.offset + bufferinfo.size);
                profiler = Profiler.getInstance();
                if (profiler.mIsEnabled)
                {
                    profiler.incrementCounter(String.format("samplesEncoded-track-%d", new Object[] {
                        Integer.valueOf(mTrackIndex)
                    }), 1);
                    profiler.incrementCounter(String.format("bytesEncoded-track-%d", new Object[] {
                        Integer.valueOf(mTrackIndex)
                    }), bufferinfo.size);
                }
                if (!mMediaMux.writeSampleData(mTrackIndex, bytebuffer, bufferinfo))
                {
                    notifyError(9015);
                    return;
                }
            }
        }
        if ((bufferinfo.flags & 4) == 0) goto _L2; else goto _L1
_L1:
        if (!mEosReached) goto _L4; else goto _L3
_L3:
        GamesLog.w("BaseEncoder", "End of stream already reached for codec");
_L2:
        mediacodec.releaseOutputBuffer(i, false);
        return;
_L4:
        if (mEosRequested)
        {
            break MISSING_BLOCK_LABEL_405;
        }
        GamesLog.w("BaseEncoder", "Reached end of stream unexpectedly for codec");
_L6:
        finishStream();
        if (true) goto _L2; else goto _L5
_L5:
        GamesLog.d("BaseEncoder", "End of stream reached for codec");
          goto _L6
    }

    public void onOutputFormatChanged(MediaCodec mediacodec, MediaFormat mediaformat)
    {
        copyFormatIntField(mediaformat, mOriginalFormat, "bitrate");
        copyFormatIntField(mediaformat, mOriginalFormat, "sample-rate");
        copyFormatIntField(mediaformat, mOriginalFormat, "frame-rate");
        int i = mMediaMux.addTrack(mediaformat);
        if (i < 0)
        {
            GamesLog.e("BaseEncoder", "Encoder could not add track to muxer");
            notifyError(9015);
        } else
        {
            mTrackIndex = i;
            if (mMediaMux.hasAllTracks() && !mMediaMux.start())
            {
                GamesLog.e("BaseEncoder", "Encoder could not start muxer");
                notifyError(9015);
                return;
            }
        }
    }

    public boolean release()
    {
        VideoUtils.logChatty("BaseEncoder", "calling release");
        if (mIsReleased)
        {
            return true;
        }
        try
        {
            mEncoder.release();
            mIsReleased = true;
        }
        catch (Exception exception)
        {
            GamesLog.d("BaseEncoder", "Releasing encoder failed", exception);
        }
        return mIsReleased;
    }

    public final void setErrorCallback(MediaEncoder.ErrorCallback errorcallback)
    {
        mErrorCallback = errorcallback;
    }

    protected abstract void signalEndOfStream();

    public final boolean signalEndOfStream(MediaEncoder.EndOfStreamCallback endofstreamcallback)
    {
        VideoUtils.logChatty("BaseEncoder", "calling signalEndOfStream");
        if (mIsReleased)
        {
            GamesLog.e("BaseEncoder", "Cannot signal EOS once released");
            return false;
        }
        if (mIsStopped)
        {
            GamesLog.e("BaseEncoder", "Cannot signal EOS once stopped");
            return false;
        }
        if (!mIsStarted)
        {
            GamesLog.e("BaseEncoder", "Encoder not started");
            return false;
        }
        if (mEosRequested)
        {
            return true;
        } else
        {
            mEosRequested = true;
            mEosCallback = endofstreamcallback;
            signalEndOfStream();
            return false;
        }
    }

    public boolean start()
    {
        VideoUtils.logChatty("BaseEncoder", "calling start");
        if (mIsReleased)
        {
            GamesLog.e("BaseEncoder", "Cannot start once released");
            return false;
        }
        if (mIsStopped)
        {
            GamesLog.e("BaseEncoder", "Cannot restart once stopped");
            return false;
        }
        if (mIsStarted)
        {
            return true;
        }
        try
        {
            mEncoder.start();
            mIsStarted = true;
        }
        catch (Exception exception)
        {
            GamesLog.d("BaseEncoder", "Starting encoder failed", exception);
        }
        return mIsStarted;
    }

    public boolean stop()
    {
        VideoUtils.logChatty("BaseEncoder", "calling stop");
        if (mIsReleased)
        {
            GamesLog.e("BaseEncoder", "Cannot stop once released");
            return false;
        }
        if (!mIsStarted)
        {
            GamesLog.e("BaseEncoder", "Encoder not started");
            return false;
        }
        if (mIsStopped)
        {
            return true;
        }
        try
        {
            mEncoder.stop();
            mIsStopped = true;
        }
        catch (Exception exception)
        {
            GamesLog.d("BaseEncoder", "Stopping encoder failed", exception);
        }
        return mIsStopped;
    }
}
