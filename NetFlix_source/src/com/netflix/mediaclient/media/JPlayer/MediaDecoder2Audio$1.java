// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.JPlayer;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.netflix.mediaclient.Log;
import java.util.LinkedList;

// Referenced classes of package com.netflix.mediaclient.media.JPlayer:
//            MediaDecoder2Audio

class this._cls0 extends Handler
{

    final MediaDecoder2Audio this$0;

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 4: default 36
    //                   1 45
    //                   2 440
    //                   3 360
    //                   4 586;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        Log.d("MediaDecoder2Audio", "RenderThreadAudeo had unknown message");
_L12:
        return;
_L2:
        synchronized (MediaDecoder2Audio.access$000(MediaDecoder2Audio.this))
        {
            if (MediaDecoder2Audio.access$000(MediaDecoder2Audio.this).isPaused())
            {
                MediaDecoder2Audio.access$000(MediaDecoder2Audio.this).onPlaying();
                MediaDecoder2Audio.access$000(MediaDecoder2Audio.this).notify();
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
        if (message == null || (((android.media.) (message)).flags & 4) == 0) goto _L7; else goto _L6
_L6:
        Log.d("MediaDecoder2Audio", "renderer got buffer BUFFER_FLAG_END_OF_STREAM");
        if (mEventListener != null)
        {
            mEventListener.onEndOfStream(true);
        }
_L8:
        message = MediaDecoder2Audio.access$000(MediaDecoder2Audio.this);
        message;
        JVM INSTR monitorenter ;
        if (MediaDecoder2Audio.access$000(MediaDecoder2Audio.this).isPlaying())
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
        long l = MediaDecoder2Audio.access$100(MediaDecoder2Audio.this);
        if (i >= 0)
        {
            MediaDecoder2Audio.access$200(MediaDecoder2Audio.this, i, message, ((java.nio.ByteBuffer) (obj)), l);
        }
        if (!mOutputBuffersQ.isEmpty()) goto _L9; else goto _L8
        message;
        Log.e("MediaDecoder2Audio", (new StringBuilder()).append("getAudioHeaderPosition() has Exception").append(message).toString());
          goto _L8
        MediaDecoder2Audio.access$300(MediaDecoder2Audio.this).sendEmptyMessageDelayed(1, 20L);
          goto _L10
_L4:
        mClock.pause();
        synchronized (MediaDecoder2Audio.access$000(MediaDecoder2Audio.this))
        {
            MediaDecoder2Audio.access$000(MediaDecoder2Audio.this).onPaused();
            MediaDecoder2Audio.access$000(MediaDecoder2Audio.this).notify();
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
        if (MediaDecoder2Audio.access$400(MediaDecoder2Audio.this) != null)
        {
            try
            {
                MediaDecoder2Audio.access$400(MediaDecoder2Audio.this).stop();
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                Log.d("MediaDecoder2Audio", "mAudioTrack already stopped/uninitialized");
            }
            MediaDecoder2Audio.access$400(MediaDecoder2Audio.this).release();
            MediaDecoder2Audio.access$402(MediaDecoder2Audio.this, null);
        }
        MediaDecoder2Audio.access$500(MediaDecoder2Audio.this);
        startRenderer();
        synchronized (MediaDecoder2Audio.access$000(MediaDecoder2Audio.this))
        {
            MediaDecoder2Audio.access$000(MediaDecoder2Audio.this).notify();
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

    k(Looper looper)
    {
        this$0 = MediaDecoder2Audio.this;
        super(looper);
    }
}
