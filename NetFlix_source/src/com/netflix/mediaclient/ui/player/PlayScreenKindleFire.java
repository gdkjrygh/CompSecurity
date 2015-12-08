// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.view.Window;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayScreen, PlayerActivity

public class PlayScreenKindleFire extends PlayScreen
{

    public static final int AMAZON_FLAG_NOSOFTKEYS = 0x80000000;
    private static final int FLAG_SUPER_FULLSCREEN = 0x80000400;

    PlayScreenKindleFire(PlayerActivity playeractivity, PlayScreen.Listeners listeners, PostPlayFactory.PostPlayType postplaytype)
    {
        super(playeractivity, listeners, postplaytype);
    }

    void hideNavigationBar()
    {
        mController.getWindow().addFlags(0x80000400);
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
        mController.getWindow().clearFlags(0x80000400);
    }
}
