// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.paste.widget.CheckableImageButton;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService;
import com.spotify.mobile.android.spotlets.player.views.TrackInfoView;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Map;

public class fbe
    implements com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver, eda, fbo
{

    public TrackInfoView a;
    fae b;
    Player c;
    final fbf d;
    Flags e;
    private View f;
    private ezh g;

    public fbe(fae fae, Player player, ezh ezh1, fbf fbf1, Flags flags)
    {
        b = fae;
        c = player;
        g = ezh1;
        d = (fbf)ctz.a(fbf1);
        e = (Flags)ctz.a(flags);
    }

    public final com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver G_()
    {
        return this;
    }

    public void a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        f = layoutinflater.inflate(0x7f030140, viewgroup, false);
        a = (TrackInfoView)f.findViewById(0x7f1104d4);
        a.c = new fcu() {

            private fbe a;

            public final void a()
            {
                Object obj;
                Object obj1;
                obj1 = a;
                ((fbe) (obj1)).d.j();
                obj = ((fbe) (obj1)).c.getLastPlayerState();
                if (obj != null && ((PlayerState) (obj)).track() != null) goto _L2; else goto _L1
_L1:
                return;
_L2:
                if (!fdo.a(((fbe) (obj1)).e)) goto _L4; else goto _L3
_L3:
                ((fbe) (obj1)).a.a(false);
_L6:
                ((fbe) (obj1)).b.a(((PlayerState) (obj)).track().uri());
                return;
_L4:
                if (((fbe) (obj1)).a.a.isChecked()) goto _L6; else goto _L5
_L5:
                obj1 = ((fbe) (obj1)).b;
                obj = ((PlayerState) (obj)).track().uri();
                ((fae) (obj1)).a(Boolean.valueOf(false));
                obj1 = ((fae) (obj1)).g;
                Context context = (Context)((ezh) (obj1)).a.get();
                if (context != null)
                {
                    CollectionService.b(context, ((String) (obj)), ((ezh) (obj1)).b.toString(), ((ezh) (obj1)).c, com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging.c);
                    fop.a(context, ((ezh) (obj1)).b, ClientEventFactory.a("player", com.spotify.mobile.android.util.ClientEvent.SubEvent.S, null, null));
                    return;
                }
                if (true) goto _L1; else goto _L7
_L7:
            }

            public final void b()
            {
                boolean flag = true;
                Object obj = a;
                ((fbe) (obj)).d.k();
                obj = ((fbe) (obj)).b;
                PlayerState playerstate = ((fae) (obj)).d.getLastPlayerState();
                if (playerstate == null || playerstate.track() == null)
                {
                    if (playerstate != null)
                    {
                        flag = false;
                    }
                    Logger.a("Ignoring context menu click: last player state (%b) or track is null", new Object[] {
                        Boolean.valueOf(flag)
                    });
                    return;
                } else
                {
                    ctz.a(((fae) (obj)).c);
                    ((fae) (obj)).c.b(playerstate.track());
                    return;
                }
            }

            
            {
                a = fbe.this;
                super();
            }
        };
        viewgroup.addView(f);
    }

    public void a(ViewGroup viewgroup)
    {
        viewgroup.removeView(f);
    }

    public final void a(SessionState sessionstate)
    {
    }

    public final void a(Flags flags)
    {
        e = flags;
    }

    public final eda b()
    {
        return this;
    }

    public final void f(boolean flag)
    {
        a.a(flag);
    }

    public final void g()
    {
    }

    public void onPlayerStateReceived(PlayerState playerstate)
    {
        Object obj1 = playerstate.track();
        Object obj;
        if (obj1 != null)
        {
            obj = (String)((PlayerTrack) (obj1)).metadata().get("title");
            String s = PlayerTrackUtil.getArtists(((PlayerTrack) (obj1)));
            obj1 = (String)((PlayerTrack) (obj1)).metadata().get("mft.injection_source");
            boolean flag;
            if (obj1 != null && ((String) (obj1)).trim().toLowerCase(Locale.ENGLISH).equals("fallback"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                obj = String.format(f.getContext().getString(0x7f080650), new Object[] {
                    obj, s
                });
            }
            if (flag)
            {
                s = f.getContext().getString(0x7f080540).toUpperCase(Locale.getDefault());
            }
            a.setVisibility(0);
            a.a(((String) (obj)));
            a.a(s, flag);
        } else
        {
            a.setVisibility(4);
            a.a("");
            a.a("", false);
        }
        if (playerstate.track() != null)
        {
            obj = playerstate.track().uri();
        } else
        {
            obj = null;
        }
        obj = (new SpotifyLink(((String) (obj)))).c;
        if (fdo.a(e) && obj == com.spotify.mobile.android.util.SpotifyLink.LinkType.aT)
        {
            a.a(false);
            a.c(true);
            a.b(true);
        } else
        {
            playerstate = playerstate.track();
            a.c(false);
            if (playerstate != null)
            {
                g.a(playerstate.uri(), new eol(playerstate) {

                    private PlayerTrack a;
                    private fbe b;

                    public final void a(String s1)
                    {
                        if (!cty.a(s1, a.uri()))
                        {
                            return;
                        } else
                        {
                            b.a.b(false);
                            return;
                        }
                    }

                    public final void a(String s1, boolean flag1)
                    {
                        if (!cty.a(s1, a.uri()))
                        {
                            return;
                        } else
                        {
                            b.a.c(true);
                            b.a.b(true);
                            b.a.a(flag1);
                            return;
                        }
                    }

            
            {
                b = fbe.this;
                a = playertrack;
                super();
            }
                });
                return;
            }
        }
    }
}
