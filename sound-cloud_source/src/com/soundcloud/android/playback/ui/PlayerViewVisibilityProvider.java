// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.graphics.Rect;
import android.view.View;
import com.soundcloud.android.playback.ui.view.PlayerTrackPager;
import java.lang.ref.WeakReference;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            ViewVisibilityProvider

class PlayerViewVisibilityProvider
    implements ViewVisibilityProvider
{

    private final WeakReference playerTrackPagerRef;

    public PlayerViewVisibilityProvider(PlayerTrackPager playertrackpager)
    {
        playerTrackPagerRef = new WeakReference(playertrackpager);
    }

    public boolean isCurrentlyVisible(View view)
    {
        PlayerTrackPager playertrackpager = (PlayerTrackPager)playerTrackPagerRef.get();
        if (playertrackpager != null)
        {
            Rect rect = new Rect();
            playertrackpager.getHitRect(rect);
            return view.getLocalVisibleRect(rect);
        } else
        {
            return false;
        }
    }
}
