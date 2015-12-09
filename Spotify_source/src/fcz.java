// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import com.spotify.mobile.android.spotlets.playlist.activity.CreateRenamePlaylistActivity;
import com.spotify.mobile.android.util.SpotifyLink;

public final class fcz
    implements an
{

    private final String a;
    private final fda b;
    private CreateRenamePlaylistActivity c;

    public fcz(CreateRenamePlaylistActivity createrenameplaylistactivity, String s, fda fda1)
    {
        c = createrenameplaylistactivity;
        super();
        a = s;
        b = fda1;
    }

    public final da a(Bundle bundle)
    {
        if ((new SpotifyLink(a)).c == com.spotify.mobile.android.util.SpotifyLink.LinkType.T)
        {
            bundle = dtl.a(a);
        } else
        {
            bundle = dtt.a(a);
        }
        return new cu(c, bundle, CreateRenamePlaylistActivity.d(c), null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        if (!((Cursor) (obj)).moveToFirst() || !duc.a(((Cursor) (obj))))
        {
            return;
        } else
        {
            obj = ((Cursor) (obj)).getString(0);
            b.a(((String) (obj)));
            return;
        }
    }
}
