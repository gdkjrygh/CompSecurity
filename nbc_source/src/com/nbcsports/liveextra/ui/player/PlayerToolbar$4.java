// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import com.nbcsports.liveextra.library.api.models.VideoSource;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            AbstractPresenterListener, PlayerToolbar, PlayerPresenter

class rListener extends AbstractPresenterListener
{

    final PlayerToolbar this$0;

    public void onHideChrome()
    {
        if (!playerPresenter.isFullScreen())
        {
            return;
        } else
        {
            setVisibility(8);
            return;
        }
    }

    public void onShowChrome()
    {
        setVisibility(0);
    }

    public void onSourceSelected(VideoSource videosource)
    {
        setTitle(playerPresenter.getTitle());
    }

    public void onToggleFullScreen(boolean flag)
    {
        PlayerToolbar.access$100(PlayerToolbar.this, playerPresenter.isFullScreen());
        if (!playerPresenter.isFullScreen())
        {
            setVisibility(0);
        }
    }

    urce()
    {
        this$0 = PlayerToolbar.this;
        super();
    }
}
