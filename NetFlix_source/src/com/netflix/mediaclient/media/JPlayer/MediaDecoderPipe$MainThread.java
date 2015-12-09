// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.JPlayer;

import android.media.MediaCodec;
import android.os.Process;
import com.netflix.mediaclient.Log;
import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.netflix.mediaclient.media.JPlayer:
//            MediaDecoderPipe

private class <init>
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
        if (!MediaDecoderPipe.access$100(MediaDecoderPipe.this)) goto _L2; else goto _L1
_L1:
        if (!MediaDecoderPipe.access$200(MediaDecoderPipe.this))
        {
            mHearbeat.ShowHearbeat(l, l1);
        }
        l3 = l1;
        l4 = l;
        flag = i;
        if (MediaDecoderPipe.access$300(MediaDecoderPipe.this) == 0) goto _L4; else goto _L3
_L3:
        mLock.lock();
        if (1 == MediaDecoderPipe.access$300(MediaDecoderPipe.this))
        {
            MediaDecoderPipe.access$402(MediaDecoderPipe.this, 2);
            mClock.();
            Log.d(MediaDecoderPipe.access$500(MediaDecoderPipe.this), "paused");
            flag = i;
        } else
        {
label0:
            {
                if (2 != MediaDecoderPipe.access$300(MediaDecoderPipe.this))
                {
                    break label0;
                }
                MediaDecoderPipe.access$402(MediaDecoderPipe.this, 1);
                Log.d(MediaDecoderPipe.access$500(MediaDecoderPipe.this), "unpaused");
                flag = i;
            }
        }
_L10:
        MediaDecoderPipe.access$302(MediaDecoderPipe.this, 0);
        mCommandDone.signal();
        mLock.unlock();
        l4 = l;
        l3 = l1;
_L4:
        if (1 == MediaDecoderPipe.access$400(MediaDecoderPipe.this)) goto _L6; else goto _L5
_L5:
        Thread.sleep(MediaDecoderPipe.access$700(MediaDecoderPipe.this));
        l1 = l3;
        l = l4;
        i = ((flag) ? 1 : 0);
          goto _L7
        interruptedexception;
        Log.e(MediaDecoderPipe.access$500(MediaDecoderPipe.this), "Thead interrupted");
        l1 = l3;
        l = l4;
        i = ((flag) ? 1 : 0);
        if (true) goto _L7; else goto _L8
_L8:
        flag = i;
        if (3 != MediaDecoderPipe.access$300(MediaDecoderPipe.this)) goto _L10; else goto _L9
_L9:
        mDecoder.flush();
        MediaDecoderPipe.access$600(MediaDecoderPipe.this).clear();
        synchronized (mOutputBuffersQ)
        {
            mOutputBuffersQ.clear();
        }
        mClock.();
        l = 0L;
        l1 = 0L;
        if (MediaDecoderPipe.access$200(MediaDecoderPipe.this)) goto _L12; else goto _L11
_L11:
        i = 1;
        if (j == 0) goto _L12; else goto _L13
_L13:
        mLock.unlock();
