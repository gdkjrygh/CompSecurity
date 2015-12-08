// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.provider;

import android.net.Uri;
import android.provider.BaseColumns;
import java.util.List;

// Referenced classes of package org.xbmc.kore.provider:
//            MediaContract

public static class 
    implements BaseColumns
{

    public static final String ALL_COLUMNS[] = {
        "_id", "updated", "host_id", "tvshowid", "season", "label", "fanart", "thumbnail", "episode", "showtitle", 
        "watchedepisodes"
    };
    public static final Uri CONTENT_URI;

    public static Uri buildTVShowSeasonUri(long l, long l1, long l2)
    {
        return buildTVShowUri(l, l1).buildUpon().("seasons").(String.valueOf(l2)).();
    }

    public static Uri buildTVShowSeasonsListUri(long l, long l1)
    {
        return buildTVShowUri(l, l1).buildUpon().("seasons").();
    }

    public static String getTVShowSeasonId(Uri uri)
    {
        return (String)uri.getPathSegments().get(5);
    }

    static 
    {
        CONTENT_URI = MediaContract.BASE_CONTENT_URI.buildUpon().("seasons").();
    }
}
