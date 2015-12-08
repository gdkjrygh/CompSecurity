// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.view.View;
import butterknife.ButterKnife;
import com.nbcsports.liveextra.library.api.models.VideoSource;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            AbstractPresenterListener, PlayerActivity

class Listener extends AbstractPresenterListener
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

    public void onToggleFullScreen(final boolean isFullScreen)
    {
        super.onToggleFullScreen(isFullScreen);
        if (dataViews != null)
        {
            ButterKnife.apply(dataViews, new butterknife.ButterKnife.Action() {

                final PlayerActivity._cls7 this$1;
                final boolean val$isFullScreen;

                public void apply(View view, int i)
                {
                    if (isFullScreen)
                    {
                        i = 8;
                    } else
                    {
                        i = 0;
                    }
                    view.setVisibility(i);
                }

            
            {
                this$1 = PlayerActivity._cls7.this;
                isFullScreen = flag;
                super();
            }
            });
            if (overlayShim != null)
            {
                if (isFullScreen)
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

    _cls1.val.isFullScreen()
    {
        this$0 = PlayerActivity.this;
        super();
    }
}
