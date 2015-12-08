// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.content.Context;
import android.content.Intent;
import com.skype.android.util.CheckedBroadcastReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.skype.android.app.calling:
//            VideoMonitor, VideoFacade

private final class cess._cls600 extends CheckedBroadcastReceiver
{

    final VideoMonitor this$0;

    public final void onReceiveFiltered(Context context, Intent intent, int i)
    {
        i;
        JVM INSTR tableswitch 0 1: default 24
    //                   0 25
    //                   1 48;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (VideoMonitor.access$700(VideoMonitor.this) != null)
        {
            VideoMonitor.access$700(VideoMonitor.this).stop();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (VideoMonitor.access$700(VideoMonitor.this) != null && VideoMonitor.access$800(VideoMonitor.this).get())
        {
            VideoMonitor.access$700(VideoMonitor.this).initialize(lib, VideoMonitor.access$900(VideoMonitor.this), VideoMonitor.access$000(VideoMonitor.this));
            VideoMonitor.access$700(VideoMonitor.this).start();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    er()
    {
        this$0 = VideoMonitor.this;
        super(VideoMonitor.access$600());
    }
}
