// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.view.View;
import android.view.Window;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayScreen, PlayerActivity

public class PlayScreenJB extends PlayScreen
{

    private static final int BASE_FLAGS = 1792;
    private static final int HIDE_FLAGS = 3;
    private static final int SHOW_FLAGS = 0;

    PlayScreenJB(PlayerActivity playeractivity, PlayScreen.Listeners listeners, PostPlayFactory.PostPlayType postplaytype)
    {
        super(playeractivity, listeners, postplaytype);
        playeractivity.getWindow().getDecorView().setSystemUiVisibility(1792);
    }

    void hideNavigationBar()
    {
        Log.d("screen", "hide nav JB");
        mController.getWindow().getDecorView().setSystemUiVisibility(1795);
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
        Log.d("screen", "show nav JB");
        mController.getWindow().getDecorView().setSystemUiVisibility(1792);
    }
}
