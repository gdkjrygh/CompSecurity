// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


public interface IMdxSharedState
{
    public static final class MdxPlaybackState extends Enum
    {

        private static final MdxPlaybackState $VALUES[];
        public static final MdxPlaybackState Loading;
        public static final MdxPlaybackState Paused;
        public static final MdxPlaybackState Playing;
        public static final MdxPlaybackState Stopped;
        public static final MdxPlaybackState Transitioning;

        public static MdxPlaybackState valueOf(String s)
        {
            return (MdxPlaybackState)Enum.valueOf(com/netflix/mediaclient/servicemgr/IMdxSharedState$MdxPlaybackState, s);
        }

        public static MdxPlaybackState[] values()
        {
            return (MdxPlaybackState[])$VALUES.clone();
        }

        static 
        {
            Stopped = new MdxPlaybackState("Stopped", 0);
            Loading = new MdxPlaybackState("Loading", 1);
            Transitioning = new MdxPlaybackState("Transitioning", 2);
            Playing = new MdxPlaybackState("Playing", 3);
            Paused = new MdxPlaybackState("Paused", 4);
            $VALUES = (new MdxPlaybackState[] {
                Stopped, Loading, Transitioning, Playing, Paused
            });
        }

        private MdxPlaybackState(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract MdxPlaybackState getMdxPlaybackState();

    public abstract long getPlaybackPositionInMs();

    public abstract int getRecentVolume();

    public abstract boolean hasActivePlayback();

    public abstract boolean isVolumeEnabled();
}
