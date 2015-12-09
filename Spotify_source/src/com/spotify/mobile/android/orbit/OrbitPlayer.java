// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.orbit;


// Referenced classes of package com.spotify.mobile.android.orbit:
//            OrbitPlayerInterface

public final class OrbitPlayer
    implements OrbitPlayerInterface
{

    private long nOrbitPlayerPtr;

    private OrbitPlayer()
    {
    }

    public final native void addPlayTime();

    public final native void playNext();

    public final native void playPath(String s, int i, boolean flag, String s1, String s2, String s3, String s4);

    public final void playPreview(String as[])
    {
    }

    public final native void playPrevious(boolean flag);

    public final native void queueTrack(String s);

    public final native void resetSkipCount();

    public final native void seekToPosition(int i);

    public final native void setPaused(boolean flag);

    public final native void setShuffle(boolean flag);

    public final native void skipNTracksBackwards(int i);

    public final native void skipNTracksForwards(int i);

    public final void stopPreview()
    {
    }

    public final native void togglePaused();
}
