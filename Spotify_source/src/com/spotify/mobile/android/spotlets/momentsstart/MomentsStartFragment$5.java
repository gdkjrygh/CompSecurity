// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.momentsstart;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.momentsstart.model.MomentFlags;
import com.spotify.mobile.android.spotlets.momentsstart.model.MomentsStart;
import com.spotify.mobile.android.spotlets.momentsstart.view.MomentMenuView;
import com.spotify.mobile.android.spotlets.momentsstart.view.MomentsVerticalView;
import com.spotify.mobile.android.spotlets.momentsstart.view.PlayButtonOverlayView;
import evd;

// Referenced classes of package com.spotify.mobile.android.spotlets.momentsstart:
//            MomentsStartFragment

final class a
    implements evd
{

    private MomentsStartFragment a;

    public final void a()
    {
        a.a.setVisibility(0);
        boolean flag;
        if (MomentsStartFragment.k(a) != null && MomentsStartFragment.k(a).isPlaying() && !MomentsStartFragment.k(a).isPaused())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (a.L() && MomentsStartFragment.f(a).flags.playButtonCta && !flag)
        {
            a.Y.setVisibility(0);
        }
    }

    public final void a(int i)
    {
        MomentsStartFragment.a(a, true);
        a.a.b(i);
        a.Z.a();
    }

    public final void b()
    {
        a.a.setVisibility(4);
        if (a.L() && MomentsStartFragment.f(a).flags.playButtonCta)
        {
            a.Y.setVisibility(8);
        }
    }

    iew(MomentsStartFragment momentsstartfragment)
    {
        a = momentsstartfragment;
        super();
    }
}
