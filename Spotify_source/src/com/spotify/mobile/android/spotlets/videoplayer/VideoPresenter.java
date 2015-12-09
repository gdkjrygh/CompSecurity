// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.videoplayer;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import eqe;
import flp;
import flr;
import java.util.Map;

public final class VideoPresenter
{

    final Player a;
    public final flp b;
    public flr c;
    eqe d;
    public boolean e;
    com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver f;

    public VideoPresenter(Player player, flp flp, eqe eqe, flr flr)
    {
        f = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

            private VideoPresenter a;

            public final void onPlayerStateReceived(PlayerState playerstate)
            {
                PlayerTrack playertrack = playerstate.track();
                if (!PlayerTrackUtil.isVideo(playertrack))
                {
                    a.b.f();
                    return;
                }
                a.b.a(VideoPresenter.a(playertrack, "artist_name"), VideoPresenter.a(playertrack, "title"));
                if (PlayerTrackUtil.isEpisode(playertrack.uri()))
                {
                    a.b.l();
                } else
                {
                    a.b.m();
                }
                if (playerstate.isPaused())
                {
                    a.b.j();
                    a.b.k();
                }
                a.d.onPlayerStateReceived(playerstate);
            }

            
            {
                a = VideoPresenter.this;
                super();
            }
        };
        a = player;
        b = flp;
        c = flr;
        a.registerPlayerStateObserver(f);
        d = eqe;
        a.fetchState(f);
    }

    static String a(PlayerTrack playertrack, String s)
    {
        if (playertrack == null)
        {
            return "";
        } else
        {
            return (String)playertrack.metadata().get(s);
        }
    }

    // Unreferenced inner class com/spotify/mobile/android/spotlets/videoplayer/VideoPresenter$2

/* anonymous class */
    final class _cls2
    {

        static final int a[];

        static 
        {
            a = new int[Action.values().length];
            try
            {
                a[Action.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                a[Action.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                a[Action.c.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                a[Action.d.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                a[Action.e.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                a[Action.f.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[Action.g.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[Action.h.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[Action.i.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }

        private class Action extends Enum
        {

            public static final Action a;
            public static final Action b;
            public static final Action c;
            public static final Action d;
            public static final Action e;
            public static final Action f;
            public static final Action g;
            public static final Action h;
            public static final Action i;
            private static final Action j[];

            public static Action valueOf(String s)
            {
                return (Action)Enum.valueOf(com/spotify/mobile/android/spotlets/videoplayer/VideoPresenter$Action, s);
            }

            public static Action[] values()
            {
                return (Action[])j.clone();
            }

            static 
            {
                a = new Action("COLLAPSE", 0);
                b = new Action("SKIP_15_BACKWARD", 1);
                c = new Action("PLAY_PREVIOUS", 2);
                d = new Action("PLAY_PAUSE", 3);
                e = new Action("PLAY_NEXT", 4);
                f = new Action("SKIP_15_FORWARD", 5);
                g = new Action("CONTEXT_MENU", 6);
                h = new Action("TAP_VIDEO", 7);
                i = new Action("TAP_VIDEO_OUTSIDE", 8);
                j = (new Action[] {
                    a, b, c, d, e, f, g, h, i
                });
            }

            private Action(String s, int k)
            {
                super(s, k);
            }
        }

    }

}
