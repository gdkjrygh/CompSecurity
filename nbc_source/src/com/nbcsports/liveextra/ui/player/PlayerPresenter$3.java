// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import com.nbcsports.liveextra.library.player.PlaybackEventListenerStub;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerPresenter, PlayerPresenterListener

class ListenerStub extends PlaybackEventListenerStub
{

    final PlayerPresenter this$0;

    public void onPlayComplete()
    {
        super.onPlayComplete();
        for (Iterator iterator = PlayerPresenter.access$200(PlayerPresenter.this).iterator(); iterator.hasNext(); ((PlayerPresenterListener)iterator.next()).onPlayComplete()) { }
    }

    tener()
    {
        this$0 = PlayerPresenter.this;
        super();
    }
}