_L2:
        MediaDecoderPipe.access$102(MediaDecoderPipe.this, false);
        mLock.lock();
        MediaDecoderPipe.access$302(MediaDecoderPipe.this, 0);
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
            Log.e(MediaDecoderPipe.access$500(MediaDecoderPipe.this), "Thead interrupted");
        }
        renderOutput(false);
        try
        {
            mDecoder.stop();
        }
        catch (Exception exception)
        {
            Log.d(MediaDecoderPipe.access$500(MediaDecoderPipe.this), "get un-documented exception as a result of stop/releas() ");
        }
        MediaDecoderPipe.access$402(MediaDecoderPipe.this, 0);
        Log.d(MediaDecoderPipe.access$500(MediaDecoderPipe.this), "stopped");
        if (mEventListener != null)
        {
            mEventListener.onStop();
        }
        return;
        obj;
        Log.d(MediaDecoderPipe.access$500(MediaDecoderPipe.this), "get un-documented exception as a result of flush() ");
        mLock.unlock();
          goto _L2
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
_L12:
        Log.d(MediaDecoderPipe.access$500(MediaDecoderPipe.this), "flushed");
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
        if (!$assertionsDisabled && i >= MediaDecoderPipe.access$800(MediaDecoderPipe.this))
        {
            throw new AssertionError();
        }
        break MISSING_BLOCK_LABEL_721;
        obj1;
        Log.d(MediaDecoderPipe.access$500(MediaDecoderPipe.this), "get un-documented exception as a result of dequeueInputBuffer() ");
          goto _L2
        MediaDecoderPipe.access$600(MediaDecoderPipe.this).add(Integer.valueOf(i));
        l2 = l4;
        flag3 = j;
        flag1 = flag;
        if (MediaDecoderPipe.access$600(MediaDecoderPipe.this).isEmpty())
        {
            break MISSING_BLOCK_LABEL_1336;
        }
        k = ((Integer)MediaDecoderPipe.access$600(MediaDecoderPipe.this).peekFirst()).intValue();
        obj2 = MediaDecoderPipe.access$900(MediaDecoderPipe.this)[k];
        obj2 = MediaDecoderPipe.access$1000(MediaDecoderPipe.this).onRequestData(((java.nio.ByteBuffer) (obj2)));
        if (((urce.BufferMeta) (obj2)).size <= 0)
        {
            l2 = l4;
            flag3 = j;
            flag1 = flag;
            if (((urce.BufferMeta) (obj2)).flags == 0)
            {
                break MISSING_BLOCK_LABEL_1336;
            }
        }
        flag1 = false;
        i = ((flag1) ? 1 : 0);
        flag2 = j;
        ((urce.BufferMeta) (obj2)).flags;
        JVM INSTR lookupswitch 4: default 888
    //                   0: 929
    //                   1: 1267
    //                   2: 1276
    //                   256: 1285;
           goto _L14 _L15 _L16 _L17 _L18
_L18:
        break MISSING_BLOCK_LABEL_1285;
_L15:
        break; /* Loop/switch isn't completed */
_L14:
        Log.e(MediaDecoderPipe.access$500(MediaDecoderPipe.this), (new StringBuilder()).append("unknown flag ").append(((urce.BufferMeta) (obj2)).flags).toString());
        flag2 = j;
        i = ((flag1) ? 1 : 0);
_L19:
        if (l4 <= 0L && Log.isLoggable(MediaDecoderPipe.access$500(MediaDecoderPipe.this), 3))
        {
            Log.d(MediaDecoderPipe.access$500(MediaDecoderPipe.this), (new StringBuilder()).append("QueueInput ").append(k).append(" from ").append(((urce.BufferMeta) (obj2)).offset).append(" size= ").append(((urce.BufferMeta) (obj2)).size).append(" @").append(((urce.BufferMeta) (obj2)).timestamp).append(" ms").append(" flags ").append(i).toString());
        }
        if (mRefClock != null && ((urce.BufferMeta) (obj2)).timestamp < mRefClock.timestamp() && Log.isLoggable(MediaDecoderPipe.access$500(MediaDecoderPipe.this), 3))
        {
            Log.d(MediaDecoderPipe.access$500(MediaDecoderPipe.this), (new StringBuilder()).append("STAT:DEC input late ").append(l4).append(" at ").append(mRefClock._mth0()).append(" by ").append(((urce.BufferMeta) (obj2)).timestamp - mRefClock.timestamp()).append(" ms").toString());
        }
        mDecoder.queueInputBuffer(k, ((urce.BufferMeta) (obj2)).offset, ((urce.BufferMeta) (obj2)).size, ((urce.BufferMeta) (obj2)).timestamp * 1000L, i);
        MediaDecoderPipe.access$600(MediaDecoderPipe.this).removeFirst();
        l = l4 + 1L;
        l2 = l;
        flag3 = flag2;
        flag1 = flag;
        if (MediaDecoderPipe.access$200(MediaDecoderPipe.this))
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
        Log.d(MediaDecoderPipe.access$500(MediaDecoderPipe.this), "Had EOS after flush");
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
        Log.d(MediaDecoderPipe.access$500(MediaDecoderPipe.this), "Had EOS");
          goto _L19
        obj2;
        Log.d(MediaDecoderPipe.access$500(MediaDecoderPipe.this), "get un-documented exception as a result of queueInputBuffer() ");
          goto _L2
        flag1 = false;
        flag3 = flag2;
        l2 = l;
        obj3 = new android.media.();
        i = mDecoder.dequeueOutputBuffer(((android.media.er) (obj3)), 0L);
        if (i != -1) goto _L21; else goto _L20
