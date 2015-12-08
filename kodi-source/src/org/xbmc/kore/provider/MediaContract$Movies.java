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
        "_id", "updated", "host_id", "movieid", "fanart", "thumbnail", "playcount", "title", "file", "plot", 
        "director", "runtime", "audio_channels", "audio_coded", "audio_language", "subtitles_languages", "video_aspect", "video_codec", "video_height", "video_width", 
        "countries", "genres", "imdbnumber", "mpaa", "rating", "movie_set", "setid", "studios", "tagline", "top250", 
        "trailer", "votes", "writers", "year", "dateadded"
    };
    public static final Uri CONTENT_URI;

    public static Uri buildMovieUri(long l, long l1)
    {
        return uildHostUri(l).buildUpon().h("movies").h(String.valueOf(l1)).h();
    }

    public static Uri buildMoviesListUri(long l)
    {
        return uildHostUri(l).buildUpon().h("movies").h();
    }

    public static String getMovieId(Uri uri)
    {
        return (String)uri.getPathSegments().get(3);
    }

    static 
    {
        CONTENT_URI = MediaContract.BASE_CONTENT_URI.buildUpon().h("movies").h();
    }
}
