// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit;

import android.view.View;
import dob;
import gms;
import u;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit:
//            PlaylistFragment

final class a
    implements android.view.
{

    private PlaylistFragment a;

    public final void onClick(View view)
    {
        if (PlaylistFragment.a(a).w() == null)
        {
            return;
        } else
        {
            a.k().startActivity(gms.a(a.k(), PlaylistFragment.a(a).w()).a(PlaylistFragment.a(a).b()).a);
            return;
        }
    }

    (PlaylistFragment playlistfragment)
    {
        a = playlistfragment;
        super();
    }
}
