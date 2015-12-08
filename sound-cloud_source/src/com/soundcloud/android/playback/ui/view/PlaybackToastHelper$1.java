// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.view;


class 
{

    static final int $SwitchMap$com$soundcloud$android$playback$PlaybackResult$ErrorReason[];

    static 
    {
        $SwitchMap$com$soundcloud$android$playback$PlaybackResult$ErrorReason = new int[com.soundcloud.android.playback.ason.values().length];
        try
        {
            $SwitchMap$com$soundcloud$android$playback$PlaybackResult$ErrorReason[com.soundcloud.android.playback.ason.UNSKIPPABLE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$soundcloud$android$playback$PlaybackResult$ErrorReason[com.soundcloud.android.playback.ason.TRACK_UNAVAILABLE_OFFLINE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$soundcloud$android$playback$PlaybackResult$ErrorReason[com.soundcloud.android.playback.ason.MISSING_PLAYABLE_TRACKS.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$soundcloud$android$playback$PlaybackResult$ErrorReason[com.soundcloud.android.playback.ason.TRACK_UNAVAILABLE_CAST.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
