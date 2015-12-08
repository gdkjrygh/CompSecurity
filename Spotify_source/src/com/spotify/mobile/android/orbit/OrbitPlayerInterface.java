// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.orbit;


public interface OrbitPlayerInterface
{

    public abstract void addPlayTime();

    public abstract void playNext();

    public abstract void playPath(String s, int i, boolean flag, String s1, String s2, String s3, String s4);

    public abstract void playPreview(String as[]);

    public abstract void playPrevious(boolean flag);

    public abstract void queueTrack(String s);

    public abstract void resetSkipCount();

    public abstract void seekToPosition(int i);

    public abstract void setPaused(boolean flag);

    public abstract void setShuffle(boolean flag);

    public abstract void skipNTracksBackwards(int i);

    public abstract void skipNTracksForwards(int i);

    public abstract void stopPreview();

    public abstract void togglePaused();
}
