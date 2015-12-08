// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.Pair;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.SpotifyLink;
import java.util.Map;

public final class faa
    implements fuj
{

    public final fab a;
    public ezz b;
    public final Player c;
    public final dxc d;
    public final dwh e;
    public com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver f;
    Flags g;
    public dwx h;

    public faa(Player player, fab fab1, dxc dxc1, dwh dwh1, faq faq)
    {
        f = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

            private faa a;

            public final void onPlayerStateReceived(PlayerState playerstate)
            {
                playerstate = new fah(playerstate.track(), playerstate.future());
                faa faa1 = a;
                faa1.b = playerstate;
                faa1.a.a(playerstate);
            }

            
            {
                a = faa.this;
                super();
            }
        };
        h = new dwx() {

            private faa a;

            public final void a(Flags flags)
            {
                a.g = flags;
                if (!gex.a(flags))
                {
                    a.a.h();
                }
            }

            
            {
                a = faa.this;
                super();
            }
        };
        c = (Player)ctz.a(player);
        a = (fab)ctz.a(fab1);
        d = (dxc)ctz.a(dxc1);
        e = (dwh)ctz.a(dwh1);
        ctz.a(faq);
        b = new fah();
    }

    public final void a(SpotifyContextMenu spotifycontextmenu, Pair pair)
    {
        boolean flag1 = false;
        PlayerTrack playertrack = (PlayerTrack)pair.first;
        int i = ((Integer)pair.second).intValue();
        Object obj = (new SpotifyLink(playertrack.uri())).c;
        pair = (String)playertrack.metadata().get("title");
        if (obj == com.spotify.mobile.android.util.SpotifyLink.LinkType.P)
        {
            obj = new ezm();
            obj.a = i;
            obj.b = pair;
            obj.c = playertrack.uri();
            obj.d = "video".equals(playertrack.metadata().get("media.type"));
            obj.e = true;
            obj.f = fiy.a(g);
            obj.g = fiy.d(g);
            obj.h = QueueManager.isExplicitlyQueued(playertrack);
            a.a(spotifycontextmenu, ((ezm) (obj)));
            return;
        }
        obj = new fat();
        obj.a = i;
        obj.b = pair;
        obj.c = playertrack.uri();
        boolean flag;
        if (!TextUtils.isEmpty((CharSequence)playertrack.metadata().get("album_uri")))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj.d = flag;
        flag = flag1;
        if (!TextUtils.isEmpty((CharSequence)playertrack.metadata().get("artist_uri")))
        {
            flag = true;
        }
        obj.e = flag;
        obj.f = true;
        obj.g = QueueManager.isExplicitlyQueued(playertrack);
        a.a(spotifycontextmenu, ((fat) (obj)));
    }

    public final volatile void a(SpotifyContextMenu spotifycontextmenu, Object obj)
    {
        a(spotifycontextmenu, (Pair)obj);
    }
}
