// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2;


// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2:
//            PlayerState, PlayerContext, PlayOptions, PlayerQueue, 
//            PlayerTrack

public interface Player
{

    public abstract void fetchState(PlayerStateObserver playerstateobserver);

    public abstract void fetchState(PlayerStateObserver playerstateobserver, int i, int j);

    public abstract String getFeatureIdentifier();

    public abstract PlayerState getLastPlayerState();

    public abstract void getQueue(GetQueueCallback getqueuecallback);

    public abstract String getViewUri();

    public abstract void pause();

    public abstract void play(PlayerContext playercontext, PlayOptions playoptions);

    public abstract void play(PlayerContext playercontext, PlayOptions playoptions, PlayCallback playcallback);

    public abstract void playWithViewUri(PlayerContext playercontext, PlayOptions playoptions, String s);

    public abstract void playWithViewUri(PlayerContext playercontext, PlayOptions playoptions, String s, PlayCallback playcallback);

    public abstract void preparePlay(PlayerContext playercontext, PlayOptions playoptions, PreparePlayCallback prepareplaycallback);

    public abstract void preparePlay(PlayerContext playercontext, PlayOptions playoptions, String s, PreparePlayCallback prepareplaycallback);

    public abstract void registerPlayerQueueObserver(PlayerQueueObserver playerqueueobserver);

    public abstract void registerPlayerStateObserver(PlayerStateObserver playerstateobserver);

    public abstract void registerPlayerStateObserver(PlayerStateObserver playerstateobserver, int i, int j);

    public abstract void restore(String s, RestoreCallback restorecallback);

    public abstract void resume();

    public abstract void save(SaveCallback savecallback);

    public abstract void seekTo(long l);

    public abstract void setQueue(PlayerQueue playerqueue, SetQueueCallback setqueuecallback);

    public abstract void setRepeatingContext(boolean flag);

    public abstract void setRepeatingTrack(boolean flag);

    public abstract void setShufflingContext(boolean flag);

    public abstract void skipToFutureTrack(PlayerTrack playertrack);

    public abstract void skipToFutureTrack(PlayerTrack playertrack, boolean flag);

    public abstract void skipToNextTrack();

    public abstract void skipToNextTrack(boolean flag);

    public abstract void skipToPastTrack(PlayerTrack playertrack);

    public abstract void skipToPreviousTrack();

    public abstract void skipToPreviousTrack(boolean flag);

    public abstract void unregisterPlayerQueueObserver(PlayerQueueObserver playerqueueobserver);

    public abstract void unregisterPlayerStateObserver(PlayerStateObserver playerstateobserver);

    public abstract void updateWithContext(PlayerContext playercontext);

    public abstract void updateWithContext(PlayerContext playercontext, PlayCallback playcallback);
}
