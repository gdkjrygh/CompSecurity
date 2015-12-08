// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.JPlayer;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Process;
import android.view.Surface;
import com.netflix.mediaclient.Log;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

abstract class MediaDecoderPipe
{
    public class Clock
    {

        private long mLastPts;
        private long mLastUpdateTime;
        private boolean mRunning;
        final MediaDecoderPipe this$0;

        public void flush()
        {
            mLastPts = -1L;
            mLastUpdateTime = -1L;
        }

        public long get()
        {
            if (mLastPts < 0L)
            {
                return -1L;
            }
            if (mRunning && mLastUpdateTime >= 0L)
            {
                long l = System.currentTimeMillis();
                long l1 = mLastUpdateTime;
                return mLastPts + (l - l1);
            } else
            {
                return mLastPts;
            }
        }

        public long pause()
        {
            long l = System.currentTimeMillis();
            long l1 = mLastUpdateTime;
            if (mLastPts >= 0L)
            {
                mLastPts = mLastPts + (l - l1);
            }
            mRunning = false;
            mLastUpdateTime = -1L;
            return mLastPts;
        }

        public long unpause()
        {
            mRunning = true;
            return mLastPts;
        }

        public void update(long l)
        {
            mLastPts = l;
            mLastUpdateTime = System.currentTimeMillis();
            unpause();
        }

        Clock()
        {
            this$0 = MediaDecoderPipe.this;
            super();
            mLastPts = -1L;
            mLastUpdateTime = -1L;
            mRunning = false;
        }

        Clock(long l)
        {
            this$0 = MediaDecoderPipe.this;
            super();
            mLastPts = l;
            mLastUpdateTime = -1L;
            mRunning = false;
        }
    }

    private class DecoderHeartbeat
    {

        static final long HRATBEAT_INTERVAL = 5000L;
        private long mLastBeat;
        final MediaDecoderPipe this$0;

        void ShowHearbeat(long l, long l1)
        {
            long l2 = System.currentTimeMillis();
            if (l2 >= mLastBeat + 5000L)
            {
                mLastBeat = l2;
                if (Log.isLoggable(mTag, 3))
                {
                    Log.d(mTag, (new StringBuilder()).append("decoder alive, received frame ").append(l).append(",decoded frame ").append(l1).toString());
                }
            }
        }

        DecoderHeartbeat()
        {
            this$0 = MediaDecoderPipe.this;
            super();
            mLastBeat = System.currentTimeMillis();
        }
    }

    public static interface EventListener
    {

        public abstract void onDecoderStarted();

        public abstract void onStartRender();

        public abstract void onStop();
    }

    public static interface InputDataSource
    {

        public abstract BufferMeta onRequestData(ByteBuffer bytebuffer);
    }

    public static class InputDataSource.BufferMeta
    {

        int flags;
        int offset;
        int size;
        long timestamp;

        public InputDataSource.BufferMeta()
        {
        }
    }

