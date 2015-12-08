// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.view.View;
import butterknife.ButterKnife;
import com.nbcsports.liveextra.library.api.models.VideoSource;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            AbstractPresenterListener, PlayerActivity

class val.isFullScreen
    implements butterknife.er.PlayerActivity._cls7._cls1
{

    final val.isFullScreen this$1;
    final boolean val$isFullScreen;

    public void apply(View view, int i)
    {
        if (val$isFullScreen)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        view.setVisibility(i);
    }

    stener()
    {
        this$1 = final_stener;
        val$isFullScreen = Z.this;
        super();
    }

    // Unreferenced inner class com/nbcsports/liveextra/ui/player/PlayerActivity$7

/* anonymous class */
    class PlayerActivity._cls7 extends AbstractPresenterListener
    {

        final PlayerActivity this$0;

        public void onSourceSelected(VideoSource videosource)
        {
            super.onSourceSelected(videosource);
            if (PlayerActivity.access$600(PlayerActivity.this))
            {
                PlayerActivity.access$602(PlayerActivity.this, false);
                return;
            } else
            {
                play();
                return;
            }
        }

        public void onToggleFullScreen(boolean flag)
        {
            super.onToggleFullScreen(flag);
            if (dataViews != null)
            {
                ButterKnife.apply(dataViews, flag. new PlayerActivity._cls7._cls1());
                if (overlayShim != null)
                {
                    if (flag)
                    {
                        playerShim.setVisibility(0);
                        overlayShim.setVisibility(8);
                        return;
                    } else
                    {
                        playerShim.setVisibility(8);
                        overlayShim.setVisibility(0);
                        return;
                    }
                }
            }
        }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
    }

}
