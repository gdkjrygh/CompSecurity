// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit;

import android.view.View;
import dob;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit:
//            PlaylistFragment

final class a
    implements android.view.
{

    private PlaylistFragment a;

    public final void onClick(View view)
    {
        view = a;
        boolean flag;
        if (!PlaylistFragment.a(a).l())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        PlaylistFragment.a(view, flag);
    }

    (PlaylistFragment playlistfragment)
    {
        a = playlistfragment;
        super();
    }
}
