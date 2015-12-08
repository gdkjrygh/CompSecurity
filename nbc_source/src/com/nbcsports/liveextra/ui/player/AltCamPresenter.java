// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.content.Context;
import android.content.ContextWrapper;
import com.nbcsports.liveextra.library.api.models.VideoSource;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerPresenter, AltCamOverlay

public class AltCamPresenter extends ContextWrapper
{

    private final PlayerPresenter playerPresenter;
    private AltCamOverlay view;

    public AltCamPresenter(Context context, PlayerPresenter playerpresenter)
    {
        super(context);
        playerPresenter = playerpresenter;
    }

    public boolean hasAltCams()
    {
        return playerPresenter.getVideoSourceCount() > 1;
    }

    public void release()
    {
        view = null;
    }

    public void selectSource(VideoSource videosource)
    {
        playerPresenter.selectSource(videosource);
        if (view != null)
        {
            view.hide();
        }
    }

    public void showAltCams(boolean flag)
    {
        if (view == null || !hasAltCams())
        {
            return;
        }
        if (flag)
        {
            view.show();
            return;
        } else
        {
            view.hide();
            return;
        }
    }

    public void takeView(AltCamOverlay altcamoverlay)
    {
        view = altcamoverlay;
        if (!hasAltCams())
        {
            return;
        } else
        {
            altcamoverlay.init();
            altcamoverlay.bindView();
            return;
        }
    }
}
