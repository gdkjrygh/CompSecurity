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
//            VideoDecoderPipe

class this._cls0 extends Handler
{

    final VideoDecoderPipe this$0;

    public void handleMessage(Message message)
    {
        mHearbeat.ShowHearbeat();
        message.what;
        JVM INSTR tableswitch 1 1: default 32
    //                   1 46;
           goto _L1 _L2
_L1:
        Log.d(VideoDecoderPipe.access$200(VideoDecoderPipe.this), "handler had unknown message");
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
        if (!VideoDecoderPipe.access$000(VideoDecoderPipe.this))
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
        long l3 = ((android.media.fo) (message)).presentationTimeUs / 1000L;
        if (mRefClock.get() >= 0L) goto _L10; else goto _L9
_L9:
        l = 30L;
_L6:
        linkedlist;
        JVM INSTR monitorexit ;
        if (VideoDecoderPipe.access$700(VideoDecoderPipe.this))
        {
            VideoDecoderPipe.access$302(VideoDecoderPipe.this, true);
            l1 = -1L;
            l = l1;
            if (Log.isLoggable(VideoDecoderPipe.access$200(VideoDecoderPipe.this), 3))
            {
                Log.d(VideoDecoderPipe.access$200(VideoDecoderPipe.this), (new StringBuilder()).append("EOS: stopped, rendered frame ").append(VideoDecoderPipe.access$500(VideoDecoderPipe.this)).append(",skipped frame ").append(VideoDecoderPipe.access$600(VideoDecoderPipe.this)).toString());
                l = l1;
            }
        }
        if (VideoDecoderPipe.access$300(VideoDecoderPipe.this)) goto _L12; else goto _L11
_L11:
        if (l > 60L) goto _L14; else goto _L13
_L13:
        l1 = l;
        if (l > 0L) goto _L15; else goto _L14
_L14:
        if (Log.isLoggable(VideoDecoderPipe.access$200(VideoDecoderPipe.this), 3))
        {
            Log.d(VideoDecoderPipe.access$200(VideoDecoderPipe.this), (new StringBuilder()).append("unexpect loop time ").append(l).toString());
        }
        l1 = 30L;
_L15:
        VideoDecoderPipe.access$800(VideoDecoderPipe.this).sendEmptyMessageDelayed(1, l1);
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
        if (VideoDecoderPipe.access$100(VideoDecoderPipe.this) <= 0L) goto _L19; else goto _L18
_L18:
        l1 = l3 - VideoDecoderPipe.access$100(VideoDecoderPipe.this);
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
        if (!VideoDecoderPipe.access$400(VideoDecoderPipe.this))
        {
            Log.d(VideoDecoderPipe.access$200(VideoDecoderPipe.this), "first buffer to render");
            mEventListener.onStartRender();
            VideoDecoderPipe.access$402(VideoDecoderPipe.this, true);
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
        if (!Log.isLoggable(VideoDecoderPipe.access$200(VideoDecoderPipe.this), 3))
        {
            break MISSING_BLOCK_LABEL_702;
        }
        Log.d(VideoDecoderPipe.access$200(VideoDecoderPipe.this), (new StringBuilder()).append("STAT:rendered frame ").append(VideoDecoderPipe.access$500(VideoDecoderPipe.this)).append(" @").append(l3).append(", with delta ").append(l5).append(", next after ").append(l).toString());
        l2 = l;
        l4 = l3;
        obj1 = message;
_L32:
        VideoDecoderPipe.access$508(VideoDecoderPipe.this);
        VideoDecoderPipe.access$102(VideoDecoderPipe.this, l4);
        l = l2;
        if (((android.media.fo) (obj1)).flags != 4) goto _L6; else goto _L24
_L24:
        VideoDecoderPipe.access$302(VideoDecoderPipe.this, true);
        l2 = -1L;
        l = l2;
        if (!Log.isLoggable(VideoDecoderPipe.access$200(VideoDecoderPipe.this), 3)) goto _L6; else goto _L25
_L25:
        Log.d(VideoDecoderPipe.access$200(VideoDecoderPipe.this), (new StringBuilder()).append("EOS: has flag, rendered frame ").append(VideoDecoderPipe.access$500(VideoDecoderPipe.this)).append(",skipped frame ").append(VideoDecoderPipe.access$600(VideoDecoderPipe.this)).toString());
        l = l2;
          goto _L6
        message;
        linkedlist;
        JVM INSTR monitorexit ;
        throw message;
        obj1;
        Log.d(VideoDecoderPipe.access$200(VideoDecoderPipe.this), "get un-documented exception as a result of releaseOutputBuffer()");
        VideoDecoderPipe.access$302(VideoDecoderPipe.this, true);
          goto _L26
_L29:
        if (mOutputBuffersQ.size() <= 1 || l5 > -30L) goto _L28; else goto _L27
_L27:
        mOutputBuffersQ.removeFirst();
        mOutputBufferInfo[i] = null;
        mDecoder.releaseOutputBuffer(i, false);
_L30:
        i = ((Integer)mOutputBuffersQ.peekFirst()).intValue();
        message = mOutputBufferInfo[i];
        l = ((android.media.fo) (message)).presentationTimeUs / 1000L;
        l5 = l - mRefClock.get();
        j++;
          goto _L29
        message;
        Log.d(VideoDecoderPipe.access$200(VideoDecoderPipe.this), "get un-documented exception as a result of releaseOutputBuffer()");
        VideoDecoderPipe.access$302(VideoDecoderPipe.this, true);
          goto _L30
_L28:
        VideoDecoderPipe.access$514(VideoDecoderPipe.this, j);
        VideoDecoderPipe.access$614(VideoDecoderPipe.this, j);
        mOutputBuffersQ.removeFirst();
        mOutputBufferInfo[i] = null;
        mDecoder.releaseOutputBuffer(i, true);
_L33:
        l3 = 10L;
        obj1 = message;
        l4 = l;
        l2 = l3;
        if (!Log.isLoggable(VideoDecoderPipe.access$200(VideoDecoderPipe.this), 3)) goto _L32; else goto _L31
_L31:
        Log.d(VideoDecoderPipe.access$200(VideoDecoderPipe.this), (new StringBuilder()).append("STAT:REND frame ").append(VideoDecoderPipe.access$500(VideoDecoderPipe.this)).append(" skipped ").append(j).append(" @").append(l).append(", with delta ").append(l5).append(", next after ").append(10L).toString());
        obj1 = message;
        l4 = l;
        l2 = l3;
          goto _L32
        exception;
        Log.d(VideoDecoderPipe.access$200(VideoDecoderPipe.this), "get un-documented exception as a result of releaseOutputBuffer()");
        VideoDecoderPipe.access$302(VideoDecoderPipe.this, true);
          goto _L33
_L17:
        l2 = l5 - 5L;
        l = l2;
        if (l2 > 50L)
        {
            l = 50L;
        }
          goto _L6
_L21:
        l = 30L;
          goto _L19
_L23:
        j = 0;
        l = l3;
          goto _L29
    }

    entListener(Looper looper)
    {
        this$0 = VideoDecoderPipe.this;
        super(looper);
    }
}
