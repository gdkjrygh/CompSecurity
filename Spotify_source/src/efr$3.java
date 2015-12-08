// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.util.ClientEventFactory;

final class ang.Object
    implements android.view.nClickListener
{

    private efr a;

    public final void onClick(View view)
    {
        efr.l(a);
        fop.a(a.k(), efr.k(a), ClientEventFactory.a("album", com.spotify.mobile.android.util.Event.SubEvent.X, null, null));
        view = PlayerContext.create(a.H(), efr.m(a));
        com.spotify.mobile.android.cosmos.player.v2.PlayOptions playoptions = (new com.spotify.mobile.android.cosmos.player.v2.tions.Builder()).playerOptionsOverride(true, false, false).build();
        efr.n(a).play(view, playoptions);
    }

    (efr efr1)
    {
        a = efr1;
        super();
    }
}
