// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.android.util.Objects;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public final class gon
{

    final String a;
    final Flags b;
    public final gom c;
    public Resolver d;
    Random e;
    public final gcu f;

    public gon(Context context, String s, Verified verified, Flags flags, long l, FeatureIdentifier featureidentifier)
    {
        a = s;
        b = flags;
        c = new gom(context, verified, flags);
        e = new Random(l);
        d = Cosmos.getResolver(context);
        f = new gcu(((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(d, "station", FeatureIdentifier.aD, featureidentifier)) {

            private gon b;

            protected final void a(PlayerState playerstate)
            {
                String s1;
                boolean flag;
                flag = false;
                s1 = gpl.b(b.a);
                if (!playerstate.entityUri().equals(s1)) goto _L2; else goto _L1
_L1:
                Object obj = b;
                Object obj1 = playerstate.track();
                PlayerTrack aplayertrack[] = playerstate.reverse();
                PlayerTrack aplayertrack1[] = playerstate.future();
                if (!PlayerTrackUtil.isAd(((PlayerTrack) (obj1))))
                {
                    if (obj1 == null || gon.b(new PlayerTrack[] {
            obj1
        }).length == 0)
                    {
                        Logger.b("Current track does not have any data. Discarding PlayerState event.", new Object[0]);
                    } else
                    {
                        aplayertrack = gon.b(aplayertrack);
                        aplayertrack1 = gon.b(aplayertrack1);
                        if (gex.a(((gon) (obj)).b))
                        {
                            ((gon) (obj)).c.clear();
                            PlayerTrack aplayertrack2[] = new PlayerTrack[aplayertrack.length + aplayertrack1.length + 1];
                            System.arraycopy(aplayertrack, 0, aplayertrack2, 0, aplayertrack.length);
                            aplayertrack2[aplayertrack.length] = ((PlayerTrack) (obj1));
                            System.arraycopy(aplayertrack1, 0, aplayertrack2, aplayertrack.length + 1, aplayertrack1.length);
                            ((gon) (obj)).a(aplayertrack2);
                        } else
                        {
                            HashMap hashmap = new HashMap();
                            hashmap.put(((PlayerTrack) (obj1)).uid(), obj1);
                            int i1 = aplayertrack.length;
                            for (int i = 0; i < i1; i++)
                            {
                                obj1 = aplayertrack[i];
                                hashmap.put(((PlayerTrack) (obj1)).uid(), obj1);
                            }

                            i1 = aplayertrack1.length;
                            for (int j = ((flag) ? 1 : 0); j < i1; j++)
                            {
                                obj1 = aplayertrack1[j];
                                hashmap.put(((PlayerTrack) (obj1)).uid(), obj1);
                            }

                            int k = ((gon) (obj)).c.getCount() - 1;
                            while (k >= 0) 
                            {
                                obj1 = (PlayerTrack)((gon) (obj)).c.getItem(k);
                                if (hashmap.containsKey(((PlayerTrack) (obj1)).uid()))
                                {
                                    hashmap.remove(((PlayerTrack) (obj1)).uid());
                                } else
                                {
                                    ((gon) (obj)).c.remove(obj1);
                                }
                                k--;
                            }
                            obj1 = hashmap.values().iterator();
                            while (((Iterator) (obj1)).hasNext()) 
                            {
                                PlayerTrack playertrack = (PlayerTrack)((Iterator) (obj1)).next();
                                ((gon) (obj)).c.insert(playertrack, ((gon) (obj)).e.nextInt(((gon) (obj)).c.getCount() + 1));
                            }
                        }
                    }
                }
                obj = b.c;
                playerstate = playerstate.track();
                if (playerstate == null) goto _L4; else goto _L3
_L3:
                if (TextUtils.isEmpty(playerstate.uid())) goto _L6; else goto _L5
_L5:
                playerstate = playerstate.uid();
_L8:
                if (!playerstate.equals(((gom) (obj)).a))
                {
                    obj.a = playerstate;
                    ((gom) (obj)).notifyDataSetChanged();
                }
_L2:
                return;
_L6:
                if (!TextUtils.isEmpty(playerstate.uri()))
                {
                    playerstate = playerstate.uri();
                    continue; /* Loop/switch isn't completed */
                }
_L4:
                playerstate = "";
                if (true) goto _L8; else goto _L7
_L7:
            }

            protected final boolean a(PlayerState playerstate, PlayerState playerstate1)
            {
label0:
                {
                    boolean flag1 = false;
                    if (!b(playerstate, playerstate1))
                    {
                        boolean flag;
                        if (!Objects.equals(playerstate.track(), playerstate1.track()))
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (!flag)
                        {
                            break label0;
                        }
                    }
                    flag1 = true;
                }
                return flag1;
            }

            
            {
                b = gon.this;
                super(player, 14, 14);
            }
        };
    }

    static transient PlayerTrack[] b(PlayerTrack aplayertrack[])
    {
        boolean flag = false;
        int j = aplayertrack.length;
        for (int i = 0; i < j; i++)
        {
            if (TextUtils.isEmpty((String)aplayertrack[i].metadata().get("title")))
            {
                ArrayList arraylist = new ArrayList();
                int k = aplayertrack.length;
                for (i = ((flag) ? 1 : 0); i < k; i++)
                {
                    PlayerTrack playertrack = aplayertrack[i];
                    if (!TextUtils.isEmpty((String)playertrack.metadata().get("title")))
                    {
                        arraylist.add(playertrack);
                    }
                }

                return (PlayerTrack[])arraylist.toArray(new PlayerTrack[arraylist.size()]);
            }
        }

        return aplayertrack;
    }

    public final void a()
    {
        d.connect();
        f.a();
    }

    public final void a(PlayerTrack aplayertrack[])
    {
        if (!gex.a(b))
        {
            PlayerTrack aplayertrack1[] = new PlayerTrack[aplayertrack.length];
            System.arraycopy(aplayertrack, 0, aplayertrack1, 0, aplayertrack.length);
            Collections.shuffle(Arrays.asList(aplayertrack1), e);
            c.addAll(aplayertrack1);
            return;
        } else
        {
            c.addAll(aplayertrack);
            return;
        }
    }
}
