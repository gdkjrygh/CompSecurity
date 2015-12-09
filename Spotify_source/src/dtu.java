// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.internal.provider.SpotifyProvider;

public final class dtu
{

    public static Uri a()
    {
        return a(com.spotify.mobile.android.provider.Metadata.PlaylistFilter.a, "");
    }

    public static Uri a(com.spotify.mobile.android.provider.Metadata.PlaylistFilter playlistfilter, String s)
    {
        s = Uri.encode(s);
        switch (com.spotify.mobile.android.provider.Metadata._cls1.a[playlistfilter.ordinal()])
        {
        default:
            Assertion.a((new StringBuilder("unknown playlist filter type: ")).append(playlistfilter).toString());
            return Uri.EMPTY;

        case 1: // '\001'
            return Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/playlists?filter=").append(s).toString());

        case 2: // '\002'
            return Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/playlists/offline?filter=").append(s).toString());

        case 3: // '\003'
            return Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/playlists/writable?filter=").append(s).toString());

        case 4: // '\004'
            return Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/playlists/not_offline?filter=").append(s).toString());

        case 5: // '\005'
            return Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/playlists/recently_changed_and_writable?filter=").append(s).toString());
        }
    }
}
