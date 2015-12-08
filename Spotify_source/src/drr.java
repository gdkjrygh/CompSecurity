// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContextIndex;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class drr
    implements drs
{

    public final Player a;
    PlayerState b;
    final Set c = new HashSet();
    public final com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver d = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

        private drr a;

        public final void onPlayerStateReceived(PlayerState playerstate)
        {
            boolean flag;
            if (a.b == null || !TextUtils.equals(a.b.entityUri(), playerstate.entityUri()) || !cty.a(a.b.track(), playerstate.track()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a.b = playerstate;
            if (flag)
            {
                for (playerstate = a.c.iterator(); playerstate.hasNext(); ((drt)playerstate.next()).a()) { }
            }
        }

            
            {
                a = drr.this;
                super();
            }
    };

    private drr(Player player)
    {
        a = (Player)ctz.a(player);
        a.registerPlayerStateObserver(d);
    }

    public static drr a(Resolver resolver, String s, FeatureIdentifier featureidentifier, FeatureIdentifier featureidentifier1)
    {
        return new drr(((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(resolver, s, featureidentifier, featureidentifier1));
    }

    public final void a(drt drt)
    {
        c.add(ctz.a(drt));
    }

    public final void a(Iterable iterable, drz drz1, String s, Map map)
    {
        String s1 = drz1.getGroup();
        ArrayList arraylist = new ArrayList();
        iterable = iterable.iterator();
        int i = -1;
        int k = -1;
label0:
        do
        {
            int j;
label1:
            {
                if (!iterable.hasNext())
                {
                    break label0;
                }
                drz drz2 = (drz)iterable.next();
                if (s1 != null)
                {
                    j = i;
                    if (!s1.equals(drz2.getGroup()))
                    {
                        break label1;
                    }
                }
                if (drz2.isPlayable())
                {
                    i++;
                    arraylist.add(drz2.toPlayerTrack());
                    j = i;
                    if (drz2 == drz1)
                    {
                        k = i;
                        continue;
                    }
                } else
                {
                    Assertion.b((new StringBuilder("Item ")).append(drz2.getUri()).append(" in ").append(s).append(" is not playable!").toString());
                    j = i;
                }
            }
            i = j;
        } while (true);
        iterable = PlayerContext.create(s, (PlayerTrack[])arraylist.toArray(new PlayerTrack[arraylist.size()]), map);
        drz1 = new PlayOptions(new PlayerContextIndex(0, k), null, false, null, null);
        a.playWithViewUri(iterable, drz1, s);
    }

    public final boolean a(String s)
    {
        return b != null && s.equals(b.entityUri());
    }

    public final boolean b(String s)
    {
        return b != null && b.track() != null && TextUtils.equals(s, b.track().uri());
    }
}
