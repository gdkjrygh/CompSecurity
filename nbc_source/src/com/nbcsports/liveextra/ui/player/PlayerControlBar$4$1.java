// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerControlBar, PlayerPresenter, AltCamPresenter

class this._cls1
    implements android.view.animation.stener
{

    final hrome this$1;

    public void onAnimationEnd(Animation animation)
    {
        setVisibility(8);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        playerPresenter.hideChrome();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/nbcsports/liveextra/ui/player/PlayerControlBar$4

/* anonymous class */
    class PlayerControlBar._cls4
        implements Runnable
    {

        final PlayerControlBar this$0;

        public void run()
        {
            if (isShown())
            {
                Animation animation = AnimationUtils.loadAnimation(getContext(), 0x10a0001);
                animation.setAnimationListener(new PlayerControlBar._cls4._cls1());
                startAnimation(animation);
                altCamPresenter.showAltCams(false);
            }
        }

            
            {
                this$0 = PlayerControlBar.this;
                super();
            }
    }

}
