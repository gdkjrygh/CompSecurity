// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit;

import com.google.common.base.Optional;
import frt;
import ftg;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit:
//            PlaylistFragment

final class a
    implements frt
{

    private PlaylistFragment a;

    public final void a(boolean flag)
    {
        if (!PlaylistFragment.d(a).b())
        {
            return;
        }
        if (flag)
        {
            PlaylistFragment.e(a).b(new int[] {
                2
            });
            return;
        } else
        {
            PlaylistFragment.e(a).a(new int[] {
                2
            });
            return;
        }
    }

    (PlaylistFragment playlistfragment)
    {
        a = playlistfragment;
        super();
    }
}
