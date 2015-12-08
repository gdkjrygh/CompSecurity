// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.events.EntityStateChangedEvent;
import com.soundcloud.android.playback.PlaybackProgress;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPagePresenter, PlayerAd, PlayerItem, SkipListener

class VideoPagePresenter
    implements PlayerPagePresenter
{

    private final Context context;
    private final Resources resources;

    public VideoPagePresenter(Resources resources1, Context context1)
    {
        resources = resources1;
        context = context1;
    }

    public void bindItemView(View view, PlayerAd playerad)
    {
    }

    public volatile void bindItemView(View view, PlayerItem playeritem)
    {
        bindItemView(view, (PlayerAd)playeritem);
    }

    public void clearAdOverlay(View view)
    {
    }

    public View clearItemView(View view)
    {
        return view;
    }

    public View createItemView(ViewGroup viewgroup, SkipListener skiplistener)
    {
        viewgroup = new SurfaceView(context);
        viewgroup.setBackgroundColor(resources.getColor(0x7f0e00c8));
        return viewgroup;
    }

    public void onBackground(View view)
    {
    }

    public void onDestroyView(View view)
    {
    }

    public void onForeground(View view)
    {
    }

    public void onPlayableUpdated(View view, EntityStateChangedEvent entitystatechangedevent)
    {
    }

    public void onPlayerSlide(View view, float f)
    {
    }

    public void setCastDeviceName(View view, String s)
    {
    }

    public void setCollapsed(View view)
    {
    }

    public void setExpanded(View view)
    {
    }

    public void setPlayState(View view, com.soundcloud.android.playback.Player.StateTransition statetransition, boolean flag, boolean flag1)
    {
    }

    public void setProgress(View view, PlaybackProgress playbackprogress)
    {
    }
}
