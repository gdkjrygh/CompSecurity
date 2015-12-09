// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.provider.BaseColumns;
import com.spotify.music.internal.provider.SpotifyProvider;

public final class dth
    implements BaseColumns
{

    public static Uri a(String s)
    {
        return Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/artist/").append(s).toString());
    }

    public static Uri b(String s)
    {
        return Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/artist/").append(s).append("/extended_top_tracks").toString());
    }

    public static Uri c(String s)
    {
        return Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/artist/").append(s).append("/albums").toString());
    }
}
