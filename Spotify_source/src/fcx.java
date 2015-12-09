// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentValues;
import com.spotify.mobile.android.spotlets.playlist.activity.CreateRenamePlaylistActivity;
import com.spotify.mobile.android.util.Assertion;

public class fcx
    implements fdb
{

    protected ContentValues a;
    protected String b;
    private CreateRenamePlaylistActivity c;

    public fcx(CreateRenamePlaylistActivity createrenameplaylistactivity)
    {
        this(createrenameplaylistactivity, null);
    }

    public fcx(CreateRenamePlaylistActivity createrenameplaylistactivity, String s)
    {
        c = createrenameplaylistactivity;
        super();
        a = new ContentValues();
        b = s;
    }

    public final fdb a(String s)
    {
        Assertion.a(s, "Don't set the playlist or folder name to null, underlying layers don't like it");
        boolean flag;
        if (s.length() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertion.a(flag, "Don't set the playlist or folder name to empty, underlying layers don't like it");
        a.put("name", s);
        return this;
    }

    public void a()
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
        ((ggc)dmz.a(ggc)).b(c);
    }
}
