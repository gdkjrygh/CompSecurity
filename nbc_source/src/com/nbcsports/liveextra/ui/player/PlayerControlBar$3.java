// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.view.animation.Animation;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerControlBar, PlayerPresenter

class this._cls0
    implements android.view.animation.Listener
{

    final PlayerControlBar this$0;

    public void onAnimationEnd(Animation animation)
    {
        if (PlayerControlBar.access$400(PlayerControlBar.this))
        {
            hide();
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        setVisibility(0);
        if (!PlayerControlBar.access$100(PlayerControlBar.this) || !PlayerControlBar.access$200(PlayerControlBar.this))
        {
            boolean _tmp = PlayerControlBar.access$300(PlayerControlBar.this);
        }
        playerPresenter.showChrome();
    }

    ()
    {
        this$0 = PlayerControlBar.this;
        super();
    }
}