    private class MainThread
        implements Runnable
    {

        static final boolean $assertionsDisabled;
        final MediaDecoderPipe this$0;

        public void run()
        {
            int i;
            int j;
            boolean flag;
            long l;
            long l1;
            long l3;
            long l4;
            InterruptedException interruptedexception;
            if (isJPlayerThreadConfigured())
            {
                try
                {
                    Process.setThreadPriority(getThreadPriority("MediaThreadPriority"));
                    Log.d("MediaPipe", (new StringBuilder()).append("Updating thread priority: ").append(getThreadPriority("MediaThreadPriority")).toString());
                }
                catch (SecurityException securityexception)
                {
                    Log.e("MediaPipe", (new StringBuilder()).append("fail to setPriority ").append(securityexception).toString());
                }
            }
            j = 0;
            i = 0;
            l = 0L;
            l1 = 0L;
_L7:
            if (!mRunningMainThread) goto _L2; else goto _L1
_L1:
            if (!mIsAudio)
            {
                mHearbeat.ShowHearbeat(l, l1);
            }
            l3 = l1;
            l4 = l;
            flag = i;
            if (mCommand == 0) goto _L4; else goto _L3
_L3:
            mLock.lock();
            if (1 == mCommand)
            {
                mState = 2;
                mClock.pause();
                Log.d(mTag, "paused");
                flag = i;
            } else
            {
label0:
                {
                    if (2 != mCommand)
                    {
                        break label0;
                    }
                    mState = 1;
                    Log.d(mTag, "unpaused");
                    flag = i;
                }
            }
_L10:
            mCommand = 0;
            mCommandDone.signal();
            mLock.unlock();
            l4 = l;
            l3 = l1;
_L4:
            if (1 == mState) goto _L6; else goto _L5
_L5:
            Thread.sleep(mSleepMs);
            l1 = l3;
            l = l4;
            i = ((flag) ? 1 : 0);
              goto _L7
            interruptedexception;
            Log.e(mTag, "Thead interrupted");
            l1 = l3;
            l = l4;
            i = ((flag) ? 1 : 0);
            if (true) goto _L7; else goto _L8
_L8:
            flag = i;
            if (3 != mCommand) goto _L10; else goto _L9
_L9:
            mDecoder.flush();
            mInputBuffersQ.clear();
            synchronized (mOutputBuffersQ)
            {
                mOutputBuffersQ.clear();
            }
            mClock.flush();
            l = 0L;
            l1 = 0L;
            if (mIsAudio) goto _L12; else goto _L11
_L11:
            i = 1;
            if (j == 0) goto _L12; else goto _L13
_L13:
            mLock.unlock();
_L2:
            mRunningMainThread = false;
            mLock.lock();
            mCommand = 0;
            mCommandDone.signalAll();
            mLock.unlock();
            Object obj1;
            Object obj2;
            Object obj3;
            boolean flag1;
            boolean flag2;
            boolean flag3;
            int k;
            long l2;
            try
            {
                Thread.sleep(100L);
            }
            catch (InterruptedException interruptedexception1)
            {
                Log.e(mTag, "Thead interrupted");
            }
            renderOutput(false);
            try
            {
                mDecoder.stop();
            }
            catch (Exception exception)
            {
                Log.d(mTag, "get un-documented exception as a result of stop/releas() ");
            }
            mState = 0;
            Log.d(mTag, "stopped");
            if (mEventListener != null)
            {
                mEventListener.onStop();
            }
            return;
            obj;
            Log.d(mTag, "get un-documented exception as a result of flush() ");
            mLock.unlock();
              goto _L2
            exception1;
            obj;
            JVM INSTR monitorexit ;
            throw exception1;
_L12:
            Log.d(mTag, "flushed");
            flag = i;
              goto _L10
            obj1;
            mLock.unlock();
            throw obj1;
_L6:
            l2 = l4;
            flag3 = j;
            flag1 = flag;
            if (j != 0)
            {
                break MISSING_BLOCK_LABEL_1336;
            }
            i = mDecoder.dequeueInputBuffer(0L);
            if (i < 0)
            {
                break MISSING_BLOCK_LABEL_736;
            }
            if (!$assertionsDisabled && i >= mInputBufferCnt)
            {
                throw new AssertionError();
            }
            break MISSING_BLOCK_LABEL_721;
            obj1;
            Log.d(mTag, "get un-documented exception as a result of dequeueInputBuffer() ");
              goto _L2
            mInputBuffersQ.add(Integer.valueOf(i));
            l2 = l4;
            flag3 = j;
            flag1 = flag;
            if (mInputBuffersQ.isEmpty())
            {
                break MISSING_BLOCK_LABEL_1336;
            }
            k = ((Integer)mInputBuffersQ.peekFirst()).intValue();
            obj2 = mInputBuffers[k];
            obj2 = mDataSource.onRequestData(((ByteBuffer) (obj2)));
            if (((InputDataSource.BufferMeta) (obj2)).size <= 0)
            {
                l2 = l4;
                flag3 = j;
                flag1 = flag;
                if (((InputDataSource.BufferMeta) (obj2)).flags == 0)
                {
                    break MISSING_BLOCK_LABEL_1336;
                }
            }
            flag1 = false;
            i = ((flag1) ? 1 : 0);
            flag2 = j;
            ((InputDataSource.BufferMeta) (obj2)).flags;
            JVM INSTR lookupswitch 4: default 888
        //                       0: 929
        //                       1: 1267
        //                       2: 1276
        //                       256: 1285;
               goto _L14 _L15 _L16 _L17 _L18
_L18:
            break MISSING_BLOCK_LABEL_1285;
_L15:
            break; /* Loop/switch isn't completed */
_L14:
            Log.e(mTag, (new StringBuilder()).append("unknown flag ").append(((InputDataSource.BufferMeta) (obj2)).flags).toString());
            flag2 = j;
            i = ((flag1) ? 1 : 0);
_L19:
            if (l4 <= 0L && Log.isLoggable(mTag, 3))
            {
                Log.d(mTag, (new StringBuilder()).append("QueueInput ").append(k).append(" from ").append(((InputDataSource.BufferMeta) (obj2)).offset).append(" size= ").append(((InputDataSource.BufferMeta) (obj2)).size).append(" @").append(((InputDataSource.BufferMeta) (obj2)).timestamp).append(" ms").append(" flags ").append(i).toString());
            }
            if (mRefClock != null && ((InputDataSource.BufferMeta) (obj2)).timestamp < mRefClock.get() && Log.isLoggable(mTag, 3))
            {
                Log.d(mTag, (new StringBuilder()).append("STAT:DEC input late ").append(l4).append(" at ").append(mRefClock.get()).append(" by ").append(((InputDataSource.BufferMeta) (obj2)).timestamp - mRefClock.get()).append(" ms").toString());
            }
            mDecoder.queueInputBuffer(k, ((InputDataSource.BufferMeta) (obj2)).offset, ((InputDataSource.BufferMeta) (obj2)).size, ((InputDataSource.BufferMeta) (obj2)).timestamp * 1000L, i);
            mInputBuffersQ.removeFirst();
            l = l4 + 1L;
            l2 = l;
            flag3 = flag2;
            flag1 = flag;
            if (mIsAudio)
            {
                break MISSING_BLOCK_LABEL_1336;
            }
            l2 = l;
            flag3 = flag2;
            flag1 = flag;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_1336;
            }
            if (!flag2)
            {
                break MISSING_BLOCK_LABEL_1325;
            }
            Log.d(mTag, "Had EOS after flush");
              goto _L2
_L16:
            i = 2;
            flag2 = j;
              goto _L19
_L17:
            i = 1;
            flag2 = j;
              goto _L19
            i = 4;
            flag2 = true;
            Log.d(mTag, "Had EOS");
              goto _L19
            obj2;
            Log.d(mTag, "get un-documented exception as a result of queueInputBuffer() ");
              goto _L2
            flag1 = false;
            flag3 = flag2;
            l2 = l;
            obj3 = new android.media.MediaCodec.BufferInfo();
            i = mDecoder.dequeueOutputBuffer(((android.media.MediaCodec.BufferInfo) (obj3)), 0L);
            if (i != -1) goto _L21; else goto _L20
_L20:
            l4 = l3;
_L23:
            if (!mIsAudio)
            {
                break MISSING_BLOCK_LABEL_1986;
            }
            l1 = l4;
            l = l2;
            j = ((flag3) ? 1 : 0);
            i = ((flag1) ? 1 : 0);
            if (l4 < (long)(mOutputBufferCnt / 2))
            {
                break; /* Loop/switch isn't completed */
            }
            l1 = l4;
            l = l2;
            j = ((flag3) ? 1 : 0);
            i = ((flag1) ? 1 : 0);
            if (renderOutput(true))
            {
                break; /* Loop/switch isn't completed */
            }
              goto _L2
            obj2;
            Log.d(mTag, "get un-documented exception as a result of dequeueOutputBuffer() ");
              goto _L2
_L21:
label1:
            {
                if (i != -3)
                {
                    break label1;
                }
                Log.d(mTag, "OUTPUT_BUFFERS_CHANGED");
                configureOutputBuffers();
                l4 = l3;
            }
            if (true) goto _L23; else goto _L22
_L22:
label2:
            {
                if (i != -2)
                {
                    break label2;
                }
                obj2 = mDecoder.getOutputFormat();
                l4 = l3;
                if (Log.isLoggable(mTag, 3))
                {
                    Log.d(mTag, (new StringBuilder()).append("OUTPUT_FORMAT_CHANGED ").append(obj2).toString());
                    l4 = l3;
                }
            }
            if (true) goto _L23; else goto _L24
_L24:
            if (i < 0)
            {
                break MISSING_BLOCK_LABEL_1948;
            }
            obj2 = mOutputBuffersQ;
            obj2;
            JVM INSTR monitorenter ;
            if (!$assertionsDisabled && i >= mOutputBufferCnt)
            {
                throw new AssertionError();
            }
            break MISSING_BLOCK_LABEL_1605;
            obj3;
            obj2;
            JVM INSTR monitorexit ;
            throw obj3;
            mOutputBuffersQ.add(Integer.valueOf(i));
            mOutputBufferInfo[i] = ((android.media.MediaCodec.BufferInfo) (obj3));
            obj2;
            JVM INSTR monitorexit ;
            if (l3 <= 0L && Log.isLoggable(mTag, 3))
            {
                Log.d(mTag, (new StringBuilder()).append("DequeueOutputBuffer ").append(i).append(" size= ").append(((android.media.MediaCodec.BufferInfo) (obj3)).size).append(" @").append(((android.media.MediaCodec.BufferInfo) (obj3)).presentationTimeUs / 1000L).append(" ms").toString());
            }
            if (mRefClock != null && ((android.media.MediaCodec.BufferInfo) (obj3)).presentationTimeUs / 1000L <= mRefClock.get() && Log.isLoggable(mTag, 3))
            {
                Log.d(mTag, (new StringBuilder()).append("STAT:DEC output late ").append(l3).append(" at ").append(mRefClock.get()).append(" by ").append(((android.media.MediaCodec.BufferInfo) (obj3)).presentationTimeUs / 1000L - mRefClock.get()).append(" ms").toString());
            }
            l = l3 + 1L;
            j = mOutputBufferCnt - 3;
            if (j <= 0)
            {
                i = 1;
            } else
            {
                i = j;
                if (j >= 4)
                {
                    i = 4;
                }
            }
            l4 = l;
            if (l == (long)i)
            {
                l4 = l;
                if (mEventListener != null)
                {
                    l4 = l;
                    if (!mIsAudio)
                    {
                        mEventListener.onDecoderStarted();
                        l4 = l;
                    }
                }
            }
              goto _L23
            Log.e(mTag, (new StringBuilder()).append(i).append(" is not valid").toString());
            l4 = l3;
              goto _L23
            l1 = l4;
            l = l2;
            j = ((flag3) ? 1 : 0);
            i = ((flag1) ? 1 : 0);
            if (renderOutput(true)) goto _L7; else goto _L2
            obj2;
            mLock.unlock();
            throw obj2;
        }

