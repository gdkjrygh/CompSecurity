// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.games.util.VideoHandler;
import com.google.android.gms.games.util.VideoUtils;

// Referenced classes of package com.google.android.gms.games.broker:
//            VideoAgent

final class this._cls0
    implements Runnable
{

    final VideoAgent this$0;

    public final void run()
    {
        if (VideoAgent.access$800(VideoAgent.this) && VideoAgent.access$100(VideoAgent.this) != null)
        {
            VideoUtils.logChatty("VideoAgent", "Stopping mProcessingThread");
            VideoAgent.access$100(VideoAgent.this).removeCallbacksAndMessages(null);
            VideoAgent.access$900(VideoAgent.this).getLooper().quitSafely();
            HandlerThread _tmp = VideoAgent.access$902$7489539a(VideoAgent.this);
            VideoHandler _tmp1 = VideoAgent.access$102$af3d786(VideoAgent.this);
        }
    }

    ()
    {
        this$0 = VideoAgent.this;
        super();
    }
}
