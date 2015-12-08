// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import com.brightcove.player.event.EventEmitter;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            BrightcoveShowHideController, BrightcoveControlBar

final class a
    implements Runnable
{

    private BrightcoveShowHideController a;

    public final void run()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("controlsHeight", Integer.valueOf(BrightcoveShowHideController.a(a).getHeight()));
        BrightcoveShowHideController.b(a).emit("didShowMediaControls", hashmap);
    }

    (BrightcoveShowHideController brightcoveshowhidecontroller)
    {
        a = brightcoveshowhidecontroller;
        super();
    }
}
