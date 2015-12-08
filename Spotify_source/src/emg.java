// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.spotify.cosmos.android.RxTypedResolver;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.charts.model.Chart;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.util.Locale;

public final class emg
    implements com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver
{

    public emk a;
    public RxTypedResolver b;
    public hfg c;
    public String d;
    public String e;
    public Player f;
    public Flags g;
    public String h;
    public Chart i;
    public PlayerContext j;

    public emg(emk emk1, RxTypedResolver rxtypedresolver, String s, String s1, Player player, Flags flags)
    {
        h = ghq.a(Locale.getDefault());
        a = (emk)ctz.a(emk1);
        b = (RxTypedResolver)ctz.a(rxtypedresolver);
        d = (String)ctz.a(s);
        e = (String)ctz.a(s1);
        g = (Flags)ctz.a(flags);
        f = (Player)ctz.a(player);
    }

    static emk a(emg emg1)
    {
        return emg1.a;
    }

    public final void onPlayerStateReceived(PlayerState playerstate)
    {
        if (playerstate.track() != null && TextUtils.equals(d, playerstate.entityUri()))
        {
            a.a(playerstate.track().uri());
            return;
        } else
        {
            a.a(null);
            return;
        }
    }

    // Unreferenced inner class emg$1

/* anonymous class */
    public final class _cls1
        implements hfb
    {

        private emg a;

        public final void onCompleted()
        {
        }

        public final void onError(Throwable throwable)
        {
            emg.a(a).J();
        }

        public final void onNext(Object obj)
        {
            obj = (Chart)obj;
            emg.a(a).a(((Chart) (obj)));
        }

            public 
            {
                a = emg.this;
                super();
            }
    }

}
