// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.model.ThumbState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class gpa
    implements gpf
{

    final RadioStationModel a;
    final ThumbState b;
    final Verified c;
    final com.spotify.mobile.android.util.viewuri.ViewUri.SubView d;
    final gox e;

    public gpa(gox gox1, RadioStationModel radiostationmodel, ThumbState thumbstate, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview)
    {
        e = gox1;
        super();
        a = radiostationmodel;
        b = thumbstate;
        c = verified;
        d = subview;
    }

    public final void a()
    {
        gox.a(e).a(ThumbState.a);
        gox.a(e).c();
        dmz.a(ggc);
        ggc.e(gox.b(e));
    }

    public final void a(Object obj)
    {
        RadioStationTracksModel radiostationtracksmodel = (RadioStationTracksModel)obj;
        obj = gox.a(e).d.a;
        if (obj == null)
        {
            obj = "";
        } else
        {
            obj = ((RadioStationModel) (obj)).getPlayerContextUri();
        }
        if (a.isMyContext(((String) (obj))))
        {
            gox.a(e).c();
            if (gox.d(e))
            {
                if (ThumbState.c.equals(b))
                {
                    obj = gox.a(e).d.d;
                    gox.c(e).skipToNextTrack();
                    gox.c(e).fetchState(new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver(((String) (obj))) {

                        private String a;
                        private gpa b;

                        public final void onPlayerStateReceived(PlayerState playerstate)
                        {
                            boolean flag = false;
                            if (playerstate.track() != null && a != null && !a.equals(playerstate.track().uri()))
                            {
                                String s = a;
                                ArrayList arraylist = new ArrayList();
                                PlayerTrack aplayertrack[] = playerstate.reverse();
                                int k = aplayertrack.length;
                                for (int i = 0; i < k; i++)
                                {
                                    PlayerTrack playertrack1 = aplayertrack[i];
                                    if (!s.equals(playertrack1.uri()))
                                    {
                                        arraylist.add(playertrack1);
                                    }
                                }

                                arraylist.add(playerstate.track());
                                playerstate = playerstate.future();
                                k = playerstate.length;
                                for (int j = ((flag) ? 1 : 0); j < k; j++)
                                {
                                    PlayerTrack playertrack = playerstate[j];
                                    if (!s.equals(playertrack.uri()))
                                    {
                                        arraylist.add(playertrack);
                                    }
                                }

                                playerstate = (PlayerTrack[])arraylist.toArray(new PlayerTrack[arraylist.size()]);
                                playerstate = new RadioStationTracksModel(playerstate, gpl.a(b.a.nextPageUrl, playerstate));
                                gox.a(b.e).a(b.a, playerstate, b.c, b.d);
                                playerstate = gox.a(b.e, b.a, playerstate);
                                gox.c(b.e).updateWithContext(playerstate);
                            }
                        }

            
            {
                b = gpa.this;
                a = s;
                super();
            }
                    }, 14, 14);
                }
                return;
            } else
            {
                gox.a(e).a(a, radiostationtracksmodel, c, d);
                obj = gox.a(e, a, radiostationtracksmodel);
                gox.c(e).updateWithContext(((com.spotify.mobile.android.cosmos.player.v2.PlayerContext) (obj)), new com.spotify.mobile.android.cosmos.player.v2.Player.PlayCallback() {

                    private gpa a;

                    public final void onPlayForbidden(List list)
                    {
                        String s = Arrays.toString(a.a.seeds);
                        gox.a(a.e, com.spotify.mobile.android.util.ClientEvent.Event.b, a.a.uri, s, a.c, a.d);
                        Logger.b("Play Forbidden when updating station %s with seed %s (after thumb operation). Reasons: %s", new Object[] {
                            a.a.uri, s, TextUtils.join(",", list)
                        });
                    }

                    public final void onPlaySuccess()
                    {
                        if (ThumbState.c.equals(a.b))
                        {
                            gox.c(a.e).skipToNextTrack();
                        }
                    }

            
            {
                a = gpa.this;
                super();
            }
                });
                return;
            }
        } else
        {
            Logger.b("Thumb response is not for the currently playing station. Disregarding.", new Object[0]);
            return;
        }
    }
}
