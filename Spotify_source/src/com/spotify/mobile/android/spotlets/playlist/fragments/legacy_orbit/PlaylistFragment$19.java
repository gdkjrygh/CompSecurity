// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit;

import android.os.Bundle;
import android.widget.ListView;
import com.spotify.mobile.android.ui.view.LoadingView;
import fts;
import gbz;
import gca;
import java.util.EnumSet;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit:
//            PlaylistFragment

final class b extends gca
{

    private PlaylistFragment b;

    public final void a(EnumSet enumset, EnumSet enumset1)
    {
        if (!enumset.contains(teFlags.i))
        {
            if (enumset.contains(teFlags.b) && enumset.contains(teFlags.c))
            {
                enumset = b.g();
                enumset1 = new Bundle();
                if (enumset == null)
                {
                    enumset = enumset1;
                }
                enumset = (Bundle)enumset;
                if (PlaylistFragment.L(b) != -1)
                {
                    PlaylistFragment.k(b).setSelectionFromTop(PlaylistFragment.L(b), 0);
                    PlaylistFragment.p(b).a(teFlags.j, true);
                    PlaylistFragment.a(b, -1);
                } else
                {
                    PlaylistFragment.M(b);
                    PlaylistFragment.p(b).a(teFlags.k, true);
                }
                if (enumset.getBoolean("autoplay", false))
                {
                    enumset.putBoolean("autoplay", false);
                    if (PlaylistFragment.N(b) == -1 && !PlaylistFragment.K(b).isEmpty())
                    {
                        PlaylistFragment.b(b, 0);
                    }
                    if (PlaylistFragment.N(b) != -1)
                    {
                        int i = PlaylistFragment.c(b, PlaylistFragment.N(b));
                        PlaylistFragment.d(b, i);
                        PlaylistFragment.b(b, -1);
                    }
                }
                PlaylistFragment.p(b).a(teFlags.i, true);
            }
        } else
        if (enumset1.contains(teFlags.i))
        {
            PlaylistFragment.O(b).b();
            PlaylistFragment.p(b).a(teFlags.l, true);
            return;
        }
    }

    teFlags(PlaylistFragment playlistfragment, EnumSet enumset)
    {
        b = playlistfragment;
        super(enumset);
    }
}
