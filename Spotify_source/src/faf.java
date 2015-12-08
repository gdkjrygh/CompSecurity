// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.stateful.StatefulPlayer;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;

public class faf
    implements dmx
{

    public faf()
    {
    }

    public static fae a(Resolver resolver, fai fai, ezh ezh, ezn ezn, fcg fcg, fbp fbp, fcs fcs, Flags flags, 
            fal fal, eqf eqf, ezj ezj, eqi eqi, ezk ezk, ezy ezy)
    {
        Object obj = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(resolver, ViewUri.M.toString(), FeatureIdentifier.H, FeatureIdentifier.I);
        StatefulPlayer statefulplayer = new StatefulPlayer(((com.spotify.mobile.android.cosmos.player.v2.Player) (obj)));
        resolver = new ezu(flags);
        obj = new eef(fbp, ((com.spotify.mobile.android.cosmos.player.v2.Player) (obj)));
        ezn = new fbm(new fbl(statefulplayer, ezh, ezn, fcg, fbp, fcs, resolver, fal, eqi, ((eef) (obj)), ezy, ezy, ezy, flags));
        fcg = eqe.a(statefulplayer, eqf, eqi);
        if (((Boolean)flags.a(fys.aC)).booleanValue())
        {
            resolver = new erk(ezj);
        } else
        {
            resolver = new ezi(ezj);
        }
        return new fae(fai, fcg, resolver, statefulplayer, ezn, ezh, fcs, ((eef) (obj)), ezk, ezy, flags);
    }
}
