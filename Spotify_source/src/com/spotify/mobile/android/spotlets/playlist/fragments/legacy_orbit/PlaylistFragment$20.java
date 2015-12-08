// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit;

import dob;
import fdn;
import gas;
import gca;
import java.util.EnumSet;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit:
//            PlaylistFragment

final class b extends gca
{

    private PlaylistFragment b;

    public final void a(EnumSet enumset, EnumSet enumset1)
    {
        if (enumset1.contains(teFlags.b) && PlaylistFragment.a(b).k() && PlaylistFragment.a(b).n())
        {
            enumset = PlaylistFragment.a(b).a();
            if (PlaylistFragment.s(b).a(enumset, null, PlaylistFragment.P(b)) == null)
            {
                PlaylistFragment.R(b).a(PlaylistFragment.Q(b));
            }
        }
    }

    teFlags(PlaylistFragment playlistfragment)
    {
        b = playlistfragment;
        super();
    }
}
