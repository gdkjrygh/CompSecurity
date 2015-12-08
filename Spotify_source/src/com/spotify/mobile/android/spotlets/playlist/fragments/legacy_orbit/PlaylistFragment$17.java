// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit;

import ewh;
import gca;
import java.util.EnumSet;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit:
//            PlaylistFragment

final class b extends gca
{

    private PlaylistFragment b;

    public final void a(EnumSet enumset, EnumSet enumset1)
    {
        if (!enumset.contains(teFlags.l) || !enumset.contains(teFlags.e))
        {
            PlaylistFragment.g(b).b(false);
            return;
        } else
        {
            PlaylistFragment.g(b).b(true);
            return;
        }
    }

    teFlags(PlaylistFragment playlistfragment, EnumSet enumset)
    {
        b = playlistfragment;
        super(enumset);
    }
}
