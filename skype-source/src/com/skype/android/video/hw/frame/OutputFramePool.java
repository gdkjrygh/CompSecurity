// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.frame;

import android.media.MediaCodec;
import com.skype.android.video.hw.utils.DebugUtils;
import com.skype.android.video.hw.utils.Log;
import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

// Referenced classes of package com.skype.android.video.hw.frame:
//            OutputFrame

public class OutputFramePool
    implements Closeable
{

    private final OutputFrame.FrameEvents frameEventsHandler = new OutputFrame.FrameEvents() {

        final OutputFramePool this$0;

        public void onBufferReleased(int k)
        {
            MediaCodec mediacodec1 = (MediaCodec)weakMediaCodec.get();
            if (mediacodec1 != null)
            {
                mediacodec1.releaseOutputBuffer(k, false);
            }
        }

        public void onFrameReleased(OutputFrame outputframe)
        {
            if (!frames.add(outputframe))
            {
                throw new IllegalStateException("frame pool is full");
            } else
            {
                return;
            }
        }

            
            {
                this$0 = OutputFramePool.this;
                super();
            }
    };
    private final Queue frames;
    private long nativeObj;
    private boolean reconfig;
    private final WeakReference weakMediaCodec;

    public OutputFramePool(int i, MediaCodec mediacodec)
    {
        nativeObj = createNativeObj(this);
        reconfig = false;
        weakMediaCodec = new WeakReference(mediacodec);
        frames = new ArrayBlockingQueue(i);
        for (int j = 0; j < i; j++)
        {
            frames.add(new OutputFrame(frameEventsHandler, nativeObj));
        }

    }

    private native long createNativeObj(OutputFramePool outputframepool);

    private native void deleteNativeObj(long l);

    public void close()
        throws IOException
    {
        deleteNativeObj(nativeObj);
    }

    public OutputFrame poll()
    {
        OutputFrame outputframe = (OutputFrame)frames.poll();
        if (outputframe != null)
        {
            outputframe.open();
        }
        return outputframe;
    }

    public int releaseBuffer(int i)
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append(" ReleaseBuffer ").append(i).toString());
        }
        if (reconfig)
        {
            reconfig = false;
        } else
        {
            MediaCodec mediacodec = (MediaCodec)weakMediaCodec.get();
            if (mediacodec != null)
            {
                mediacodec.releaseOutputBuffer(i, false);
                return 0;
            }
        }
        return 0;
    }

    public void setReconfigFlag(boolean flag)
    {
        reconfig = flag;
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [frames=").append(frames).append("]").toString();
    }


}
