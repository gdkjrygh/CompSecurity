// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.events.EntityStateChangedEvent;
import com.soundcloud.android.playback.PlaybackProgress;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerItem, SkipListener

public interface PlayerPagePresenter
{

    public abstract void bindItemView(View view, PlayerItem playeritem);

    public abstract void clearAdOverlay(View view);

    public abstract View clearItemView(View view);

    public abstract View createItemView(ViewGroup viewgroup, SkipListener skiplistener);

    public abstract void onBackground(View view);

    public abstract void onDestroyView(View view);

    public abstract void onForeground(View view);

    public abstract void onPlayableUpdated(View view, EntityStateChangedEvent entitystatechangedevent);

    public abstract void onPlayerSlide(View view, float f);

    public abstract void setCastDeviceName(View view, String s);

    public abstract void setCollapsed(View view);

    public abstract void setExpanded(View view);

    public abstract void setPlayState(View view, com.soundcloud.android.playback.Player.StateTransition statetransition, boolean flag, boolean flag1);

    public abstract void setProgress(View view, PlaybackProgress playbackprogress);
}
