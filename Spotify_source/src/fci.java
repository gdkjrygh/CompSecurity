// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaPlayer;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.running.service.RunningService;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.util.LinkedList;

public final class fci
    implements com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver, eda, fen
{

    final fbb a;
    few b;
    eqe c;
    fcl d;
    private final fdy e;
    private final fec f;
    private int g;

    public fci(fbb fbb1, fcl fcl1, eqe eqe1, fdy fdy1, few few1, fec fec1)
    {
        dmz.a(fop);
        a = (fbb)ctz.a(fbb1);
        d = fcl1;
        c = (eqe)ctz.a(eqe1);
        e = (fdy)ctz.a(fdy1);
        b = (few)ctz.a(few1);
        f = (fec)ctz.a(fec1);
        e.a(this);
        b(e.a);
        g = e.a;
    }

    private void a()
    {
        boolean flag1 = true;
        fcl fcl1 = d;
        boolean flag;
        if (!e.d())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fcl1.g(flag);
        fcl1 = d;
        if (!e.c())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        fcl1.h(flag);
    }

    public final void a(int i)
    {
        b.a(i);
        Object obj = b.e.a;
        ((ffl) (obj)).a(i);
        if (((ffl) (obj)).b > 0)
        {
            ffk ffk1 = ((ffl) (obj)).a;
            ffj ffj1 = ffk1.a;
            ffj1.e = false;
            ffj1.b.stop();
            ffk1.b.clear();
            ((ffl) (obj)).a.a(0x7f070010);
            ((ffl) (obj)).a();
        }
        b(i);
        f.a(i);
        int j = g;
        obj = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.dz);
        ((ClientEvent) (obj)).a("new-tempo", String.valueOf(e.a));
        ((ClientEvent) (obj)).a("old-tempo", String.valueOf(j));
        fop.a(d.c(), ViewUri.l, ((ClientEvent) (obj)));
        g = i;
    }

    public final void a(SessionState sessionstate)
    {
        if (sessionstate == null)
        {
            return;
        }
        b.a = sessionstate.b;
        b.a();
        if (sessionstate.j)
        {
            a();
            return;
        } else
        {
            d.h(false);
            d.g(false);
            return;
        }
    }

    public final void b(int i)
    {
        d.a(i);
        a();
    }

    public final void onPlayerStateReceived(PlayerState playerstate)
    {
        c.onPlayerStateReceived(playerstate);
    }
}
