// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.JPlayer;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.netflix.mediaclient.Log;
import java.util.LinkedList;

// Referenced classes of package com.netflix.mediaclient.media.JPlayer:
//            MediaDecoder2Video

class this._cls0 extends Handler
{

    final MediaDecoder2Video this$0;

    public void handleMessage(Message message)
    {
        mHearbeat.ShowHearbeat();
        message.what;
        JVM INSTR tableswitch 1 2: default 36
    //                   1 45
    //                   2 1258;
           goto _L1 _L2 _L3
_L1:
        Log.d("MediaDecoder2Video", "RenderThreadVideo had unknown message");
_L5:
        return;
_L2:
        if (!MediaDecoder2Video.access$000(MediaDecoder2Video.this))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!MediaDecoder2Video.access$100(MediaDecoder2Video.this))
        {
            MediaDecoder2Video.access$200(MediaDecoder2Video.this);
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
        if (!MediaDecoder2Video.access$100(MediaDecoder2Video.this))
        {
            i = ((Integer)mOutputBuffersQ.peekFirst()).intValue();
            message = mOutputBufferInfo[i];
        }
        if (message == null)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        if ((((android.media.) (message)).flags & 4) != 0)
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
        long l3 = ((android.media.) (message)).presentationTimeUs / 1000L;
        if (mRefClock.get() >= 0L) goto _L11; else goto _L10
_L10:
        l = 30L;
_L7:
        linkedlist;
        JVM INSTR monitorexit ;
        if (MediaDecoder2Video.access$800(MediaDecoder2Video.this))
        {
            MediaDecoder2Video.access$402(MediaDecoder2Video.this, true);
            l1 = -1L;
            l = l1;
            if (Log.isLoggable("MediaDecoder2Video", 3))
            {
                Log.d("MediaDecoder2Video", (new StringBuilder()).append("EOS: stopped, rendered frame ").append(MediaDecoder2Video.access$600(MediaDecoder2Video.this)).append(",skipped frame ").append(MediaDecoder2Video.access$700(MediaDecoder2Video.this)).toString());
                l = l1;
            }
        }
        if (MediaDecoder2Video.access$400(MediaDecoder2Video.this)) goto _L5; else goto _L12
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
        MediaDecoder2Video.access$900(MediaDecoder2Video.this).sendEmptyMessageDelayed(1, l1);
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
        if (MediaDecoder2Video.access$300(MediaDecoder2Video.this) <= 0L) goto _L16; else goto _L15
_L15:
        l1 = l3 - MediaDecoder2Video.access$300(MediaDecoder2Video.this);
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
        if (!MediaDecoder2Video.access$500(MediaDecoder2Video.this))
        {
            Log.d("MediaDecoder2Video", "first buffer to render");
            MediaDecoder2Video.access$502(MediaDecoder2Video.this, true);
        }
        if (mEventListener != null)
        {
            mEventListener.onSampleRendered(false, MediaDecoder2Video.access$600(MediaDecoder2Video.this), l3);
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
        Log.d("MediaDecoder2Video", (new StringBuilder()).append("STAT:rendered frame ").append(MediaDecoder2Video.access$600(MediaDecoder2Video.this)).append(" @").append(l3).append(", with delta ").append(l5).append(", next after ").append(l).toString());
        l2 = l;
        obj1 = message;
        l4 = l3;
_L25:
        MediaDecoder2Video.access$608(MediaDecoder2Video.this);
        MediaDecoder2Video.access$302(MediaDecoder2Video.this, l4);
        l = l2;
        if (((android.media.) (obj1)).flags != 4) goto _L7; else goto _L19
_L19:
        MediaDecoder2Video.access$402(MediaDecoder2Video.this, true);
        l2 = -1L;
        l = l2;
        if (!Log.isLoggable("MediaDecoder2Video", 3)) goto _L7; else goto _L20
_L20:
        Log.d("MediaDecoder2Video", (new StringBuilder()).append("EOS: has flag, rendered frame ").append(MediaDecoder2Video.access$600(MediaDecoder2Video.this)).append(",skipped frame ").append(MediaDecoder2Video.access$700(MediaDecoder2Video.this)).toString());
        l = l2;
          goto _L7
        message;
        linkedlist;
        JVM INSTR monitorexit ;
        throw message;
        obj1;
        Log.d("MediaDecoder2Video", "get un-documented exception as a result of releaseOutputBuffer()");
        MediaDecoder2Video.access$402(MediaDecoder2Video.this, true);
          goto _L21
_L22:
        if (mOutputBuffersQ.size() <= 1 || l3 > -30L)
        {
            break MISSING_BLOCK_LABEL_1042;
        }
        mOutputBuffersQ.removeFirst();
        mOutputBufferInfo[i] = null;
        mDecoder.releaseOutputBuffer(i, false);
_L23:
        i = ((Integer)mOutputBuffersQ.peekFirst()).intValue();
        message = mOutputBufferInfo[i];
        l = ((android.media.) (message)).presentationTimeUs / 1000L;
        l3 = l - mRefClock.get();
        j++;
          goto _L22
        message;
        Log.d("MediaDecoder2Video", "get un-documented exception as a result of releaseOutputBuffer()");
        MediaDecoder2Video.access$402(MediaDecoder2Video.this, true);
          goto _L23
        MediaDecoder2Video.access$614(MediaDecoder2Video.this, j);
        MediaDecoder2Video.access$714(MediaDecoder2Video.this, j);
        mOutputBuffersQ.removeFirst();
        mOutputBufferInfo[i] = null;
        mDecoder.releaseOutputBuffer(i, true);
_L26:
        l5 = 10L;
        l4 = l;
        obj1 = message;
        l2 = l5;
        if (!Log.isLoggable("MediaDecoder2Video", 3)) goto _L25; else goto _L24
_L24:
        Log.d("MediaDecoder2Video", (new StringBuilder()).append("STAT:REND frame ").append(MediaDecoder2Video.access$600(MediaDecoder2Video.this)).append(" skipped ").append(j).append(" @").append(l).append(", with delta ").append(l3).append(", next after ").append(10L).toString());
        l4 = l;
        obj1 = message;
        l2 = l5;
          goto _L25
        exception;
        Log.d("MediaDecoder2Video", "get un-documented exception as a result of releaseOutputBuffer()");
        MediaDecoder2Video.access$402(MediaDecoder2Video.this, true);
          goto _L26
_L14:
        l2 = l5 - 5L;
        l = l2;
        if (l2 > 50L)
        {
            l = 50L;
        }
          goto _L7
_L3:
        Log.d("MediaDecoder2Video", "render state flushing");
        synchronized (mOutputBuffersQ)
        {
            mOutputBuffersQ.clear();
        }
        synchronized (MediaDecoder2Video.access$1000(MediaDecoder2Video.this))
        {
            MediaDecoder2Video.access$1000(MediaDecoder2Video.this).notify();
        }
        return;
        exception1;
        message;
        JVM INSTR monitorexit ;
        throw exception1;
        exception2;
        message;
        JVM INSTR monitorexit ;
        throw exception2;
_L18:
        l = 30L;
          goto _L16
        j = 0;
        l = l3;
        l3 = l5;
          goto _L22
    }

    k(Looper looper)
    {
        this$0 = MediaDecoder2Video.this;
        super(looper);
    }
}