        static 
        {
            boolean flag;
            if (!com/netflix/mediaclient/media/JPlayer/MediaDecoderPipe.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            $assertionsDisabled = flag;
        }

        private MainThread()
        {
            this$0 = MediaDecoderPipe.this;
            super();
        }

    }


    static final boolean $assertionsDisabled;
    static final int COMMAND_FLUSH = 3;
    static final int COMMAND_NONE = 0;
    static final int COMMAND_PAUSE = 1;
    static final int COMMAND_STOP = 4;
    static final int COMMAND_UNPAUSE = 2;
    static final int STATE_INIT = -1;
    static final int STATE_PAUSED = 2;
    static final int STATE_PLAYING = 1;
    static final int STATE_STOPPED = 0;
    private static final String TAG = "MediaPipe";
    private static final String mediaThreadPriority = "MediaThreadPriority";
    protected Clock mClock;
    private volatile int mCommand;
    final Condition mCommandDone;
    private InputDataSource mDataSource;
    protected MediaCodec mDecoder;
    private boolean mDecoderCreadted;
    protected EventListener mEventListener;
    DecoderHeartbeat mHearbeat;
    private int mInputBufferCnt;
    private ByteBuffer mInputBuffers[];
    private LinkedList mInputBuffersQ;
    private boolean mIsAudio;
    private JSONObject mJPlayerConfig;
    final Lock mLock = new ReentrantLock();
    private Thread mMainThread;
    private int mOutputBufferCnt;
    protected android.media.MediaCodec.BufferInfo mOutputBufferInfo[];
    protected ByteBuffer mOutputBuffers[];
    protected LinkedList mOutputBuffersQ;
    protected Clock mRefClock;
    private volatile boolean mRunningMainThread;
    private int mSleepMs;
    private volatile int mState;
    private String mTag;

