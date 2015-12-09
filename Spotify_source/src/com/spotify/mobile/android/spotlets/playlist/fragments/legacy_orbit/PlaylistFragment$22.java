// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit;

import android.os.Bundle;
import android.widget.ListView;
import gbz;
import ggf;
import java.util.EnumSet;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit:
//            PlaylistFragment

final class a
    implements ggf
{

    private PlaylistFragment a;

    public final void a()
    {
        PlaylistFragment.a(a, -1);
    }

    public final void a(int i)
    {
        if (PlaylistFragment.k(a) != null)
        {
            if (i > 0)
            {
                PlaylistFragment.a(a, i);
                gbz gbz1 = PlaylistFragment.p(a);
                teFlags teflags = teFlags.i;
                if (gbz1.a.contains(teflags))
                {
                    PlaylistFragment.k(a).setSelectionFromTop(PlaylistFragment.L(a), 0);
                }
            }
            if (a.g() != null && a.g().getBoolean("autoplay", false))
            {
                PlaylistFragment.b(a, i);
            }
        }
    }

    teFlags(PlaylistFragment playlistfragment)
    {
        a = playlistfragment;
        super();
    }
}
