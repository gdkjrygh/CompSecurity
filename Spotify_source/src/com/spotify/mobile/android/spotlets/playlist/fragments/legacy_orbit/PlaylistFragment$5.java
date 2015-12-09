// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit;

import android.view.View;
import gms;
import u;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit:
//            PlaylistFragment

final class a
    implements android.view.r
{

    private boolean a;
    private PlaylistFragment b;

    public final void onClick(View view)
    {
        u u1 = b.k();
        u u2 = b.k();
        if (a)
        {
            view = "spotify:hub:music";
        } else
        {
            view = "spotify:app:browse";
        }
        u1.startActivity(gms.a(u2, view).a);
    }

    (PlaylistFragment playlistfragment, boolean flag)
    {
        b = playlistfragment;
        a = flag;
        super();
    }
}
