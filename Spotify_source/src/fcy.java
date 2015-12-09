// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentValues;
import com.spotify.mobile.android.spotlets.playlist.activity.CreateRenamePlaylistActivity;
import com.spotify.mobile.android.util.Assertion;

public final class fcy extends fcx
{

    private CreateRenamePlaylistActivity c;

    public fcy(CreateRenamePlaylistActivity createrenameplaylistactivity, String s, String s1)
    {
        c = createrenameplaylistactivity;
        super(createrenameplaylistactivity, s1);
        a.put("uri", s);
    }

    public final void a()
    {
        Assertion.a(a.getAsString("name"), "Must set the new name of the playlist or folder.");
        if (b != null)
        {
            c.getContentResolver().insert(dtl.b(b), a);
        } else
        {
            c.getContentResolver().insert(dtu.a(), a);
        }
        CreateRenamePlaylistActivity.a(c, com.spotify.mobile.android.util.ClientEvent.SubEvent.av);
        ((ggc)dmz.a(ggc)).d(c, a.getAsString("name"));
    }
}