    public MediaDecoderPipe(InputDataSource inputdatasource, String s, MediaFormat mediaformat, Surface surface, String s1, JSONObject jsonobject)
        throws Exception
    {
        mDecoder = null;
        mRunningMainThread = false;
        mCommandDone = mLock.newCondition();
        mSleepMs = 10;
        mJPlayerConfig = null;
        mHearbeat = new DecoderHeartbeat();
        StringBuilder stringbuilder = new StringBuilder("MediaPipe");
        mJPlayerConfig = jsonobject;
        if (s.startsWith("audio/"))
        {
            mIsAudio = true;
            stringbuilder.append("Audio");
            stringbuilder.append(s1);
            mTag = stringbuilder.toString();
        } else
        {
            if (!s.startsWith("video/"))
            {
                continue;
            }
            mIsAudio = false;
            stringbuilder.append("Video");
            stringbuilder.append(s1);
            mTag = stringbuilder.toString();
        }
label0:
        do
        {
            do
            {
                Log.d(mTag, "creating ... ");
                mDecoderCreadted = false;
                mDataSource = inputdatasource;
                mDecoder = MediaCodec.createDecoderByType(s);
                if (!$assertionsDisabled && mDecoder == null)
                {
                    throw new AssertionError();
                }
                break label0;
            } while (!Log.isLoggable(mTag, 6));
            Log.e(mTag, (new StringBuilder()).append(s).append(" is not valid").toString());
            if (!$assertionsDisabled)
            {
                throw new AssertionError();
            }
        } while (true);
        if (Log.isLoggable(mTag, 3))
        {
            Log.d(mTag, (new StringBuilder()).append("configuring with input format ").append(mediaformat).toString());
        }
        mDecoder.configure(mediaformat, surface, null, 0);
        mDecoder.start();
        mInputBuffers = mDecoder.getInputBuffers();
        mInputBufferCnt = mInputBuffers.length;
        if (Log.isLoggable(mTag, 3))
        {
            Log.d(mTag, (new StringBuilder()).append("has ").append(mInputBufferCnt).append(" input buffers").toString());
        }
        if (!$assertionsDisabled && mInputBufferCnt <= 0)
        {
            throw new AssertionError();
        } else
        {
            mInputBuffersQ = new LinkedList();
            mOutputBuffersQ = new LinkedList();
            configureOutputBuffers();
            mState = -1;
            mDecoderCreadted = true;
            return;
        }
    }

