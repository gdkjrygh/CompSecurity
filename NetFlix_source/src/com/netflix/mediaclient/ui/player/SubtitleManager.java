// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import com.netflix.mediaclient.service.player.subtitles.SubtitleScreen;

public interface SubtitleManager
{

    public abstract void clear();

    public abstract void clearPendingUpdates();

    public abstract void onSubtitleChange(SubtitleScreen subtitlescreen);

    public abstract void onSubtitleRemove();

    public abstract void onSubtitleShow(String s);

    public abstract void setSubtitleVisibility(boolean flag);
}
