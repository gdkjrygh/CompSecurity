// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import com.soundcloud.android.ads.AdPlayerController;
import com.soundcloud.android.playback.ui.SlidingPlayerController;
import com.soundcloud.lightcycle.ActivityLightCycleDispatcher;
import com.soundcloud.lightcycle.LightCycleBinder;

public class PlayerController extends ActivityLightCycleDispatcher
{

    final AdPlayerController adPlayerController;
    final SlidingPlayerController playerController;

    public PlayerController(SlidingPlayerController slidingplayercontroller, AdPlayerController adplayercontroller)
    {
        playerController = slidingplayercontroller;
        adPlayerController = adplayercontroller;
        LightCycleBinder.bind(this);
    }

    public boolean handleBackPressed()
    {
        return playerController.handleBackPressed();
    }
}
