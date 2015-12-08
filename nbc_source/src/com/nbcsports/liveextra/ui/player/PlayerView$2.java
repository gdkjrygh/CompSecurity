// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import com.adobe.mediacore.MediaPlayer;
import com.adobe.mediacore.MediaPlayerView;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerView

class val.heightFinal
    implements Runnable
{

    final PlayerView this$0;
    final long val$heightFinal;
    final long val$widthFinal;

    public void run()
    {
        if (player == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        if (player.getStatus().equals(com.adobe.mediacore.layerState.RELEASED))
        {
            return;
        }
        try
        {
            player.getView().setLayoutParams(new android.widget.ayoutParams((int)val$widthFinal, (int)val$heightFinal, 17));
            return;
        }
        catch (IllegalStateException illegalstateexception) { }
    }

    ()
    {
        this$0 = final_playerview;
        val$widthFinal = l;
        val$heightFinal = J.this;
        super();
    }
}
