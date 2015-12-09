// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.ads.FeaturedAction;

public final class fbs
    implements com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver, eda, fbq
{

    fbt a;
    FeaturedAction b;
    private final fbr c;

    public fbs(fbr fbr1)
    {
        a = new fbt();
        b = FeaturedAction.a();
        c = fbr1;
    }

    public final void a(SessionState sessionstate)
    {
    }

    public final void a(FeaturedAction featuredaction)
    {
        b = featuredaction;
    }

    public final void onPlayerStateReceived(PlayerState playerstate)
    {
        fbr fbr1;
label0:
        {
            playerstate = new fbt(playerstate);
            if (!playerstate.equals(a))
            {
                a = playerstate;
                playerstate = fbn.c(a.a);
                fbr1 = c;
                fbr1.b = playerstate;
                if (fbr.a(fbr1.a) <= 0)
                {
                    break label0;
                }
                fbr1.d();
            }
            return;
        }
        fbr1.c = new fbr._cls1(fbr1);
        fbr1.a.getViewTreeObserver().addOnGlobalLayoutListener(fbr1.c);
    }
}
