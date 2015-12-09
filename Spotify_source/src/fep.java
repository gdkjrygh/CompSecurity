// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.DeferredResolver;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContextIndex;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.running.model.RunningPlayerContextPage;
import com.spotify.mobile.android.spotlets.running.player.RunningResumePositions;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.List;

public final class fep
{

    public Player a;
    public DeferredResolver b;
    PlayerState c;
    com.spotify.mobile.android.cosmos.player.v2.Player.PlayCallback d;
    RunningResumePositions e;
    String f;
    private final FeatureIdentifier g;

    public fep(Context context, FeatureIdentifier featureidentifier)
    {
        g = featureidentifier;
        e = new RunningResumePositions(context);
        b = Cosmos.getResolver(context);
        a = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(b, ViewUri.l.toString(), FeatureIdentifier.F, "apollo", g);
    }

    public final void a(String s, RunningPlayerContextPage runningplayercontextpage, feq feq)
    {
        f = s;
        c = null;
        d = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayCallback(feq) {

            private feq a;

            public final void onPlayForbidden(List list)
            {
                if (a != null)
                {
                    if (list.size() == 1 && "already_playing".equals(list.get(0)))
                    {
                        a.a();
                    } else
                    {
                        a.b();
                    }
                }
                TextUtils.join(",", list);
            }

            public final void onPlaySuccess()
            {
                if (a != null)
                {
                    a.a();
                }
            }

            
            {
                a = feq1;
                super();
            }
        };
        a.fetchState(new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver(runningplayercontextpage, s) {

            private RunningPlayerContextPage a;
            private String b;
            private fep c;

            public final void onPlayerStateReceived(PlayerState playerstate)
            {
                fep fep1;
                RunningPlayerContextPage runningplayercontextpage1;
                PlayerState playerstate1;
                int i;
                boolean flag3;
                c.c = playerstate;
                fep1 = c;
                runningplayercontextpage1 = a;
                String s1 = b;
                if (fep1.c == null || fep1.a == null)
                {
                    return;
                }
                if (s1.equals(fep1.c.entityUri()))
                {
                    if (fep1.c.isPaused())
                    {
                        fep1.a.resume();
                    }
                    fep1.d.onPlaySuccess();
                    return;
                }
                playerstate = runningplayercontextpage1.shuffle();
                Object obj;
                boolean flag1;
                if (playerstate == null)
                {
                    playerstate = Boolean.valueOf(false);
                }
                flag3 = ((Boolean)playerstate).booleanValue();
                playerstate1 = fep1.a.getLastPlayerState();
                playerstate = runningplayercontextpage1.percentageMapping();
                if (playerstate == null)
                {
                    playerstate = Boolean.valueOf(false);
                }
                flag1 = ((Boolean)playerstate).booleanValue();
                playerstate = fep1.e;
                if (playerstate1 != null && playerstate1.index() != null)
                {
                    playerstate.a();
                    ((RunningResumePositions) (playerstate)).d.items.put(playerstate1.entityUri(), new com.spotify.mobile.android.spotlets.running.player.RunningResumePositions.ResumePosition(playerstate1.index().page(), playerstate1.index().track(), playerstate1.currentPlaybackPosition(), gcf.a()));
                    try
                    {
                        ((RunningResumePositions) (playerstate)).c.b(RunningResumePositions.a, ((RunningResumePositions) (playerstate)).b.writeValueAsString(((RunningResumePositions) (playerstate)).d));
                    }
                    // Misplaced declaration of an exception variable
                    catch (PlayerState playerstate)
                    {
                        Logger.c("Failed saving resume positions: %s", new Object[] {
                            playerstate.getMessage()
                        });
                    }
                }
                if (playerstate1 == null) goto _L2; else goto _L1
_L1:
                obj = playerstate1.entityUri();
                playerstate = fep1.f;
                if (!flag1) goto _L4; else goto _L3
_L3:
                obj = new SpotifyLink(((String) (obj)));
                if (((SpotifyLink) (obj)).c != com.spotify.mobile.android.util.SpotifyLink.LinkType.aF) goto _L6; else goto _L5
_L5:
                playerstate = new SpotifyLink(playerstate);
                if (((SpotifyLink) (playerstate)).c != com.spotify.mobile.android.util.SpotifyLink.LinkType.aF || !((SpotifyLink) (obj)).a(2).contentEquals(playerstate.a(2)) || !((SpotifyLink) (obj)).a(3).contentEquals(playerstate.a(3))) goto _L6; else goto _L7
_L7:
                i = 1;
_L16:
                if (i == 0) goto _L4; else goto _L8
_L8:
                i = 1;
_L9:
                if (i != 0)
                {
                    playerstate = playerstate1.index();
                    long l;
                    long l1;
                    long l2;
                    boolean flag2;
                    if (playerstate != null)
                    {
                        i = playerstate.track();
                    } else
                    {
                        i = 0;
                    }
                    playerstate = runningplayercontextpage1.tracks();
                    l = fet.a(playerstate1.track());
                    l1 = playerstate1.currentPlaybackPosition();
                    ctz.a(playerstate);
                    if (i < playerstate.length)
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                    ctz.a(flag2, "Current track index %d is higher that tracks length %d", new Object[] {
                        Integer.valueOf(i), Integer.valueOf(playerstate.length)
                    });
                    l2 = fet.a(playerstate[i]);
                    if (l <= 0L || l1 < 0L || l2 < 0L)
                    {
                        l = 0L;
                    } else
                    {
                        l = (long)(((double)l2 * (double)l1) / (double)l);
                    }
                    fes.a(fep1.a, runningplayercontextpage1, s1, 0, i, l, flag3, fep1.d);
                    return;
                }
                  goto _L2
_L6:
                i = 0;
                continue; /* Loop/switch isn't completed */
_L4:
                i = 0;
                  goto _L9
_L2:
                playerstate = com.spotify.mobile.android.util.SpotifyLink.LinkType.P;
                if (playerstate1 == null) goto _L11; else goto _L10
_L10:
                PlayerTrack playertrack = playerstate1.track();
                if (playertrack == null || (new SpotifyLink(playertrack.uri())).c != playerstate) goto _L11; else goto _L12
_L12:
                boolean flag = true;
_L14:
                if (flag)
                {
                    fep1.a.pause();
                }
                playerstate = fep1.e;
                String s2 = fep1.f;
                playerstate.a();
                playerstate = (com.spotify.mobile.android.spotlets.running.player.RunningResumePositions.ResumePosition)((RunningResumePositions) (playerstate)).d.items.get(s2);
                if (playerstate != null)
                {
                    fes.a(fep1.a, runningplayercontextpage1, fep1.f, ((com.spotify.mobile.android.spotlets.running.player.RunningResumePositions.ResumePosition) (playerstate)).page, ((com.spotify.mobile.android.spotlets.running.player.RunningResumePositions.ResumePosition) (playerstate)).track, ((com.spotify.mobile.android.spotlets.running.player.RunningResumePositions.ResumePosition) (playerstate)).position, flag3, fep1.d);
                    return;
                }
                break; /* Loop/switch isn't completed */
_L11:
                flag = false;
                if (true) goto _L14; else goto _L13
_L13:
                fes.a(fep1.a, runningplayercontextpage1, fep1.f, flag3, fep1.d);
                return;
                if (true) goto _L16; else goto _L15
_L15:
            }

            
            {
                c = fep.this;
                a = runningplayercontextpage;
                b = s;
                super();
            }
        });
    }
}
