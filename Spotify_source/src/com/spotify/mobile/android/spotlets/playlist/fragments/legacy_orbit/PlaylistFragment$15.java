// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit;

import an;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import cu;
import da;
import dnz;
import dob;
import dtt;
import duc;
import fts;
import gbz;
import gfp;
import gjf;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit:
//            PlaylistFragment

final class a
    implements an
{

    private PlaylistFragment a;

    public final da a(Bundle bundle)
    {
        bundle = dtt.a(PlaylistFragment.a(a).a(), PlaylistFragment.o(a));
        return new cu(a.k(), bundle, dnz.a, null, PlaylistFragment.r(a).a());
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        boolean flag = true;
        obj = (Cursor)obj;
        if (duc.a(((Cursor) (obj))))
        {
            PlaylistFragment.J(a).b();
            PlaylistFragment.K(a).b(((Cursor) (obj)));
            PlaylistFragment.p(a).a(teFlags.c, true);
            teFlags teflags;
            if (!TextUtils.isEmpty(PlaylistFragment.o(a)))
            {
                PlaylistFragment.p(a).a(teFlags.d, true);
                PlaylistFragment.p(a).a(teFlags.h, true);
            } else
            {
                PlaylistFragment.p(a).a(teFlags.d, false);
            }
            obj = PlaylistFragment.p(a);
            teflags = teFlags.e;
            if (PlaylistFragment.K(a).getCount() == 0)
            {
                flag = false;
            }
            ((gbz) (obj)).a(teflags, flag);
        }
    }

    teFlags(PlaylistFragment playlistfragment)
    {
        a = playlistfragment;
        super();
    }
}
