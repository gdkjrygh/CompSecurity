// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit;

import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import dgo;
import dja;
import evs;
import ewh;
import gcg;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit:
//            PlaylistFragment

final class a
    implements evs
{

    private PlaylistFragment a;

    public final void a()
    {
        PlaylistFragment.f(a).a();
        if (!a.Y)
        {
            a.Z.a(gcg.b(a.k(), 0x7f0f010f));
        }
        if (PlaylistFragment.g(a) != null)
        {
            PlaylistFragment.g(a).b(false);
        }
    }

    public final void a(int i, int j)
    {
        PlaylistFragment.f(a).a(i, j);
        if (!a.Y)
        {
            a.Z.a(dgo.b(a.k(), 0x7f0101c6));
        }
        if (PlaylistFragment.g(a) != null && !com.spotify.mobile.android.provider..a(i))
        {
            PlaylistFragment.g(a).b();
        }
    }

    (PlaylistFragment playlistfragment)
    {
        a = playlistfragment;
        super();
    }
}
