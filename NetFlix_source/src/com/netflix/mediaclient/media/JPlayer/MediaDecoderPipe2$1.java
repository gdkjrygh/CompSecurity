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
//            MediaDecoderPipe2

class frameReceived extends Handler
{

    long frameReceived;
    final MediaDecoderPipe2 this$0;

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 4: default 36
    //                   1 50
    //                   2 886
    //                   3 938
    //                   4 982;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        Log.d(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), "outputthread handler had unknown message");
_L21:
        return;
_L2:
        int i = -1;
        if (!MediaDecoderPipe2.access$000(MediaDecoderPipe2.this).isEmpty() || MediaDecoderPipe2.access$100(MediaDecoderPipe2.this)) goto _L7; else goto _L6
_L6:
        int j = mDecoder.dequeueInputBuffer(-1L);
        i = j;
_L9:
        if (i >= 0 && i < MediaDecoderPipe2.access$300(MediaDecoderPipe2.this))
        {
            MediaDecoderPipe2.access$000(MediaDecoderPipe2.this).add(Integer.valueOf(i));
        } else
        {
            Log.d(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), (new StringBuilder()).append("get invlaid buffer index ").append(i).append(" as a result of dequeueInputBuffer()").toString());
        }
_L7:
        if (MediaDecoderPipe2.access$100(MediaDecoderPipe2.this))
        {
            Log.d(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), "inputthread pause");
            return;
        }
          goto _L8
        message;
        Log.d(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), (new StringBuilder()).append("get un-documented exception as a result of dequeueInputBuffer() ").append(message.getMessage()).toString());
          goto _L9
_L8:
        if (MediaDecoderPipe2.access$000(MediaDecoderPipe2.this).isEmpty()) goto _L11; else goto _L10
_L10:
        j = ((Integer)MediaDecoderPipe2.access$000(MediaDecoderPipe2.this).peekFirst()).intValue();
        message = MediaDecoderPipe2.access$400(MediaDecoderPipe2.this)[j];
        message = MediaDecoderPipe2.access$500(MediaDecoderPipe2.this).onRequestData(message);
        if (((utDataSource.BufferMeta) (message)).size <= 0 && ((utDataSource.BufferMeta) (message)).flags == 0) goto _L13; else goto _L12
_L12:
        if (frameReceived <= 0L && Log.isLoggable(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), 3))
        {
            Log.d(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), (new StringBuilder()).append("QueueInput ").append(j).append(" from ").append(((utDataSource.BufferMeta) (message)).offset).append(" size= ").append(((utDataSource.BufferMeta) (message)).size).append(" @").append(((utDataSource.BufferMeta) (message)).timestamp).append(" ms").append(" flags ").append(((utDataSource.BufferMeta) (message)).flags).toString());
        }
        if (mRefClock != null && ((utDataSource.BufferMeta) (message)).timestamp < mRefClock.get() && Log.isLoggable(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), 3))
        {
            Log.d(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), (new StringBuilder()).append("STAT:DEC input late ").append(frameReceived).append(" at ").append(mRefClock.get()).append(" by ").append(((utDataSource.BufferMeta) (message)).timestamp - mRefClock.get()).append(" ms").toString());
        }
        if ((((utDataSource.BufferMeta) (message)).flags & 4) != 0)
        {
            Log.d(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), "got decoder input BUFFER_FLAG_END_OF_STREAM");
        }
        if (!MediaDecoderPipe2.access$600(MediaDecoderPipe2.this)) goto _L15; else goto _L14
_L14:
        android.media.o o;
        o = new android.media.o();
        o.mode = 1;
        if (((utDataSource.BufferMeta) (message)).nByteEncrypted.length != 0) goto _L17; else goto _L16
_L16:
        byte abyte0[] = new byte[16];
        i = 0;
        while (i < abyte0.length) 
        {
            abyte0[i] = 0;
            i++;
        }
        o.iv = abyte0;
        o.key = abyte0;
        o.numBytesOfClearData = (new int[] {
            ((utDataSource.BufferMeta) (message)).size
        });
        o.numBytesOfEncryptedData = (new int[] {
            0
        });
        o.numSubSamples = 1;
_L18:
        mDecoder.queueSecureInputBuffer(j, ((utDataSource.BufferMeta) (message)).offset, o, ((utDataSource.BufferMeta) (message)).timestamp * 1000L, ((utDataSource.BufferMeta) (message)).flags);
_L19:
        MediaDecoderPipe2.access$000(MediaDecoderPipe2.this).removeFirst();
        frameReceived = frameReceived + 1L;
        MediaDecoderPipe2.access$700(MediaDecoderPipe2.this).removeMessages(1);
        MediaDecoderPipe2.access$700(MediaDecoderPipe2.this).sendEmptyMessage(1);
        return;
_L17:
        try
        {
            o.iv = ((utDataSource.BufferMeta) (message)).iv;
            o.key = ((utDataSource.BufferMeta) (message)).key;
            o.numBytesOfClearData = ((utDataSource.BufferMeta) (message)).nByteInClear;
            o.numBytesOfEncryptedData = ((utDataSource.BufferMeta) (message)).nByteEncrypted;
            o.numSubSamples = ((utDataSource.BufferMeta) (message)).nSubsample;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            Log.d(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), (new StringBuilder()).append("get un-documented exception as a result of queueInputBuffer() ").append(message).toString());
            return;
        }
          goto _L18
_L15:
        mDecoder.queueInputBuffer(j, ((utDataSource.BufferMeta) (message)).offset, ((utDataSource.BufferMeta) (message)).size, ((utDataSource.BufferMeta) (message)).timestamp * 1000L, ((utDataSource.BufferMeta) (message)).flags);
          goto _L19
_L13:
        MediaDecoderPipe2.access$700(MediaDecoderPipe2.this).removeMessages(1);
        MediaDecoderPipe2.access$700(MediaDecoderPipe2.this).sendEmptyMessageDelayed(1, 20L);
        return;
          goto _L18
_L11:
        MediaDecoderPipe2.access$700(MediaDecoderPipe2.this).removeMessages(1);
        MediaDecoderPipe2.access$700(MediaDecoderPipe2.this).sendEmptyMessageDelayed(1, 20L);
        return;
_L3:
        MediaDecoderPipe2.access$000(MediaDecoderPipe2.this).clear();
        synchronized (MediaDecoderPipe2.access$800(MediaDecoderPipe2.this))
        {
            MediaDecoderPipe2.access$800(MediaDecoderPipe2.this).notify();
        }
        Log.d(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), "flush input done");
        return;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
_L4:
        Log.d(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), "input is initialized");
        if (mEventListener == null) goto _L21; else goto _L20
_L20:
        mEventListener.onDecoderReady(MediaDecoderPipe2.access$900(MediaDecoderPipe2.this));
        return;
_L5:
        Log.d(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), "input is stopped");
        return;
    }

    ntListener(Looper looper)
    {
        this$0 = MediaDecoderPipe2.this;
        super(looper);
        frameReceived = 0L;
    }
}
