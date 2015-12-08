// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.player.subtitles.SubtitleBlock;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            EnhancedSubtitleManager

class ck
    implements Runnable
{

    final EnhancedSubtitleManager this$0;
    final SubtitleBlock val$block;
    final boolean val$show;

    public void run()
    {
        boolean flag = EnhancedSubtitleManager.access$000(EnhancedSubtitleManager.this).remove(this);
        if (Log.isLoggable("nf_subtitles_render", 3))
        {
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Delayed show ").append(val$show).append(" for block ").append(val$block.getId()).toString());
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Removed from pending queue ").append(flag).toString());
        }
        if (val$show)
        {
            Log.w("nf_subtitles_render", "===> showSubtitleBlock was called from pending queue!!");
            EnhancedSubtitleManager.access$100(EnhancedSubtitleManager.this, val$block, null);
            return;
        } else
        {
            EnhancedSubtitleManager.access$200(EnhancedSubtitleManager.this, val$block);
            return;
        }
    }

    ck()
    {
        this$0 = final_enhancedsubtitlemanager;
        val$show = flag;
        val$block = SubtitleBlock.this;
        super();
    }
}
