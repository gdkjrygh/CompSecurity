// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit;

import android.view.ViewGroup;
import android.widget.ListView;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import dja;
import ewi;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit:
//            PlaylistFragment

final class a
    implements ewi
{

    private PlaylistFragment a;

    public final ListView a()
    {
        return PlaylistFragment.k(a);
    }

    public final ViewGroup b()
    {
        return a.Z.f();
    }

    public final DownloadHeaderView c()
    {
        return PlaylistFragment.f(a);
    }

    (PlaylistFragment playlistfragment)
    {
        a = playlistfragment;
        super();
    }
}
