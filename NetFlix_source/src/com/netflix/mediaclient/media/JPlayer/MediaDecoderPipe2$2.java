// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.JPlayer;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.media.JPlayer:
//            MediaDecoderPipe2

class frameDecoded extends Handler
{

    long frameDecoded;
    final MediaDecoderPipe2 this$0;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            Log.d(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), "outputthread handler had unknown message");
            return;

        case 1: // '\001'
            if (MediaDecoderPipe2.access$100(MediaDecoderPipe2.this))
            {
                Log.d(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), "outputthread pause");
                return;
            }
            message = new android.media.o();
            int i;
            try
            {
                i = mDecoder.dequeueOutputBuffer(message, -1L);
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                Log.d(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), (new StringBuilder()).append("get un-documented exception as a result of dequeueOutputBuffer() ").append(message.getMessage()).toString());
                return;
            }
            if (i != -1)
            {
                if (i == -3)
                {
                    Log.d(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), "OUTPUT_BUFFERS_CHANGED");
                    MediaDecoderPipe2.access$1000(MediaDecoderPipe2.this);
                } else
                if (i == -2)
                {
                    message = mDecoder.getOutputFormat();
                    if (Log.isLoggable(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), 3))
                    {
                        Log.d(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), (new StringBuilder()).append("OUTPUT_FORMAT_CHANGED ").append(message).toString());
                    }
                } else
                if (i >= 0 && i < MediaDecoderPipe2.access$1100(MediaDecoderPipe2.this))
                {
                    addToRenderer(i, message);
                    if ((((android.media.o) (message)).flags & 4) != 0)
                    {
                        Log.d(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), "got decoder output BUFFER_FLAG_END_OF_STREAM");
                    }
                    if (frameDecoded <= 0L && Log.isLoggable(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), 3))
                    {
                        Log.d(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), (new StringBuilder()).append("DequeueOutputBuffer ").append(i).append(" size= ").append(((android.media.o) (message)).size).append(" @").append(((android.media.o) (message)).presentationTimeUs / 1000L).append(" ms").toString());
                    }
                    if (mRefClock != null && ((android.media.o) (message)).presentationTimeUs / 1000L <= mRefClock.get() && Log.isLoggable(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), 3))
                    {
                        Log.d(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), (new StringBuilder()).append("STAT:DEC output late ").append(frameDecoded).append(" at ").append(mRefClock.get()).append(" by ").append(((android.media.o) (message)).presentationTimeUs / 1000L - mRefClock.get()).append(" ms").toString());
                    }
                    frameDecoded = frameDecoded + 1L;
                    int j;
                    if (MediaDecoderPipe2.access$900(MediaDecoderPipe2.this))
                    {
                        i = MediaDecoderPipe2.access$1100(MediaDecoderPipe2.this) - 1;
                    } else
                    {
                        i = 1;
                    }
                    if (i <= 0)
                    {
                        j = 1;
                    } else
                    {
                        j = i;
                        if (i >= 4)
                        {
                            j = 4;
                        }
                    }
                    if (frameDecoded == (long)j && mEventListener != null)
                    {
                        mEventListener.onDecoderStarted(MediaDecoderPipe2.access$900(MediaDecoderPipe2.this));
                    }
                } else
                {
                    Log.e(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), (new StringBuilder()).append(i).append(" is not valid").toString());
                }
            }
            MediaDecoderPipe2.access$1200(MediaDecoderPipe2.this).removeMessages(1);
            MediaDecoderPipe2.access$1200(MediaDecoderPipe2.this).sendEmptyMessage(1);
            return;

        case 2: // '\002'
            synchronized (MediaDecoderPipe2.access$1300(MediaDecoderPipe2.this))
            {
                MediaDecoderPipe2.access$1300(MediaDecoderPipe2.this).notify();
            }
            frameDecoded = 0L;
            Log.d(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), "flush output done");
            return;

        case 3: // '\003'
            Log.d(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), "output is initialized");
            return;

        case 4: // '\004'
            Log.d(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), "output stopping...");
            try
            {
                mDecoder.stop();
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                Log.d(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), (new StringBuilder()).append("get un-documented exception as a result of stop() ").append(message.getMessage()).toString());
            }
            synchronized (MediaDecoderPipe2.access$1300(MediaDecoderPipe2.this))
            {
                MediaDecoderPipe2.access$1300(MediaDecoderPipe2.this).notify();
            }
            Log.d(MediaDecoderPipe2.access$200(MediaDecoderPipe2.this), "output is stopped");
            return;
        }
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        message;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    ntListener(Looper looper)
    {
        this$0 = MediaDecoderPipe2.this;
        super(looper);
        frameDecoded = 0L;
    }
}
