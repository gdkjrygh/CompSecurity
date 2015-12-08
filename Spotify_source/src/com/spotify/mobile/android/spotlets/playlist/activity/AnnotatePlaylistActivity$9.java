// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.activity;

import an;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;
import cu;
import da;
import dto;
import dtt;
import duc;
import gcw;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.activity:
//            AnnotatePlaylistActivity

final class b
    implements an
{

    private final String a[] = {
        "image_large_uri", "name", "description", "image_is_annotated"
    };
    private AnnotatePlaylistActivity b;

    public final da a(Bundle bundle)
    {
        return new cu(b, dtt.a(AnnotatePlaylistActivity.p(b)), a, null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        Cursor cursor = (Cursor)obj;
        if (cursor.moveToFirst() && duc.a(cursor) && !b.isFinishing())
        {
            AnnotatePlaylistActivity.a(b, gcw.a(cursor, "name", ""));
            AnnotatePlaylistActivity annotateplaylistactivity = b;
            String s = gcw.a(cursor, "description", "");
            obj = s;
            if (s.contains("&"))
            {
                obj = s.replace("&lt;", "<").replace("&gt;", ">").replace("&quot;", "\"").replace("&#x27;", "\\").replace("&#x2F;", "/").replace("&amp;", "&");
            }
            AnnotatePlaylistActivity.b(annotateplaylistactivity, ((String) (obj)));
            AnnotatePlaylistActivity.c(b, dto.a(gcw.a(cursor, "image_large_uri", "")).toString());
            AnnotatePlaylistActivity.b(b, gcw.a(cursor, "image_is_annotated"));
            if (!AnnotatePlaylistActivity.q(b) && !AnnotatePlaylistActivity.r(b))
            {
                AnnotatePlaylistActivity.t(b).setText(AnnotatePlaylistActivity.s(b));
                AnnotatePlaylistActivity.v(b).setText(AnnotatePlaylistActivity.u(b));
                AnnotatePlaylistActivity.a(b, null);
                AnnotatePlaylistActivity.w(b);
            }
            if (AnnotatePlaylistActivity.d(b) == null)
            {
                AnnotatePlaylistActivity.c(b, Uri.parse(AnnotatePlaylistActivity.l(b)));
                return;
            }
        }
    }

    (AnnotatePlaylistActivity annotateplaylistactivity)
    {
        b = annotateplaylistactivity;
        super();
    }
}
