// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import com.netflix.mediaclient.event.nrdp.media.Error;
import com.netflix.mediaclient.event.nrdp.media.NccpError;
import com.netflix.mediaclient.media.Language;
import com.netflix.mediaclient.service.player.subtitles.SubtitleScreen;

// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            IPlayer

public static interface creen
{

    public abstract boolean isListening();

    public abstract void onAudioChange(int i);

    public abstract void onBandwidthChange(int i);

    public abstract void onBufferingUpdate(int i);

    public abstract void onCompletion();

    public abstract void onMediaError(Error error);

    public abstract void onNccpError(NccpError nccperror);

    public abstract void onNrdFatalError();

    public abstract void onPlaying();

    public abstract void onPrepared();

    public abstract void onSeekComplete();

    public abstract void onStalled();

    public abstract void onStarted();

    public abstract void onSubtitleChange(SubtitleScreen subtitlescreen);

    public abstract void onSubtitleFailed();

    public abstract void onSubtitleRemove();

    public abstract void onSubtitleShow(String s);

    public abstract void onUpdatePts(int i);

    public abstract void onVideoSizeChanged(int i, int j);

    public abstract void playbackClosed();

    public abstract void restartPlayback(NccpError nccperror);

    public abstract void setLanguage(Language language);
}