_L20:
        l4 = l3;
_L23:
        if (!MediaDecoderPipe.access$200(MediaDecoderPipe.this))
        {
            break MISSING_BLOCK_LABEL_1986;
        }
        l1 = l4;
        l = l2;
        j = ((flag3) ? 1 : 0);
        i = ((flag1) ? 1 : 0);
        if (l4 < (long)(MediaDecoderPipe.access$1200(MediaDecoderPipe.this) / 2))
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
        Log.d(MediaDecoderPipe.access$500(MediaDecoderPipe.this), "get un-documented exception as a result of dequeueOutputBuffer() ");
          goto _L2
_L21:
label1:
        {
            if (i != -3)
            {
                break label1;
            }
            Log.d(MediaDecoderPipe.access$500(MediaDecoderPipe.this), "OUTPUT_BUFFERS_CHANGED");
            MediaDecoderPipe.access$1100(MediaDecoderPipe.this);
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
            if (Log.isLoggable(MediaDecoderPipe.access$500(MediaDecoderPipe.this), 3))
            {
                Log.d(MediaDecoderPipe.access$500(MediaDecoderPipe.this), (new StringBuilder()).append("OUTPUT_FORMAT_CHANGED ").append(obj2).toString());
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
        if (!$assertionsDisabled && i >= MediaDecoderPipe.access$1200(MediaDecoderPipe.this))
        {
            throw new AssertionError();
        }
        break MISSING_BLOCK_LABEL_1605;
        obj3;
        obj2;
        JVM INSTR monitorexit ;
        throw obj3;
        mOutputBuffersQ.add(Integer.valueOf(i));
        mOutputBufferInfo[i] = ((android.media.aDecoderPipe.mOutputBufferInfo) (obj3));
        obj2;
        JVM INSTR monitorexit ;
        if (l3 <= 0L && Log.isLoggable(MediaDecoderPipe.access$500(MediaDecoderPipe.this), 3))
        {
            Log.d(MediaDecoderPipe.access$500(MediaDecoderPipe.this), (new StringBuilder()).append("DequeueOutputBuffer ").append(i).append(" size= ").append(((android.media.aDecoderPipe) (obj3)).aDecoderPipe).append(" @").append(((android.media.aDecoderPipe) (obj3)).tationTimeUs / 1000L).append(" ms").toString());
        }
        if (mRefClock != null && ((android.media.aDecoderPipe.mRefClock) (obj3)).tationTimeUs / 1000L <= mRefClock._mth0() && Log.isLoggable(MediaDecoderPipe.access$500(MediaDecoderPipe.this), 3))
        {
            Log.d(MediaDecoderPipe.access$500(MediaDecoderPipe.this), (new StringBuilder()).append("STAT:DEC output late ").append(l3).append(" at ").append(mRefClock._mth0()).append(" by ").append(((android.media.aDecoderPipe.Clock.get) (obj3)).tationTimeUs / 1000L - mRefClock._mth0()).append(" ms").toString());
        }
        l = l3 + 1L;
        j = MediaDecoderPipe.access$1200(MediaDecoderPipe.this) - 3;
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
                if (!MediaDecoderPipe.access$200(MediaDecoderPipe.this))
                {
                    mEventListener.onDecoderStarted();
                    l4 = l;
                }
            }
        }
          goto _L23
        Log.e(MediaDecoderPipe.access$500(MediaDecoderPipe.this), (new StringBuilder()).append(i).append(" is not valid").toString());
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

    private urce.BufferMeta()
    {
        this$0 = MediaDecoderPipe.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
