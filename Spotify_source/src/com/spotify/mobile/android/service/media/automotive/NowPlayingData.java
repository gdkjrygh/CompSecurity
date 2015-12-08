// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.media.automotive;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

public final class NowPlayingData
{

    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final long h;
    public final long i;
    public final PlaybackState j;
    public final boolean k;
    public final boolean l;
    public final PlayerTrack m[];
    public final String n;

    public NowPlayingData(String s, String s1, boolean flag, String s2, String s3, String s4, String s5, 
            long l1, long l2, PlaybackState playbackstate, boolean flag1, boolean flag2, 
            PlayerTrack aplayertrack[], String s6)
    {
        a = s;
        b = s1;
        c = flag;
        d = s2;
        e = s3;
        f = s4;
        g = s5;
        h = l1;
        i = l2;
        j = playbackstate;
        k = flag1;
        l = flag2;
        m = aplayertrack;
        n = s6;
    }

    public final boolean a()
    {
        return PlaybackState.b.equals(j);
    }

    public final boolean b()
    {
        return PlaybackState.a.equals(j);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (NowPlayingData)obj;
            if (c != ((NowPlayingData) (obj)).c)
            {
                return false;
            }
            if (h != ((NowPlayingData) (obj)).h)
            {
                return false;
            }
            if (k != ((NowPlayingData) (obj)).k)
            {
                return false;
            }
            if (a == null ? ((NowPlayingData) (obj)).a != null : !a.equals(((NowPlayingData) (obj)).a))
            {
                return false;
            }
            if (b == null ? ((NowPlayingData) (obj)).b != null : !b.equals(((NowPlayingData) (obj)).b))
            {
                return false;
            }
            if (d == null ? ((NowPlayingData) (obj)).d != null : !d.equals(((NowPlayingData) (obj)).d))
            {
                return false;
            }
            if (e == null ? ((NowPlayingData) (obj)).e != null : !e.equals(((NowPlayingData) (obj)).e))
            {
                return false;
            }
            if (f == null ? ((NowPlayingData) (obj)).f != null : !f.equals(((NowPlayingData) (obj)).f))
            {
                return false;
            }
            if (g == null ? ((NowPlayingData) (obj)).g != null : !g.equals(((NowPlayingData) (obj)).g))
            {
                return false;
            }
            if (j != ((NowPlayingData) (obj)).j)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int i3 = 1;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int j3;
        if (a != null)
        {
            i1 = a.hashCode();
        } else
        {
            i1 = 0;
        }
        if (b != null)
        {
            j1 = b.hashCode();
        } else
        {
            j1 = 0;
        }
        if (c)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (d != null)
        {
            l1 = d.hashCode();
        } else
        {
            l1 = 0;
        }
        if (e != null)
        {
            i2 = e.hashCode();
        } else
        {
            i2 = 0;
        }
        if (f != null)
        {
            j2 = f.hashCode();
        } else
        {
            j2 = 0;
        }
        if (g != null)
        {
            k2 = g.hashCode();
        } else
        {
            k2 = 0;
        }
        j3 = (int)(h ^ h >>> 32);
        if (j != null)
        {
            l2 = j.hashCode();
        } else
        {
            l2 = 0;
        }
        if (!k)
        {
            i3 = 0;
        }
        return (l2 + ((k2 + (j2 + (i2 + (l1 + (k1 + (j1 + i1 * 31) * 31) * 31) * 31) * 31) * 31) * 31 + j3) * 31) * 31 + i3;
    }

    private class PlaybackState extends Enum
    {

        public static final PlaybackState a;
        public static final PlaybackState b;
        public static final PlaybackState c;
        private static final PlaybackState d[];

        public static PlaybackState valueOf(String s)
        {
            return (PlaybackState)Enum.valueOf(com/spotify/mobile/android/service/media/automotive/NowPlayingData$PlaybackState, s);
        }

        public static PlaybackState[] values()
        {
            return (PlaybackState[])d.clone();
        }

        static 
        {
            a = new PlaybackState("PLAYING", 0);
            b = new PlaybackState("PAUSED", 1);
            c = new PlaybackState("NONE", 2);
            d = (new PlaybackState[] {
                a, b, c
            });
        }

        private PlaybackState(String s, int i1)
        {
            super(s, i1);
        }
    }

}
