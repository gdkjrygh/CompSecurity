// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.view.View;
import android.view.Window;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayScreen, PlayerActivity

public class PlayScreenICS extends PlayScreen
{

    private static final int BASE_FLAGS = 4;
    private static final int HIDE_FLAGS = 1;
    private static final int SHOW_FLAGS = 0;

    PlayScreenICS(PlayerActivity playeractivity, PlayScreen.Listeners listeners, PostPlayFactory.PostPlayType postplaytype)
    {
        super(playeractivity, listeners, postplaytype);
    }

    void hideNavigationBar()
    {
        mController.getWindow().getDecorView().setSystemUiVisibility(5);
    }

    protected void playerOverlayVisibility(boolean flag)
    {
        super.playerOverlayVisibility(flag);
        if (flag)
        {
            showNavigationBar();
            return;
        } else
        {
            hideNavigationBar();
            return;
        }
    }

    void showNavigationBar()
    {
        mController.getWindow().getDecorView().setSystemUiVisibility(4);
    }
}
