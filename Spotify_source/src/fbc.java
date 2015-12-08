// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.service.session.SessionState;

public abstract class fbc
    implements com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver, eda
{

    public final fbb a;
    public eqe b;

    public fbc(eqe eqe1, fbb fbb1)
    {
        b = (eqe)ctz.a(eqe1);
        a = (fbb)ctz.a(fbb1);
    }

    public void a()
    {
        a.c();
        b.a();
    }

    public abstract void a(PlayerState playerstate);

    public void a(SessionState sessionstate)
    {
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public void onPlayerStateReceived(PlayerState playerstate)
    {
        b.onPlayerStateReceived(playerstate);
        a(playerstate);
    }
}
