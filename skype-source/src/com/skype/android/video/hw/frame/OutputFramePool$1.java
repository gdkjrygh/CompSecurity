// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.frame;

import android.media.MediaCodec;
import java.lang.ref.WeakReference;
import java.util.Queue;

// Referenced classes of package com.skype.android.video.hw.frame:
//            OutputFramePool, OutputFrame

class this._cls0
    implements vents
{

    final OutputFramePool this$0;

    public void onBufferReleased(int i)
    {
        MediaCodec mediacodec = (MediaCodec)OutputFramePool.access$100(OutputFramePool.this).get();
        if (mediacodec != null)
        {
            mediacodec.releaseOutputBuffer(i, false);
        }
    }

    public void onFrameReleased(OutputFrame outputframe)
    {
        if (!OutputFramePool.access$000(OutputFramePool.this).add(outputframe))
        {
            throw new IllegalStateException("frame pool is full");
        } else
        {
            return;
        }
    }

    vents()
    {
        this$0 = OutputFramePool.this;
        super();
    }
}
