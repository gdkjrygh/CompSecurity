// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import com.adobe.mediacore.MediaPlayer;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            AbstractPresenterListener, PlayerView

class nterListener extends AbstractPresenterListener
{

    final PlayerView this$0;

    public void onPlayComplete()
    {
        player.replaceCurrentItem(PlayerView.access$1400(PlayerView.this));
    }

    nterListener()
    {
        this$0 = PlayerView.this;
        super();
    }
}
