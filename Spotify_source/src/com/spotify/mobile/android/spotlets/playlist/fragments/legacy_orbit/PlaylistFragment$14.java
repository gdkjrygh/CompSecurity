// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit;

import am;
import an;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import cu;
import da;
import dja;
import djr;
import dny;
import dob;
import duc;
import evq;
import evv;
import fpe;
import gbz;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit:
//            PlaylistFragment

final class a
    implements an
{

    private PlaylistFragment a;

    public final da a(Bundle bundle)
    {
        return new cu(a.k(), PlaylistFragment.h(a), dny.a, null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        Cursor cursor = (Cursor)obj;
        if (!cursor.moveToFirst() || !duc.a(cursor))
        {
            return;
        }
        obj = PlaylistFragment.a(a).G();
        ((dny)PlaylistFragment.a(a)).a(cursor, "");
        a.g().putString("playlist_owner_uri", PlaylistFragment.a(a).w());
        a.g().putString("title", PlaylistFragment.a(a).b());
        if (!PlaylistFragment.C(a))
        {
            PlaylistFragment.a(a, PlaylistFragment.a(a).D(), PlaylistFragment.a(a).E(), PlaylistFragment.a(a).F());
            String s = PlaylistFragment.a(a).b();
            ((djr)a.Z.a()).a(s);
        } else
        {
            ((fpe)a.k()).a(a, PlaylistFragment.a(a).b());
        }
        if (!a.Y)
        {
            View view = PlaylistFragment.D(a);
            int i;
            if (PlaylistFragment.a(a).B())
            {
                i = 0;
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
        }
        ((fpe)a.k()).P_();
        a.u().a(0x7f110091, null, PlaylistFragment.E(a));
        PlaylistFragment.t(a).a(new evq(PlaylistFragment.a(a)));
        if (!TextUtils.equals(PlaylistFragment.a(a).G(), ((CharSequence) (obj))) || !PlaylistFragment.C(a) && PlaylistFragment.F(a))
        {
            PlaylistFragment.G(a);
        }
        if (!PlaylistFragment.C(a))
        {
            PlaylistFragment.H(a);
        }
        PlaylistFragment.p(a).a(teFlags.b, true);
        obj = a;
        PlaylistFragment.I(a);
        PlaylistFragment.A(((PlaylistFragment) (obj)));
    }

    teFlags(PlaylistFragment playlistfragment)
    {
        a = playlistfragment;
        super();
    }
}
