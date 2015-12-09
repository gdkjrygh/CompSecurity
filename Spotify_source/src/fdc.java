// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.spotlets.playlist.activity.CreateRenamePlaylistActivity;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;

public final class fdc extends fcx
{

    private final Uri c;
    private CreateRenamePlaylistActivity d;

    public fdc(CreateRenamePlaylistActivity createrenameplaylistactivity, String s)
    {
        d = createrenameplaylistactivity;
        super(createrenameplaylistactivity);
        createrenameplaylistactivity = new SpotifyLink(s);
        com.spotify.mobile.android.spotlets.playlist.activity.CreateRenamePlaylistActivity._cls6.a[((SpotifyLink) (createrenameplaylistactivity)).c.ordinal()];
        JVM INSTR tableswitch 1 3: default 56
    //                   1 93
    //                   2 104
    //                   3 104;
           goto _L1 _L2 _L3 _L3
_L1:
        c = null;
        Assertion.a((new StringBuilder("Trying to rename playlist or folder, but link is of different type: ")).append(((SpotifyLink) (createrenameplaylistactivity)).c).toString());
_L5:
        Assertion.a(c, "uri is neither a playlist nor a folder uri.");
        return;
_L2:
        c = dtl.a(s);
        continue; /* Loop/switch isn't completed */
_L3:
        c = dtt.a(s);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a()
    {
        Assertion.a(a.getAsString("name"), "Must set the new name of the playlist or folder");
        Assertion.a(c, "mContentUri must be set.");
        d.getContentResolver().update(c, a, null, null);
        CreateRenamePlaylistActivity.a(d, com.spotify.mobile.android.util.ClientEvent.SubEvent.aw);
        ((ggc)dmz.a(ggc)).a(d, SpotifyIcon.aA, 0x7f08055c);
    }
}
