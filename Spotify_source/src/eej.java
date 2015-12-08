// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules;
import com.spotify.music.spotlets.FeatureIdentifier;

public class eej
    implements com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver, dmx
{

    public boolean a;
    public boolean b;
    public boolean c;
    private Resolver d;
    private Player e;
    private Context f;
    private String g;
    private boolean h;

    public eej(Context context)
    {
        f = context;
        g = "";
        a = false;
        b = false;
        c = false;
        h = false;
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        d = Cosmos.getResolver(f);
        d.connect();
        e = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(d, "", FeatureIdentifier.az, FeatureIdentifier.az);
        e.registerPlayerStateObserver(this);
        h = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        e.unregisterPlayerStateObserver(this);
        d.destroy();
        d = null;
        e = null;
        h = false;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a()
    {
label0:
        {
            boolean flag1 = h;
            boolean flag;
            if (a && b && c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag1 != flag)
            {
                if (!h)
                {
                    break label0;
                }
                c();
            }
            return;
        }
        b();
    }

    public void onPlayerStateReceived(PlayerState playerstate)
    {
        playerstate = playerstate.entityUri();
        if (g == null)
        {
            g = "";
        }
        if (!g.equals(playerstate))
        {
            g = playerstate;
            efg efg1 = (efg)dmz.a(efg);
            boolean flag;
            if (!TextUtils.isEmpty(playerstate) && efg1.a(playerstate) != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                playerstate = "is";
            } else
            {
                playerstate = "is not";
            }
            ((AdRules)dmz.a(com/spotify/mobile/android/spotlets/ads/rules/AdRules)).a(com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.e, flag);
        }
    }
}
