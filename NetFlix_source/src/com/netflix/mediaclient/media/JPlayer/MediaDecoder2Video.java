// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.JPlayer;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.netflix.mediaclient.Log;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.netflix.mediaclient.media.JPlayer:
//            MediaDecoderPipe2

public class MediaDecoder2Video extends MediaDecoderPipe2
{
    private class RenderHeartbeat
    {

        static final long HRATBEAT_INTERVAL = 5000L;
        private long mLastBeat;
        final MediaDecoder2Video this$0;

        void ShowHearbeat()
        {
            long l = System.currentTimeMillis();
            if (l >= mLastBeat + 5000L)
            {
                mLastBeat = l;
                if (Log.isLoggable("MediaDecoder2Video", 3))
                {
                    Log.d("MediaDecoder2Video", (new StringBuilder()).append("render alive, rendered frame ").append(nFrameRendered).append(",skipped frame ").append(nFrameSkipped).toString());
                }
            }
        }

        RenderHeartbeat()
        {
            this$0 = MediaDecoder2Video.this;
            super();
            mLastBeat = System.currentTimeMillis();
        }
    }


    private static final int DEFAULT_LOOPING_TIME = 30;
    private static final int FAST_LOOPING_TIME = 10;
    private static final long MAX_AHEAD_TIMED_RELEASE_MS = 500L;
    private static final int MAX_LOOPING_TIME = 50;
    private static final int MSG_RENDER_FLUSH = 2;
    private static final int MSG_RENDER_FRAME = 1;
    private static final int RENDER_SKIP = 30;
    private static final int RENDER_WHIGH = 20;
    private static final int SCHEDULE_OFFSET = 5;
    private static final String TAG = "MediaDecoder2Video";
    private volatile boolean mDecoderStopped;
    private boolean mFirstFrameRendered;
    private Handler mHandler;
    private HandlerThread mHandlerThread;
    RenderHeartbeat mHearbeat;
    private boolean mLastFrameRendered;
    private boolean mPaused;
    private MediaDecoderPipe2.LocalStateNotifier mRenderState;
    private boolean mRendererStarted;
    private Method mTimedReleaseOutputBufferMethod;
    private long nFrameRendered;
    private long nFrameSkipped;
    private long previousPts;

    public MediaDecoder2Video(MediaDecoderBase.InputDataSource inputdatasource, String s, MediaFormat mediaformat, Surface surface, MediaCrypto mediacrypto)
        throws Exception
    {
        super(inputdatasource, s, mediaformat, surface, mediacrypto);
        nFrameRendered = 0L;
        nFrameSkipped = 0L;
        mRendererStarted = false;
        mLastFrameRendered = false;
        mFirstFrameRendered = false;
        mPaused = false;
        previousPts = -1L;
        mDecoderStopped = false;
        mRenderState = new MediaDecoderPipe2.LocalStateNotifier(this);
        mHearbeat = new RenderHeartbeat();
    }

    private boolean isTimedReleaseSupported()
    {
        return mTimedReleaseOutputBufferMethod != null;
    }

