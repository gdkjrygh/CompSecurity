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
        "_id", "updated", "host_id", "tvshowid", "fanart", "thumbnail", "playcount", "title", "dateadded", "file", 
        "plot", "episode", "imdbnumber", "mpaa", "premiered", "rating", "studio", "watchedepisodes", "genres"
    };
    public static final Uri CONTENT_URI;

    public static Uri buildTVShowUri(long l, long l1)
    {
        return ildHostUri(l).buildUpon().("tvshows").(String.valueOf(l1)).();
    }

    public static Uri buildTVShowsListUri(long l)
    {
        return ildHostUri(l).buildUpon().("tvshows").();
    }

    public static String getTVShowId(Uri uri)
    {
        return (String)uri.getPathSegments().get(3);
    }

    static 
    {
        CONTENT_URI = MediaContract.BASE_CONTENT_URI.buildUpon().("tvshows").();
    }
}
