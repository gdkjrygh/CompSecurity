// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.service.ForceInCollection;
import com.spotify.music.spotlets.radio.model.ThumbState;
import java.util.Map;

public final class ecm extends ecq
{

    ThumbState a;
    ecn b;
    private gou g;

    public ecm(Context context, eco eco, Handler handler)
    {
        super(context, eco, handler);
        a = ThumbState.a;
        b = new ecn(this, (byte)0);
        dmz.a(gow);
        g = gow.a(context, new gpj() {

            private ecm a;

            public final void a(gpg gpg1)
            {
                a.a = (ThumbState)ctz.a(gpg1.a());
                a.d.post(a.b);
            }

            
            {
                a = ecm.this;
                super();
            }
        });
    }

    public static boolean a(PlayerState playerstate)
    {
        return playerstate.track() != null && playerstate.track().metadata().containsKey("is_advertisement") && Boolean.valueOf((String)playerstate.track().metadata().get("is_advertisement")).booleanValue();
    }

    public final void a()
    {
        super.a();
        g.b();
    }

    public final void a(ForceInCollection forceincollection, Player player)
    {
        ecn ecn1 = b;
        ecn1.a = forceincollection;
        ecn1.b = player;
        g.a();
        d.post(b);
    }
}