    private void removeFrameFromQ(int i)
    {
        synchronized (mOutputBuffersQ)
        {
            mOutputBuffersQ.removeFirst();
            mOutputBufferInfo[i] = null;
        }
        return;
        exception;
        linkedlist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void tryToReleaseBuffers()
    {
_L10:
        LinkedList linkedlist = mOutputBuffersQ;
        linkedlist;
        JVM INSTR monitorenter ;
        if (mOutputBuffersQ.isEmpty()) goto _L2; else goto _L1
_L1:
        android.media.MediaCodec.BufferInfo bufferinfo;
        int i;
        i = ((Integer)mOutputBuffersQ.peekFirst()).intValue();
        bufferinfo = mOutputBufferInfo[i];
        if (i == -1 || bufferinfo == null) goto _L4; else goto _L3
_L3:
        if (mRefClock == null) goto _L4; else goto _L5
_L5:
        long l;
        long l1;
        l1 = bufferinfo.presentationTimeUs;
        l = mRefClock.get();
        if (l >= 0L) goto _L7; else goto _L6
_L6:
        mHandler.sendEmptyMessageDelayed(1, 30L);
        linkedlist;
        JVM INSTR monitorexit ;
        return;
_L2:
        linkedlist;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        linkedlist;
        JVM INSTR monitorexit ;
        throw obj;
_L7:
        long l2;
        l1 = TimeUnit.MICROSECONDS.toNanos(l1) - TimeUnit.MILLISECONDS.toNanos(l);
        l2 = TimeUnit.NANOSECONDS.toMillis(l1);
        if (l2 >= 0L) goto _L9; else goto _L8
_L8:
        mDecoder.releaseOutputBuffer(i, false);
_L11:
        nFrameRendered = nFrameRendered + 1L;
        nFrameSkipped = nFrameSkipped + 1L;
        removeFrameFromQ(i);
_L4:
        linkedlist;
        JVM INSTR monitorexit ;
          goto _L10
        obj;
        Log.d("MediaDecoder2Video", "get exception as skip frame with releaseOutputBuffer()");
        mLastFrameRendered = true;
          goto _L11
_L9:
        if (l2 <= 500L)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        mHandler.sendEmptyMessageDelayed(1, l2 - 500L);
        linkedlist;
        JVM INSTR monitorexit ;
        return;
        mTimedReleaseOutputBufferMethod.invoke(mDecoder, new Object[] {
            Integer.valueOf(i), Long.valueOf(System.nanoTime() + l1)
        });
_L12:
        nFrameRendered = nFrameRendered + 1L;
        removeFrameFromQ(i);
        if (mEventListener != null)
        {
            mEventListener.onSampleRendered(false, nFrameRendered, l);
        }
          goto _L4
        obj;
        Log.d("MediaDecoder2Video", "get exception as a result of timed releaseOutputBuffer()");
        mLastFrameRendered = true;
          goto _L12
    }

    void addToRenderer(int i, android.media.MediaCodec.BufferInfo bufferinfo)
    {
        synchronized (mOutputBuffersQ)
        {
            mOutputBuffersQ.add(Integer.valueOf(i));
            mOutputBufferInfo[i] = bufferinfo;
        }
        if (!mPaused && isTimedReleaseSupported())
        {
            mHearbeat.ShowHearbeat();
            tryToReleaseBuffers();
        }
        return;
        bufferinfo;
        linkedlist;
        JVM INSTR monitorexit ;
        throw bufferinfo;
    }

    void createRenderer()
    {
        if (USE_ANDROID_L_API)
        {
            try
            {
                mTimedReleaseOutputBufferMethod = android/media/MediaCodec.getMethod("releaseOutputBuffer", new Class[] {
                    Integer.TYPE, Long.TYPE
                });
                Log.d("MediaDecoder2Video", "use timed buffer release");
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                Log.d("MediaDecoder2Video", "no timed buffer release, use regular method");
            }
        }
        mHandlerThread = new HandlerThread("RenderThreadVideo", -4);
        mHandlerThread.start();
        mHandler = new Handler(mHandlerThread.getLooper()) {

            final MediaDecoder2Video this$0;

            public void handleMessage(Message message)
            {
                mHearbeat.ShowHearbeat();
                message.what;
                JVM INSTR tableswitch 1 2: default 36
            //                           1 45
            //                           2 1258;
                   goto _L1 _L2 _L3
_L1:
                Log.d("MediaDecoder2Video", "RenderThreadVideo had unknown message");
_L5:
                return;
_L2:
                if (!isTimedReleaseSupported())
                {
                    break; /* Loop/switch isn't completed */
                }
                if (!mPaused)
                {
                    tryToReleaseBuffers();
                    return;
                }
                if (true) goto _L5; else goto _L4
_L4:
                Object obj;
                int j;
                long l1;
                j = -1;
                obj = null;
                l1 = 20L;
                LinkedList linkedlist = mOutputBuffersQ;
                linkedlist;
                JVM INSTR monitorenter ;
                int i;
                i = j;
                message = obj;
                if (mOutputBuffersQ.isEmpty())
                {
                    break MISSING_BLOCK_LABEL_157;
                }
                i = j;
                message = obj;
                if (!mPaused)
                {
                    i = ((Integer)mOutputBuffersQ.peekFirst()).intValue();
                    message = mOutputBufferInfo[i];
                }
                if (message == null)
                {
                    break MISSING_BLOCK_LABEL_201;
                }
                if ((((android.media.MediaCodec.BufferInfo) (message)).flags & 4) != 0)
                {
                    Log.d("MediaDecoder2Video", "renderer got buffer BUFFER_FLAG_END_OF_STREAM");
                    if (mEventListener != null)
                    {
                        mEventListener.onEndOfStream(false);
                    }
                }
                long l = l1;
                if (i == -1) goto _L7; else goto _L6
_L6:
                l = l1;
                if (message == null) goto _L7; else goto _L8
_L8:
                l = l1;
                if (mRefClock == null) goto _L7; else goto _L9
_L9:
                long l3 = ((android.media.MediaCodec.BufferInfo) (message)).presentationTimeUs / 1000L;
                if (mRefClock.get() >= 0L) goto _L11; else goto _L10
_L10:
                l = 30L;
_L7:
                linkedlist;
                JVM INSTR monitorexit ;
                if (mDecoderStopped)
                {
                    mLastFrameRendered = true;
                    l1 = -1L;
                    l = l1;
                    if (Log.isLoggable("MediaDecoder2Video", 3))
                    {
                        Log.d("MediaDecoder2Video", (new StringBuilder()).append("EOS: stopped, rendered frame ").append(nFrameRendered).append(",skipped frame ").append(nFrameSkipped).toString());
                        l = l1;
                    }
                }
                if (mLastFrameRendered) goto _L5; else goto _L12
_L12:
label0:
                {
                    if (l <= 60L)
                    {
                        l1 = l;
                        if (l > 0L)
                        {
                            break label0;
                        }
                    }
                    if (Log.isLoggable("MediaDecoder2Video", 3))
                    {
                        Log.d("MediaDecoder2Video", (new StringBuilder()).append("unexpect loop time ").append(l).toString());
                    }
                    l1 = 30L;
                }
                mHandler.sendEmptyMessageDelayed(1, l1);
                return;
_L11:
                long l5 = l3 - mRefClock.get();
                if (l5 > -30L)
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                if (l5 >= 20L) goto _L14; else goto _L13
_L13:
                l = l1;
                if (previousPts <= 0L) goto _L16; else goto _L15
_L15:
                l1 = l3 - previousPts;
                if (l1 < 30L) goto _L18; else goto _L17
_L17:
                l = l1;
                if (l1 <= 50L) goto _L16; else goto _L18
_L16:
                if (!j)
                {
                    break MISSING_BLOCK_LABEL_1348;
                }
                mOutputBuffersQ.removeFirst();
                mOutputBufferInfo[i] = null;
                mDecoder.releaseOutputBuffer(i, true);
_L21:
                long l2 = l + l5;
                Object obj1;
                Exception exception;
                long l4;
                if (l2 > 5L)
                {
                    l = l2 - 5L;
                } else
                {
                    l = l2;
                    if (l2 < 0L)
                    {
                        l = 10L;
                    }
                }
                if (!mFirstFrameRendered)
                {
                    Log.d("MediaDecoder2Video", "first buffer to render");
                    mFirstFrameRendered = true;
                }
                if (mEventListener != null)
                {
                    mEventListener.onSampleRendered(false, nFrameRendered, l3);
                }
                l4 = l3;
                obj1 = message;
                l2 = l;
                if (l5 >= -20L)
                {
                    break MISSING_BLOCK_LABEL_758;
                }
                l4 = l3;
                obj1 = message;
                l2 = l;
                if (!Log.isLoggable("MediaDecoder2Video", 3))
                {
                    break MISSING_BLOCK_LABEL_758;
                }
                Log.d("MediaDecoder2Video", (new StringBuilder()).append("STAT:rendered frame ").append(nFrameRendered).append(" @").append(l3).append(", with delta ").append(l5).append(", next after ").append(l).toString());
                l2 = l;
                obj1 = message;
                l4 = l3;
_L25:
                long l = 
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = MediaDecoder2Video.this;
                super(looper);
            }
        };
    }

    void flushRenderer()
    {
        if (mHandler == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        MediaDecoderPipe2.LocalStateNotifier localstatenotifier = mRenderState;
        localstatenotifier;
        JVM INSTR monitorenter ;
        mHandler.sendEmptyMessage(2);
        mRenderState.wait();
_L1:
        return;
        Object obj;
        obj;
        Log.d("MediaDecoder2Video", "flushRenderer interrupted");
          goto _L1
        obj;
        localstatenotifier;
        JVM INSTR monitorexit ;
        throw obj;
    }

    void pauseRenderer()
    {
        mPaused = true;
    }

    void startRenderer()
    {
        for (mDecoderStopped = false; mLastFrameRendered || mRendererStarted;)
        {
            return;
        }

        Log.d("MediaDecoder2Video", "start rendering");
        mHandler.sendEmptyMessage(1);
        mRendererStarted = true;
    }

    void stopRenderer()
    {
        mDecoderStopped = true;
        if (mHandler != null)
        {
            mHandler.removeMessages(1);
        }
        if (mHandlerThread != null)
        {
            mHandlerThread.quit();
        }
    }

    void unpauseRenderer()
    {
        mPaused = false;
        if (isTimedReleaseSupported())
        {
            mHandler.sendEmptyMessage(1);
        }
    }







/*
    static long access$302(MediaDecoder2Video mediadecoder2video, long l)
    {
        mediadecoder2video.previousPts = l;
        return l;
    }

*/



/*
    static boolean access$402(MediaDecoder2Video mediadecoder2video, boolean flag)
    {
        mediadecoder2video.mLastFrameRendered = flag;
        return flag;
    }

*/



/*
    static boolean access$502(MediaDecoder2Video mediadecoder2video, boolean flag)
    {
        mediadecoder2video.mFirstFrameRendered = flag;
        return flag;
    }

*/



/*
    static long access$608(MediaDecoder2Video mediadecoder2video)
    {
        long l = mediadecoder2video.nFrameRendered;
        mediadecoder2video.nFrameRendered = 1L + l;
        return l;
    }

*/


/*
    static long access$614(MediaDecoder2Video mediadecoder2video, long l)
    {
        l = mediadecoder2video.nFrameRendered + l;
        mediadecoder2video.nFrameRendered = l;
        return l;
    }

*/



/*
    static long access$714(MediaDecoder2Video mediadecoder2video, long l)
    {
        l = mediadecoder2video.nFrameSkipped + l;
        mediadecoder2video.nFrameSkipped = l;
        return l;
    }

*/


}
