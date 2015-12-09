// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.view.View;
import android.view.Window;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayScreen, PlayerActivity

public class PlayScreenKindleHD extends PlayScreen
{

    public static final int AMAZON_FLAGS_HIDE_DRAG_HANDLE = 2;
    private static final int BASE_FLAGS = 4;
    private static final int HIDE_FLAGS = 1;
    private static final int SHOW_FLAGS = 0;

    PlayScreenKindleHD(PlayerActivity playeractivity, PlayScreen.Listeners listeners, PostPlayFactory.PostPlayType postplaytype)
    {
        super(playeractivity, listeners, postplaytype);
    }

    void hideNavigationBar()
    {
        mController.getWindow().getDecorView().setSystemUiVisibility(7);
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
