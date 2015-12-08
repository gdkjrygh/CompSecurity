// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.spotify.music.internal.provider.SpotifyProvider;

public final class dti
{

    public static final Uri a;

    public static Uri a()
    {
        return a("", false);
    }

    public static Uri a(String s)
    {
        return Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/collection/artist/").append(Uri.encode(s)).toString());
    }

    public static Uri a(String s, boolean flag)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(SpotifyProvider.b).append("/collection/tracks");
        String s1;
        if (flag)
        {
            s1 = "/offline";
        } else
        {
            s1 = "";
        }
        return Uri.parse(stringbuilder.append(s1).append("?filter=").append(Uri.encode(s)).toString());
    }

    public static Uri a(String s, boolean flag, boolean flag1)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(SpotifyProvider.b).append("/collection/albums");
        String s1;
        if (flag)
        {
            s1 = "/offline";
        } else
        {
            s1 = "";
        }
        return Uri.parse(stringbuilder.append(s1).append("?filter=").append(Uri.encode(s)).append("&hide_incomplete_albums=").append(flag1).toString());
    }

    public static Uri b(String s)
    {
        return Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/collection/artist/").append(Uri.encode(s)).append("/tracks").toString());
    }

    public static Uri b(String s, boolean flag)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(SpotifyProvider.b).append("/collection/artists");
        String s1;
        if (flag)
        {
            s1 = "/offline";
        } else
        {
            s1 = "";
        }
        return Uri.parse(stringbuilder.append(s1).append("?filter=").append(Uri.encode(s)).toString());
    }

    public static Uri c(String s)
    {
        return Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/collection/album/").append(Uri.encode(s)).toString());
    }

    public static Uri d(String s)
    {
        return Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/collection/album/").append(Uri.encode(s)).append("/tracks").toString());
    }

    static 
    {
        a = Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/collection").toString());
    }
}
