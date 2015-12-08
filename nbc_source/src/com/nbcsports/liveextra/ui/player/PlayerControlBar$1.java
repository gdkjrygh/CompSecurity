// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.view.View;
import com.nbcsports.liveextra.library.api.models.VideoSource;
import rx.Subscription;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            AbstractPresenterListener, PlayerControlBar

class stener extends AbstractPresenterListener
{

    final PlayerControlBar this$0;

    public void onPlayComplete()
    {
        show();
    }

    public void onPlayerTouch()
    {
        toggle();
    }

    public void onSourceSelected(VideoSource videosource)
    {
        super.onSourceSelected(videosource);
        if (PlayerControlBar.access$000(PlayerControlBar.this) != null)
        {
            PlayerControlBar.access$000(PlayerControlBar.this).unsubscribe();
        }
        if (playBar != null)
        {
            playBar.setVisibility(8);
        }
        hide();
    }

    e()
    {
        this$0 = PlayerControlBar.this;
        super();
    }
}
