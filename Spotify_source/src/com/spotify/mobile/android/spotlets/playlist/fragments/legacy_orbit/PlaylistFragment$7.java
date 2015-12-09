// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit;

import android.net.Uri;
import ggt;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit:
//            PlaylistFragment

final class a
    implements ggt
{

    private PlaylistFragment a;

    public final void a_(Uri uri)
    {
        if (uri != null && !Uri.EMPTY.equals(uri))
        {
            PlaylistFragment.a(a, uri.toString());
        }
    }

    (PlaylistFragment playlistfragment)
    {
        a = playlistfragment;
        super();
    }
}