    private void configureOutputBuffers()
    {
        mOutputBuffers = mDecoder.getOutputBuffers();
        mOutputBufferCnt = mOutputBuffers.length;
        if (Log.isLoggable(mTag, 3))
        {
            Log.d(mTag, (new StringBuilder()).append("has ").append(mOutputBufferCnt).append(" output buffers").toString());
        }
        if (!$assertionsDisabled && mOutputBufferCnt <= 0)
        {
            throw new AssertionError();
        } else
        {
            mOutputBufferInfo = new android.media.MediaCodec.BufferInfo[mOutputBufferCnt];
            return;
        }
    }

    public void flush()
    {
        Log.d(mTag, "to flush");
        if (!mRunningMainThread || 1 != mState && 2 != mState)
        {
            Log.d(mTag, "no action");
            return;
        }
        mLock.lock();
        if (mCommand != 0)
        {
            Log.d(mTag, "no action 2");
            mLock.unlock();
            return;
        }
        mCommand = 3;
        mCommandDone.await();
        mLock.unlock();
_L2:
        Log.d(mTag, "flush done");
        return;
        Object obj;
        obj;
        Log.d("MediaPipe", "command is interrupted");
        mLock.unlock();
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        mLock.unlock();
        throw obj;
    }

    public Clock getClock()
    {
        return mClock;
    }

