// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.JPlayer;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.netflix.mediaclient.Log;
import java.util.LinkedList;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.media.JPlayer:
//            MediaDecoderPipe

public class VideoDecoderPipe extends MediaDecoderPipe
{
    private class RenderHeartbeat
    {

        static final long HRATBEAT_INTERVAL = 5000L;
        private long mLastBeat;
        final VideoDecoderPipe this$0;

        void ShowHearbeat()
        {
            long l = System.currentTimeMillis();
            if (l >= mLastBeat + 5000L)
            {
                mLastBeat = l;
                if (Log.isLoggable(mTag, 3))
                {
                    Log.d(mTag, (new StringBuilder()).append("render alive, rendered frame ").append(nFrameRendered).append(",skipped frame ").append(nFrameSkipped).toString());
                }
            }
        }

        RenderHeartbeat()
        {
            this$0 = VideoDecoderPipe.this;
            super();
            mLastBeat = System.currentTimeMillis();
        }
    }


    private static final int DEFAULT_LOOPING_TIME = 30;
    private static final int FAST_LOOPING_TIME = 10;
    private static final int MAX_LOOPING_TIME = 50;
    private static final int MSG_RENDER_FRAME = 1;
    private static final int RENDER_SKIP = 30;
    private static final int RENDER_WHIGH = 20;
    private static final int SCHEDULE_OFFSET = 5;
    private static final String TAG = "MediaPipeVideo";
    private static final String renderThreadPriority = "RenderThreadPriority";
    private volatile boolean mDecoderStopped;
    private boolean mFirstFrameRendered;
    private Handler mHandler;
    private HandlerThread mHandlerThread;
    RenderHeartbeat mHearbeat;
    private boolean mLastFrameRendered;
    private boolean mPaused;
    private boolean mRendererStarted;
    private String mTag;
    private long nFrameRendered;
    private long nFrameSkipped;
    private long previousPts;

    public VideoDecoderPipe(MediaDecoderPipe.InputDataSource inputdatasource, String s, MediaFormat mediaformat, Surface surface, String s1, JSONObject jsonobject)
        throws Exception
    {
        super(inputdatasource, s, mediaformat, surface, s1, jsonobject);
        nFrameRendered = 0L;
        nFrameSkipped = 0L;
        mRendererStarted = false;
        mLastFrameRendered = false;
        mFirstFrameRendered = false;
        mPaused = false;
        previousPts = -1L;
        mDecoderStopped = false;
        mHearbeat = new RenderHeartbeat();
        makeHandler();
        inputdatasource = new StringBuilder("MediaPipeVideo");
        inputdatasource.append(s1);
        mTag = inputdatasource.toString();
    }

