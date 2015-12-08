// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import com.adobe.mediacore.MediaPlayer;
import com.nbcsports.liveextra.library.player.QosEventListenerStub;
import rx.Subscription;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerControlBar

class rStub extends QosEventListenerStub
{

    final PlayerControlBar this$0;

    public void onSeekComplete(long l)
    {
        super.onSeekComplete(l);
        PlayerControlBar.access$1102(PlayerControlBar.this, false);
        if (playing)
        {
            player.play();
        }
    }

    public void onSeekStart()
    {
        super.onSeekStart();
        PlayerControlBar.access$1102(PlayerControlBar.this, true);
        if (PlayerControlBar.access$000(PlayerControlBar.this) != null && !PlayerControlBar.access$000(PlayerControlBar.this).isUnsubscribed())
        {
            PlayerControlBar.access$000(PlayerControlBar.this).unsubscribe();
        }
    }

    rStub()
    {
        this$0 = PlayerControlBar.this;
        super();
    }
}
