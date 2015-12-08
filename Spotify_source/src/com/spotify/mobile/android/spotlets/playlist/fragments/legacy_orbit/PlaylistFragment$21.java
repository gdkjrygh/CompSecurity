// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit;

import an;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import cu;
import da;
import dff;
import dmz;
import dob;
import dto;
import dub;
import gbg;
import gft;
import gwb;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit:
//            PlaylistFragment

final class a
    implements an
{

    private PlaylistFragment a;

    public final da a(Bundle bundle)
    {
        return new cu(a.k(), dub.a(PlaylistFragment.a(a).w()), PlaylistFragment.b, null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        if (((Cursor) (obj)).moveToFirst())
        {
            String s = ((Cursor) (obj)).getString(0);
            if (!TextUtils.equals(PlaylistFragment.S(a), s))
            {
                PlaylistFragment.c(a, s);
                if (!PlaylistFragment.C(a))
                {
                    PlaylistFragment.H(a);
                    PlaylistFragment.T(a).c(s.toUpperCase(a.l().getConfiguration().locale));
                }
            }
            if (!PlaylistFragment.C(a))
            {
                Object obj1 = ((Cursor) (obj)).getString(1);
                obj = ((Cursor) (obj)).getString(2);
                if (!TextUtils.isEmpty(((CharSequence) (obj1))))
                {
                    obj = obj1;
                }
                obj1 = PlaylistFragment.T(a).b;
                if (!TextUtils.equals(PlaylistFragment.U(a), ((CharSequence) (obj))) || !TextUtils.isEmpty(((CharSequence) (obj))) && ((ImageView) (obj1)).getDrawable() == null)
                {
                    PlaylistFragment.d(a, ((String) (obj)));
                    ((gft)dmz.a(gft)).a().a(dto.a(((String) (obj)))).a(dff.f(a.k())).b(dff.f(a.k())).a(gft.a(((ImageView) (obj1))));
                }
            }
        }
    }

    (PlaylistFragment playlistfragment)
    {
        a = playlistfragment;
        super();
    }
}