    private void makeHandler()
    {
        if (isJPlayerThreadConfigured())
        {
            mHandlerThread = new HandlerThread("RenderThread", getThreadPriority("RenderThreadPriority"));
            Log.d(mTag, (new StringBuilder()).append("Thread priority updated:").append(getThreadPriority("RenderThreadPriority")).toString());
        } else
        {
            mHandlerThread = new HandlerThread("RenderThread");
        }
        mHandlerThread.start();
        mHandler = new Handler(mHandlerThread.getLooper()) {

            final VideoDecoderPipe this$0;

            public void handleMessage(Message message)
            {
                mHearbeat.ShowHearbeat();
                message.what;
                JVM INSTR tableswitch 1 1: default 32
            //                           1 46;
                   goto _L1 _L2
_L1:
                Log.d(mTag, "handler had unknown message");
_L12:
                return;
_L2:
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
                if (mOutputBuffersQ.isEmpty()) goto _L4; else goto _L3
_L3:
                i = j;
                message = obj;
                if (!mPaused)
                {
                    i = ((Integer)mOutputBuffersQ.peekFirst()).intValue();
                    message = mOutputBufferInfo[i];
                }
_L4:
                long l = l1;
                if (i == -1) goto _L6; else goto _L5
_L5:
                l = l1;
                if (message == null) goto _L6; else goto _L7
_L7:
                l = l1;
                if (mRefClock == null) goto _L6; else goto _L8
_L8:
                long l3 = ((android.media.MediaCodec.BufferInfo) (message)).presentationTimeUs / 1000L;
                if (mRefClock.get() >= 0L) goto _L10; else goto _L9
_L9:
                l = 30L;
_L6:
                linkedlist;
                JVM INSTR monitorexit ;
                if (mDecoderStopped)
                {
                    mLastFrameRendered = true;
                    l1 = -1L;
                    l = l1;
                    if (Log.isLoggable(mTag, 3))
                    {
                        Log.d(mTag, (new StringBuilder()).append("EOS: stopped, rendered frame ").append(nFrameRendered).append(",skipped frame ").append(nFrameSkipped).toString());
                        l = l1;
                    }
                }
                if (mLastFrameRendered) goto _L12; else goto _L11
_L11:
                if (l > 60L) goto _L14; else goto _L13
_L13:
                l1 = l;
                if (l > 0L) goto _L15; else goto _L14
_L14:
                if (Log.isLoggable(mTag, 3))
                {
                    Log.d(mTag, (new StringBuilder()).append("unexpect loop time ").append(l).toString());
                }
                l1 = 30L;
_L15:
                mHandler.sendEmptyMessageDelayed(1, l1);
                return;
_L10:
                long l5 = l3 - mRefClock.get();
                if (l5 > -30L)
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                if (l5 >= 20L) goto _L17; else goto _L16
_L16:
                l = l1;
                if (previousPts <= 0L) goto _L19; else goto _L18
_L18:
                l1 = l3 - previousPts;
                if (l1 < 30L) goto _L21; else goto _L20
_L20:
                l = l1;
                if (l1 <= 50L) goto _L19; else goto _L21
_L19:
                if (!j) goto _L23; else goto _L22
_L22:
                mOutputBuffersQ.removeFirst();
                mOutputBufferInfo[i] = null;
                mDecoder.releaseOutputBuffer(i, true);
_L26:
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
                    Log.d(mTag, "first buffer to render");
                    mEventListener.onStartRender();
                    mFirstFrameRendered = true;
                }
                obj1 = message;
                l4 = l3;
                l2 = l;
                if (l5 >= -20L)
                {
                    break MISSING_BLOCK_LABEL_702;
                }
                obj1 = message;
                l4 = l3;
                l2 = l;
                if (!Log.isLoggable(mTag, 3))
                {
                    break MISSING_BLOCK_LABEL_702;
                }
                Log.d(mTag, (new StringBuilder()).append("STAT:rendered frame ").append(nFrameRendered).append(" @").append(l3).append(", with delta ").append(l5).append(", next after ").append(l).toString());
                l2 = l;
                l4 = l3;
                obj1 = message;
_L32:
                long l = 
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = VideoDecoderPipe.this;
                super(looper);
            }
        };
    }

    public volatile void flush()
    {
        flush();
    }

    public volatile MediaDecoderPipe.Clock getClock()
    {
        return getClock();
    }

    public volatile boolean isDecoderCreated()
    {
        return isDecoderCreated();
    }

    public volatile boolean isPauseded()
    {
        return isPauseded();
    }

    public volatile boolean isStopped()
    {
        return isStopped();
    }

    public void pause()
    {
        mPaused = true;
        pause();
    }

    boolean renderOutput(boolean flag)
    {
        if (!flag)
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
        } else
        {
            mDecoderStopped = false;
            if (!mLastFrameRendered)
            {
                if (!mRendererStarted)
                {
                    Log.d(mTag, "start rendering");
                    mHandler.sendEmptyMessage(1);
                    mRendererStarted = true;
                }
                return true;
            }
        }
        return false;
    }

    public volatile void setEventListener(MediaDecoderPipe.EventListener eventlistener)
    {
        setEventListener(eventlistener);
    }

    public volatile void setReferenceClock(MediaDecoderPipe.Clock clock)
    {
        setReferenceClock(clock);
    }

    public volatile void start()
    {
        start();
    }

    public volatile void stop()
    {
        stop();
    }

    public void unpause()
    {
        mPaused = false;
        unpause();
    }




/*
    static long access$102(VideoDecoderPipe videodecoderpipe, long l)
    {
        videodecoderpipe.previousPts = l;
        return l;
    }

*/




/*
    static boolean access$302(VideoDecoderPipe videodecoderpipe, boolean flag)
    {
        videodecoderpipe.mLastFrameRendered = flag;
        return flag;
    }

*/



/*
    static boolean access$402(VideoDecoderPipe videodecoderpipe, boolean flag)
    {
        videodecoderpipe.mFirstFrameRendered = flag;
        return flag;
    }

*/



/*
    static long access$508(VideoDecoderPipe videodecoderpipe)
    {
        long l = videodecoderpipe.nFrameRendered;
        videodecoderpipe.nFrameRendered = 1L + l;
        return l;
    }

*/


/*
    static long access$514(VideoDecoderPipe videodecoderpipe, long l)
    {
        l = videodecoderpipe.nFrameRendered + l;
        videodecoderpipe.nFrameRendered = l;
        return l;
    }

*/



/*
    static long access$614(VideoDecoderPipe videodecoderpipe, long l)
    {
        l = videodecoderpipe.nFrameSkipped + l;
        videodecoderpipe.nFrameSkipped = l;
        return l;
    }

*/


}
