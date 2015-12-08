// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import com.nbcsports.liveextra.library.api.models.VideoSource;

public interface PlayerPresenterListener
{

    public abstract void onAdBreakComplete();

    public abstract void onAdBreakStart();

    public abstract void onHideChrome();

    public abstract void onPlayComplete();

    public abstract void onPlayerTouch();

    public abstract void onShowChrome();

    public abstract void onSourceSelected(VideoSource videosource);

    public abstract void onToggleFullScreen(boolean flag);

    public abstract void onToggleQos();
}
