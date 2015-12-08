// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.provider.BaseColumns;
import com.spotify.music.internal.provider.SpotifyProvider;

public final class dtj
    implements BaseColumns
{

    public static final Uri a;

    public static Uri a(String s)
    {
        return Uri.withAppendedPath(a, Uri.encode(s));
    }

    public static Uri b(String s)
    {
        return Uri.withAppendedPath(Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/devices/attach").toString()), Uri.encode(s));
    }

    public static Uri c(String s)
    {
        return Uri.withAppendedPath(Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/devices/update-newly-discovered").toString()), Uri.encode(s));
    }

    public static Uri d(String s)
    {
        return Uri.withAppendedPath(Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/devices/add-supported-content-type").toString()), Uri.encode(s));
    }

    public static Uri e(String s)
    {
        return Uri.withAppendedPath(Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/devices/remove-supported-content-type").toString()), Uri.encode(s));
    }

    static 
    {
        a = Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/devices").toString());
    }
}
