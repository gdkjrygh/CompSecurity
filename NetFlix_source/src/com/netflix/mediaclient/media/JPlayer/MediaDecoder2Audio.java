// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.JPlayer;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.netflix.mediaclient.Log;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.netflix.mediaclient.media.JPlayer:
//            MediaDecoderPipe2

public class MediaDecoder2Audio extends MediaDecoderPipe2
{

    private static final int MSG_RENDER_FLUSH = 2;
    private static final int MSG_RENDER_FLUSHED = 4;
    private static final int MSG_RENDER_FRAME = 1;
    private static final int MSG_RENDER_PAUSE = 3;
    private static final String TAG = "MediaDecoder2Audio";
    private AudioTrack mAudioTrack;
    private int mBufferSize;
    private int mChannelConfig;
    private Handler mHandler;
    private HandlerThread mHandlerThread;
    private MediaDecoderPipe2.LocalStateNotifier mRenderState;
    private long mSampleCnt;
    private int mSampleRate;
    private int mSampleSize;
    private long nFrameRendered;

    public MediaDecoder2Audio(MediaDecoderBase.InputDataSource inputdatasource, String s, MediaFormat mediaformat)
        throws Exception
    {
        super(inputdatasource, s, mediaformat, null, null);
        mSampleRate = 48000;
        mChannelConfig = 12;
        nFrameRendered = 0L;
        mRenderState = new MediaDecoderPipe2.LocalStateNotifier(this);
    }

    private void createAudioTrack()
    {
        if (mAudioTrack == null)
        {
            Log.d("MediaDecoder2Audio", "create audiotrack ... ");
            mBufferSize = AudioTrack.getMinBufferSize(mSampleRate, mChannelConfig, 2);
            if (mBufferSize < 32768)
            {
                mBufferSize = 32768;
            }
            mAudioTrack = new AudioTrack(3, mSampleRate, mChannelConfig, 2, mBufferSize, 1);
            if (Log.isLoggable("MediaDecoder2Audio", 3))
            {
                Log.d("MediaDecoder2Audio", (new StringBuilder()).append("mBufferSize = ").append(mBufferSize).toString());
            }
            mSampleSize = 4;
        }
    }

    private long getAudioHeaderPosition()
    {
        if (USE_ANDROID_L_API)
        {
            AudioTimestamp audiotimestamp = new AudioTimestamp();
            if (mAudioTrack.getTimestamp(audiotimestamp))
            {
                return audiotimestamp.framePosition;
            }
        }
        return (long)mAudioTrack.getPlaybackHeadPosition();
    }

