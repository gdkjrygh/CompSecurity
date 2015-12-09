// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.internal.provider.SpotifyProvider;

public final class dtl
{

    public static Uri a(String s)
    {
        return Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/folder/").append(Uri.encode(s)).toString());
    }

    public static Uri a(String s, com.spotify.mobile.android.provider.Metadata.PlaylistFilter playlistfilter, String s1)
    {
        switch (com.spotify.mobile.android.provider.Metadata._cls1.a[playlistfilter.ordinal()])
        {
        case 2: // '\002'
        default:
            Assertion.a((new StringBuilder("unknown playlist filter type: ")).append(playlistfilter).toString());
            return Uri.EMPTY;

        case 1: // '\001'
            return Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/folder/").append(s).append("/playlists?filter=").append(Uri.encode(s1)).toString());

        case 3: // '\003'
            return Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/folder/").append(s).append("/playlists/writable?filter=").append(Uri.encode(s1)).toString());
        }
    }

    public static Uri b(String s)
    {
        return a(s, com.spotify.mobile.android.provider.Metadata.PlaylistFilter.a, "");
    }
}
