// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit;

import android.text.TextUtils;
import android.widget.ListView;
import com.spotify.mobile.android.ui.view.FilterHeaderView;
import dob;
import fdn;
import gas;
import gbz;
import gfp;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit:
//            PlaylistFragment

final class a
    implements gas
{

    private PlaylistFragment a;

    public final void a()
    {
        PlaylistFragment.p(a).a(ateFlags.f, false);
    }

    public final void a(gfp gfp1)
    {
        PlaylistFragment.a(a, gfp1);
        PlaylistFragment.s(a).a(PlaylistFragment.a(a).a(), PlaylistFragment.r(a).a());
        PlaylistFragment.q(a);
    }

    public final void a(String s)
    {
        PlaylistFragment.b(a, s);
        if (!PlaylistFragment.n(a).isShown())
        {
            PlaylistFragment.k(a).setSelection(0);
        }
        if (!TextUtils.isEmpty(PlaylistFragment.o(a)))
        {
            PlaylistFragment.p(a).a(ateFlags.f, true);
            PlaylistFragment.p(a).a(ateFlags.h, false);
        } else
        {
            PlaylistFragment.p(a).a(ateFlags.f, false);
        }
        PlaylistFragment.q(a);
    }

    public final void a(boolean flag)
    {
        PlaylistFragment.p(a).a(ateFlags.g, flag);
    }

    ateFlags(PlaylistFragment playlistfragment)
    {
        a = playlistfragment;
        super();
    }
}
