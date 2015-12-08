// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.JPlayer;

import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import com.netflix.mediaclient.Log;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.media.JPlayer:
//            MediaDecoderPipe

public class AudioDecoderPipe extends MediaDecoderPipe
{

    private static final String TAG = "MediaPipeAudio";
    private AudioTrack mAudioTrack;
    private int mBufferSize;
    private int mChannelConfig;
    private long mSampleCnt;
    private int mSampleRate;
    private int mSampleSize;
    private long nFrameRendered;

    public AudioDecoderPipe(MediaDecoderPipe.InputDataSource inputdatasource, String s, MediaFormat mediaformat, Surface surface, String s1, JSONObject jsonobject)
        throws Exception
    {
        super(inputdatasource, s, mediaformat, surface, s1, jsonobject);
        mSampleRate = 48000;
        mChannelConfig = 12;
        nFrameRendered = 0L;
    }

    private boolean renderOutput(ByteBuffer bytebuffer, android.media.MediaCodec.BufferInfo bufferinfo)
    {
        int i;
        if (mAudioTrack == null)
        {
            Log.d("MediaPipeAudio", "create audiotrack ... ");
            mBufferSize = AudioTrack.getMinBufferSize(mSampleRate, mChannelConfig, 2);
            if (mBufferSize < 32768)
            {
                mBufferSize = 32768;
            }
            mAudioTrack = new AudioTrack(3, mSampleRate, mChannelConfig, 2, mBufferSize, 1);
            if (Log.isLoggable("MediaPipeAudio", 3))
            {
                Log.d("MediaPipeAudio", (new StringBuilder()).append("mBufferSize = ").append(mBufferSize).append(", b.hasArray() ").append(bytebuffer.hasArray()).toString());
            }
            mSampleSize = 4;
        }
        if (mAudioTrack != null && mAudioTrack.getPlayState() != 3 && mAudioTrack.getPlayState() != 0)
        {
            Log.d("MediaPipeAudio", "start audiotrack ... ");
            mSampleCnt = 0L;
            long l;
            try
            {
                mAudioTrack.play();
            }
            // Misplaced declaration of an exception variable
            catch (ByteBuffer bytebuffer)
            {
                Log.d("MediaPipeAudio", "AudioTrack.play() has  IllegalStateException");
                return false;
            }
        }
        try
        {
            i = mAudioTrack.getPlaybackHeadPosition();
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            Log.e("MediaPipeAudio", (new StringBuilder()).append("AudioTrack.getPlaybackHeadPosition() has Exception").append(bytebuffer).toString());
            return false;
        }
        bytebuffer.clear();
        bytebuffer.position(0);
        if (bytebuffer.hasArray())
        {
            bytebuffer = bytebuffer.array();
        } else
        {
            byte abyte0[] = new byte[bufferinfo.size];
            bytebuffer.get(abyte0, 0, bufferinfo.size);
            bytebuffer = abyte0;
        }
        if (bytebuffer == null) goto _L2; else goto _L1
_L1:
        if (i >= 5000) goto _L4; else goto _L3
_L3:
        mAudioTrack.setStereoVolume(AudioTrack.getMinVolume(), AudioTrack.getMinVolume());
_L6:
        mAudioTrack.write(bytebuffer, 0, bufferinfo.size);
        l = (1000L * (mSampleCnt / (long)mSampleSize - (long)mAudioTrack.getPlaybackHeadPosition())) / (long)mSampleRate;
        mClock.update(bufferinfo.presentationTimeUs / 1000L - l);
        mSampleCnt = mSampleCnt + (long)bufferinfo.size;
_L2:
        return true;
_L4:
        if (i < 15000)
        {
            mAudioTrack.setStereoVolume(AudioTrack.getMaxVolume(), AudioTrack.getMaxVolume());
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void flush()
    {
        super.flush();
        try
        {
            if (mAudioTrack != null && (mAudioTrack.getPlayState() == 2 || mAudioTrack.getPlayState() == 3))
            {
                mAudioTrack.stop();
                mSampleCnt = 0L;
                Log.d("MediaPipeAudio", (new StringBuilder()).append("stop audio state: ").append(mAudioTrack.getPlayState()).toString());
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            Log.d("MediaPipeAudio", "AudioTrack.flush() has  IllegalStateException");
        }
        Log.d("MediaPipeAudio", "flush audio done");
    }

    public volatile MediaDecoderPipe.Clock getClock()
    {
        return super.getClock();
    }

    public volatile boolean isDecoderCreated()
    {
        return super.isDecoderCreated();
    }

    public volatile boolean isPauseded()
    {
        return super.isPauseded();
    }

    public volatile boolean isStopped()
    {
        return super.isStopped();
    }

    public volatile void pause()
    {
        super.pause();
    }

    boolean renderOutput(boolean flag)
    {
        if (!flag)
        {
            return false;
        }
        int i = -1;
        android.media.MediaCodec.BufferInfo bufferinfo = null;
        ByteBuffer bytebuffer = null;
        synchronized (mOutputBuffersQ)
        {
            if (!mOutputBuffersQ.isEmpty())
            {
                i = ((Integer)mOutputBuffersQ.peekFirst()).intValue();
                bufferinfo = mOutputBufferInfo[i];
                bytebuffer = mOutputBuffers[i];
            }
        }
        if (i != -1 && bufferinfo != null && renderOutput(bytebuffer, bufferinfo))
        {
            mOutputBuffersQ.removeFirst();
            mOutputBufferInfo[i] = null;
            try
            {
                mDecoder.releaseOutputBuffer(i, false);
            }
            catch (IllegalStateException illegalstateexception)
            {
                Log.d("MediaPipeAudio", "IllegalStateException at releaseOutputBuffer");
            }
            if (nFrameRendered <= 0L && Log.isLoggable("MediaPipeAudio", 3))
            {
                Log.d("MediaPipeAudio", (new StringBuilder()).append("ReleaseOutputBuffer ").append(i).append(" size= ").append(bufferinfo.size).append(" @").append(bufferinfo.presentationTimeUs / 1000L).append(" ms,flags ").append(bufferinfo.flags).toString());
            }
            nFrameRendered = nFrameRendered + 1L;
            if (bufferinfo.flags == 4)
            {
                return false;
            }
        }
        break MISSING_BLOCK_LABEL_234;
        exception;
        linkedlist;
        JVM INSTR monitorexit ;
        throw exception;
        return true;
    }

    public volatile void setEventListener(MediaDecoderPipe.EventListener eventlistener)
    {
        super.setEventListener(eventlistener);
    }

    public volatile void setReferenceClock(MediaDecoderPipe.Clock clock)
    {
        super.setReferenceClock(clock);
    }

    public volatile void start()
    {
        super.start();
    }

    public void stop()
    {
        try
        {
            if (mAudioTrack != null)
            {
                mAudioTrack.stop();
                mAudioTrack.release();
                mAudioTrack = null;
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            Log.d("MediaPipeAudio", "AudioTrack.stop() has  IllegalStateException");
        }
        mSampleCnt = 0L;
        super.stop();
    }

    public volatile void unpause()
    {
        super.unpause();
    }
}