    protected int getThreadPriority(String s)
    {
        int i;
        int j;
        i = 0;
        j = 0;
        if (mJPlayerConfig == null) goto _L2; else goto _L1
_L1:
        i = mJPlayerConfig.getInt(s);
        j = i;
_L6:
        if (j < -19) goto _L4; else goto _L3
_L3:
        i = j;
        if (j <= 19) goto _L2; else goto _L4
_L4:
        i = 0;
_L2:
        if (Log.isLoggable(mTag, 3))
        {
            Log.d(mTag, (new StringBuilder()).append("ThreadPriority ").append(i).toString());
        }
        return i;
        s;
        Log.e("MediaPipe", (new StringBuilder()).append("Failed to extract JPlayerThreadPriority ").append(s).toString());
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean isDecoderCreated()
    {
        return mDecoderCreadted;
    }

    protected boolean isJPlayerThreadConfigured()
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        if (mJPlayerConfig == null) goto _L2; else goto _L1
_L1:
        flag1 = mJPlayerConfig.getBoolean("JPlayerThreadConfig");
        flag = flag1;
_L4:
        flag1 = flag;
        if (Log.isLoggable(mTag, 3))
        {
            Log.d(mTag, (new StringBuilder()).append("JPlayerThreadConfig ").append(flag).toString());
            flag1 = flag;
        }
_L2:
        return flag1;
        JSONException jsonexception;
        jsonexception;
        Log.e("MediaPipe", (new StringBuilder()).append("Failed to extract JPlayerThreadConfig ").append(jsonexception).toString());
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean isPauseded()
    {
        return mState == 2;
    }

    public boolean isStopped()
    {
        return mState == 0;
    }

    public void pause()
    {
        Log.d(mTag, "to pause");
        if (1 != mState || !mRunningMainThread)
        {
            Log.d(mTag, "no action");
            return;
        }
        mLock.lock();
        if (mCommand != 0)
        {
            Log.d(mTag, "no action 2");
            mLock.unlock();
            return;
        }
        mCommand = 1;
        while (2 != mState && mRunningMainThread) 
        {
            mCommandDone.await();
        }
          goto _L1
        Object obj;
        obj;
        Log.d("MediaPipe", "command is interrupted");
        mLock.unlock();
_L3:
        Log.d(mTag, "pause done");
        return;
_L1:
        mLock.unlock();
        if (true) goto _L3; else goto _L2
_L2:
        obj;
        mLock.unlock();
        throw obj;
    }

    abstract boolean renderOutput(boolean flag);

    public void setEventListener(EventListener eventlistener)
    {
        mEventListener = eventlistener;
    }

    public void setReferenceClock(Clock clock)
    {
        mRefClock = clock;
    }

    public void start()
    {
        mClock = new Clock();
        mRunningMainThread = true;
        mCommand = 0;
        mState = 1;
        mMainThread = new Thread(new MainThread(), mTag);
        mMainThread.start();
    }

    public void stop()
    {
        mRunningMainThread = false;
        try
        {
            mMainThread.join();
        }
        catch (InterruptedException interruptedexception)
        {
            Log.e(mTag, "MainThread is interrupted");
        }
        try
        {
            mDecoder.release();
        }
        catch (Exception exception)
        {
            Log.d(mTag, "get un-documented exception as a result of releas() ");
        }
        Log.d(mTag, "released");
    }

    public void unpause()
    {
        Log.d(mTag, "to unpause");
        if (1 == mState || !mRunningMainThread)
        {
            Log.d(mTag, "no action");
            return;
        }
        mLock.lock();
        if (mCommand != 0)
        {
            Log.d(mTag, "no action 2");
            mLock.unlock();
            return;
        }
        mCommand = 2;
        while (1 != mState && mRunningMainThread) 
        {
            mCommandDone.await();
        }
          goto _L1
        Object obj;
        obj;
        Log.d("MediaPipe", "command is interrupted");
        mLock.unlock();
_L3:
        Log.d(mTag, "unpause done");
        return;
_L1:
        mLock.unlock();
        if (true) goto _L3; else goto _L2
_L2:
        obj;
        mLock.unlock();
        throw obj;
    }

    static 
    {
        boolean flag;
        if (!com/netflix/mediaclient/media/JPlayer/MediaDecoderPipe.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }




/*
    static boolean access$102(MediaDecoderPipe mediadecoderpipe, boolean flag)
    {
        mediadecoderpipe.mRunningMainThread = flag;
        return flag;
    }

*/






/*
    static int access$302(MediaDecoderPipe mediadecoderpipe, int i)
    {
        mediadecoderpipe.mCommand = i;
        return i;
    }

*/



/*
    static int access$402(MediaDecoderPipe mediadecoderpipe, int i)
    {
        mediadecoderpipe.mState = i;
        return i;
    }

*/





}
