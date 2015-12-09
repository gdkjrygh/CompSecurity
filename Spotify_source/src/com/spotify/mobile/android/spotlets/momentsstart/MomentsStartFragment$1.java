// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.momentsstart;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.momentsstart.model.MomentsStart;
import com.spotify.mobile.android.ui.stuff.ContentViewManager;
import com.spotify.mobile.android.util.logging.Logger;
import eum;

// Referenced classes of package com.spotify.mobile.android.spotlets.momentsstart:
//            MomentsStartFragment

public final class a
    implements eum
{

    final MomentsStartFragment a;

    public final void a(MomentsStart momentsstart, int ai[])
    {
        if (!a.o())
        {
            return;
        } else
        {
            a.a(momentsstart, ai);
            MomentsStartFragment.b(a).fetchState(new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

                private MomentsStartFragment._cls1 a;

                public final void onPlayerStateReceived(PlayerState playerstate)
                {
                    if (a.a.L())
                    {
                        MomentsStartFragment.a(a.a, playerstate);
                    }
                    MomentsStartFragment.a(a.a).b(null);
                }

            
            {
                a = MomentsStartFragment._cls1.this;
                super();
            }
            });
            return;
        }
    }

    public final void a(Throwable throwable, com.spotify.mobile.android.cosmos..ErrorCause errorcause)
    {
        Logger.b(throwable, "Exception when fetching Hermes content: %s", new Object[] {
            errorcause.name()
        });
        MomentsStartFragment.a(a).c(true);
    }

    _cls1.a(MomentsStartFragment momentsstartfragment)
    {
        a = momentsstartfragment;
        super();
    }
}
