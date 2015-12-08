// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import com.netflix.mediaclient.ui.mdx.RemotePlayer;

// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            MdxKeyEventHandler

class val.player
    implements Runnable
{

    final MdxKeyEventHandler this$0;
    final RemotePlayer val$player;

    public void run()
    {
        int i = MdxKeyEventHandler.access$000(MdxKeyEventHandler.this).getVolumeAsPercent();
        val$player.setVolume(i + 10);
        MdxKeyEventHandler.access$000(MdxKeyEventHandler.this).onVolumeSet(val$player.getVolume());
    }

    xKeyEventCallbacks()
    {
        this$0 = final_mdxkeyeventhandler;
        val$player = RemotePlayer.this;
        super();
    }
}
