// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.activity;

import an;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import cu;
import da;
import dtg;
import dto;
import duc;
import gcw;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.activity:
//            AnnotatePlaylistActivity

final class a
    implements an
{

    private AnnotatePlaylistActivity a;

    public final da a(Bundle bundle)
    {
        com.spotify.mobile.android.util.tePlaylistActivity teplaylistactivity = (new SpotifyLink(AnnotatePlaylistActivity.x(a))).c;
        bundle = Uri.EMPTY;
        String as[] = new String[1];
        if (teplaylistactivity == com.spotify.mobile.android.util.tePlaylistActivity._cls10.a)
        {
            bundle = com.spotify.mobile.android.provider.aylistActivity._cls10.a(AnnotatePlaylistActivity.x(a));
            as[0] = "album_image_large_uri";
        } else
        if (teplaylistactivity == com.spotify.mobile.android.util.tePlaylistActivity._cls10.a)
        {
            bundle = dtg.a(AnnotatePlaylistActivity.x(a));
            as[0] = "image_large_uri";
        } else
        {
            Assertion.a("Link type is neither Album nor Track.");
        }
        return new cu(a, bundle, as, null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        if (((Cursor) (obj)).moveToFirst() && duc.a(((Cursor) (obj))) && !a.isFinishing())
        {
            AnnotatePlaylistActivity.c(a, dto.a(gcw.a(((Cursor) (obj)), 0, "")).toString());
            if (AnnotatePlaylistActivity.d(a) == null)
            {
                AnnotatePlaylistActivity.c(a, Uri.parse(AnnotatePlaylistActivity.l(a)));
                return;
            }
        }
    }

    (AnnotatePlaylistActivity annotateplaylistactivity)
    {
        a = annotateplaylistactivity;
        super();
    }
}