    private long getAudioPresentationLatencyMs()
    {
        if (USE_ANDROID_L_API)
        {
            AudioTimestamp audiotimestamp = new AudioTimestamp();
            if (mAudioTrack.getTimestamp(audiotimestamp))
            {
                Log.d("MediaDecoder2Audio", (new StringBuilder()).append("AudioClock: diff nanoTime in ms = ").append(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - audiotimestamp.nanoTime)).toString());
                long l = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - audiotimestamp.nanoTime);
                if (l >= 0L && l <= 20L)
                {
                    return l;
                }
            }
        }
        return 0L;
    }

    private void renderOneFrame(int i, android.media.MediaCodec.BufferInfo bufferinfo, ByteBuffer bytebuffer, long l)
    {
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
        if (bytebuffer != null)
        {
            if (l < 5000L)
            {
                mAudioTrack.setStereoVolume(AudioTrack.getMinVolume(), AudioTrack.getMinVolume());
            } else
            if (l < 15000L)
            {
                mAudioTrack.setStereoVolume(AudioTrack.getMaxVolume(), AudioTrack.getMaxVolume());
            }
            mAudioTrack.write(bytebuffer, 0, bufferinfo.size);
            if (mClock.shouldUpdate(mSampleCnt / (long)mSampleSize))
            {
                try
                {
                    l = (1000L * (mSampleCnt / (long)mSampleSize - getAudioHeaderPosition())) / (long)mSampleRate + getAudioPresentationLatencyMs();
                    long l1 = TimeUnit.MICROSECONDS.toMillis(bufferinfo.presentationTimeUs) - l;
                    if (Log.isLoggable("MediaDecoder2Audio", 3))
                    {
                        Log.d("MediaDecoder2Audio", (new StringBuilder()).append("timestamp = ").append(bufferinfo.presentationTimeUs / 1000L).append(" ms, ").append("total ").append(mSampleCnt / (long)mSampleSize).toString());
                        Log.d("MediaDecoder2Audio", (new StringBuilder()).append("AudioClock: predicted ").append(mClock.get()).append(" ms, update to = ").append(l1).append(" ms, delta = ").append(l1 - mClock.get()).append(", pending in ms = ").append(l).toString());
                    }
                    mClock.update(l1);
                }
                // Misplaced declaration of an exception variable
                catch (ByteBuffer bytebuffer)
                {
                    Log.e("MediaDecoder2Audio", (new StringBuilder()).append("update clock has Exception").append(bytebuffer).toString());
                }
            }
            mSampleCnt = mSampleCnt + (long)bufferinfo.size;
            if (mEventListener != null)
            {
                mEventListener.onSampleRendered(true, nFrameRendered, mClock.get());
            }
        }
        synchronized (mOutputBuffersQ)
        {
            mOutputBuffersQ.removeFirst();
            mOutputBufferInfo[i] = null;
        }
        try
        {
            mDecoder.releaseOutputBuffer(i, false);
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            Log.d("MediaDecoder2Audio", "get un-documented exception as a result of releaseOutputBuffer()");
        }
        if (nFrameRendered <= 0L && Log.isLoggable("MediaDecoder2Audio", 3))
        {
            Log.d("MediaDecoder2Audio", (new StringBuilder()).append("ReleaseOutputBuffer ").append(i).append(" size= ").append(bufferinfo.size).append(" @").append(bufferinfo.presentationTimeUs / 1000L).append(" ms,flags ").append(bufferinfo.flags).toString());
        }
        nFrameRendered = nFrameRendered + 1L;
        return;
        bufferinfo;
        bytebuffer;
        JVM INSTR monitorexit ;
        throw bufferinfo;
    }

    void addToRenderer(int i, android.media.MediaCodec.BufferInfo bufferinfo)
    {
        synchronized (mOutputBuffersQ)
        {
            mOutputBuffersQ.add(Integer.valueOf(i));
            mOutputBufferInfo[i] = bufferinfo;
        }
        return;
        bufferinfo;
        linkedlist;
        JVM INSTR monitorexit ;
        throw bufferinfo;
    }

    void createRenderer()
    {
        createAudioTrack();
        mRenderState.onPaused();
        mHandlerThread = new HandlerThread("RenderThreadAudeo", -2);
        mHandlerThread.start();
        mHandler = new Handler(mHandlerThread.getLooper()) {

            final MediaDecoder2Audio this$0;

            public void handleMessage(Message message)
            {
                message.what;
                JVM INSTR tableswitch 1 4: default 36
            //                           1 45
            //                           2 440
            //                           3 360
            //                           4 586;
                   goto _L1 _L2 _L3 _L4 _L5
_L1:
                Log.d("MediaDecoder2Audio", "RenderThreadAudeo had unknown message");
_L12:
                return;
_L2:
                synchronized (mRenderState)
                {
                    if (mRenderState.isPaused())
                    {
                        mRenderState.onPlaying();
                        mRenderState.notify();
                        Log.d("MediaDecoder2Audio", "render state play");
                    }
                }
_L9:
                int i;
                i = -1;
                message = null;
                obj = null;
                synchronized (mOutputBuffersQ)
                {
                    if (!mOutputBuffersQ.isEmpty())
                    {
                        i = ((Integer)mOutputBuffersQ.peekFirst()).intValue();
                        message = mOutputBufferInfo[i];
                        obj = mOutputBuffers[i];
                    }
                }
                if (message == null || (((android.media.MediaCodec.BufferInfo) (message)).flags & 4) == 0) goto _L7; else goto _L6
_L6:
                Log.d("MediaDecoder2Audio", "renderer got buffer BUFFER_FLAG_END_OF_STREAM");
                if (mEventListener != null)
                {
                    mEventListener.onEndOfStream(true);
                }
_L8:
                message = mRenderState;
                message;
                JVM INSTR monitorenter ;
                if (mRenderState.isPlaying())
                {
                    break MISSING_BLOCK_LABEL_342;
                }
                Log.d("MediaDecoder2Audio", "render state is not play");
_L10:
                return;
                obj;
                message;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                message;
                JVM INSTR monitorexit ;
                throw obj;
                message;
                linkedlist;
                JVM INSTR monitorexit ;
                throw message;
_L7:
                startRenderer();
                long l = getAudioHeaderPosition();
                if (i >= 0)
                {
                    renderOneFrame(i, message, ((ByteBuffer) (obj)), l);
                }
                if (!mOutputBuffersQ.isEmpty()) goto _L9; else goto _L8
                message;
                Log.e("MediaDecoder2Audio", (new StringBuilder()).append("getAudioHeaderPosition() has Exception").append(message).toString());
                  goto _L8
                mHandler.sendEmptyMessageDelayed(1, 20L);
                  goto _L10
_L4:
                mClock.pause();
                synchronized (mRenderState)
                {
                    mRenderState.onPaused();
                    mRenderState.notify();
                }
                Log.d("MediaDecoder2Audio", "render state pause");
                if (mEventListener != null)
                {
                    mEventListener.onPasued(true);
                    return;
                }
                continue; /* Loop/switch isn't completed */
                exception;
                message;
                JVM INSTR monitorexit ;
                throw exception;
_L3:
                Log.d("MediaDecoder2Audio", "render state flushing");
                mClock.flush();
                synchronized (mOutputBuffersQ)
                {
                    mOutputBuffersQ.clear();
                }
                if (mAudioTrack != null)
                {
                    try
                    {
                        mAudioTrack.stop();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Message message)
                    {
                        Log.d("MediaDecoder2Audio", "mAudioTrack already stopped/uninitialized");
                    }
                    mAudioTrack.release();
                    mAudioTrack = null;
                }
                createAudioTrack();
                startRenderer();
                synchronized (mRenderState)
                {
                    mRenderState.notify();
                }
                Log.d("MediaDecoder2Audio", "render state flushed");
                return;
                exception1;
                message;
                JVM INSTR monitorexit ;
                throw exception1;
                exception2;
                message;
                JVM INSTR monitorexit ;
                throw exception2;
_L5:
                if (mEventListener != null)
                {
                    mEventListener.onFlushed(true);
                    return;
                }
                if (true) goto _L12; else goto _L11
_L11:
            }

            
            {
                this$0 = MediaDecoder2Audio.this;
                super(looper);
            }
        };
    }

    void flushRenderer()
    {
        if (mHandler == null) goto _L2; else goto _L1
_L1:
        MediaDecoderPipe2.LocalStateNotifier localstatenotifier = mRenderState;
        localstatenotifier;
        JVM INSTR monitorenter ;
        mHandler.sendEmptyMessage(2);
        mRenderState.wait();
_L4:
        mHandler.sendEmptyMessageDelayed(4, 20L);
_L2:
        return;
        Object obj;
        obj;
        Log.d("MediaDecoder2Audio", "flushRenderer interrupted");
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        localstatenotifier;
        JVM INSTR monitorexit ;
        throw obj;
    }

    void pauseRenderer()
    {
        if (mHandler == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        MediaDecoderPipe2.LocalStateNotifier localstatenotifier = mRenderState;
        localstatenotifier;
        JVM INSTR monitorenter ;
        mRenderState.onPausing();
        mHandler.sendEmptyMessage(3);
        mHandler.removeMessages(1);
        mRenderState.wait();
_L1:
        return;
        Object obj;
        obj;
        Log.d("MediaDecoder2Audio", "pauseRenderer interrupted");
          goto _L1
        obj;
        localstatenotifier;
        JVM INSTR monitorexit ;
        throw obj;
    }

    void startRenderer()
    {
        if (mAudioTrack == null || mAudioTrack.getPlayState() == 3 || mAudioTrack.getPlayState() == 0)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        Log.d("MediaDecoder2Audio", "start audiotrack ... ");
        mSampleCnt = 0L;
        mAudioTrack.play();
        return;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        Log.w("MediaDecoder2Audio", "mAudioTrack already stopped/uninitialized");
        return;
    }

    void stopRenderer()
    {
        if (mHandler != null)
        {
            mHandler.removeMessages(1);
            mHandler.removeMessages(2);
            mHandler.removeMessages(3);
        }
        if (mHandlerThread != null)
        {
            mHandlerThread.quit();
        }
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
            Log.d("MediaDecoder2Audio", "AudioTrack.stop() has  IllegalStateException");
        }
        mSampleCnt = 0L;
    }

    void unpauseRenderer()
    {
        if (mHandler == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        MediaDecoderPipe2.LocalStateNotifier localstatenotifier = mRenderState;
        localstatenotifier;
        JVM INSTR monitorenter ;
        mHandler.sendEmptyMessage(1);
        mRenderState.wait();
_L1:
        return;
        Object obj;
        obj;
        Log.d("MediaDecoder2Audio", "unpauseRenderer interrupted");
          goto _L1
        obj;
        localstatenotifier;
        JVM INSTR monitorexit ;
        throw obj;
    }







/*
    static AudioTrack access$402(MediaDecoder2Audio mediadecoder2audio, AudioTrack audiotrack)
    {
        mediadecoder2audio.mAudioTrack = audiotrack;
        return audiotrack;
    }

*/

}
