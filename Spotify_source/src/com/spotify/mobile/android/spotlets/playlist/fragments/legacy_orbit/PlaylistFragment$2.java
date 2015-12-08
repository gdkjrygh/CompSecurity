// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit;

import com.spotify.android.paste.widget.prettylist.StickyListView;
import dja;
import fjn;
import frr;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit:
//            PlaylistFragment

final class a
    implements frr
{

    private PlaylistFragment a;

    public final void a(fjn fjn1)
    {
        if (!a.Y && !a.Z.e().c())
        {
            fjn1.b = PlaylistFragment.k(a);
            return;
        } else
        {
            fjn1.b = null;
            return;
        }
    }

    public final void b(fjn fjn1)
    {
        fjn1.c = a.Z.e();
    }

    (PlaylistFragment playlistfragment)
    {
        a = playlistfragment;
        super();
    }
}
