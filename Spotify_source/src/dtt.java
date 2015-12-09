// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.spotify.music.internal.provider.SpotifyProvider;

public final class dtt extends dtz
{

    public static Uri a(Uri uri, boolean flag)
    {
        return uri.buildUpon().appendQueryParameter("skip_duplicates", Boolean.toString(flag)).build();
    }

    public static Uri a(String s)
    {
        return Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/playlist/").append(Uri.encode(s)).toString());
    }

    public static Uri a(String s, String s1)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "";
        }
        return Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/playlist/").append(Uri.encode(s)).append("/tracks?filter=").append(Uri.encode(s2)).toString());
    }

    public static Uri b(String s)
    {
        return Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/playlist/").append(Uri.encode(s)).append("/tracks").toString());
    }
}
