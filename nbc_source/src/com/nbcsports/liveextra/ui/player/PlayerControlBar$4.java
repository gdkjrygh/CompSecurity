// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerControlBar, AltCamPresenter, PlayerPresenter

class this._cls0
    implements Runnable
{

    final PlayerControlBar this$0;

    public void run()
    {
        if (isShown())
        {
            Animation animation = AnimationUtils.loadAnimation(getContext(), 0x10a0001);
            animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final PlayerControlBar._cls4 this$1;

                public void onAnimationEnd(Animation animation1)
                {
                    setVisibility(8);
                }

                public void onAnimationRepeat(Animation animation1)
                {
                }

                public void onAnimationStart(Animation animation1)
                {
                    playerPresenter.hideChrome();
                }

            
            {
                this$1 = PlayerControlBar._cls4.this;
                super();
            }
            });
            startAnimation(animation);
            altCamPresenter.showAltCams(false);
        }
    }

    _cls1.this._cls1()
    {
        this$0 = PlayerControlBar.this;
        super();
    }
}
